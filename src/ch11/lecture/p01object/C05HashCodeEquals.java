package ch11.lecture.p01object;

public class C05HashCodeEquals {

}

class Phone { // 여러 필드
	private String modelName;
	private int code;
	private String company;
	
	
	// 해시코드와 이퀄즈 메소드를 재정의 하려면
	// 위의 Source -> Generate hasCode() and equals() -> Generate 하면 된다
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((modelName == null) ? 0 : modelName.hashCode());
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
		Phone other = (Phone) obj;
		if (code != other.code)
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (modelName == null) {
			if (other.modelName != null)
				return false;
		} else if (!modelName.equals(other.modelName))
			return false;
		return true;
	}

}
