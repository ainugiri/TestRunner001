class JFSD{
	void main(){
		System.out.println("Hello");
	}
	public int main(int a){
		System.out.println("Hello"+a);
		return a*a;
	}
	public static void main(String args[]){
		System.out.println("int Hello World");
		JFSD j = new JFSD();
		j.main();
		System.out.println(j.main(10));
	}
}
class Sample01{
	void main(){
		System.out.println("Sample");
	}
	public int main(int a){
		System.out.println("Sample "+a);
		return a*a;
	}
}


class Sample02{
	void main(){
		System.out.println("Sample2");
	}
	public int main(int a){
		System.out.println("Sample2 "+a);
		return a*a;
	}
	public static void main(String args	[]){
		System.out.println("Sample2 Hello World");
		Sample01	 j = new Sample01();
		j.main();
		System.out.println(j.main(20));
	}
}