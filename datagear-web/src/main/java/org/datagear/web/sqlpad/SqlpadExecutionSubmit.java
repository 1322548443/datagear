/*
 * Copyright (c) 2018 datagear.tech. All Rights Reserved.
 */

/**
 * 
 */
package org.datagear.web.sqlpad;

import java.io.File;
import java.util.List;
import java.util.Locale;

import org.datagear.management.domain.Schema;
import org.datagear.management.domain.User;
import org.datagear.persistence.RowMapper;
import org.datagear.util.SqlScriptParser.SqlStatement;
import org.datagear.web.sqlpad.SqlpadExecutionService.CommitMode;
import org.datagear.web.sqlpad.SqlpadExecutionService.ExceptionHandleMode;

/**
 * SQL工作台执行提交。
 * 
 * @author datagear@163.com
 *
 */
public class SqlpadExecutionSubmit
{
	private User user;

	private Schema schema;

	private String sqlpadId;

	private File sqlpadFileDirectory;

	private List<SqlStatement> sqlStatements;

	private CommitMode commitMode;

	private ExceptionHandleMode exceptionHandleMode;

	private int overTimeThreashold;

	private int resultsetFetchSize;

	private RowMapper resultsetRowMapper;

	private Locale locale;

	public SqlpadExecutionSubmit()
	{
	}

	public SqlpadExecutionSubmit(SqlpadExecutionSubmit from)
	{
		this(from.user, from.schema, from.sqlpadId, from.sqlpadFileDirectory, from.sqlStatements, from.commitMode,
				from.exceptionHandleMode, from.overTimeThreashold, from.resultsetFetchSize, from.resultsetRowMapper,
				from.locale);
	}

	public SqlpadExecutionSubmit(User user, Schema schema, String sqlpadId, File sqlpadFileDirectory,
			List<SqlStatement> sqlStatements, CommitMode commitMode, ExceptionHandleMode exceptionHandleMode,
			int overTimeThreashold, int resultsetFetchSize, RowMapper resultsetRowMapper, Locale locale)
	{
		super();
		this.user = user;
		this.schema = schema;
		this.sqlpadId = sqlpadId;
		this.sqlpadFileDirectory = sqlpadFileDirectory;
		this.sqlStatements = sqlStatements;
		this.commitMode = commitMode;
		this.exceptionHandleMode = exceptionHandleMode;
		this.overTimeThreashold = overTimeThreashold;
		this.resultsetFetchSize = resultsetFetchSize;
		this.resultsetRowMapper = resultsetRowMapper;
		this.locale = locale;
	}

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}

	public Schema getSchema()
	{
		return schema;
	}

	public void setSchema(Schema schema)
	{
		this.schema = schema;
	}

	public String getSqlpadId()
	{
		return sqlpadId;
	}

	public void setSqlpadId(String sqlpadId)
	{
		this.sqlpadId = sqlpadId;
	}

	public File getSqlpadFileDirectory()
	{
		return sqlpadFileDirectory;
	}

	public void setSqlpadFileDirectory(File sqlpadFileDirectory)
	{
		this.sqlpadFileDirectory = sqlpadFileDirectory;
	}

	public List<SqlStatement> getSqlStatements()
	{
		return sqlStatements;
	}

	public void setSqlStatements(List<SqlStatement> sqlStatements)
	{
		this.sqlStatements = sqlStatements;
	}

	public CommitMode getCommitMode()
	{
		return commitMode;
	}

	public void setCommitMode(CommitMode commitMode)
	{
		this.commitMode = commitMode;
	}

	public ExceptionHandleMode getExceptionHandleMode()
	{
		return exceptionHandleMode;
	}

	public void setExceptionHandleMode(ExceptionHandleMode exceptionHandleMode)
	{
		this.exceptionHandleMode = exceptionHandleMode;
	}

	public int getOverTimeThreashold()
	{
		return overTimeThreashold;
	}

	public void setOverTimeThreashold(int overTimeThreashold)
	{
		this.overTimeThreashold = overTimeThreashold;
	}

	public int getResultsetFetchSize()
	{
		return resultsetFetchSize;
	}

	public void setResultsetFetchSize(int resultsetFetchSize)
	{
		this.resultsetFetchSize = resultsetFetchSize;
	}

	public RowMapper getResultsetRowMapper()
	{
		return resultsetRowMapper;
	}

	public void setResultsetRowMapper(RowMapper resultsetRowMapper)
	{
		this.resultsetRowMapper = resultsetRowMapper;
	}

	public Locale getLocale()
	{
		return locale;
	}

	public void setLocale(Locale locale)
	{
		this.locale = locale;
	}
}
