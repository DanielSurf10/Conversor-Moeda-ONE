package cotacao;

import com.google.gson.annotations.SerializedName;

public class EuroToBRL {
    @SerializedName("EURBRL")
    private Cotacao cotacao;

    public Cotacao getCotacao() {
        return this.cotacao;
    }
}
