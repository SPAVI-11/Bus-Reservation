public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;
    Bus(int no,boolean b,int c){
        this.busNo=no;
        this.ac=b;
        this.capacity=c;
    }
    public int getBusNo(){
        return busNo;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int c){
        capacity=c;
    }
    public void setAc(boolean v){
        ac=v;
    }
    public boolean isAc(){
        return ac;
    }
    public void display(){
        System.out.println("Bus No: "+busNo+" Ac: "+ac+" Capacity: "+capacity);
    }
}
