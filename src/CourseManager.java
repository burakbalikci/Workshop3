import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CourseManager {
    private final List<Course> courses;

    public CourseManager() {
        courses = new ArrayList<>();
        courses.add(new Course(1, 1,101, "Java Programming", 750));
        courses.add(new Course(2, 2, 102, "Angular", 800));
    }

    public List<Course> getAll() {
        return courses;
    }

    public Course getById(int id) {
        for (Course course : courses) {
            if (course.getId() == id) {
                return course;
            }
        }
        return null;
    }

    public void add(Course course) {
        courses.add(course);
    }

    public void update(Course course) {
        for (Course updateCourse : courses) {
            if (updateCourse.getId() == course.getId()) {
                updateCourse.setName(course.getName());
                updateCourse.setCategoryId(course.getCategoryId());
                updateCourse.setInstructorId(course.getInstructorId());
            }
        }
    }

    public void delete(int id) {
        Iterator<Course> iterator = courses.iterator();
        while (iterator.hasNext()) {
            Course course = iterator.next();
            if (course.getId() == id) {
                iterator.remove();
            }
        }
    }
}