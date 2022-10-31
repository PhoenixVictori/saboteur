public class Main{
	public static void main(String args[]){
		System.out.println("Success!");
		Saboteur jake = new Saboteur();
		System.out.println(jake.getIsCaught());
		jake.setIsCaught(false);
		System.out.println(jake.getIsCaught());
	}
}