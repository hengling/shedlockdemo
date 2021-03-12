package com.example.schedlockdemo.job;

import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class NotificarMudancaMinutoJob {

    @Scheduled(cron = "0 * * * * *")
    public void run() {
        log.info("[JOB] Olá, se passou mais um minuto");
    }
}
