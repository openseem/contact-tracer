package com.ct.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class UpdateService {
    static final Logger LOG = LoggerFactory.getLogger(UpdateService.class);

    @Scheduled(fixedDelay = 1000)
    public void Test() {
        LOG.info("c");
    }
}
