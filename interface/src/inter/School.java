package inter;

public class School implements over {
	private Printer printer=new Printer();
	public String detail(){
		return "这里是学校";
	}
	public void print(over o){
		printer.print(o.detail());
	}
}
