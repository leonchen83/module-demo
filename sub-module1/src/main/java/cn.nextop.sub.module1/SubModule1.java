package cn.nextop.sub.module1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import cn.nextop.sub.module2.SubModule2;

/**
 * @author Baoyi Chen
 */
public class SubModule1 {
	
	public void method0() {
		try {
			Method m = SubModule2.class.getDeclaredMethod("method0");
			m.setAccessible(true);
			m.invoke(new SubModule2(), new Object[]{});
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	public void method1() {
		try {
			Method m = SubModule2.class.getDeclaredMethod("method1");
			m.setAccessible(true);
			m.invoke(new SubModule2(), new Object[]{});
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
