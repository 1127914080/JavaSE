package demo;

import java.util.ArrayList;

import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<City> list = new ArrayList<>();

		list.add(new City("������", "������"));
		list.add(new City("������", "ͨ����"));
		list.add(new City("������", "������"));
		list.add(new City("������", "������"));
		list.add(new City("������", "������"));
		list.add(new City("������", "��̨��"));
		list.add(new City("������", "��ɽ��"));
		list.add(new City("������", "������"));
		list.add(new City("������", "������"));
		list.add(new City("������", "��ƽ��"));
		list.add(new City("������", "������"));
		list.add(new City("������", "��ͷ����"));
		
		for (City city : list) {
			System.out.println(city);
		}

	}
}
