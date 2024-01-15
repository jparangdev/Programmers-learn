package kr.co.jparangdev.problems.level2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// Description: This class contains unit tests for the DiskController class,
// specifically the solution method which calculates the total average waiting time.

class DiskControllerTest {
	DiskController diskController = new DiskController();

	// Description: Tests a single job with no wait time, i.e., job start time is zero.
	@Test
	void singleJobNoWaitTest() {
		int[][] input = {{0, 1}};
		int expected = 1; // Total time taken to execute the job = end time(1) - job arrival time(0)
		assertEquals(expected, diskController.solution(input), "Single job with no wait time");
	}

	// Description: Tests multiple jobs arriving at different times.
	@Test
	void multiJobDifferentStartTest() {
		int[][] input = {{0, 3}, {1, 9}, {2, 6}};
		int expected = 9;  // Total time taken to execute all jobs/jobs count
		assertEquals(expected, diskController.solution(input), "Multiple jobs with different start times");
	}
}
