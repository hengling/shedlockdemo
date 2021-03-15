package com.example.schedlockdemo.job;

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class NotificarMudancaMinutoJob {

    @Scheduled(cron = "0 * * * * *")
    @SchedulerLock(name = "NotificarMudancaMinutoJob.run", lockAtLeastFor = "30s")
    public void run() {
        final SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        System.out.println("[JOB] Olá, se passou mais um minuto. Hora atual " + formatter.format(new Date()));
    }
}
