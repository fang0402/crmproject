package com.csdj.crmproject.crmproject.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringBootConfiguration;

/**
 * @BelongsProject: lun_boot
 * @BelongsPackage: com.csdj.lun.lun.util
 * @Author: admin
 * @CreateTime: 2019-11-04 08:28
 * @Description: 启动时自动调用路径，请自己设置路径111111
 */
@SpringBootConfiguration
public class AutoStartProjectInDefaultBrowser implements CommandLineRunner {
    @Value("${server.port}")
    private String port;

    @Override
    public void run(String... args) throws Exception {
        try {
            Runtime.getRuntime().exec("cmd /c start http://localhost:" + port + "/crmproject/");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
