package a00_testProject;

import java.util.List;
import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<IPInfo> ipInfoList = null;
		
		ipInfoList.add(new IPInfo ("123.123.123.123", "홍길동"));
		ipInfoList.add(new IPInfo ("212.133.7.8","박철수"));
		ipInfoList.add(new IPInfo ("177.233.111.222", "고길순"));
		
		System.out.println(" ip 입력 : ");
		String ip =sc.next();
		
		for (int i = 0; i<ipInfoList.size(); i++) {
			
			if(ipInfoListget(i).getlp().equals(ip)) {
				
				System.out.println(ipInfoList.get(i));
				return;
			}
			.3
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static Object ipInfoListget(int i) {
		// TODO Auto-generated method stub
		return null;
	}


}
