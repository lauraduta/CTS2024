public class Main {
//SINGLE RESPONSIBILITY PRINCIPLE

// OLD CODE
//public class Vehicle {
//    public void printDetails() {}
//    public double calculateValue() {}
//    public void addVehicleToDB() {}
//}

    //NEW CODE
    public class Vehicle1 {
        public void printDetails() {}

    }

    class VehicleValue {
        public double calculateValue() {
            return 0;
        }
    }

    class VehicleDB {
        public void addVehicleToDB() {}
    }

//OPEN-CLOSED PRINCIPLE

// OLD CODE
//public class VehicleCalculations {
//    public double calculateValue(Vehicle v) {
//        if (v instanceof Car) {
//            return v.getValue() * 0.8;
//        if (v instanceof Bike) {
//            return v.getValue() * 0.5;
//
//    }
//}

//NEW CODE
 interface Vehicle {
    double getValue();
}

class Car implements Vehicle {
    public double getValue() {
        return 0;
    }

    public double calculateValue() {
        return getValue() * 0.8;
    }

}

class Bike implements Vehicle {
    public double getValue() {
        return 0;
    }

    public double calculateValue() {
        return getValue() * 0.5;
    }
}

//LISKOV SUBSTITUTION PRINCIPLE

    interface Height {
        void height();
    }

    interface Widht {
        void widht();
    }

    class Rectangle implements Height {
        public void height() {}
    }

    class Square implements Height, Widht {
        public void height() {}
        public void widht() {}
    }

}