package org.lm;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.lm.dao.SysUserMapper;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class TestUpdate  extends BaseMapperTest
{
    @Test
    public void test(){
        SqlSession sqlSession=getSqlSession();

        try {

            SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);

            Map<String, Object> map = new HashMap<>();

            map.put("id", 1004);  //  查询条件 ，同样也是更新字段 ， 必须保证 该值 存在

            map.put("user_email", "test2@163.com");
            map.put("user_password", "123");

            userMapper.updateByMap(map);

        }finally {
            sqlSession.commit();
            sqlSession.close();
        }

    }
}
