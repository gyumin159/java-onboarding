package onboarding;

public class Problem4 {
    public static String solution(String word) {
    	String answer = "";
    	String temp = word.toLowerCase(); // �켱 ��� �ҹ��ڷ� ����
    	String alpha = "abcdefghijklmnopqrstuvwxyz"; // �쿵��� �Ųٷ� �ص� �쿵��
    	for (int i=0;i<temp.length();i++) {
    		char c = temp.charAt(i);
    		int idx = temp.indexOf(c);
    		
    		if ((int)c >= 97 && (int)c <= 122) { // ���ĺ��� ��쿡�� ��ȯ
    			answer = answer + alpha.charAt((alpha.length() - 1) - idx); // �ش� ���ĺ��� �ε����� �̿��� ��ȯ
    		}
    		else {
				answer = answer + c;
			}
    		
    		
    	}
    	
        return answer;
    }
}
