package com.example.test.function1;

import java.util.function.Supplier;

/**
 * @author caowq
 * @date 2021-08-24 16:27
 */
public class SupplierTest {

    public static void main(String[] args) {
        Supplier<String> supplier = String::new;
        System.out.println(supplier.get());//""
        Supplier<Emp> supplierEmp = Emp::new;
        Emp emp = supplierEmp.get();
        emp.setName("dd");
        System.out.println(emp.getName());//dd
    }

    public static class Emp {
        private String name;

        public Emp() {

        }

        public Emp(String name) {
            super();
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

}

