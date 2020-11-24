package classex;

public class Mp3p {
	private String color;
	private int volume;

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if (volume == 64 || volume == 128 || volume == 256) {
			this.volume = volume;
		} else {
			System.out.println("지원하지 않는 용량입니다.");
		}

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {

		if (color.equals("빨간색")||color.equals("파란색")||color.equals("노란색")) {
			this.color = color;
		}else {
			System.out.println("지원하지 않는 색상입니다.");
		}

		/*
		 * switch (color) { case "빨간색": this.color = color; break; case "파란색":
		 * this.color = color; break; case "노란색": this.color = color; break; default:
		 * System.out.println("지원하지 않는 색상입니다."); break; }
		 */
	}

	public static void main(String[] args) {
		Mp3p m3 = new Mp3p();
		m3.setColor("빨간색");
		m3.setVolume(64);
		System.out.println("색상:" + m3.getColor());
		System.out.println("용량:" + m3.getVolume());
		m3.setColor("검정색");
		m3.setVolume(512);
		Mp3p mp3 = new Mp3p();
		System.out.println("색상:" + mp3.getColor());
		System.out.println("용량:" + mp3.getVolume());

	}

}