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

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author kawakicchi
 */
@Controller
@RequestMapping("/workflow")
public class WorkflowWebController {

	@RequestMapping(value = { "", "/", "/index" }, method = RequestMethod.GET)
	public String index(Model model) {

		return "workflow/index";
	}

	@RequestMapping(value = { "/list" }, method = RequestMethod.GET)
	public String list(Model model) {

		List<WorkflowDto> workflows = new ArrayList<WorkflowDto>();
		for (int i = 0; i < 5; i++) {
			WorkflowDto workflow = new WorkflowDto();
			workflow.setWorkflowSeq((long) (i + 1));
			workflow.setTitle("タイトル" + (i + 1));
			workflows.add(workflow);
		}

		PagingDto paging = new PagingDto(30, 10, 100);

		model.addAttribute("state", 1);
		model.addAttribute("offset", 5);
		model.addAttribute("workflows", workflows);
		model.addAttribute("paging", paging);
		return "workflow/list";
	}

	@RequestMapping(value = { "/{workflowNo:^[0-9]+$}" }, method = RequestMethod.GET)
	public String get(@PathVariable("workflowNo") String workflowNo, Model model) {
		return "workflow/workflow";
	}
}
