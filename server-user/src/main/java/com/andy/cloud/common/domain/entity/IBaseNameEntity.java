package com.andy.cloud.common.domain.entity;

/**
 * @author andy
 * @version V1.0
 * @description 有实体名称的对象继承
 * @creater 2018/11/6 下午2:36
 * @modified
 */
public interface IBaseNameEntity extends IBaseEntity {
    /**
     * 实体名称
     * @return
     */
    String getFdName();
}
