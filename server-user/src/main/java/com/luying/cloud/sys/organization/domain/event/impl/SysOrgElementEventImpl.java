package com.andy.cloud.sys.organization.domain.event.impl;


import com.andy.cloud.common.domain.annotation.Event;
import com.andy.cloud.common.domain.event.impl.BaseEventImpl;
import com.andy.cloud.sys.organization.domain.dao.SysOrgElementRepository;
import com.andy.cloud.sys.organization.domain.entity.SysOrgElement;
import com.andy.cloud.sys.organization.domain.event.ISysOrgElementEvent;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/19 下午2:14
 * @modified
 */
@Event
public abstract class SysOrgElementEventImpl<T extends SysOrgElementRepository<E>, E extends SysOrgElement>
        extends BaseEventImpl<T, E> implements ISysOrgElementEvent<E> {

    @Override
    public E findByNo(String no) {
        return this.baseRepository.findByFdNo(no);
    }

    ;
}
