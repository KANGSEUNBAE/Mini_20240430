package ex_240430;

public interface GalaxyPhone extends Phone {
	
	public final static String PhonePrice = "기본 1,000,000원";
	
	// 기능 : 1) 용량 선택하기
	public abstract void selectMemorySize(int selectMemorySizeNumber);

}
