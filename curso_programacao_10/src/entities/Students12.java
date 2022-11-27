package entities;

import java.util.Objects;

public class Students12 {

	private Integer number;

	public Students12(Integer number) {
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students12 other = (Students12) obj;
		return Objects.equals(number, other.number);
	}
	
}
