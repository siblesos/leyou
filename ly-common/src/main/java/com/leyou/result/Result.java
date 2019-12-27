package com.leyou.result;

/**
 * @ClassName Result
 * @Description: TODO
 * @Author 丁强
 * @Date 2019/12/26
 * @Version V1.0
 **/
public class Result {
    public static ResponseMessage success() {
        return new ResponseMessage(ResultCodeEnum.SUCCESS.getCode(), ResultCodeEnum.SUCCESS.getMessage(), true);
    }

    public static <T> ResponseMessage<T> success(T t) {
        return new ResponseMessage(ResultCodeEnum.SUCCESS.getCode(), ResultCodeEnum.SUCCESS.getMessage(), t);
    }

    public static <T> ResponseMessage<T> success(int code, String message) {
        return new ResponseMessage(code, message);
    }

    public static <T> ResponseMessage<T> success(int code, String message, T t) {
        return new ResponseMessage(code, message, t);
    }

    public static ResponseMessage error() {
        return error("");
    }

    public static ResponseMessage error(String message) {
        return error(ResultCodeEnum.ERROR.getCode(), message);
    }

    public static ResponseMessage error(int code, String message) {
        return error(code, message, false);
    }

    public static <T> ResponseMessage<T> error(int code, String message, T t) {
        return new ResponseMessage(code, message, false);
    }
}

