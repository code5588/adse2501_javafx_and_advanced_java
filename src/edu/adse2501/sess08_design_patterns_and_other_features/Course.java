package edu.adse2501.sess08_design_patterns_and_other_features;

/**
 * Java class that will be used to represent a course object.
 * 
 * @author a.nyanjui
 */
public class Course
{
    private String title;
    private int score;
    private long courseCode;

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public long getCourseCode()
    {
        return courseCode;
    }

    public void setCourseCode(long courseCode)
    {
        this.courseCode = courseCode;
    }
}
