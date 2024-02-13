package br.com.mediacalculator.methods;

import br.com.mediacalculator.model.Model;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Methods {

    public static Model situation(Model model) throws IOException {

        double average = (model.getP1() + model.getP2() + model.getP3()) / 30;
        double fouls = model.getFouls() / 60.0;
        float pfouls = (float) (fouls * 100);


        System.out.println("Registration: " + Math.round(model.getRegistration()));
        System.out.println("Name: " + model.getName());
        System.out.println("Average: " + Math.round(average));
        System.out.println("Fouls: " + Math.round(model.getFouls()));
        System.out.println("Percentage of Fouls: " + pfouls + "%");


        if (average < 5) {
            System.out.println("Situation: Reproved.\n");

        } else if (average >= 5 && average <= 7) {
            if (pfouls > 25) {
                System.out.println("Situation: Reproved for fouls.\n");
            } else {
                System.out.println("Situation: Final exam.\n");

            }

        } else if (average > 7) {
            if (pfouls > 25) {
                System.out.println("Situation: Reproved for fouls.\n");
            } else {
                System.out.println("Situation: Approved.\n");
            }
        }

        return model;
    }
    public static Model Finaln(Model fn) throws IOException {

        FileInputStream file = new FileInputStream(new File("Engenharia de Software – Desafio [Raniel].xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);


        int situationColumnIndex = 6;
        int finalGradeColumnIndex = 7;
        CellStyle centeredStyle = workbook.createCellStyle();
        centeredStyle.setAlignment(HorizontalAlignment.CENTER);


        for (int rowIndex = 3; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
            Row row = sheet.getRow(rowIndex);
            if (row == null) {
                row = sheet.createRow(rowIndex);
            }


            Model model = new Model();
            double p1 = row.getCell(3).getNumericCellValue();
            double p2 = row.getCell(4).getNumericCellValue();
            double p3 = row.getCell(5).getNumericCellValue();
            double fouls;


            double average = (p1 + p2 + p3) / 30;
            double naveragefinal = ((average + 8) / 2);
            fouls = model.getFouls() / 60.0;
            float pfouls = (float) (fouls * 100);



            Cell finalGradeCell = row.getCell(finalGradeColumnIndex);
            if (finalGradeCell == null) {
                finalGradeCell = row.createCell(finalGradeColumnIndex);
            }

            if (average >= 5 && average <= 7) {
                finalGradeCell.setCellValue(Math.round(naveragefinal));
                finalGradeCell.setCellStyle(centeredStyle);
            } else {
                finalGradeCell.setCellValue(0);
                finalGradeCell.setCellStyle(centeredStyle);
            }



            Cell situationCell = row.getCell(situationColumnIndex);
            if (situationCell == null) {
                situationCell = row.createCell(situationColumnIndex);
            }

            if (average < 5) {
                situationCell.setCellValue("Reproved.");
                situationCell.setCellStyle(centeredStyle);

            } else if (average >= 5 && average <= 7) {
                if (pfouls > 25) {
                    situationCell.setCellValue("Reproved for fouls.");
                    situationCell.setCellStyle(centeredStyle);
                } else {
                    situationCell.setCellValue("Final exam.");
                    situationCell.setCellStyle(centeredStyle);

                }

            } else if (average > 7) {
                if (pfouls > 25) {
                    situationCell.setCellValue("Reproved for fouls.");
                    situationCell.setCellStyle(centeredStyle);
                } else {
                    situationCell.setCellValue("Approved.\n");
                    situationCell.setCellStyle(centeredStyle);
                }
            }
        }



        try (FileOutputStream fileOutput = new FileOutputStream("Engenharia de Software – Desafio [Raniel].xlsx")) {
            workbook.write(fileOutput);
        } finally {
            file.close();
        }

        return fn;
    }

}




