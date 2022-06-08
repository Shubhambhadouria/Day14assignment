//	Q3.Explain Finally and Final Keyword with an Example?
//
//	Answer.
//	
//	Finally:-
//	It is used to create a block of code that follows a try block. A finally
//	block of code always executes, whether exception has occurred or not.
//	It is used as a general type statement that needs to be executed no
// 	matter what execution does.
//	It doesn't execute in one case only when we explicitly use System.exit(0)
//	function in the program.
//	E.g. 
//	public class Demo {
//	   public static void main(String[] args) {
//	
//	      try{
//	         int a = 10;
//	         int b = 0;
//	         int result = a/b;
//	      }catch(Exception e){
//	         System.out.println("Error: "+ e.getMessage());
//	      }
//	      finally{
//	         System.out.println("Finished.");
//	      }
//	   }
//	}
//
//	Final:-
//	It is used with class method and variable. It ensures that the particular
//	method or variable can not be inherited by any other class. A final class
// 	cannot be overridden and can't be reassigned.
//	E.g.
//	public class Demo {
//	   final int value = 10;
//	   public void changeValue() {
//	      value = 12; // will give an error
//	   }
//	   public static void main(String[] args) {
//	      Demo t = new Demo();
//	      t.changeValue();
//	   }
//	}