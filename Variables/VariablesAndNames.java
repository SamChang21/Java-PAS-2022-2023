public class VariablesAndNames
{
    public static void main( String[] args )
    {
        //number of cars
        int cars = 100;
        //space in a car
        double space_in_a_car = 4.0;
        //number of drivers
        int drivers = 30;
        //number of passengers
        int passengers = 90;
        //number of cars thant can not be driven
        int cars_not_driven = cars - drivers;
        //there is a diver in the driving car
        int cars_driven = drivers;
        //equation for carpool_capacity
        double carpool_capacity = cars_driven * space_in_a_car;
        //equation for average_passengers_per_car
        double average_passengers_per_car = passengers / cars_driven;

        //statement of how many cars available
        System.out.println( "There are " + cars + " cars available." );
        //statement of how many drivers available
        System.out.println( "There are only " + drivers + " drivers available." );
        //statement of how many empty cars today
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        //statement of how many people today
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        //statement of how many passengers to carpool today
        System.out.println( "We have " + passengers + " to carpool today." );
        //statement of how many passengers per car
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
} 