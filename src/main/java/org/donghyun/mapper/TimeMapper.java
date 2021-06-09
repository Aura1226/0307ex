package org.donghyun.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

	@Select("select now()")
	public String getTime();
	
	public String getTime2();
}
