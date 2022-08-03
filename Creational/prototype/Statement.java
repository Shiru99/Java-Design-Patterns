package Creational.prototype;

import java.util.List;

public class Statement implements Cloneable {

	private String sql;
	private List<String> parameters;

	public Statement(String sql, List<String> parameters) {
		this.sql = sql;
		this.parameters = parameters;
	}

	public Statement clone() {
		try {
			return (Statement) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<String> getParameters() {
		return parameters;
	}

	public String getSql() {
		return sql;
	}

	public void setParameters(List<String> parameters) {
		this.parameters = parameters;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	@Override
	public String toString() {
		return "Statement [sql=" + sql + ", parameters=" + parameters + "]";
	}
}
