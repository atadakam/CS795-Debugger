package com.swe795.tracker;

public class HistoryVariable {
	private Object value;

	public HistoryVariable(Object v) {
		value = v;
	}

	public void update(Object v) {
		value = v;
	}

	public Object undo() {
		return value;
	}

	@Override
	public String toString() {
		return value.toString();
	}

	public void dispose() {
	}
}
