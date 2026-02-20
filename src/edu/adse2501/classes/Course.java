package edu.adse2501.classes;

/**
 * Class to represent a course offered at EICN.
 * 
 * <p>
 * A course contains basic information such as 
 * <ul>
 *  <li>Course Code</li>
 *  <li>Course Name</li>
 *  <li>Course Fee (in Kes.)</li>
 *  <li>Course Duration (in months)</li>
 * </ul>
 * </p>
 * @author a.nyanjui
 */
public class Course
{
    /**
     * A string uniquely identifying each course.
     */
    private String courseCode;
    /**
     * A string describing the name/title of the course
     */
    private String courseName;
    /**
     * A float representing the course fee in Kenya Shillings (Kes.)
     */
    private float fee;
    /** 
     * An integer measuring the duration of the course in months
     */
    private int duration;

    /**
     * Default constructor that creates an empty course object.
     * All fields remain uninitialised (null or default primitive values).
     */
    public Course()
    {
    }

    /**
     * Creates a new course with the specified details.
     * 
     * @param courseCode The unique identifier/code for the course (e.g. 'ACCP')
     * @param courseName The full name/title of the course
     * @param fee The course fee in Kes.
     * @param duration The length of the course in months
     */
    public Course(String courseCode, String courseName, float fee, int duration)
    {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.fee = fee;
        this.duration = duration;
    }

    /**
     * Retrieves/fetches the name of the course
     * 
     * @return the unique course identifier
     */
    public String getCourseCode()
    {
        return courseCode;
    }

    /** 
     * Assigns/sets the course code
     * 
     * @param courseCode A unique string identifying the course
     */
    public void setCourseCode(String courseCode)
    {
        this.courseCode = courseCode;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public float getFee()
    {
        return fee;
    }

    public void setFee(float fee)
    {
        this.fee = fee;
    }

    public int getDuration()
    {
        return duration;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    /**
     * Returns a formatted string representation of the course. 
     * <p>The output includes a line seperator and 
     *  <ul>
     *   <li>Course Code</li>
     *   <li>Course Name</li>
     *   <li>Course Fee (formatted to 2 decimal places)</li>
     *   <li>Course Duration</li>
     *  </ul>
     * </p>
     * 
     * @return a formatted multi-line string containing the course details.
     */
    @Override
    public String toString()
    {
        return String.format("""
                             --------------------------------------------------
                             Course Code: %s
                             Course Name: %s
                             Course Fee: Kes. %.2f
                             Course Duration: %d months.
                             --------------------------------------------------
                             """
                , getCourseCode(), getCourseName(),getFee(),getDuration());
    }
    
    
}
