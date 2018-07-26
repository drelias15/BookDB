public class SKU {
    private String skuno;

    public SKU() {
    }

    public SKU(String skuno) {
        this.skuno = skuno;
    }

    public String getSkuno() {
        return skuno;
    }

    public void setSkuno(String skuno) {
        this.skuno = skuno;
    }

    @Override
    public String toString() {
        return skuno;
    }
}

