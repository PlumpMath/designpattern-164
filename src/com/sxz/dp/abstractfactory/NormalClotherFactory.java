package com.sxz.dp.abstractfactory;

public class NormalClotherFactory extends AbstractClotherFactory {
	IBrand brand;
	IButton button;
	IMaterial material;
	@Override
	public void produceClother() {
		brand= new NormalBrand();
		brand.produceBrand();
		button=new NormalButton();
		button.produceButton();
		material=new NormalMaterial();
		material.produceMaterial();
	}

}
