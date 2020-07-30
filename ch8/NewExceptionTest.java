package ch8;

public class NewExceptionTest {
	public static void main(String[] args) {
		
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			System.out.println("에러 메세지 : "+e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
		} catch(MemoryException me) {
			System.out.println("에러 메세지 : "+me.getMessage());
			me.printStackTrace();
			System.gc(); //Garbage Collection을 수행하여 메모리를 늘려준다.
			System.out.println("다시 설치를 시도하세요.");
		} finally {
			deleteTempFiles();
		}
		
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		//startInstall을 수행하는 동안 발생할 수 있으며 실행결과에 따라 예외의 종류다 달라지게 코딩
		if(!enoughSpace())
			throw new SpaceException("설치할 공간이 부족합니다.");
		
		if(!enoughMemory())
			throw new MemoryException("메모리가 부족합니다.");
		
	}
	
	static void copyFiles() {/*파일 복사 코드*/}
	
	static void deleteTempFiles() {/*임시파일 삭제 코드*/}
	
	static boolean enoughSpace() {
		//설치하는데 필요한 공간이 있는지 확인하는 코드
		return true;
	}
		
	static boolean enoughMemory() {
		//설치하는데 필요한 메모리 공간이 있는지 확인하는 코드
		return false;
	}
}

//설치에 필요한 공간 예외 처리
	class SpaceException extends Exception{
		SpaceException(String msg) {
			super(msg);
		}
	}
	
	//설치에 필요한 메모리공간 예외 처리
	class MemoryException extends Exception{
		MemoryException(String msg){
			super(msg);
		}
	}
