package kr.co.jparangdev.problems.level3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class BestAlbumTest {

	@Test
	void testSolution() {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		BestAlbum album = new BestAlbum();

		int[] result = album.solution(genres, plays);

		assertArrayEquals(new int[] {4, 1, 3, 0}, result);
	}

	@Test
	void testSolution2() {
		String[] genres = {"classic", "classic", "classic", "classic", "classic"};
		int[] plays = {500, 600, 150, 800, 2500};
		BestAlbum album = new BestAlbum();

		int[] result = album.solution(genres, plays);

		assertArrayEquals(new int[] {4, 3}, result);
	}

	@Test
	void testSolution3() {
		String[] genres = {"classic", "jazz"};
		int[] plays = {500, 600};
		BestAlbum album = new BestAlbum();

		int[] result = album.solution(genres, plays);

		assertArrayEquals(new int[] {1, 0}, result);
	}
}
