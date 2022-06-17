package com.wlk.simpleexchangerates;


import retrofit2.Call;
import retrofit2.http.GET;

public interface APICall {

    @GET("?get=rates&pairs=USDRUB,RUBUSD,EURRUB,RUBEUR,KZTRUB,RUBKZT,USDKZT,KZTUSD,EURUSD,USDEUR,KZTEUR,EURKZT,RUBKZT,KZTRUB&key=423ccabe7688caa88b8fc71edf90fb48")
    Call<ExchangeModel> getExchange();
}
