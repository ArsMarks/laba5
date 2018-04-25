package Testov;
/**
 * —оздаем класс
 */
public class Function {
	/**
	 * объ€вл€ем статичную общедоступную целочисленную функцию дл€ вычислени€
	 * стоимости заказа книг
	 */
	public static int calc_zakaz(int quantity, int price){
		/**
		 * обнул€ем переменную summ
		 */
		int summa = 0;
			/**
			 * вычисл€ем по формуле
			 */
			summa = quantity * price;
		/**
		* возвращаем переменную summa
		*/	
		return summa;
	}
	/**
	 * объ€вл€ем статичную общедоступную целочисленную функцию дл€ вычислени€
	 * суммы задолженности по книгам
	 */
	public static int calc_debt(int quantity, int days, int price){
		/**
		 * вычисл€ем переменную debt, котора€ отвечает
		 * за сумму задолженности по книгам
		 */
		/**
		 * обнул€ем переменную
		 */
		int debt = 0;
		/**
		 * вычисл€ем по формуле
		 */
		debt = quantity * days * price;
		/**
		 * возвращаем переменную debt
		 */
		return debt;
	}
}