import java.text.DecimalFormat;
import java.util.*;
public class Lab702 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("##.00");
		double[] score = new double[5];
		double sum = 0,average = 0;
		//for input 5 data to array score
		for(int i=0;i<score.length;i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			score[i] = scan.nextDouble();
			sum += score[i];
		}
		average= sum/score.length;
		System.out.print("\nAverage of "+score.length+" student is "+frm.format(average));
		int j = 0;
		for(double _score:score) {
			if(_score>average) {
				System.out.print("\n> Student "+(j+1)+" ("+frm.format(_score)+")");
				j++;
			}
			
			
		}
	}

}
