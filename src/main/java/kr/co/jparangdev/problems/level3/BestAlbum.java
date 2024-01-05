package kr.co.jparangdev.problems.level3;

import java.util.*;
import java.util.stream.Collectors;

public class BestAlbum {
	public static final Comparator<Music> MUSIC_COMPARATOR = Comparator
		.comparing(Music::getPlays).reversed()
		.thenComparingInt(Music::getNum);

	public static final Comparator<MusicCollection> MUSIC_COLLECTION_COMPARATOR = Comparator
		.comparing(MusicCollection::getSum).reversed();

	public int[] solution(String[] genres, int[] plays) {
		return getAnswer(genres, plays);
	}

	public int[] getAnswer(String[] genres, int[] plays) {
		Map<String, MusicCollection> map = new HashMap<>();
		for (int i = 0; i < genres.length; i++) {
			MusicCollection col = map.getOrDefault(genres[i], new MusicCollection());
			col.addSum(plays[i]);
			col.getList().add(new Music(i, plays[i]));
			map.put(genres[i], col);
		}

		return map.entrySet().stream()
			.sorted(Map.Entry.comparingByValue(MUSIC_COLLECTION_COMPARATOR))
			.map(e -> (e.getValue().sortAndCut()))
			.flatMap(List::stream)
			.mapToInt(i -> i)
			.toArray();
	}

	public static class MusicCollection {
		private final List<Music> list;
		private double sum;

		public MusicCollection() {
			this.list = new ArrayList<>();
			this.sum = 0d;
		}

		public List<Integer> sortAndCut() {
			if (list.isEmpty()) {
				return new ArrayList<>();
			}
			if (list.size() == 1) {
				return List.of(list.get(0).getNum());
			}
			return list.stream()
				.sorted(MUSIC_COMPARATOR)
				.mapToInt(Music::getNum)
				.boxed()
				.collect(Collectors.toList())
				.subList(0, 2);
		}

		public List<Music> getList() {
			return list;
		}

		public double getSum() {
			return sum;
		}

		public void addSum(int count) {
			this.sum += count;
		}
	}

	public static class Music {
		private int num;
		private int plays;

		public Music(int num, int plays) {
			this.num = num;
			this.plays = plays;
		}

		public int getNum() {
			return num;
		}

		public int getPlays() {
			return plays;
		}
	}
}
