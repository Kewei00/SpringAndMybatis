package com.kewei.mybatis.util;

import java.io.IOException;
import java.io.InputStream;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * mybatis 工具类
 * @author kewei
 *
 * 2019年1月13日
 */
public class MyBatisUtil {
	
	// 创建  SqlSessionFactory
	private static SqlSessionFactory sqlSessionFactory = null;
	
	// 创建静态代码块 来创建 SqlSessionFactory 工厂
	static{
		
		/*
		 * 1. 若方法执行成功 则说明成功读取配置文件  并且创建在 sqlSessionFactory 里面
		 * */
		try {
			// 此项目的 mybatis 配置文件在资源路径的根目录下  直接读取即可
			InputStream  in = Resources.getResourceAsStream("mybatis-config.xml");
			// 导入配置文件 生成了一个 sqlSessionFactory
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	// 设置单例
	private MyBatisUtil(){} 
	
	public static SqlSession getSqlsession(){
		
		return sqlSessionFactory.openSession();
	}
}
