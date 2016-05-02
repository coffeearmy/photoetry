package com.coffeearmy.data.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class SunriseSunsetDto {

    @SerializedName("results")
    @Expose
    private SunResultDto results;
    @SerializedName("status")
    @Expose
    private String status;

    /**
     *
     * @return
     * The results
     */
    public SunResultDto getResults() {
        return results;
    }

    /**
     *
     * @param results
     * The results
     */
    public void setResults(SunResultDto results) {
        this.results = results;
    }

    /**
     *
     * @return
     * The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

}




