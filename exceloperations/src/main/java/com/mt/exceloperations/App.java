package com.mt.exceloperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			Workbook workbook = new XSSFWorkbook();
			
			Sheet sheet = workbook.createSheet("Employee Data");
			
			String[] columnHeadings = {"ID","Name","Dept","Salary"};
			
			Row headerRow = sheet.createRow(0);
			
			for(int i=0;i<columnHeadings.length;i++) {
				Cell cell =headerRow.createCell(i);
				cell.setCellValue(columnHeadings[i]);
			}
			ArrayList<Employee> employees = getArrayList();
			int rownum = 1;
			for(Employee emp:employees) {
				Row row = sheet.createRow(rownum++);
				row.createCell(0).setCellValue(emp.getId());
				row.createCell(1).setCellValue(emp.getName());
				row.createCell(2).setCellValue(emp.getDept());
				row.createCell(3).setCellValue(emp.getSalary());
			}
			//AutoSizing
			for(int i=0;i<columnHeadings.length;i++) {
				sheet.autoSizeColumn(i);
			}
			
			FileOutputStream fout = new FileOutputStream("D:/employees.xlsx");
			workbook.write(fout);
			fout.close();
			workbook.close();
			System.out.println("Data Writing Succesful.......");
			
			FileInputStream fin = new FileInputStream("D:/employees.xlsx");
			
			Workbook workbookIn = new XSSFWorkbook(fin);
			
			DataFormatter dataformatter = new DataFormatter();
			Iterator<Sheet> sheets = workbookIn.sheetIterator();
			while(sheets.hasNext()) {
				Sheet sh = sheets.next();
				System.out.println("Sheet Name : "+sh.getSheetName());
				System.out.println("-----------------------------");
				Iterator<Row> rows = sh.iterator();
				while(rows.hasNext()) {
					Row row = rows.next();
					Iterator<Cell> cells = row.cellIterator();
					while(cells.hasNext()) {
						Cell cell = cells.next();
						String cellValue = dataformatter.formatCellValue(cell);
						System.out.print(cellValue+"\t");
					}
					System.out.println();
				}
			}
			workbookIn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static ArrayList<Employee> getArrayList() {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(1,"rahul","Database",30000));
		al.add(new Employee(2,"ravan","Microservices",40000));
		al.add(new Employee(3,"raman","Microservices",40000));
		return al;
	}
}
