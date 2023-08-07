package cotacao;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Moedas {

    @SerializedName("EURBRL")
    private EuroToBRL euroToBRL;
    @SerializedName("USDBRL")
    private DolarToBRL dolarToBRL;
    public Moedas() {

        try {
            URL url = new URL("https://economia.awesomeapi.com.br/last/USD-BRL,EUR-BRL");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            int responseCode = conn.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                String res = String.valueOf(response);
                Gson gson = new Gson();
                this.dolarToBRL = gson.fromJson(res, DolarToBRL.class);
                this.euroToBRL = gson.fromJson(res, EuroToBRL.class);
            }

            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public EuroToBRL getEuroToBRL() {
        return this.euroToBRL;
    }

    public DolarToBRL getDolarToBRL() {
        return this.dolarToBRL;
    }
}
