package lamp;

public class TestLampadina {
	   public static void main(String[] args) {
	      Lampadina l1 = new Lampadina(3);
	      
	      
	      System.out.println(l1.stato()); //spenta
	      
	      l1.click();
	      System.out.println(l1.stato()); //accesa
	      
	      l1.click();
	      System.out.println(l1.stato()); //spenta
	      
	      l1.click();
	      System.out.println(l1.stato()); //accesa
	      
	      l1.click(); // "non succede niente"
	      System.out.println(l1.stato()); //rotta
	      
	      l1.click(); // "non succede niente"
	      System.out.println(l1.stato()); //rotta
	   }
	}
