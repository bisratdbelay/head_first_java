package head_first_java;

class DrumKitTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrumKit d = new DrumKit();
		d.playSnare();
		d.snare = false;
		d.playTopHat();
		
		if (d.snare == true) {
			d.playSnare();
		}
	}

}
