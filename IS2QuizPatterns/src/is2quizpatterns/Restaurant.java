/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is2quizpatterns;

/**
 *
 * @author Daniel
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RestaurantFactoryProducer restaurantFactoryProducer = new RestaurantFactoryProducer(); 
        RestaurantAbstractFactory restaurantAbstractFactory = new RestaurantFactoryProducer().getRestaurantAbstractFactory(2);        
        System.out.println(restaurantAbstractFactory.getDrink("beer"));        
        Drink bear = restaurantAbstractFactory.getDrink("beer");        
        System.out.println(bear);
    }
    
}
