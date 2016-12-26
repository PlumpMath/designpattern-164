/**
 * 创建实现 Packing 接口的实体类。
 */
package com.sxz.dp.builder;

/**
 * @author BG243085
 *
 */
public class Wrapper implements Packing {

	/* (non-Javadoc)
	 * @see com.sxz.dp.builder.Packing#pack()
	 */
	@Override
	public String pack() {
		return "Wrapper";
	}

}
