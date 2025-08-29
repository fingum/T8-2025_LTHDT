/**
 * @description v.
 * @author Bui Quang Thuan
 * @version 1.0
 * @created 2025-08-28
 */

package edu.iuh.fit;

public class Course {
    private String id;
    private String name;
    private int credit;
    private String department;

    public Course(String id, String name, int credit, String department) {
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.department = department;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getCredit() { return credit; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return id + " - " + name + " - " + credit + " tín chỉ - " + department;
    }
}
