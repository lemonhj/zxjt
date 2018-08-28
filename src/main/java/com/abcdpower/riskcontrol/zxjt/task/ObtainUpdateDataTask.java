package com.abcdpower.riskcontrol.zxjt.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author lin.tb lin.maple.leaf@gmail.com
 * @ClassName: ObtainUpdateDataTask
 * @Description:
 * @date 2018/8/28
 */

@Slf4j
@Component
public class ObtainUpdateDataTask {

    @Scheduled(cron="${cronExpression}")
    public void checkDataRefresh() {

    }


}




