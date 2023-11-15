package com.lyc.easyweb.common;

/**
 * @Description: 错误返回接口, 自定义错误枚举实现该接口即可
 */
public interface Error {

    /**
     * 错误代码
     *
     * @return int
     */
    int getCode();

    /**
     * 错误描述
     *
     * @return {@link String}
     */
    String getMessage();

}
