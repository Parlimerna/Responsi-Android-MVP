package com.example.responsi.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class People {

    @SerializedName("results")
    private List<Response> results;

    @SerializedName("info")
    private Info info;

    public List<Response> getResults() {
        return results;
    }

    public void setResults(List<Response> results) {
        this.results = results;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}
