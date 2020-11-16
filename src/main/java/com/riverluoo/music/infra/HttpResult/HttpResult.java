package com.riverluoo.music.infra.HttpResult;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * @author: wangyang
 * @since: 2020-11-13 13:33
 */
@AllArgsConstructor
public class HttpResult<T> implements Serializable {
    public int code;

    public String message;

    public T data;

    public static <T> HttpResult<T> success(T data, String message) {
        return new HttpResult<>(HttpStatus.OK.value(), message, data);
    }

    public static <T> HttpResult<T> fail(HttpStatus httpStatus, String message) {
        return new HttpResult<>(httpStatus.value(), message, null);
    }

    public static <T> HttpResult<T> success() {
        return new HttpResult<>(HttpStatus.OK.value(), "success", null);
    }

    public static <T> HttpResult<T> success(T data) {
        return new HttpResult<>(HttpStatus.OK.value(), "success", data);
    }

}
