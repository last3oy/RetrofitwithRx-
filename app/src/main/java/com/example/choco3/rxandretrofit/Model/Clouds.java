package com.example.choco3.rxandretrofit.Model;



import com.google.gson.annotations.SerializedName;


public class Clouds {

    @SerializedName("all")
    private Integer all;

    /**
     * 
     * @return
     *     The all
     */
    public Integer getAll() {
        return all;
    }

    /**
     * 
     * @param all
     *     The all
     */
    public void setAll(Integer all) {
        this.all = all;
    }

}
