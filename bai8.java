package bai8;
import java.util.Scanner;
public class bai8 {
	public static void main(String[] args) {
	     int arr[], a, tbc = 0;
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Nhap so luong phan tu cua mang(n): ");
	        a = sc.nextInt();
	        
	        arr = new int[a];
	        
	        System.out.println("Nhap day so trong mang: ");
	        for(int i = 0; i < a; i++) {
	            System.out.printf("So thu %d: ", i + 1);
	            arr[i] = sc.nextInt();
	            tbc += arr[i];
	        }
	       
	        System.out.printf("Trung binh cong cua day la: %.2f\n", 1.0 * tbc / a);
	    }
	    
	}