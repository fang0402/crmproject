package com.csdj.crmproject.crmproject.controller.Instrument.MySalesInstrument;

import com.csdj.crmproject.crmproject.entity.CusSalesTarget;
import com.csdj.crmproject.crmproject.entity.User;
import com.csdj.crmproject.crmproject.service.Instrument.MySalesInstrument.MySalesInstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @ClassName MySalesInstrumentController
 * @Description: MySalesInstrumentController
 * @Author 邹捷
 * @Date 2020/2/6
 * @Version V1.0
 **/
@Controller
@RequestMapping("MySalesInstrument")
public class MySalesInstrumentController {
    @Autowired
    private MySalesInstrumentService mySalesInstrumentService;

    @RequestMapping("selShow")
    public String selShow() {
        return "/Instrument/MySalesInstrument/MySalesInstrumentHtml";
    }

    @RequestMapping("selOrder")
    @ResponseBody
    public double selDianaOrder(String id, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        String userId = Long.toString(user.getPkUserId());
        Calendar date = Calendar.getInstance();
        String year = String.valueOf(date.get(Calendar.YEAR));
        String month = String.valueOf(date.get(Calendar.MONTH) + 1);
        CusSalesTarget cusSalesTarget = mySalesInstrumentService.getOrder(userId, year);
        //本月销售业绩
        if ("1".equals(id)) {
            Map<Object, String> map1 = mySalesInstrumentService.dianasOrder(userId);
            Object order = map1.get("order_Amount_remitted");
            if(order.toString()==null){
                return 0;
            }
            double predict = 0;
            switch (month) {
                case "1":
                    predict = cusSalesTarget.getCusSalesTarJanuary();
                    break;
                case "2":
                    predict = cusSalesTarget.getCusSalesTarFebruary();
                    break;
                case "3":
                    predict = cusSalesTarget.getCusSalesTarMarch();
                    break;
                case "4":
                    predict = cusSalesTarget.getCusSalesTarApril();
                    break;
                case "5":
                    predict = cusSalesTarget.getCusSalesTarMay();
                    break;
                case "6":
                    predict = cusSalesTarget.getCusSalesTarJun();
                    break;
                case "7":
                    predict = cusSalesTarget.getCusSalesTarJuly();
                    break;
                case "8":
                    predict = cusSalesTarget.getCusSalesTarAugust();
                    break;
                case "9":
                    predict = cusSalesTarget.getCusSalesTarSeptember();
                    break;
                case "10":
                    predict = cusSalesTarget.getCusSalesTarOctober();
                    break;
                case "11":
                    predict = cusSalesTarget.getCusSalesTarNovember();
                    break;
                case "12":
                    predict = cusSalesTarget.getCusSalesTarDecember();
                    break;
            }
            double i = Double.parseDouble(order.toString()) / predict * 100;
            return i > 100 ? 100 : fun(i);
            //本季销售业绩
        } else if ("2".equals(id)) {
            int month1 = date.get(Calendar.MONTH) + 1;
            Map<Object, String> map1 = mySalesInstrumentService.seasonOrder(userId);
            Object order = map1.get("order_Amount_remitted");
            if(order.toString()==null){
                return 0;
            }
            double predict = 0;
            if (month1 <= 3) {
                predict = cusSalesTarget.getCusSalesTarJanuary() + cusSalesTarget.getCusSalesTarFebruary() + cusSalesTarget.getCusSalesTarMarch();
            }
            if (month1 >= 4 && month1 <= 6) {
                predict = cusSalesTarget.getCusSalesTarApril() + cusSalesTarget.getCusSalesTarMay() + cusSalesTarget.getCusSalesTarJun();
            }
            if (month1 >= 7 && month1 <= 9) {
                predict = cusSalesTarget.getCusSalesTarJuly() + cusSalesTarget.getCusSalesTarAugust() + cusSalesTarget.getCusSalesTarSeptember();
            }
            if (month1 >= 10 && month1 <= 12) {
                predict = cusSalesTarget.getCusSalesTarOctober() + cusSalesTarget.getCusSalesTarNovember() + cusSalesTarget.getCusSalesTarDecember();
            }
            double i = Double.parseDouble(order.toString()) / predict * 100;
            return i > 100 ? 100 :fun(i);
            //本年销售业绩
        } else {
            Map<Object, String> map1 = mySalesInstrumentService.yearOrder(userId);
            Object order = map1.get("order_Amount_remitted");
            double predict = 0;
            if(order.toString()==null){
                return 0;
            }
            predict = cusSalesTarget.getCusSalesTarJanuary() + cusSalesTarget.getCusSalesTarFebruary() + cusSalesTarget.getCusSalesTarMarch() +
                    cusSalesTarget.getCusSalesTarApril() + cusSalesTarget.getCusSalesTarMay() + cusSalesTarget.getCusSalesTarJun() +
                    cusSalesTarget.getCusSalesTarJuly() + cusSalesTarget.getCusSalesTarAugust() + cusSalesTarget.getCusSalesTarSeptember() +
                    cusSalesTarget.getCusSalesTarOctober() + cusSalesTarget.getCusSalesTarNovember() + cusSalesTarget.getCusSalesTarDecember();
            double i = Double.parseDouble(order.toString()) / predict * 100;
            return i > 100 ? 100 : fun(i);
        }
    }
    @RequestMapping("getOrder")
    @ResponseBody
    public List<Object> getOrder(String id,HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        String userId = Long.toString(user.getPkUserId());
        List<Object> list= new ArrayList<Object>();
        Map<Object,String> map1=mySalesInstrumentService.order(userId);
        Calendar date = Calendar.getInstance();
        String year = String.valueOf(date.get(Calendar.YEAR));
        CusSalesTarget cusSalesTarget = mySalesInstrumentService.getOrder(userId, year);
        if("1".equals(id)){
            list.add(map1);
            list.add(cusSalesTarget);
        }else if("2".equals(id)){

        }else{

        }
        return list;
    }


    /**
     *使用精确小数BigDecimal
     */
    public double fun(double f) {
        BigDecimal bg = new BigDecimal(f);
        /**
         * 参数：
         newScale - 要返回的 BigDecimal 值的标度。
         roundingMode - 要应用的舍入模式。
         返回：
         一个 BigDecimal，其标度为指定值，其非标度值可以通过此 BigDecimal 的非标度值乘以或除以十的适当次幂来确定。
         */
        return bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

}
