/*
 *    클래스 구성요소
 *    ==========
 *    변수, 메소드, 생성자
 *    ========== 기본 디폴트 값 설정
 *    class A
 *    {
 *        int a;      ====> 0
 *        String name;====> null(모든 클래스: null)
 *        double d;   ====> 0.0
 *        boolean b;  ====> false
 *    }
 *    1. 초기화(명시적 선언)
 *    class A
 *    {
 *    	  int a=10;
 *    String name="홍길동";
 *    }
 *    *** 클래스는 선언 가능(선언과 동시에 값을 설정) ==> 선언
 *    ========================================================
 *    *** 외부에서 데이터를 가지고 오는 경우(자동 로그인 => 파일에 읽기 ini)
 *    *** 연산처리, 제어문
 *    =============================> 구현(클래스 블럭에서 사용이 불가능)
 *     *** 메소드를 이용해서 초기화
 *     *** 자동으로 호출이 가능하게 함 1) 생성자, 2) 초기화 블럭
 *    
 *    생성자, this, 접근지정어(캡슐화)
 *    =========================
 *    생성자
 *    class a
 *    {
 *    }
 *    A a=new A();
 *            === 생성자
 *     1) 역할
 *        = 멤버변수에 대한 초기화 담당
 *        = 메모리 생성할 때 반드시 호출된 메소드
 *        = 모든 클래스에는 생성자가 1개 이상 존재
 *          ========
 *          컴파일러에 생성자가 없는 경우, 자동으로 생성자를 만들어준다
 *                                ===========
 *                                디폴트 생성자(매개변수 없는 함수)
 *          자동 생성
 *          ======
 *          1. import java.lang.*;
 *                    ============  String, System, Math
 *          2. 메소드 => void를 사용하게 되면 return을 생략
 *          3. 생성자가 없는 경우에 자동으로 추가시켜줌
 *          =============================================
 *          4. 모든 클래스는 Object로부터 상속을 받는다
 *          5. 모든 클래스는 예외처리를 하고 있다
 *          =============================================
 *        	
 *          *** 자바에서 제공하는 라이브러리를 사용시 반드시 import를 사용해서 읽어온다(lang 제외)
 *          *** 모든 메소드는 메소드 종료시, 반드시 return을 사용한다
 *          *** 모든 클래스는 생성자를 가지고 있다
 *          *** 생성자는 필요시에만 만들어서 사용
 *          
 *          class A
 *          {
 *          	int a;
 *          	a=10;  (클래스 안에서는 값 변경 X) => 생성자
 *          	int a=10; (O)
 *          }
 *          
 *          *** class 영역에서는 필요한 데이터 선언만 할 수 있음
 *          *** 선언된 데이터에 값을 입력할 때는 반드시 메소드, 생성자를 이용해야 한다
 *          
 *     2) 특징
 *        = 생성자는 반드시 클래스명과 동일해야 한다
 *                     ===========
 *          class MainClass
 *          {
 *              MainClass(){}
 *          }
 *        = 생성자는 특수한 메소드(리턴형이 존재하지 않는다)
 *          class MainClass{
 *          	void MainClass(){}   // void가 붙음으로서 일반 메소드가 됨
 *          	MianClass(){}        // 생성자
 *          }
 *        = 생성자는 여러개를 만들어서 사용이 가능
 *          메소드 한 개의 이름을 갖고 여러개를 만들어서 사용할 때
 *          ======================================= 오버로딩
 *          오버로딩을 지원한다
 *          =====  메소드명이 동일
 *                 매개변수의 데이터형이나 갯수가 다르다
 *                 리턴형은 관계없다
 *          class A
 *          {
 *              A(){}               ==> new A()
 *              A(int a){}          ==> new A(10)  // 안에 int값을 넣어줘야
 *              A(String name){}    ==> new A("Hello")  // 안에 String값을 넣어줘야
 *          }
 *          
 *        = 생성자는 호출할 때 반드시 생성자 앞에 new를 사용해서 호출한다★
 *          ====
 *           서버연결(오라클, 네트워크)
 *                 ===== 데이터를 영구적으로 저장하는 장소
 */
public class MainClass {
	// int a=100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// return;  // 이게 안보이게 첨부되어 있음!
		// 클래스 저장
		MainClass mc=new MainClass();
		//               =========== 생성자
		/*
		 *   stack 영역
		 *    ==mc==
		 *     100
		 *    ======  mc.a ==> 접근시에는 반드시 .을 사용해서 접근
		 *                                 == 연산자: 주소 접근 연산자
		 *                   실제 데이터 저장 장소(heap)
		 *               100================
		 *                    =====a=====
		 *                         0 => 생성자
		 *                    ===========
		 *                  
		 *                  ================   ==> 메모리 공간을 만들어준다(new)
		 */

	}

}
