public class runCompile{
	public static void main(String args[]){
		ProcessBuilder processBuilder = new ProcessBuilder();
		processBuilder.command("cmd", "/c", "dir C:\\Users\\jemsc\\Desktop\\Coding\\Java\\BBProjects\\SabotageGame\\src");
		Process process = processBuilder.start();
		System.out.println(process);


	}
}