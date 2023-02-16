package com.student.data.service;

import java.util.List;
import java.util.Map;

import com.student.data.beans.FetchStudentDetails;
import com.student.data.beans.FetchStudentDetailsWithMarksAndDepartmentNames;
import com.student.data.beans.FetchStudentDetailsWithMarksAndDepartmentNamesWithNoReplications;
import com.student.data.beans.FetchStudentDetailsWithMarksAndDepartmentWithNoReplications;
import com.student.data.beans.InsertOrUpdateStudentDetails;
import com.student.data.beans.InsertStudentDetails;
import com.student.data.beans.InsertStudentDetailsWithDepartment;
import com.student.data.beans.UpdateStudentDetails;

public interface StudentService {
	public FetchStudentDetails fetchStudentDetailsUsingId(FetchStudentDetails fetchStudentDetails);
	public List<FetchStudentDetails> fetchStudentDetailsUsingQuery(FetchStudentDetails fetchStudentDetails) ;
	public FetchStudentDetails fetchStudentDetailsUsingQueryForMap(FetchStudentDetails FetchStudentDetails);
	public Boolean batchUpdateUsingSqlParamSource(List<InsertStudentDetails> insertStudentDetails);
	public Boolean batchUpdateUsingBatchSetter(List<InsertStudentDetails> insertStudentDetails);
	public Boolean batchUpdateStudentDetails(List<InsertStudentDetails> insertStudentDetails);
	public Boolean insertStudentDetailsUsingMap(InsertStudentDetails insertStudentDetails) ;
	public Boolean insertStudentDetailsUsingMapSqlParam(InsertStudentDetails insertStudentDetails) ;
	public Boolean insertStudentDetailsUsingBeanProperySqlparam(InsertStudentDetails insertStudentDetails) ;
	public Boolean updateStudentDetails(UpdateStudentDetails updateStudentDetails);
	public Boolean insertOrUpdateStudentDetails(InsertOrUpdateStudentDetails insertOrUpdateStudentDetails);
	public Boolean insertOrUpdateStudentDetailsJdbc(InsertOrUpdateStudentDetails insertOrUpdateStudentDetails);
	public  List<FetchStudentDetailsWithMarksAndDepartmentWithNoReplications> studentDetailsWithMarks();
	public List<Map<String, Object>> fetchStudentDetailsUsingQueryForList(FetchStudentDetails fetchStudentDetails);
	public Boolean insertStudentDetailsWithKeyHolder(List<InsertStudentDetailsWithDepartment> insertStudentDetailsWithDepartment);
	public List<FetchStudentDetailsWithMarksAndDepartmentNamesWithNoReplications> studentDetailsWithMarksAndDepartment();
}
