package rplib.General;

public enum Size {
    SMALL   ("Small"),
    MEDIUM  ("Medium"),
    LARGE   ("Large"),
    HUGE    ("Huge");

    private String size;

    Size(String size){
        this.size = size;
    }

    public String val(){ return this.size; }

}
