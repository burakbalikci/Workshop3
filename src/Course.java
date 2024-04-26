public class Course {
    private int id;
    private int instructorId;
    private int categoryId;
    private String name;
    private double cahrge;


    public Course(int id, int instructorId,int categoryId,String name,double cahrge){
        this.cahrge=cahrge;
        this.categoryId=categoryId;
        this.id=id;
        this.name=name;
        this.instructorId=instructorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCahrge() {
        return cahrge;
    }

    public void setCahrge(double cahrge) {
        this.cahrge = cahrge;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }
}
