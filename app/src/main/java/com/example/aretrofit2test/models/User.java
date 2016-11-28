package com.example.aretrofit2test.models;

/**
 * Created by Dewo on 11/28/2016.
 */

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class User {

    @SerializedName("results")
    @Expose
    public List<Result> results = new ArrayList<Result>();
    @SerializedName("info")
    @Expose
    public Info info;

    @Override
    public String toString() {
        return "User{" +
                "results=" + results +
                ", info=" + info +
                '}';
    }
}