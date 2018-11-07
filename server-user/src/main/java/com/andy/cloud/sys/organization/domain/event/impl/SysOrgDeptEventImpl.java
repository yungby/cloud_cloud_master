package com.andy.cloud.sys.organization.domain.event.impl;

import com.andy.cloud.common.domain.annotation.Event;
import com.andy.cloud.sys.organization.domain.dao.SysOrgDeptRepository;
import com.andy.cloud.sys.organization.domain.entity.SysOrgDept;
import com.andy.cloud.sys.organization.domain.event.ISysOrgDeptEvent;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author andy
 * @version V1.0
 * @description
 * @creater 2018/6/19 下午2:50
 * @modified
 */
@Event
public class SysOrgDeptEventImpl extends SysOrgElementEventImpl<SysOrgDeptRepository, SysOrgDept>
        implements ISysOrgDeptEvent {

    @Autowired
    @Override
    public void setBaseRepository(SysOrgDeptRepository baseRepository) {
        this.baseRepository = baseRepository;
    }
}
