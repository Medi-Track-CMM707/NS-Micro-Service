package com.meditrack.notificationservice.interceptor;

import com.meditrack.notificationservice.model.entity.Base;
import com.meditrack.notificationservice.service.HeaderReadService;
import com.meditrack.notificationservice.util.ApplicationUtil;
import jakarta.persistence.PrePersist;

public class EntityInterceptor {

    @PrePersist
    public void beforePersist(Object entity) {
        // Manipulate the entity before saving
        if (entity instanceof Base baseEntity) {
            final HeaderReadService headerReadService = ApplicationUtil.getBean(HeaderReadService.class);
            baseEntity.setHospitalId(headerReadService.getHospitalId());
            baseEntity.setCreatedBy(headerReadService.getUser());
        }
    }
}
