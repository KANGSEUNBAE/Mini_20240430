package ex_240430;

public interface PHONE {
	
	public final static String PHONENAME = "갤럭시";
	// 주요 기능 : 1) 전화 2) 메시지 3) 카메라 4) 인터넷
	public abstract void call(String callMember);
	public abstract void message(String[] messageMember);
	public abstract void camera(String[] camerMode);
	public abstract void internet(String[] Browser);

}
