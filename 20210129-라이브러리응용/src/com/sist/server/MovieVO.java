package com.sist.server;
/*
 *  소울(2020)
	08 . 6
	애니메이션/판타지
	2021.01.20 개봉
	107분, 전체관람가
	감독 피트 닥터, 켐프 파워스 주연 제이미 폭스, 티나 페이
	598,051
	나는 어떻게 ‘나’로 태어나게 되었을까? 
	지구에 오기 전 영혼들이 머무는 ‘태어나기 전 세상’이 있다면?  
	
	클래스
	 = 데이터만 모아서 저장할 목적 => ~VO(Value Object), ~DTO(Data Transfor Object)
	   => 데이터형 클래스
	 = 데이터 활용 => 메소드  ==> ~Manager(보통 File, 메모리 제어/관리), ~DAO(데이터베이스 연결)
	                         ~Service ... 
	   => 액션 클래스(요청처리를 해 줌)
	 데이터형
	   기본형(자바에서 제공): 메모리에 실제 값을 저장(메모리 공간을 1개만 사용하기 때문)
	   참조형(프로그래머가 데이터형 제작): 메모리에 주소를 저장 => 실제 데이터는 다른 메모리에 저장 => 주소를 통해 데이터 읽기
	   ======================== 배열, 클래스, 인터페이스 => .
	   
	 객체지향 프로그램
	 1. 대상 => Actor
	    사이트
	    = 사용자(user): 화면 UI *****
	    = 관리자(admin): 기능
	 2. 기능적인 부분
	 3. 재사용
 */
public class MovieVO {
	// 찾기 => (중복이 안되는)번호 부여
	private int no;   // 영화의 고유 번호
	private int cno;  // 영화 카테고리(상영, 개봉예정, 주간, 월간, 연간)
	private String title;
	private String score;   // 정수가 필요하면 형변환 하면 됨 => Double.parseDouble(score)
	private String genre;
	private String regdate;
	private String time;
	private String grade;
	private String director;
	private String actor;
	private String showUser;  // Integer.parseInt(showUser) => replace(",",")
	private String story;
	private String poster;  // 영화 포스터
	private String key;  // 동영상
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getShowUser() {
		return showUser;
	}
	public void setShowUser(String showUser) {
		this.showUser = showUser;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
}
