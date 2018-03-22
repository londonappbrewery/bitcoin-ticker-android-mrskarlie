package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Shireen on 2018/03/22.
 */

public class BitcoinModel {

    private String mPrice;


    // TODO: Create a WeatherDataModel from a JSON:
    public static BitcoinModel fromJson(JSONObject jsonObject){

        try {

            BitcoinModel bitcoin = new BitcoinModel();
            bitcoin.mPrice = jsonObject.getString("last");

            return bitcoin;

        } catch(JSONException e){
            e.printStackTrace();
            return null;
        }
    }

    public String getPrice() {
        return mPrice;
    }
}
