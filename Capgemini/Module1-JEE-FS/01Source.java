class Source {
	public static int sum(ArrayList<Integer> numbers) {
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		return sum;
	}

	public static ArrayList<Integer> splitAndReverse(ArrayList<Integer> list) {
		int size = list.size();
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		if (size % 2 == 0) {
			for (int i = 0; i < size / 2; i++) {
				a.add(list.get(i));
			}
			for (int i = size / 2; i < size; i++) {
				b.add(list.get(i));
			}
		} else {
			for (int i = 0; i < size / 2 + 1; i++) {
				a.add(list.get(i));
			}
			for (int i = size / 2 + 1; i < size; i++) {
				b.add(list.get(i));
			}
		}

		Collections.reverse(a);
		Collections.reverse(b);

		res.addAll(a);
		res.addAll(b);
		return res;

	}

	public Integer getItemAtIndex(ArrayList<Integer> list, int index) {
		if(index>list.size()){
			return null;
		}
		return list.get(index);

	}
}
