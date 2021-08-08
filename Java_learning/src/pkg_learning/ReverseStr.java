package pkg_learning;

import java.util.Scanner;

import org.apache.commons.exec.util.StringUtils;

public class ReverseStr {
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s1 = obj.nextLine();
		System.out.println(s1);
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse();
		System.err.println(sb);
		StringBuilder Sbld = new StringBuilder();
		Sbld.append(s1);
		Sbld.reverse();
		System.out.println(Sbld);
		char [] rev = s1.toCharArray();
		for (int i=0;i<rev.length/2;i++) {
			char temp = rev[i];
			rev[i]=rev[rev.length-1-i];
			rev[rev.length-1-i]=temp;
		}
		System.out.println(new String(rev));
		
	}

}
