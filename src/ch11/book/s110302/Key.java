package ch11.book.s110302;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	// Override 책이랑 다르게 변경함
	// 덕분에 KeyExample이 프린트 되는데 왜인지 찾기
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (number != other.number)
			return false;
		return true;
	}
	//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof Key) {
//			Key compareKey = (Key) obj;
//			if (this.number == compareKey.number) {
//				return true;
//			}
//		}
//		return false;
}