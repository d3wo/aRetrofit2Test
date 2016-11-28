package com.example.aretrofit2test.models;

/**
 * Created by Dewo on 11/28/2016.
 */

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Result {

    @SerializedName("gender")
    @Expose
    public String gender;
    @SerializedName("name")
    @Expose
    public Name name;
    @SerializedName("location")
    @Expose
    public Location location;
    @SerializedName("email")
    @Expose
    public String email;
    @SerializedName("login")
    @Expose
    public Login login;
    @SerializedName("dob")
    @Expose
    public String dob;
    @SerializedName("registered")
    @Expose
    public String registered;
    @SerializedName("phone")
    @Expose
    public String phone;
    @SerializedName("cell")
    @Expose
    public String cell;
    @SerializedName("id")
    @Expose
    public Id id;
    @SerializedName("picture")
    @Expose
    public Picture picture;
    @SerializedName("nat")
    @Expose
    public String nat;

}