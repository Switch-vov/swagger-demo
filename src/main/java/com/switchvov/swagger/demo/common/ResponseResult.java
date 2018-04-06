package com.switchvov.swagger.demo.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 通用响应对象
 *
 * @author Switch
 * @date 2018-04-04
 */
@ApiModel(description = "响应对象")
public class ResponseResult<T> {
    private static final int SUCCESS_CODE = 0;
    private static final String SUCCESS_MESSAGE = "成功";

    @ApiModelProperty(value = "响应码", name = "code", required = true, example = "" + SUCCESS_CODE)
    private int code;

    @ApiModelProperty(value = "响应消息", name = "msg", required = true, example = SUCCESS_MESSAGE)
    private String msg;

    @ApiModelProperty(value = "响应数据", name = "data")
    private T data;

    private ResponseResult() {
        this(SUCCESS_CODE, SUCCESS_MESSAGE);
    }

    private ResponseResult(int code, String msg) {
        this(code, msg, null);
    }

    private ResponseResult(T data) {
        this(SUCCESS_CODE, SUCCESS_MESSAGE, data);
    }

    private ResponseResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> ResponseResult<T> success() {
        return new ResponseResult<>();
    }

    public static <T> ResponseResult<T> successWithData(T data) {
        return new ResponseResult<>(data);
    }

    public static <T> ResponseResult<T> failWithCodeAndMsg(int code, String msg) {
        return new ResponseResult<>(code, msg, null);
    }

    public static <T> ResponseResult<T> buildWithParam(ResponseParam param) {
        return new ResponseResult<>(param.getCode(), param.getMsg(), null);
    }

    public static class ResponseParam {
        private int code;
        private String msg;

        private ResponseParam(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public static ResponseParam buildParam(int code, String msg) {
            return new ResponseParam(code, msg);
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }
}
