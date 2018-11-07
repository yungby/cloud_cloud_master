package com.andy.cloud.sys.organization.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author andy
 * @version V1.0
 * @description
 * @creater 2018/11/6 下午4:04
 * @modified
 */
@Entity
@Table
public class SysOrgDept extends SysOrgElement {
    @Override
    public int getFdType() {
        return 4;
    }
}
