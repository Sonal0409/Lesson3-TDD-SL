package tddDemo;

public class App {

	

	
	static boolean isValidUserName(String name){
        if(name.contains("/") || name.contains("#") || name.contains("_") || name.contains(" ") || name.contains("@")){
            return false;
        }
        return true;
    }

}
