package com.andy.cloud.sys.organization.domain.event;


import com.andy.cloud.common.domain.event.IBaseEvent;
import com.andy.cloud.sys.organization.domain.entity.SysOrgElement;

/**
 * @author andy
 * @version V1.0
 * @description
 * @creater 2018/6/19 下午2:14
 * @modified
 */
public interface ISysOrgElementEvent<E extends SysOrgElement> extends IBaseEvent<E> {
    /**
     * 根据编号查询组织架构对象
     *
     * @param no
     * @return
     */
    E findByNo(String no);
}
