/**
 * 桥接模式的应用场景就是多种属性组合的情况下，采用组合替代继承关系，避免子类泛滥的问题，例如本例：
 * 如果采用继承的话，每增加一个品牌电脑，相关的子类就需要扩展三个子类，在品牌过多情况
 * 下，子类就很容易泛滥。但是采用组合关系，每增加一个品牌的电脑只需扩展一个品牌对应
 * 的子类。桥接模式也符合6大法则中的单一职责原则，即一个类只有一个引起它变化的原因，如果
 * 采用继承关系就可能是多个原因。
 */
package com.sxz.dp.bridge;

/**
 * @author shenxianzhong
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer c1  = new Desktop(new Apple());
		c1.sell();
		Computer c2  = new NoteBook(new Lenovo());
		c2.sell();
		Computer c3  = new Pad(new Dell());
		c3.sell();

	}

}
