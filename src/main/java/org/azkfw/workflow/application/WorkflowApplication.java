package org.azkfw.workflow.application;

import java.util.List;

import org.azkfw.workflow.domain.model.workflow.Account;
import org.azkfw.workflow.domain.model.workflow.Workflow;

/**
 * @author kawakicchi
 */
public class WorkflowApplication {

	/**
	 * 承認待ち一覧
	 * <p>
	 * 指定したユーザが承認待ち状態のワークフローの一覧を取得する。この一覧は差し戻し可能一覧を同じである。
	 * </p>
	 * 
	 * @return
	 */
	public List<Workflow> getDocumentWaitingForApproval(Account account) {
		// TODO
		return null;
	}

	/**
	 * 引き上げ承認可能一覧
	 * <p>
	 * 指定したユーザが引き上げ承認可能なワークフローの一覧を取得する。
	 * </p>
	 * 
	 * @return
	 */
	public List<Workflow> getDocumentRaisingApprovalPossible(Account account) {
		// TODO
		return null;
	}

	/**
	 * 取り消し可能一覧
	 * <p>
	 * 指定したユーザが取り消し処理可能なワークフローの一覧を取得する。
	 * </p>
	 * 
	 * @return
	 */
	public List<Workflow> getDocumentRevocable(Account account) {
		// TODO
		return null;
	}

	/**
	 * 再申請一覧
	 * <p>
	 * 指定したユーザが再申請可能なワークフローの一覧を取得する。
	 * </p>
	 * 
	 * @return
	 */
	public List<Workflow> getDocumentReapplication(Account account) {
		// TODO
		return null;
	}

}
