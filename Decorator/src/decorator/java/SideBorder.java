package decorator.java;

/**
 *
 * @author Kaori
 * 具体的な飾り枠の一種
 * Borderクラスのサブクラス
 * 文字列の左右に決まった文字（bordrChar）で飾りをつけるもの
 *
 */
public class SideBorder extends Border {

	private char borderChar;                                // 飾りとなる文字

	protected SideBorder(Display display, char ch) {        // コンストラクタでDisplayと飾り文字を指定
		super(display);
		this.borderChar = ch;
	}

	@Override
	public int getColumns() {                              // 文字数は中身の両側に飾り文字分を加えたもの
		return 1 + display.getColumns() + 1;
	}

	@Override
	public int getRows() {                                 // 行数は中身の行数に同じ
		return display.getRows();
	}

	@Override
	public String getRowText(int row) {                    // 指定行の内容は、中身の指定行の両側に飾り文字をつけたもの
		return borderChar + display.getRowText(row) + borderChar;
	}

}
