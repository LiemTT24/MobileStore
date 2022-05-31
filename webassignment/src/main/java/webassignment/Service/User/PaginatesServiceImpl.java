package webassignment.Service.User;

import org.springframework.stereotype.Service;

import webassignment.DTO.PaginatesDto;
@Service
public class PaginatesServiceImpl implements IPaginatesService{
	public PaginatesDto getInfoPaginates(int totalData, int limit, int currentPage) {
		PaginatesDto paginate = new PaginatesDto();
		paginate.setLimit(limit);
	 	paginate.setTotalPages(SetInfoTotalPages(totalData, limit));
		paginate.setCurrentPage(checkCurrentPage(currentPage, paginate.getTotalPages()));
		int start = FindStart(paginate.getCurrentPage(), limit);
		paginate.setStart(start);
		int end = FindEnd(paginate.getStart(), limit, totalData);
		paginate.setEnd(end);
		return paginate;
	}

	private int FindEnd(int start, int limit, int totalData) {
		return start + limit > totalData ? totalData : (start + limit) - 1;
	}

	private int FindStart(int currentPage, int limit) {
		return ((currentPage - 1) * limit) + 1;
	}

	private int SetInfoTotalPages(int totalData, int limit) {
		int totalPages = 0;
		totalPages = totalData / limit;
		totalPages = totalPages * limit < totalData ? totalPages + 1 : totalPages;
		return totalPages;
	}
	
	public int checkCurrentPage(int currentPage, int totalPages) {
		if(currentPage < 1) {
			return 1;
		}
		if(currentPage > totalPages) {
			return totalPages;
		}
		return currentPage;
	}
	
}
