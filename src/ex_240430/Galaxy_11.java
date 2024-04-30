package ex_240430;

public class Galaxy_11 implements GalaxyPhone {

	@Override
	public void call(String callMember) {
		
		System.out.println(callMember + "에게 전화걸기");

		
	}

	@Override
	public void message(String messageMember) {
		System.out.println(messageMember + "에게 문자보내기");

		
	}

	@Override
	public void camera(String[] camerMode) {
		for (int i = 0; i < camerMode.length; i++) {
			System.out.println("카메라모드" + i +" : " + camerMode[i]);
		}
		
	}

	@Override
	public void internet(String[] Browser) {
		for (int i = 0; i < Browser.length; i++) {
			System.out.println("브라우저 " + i +" : " + Browser[i]);
		}
		
	}

	@Override
	public void selectMemorySize(int selectMemorySizeNumber) {
		
		if (selectMemorySizeNumber == 256) {
			System.out.println("256GB로 할게요.");
		} else {
			System.out.println("512GB로 할게요.");
		}
		
	}

}
