package Controller;

import Dao.AdresDao;
import Dao.PdfCreatorDao;
import Dao.Tbl1Dao;
import Entiti.Adres;
import Entiti.Tbl1;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class main {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(main.class, args);
        PdfCreatorDao pdf = new PdfCreatorDao();

        String miasto= "puste";
        String nr= "empty";

        for (Tbl1 e : new Tbl1Dao().getAllTbl1()) {
            //System.out.println(e);
            System.out.println("###### id: " + e.getId() + ", Name: " + e.getOne() + ", Adress: " + e.getTwo() + " #####");

            }

//        for (Adres e : new AdresDao().getAllAdres()) {
//            DateFormat dataFormat = new SimpleDateFormat("HH-mm-ss");
//            Date data = new Date();
//
//            System.out.println("###### id: " + e.getIdAdres() + ", Adress: " + e.getMiasto() + " #####");
//            miasto = e.getMiasto();
//            nr= Integer.toString(e.getIdAdres())+dataFormat.format(data);
//            pdf.CreatePdf(miasto,nr);
//        }



    }
}
