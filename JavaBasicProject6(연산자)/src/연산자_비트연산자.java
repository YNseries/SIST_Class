/*
 *    비트연산자 ( & , | , ^ )
 *    =====================
 *    	     &(*)  |(+)  ^(비트가 다르면 1, 같으면 0)
 *    =====================
 *     1 1    1     1    0
 *    =====================
 *     1 0    0     1    1
 *    =====================
 *     0 1    0     1    1
 *    =====================
 *     0 0    0     0    0
 *    =====================
 *           직렬   병렬        연산자
 *    
 *    10 & 8
 *    1010
 *    1000
 *    ==== &
 *    1000 ==> 8
 *    
 *    17 & 9
 *    10001
 *    01001
 *    ===== &
 *    00001 ==> 1
 *    
 *    10 | 8
 *    1010
 *    1000
 *    ==== |
 *    1010 ==> 10
 *    
 *    17 | 9
 *    10001
 *    01001
 *    ===== |
 *    11001 ==> 25
 *    
 *    10 ^ 8
 *    1010
 *    1000
 *    ==== ^
 *    0010 ==> 2
 *    
 *    17 ^ 9
 *    10001
 *    01001
 *    ===== ^
 *    11000 ==> 24    
 */
public class 연산자_비트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
