package com.example.aretrofit2test.models;

/**
 * Created by Dewo on 11/28/2016.
 */


import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Id {

    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("value")
    @Expose
    public Object value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}