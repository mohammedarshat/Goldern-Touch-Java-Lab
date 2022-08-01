package Day1;

public class PizzaTemplateMethod {
	
	public static void main(String[] args) {
		Dominos dominos = new ArshatPizzaShop();
		dominos.sellPizza();
	}
}

abstract class Dominos{
	private void pizzaMaida() {
		
		System.out.println("Maida made as per Dominos Standard.....");
	}
	private void addIngredients() {
		System.out.println("Ingredients add as per Dominos Standard......");
	}
	private void bakePizza() {
		System.out.println("Bake Pizza as per Dominos Standard....");
	}

	final private void makePizza() {
		pizzaMaida();
		addIngredients();
		bakePizza();
	}
	
	abstract public void orderPizza();
	abstract public void money();
	abstract public void deliverdPizza();
	final public void sellPizza() {
		orderPizza();
		makePizza();
		money();
		deliverdPizza();
	}
	
}

class ArshatPizzaShop extends Dominos{
	@Override
	public void money() {
		System.out.println("Collected Money 100 Ruppess for Pizza.....");
	}
	@Override
	public void deliverdPizza() {
		System.out.println("Pizza Deliverd Successfully......");
	}
		@Override
		public void orderPizza() {
			System.out.println("Ordered pizza Successfully......");
			
		
	}
	
}