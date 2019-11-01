package status;

public enum Calculator {

	CALC_A {
		long calculate(long value) {
			return value;
		}
	},
	CALC_B {
		long calculate(long value) {
			return value*10;
		}
	},
	CALC_C {
		long calculate(long value) {
			return value*3;
		}
	},
	CALC_ETC {
		long calculate(long value) {
			return 0L;
		}
	};
	
	 abstract long calculate(long value);
}
