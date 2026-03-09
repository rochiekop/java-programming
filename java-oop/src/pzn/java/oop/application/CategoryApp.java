package pzn.java.oop.application;

import pzn.java.oop.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        Category category = new Category();
        category.getId();

        category.setExpensive(true);
        category.setId("10ds");
        category.setId(null);
        System.out.println(category.getId());
        System.out.println(category.isExpensive());
    }
}
