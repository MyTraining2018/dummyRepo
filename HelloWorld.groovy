@RestController
public class HelloWorld{
	@RequestMapping("/")
	public String sayHello(){
		return "Hello World! Welcome To Spring Boot";
	}


}