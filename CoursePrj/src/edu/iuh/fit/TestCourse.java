/**
 * @description 
 * @author Bui Quang Thuan
 * @version 1.0
 * @created 2025-08-28
 */

package edu.iuh.fit;

public class TestCourse {
    public static void main(String[] args) {
        CourseList list = new CourseList(10);

        list.addCourse(new Course("J001", "Java", 3, "IT"));
        list.addCourse(new Course("P001", "Python", 4, "IT"));
        list.addCourse(new Course("E001", "English", 2, "Language"));
        list.addCourse(new Course("M001", "Math", 5, "Science"));

        System.out.println("Tìm theo ID J001:");
        System.out.println(list.searchCourseById("J001"));

        System.out.println("Môn có tín chỉ cao nhất:");
        for (Course c : list.findMaxCreditCourse()) {
            System.out.println(c);
        }

        System.out.println("Khoa nhiều môn học nhất:");
        System.out.println(list.findDepartmentWithMostCourses());

        System.out.println("Danh sách sau khi sắp xếp:");
        for (Course c : list.sortCourses()) {
            System.out.println(c);
        }
    }
}
