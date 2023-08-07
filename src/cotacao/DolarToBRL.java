package cotacao;

import com.google.gson.annotations.SerializedName;

public class DolarToBRL {
    @SerializedName("USDBRL")
    private Cotacao cotacao;

    public Cotacao getCotacao() {
        return this.cotacao;
    }
}
