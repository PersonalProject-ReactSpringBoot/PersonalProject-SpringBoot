package Pack.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class JdbcTemplate {
	private static JdbcTemplate instance;
	private SqlSessionFactory sf;
	private JdbcTemplate()
    {
		InputStream is = null;
		try {
			// 소스 코드만 리딩.
			is = Resources.getResourceAsStream("mybatis-config.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 코드를 컴파일 한것이고
		sf = new SqlSessionFactoryBuilder().build(is);
    }
    
    public static JdbcTemplate getInstance()
    {
        if (instance == null)
        {
            synchronized(JdbcTemplate.class)
            {
                instance = new JdbcTemplate();
            }
        }
        
        return instance;
    }
	
	public Object proxy(Delegate d) {
		SqlSession session = sf.openSession();
		
		Object obj = null;
		
		try {
			obj = d.delegate(session);
			
			if (isInteger(obj)) {
				session.commit();
			}
		} catch (Exception e) {
			System.out.println("요기");
			e.printStackTrace(); 
		} 
		finally { session.close(); }
		
		return obj;
	}
	
	private boolean isInteger(Object obj) {
		try {
			if ((int)obj > 0) return true;
		} catch (Exception e) {
			return false;
		}
		
		return false;
	}
}