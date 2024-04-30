package ex_240430;

import util.RandomSelectNumber;

public class PhoneTest {

	public static void main(String[] args) {
		// 확인
		Galaxy_11 ksb = new Galaxy_11();
		System.out.println("강루키 휴대폰 프로젝트");
		
		// 전화 멤버
		ksb.call("엄마");
		
		// 메시지 멤버
		ksb.message("아빠");
		
		// 카메라 모드
		String[] mode = {"인물사진","필터사진","풍경사진","동영상"};
		ksb.camera(mode);
		
		// 브라우저
		String[] browser = {"크롬","구글","삼성"};
		ksb.internet(browser);
		
		// 용량 1.256GB 2.512GB
		ksb.selectMemorySize(256);
		
		// 폰팔이
		String[] buyMembers = {"오현제",
				"이한솔","이상용",
				"임채수","김소영",
				"이수진"};
		
		int selectedNumberofMember = RandomSelectNumber.selectInt(6);
		// 구매자 선정 완료. 
		System.out.println("구매하는 사람은 : " + buyMembers[selectedNumberofMember] + " 강매당첨.ㅋㅋㅋ");
		
	}

}