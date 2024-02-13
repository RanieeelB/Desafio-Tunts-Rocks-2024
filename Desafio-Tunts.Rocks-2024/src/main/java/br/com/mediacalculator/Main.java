package br.com.mediacalculator;

import java.io.*;
import java.util.Iterator;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import br.com.mediacalculator.model.Model;

import static br.com.mediacalculator.methods.Methods.Finaln;
import static br.com.mediacalculator.methods.Methods.situation;


public class Main {
    private static final String fileName = "Engenharia de Software – Desafio [Raniel].xlsx";

    public static void main(String[] args) {


        try {
            FileInputStream file = new FileInputStream(new File("Engenharia de Software – Desafio [Raniel].xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            Model model = new Model();


            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                // Ignore the first three lines
                if (row.getRowNum() > 2) {

                    model.setRegistration((int) row.getCell(0).getNumericCellValue());
                    model.setName(row.getCell(1).getStringCellValue());
                    model.setFouls((int) row.getCell(2).getNumericCellValue());
                    model.setP1((float) row.getCell(3).getNumericCellValue());
                    model.setP2((float) row.getCell(4).getNumericCellValue());
                    model.setP3((float) row.getCell(5).getNumericCellValue());
                    model.setFinaln((float) row.getCell(7).getNumericCellValue());

                    // Calculate the average and situation
                    situation(model);


                }
                Finaln(model);

            }

            file.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Excel file not found!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error reading the Excel file!");
        }
    }


}



