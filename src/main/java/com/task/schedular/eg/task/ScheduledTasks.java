package com.task.schedular.eg.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTimeFixedRate(){
        log.info("The time is now {} from fixed rate", dateFormat.format(new Date()));
    }

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTimeFixedDelay(){
        log.info("The time is now {} from fixed delay", dateFormat.format(new Date()));
    }


    @Scheduled(cron = "*/5 * * * * *")
    public void reportCurrentTimeCron(){
        log.info("The time is now {} from fixed cron", dateFormat.format(new Date()));
    }
}
