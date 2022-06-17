package com.wlk.simpleexchangerates;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExchangeModel {

    public Data data;
    @SerializedName("status")
    private Integer status;

    @SerializedName("message")
    private String message;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public class Data {
        @SerializedName("USDRUB")
        private String usdrub;

        @SerializedName("RUBUSD")
        private String rubusd;

        @SerializedName("EURRUB")
        private String eurrub;

        @SerializedName("RUBEUR")
        private String rubeur;

        @SerializedName("KZTRUB")
        private String kztrub;

        @SerializedName("RUBKZT")
        private String rubkzt;

        @SerializedName("USDKZT")
        private String usdkzt;

        @SerializedName("KZTUSD")
        private String kztusd;

        @SerializedName("EURUSD")
        private String eurusd;

        @SerializedName("USDEUR")
        private String usdeur;

        @SerializedName("KZTEUR")
        private String kzteur;

        @SerializedName("EURKZT")
        private String eurkzt;

        public String getUsdrub() {
            return usdrub;
        }

        public void setUsdrub(String usdrub) {
            this.usdrub = usdrub;
        }

        public String getRubusd() {
            return rubusd;
        }

        public void setRubusd(String rubusd) {
            this.rubusd = rubusd;
        }

        public String getEurrub() {
            return eurrub;
        }

        public void setEurrub(String eurrub) {
            this.eurrub = eurrub;
        }

        public String getRubeur() {
            return rubeur;
        }

        public void setRubeur(String rubeur) {
            this.rubeur = rubeur;
        }

        public String getKztrub() {
            return kztrub;
        }

        public void setKztrub(String kztrub) {
            this.kztrub = kztrub;
        }

        public String getRubkzt() {
            return rubkzt;
        }

        public void setRubkzt(String rubkzt) {
            this.rubkzt = rubkzt;
        }

        public String getUsdkzt() {
            return usdkzt;
        }

        public void setUsdkzt(String usdkzt) {
            this.usdkzt = usdkzt;
        }

        public String getKztusd() {
            return kztusd;
        }

        public void setKztusd(String kztusd) {
            this.kztusd = kztusd;
        }

        public String getEurusd() {
            return eurusd;
        }

        public void setEurusd(String eurusd) {
            this.eurusd = eurusd;
        }

        public String getUsdeur() {
            return usdeur;
        }

        public void setUsdeur(String usdeur) {
            this.usdeur = usdeur;
        }

        public String getKzteur() {
            return kzteur;
        }

        public void setKzteur(String kzteur) {
            this.kzteur = kzteur;
        }

        public String getEurkzt() {
            return eurkzt;
        }

        public void setEurkzt(String eurkzt) {
            this.eurkzt = eurkzt;
        }
    }
}

