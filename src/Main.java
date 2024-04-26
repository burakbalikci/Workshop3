import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Category operations
        CategoryManager categoryManager = new CategoryManager();
        CourseManager courseManager = new CourseManager();
        InstructorManager instructorManager = new InstructorManager();

        List<Course> courses = courseManager.getAll();
        List<Category> categories = categoryManager.getAll();
        List<Instructor> instructors = instructorManager.getAll();


        System.out.println("All Categories:");
        for (Category category : categories) {
            System.out.println("ID: " + category.getId() + ", Name: " + category.getName());


            // Delete a category
            categoryManager.delete(3);
            System.out.println("\nCategory Deleted:");
            System.out.println("--------------------------------------");
            System.out.println("All Categories:");
            for (Category category : categories) {
                System.out.println("ID: " + category.getId() + ", Name: " + category.getName());
            }

        }