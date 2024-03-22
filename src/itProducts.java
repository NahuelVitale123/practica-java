public class itProducts {
    private String marca;
    private Integer price;

    public itProducts() {
    }

    public itProducts(String marca, Integer price) {
        this.marca = marca;
        this.price = price;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getPrice() {
        return price;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public void upPrice(float porcentaje)
    {
        System.out.println("incrementssssss");
    }
    @Override
    public String toString(){
        return this.marca + " " + this.price;
    }
}
