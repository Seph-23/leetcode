package breadthfirstsearch.leetcode207;

public class CourseSchedule {
    private static boolean[] canFinish;
    private static boolean[] courseVisited;

    //Unit test
    public static void main(String[] args) {
        int numCourses = 4;
        int[][] prerequisites = new int[4][2];
        prerequisites[0][0] = 1;
        prerequisites[0][1] = 0;
        prerequisites[1][0] = 2;
        prerequisites[1][1] = 1;
        prerequisites[2][0] = 3;
        prerequisites[2][1] = 2;
        prerequisites[3][0] = 1;
        prerequisites[3][1] = 3;
        System.out.println(canFinish(numCourses, prerequisites));
    }

    private static boolean canFinish(int numCourses, int[][] prerequisites) {
        //No courses, you can have degree ( I wish )
        if(numCourses <= 0)
            return true;

        canFinish = new boolean[numCourses];
        courseVisited = new boolean[numCourses];

        //Iterate through courses and check if there is a pre-requisite
        for(int c=0; c<numCourses; c++) {
            if(!canFinish[c]) {
                //Check for course pre-requisites
                if(!canFinishCourse(c, prerequisites))
                    return false;
            }
        }

        return true;
    }

    private static boolean canFinishCourse(int c, int[][] prerequisites) {
        if(canFinish[c])
            return true;

        if(courseVisited[c])
            return false;
        else
            courseVisited[c] = true;

        for(int row=0; row<prerequisites.length; row++) {
            //Check course of interest in ever row
            if(prerequisites[row][0] == c) {
                //If there is a pre-requisite, check those other courses
                for (int col=1; col<prerequisites[row].length; col++) {
                    if(!canFinishCourse(prerequisites[row][col], prerequisites)) {
                        canFinish[c] = false;
                        return canFinish[c];
                    }
                }
            }
        }

        canFinish[c] = true;
        return canFinish[c];
    }
}
