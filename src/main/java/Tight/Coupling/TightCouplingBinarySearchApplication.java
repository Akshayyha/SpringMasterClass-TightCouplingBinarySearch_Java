package Tight.Coupling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TightCouplingBinarySearchApplication {

	public static void main(String[] args) {
		
		BinarySearchImpl binarySearchImpl = new BinarySearchImpl();
		int result = binarySearchImpl.binarySearch(new int[] {1,12,8,5}, 5);
		System.out.println(result);
		
//		SpringApplication.run(TightCouplingBinarySearchApplication.class, args);
	}

}
