package xyz.wadewhy.common;

import java.io.Serializable;

/**
 * @PACKAGE_NAME: xyz.wadewhy.common
 * @NAME: Common
 * @Author: 钟子豪
 * @DATE: 2019/12/29
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 29
 * @DAY_NAME_FULL: 星期日
 * @PROJECT_NAME: springboot-models
 **/
public class Common<T> implements Serializable {
    private static final long serialVersionUID = -4577255781088498763L;
    private static final int OK = 0;
    private static final int FAIL = 1;
    private static final int UNAUTHOCommonIZED = 2;

    private T data; //服务端数据
    private int status = OK; //状态码
    private String msg = ""; //描述信息

    //APIS
    public static Common isOk() {
        return new Common();
    }

    public static Common isFail() {
        return new Common().status(FAIL);
    }

    public static Common isFail(Throwable e) {
        return isFail().msg(e);
    }

    public Common msg(Throwable e) {
        this.setMsg(e.toString());
        return this;
    }

    public Common data(T data) {
        this.setData(data);
        return this;
    }

    public Common status(int status) {
        this.setStatus(status);
        return this;
    }


    //Constructors
    public Common() {

    }

    //Getter&Setters

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
