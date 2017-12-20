package springmvc.qch.pojo;

import java.util.ArrayList;
import java.util.List;

public class Page <T>{
	
	private Integer pageCount;//��ҳ��
	private Integer pageSize = 15;//ÿҳ��ʾ����
	private Integer pageTotal;//�ܵļ�¼��
	private Integer currentPage = 1;//��ǰҳ
	private Integer nextPage;
	private Integer lastPage;
	private Integer firstPage;
	private Integer endPage;
	private List<T> list = new ArrayList<T>();
	
	public Integer getNextPage() {
		return nextPage;
	}
	public void setNextPage(Integer nextPage) {
		this.nextPage = nextPage;
	}
	public Integer getLastPage() {
		return lastPage;
	}
	public void setLastPage(Integer lastPage) {
		this.lastPage = lastPage;
	}
	public Integer getFirstPage() {
		return firstPage;
	}
	public void setFirstPage(Integer firstPage) {
		this.firstPage = firstPage;
	}
	public Integer getEndPage() {
		return endPage;
	}
	public void setEndPage(Integer endPage) {
		this.endPage = endPage;
	}
	public Integer getPageCount() {
		if((pageTotal % pageSize) == 0){
			pageCount = pageTotal / pageSize;
		}
		else{
			pageCount = (pageTotal / pageSize) + 1;
		}
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPageTotal() {
		return pageTotal;
	}
	public void setPageTotal(Integer pageTotal) {
		this.pageTotal = pageTotal;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}

}
