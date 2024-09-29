package javaTestCases;

public interface SolutionToProblem<CaseType, ResultType> {
   ResultType solution(CaseType test);
}
