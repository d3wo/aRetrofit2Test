package com.example.aretrofit2test.models;

/**
 * Created by Dewo on 11/28/2016.
 */


import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Info {

    @SerializedName("seed")
    @Expose
    public String seed;
    @SerializedName("results")
    @Expose
    public int results;
    @SerializedName("page")
    @Expose
    public int page;
    @SerializedName("version")
    @Expose
    public String version;

}