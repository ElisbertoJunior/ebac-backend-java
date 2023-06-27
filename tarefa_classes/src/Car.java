public class Car {
        private String model;
        private String color;
        private String brand;
        private Boolean itsOn;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getItsOn() {
        return itsOn;
    }

    public void setItsOn(Boolean itsOn) {
        this.itsOn = itsOn;
    }

    public void setCar(String model, String color, String brand, Boolean itsOn) {
        setModel(model);
        setColor(color);
        setBrand(brand);
        setItsOn(itsOn);
    }

    public void printCar() {
        System.out.println("Modelo: " + this.model);
        System.out.println("Cor: " + this.color);
        System.out.println("Fabricante: " + this.brand);
        System.out.println("Esta ligado? " + this.itsOn);
    }

    public void driveCar() throws InterruptedException {
        if(this.itsOn) {
            System.out.println("Carro em funcionamento!");
            Thread.sleep(2000);
            System.out.println("Acelerando...");
            Thread.sleep(2000);
            System.out.println("Velocidade: 20km/h");
            Thread.sleep(2000);
            System.out.println("Velocidade: 40km/h");
            Thread.sleep(2000);
            System.out.println("Velocidade: 60km/h");
            Thread.sleep(2000);
            System.out.println("Velocidade: 80km/h");
            Thread.sleep(2000);
            System.out.println("Velocidade: 100km/h");
            Thread.sleep(2000);
            System.out.println("O " + this.model + " foi embora...");
        } else {
            System.out.println("O " + this.model + " esta estacionando!");
        }
    }

}
