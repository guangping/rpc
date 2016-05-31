package com.varela.rpc.pojo;

import java.io.Serializable;

/**
 * Created by lance on 2016-05-26.
 */
public class User implements Serializable {


    private Integer id;

    private String name;

    private Byte type;

    private Byte status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
