public class No {

    private Object object;
    private No refNo;


    public No(){
    }


    public No (Object object){
        this.refNo = null;
        this.object=object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public private getNo() {
        return No;
    }

    public void setNo(private no) {
        No = no;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
