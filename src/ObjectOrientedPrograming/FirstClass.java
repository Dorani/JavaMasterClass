package ObjectOrientedPrograming;

public class FirstClass {
    public static void main(String[] args) {
        //create an instance from the Car class
        Car porch = new Car();

        //. notation to use built in functionality
        //porch.color => but since its private, we can not access it...

        porch.setModel("Ferrari");
        System.out.println(porch.getModel());

    }
    public static class Car {
        //characteristics aka "state", known as a field
        private int doors;
        private int wheels;
        private String model;
        private String engine;
        private String color;

        //create a public method instead
        //setter method
        public void setModel(String model) {
            //we can create some validation
            //rule to test lower case version
            String validModel = model.toLowerCase();
            if(validModel.equals("audi") || validModel.equals("bmw")) {
                this.model = model;
            } else {
                this.model = "unknown";
            }
        }
        //getter method:
        public String getModel() {
            return this.model;
        }

    }
}
