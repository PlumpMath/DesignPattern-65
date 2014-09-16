package decorator.java;
/**
 *
 * @author Kaori
 * 一行の文字列を表示するクラス
 * Displayクラスのサブクラス→Displayクラスの抽象メソッドを実装する責任がある
 *
 */
public class StringDisplay extends Display {

	private String str;                       // 表示文字列

	public StringDisplay (String str) {       // 引数で表示文字列を指定
		this.str = str;
	}

	@Override
	public int getColumns() {                 // 文字数
		return str.getBytes().length;
	}

	@Override
	public int getRows() {                    // 行数は１
		return 1;
	}

	@Override
	public String getRowText(int row) {       // rowが0のときのみ返す
		if (row == 0) {
			return str;
		}else{
			return null;
		}
	}

}
