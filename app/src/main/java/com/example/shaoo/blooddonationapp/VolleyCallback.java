package com.example.shaoo.blooddonationapp;

import org.json.JSONException;

/**
 * Created by ehsan on 03-10-2017.
 */

public interface VolleyCallback {
    void onSuccessResponse(String result) throws JSONException;
}