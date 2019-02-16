package com.kewei.mybatis.mapper;

import java.util.List;

import com.kewei.mybatis.been.Blog;

public interface BlogMapper {
	
	Blog selectBlog(Integer id);
	
	// 
	Blog selectDesc(String title);

	Blog selectActiveBlig(Blog title);
	
	// 使用 where标签
	Blog selectFortitle(Blog blog);
	
	// 使用 set 标签
	int updateBlog(Blog blog);

}
