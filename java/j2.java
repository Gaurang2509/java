 class j1{
    int rollno;
    String name;

    void insert(int r,String n){
        rollno=r;
        name=n;
    }
    void display(){
        System.out.println(rollno+"  "+name);
    }
}

public class j2 {
    public static void main(String[] args) {
        j1 myobj =new j1();
        // System.out.print("Class J2 :"+myobj.x);
        myobj.insert(111,"sandip");
        myobj.display();
    }
}
