package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// ģ���� ģ�� -> 10��
// Ÿ�� ���� �湮 -> 1��
// friends �� [ID_1, ID_2]�̸� ���� ģ����� �ǹ�
// ���̵�� ��� ���ĺ� �ҹ���
// ��õ�� ģ���� ������ ����

// ģ�� ��õ ������ ���� 5�� 1.������ -> 2.�̸��� ���� �����Ͽ� ����� ����

//1.ģ�����踦 map���� ���� -> id-[ģ����..]
//2.���� �ָ��ϴ� ����� user�� ģ������� ��ȸ�ϸ� ģ���� ģ������ ã�� ������ �߰�����
//2-1.ģ������ map���� user�� ����� �̹� ģ���� ����鵵 ��ĥ �� �ִ�.


public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
//        List<String> answer = Collections.emptyList();
        
        HashMap<String, List<String>> friends_info = new HashMap<String, List<String>>();
        HashMap<String, Integer> points = new HashMap<String, Integer>(); // ģ�� ��õ ���� ��Ͽ�
        
        for (List<String> data: friends) { // ��� ģ�����踦 ���� -> ����id - [ģ����]
        	String id_1 = data.get(0); // ID_1
        	String id_2 = data.get(1);// ID_2
        	
        	if (!friends_info.containsKey(id_1)) { // id_1 �̶�� Ű���� ������ �󸮽�Ʈ�� �����ؼ� ��������
        		friends_info.put(id_1, new ArrayList<String>());
        	}
        	friends_info.get(id_1).add(id_2); // id_1�� ģ���� id_2 �߰�
        	
        	//id_2���� id_1�� ģ����°� ����
        	if (!friends_info.containsKey(id_2)) {
        		friends_info.put(id_2, new ArrayList<String>());
        	}
        	friends_info.get(id_2).add(id_1);
        	
        }
        if (friends_info.containsKey(user)) { // user�� ģ���� �ϳ��� ���� ��츦 ����
        	for (String f: friends_info.get(user)) { // ������ ģ������ ��ȸ
        		
        		for (String f_f :friends_info.get(f)) {// ģ���� ģ�� = f_f�� Ȯ���ϸ� ÷���� ������
        			if (!points.containsKey(f_f)) {
        				points.put(f_f, 0);
                	}
        			points.put(f_f, points.get(f_f) + 10);
        			
        		}
        	}
        }
        
//        return answer;
    }
}
