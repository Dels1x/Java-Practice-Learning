public class Car {


    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        if(!make.isBlank()) {
            this.make = make;
        }
        else{
            System.out.println("You wrote empty name of make");
        }
    }

    public void setModel(String model) {
        if(!model.isBlank()) {
            this.model = model;
        }
        else{
            System.out.println("You wrote empty name of model");
        }

    }

    public void setYear(int year) {
        if(year > 1870 && year < 2030) {
            this.year = year;
        }
        else{
            System.out.println("Bro, there is no car that got released that year lol. are you high mf?");
        }
    }

}
