package decorator.java;

/**
 *
 * @author Kaori
 * Borderクラスのサブクラス
 * 上下左右に飾りをつける
 * 飾り文字は固定
 *
 */
public class FullBorder extends Border{

	protected FullBorder(Display display) {
		super(display);
	}

	@Override
	public int getColumns() {                        // 文字数は中身の両側に飾り文字分を足したもの
		return 1 + display.getColumns() + 1;
	}

	@Override
	public int getRows() {                           // 行数は中身の行数に上下の飾りも自分を加えたもの
		return 1 + display.getRows() + 1;
	}

	@Override
	public String getRowText(int row) {              // 指定した行の内容
		if (row == 0) {                                                     // 枠の上端
			return "+" + makeLine('-', display.getColumns()) + "+";
		} else if (row == display.getRows() + 1) {                          // 枠の下端
			return "+" + makeLine('-', display.getColumns()) + "+";
		} else {                                                            // それ以外
			return "|" + display.getRowText(row - 1) + "|";
		}
	}
	private String makeLine (char ch, int count) {   // 文字chをcount個連結させた文字列を作る
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < count; i++) {
			sb.append(ch);
		}
		return sb.toString();
	}
}
