package com.mphasis.garbages;
class MyClass {
    private String name;

    public MyClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyClass{name='" + name + "'}";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing: " + name);
        super.finalize();
    }
}