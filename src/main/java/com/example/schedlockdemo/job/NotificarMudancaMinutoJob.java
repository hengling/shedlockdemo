package com.example.schedlockdemo.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class NotificarMudancaMinutoJob {

    @Scheduled(cron = "0 * * * * *")
    public void run() {
        System.out.println("[JOB] Olá, se passou mais um minuto");
    }
}
