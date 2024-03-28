package ex12;

class Box<T> { // T 지네릭 타입 를 선언
	T item;

	void setItem(T item) {
		this.item = item;
	}

	T getItem() {
		return item;
	}
}
