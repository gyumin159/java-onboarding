package onboarding;

import java.util.List;

class Problem1 {
	// 1���� ���������� ������ 2���� ����� ū �� ���ϱ�
	// 2���� ���������� ���� ���� �� ���Ͽ� ū �� ���ϱ�
	// �� ����� ���� �ΰ��� �������� �������ΰ�Ȯ��
	
	public static int all_poss(String num) { // �� ������ �� �ִ밪
		String[] arr = num.split("");
		int curr, plus = 0, mult = 1;
		for(String s : arr) {
			curr = Integer.parseInt(s);
			plus += curr;
			mult *= curr;
		}
		if (plus >= mult) {
			return plus;
		}
		return mult;
	}
	
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        return answer;
    }
}