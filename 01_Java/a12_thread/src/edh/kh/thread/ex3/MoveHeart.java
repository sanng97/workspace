package edh.kh.thread.ex3;


//하트가 1칸 씩 움직이게 하는 효과
public class MoveHeart implements Runnable{
	@Override
	public void run() {
	
	 try {
		 
		 for( int i = 0 ; i<9; i++) { // 9번 움직임
			 
		// 30줄 띄우기
			 for ( int a= 0; a<30; a++) System.out.println();

				 
				// i미만까지 반복하며
				for(int h= 0; h < i; h++) System.out.print(" ");
				 System.out.print("♡");
				 
			
				for(int s= 0; s < i; s++) System.out.print(" ");
				System.out.print("★");
			 
			 
			 Thread.sleep(1000); // 1초 일시정지
			 
			 
			 
			 
		 }

	} catch (InterruptedException e) {
		Thread.currentThread().interrupt();
	
	}
		
	}


}
