/**
 * Copyright 2017 Azuki Framework.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.azkfw.workflow.interfaces.workflow.web;

/**
 * @author kawakicchi
 */
public class WorkflowDto {

	private Long workflowSeq;

	private String title;

	/**
	 * workflowSeq を取得する。
	 * 
	 * @return workflowSeq
	 */
	public Long getWorkflowSeq() {
		return workflowSeq;
	}

	/**
	 * workflowSeq を設定する。
	 * 
	 * @param workflowSeq workflowSeq
	 */
	public void setWorkflowSeq(Long workflowSeq) {
		this.workflowSeq = workflowSeq;
	}

	/**
	 * title を取得する。
	 * 
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * title を設定する。
	 * 
	 * @param title title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

}
