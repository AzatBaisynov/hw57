public class Threads implements Runnable{
    static private Integer num = 5;
    private int choice;

    public Threads(int choice) {
        this.choice = choice;
    }

    @Override
    public void run() {
        switch (choice){
            case 1 : multiply(); break;
            case 2 : divide(); break;
            case 3 : plusTwo(); break;
            case 4 : minusTwo(); break;
        }
    }

    public void multiply(){
        this.num = this.num * 2;
        System.out.println(num);
    }
    public void divide(){
        this.num = this.num / 2;
        System.out.println(num);
    }
    public void plusTwo(){
        this.num = this.num + 2;
        System.out.println(num);
    }
    public void minusTwo(){
        this.num = this.num - 2;
        System.out.println(num);
    }
}
