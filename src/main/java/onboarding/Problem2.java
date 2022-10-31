package onboarding;

//��ȣ���� �����ϴ� ��¥ ������ ������ �̹����� �ߺ� ���ڸ� �̿��� ���ο� ��ȣ�� �������. ���� ��� "browoanoommnaon"�̶�� ��ȣ���� ������ ���� ������ �ص��� �� �ִ�.
//
//"browoanoommnaon"
//"browoannaon"
//"browoaaon"
//"browoon"
//"brown"
//������ ���ڿ� cryptogram�� �Ű������� �־��� ��, �����ϴ� �ߺ� ���ڵ��� ������ ����� return �ϵ��� solution �޼��带 �ϼ��϶�.
//
//���ѻ���
//cryptogram�� ���̰� 1 �̻� 1000 ������ ���ڿ��̴�.
//cryptogram�� ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
//���� ��� ����
//cryptogram	result
//"browoanoommnaon"	"brown"
//"zyelleyz"	""


// �ѱ��ھ� ���� �ߺ��Ǵ� �κ��� ã�� ����.
// �ߺ��������� �� ���� ���ں��� �ٽ� �ݺ�
// �ƹ� ������ �Ͼ�� ������ ��.
public class Problem2 {
	
	//1. ���ڿ��� ��ȸ�ϸ� �ߺ��� ã�� �޼ҵ� -> �ִٸ� �ش� �ε���, ���� �����ְ� �ƴϸ� -1 ����
	public int[] check(int start_idx, String target) {
		char curr = target.charAt(start_idx);
		int idx = -1, num = 1; // �ߺ��� ������ �ε���, ����
		for (int i = start_idx; i < target.length() - 1; i++) {
			char next = target.charAt(i + 1);
			if (curr == next) {
				num++;
				if (idx == -1) {
					idx = i;
				}
			}
			else if (idx != -1) {
				break;
			}
			curr = next;
		}
		int [] arr = {idx, num};
		return arr;
		
	}
	
    public static String solution(String cryptogram) {
        String answer = "answer";
        return answer;
    }
}
