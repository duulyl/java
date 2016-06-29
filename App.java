public class App{
	public static void main(String[] args){
		Box box1 = new Box();
		Box box2 = new Box();
		box1.explode();
		box2.explode();
		IExplodable box3 = new Box();
		box3.explode();
	}
}
