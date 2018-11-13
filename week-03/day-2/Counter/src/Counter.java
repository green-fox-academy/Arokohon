public class Counter{
    int field;
    int start;
    public Counter (int field){
        this.field = field;
        this.start = field;
    }
    public Counter(){
        this(0);
    }
    public int add(int number){
        return this.field += number;
    }
    public int add(){
        return this.field++;
    }
    public int get (){
        return field;
    }
    public void reset () {
        this.field = this.start;
    }
}
