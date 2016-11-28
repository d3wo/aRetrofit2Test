package com.example.aretrofit2test.models;

/**
 * Created by Dewo on 11/28/2016.
 */

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Name {

    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("first")
    @Expose
    public String first;
    @SerializedName("last")
    @Expose
    public String last;

}