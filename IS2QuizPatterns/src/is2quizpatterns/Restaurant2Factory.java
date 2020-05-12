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
class Restaurant2Factory extends RestaurantAbstractFactory{
    
    @Override
    public FastFood getFastFood(String type){
        switch( type ){
            case "pizza": return new Pizza();
            default: return null;
        }
    }
    
    @Override
    public Drink getDrink(String type){
        switch( type ){
            case "juice": return new Juice();
            case "beer": return new Beer();
            default: return null;
        }
    }
}
