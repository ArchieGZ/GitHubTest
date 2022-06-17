package com.wlk.simpleexchangerates;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String BASE_URL = "https://currate.ru/api/";

    String selectedCurrency = "";

    TextView firstTxtCurrency, secondTxtCurrency, thirdTxtCurrency;

    Button updateBtn, changeCurrencyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstTxtCurrency = findViewById(R.id.first_currency);
        secondTxtCurrency = findViewById(R.id.second_currency);
        thirdTxtCurrency = findViewById(R.id.third_currency);

        updateBtn = findViewById(R.id.update_button);
        changeCurrencyBtn = findViewById(R.id.change_currency_btn);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            selectedCurrency = extras.getString("selectedCurrency");
        }
        getExchangeCurrency();

    }


    public void getExchangeCurrency() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APICall apiCall = retrofit.create(APICall.class);

        Call<ExchangeModel> myCall = apiCall.getExchange();

        myCall.enqueue(new Callback<ExchangeModel>() {
            @Override
            public void onResponse(Call<ExchangeModel> call, Response<ExchangeModel> response) {
                if (!response.isSuccessful()) {
                    Toast.makeText(MainActivity.this, "Error! Code: " + response.code(), Toast.LENGTH_SHORT).show();
                    return;
                }
                String firstCurrency = "";
                String secondCurrency = "";
                String thirdCurrency = "";
                switch (selectedCurrency) {
                    case "RUB":
                        firstCurrency = "USD - RUB: " + response.body().data.getUsdrub() + "₽";
                        secondCurrency = "EUR - RUB: " + response.body().data.getEurrub() + "₽";
                        thirdCurrency = "KZT - RUB: " + response.body().data.getKztrub() + "₽";
                        firstTxtCurrency.setText(firstCurrency);
                        secondTxtCurrency.setText(secondCurrency);
                        thirdTxtCurrency.setText(thirdCurrency);
                        break;

                    case "KZT":
                        firstCurrency = "USD - KZT: " + response.body().data.getUsdkzt() + "₸";
                        secondCurrency = "EUR - KZT: " + response.body().data.getEurkzt() + "₸";
                        thirdCurrency = "RUB - KZT: " + response.body().data.getRubkzt() + "₸";
                        firstTxtCurrency.setText(firstCurrency);
                        secondTxtCurrency.setText(secondCurrency);
                        thirdTxtCurrency.setText(thirdCurrency);
                        break;

                    case "USD":
                        firstCurrency = "KZT - USD: " + response.body().data.getKztusd() + "$";
                        secondCurrency = "EUR - USD: " + response.body().data.getEurusd() + "$";
                        thirdCurrency = "RUB - USD: " + response.body().data.getRubusd() + "$";
                        firstTxtCurrency.setText(firstCurrency);
                        secondTxtCurrency.setText(secondCurrency);
                        thirdTxtCurrency.setText(thirdCurrency);
                        break;

                    case "EUR":
                        firstCurrency = "KZT - EUR: " + response.body().data.getKzteur() + "€";
                        secondCurrency = "USD - EUR: " + response.body().data.getUsdeur() + "€";
                        thirdCurrency = "RUB - EUR: " + response.body().data.getRubeur() + "€";
                        firstTxtCurrency.setText(firstCurrency);
                        secondTxtCurrency.setText(secondCurrency);
                        thirdTxtCurrency.setText(thirdCurrency);
                        break;
                }

            }

            @Override
            public void onFailure(Call<ExchangeModel> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error! Code: " + t, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void updateOnClick(View view) {
        getExchangeCurrency();
        Toast.makeText(this, "Updated Successfully!", Toast.LENGTH_SHORT).show();

    }

    public void changeCurrencyOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, SelectCurrency.class);
        startActivity(intent);
    }
}