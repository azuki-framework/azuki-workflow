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

/**
 * @author kawakicchi
 */
public class PagingDto {

	private final int pageSize;

	private final int pageCurr;

	private final List<PageDto> pages;

	public PagingDto(int offset, int step, int size) {
		pageSize = (size + (step - 1)) / step;
		pageCurr = offset / step;
		pages = new ArrayList<PagingDto.PageDto>();

		for (int i = 0; i < pageSize; i++) {
			PageDto page = new PageDto(Integer.toString(i + 1), i, i * step, (i == pageCurr));
			pages.add(page);
		}
	}

	public boolean isPrev() {
		return 0 < pageCurr;
	}

	public List<PageDto> getPages() {
		return pages;
	}

	public boolean isNext() {
		return pageCurr + 1 < pageSize;
	}

	public int getMaxPage() {
		return pageSize - 1;
	}

	public class PageDto {
		private String no;
		private int page;
		private int offset;
		private boolean active;

		public PageDto(final String no, int page, int offset, boolean active) {
			this.no = no;
			this.page = page;
			this.offset = offset;
			this.active = active;
		}

		/**
		 * no を取得する。
		 * 
		 * @return no
		 */
		public String getNo() {
			return no;
		}

		/**
		 * page を取得する。
		 * 
		 * @return page
		 */
		public int getPage() {
			return page;
		}

		/**
		 * offset を取得する。
		 * 
		 * @return offset
		 */
		public int getOffset() {
			return offset;
		}

		/**
		 * active を取得する。
		 * 
		 * @return active
		 */
		public boolean isActive() {
			return active;
		}

	}
}
