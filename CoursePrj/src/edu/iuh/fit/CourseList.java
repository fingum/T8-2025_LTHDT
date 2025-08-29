/**
 * @description v
 * @author Bui Quang Thuan
 * @version 1.0
 * @created 2025-08-28
 */

package edu.iuh.fit;
import java.util.*;
public class CourseList {
    private int count = 0;
    private Course[] courses;

    public CourseList(int size) {
        courses = new Course[size];
    }

    public boolean exists(Course c) {
        for (int i = 0; i < count; i++) {
            if (courses[i].getId().equalsIgnoreCase(c.getId())) {
                return true;
            }
        }
        return false;
    }

    public boolean addCourse(Course c) {
        if (count >= courses.length || exists(c)) {
            return false;
        }
        courses[count++] = c;
        return true;
    }

    public boolean removeCourse(String id) {
        for (int i = 0; i < count; i++) {
            if (courses[i].getId().equalsIgnoreCase(id)) {
                for (int j = i; j < count - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                courses[--count] = null;
                return true;
            }
        }
        return false;
    }

    public Course searchCourseById(String id) {
        for (int i = 0; i < count; i++) {
            if (courses[i].getId().equalsIgnoreCase(id)) {
                return courses[i];
            }
        }
        return null;
    }

    public Course[] searchCourse(String name) {
        List<Course> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (courses[i].getName().equalsIgnoreCase(name)) {
                result.add(courses[i]);
            }
        }
        return result.toArray(new Course[0]);
    }

    public Course[] searchCourseByDepartment(String dep) {
        List<Course> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (courses[i].getDepartment().equalsIgnoreCase(dep)) {
                result.add(courses[i]);
            }
        }
        return result.toArray(new Course[0]);
    }

    public String findDepartmentWithMostCourses() {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < count; i++) {
            map.put(courses[i].getDepartment(),
                    map.getOrDefault(courses[i].getDepartment(), 0) + 1);
        }
        String maxDep = null;
        int max = 0;
        for (String dep : map.keySet()) {
            if (map.get(dep) > max) {
                max = map.get(dep);
                maxDep = dep;
            }
        }
        return maxDep;
    }

    public Course[] findMaxCreditCourse() {
        int max = 0;
        for (int i = 0; i < count; i++) {
            if (courses[i].getCredit() > max) {
                max = courses[i].getCredit();
            }
        }
        List<Course> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (courses[i].getCredit() == max) {
                result.add(courses[i]);
            }
        }
        return result.toArray(new Course[0]);
    }

    public Course[] sortCourses() {
        Arrays.sort(courses, 0, count, (a, b) -> a.getId().compareToIgnoreCase(b.getId()));
        return Arrays.copyOf(courses, count);
    }

    public Course[] getCourses() {
        return Arrays.copyOf(courses, count);
    }
}