package IPGroup;

import java.util.Scanner;

public class IPGroup {

	public static void main(String[] args) {
		
		Scanner girdi= new Scanner(System.in);
		
		System.out.println("Lüften IP'nizi giriniz : " );
		
		
		String ip = girdi.nextLine();
		boolean flag =ip.startsWith("11.122.10.");
		
		if(flag==true){
			
			String ipEnd=ip.substring(10);
			
			if(ipEnd.length()>2) {
				System.out.println("IP uzunluğu hatalıdır.");
				System.exit(0);
			};
			
			
			int number = Integer.parseInt(ipEnd);
			
			if(19<number && number<50) {
				System.out.println("Developer IP : "+ip);
			}else {
				System.out.println("IP Uygun Aralıkta Değil..");
			}
			
		}else {
			System.out.println("Geçersiz IP..");
		}
		
		

	}

}
