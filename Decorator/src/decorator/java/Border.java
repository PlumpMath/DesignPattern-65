package decorator.java;

/**
 *
 * @author Kaori
 * 飾り枠をあらわ抽象クラス
 * 飾り枠を表すクラスだが、文字列表示を行うDisplayクラスのサブクラスとして定義されている
 * すなわち、継承によって、飾り枠は中身と同じメソッドを持つ
 *
 */
public abstract class Border extends Display {
	protected Display display;                   // この飾り枠がくるんでいる「中身」を指す
	protected Border (Display display) {         // インスタンス生成時に「中身」を引数で指定
		this.display = display;
	}
}
