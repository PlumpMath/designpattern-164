/**
 *   模板方法模式在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。模板方法使得
 * 子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤。
 *   当我们在写模板方法的时候，心里随时要记住这一点-保持抽象方法的数量约少约好。想要
 *   做到这一点，可以让算法内的步骤不要切割的太细，但是如果步骤太少的话，会比较没有弹性，
 *   所以要看情况折中。也请记住，某些步骤是可选的，所以你可以将这些步骤实现成钩子，而不是
 *   实现成抽象方法，这样就可以让抽象类的子类的负荷减少。
 */
package com.sxz.dp.template;

/**
 * @author shenxianzhong
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tea tea = new Tea();
		tea.prepareRecipe();
		Coffee coffee =  new Coffee();
		coffee.prepareRecipe();

	}

}
