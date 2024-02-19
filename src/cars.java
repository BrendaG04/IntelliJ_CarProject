public class cars {
    protected String sportscars;
    protected String trucks;
    protected String convertibles;
    protected String minivans;


//DEFAULT CONSTRUCTORS
    public cars (){
        this.sportscars="Lamborghini ";
        this.trucks="Isuzu D-max ";
        this.convertibles="Mustang";
        this.minivans="Honda Odyssey ";
    }

//PARAMETRIC CONSTRUCTOR
    public cars(String _sportscars,String _trucks, String _convertibles, String _minivans){
        this.sportscars=_sportscars;
        this.trucks=_trucks;
        this.convertibles=_convertibles;
        this.minivans=_minivans;
    }

//COPY CONSTRUCTOR
    public cars(cars C){
        this.sportscars=C.sportscars;
        this.trucks=C.trucks;
        this.convertibles=C.convertibles;
        this.minivans=C.minivans;
    }

//PrintMe Method
    public  void printMe(){
        System.out.println("\nA sports: "+ sportscars);
        System.out.println("A truck: "+ trucks);
        System.out.println("A convertible: "+ convertibles);
        System.out.println("A minivan: "+ minivans);
    }
}
