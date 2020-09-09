package demo;

import java.util.ArrayList;

import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<City> list = new ArrayList<>();

		list.add(new City("北京市", "朝阳区"));
		list.add(new City("北京市", "通州区"));
		list.add(new City("北京市", "东城区"));
		list.add(new City("北京市", "西城区"));
		list.add(new City("北京市", "海淀区"));
		list.add(new City("北京市", "丰台区"));
		list.add(new City("北京市", "房山区"));
		list.add(new City("北京市", "怀柔区"));
		list.add(new City("北京市", "延庆区"));
		list.add(new City("北京市", "昌平区"));
		list.add(new City("北京市", "大兴区"));
		list.add(new City("北京市", "门头沟区"));
		
		for (City city : list) {
			System.out.println(city);
		}

	}
}
