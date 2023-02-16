package com.student.data.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.student.data.beans.FetchStudentDetails;
import com.student.data.beans.FetchStudentDetailsWithMarksAndDepartment;
import com.student.data.beans.FetchStudentDetailsWithMarksAndDepartmentNames;
import com.student.data.beans.InsertStudentDetails;
import com.student.data.beans.InsertStudentDetailsWithDepartment;
import com.student.data.beans.StudentDto;
import com.student.data.beans.UpdateStudentDetails;

public interface StudentDao {
	
	public void test();
	public FetchStudentDetails fetchStudentDetailsUsingId(FetchStudentDetails fetchStudentDetails);
	public List<FetchStudentDetails> fetchStudentDetailsUsingQuery(FetchStudentDetails studentDto);
	public Map<String, Object>  fetchStudentDetailsUsingQueryForMap(FetchStudentDetails FetchStudentDetails );
	public Boolean batchUpdateUsingSqlParamSource(List<InsertStudentDetails> insertStudentDetails);
	public Boolean batchUpdateUsingBatchSetter(List<InsertStudentDetails> insertStudentDetails);
	public Boolean batchUpdateStudentDetails(List<InsertStudentDetails> insertStudentDetails);
	public Boolean insertStudentDetailsUsingMap(InsertStudentDetails insertStudentDetails) ;
	public Boolean insertStudentDetailsUsingMapSqlParam(InsertStudentDetails insertStudentDetails) ;
	public Boolean insertStudentDetailsUsingBeanProperySqlparam(InsertStudentDetails insertStudentDetails) ;
	public Boolean updateStudentDetails(UpdateStudentDetails updateStudentDetails);
	public Boolean batchUpdateStudentDetailsCombination(SqlParameterSource saveBatch[]);
	public Boolean batchUpdateStudentDetailsCombinationInsert(SqlParameterSource updateBatch[]);
	public Boolean batchUpdateStudentDetailsCombinationJdbc(List<StudentDto> updateOp);
	public Boolean batchUpdateStudentDetailsCombinationJdbcInsert(List<StudentDto> insertOp);
	public List<FetchStudentDetailsWithMarksAndDepartment> studentDetailsWithMarks();
	public List<FetchStudentDetailsWithMarksAndDepartmentNames> studentDetailsWithMarksAndDepartment();
	public List<Map<String, Object>> fetchStudentDetailsUsingQueryForList(FetchStudentDetails fetchStudentDetails);
	public Boolean insertStudentDetailsWithKeyHolder(List<InsertStudentDetailsWithDepartment> insertStudentDetailsWithDepartment);
}
