package ch8;

public class Exercise8_9 {
	public static void main(String[] args) throws Exception{
		throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
	}

}

class UnsupportedFunctionException extends RuntimeException{
	private final int ERR_CODE;
	
	//생성자
	public UnsupportedFunctionException(String msg, int code) {
		super(msg);	//RuntimeException(String msg)호출
		ERR_CODE = code; //초기화
	}
	
	public UnsupportedFunctionException(String msg) {
		this(msg, 100);
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	@Override
	public String getMessage() {
		return "["+getErrorCode()+"] "+super.getMessage();
	}
}
