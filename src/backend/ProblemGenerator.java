package backend;

import java.util.ArrayList;

/**
 * A class to generate math problems. Currently just for addition, as the difficulty rankings for the other operations aren't developed yet.
 * Some refactoring may be necessary to make room for the remaining operations, but should be minimal.
 */
public class ProblemGenerator  {

    /**
     * Generates random math problems. 25% from each difficulty
     * @param totalProblems - Total number of problems to generate
     * @return - an ArrayList of all the MathProblems generated
     */
    public static ArrayList<MathProblem> generateProblems(int totalProblems){
        int count = totalProblems/4;
        return generateProblems(count, count, count, count);
    }

    /**
     * Generates an ArrayList of MathProblems with the specified count of each.
     * @param levelOne - Number of level one problems
     * @param levelTwo - Number of level two problems
     * @param levelThree - Number of level three problems
     * @param levelFour - Number of level four problems
     * @return an ArrayList containing the MathProblems in order of difficulty. 
     */
    public static ArrayList<MathProblem> generateProblems(int levelOne, int levelTwo, int levelThree, int levelFour){
        ArrayList<MathProblem> problems = new ArrayList<>();
        for(int i = 0; i < levelOne; i++) {
            problems.add(getLevelOneAddition());
        }
        for(int i = 0; i < levelTwo; i++) {
            problems.add(getLevelTwoAddition());
        }
        for(int i = 0; i < levelThree; i++) {
            problems.add(getLevelThreeAddition());
        }
        for(int i = 0; i < levelFour; i++) {
            problems.add(getLevelFourAddition());
        }
        return problems;
    }

    /**
     * Generates an ArrayList of MathProblems with the specified count of each.
     * @param totalCount - the total number of problems desired. if the percentages don't add up to 1, then the amount returned will be missing some or have extra. 
     * @param levelOne - % of level one problems
     * @param levelTwo - % of level two problems
     * @param levelThree - % of level three problems
     * @param levelFour - % of level four problems
     * @return an ArrayList containing the MathProblems in order of difficulty. 
     */
    public static ArrayList<MathProblem> generateProblems(int totalCount, double levelOne, double levelTwo, double levelThree, double levelFour){
        return generateProblems((int)levelOne*totalCount, (int)levelTwo*totalCount, (int)levelThree*totalCount, (int)levelFour*totalCount);
    }

    /**
     * A method to generate an addition problem with a level one complexity.
     * @return a MathProblem that is level one addition.
     */
    private static MathProblem getLevelOneAddition() {
        return new MathProblem(1, 2, '*');
    }

    /**
     * A method to generate an addition problem with a level two complexity.
     * @return a MathProblem that is level two addition.
     */
    private static MathProblem getLevelTwoAddition() {
        return new MathProblem(1, 2, '*');
    }

    /**
     * A method to generate an addition problem with a level three complexity.
     * @return a MathProblem that is level three addition.
     */
    private static MathProblem getLevelThreeAddition() {
        return new MathProblem(1, 2, '*');
    }

    /**
     * A method to generate an addition problem with a level four complexity.
     * @return a MathProblem that is level four addition.
     */
    private static MathProblem getLevelFourAddition() {
        return new MathProblem(1, 2, '*');
    }
}
