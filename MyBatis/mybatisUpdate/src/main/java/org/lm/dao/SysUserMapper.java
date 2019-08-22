package org.lm.dao;

import java.util.Map;

public interface SysUserMapper {

    /**
     * 通过 map 更新列
     *
     * @param map
     * @return
     */
    int updateByMap(Map<String,Object> map);

}
