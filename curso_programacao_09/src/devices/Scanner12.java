package devices;

public class Scanner12 extends Device12 {

	public Scanner12(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}

	public String scan() {
		return "Scanned content";
	}
}
