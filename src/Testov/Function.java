package Testov;
/**
 * ������� �����
 */
public class Function {
	/**
	 * ��������� ��������� ������������� ������������� ������� ��� ����������
	 * ��������� ������ ����
	 */
	public static int calc_zakaz(int quantity, int price){
		/**
		 * �������� ���������� summ
		 */
		int summa = 0;
			/**
			 * ��������� �� �������
			 */
			summa = quantity * price;
		/**
		* ���������� ���������� summa
		*/	
		return summa;
	}
	/**
	 * ��������� ��������� ������������� ������������� ������� ��� ����������
	 * ����� ������������� �� ������
	 */
	public static int calc_debt(int quantity, int days, int price){
		/**
		 * ��������� ���������� debt, ������� ��������
		 * �� ����� ������������� �� ������
		 */
		/**
		 * �������� ����������
		 */
		int debt = 0;
		/**
		 * ��������� �� �������
		 */
		debt = quantity * days * price;
		/**
		 * ���������� ���������� debt
		 */
		return debt;
	}
}