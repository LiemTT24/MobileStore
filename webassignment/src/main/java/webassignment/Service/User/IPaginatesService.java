package webassignment.Service.User;

import org.springframework.stereotype.Service;

import webassignment.DTO.PaginatesDto;

@Service
public interface IPaginatesService {
	public PaginatesDto getInfoPaginates(int totalData, int limit, int currentPage);
}
