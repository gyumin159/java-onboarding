package onboarding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

// �г���: �� ���� �̻��� ���ڰ� ���������� ������ �ߺ�
// �̸����� ���̴� 11~19 ��û���� �̸����� email.com ���� ����
// �г����� �ѱ�, 1~19��
// ���� ����� ������������ �����ϰ� �ߺ��� �����ؼ� ����

// �ߺ��Ǵ� �г����� ���� �̸����� ����� ����

//1. 2���ڸ� ���Ƶ� �ߺ����� �����ϴϱ� 2���ھ����� ��� ��츦 ���ϱ�
//2. map�� Ű���� 2���ڵ��� ��� ����� �ϰ� value�� �ش� �ϴ� 2���ڸ� ���� �̸��Ϸ� ����.
//3. ���������� map�� �ݺ��ϸ� value�� 2�� �̻��� ��� �г��ӿ� ���� value ���� set�� ����
//4. set�� ����Ʈ�� ��ȯ�� �����غ���.



public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");
        HashMap<String, List<String>> all_pos = new HashMap<String, List<String>>();
        HashSet<String> filter = new HashSet<>(); // �ߺ� ���ſ� ����
        
        for (List <String> data: forms) {
        	String email = data.get(0);
        	String name = data.get(1);
        	for (int i=0; i<name.length() - 1;i++) {
        		String temp = String.valueOf(name.charAt(i)) + String.valueOf(name.charAt(i + 1));
        		if (!all_pos.containsKey(temp)) { // �α��ڰ� �̹� Ű�� ����Ǿ� ���� ������ ���ο� �󸮽�Ʈ ����
        			all_pos.put(temp, new ArrayList<String>()); // �α���-�󸮽�Ʈ ����        			
        		}
        		all_pos.get(temp).add(email); // �󸮽�Ʈ�� �̸��� �߰�
        	}
        }
        
        for(String key: all_pos.keySet()) { // �ߺ��Ǵ� �г����� ���� �̸��ϵ��� ���տ� �־���
        	List<String> email_list = all_pos.get(key);
        	if (email_list.size() > 1) { 
        		filter.addAll(all_pos.get(key));
        	}
        }
        return answer;
    }
}
