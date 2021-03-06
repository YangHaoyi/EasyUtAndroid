package com.yanghaoyi.easyutandroid.presenter.chain.sunny;

import com.yanghaoyi.easyutandroid.view.IWeatherView;
import com.yanghaoyi.easyutandroid.view.data.WeatherViewData;

/**
 * Author : YangHaoyi on 2017/6/27.
 * Email  :  yanghaoyi@neusoft.com
 * Description :紫外线指数小于4轻度晒
 * Change : YangHaoYi on 2017/6/27.
 * Version : V 1.0
 */

public class LightBask extends AbstractBaskHandler{

    private static final int LIGHT = 4;

    @Override
    public void handleBask(WeatherViewData viewData, IWeatherView view) {
        if(viewData.getUltraviolet()>LIGHT){
            successor.handleBask(viewData,view);
        }else {
            view.showLightBaskNotice();
        }
    }
}
