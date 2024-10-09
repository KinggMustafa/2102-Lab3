public class Main {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        store.orderPizza("cheese");
        store.orderPizza("greek");
        store.orderPizza("pepperoni");
        store.orderPizza("glutenfree");
    }
}
