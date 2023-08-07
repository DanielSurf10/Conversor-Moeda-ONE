package cotacao;

public class Cotacao {
    private String name;
    private String ask;

    // Getters
    public String getNome() {
        return this.name;
    }

    public String getAsk() {
        return this.ask;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Ask: " + this.ask;
    }
}
