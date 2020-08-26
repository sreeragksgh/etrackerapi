package com.example.etracker.utils;

public interface PathRoutes {

	public interface SearchSQL{
			
		final String SEARCHSQL_ROOT = "/tracker/register";
		final String TOTAL_BAR_YEAR = "/TotalExpenseTotalIncomeBar_year";
		final String TOTAL_BAR_MONTH = "/TotalExpenseTotalIncomeBar_month";
		final String TOTAL_LINE_YEAR = "/TotalExpenseTotalIncomeLine_year";
		final String TOTAL_LINE_MONTH = "/TotalExpenseTotalIncomeLine_month";
		final String ADD_INCOME = "/addincome";
		final String ADD_EXPENSE = "/addexpense";
		final String LIST_CATEGORY_EXPENSE = "/liscategoryexpense";
		final String LIST_CATEGORY_INCOME= "/liscategoryincome";
		final String CATEGORY_BAR_MONTH= "/monthlycategorysum";
		final String CATEGORY_BAR_YEAR = "/yearlycategorysum";
		final String GET_INCOME = "/getIncome";
		final String GET_EXPENSE = "/getExpense";
		final String GET_INCOME_EXPENSE="/getIncomeExpense";
		final String GET_EMAIL_PASSWORD = "{emailId}/{password}";
	}
}