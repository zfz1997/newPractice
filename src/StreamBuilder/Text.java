package StreamBuilder;

public class Text {
    public static void main(String[] args) {
		MyStreamBuilder sb=new MyStreamBuilder();
		sb.append("aaaa");
		sb.append("bbbbcccccc");
		System.out.println(sb.toString());
		System.out.println(sb.getCapacity());
		System.out.println(sb.getLength());
	}
}
