package com.sage.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.sage.request.SearchRequest;
import com.sage.response.SearchResponse;

public interface ReportService {
	public List<String> getUniquePlanNames();

	public List<String> getUniquePlanStatuses();

	public List<SearchResponse> search(SearchRequest request);

	public void generateExcel(HttpServletResponse response) throws Exception;
	// Both methods are right
	// public HttpServletResponse generateExcel();

	public void generatePdf(HttpServletResponse response) throws Exception;
}
