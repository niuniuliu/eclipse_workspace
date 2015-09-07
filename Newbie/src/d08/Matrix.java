package org.nitpro.exception;

/**
 * 
 * @author ahao wu
 * 
 */
public class Matrix {

	private int row;

	private int col;

	private double[] m;

	private String toString;

	/**
	 * 
	 * @param row
	 * @param col
	 */
	public Matrix(int row, int col) {
		if (row <= 0 || col <= 0)
			throw new MatrixException("格式错误");
		this.row = row;
		this.col = col;
		m = new double[row * col];
	}

	/**
	 * 
	 * @param row
	 * @param col
	 * @param date
	 */
	public Matrix(int row, int col, double[] date) {
		if (row <= 0 || col <= 0 || date.length != row * col)
			throw new MatrixException("格式错误");
		this.row = row;
		this.col = col;
		m = new double[row * col];
		for (int i = 0; i < date.length; i++) {
			m[i] = date[i];
		}
	}

	/**
	 * 
	 * @param date
	 */
	public Matrix(String date) {
		String[] rs = date.split(";");
		row = rs.length;
		if (row <= 0)
			throw new MatrixException("格式错误");
		col = rs[0].split(",").length;
		if (col <= 0)
			throw new MatrixException("格式错误");

		m = new double[row * col];

		for (int i = 0; i < rs.length; i++) {
			String[] cs = rs[i].split(",");
			if (cs.length != col)
				throw new MatrixException("格式错误");
			for (int j = 0; j < cs.length; j++) {
				m[i * col + j] = Double.parseDouble(cs[j]);
			}
		}
	}

	/**
	 * 
	 * @param ma
	 * @return
	 */
	public Matrix mul(Matrix ma) {
		if (col != ma.row)
			throw new MatrixException("不能乘");
		Matrix r = new Matrix(row, ma.col);

		for (int i = 0; i < r.row; i++) {
			for (int j = 0; j < r.col; j++) {
				for (int k = 0; k < col; k++) {
					r.m[i * r.row + j] += m[i * col + k] * ma.m[k * ma.col + j];
				}
			}
		}
		return r;
	}

	public String toString() {
		if (toString == null) {
			StringBuffer buffer = new StringBuffer();
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col - 1; j++) {
					buffer.append(m[i * col + j]).append(",");
				}
				buffer.append(m[i * col + col - 1]).append("\n");
			}
			toString = buffer.toString();
		}
		return toString;
	}

	/**
	 * 
	 * @param ma
	 * @return
	 */
	public Matrix add(Matrix ma) {
		return null;
	}

	/**
	 * 
	 * @return
	 */
	public int getCol() {
		return col;
	}

	/**
	 * 
	 * @return
	 */
	public int getRow() {
		return row;
	}
}
