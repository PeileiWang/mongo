package com.mongo.mongo.utils;

import com.mongo.mongo.domain.Result;
import com.mongo.mongo.enums.ResultEnum;

/**
 * Created by Wangpl
 * Time 2018/8/13 10:42
 */
public class ResultUtils {

    public static Result success(ResultEnum resultEnum, Object object) {
        Result result = new Result();
        result.setCode(resultEnum.getCode());
        result.setMsg(resultEnum.getMsg());
        result.setData(object);
        return result;
    }

    public static Result success(ResultEnum resultEnum) {
        return success(resultEnum, null);
    }

    public static Result error(ResultEnum resultEnum) {
        Result result = new Result();
        result.setCode(resultEnum.getCode());
        result.setMsg(resultEnum.getMsg());
        return result;
    }
}
