package com.shiloh.corp.repo;

import static com.querydsl.core.types.Projections.bean;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.querydsl.core.group.GroupBy;
import com.querydsl.core.types.QBean;
import com.querydsl.sql.SQLQueryFactory;
import com.shiloh.domain.Company;
import com.shiloh.query.type.QCompany;
import com.shiloh.query.type.QDepartment;
import com.shiloh.query.type.QEmployee;

@Component
public class CompanyRepo {

	@Inject
    SQLQueryFactory queryFactory;
	
	QBean<Company> compBean = bean(Company.class, QCompany.company.all());
	
	
	public List<Company> fetchAllCompanies() {
		return queryFactory.from(QCompany.company)
		.innerJoin(QDepartment.department)
		.innerJoin(QEmployee.employee)
		.transform(GroupBy.groupBy(QCompany.company.id).list(compBean));
	}
}
