public class Eupho {
    private int id;
    private String name;

    public Eupho(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Eupho{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode()
    {
        final int ra=30;
        int result=1;
        result=ra*result+id;
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj==null)
        {
            return false;
        }
        if(obj==this)
        {
            return true;
        }
        if(getClass()!=obj.getClass())
        {
            return false;
        }

        Eupho e=(Eupho) obj;
        return (this.id==e.id);


    }
}

