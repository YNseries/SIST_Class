/*
 *   자바 연산자
 *   ========
 *   1. 단항연산자 (연산대상(피연산자) 1개)
 *   	= 증감연산자 (한 개 증가, 한 개 감소)
 *   	  ============================> 제어문(반복문)
 *   	  게임에서 키보드를 눌러 캐릭터 이동, 비행기 이동
 *   	  ++(+1 증가), --(-1 감소)
 *   	= 부정연산자 (!) => boolean
 *   	  true  => !true => false
 *   	  false => !false => true
 *   	  ============================
 *   	  게임 : 턴
 *   	  boolean bCheck=false;
 *   	  while(true)
 *   	  {
 *   		  bCheck=!bCheck;
 *   	  	  if(bCheck==true)
 *   			 본인
 *   		  else
 *   			  컴퓨터
 *   	  }
 *   	= (데이터형) 형변환 연산자)
 *   2. 이상연산자 (연산대상 2개)
 *   	= 산술연산자 (+, -, *, /, %) => 연산자 중에 가장 중요한 연산자
 *   	  5%2 ==> 1 (나누고 나머지 값)'
 *   
 *   	= 비트연산자 ( & , | , ^ ) => 논리회로
 *   	= 비트이동연산자 ( << , >> ) => 쉬프트연산자
 *   	= 비교연산자 ( ==(같다) , !=(같지않다) , < (작다) , >(크다) , <=(작거나 같다) , >=(크거나 같다)
 *   	  =======> boolean (true/false)
 *   	  int a=10;
 *   	  a<10  =>  false  (항상 왼쪽이 기준)
 *   	  a>10  false    a>=10  true   a<=10  true
 *   	= 논리연산자 (&& , ||)
 *   	  && => 범위 안에 포함한 경우
 *   		score>=80 && score<90  => B
 *   		score>=80 || score<90
 *   	  || => 범위 밖에 있는 경우
 *   	= 대입연산자 (=)
 *   	  => 복합대입연산자 (+=, -=, *=, /=, ..., op=)
 *   3. 삼항연산자 (연산대상 3개)
 *   	조건 ? 값1:값2 => 조건(true) => 값1, 조건(false) => 값2  ==> if ~ else
 *   	=> HTML, 게임 프로그램의 경우, 소스가 길기 떄문에 삼항연산자 씀
 *   
 *   
 */
/*
 *   1. 증감연산자 (++, --)
 *   	+1, -1을 하는 연산자
 *   	= 전치연산자
 *   	  int a=10;
 *   	  ++a; a+1
 *   	  a++; a+1
 *   	  ++a; a+1
 *   	  a++; a+1    => a=14
 *   
 *   	= 후치연산자
 *   	  int a=10;
 *   	  a++;
 */
public class 연산자_단항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* int a=10;
		// 저장된 데이터를 출력한다
		System.out.println("a="+a);
		// a값을 1개 증가
		++a; // 전치연산자  ===> a=11
		// 저장된 데이터를 다시 출력
		System.out.println("a="+a);
		a++; // 후치연산자  ===> a=12
		System.out.println("a="+a); */
		int a=10; //저장
		int b=++a;
		/*
		 * 		b = ++ a   // a값을 증가한 다음에 b에 대입     ++ 우선적용  /  = 이후적용
		 * 			==
		 * 		 ==  1  
		 * 		  2
		 * 
		 * 		b = a++	   // a값을 b에 대입하고 나중에 a를 한 개 증가      = 먼저적용  /  ++ 이후적용
		 * 		=====
		 *        1  ==
		 *            2
		 */
		System.out.println("a="+a+",b="+b);
		
		int c=10;
		int d=c++;
		System.out.println("c="+c+",d="+d);
		
		/*
		 * 	  int a=10;
		 *    int b= ++a + a++ + ++a + a++
		 *    		 ===   ===   ===   ===
		 *    		  11    11    13    13    ==> 48
		 *    
		 *    int a=10;
		 *    int b= a++ + a++ + a++ + ++a
		 *    		 ===   ===   ===   ===
		 *    		  10    11    12    14    ==> 47
		 *    
		 */
		a=10;
		b= ++a + a++ + ++a + a++;
		System.out.println("b="+b);
		
		// 감소 ++ , -- (한 개 증가, 한 개 감소): 반복문
		// a=a+1; a++ ++a
		int i=10;
		i--; // i=9
		System.out.println("i="+i);
		--i;
		System.out.println("i="+i);   // 대입하기 전까지 단독으로 쓸 때는 똑같음
		
		
	}

}
