package org.meicode.helloworld.services;

public class math {
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int sum(String val) throws  NumberFormatException{
        String i = Inputs.Str(val);
        int res = Integer.parseInt(i);
        total+=res;
        return  res;
    }

    ;
}
