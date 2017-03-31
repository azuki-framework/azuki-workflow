package org.azkfw.workflow.domain.model.workflow;

/**
 * ワークフロー
 * 
 * @author kawakicchi
 */
public class Workflow {

	/**
	 * ドキュメントを取得する。
	 * 
	 * @return ドキュメント
	 */
	public Document getDocument() {
		// TODO: ここに処理を実装
		throw new UnsupportedOperationException();
	}

	/**
	 * 申請
	 * <p>
	 * ワークフローインスタンスを開始する。
	 * </p>
	 */
	public void application() {
		// TODO: ここに処理を実装
		throw new UnsupportedOperationException();
	}

	/**
	 * 承認
	 * <p>
	 * 承認待ち状態のワークフローを承認し、決裁ルートの次のステップに進める。
	 * </p>
	 */
	public void approval() {
		// TODO: ここに処理を実装
		throw new UnsupportedOperationException();
	}

	/**
	 * 決裁
	 * <p>
	 * 決裁ルートの最終ステップを承認する。
	 * </p>
	 */
	public void decision() {
		// TODO: ここに処理を実装
		throw new UnsupportedOperationException();
	}

	/**
	 * 差し戻し
	 * <p>
	 * 承認待ち状態のワークフローを却下し、決裁ルートの前のステップに戻す。戻す先は、申請者であっても承認者であってもよい。
	 * </p>
	 */
	public void remand() {
		// TODO: ここに処理を実装
		throw new UnsupportedOperationException();
	}

	/**
	 * 差し戻された者（被差し戻し者）が、再申請または再承認することによりワークフローを再開する。
	 */
	public void 被差し戻し者から再開する() {
		// TODO: ここに処理を実装
		throw new UnsupportedOperationException();
	}

	/**
	 * 被差し戻し者が、再申請または再承認した後、ワークフローは差し戻し者まで自動的に移動する。その後、差し戻し者が承認することによりワークフローを再開する。
	 */
	public void 差し戻し者から再開する() {
		// TODO: ここに処理を実装
		throw new UnsupportedOperationException();
	}

	/**
	 * 現在承認待ちの承認者が承認を行うのでなく、先のステップに存在する承認者が承認を行う。この場合、承認待ちの承認者は順番を抜かされた状態になる。
	 */
	public void 引き上げ承認() {
		// TODO: ここに処理を実装
		throw new UnsupportedOperationException();
	}

	/**
	 * 既に承認済みの承認者が、先のステップに進んだワークフローを自分のステップに戻す。その後、再承認してワークフローを再開する。
	 */
	public void 承認の取り消し() {
		// TODO: ここに処理を実装
		throw new UnsupportedOperationException();
	}

	/**
	 * 申請者が、先のステップに進んだワークフローを自分のステップに戻す。その後、再申請してワークフローを再開する。
	 */
	public void 申請の取り消し() {
		// TODO: ここに処理を実装
		throw new UnsupportedOperationException();
	}

	/**
	 * キャンセル
	 * <p>
	 * ワークフローインスタンスを非アクティブ状態にする。
	 * </p>
	 */
	public void cancel() {
		// TODO: ここに処理を実装
		throw new UnsupportedOperationException();
	}

	/**
	 * 承認履歴
	 * <p>
	 * 指定したワークフローの承認履歴を取得する。
	 * </p>
	 */
	public void ApprovalHistory() {
		// TODO: ここに処理を実装
		throw new UnsupportedOperationException();
	}

	/**
	 * ユーザリスト
	 * <p>
	 * 指定したワークフローの決裁ルートに存在するユーザの一覧を取得する。
	 * </p>
	 */
	public void UserList() {
		// TODO: ここに処理を実装
		throw new UnsupportedOperationException();
	}
}
