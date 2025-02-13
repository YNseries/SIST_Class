/*
 *    연산자 종류
 *    &&   ||  ===> 결과값 (true, false)
 *    (조건) && (조건)
 *    ====     ==== 비교연산자
 *    
 *    (조건) || (조건)
 *    ====     ==== 비교연산자
 *    
 *    결과값
 *             && => 직렬
 *             || => 병렬
 *    ========================================================
 *       (조건) && (조건)                (조건) || (조건)
 *    ========================================================
 *       true  && true  = true         true  || true  = true
 *    ========================================================
 *       true  && false = false        true  || false = true
 *    ========================================================
 *       false && true  = false        false || true  = true
 *    ========================================================
 *       false && false = false        false || false = false
 *    ========================================================
 *     && : false가 한개 이상이면 => false, 두 개의 조건이 true => true
 *          => 범위 안에 있는 경우
 *          예) 90에서 100 사이면 => A
 *             score>=90 && score <=100
 *     || : true가 한개 이상이면 => true, 두 개의 조건이 false => false
 *          => 범위 밖에 있는 경우
 *          예) 0보다 작다, 100보다 크다
 *             score<0 || score>100
 *     
 *     ==> 검색, 로그인(ID, PW) 할 때 많이 사용함
 *     *** 효율적인 계산 : 오른쪽에 있는 조건을 수행하지 않을 경우
 *         (조건) && (조건)
 *         =====
 *           1      =====
 *              ===   2
 *               3
 *         
 *         =====> && : 왼쪽에 있는 조건이 false면 오른쪽은 계산하지 않는다 (결과값:false)
 *         =====> || : 왼쪽에 있는 조건이 true면 오른쪽은 계산하지 않는다 (결과값:true)
 */
public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=11;
		System.out.println("a<b && a==b?"+(a<b && a==b)); //false
		// a<10 => 10<11 (true)
		// a==b => 10==11 (false)
		// true && false => false
		// 왼쪽의 조건이 false일 조건을 배치하면 속도가 빨라진다
		System.out.println("a<b || a==b?"+(a<b || a==b)); //true
		// a<10 => 10<11 (true)
		// a==b => 10==11 (false)
		// true && false => true
		// 왼쪽의 조건이 true일 조건을 배치하면 속도가 빨라진다

	}

}
