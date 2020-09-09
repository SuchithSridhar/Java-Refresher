class MainClass {
    public static void main(String[] args){
        System.out.println("This is keywords file");
        Loops loop = new Loops();
        loop.loopsDemo();
    }
}

class Loops{
    void loopsDemo(){
        int[] array = {1,2,3,4,5};

        for(int i=1; i<=12; i++){}
        for(int item: array){System.out.println(item);}
        while(true){break;}
        do{break;}while(true);

        if(false){}else if(true){} else {}
    }
}