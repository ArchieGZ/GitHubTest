package com.wlk.simpleexchangerates;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectCurrency extends AppCompatActivity {

    Button rubBtn, kztBtn, usdBtn, eurBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_currency);

        rubBtn = findViewById(R.id.rub_btn);
        kztBtn = findViewById(R.id.usd_btn);
        usdBtn = findViewById(R.id.eur_btn);
    }

    public void rubOnClick(View view) {
        Intent intent = new Intent(SelectCurrency.this, MainActivity.class);
        intent.putExtra("selectedCurrency", "RUB");
        startActivity(intent);
    }

    public void kztOnClick(View view) {
        Intent intent = new Intent(SelectCurrency.this, MainActivity.class);
        intent.putExtra("selectedCurrency", "KZT");
        startActivity(intent);
    }

    public void usdOnClick(View view) {
        Intent intent = new Intent(SelectCurrency.this, MainActivity.class);
        intent.putExtra("selectedCurrency", "USD");
        startActivity(intent);
    }

    public void eurOnClick(View view) {
        Intent intent = new Intent(SelectCurrency.this, MainActivity.class);
        intent.putExtra("selectedCurrency", "EUR");
        startActivity(intent);
    }
}