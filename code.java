package code;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="12344321";
		Set<String> set=new HashSet<String>();
		int max=0;
		int dem=0;
		while(dem<s.length()) {
			int count=0;
			while(count<s.length()-dem) {
				String chuoi="";
				for(int i=count;i<=count+dem;i++) {
					chuoi+=s.charAt(i)+"";
				}
				Boolean a=true;
				for(int i=0;i<chuoi.length()/2;i++) {
					if(chuoi.charAt(i)!=chuoi.charAt(chuoi.length()-i-1)) {
						a=false;
						break;
					}
				}
				if(a==true) {
					if(max<chuoi.length()) {
						max=chuoi.length();
					}
					set.add(chuoi);
				}
				count++;
			}
			dem++;
		}
		for (String string : set) {
			if(string.length()==max) {
				System.err.println(string+" "+max);	
			}
		}
		

	}

}
