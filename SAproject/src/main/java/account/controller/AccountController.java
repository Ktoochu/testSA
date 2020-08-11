package account.controller;

import java.util.Locale;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import account.dto.member;

/*
 * account ���� ������ �����Ű�� ���� ��Ʈ�ѷ�
 * @Controller�� ��Ʈ�ѷ���� ���̰�,
 * @RequestMapping("/jsp�̸�")�� �ش��ϴ� jsp�̸����� ��û�� ������ �����Ѵٴ� ���̴�. ���� ������ ���� �Ÿ� ���⼭ �߻�!!
 * �̋�, return "�����̸�/jsp�̸�" ���� ��ȯ����� �Ѵ�.
 * ����� �۵��ϴ��� Ȯ���ϱ� ���� System.out.println ���� �ܼ�â�� ǥ��. �� ������ �����ص� ��.
 * 
 *  */

@Controller
public class AccountController {
	
	@Autowired
	private SqlSession sqlSession;
	
	// ���� ȭ��, �α��� ȭ��
	@RequestMapping(value = {"/", "/Login"})
	public String login(Model model) {
		System.out.println("Login ��Ʈ�ѷ� �����");
		
		member m = new member();
		sqlSession.insert("test.show", m);
		System.out.println("test.show �����"+m.getId());
		
		return "account/Login";
	}
	
	// ȸ������ �߰� ������
	@RequestMapping("/select")
	public String registPage(Model model) {
		System.out.println("�߰� ȸ������ ��Ʈ�ѷ� �����");
		return "account/select";
	}
	
	// ��� ȸ������ ������
	@RequestMapping("/farmerRegist")
	public String farmer(Model model) {
		System.out.println("��� ȸ������ ��Ʈ�ѷ� �����");
		return "account/farmerRegist";
	}
	
	// �Ϲ� ȸ������ ������
	@RequestMapping("/standardRegist")
	public String standard(Model model) {
		System.out.println("�Ϲ� ȸ������ ��Ʈ�ѷ� �����");
		return "account/standardRegist";
	}
	
	// ���̵� ã�� ������
	@RequestMapping("/id_found")
	public String idFound(Model model) {
		System.out.println("���̵� ã�� ��Ʈ�ѷ� �����");
		return "account/id_found";
	}
	
	// ��й�ȣ ã�� ������
	@RequestMapping("/pw_found")
	public String pwFound(Model model) {
		System.out.println("��й�ȣ ã�� ��Ʈ�ѷ� �����");
		return "account/pw_found";
	}
	

	// �α��� ��, ���� ������
	@RequestMapping("/introPageDesign")
	public String intro(Model model) {
		System.out.println("���� ������ ��Ʈ�ѷ� �����");
		return "account/introPageDesign";
	}
}
