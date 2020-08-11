package QnA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * auction ���� ������ �����Ű�� ���� ��Ʈ�ѷ�
 * @Controller�� ��Ʈ�ѷ���� ���̰�,
 * @RequestMapping("/jsp�̸�")�� �ش��ϴ� jsp�̸����� ��û�� ������ �����Ѵٴ� ���̴�. ���� ������ ���� �Ÿ� ���⼭ �߻�!!
 * �̋�, return "�����̸�/jsp�̸�" ���� ��ȯ����� �Ѵ�.
 * ����� �۵��ϴ��� Ȯ���ϱ� ���� System.out.println ���� �ܼ�â�� ǥ��. �� ������ �����ص� ��.
 * 
 *  */

@Controller
public class QnAController {	
	// �����亯 ���� ȭ��
	@RequestMapping("/BoardList")
	public String intro(Model model) {
		System.out.println("���� ���� ��Ʈ�ѷ� �����");
		return "QnA/BoardList";
	}
	

	@RequestMapping("/getBoard")
	public String get(Model model) {
		System.out.println("��  ��Ʈ�ѷ� �����");
		return "QnA/getBoard";
	}
	

	@RequestMapping("/insertBoard")
	public String insert(Model model) {
		System.out.println("�� ��� ��Ʈ�ѷ� �����");
		return "QnA/insertBoard";
	}
	

	@RequestMapping("/updateBoard")
	public String update(Model model) {
		System.out.println("�� ���� ��Ʈ�ѷ� �����");
		return "QnA/updateBoard";
	}
}
