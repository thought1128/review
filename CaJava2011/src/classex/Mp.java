package classex;

public class Mp {
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

		if (color.equals("skyblue")||color.equals("red")||color.equals("silver")) {
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
		Mp mp = new Mp();
		mp.setColor("red");
		mp.setVolume(64);
		System.out.println("색상:" + mp.getColor());
		System.out.println("용량:" + mp.getVolume());
		mp.setColor("white");
		mp.setVolume(512);
		Mp mp2 = new Mp();
		System.out.println("색상:" + mp2.getColor());
		System.out.println("용량:" + mp2.getVolume());

	}

}