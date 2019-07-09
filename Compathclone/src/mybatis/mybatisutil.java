package mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class mybatisutil {

	public static SqlSessionFactory factory; // �������� ��� ��
	static {
		String resource = "mybatis/mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(inputStream);
			// session ������ memory�� �÷����´�. session�� ������ ��� �ִ� factory�� building�ϴ� ��
			// CRUD ��ü�� session ������ factory�� �޸𸮿� �÷����� ����
			// ����ִ� ������, method �߿� build method ����� inputStream������ ����ó�� �о string���� �ٲ۴�����
			// �����
			// ���� build(reader, environment, props) overload method�� ����.
		} catch (IOException e) {
			e.printStackTrace();
		}

	}// static end
}
