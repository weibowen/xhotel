package com.hotel.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;

/**
 * @desc: 反射工具
 * 
 * @createTime: 2015-6-26 下午04:30:42
 * @version: v2.0
 * @param <T>
 * @param <D>
 */
public abstract class MyBeanUtils {

	public static Object copyProperties(Object source, Object target) {
		BeanUtils.copyProperties(source, target);
		return target;

	}

	public static Object copyProperties4Obj(Object source, Class<?> voName){
		Object target = null;
		try {
			target = voName.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BeanUtils.copyProperties(source, target);
		return target;

	}

	// 拷贝并返回简单VO
	public static Object copyProperties(Object source, Class<?> voName)
			throws BeansException, InstantiationException,
			IllegalAccessException {
		Object target = voName.newInstance();
		BeanUtils.copyProperties(source, target);
		return target;
	}

	// 拷贝并返回简单VO
	public static boolean isEmpty(List<?> listName) {
		if (null != listName && 0 < listName.size()) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * list类型bean拷贝
	 * 
	 * @param <S>
	 * @param <D>
	 * @return
	 */
	public static <S, D> List<D> copyPropertys(List<S> source, Class<D> target) {
		if (source == null || target == null) {
			return null;
		}
		List<D> ds = new ArrayList<>();
		for (S s : source) {
			D object = null;
			try {
				object = target.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			BeanUtils.copyProperties(s, object);
			ds.add(object);
		}
		return ds;

	}

}