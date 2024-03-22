public class Mouse extends itProducts{
    private String name;

    public Mouse() {
    }
    public Mouse(String marca, Integer price, String name) {
        super(marca, price);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void upPrice(float porcentaje)
    {
        System.out.println("increment");
    }
    @Override

    public String toString(){
        return super.toString() + this.name;
    }
}
