package ch05;

public class ArrayClass {
	public static void main(String[] args) {
		String[] name = {"홍길동", "이몽룡","성춘향","강감찬","이순신"};
		int[] kor = {100,80,70,60,90}; //순서대로
		int[] eng = {80,90,95,85,75}; //순서대로
		int[] mat = {99,89,79,69,77}; //순서대로
	
		int[] tot= {0,0,0,0,0};
		double[] avg =new double[5];
		double tot_avg =0;
		for(int i=0; i<5;i++) {
			tot[i]=kor[i]+eng[i]+mat[i];
			avg[i]=tot[i]/3.0;
			tot_avg=tot_avg+avg[i];
		}
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for (int i=0; i<5; i++) {
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+avg[i]);
			}
		}
}