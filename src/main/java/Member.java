public class Member {
	// 이름
	String name;
	// 정당
	String party;
	// 지역
	String location;
	// 선
	String rank;

	// 상임위
	String department;
	// 주소
	String address;
	// 이메일
	String email;
	// 홈페이지
	String homepage;
	// 출생
	String birth;
	// 학력 경력
	String carrer;
	// 병역
	String military;
	// 전과
	String crime;

	public Member(String name, String party, String location, String rank, String department, String address,
			String email, String homepage, String birth, String carrer, String military, String crime) {
		super();
		this.name = name;
		this.party = party;
		this.location = location;
		this.rank = rank;
		this.department = department;
		this.address = address;
		this.email = email;
		this.homepage = homepage;
		this.birth = birth;
		this.carrer = carrer;
		this.military = military;
		this.crime = crime;
	}

	public String getName() {
		return name;
	}

	public String getParty() {
		return party;
	}

	public String getLocation() {
		return location;
	}

	public String getRank() {
		return rank;
	}

	public String getDepartment() {
		return department;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public String getHomepage() {
		return homepage;
	}

	public String getBirth() {
		return birth;
	}

	public String getCarrer() {
		return carrer;
	}

	public String getMilitary() {
		return military;
	}

	public String getCrime() {
		return crime;
	}
}
