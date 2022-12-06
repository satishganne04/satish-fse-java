package problem2;

public class ClassA {
	ClassA(){
        this(5);
         System.out.println("Default");
    }
    
    ClassA(int a){
        this(5,6);
         System.out.println("1 con");
    }
    
    ClassA(int a, int b){
        this(1,2,3);
         System.out.println("2 cons");
    }
    
    ClassA(int a, int b, int c){
        System.out.println("3 const");
    }



   public static void main(String[] args) {
      
        
        new ClassA();

   }
}
