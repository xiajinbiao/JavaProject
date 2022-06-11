public class Customer {

    private FoodMenu foodMenu;

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    public Customer(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    public Customer() {
    }

}
