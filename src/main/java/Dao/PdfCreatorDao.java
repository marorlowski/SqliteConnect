package Dao;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class PdfCreatorDao {

    DateFormat dataFormat = new SimpleDateFormat("HH-mm-ss");
    Date data = new Date();



    public void CreatePdf(String tekst, String nr) throws IOException {


        //nowy obiekt
        PDDocument document = new PDDocument();

        //nowa strona
        PDPage blankPage = new PDPage();
        //przypisanie nowej strony
        document.addPage(blankPage);
        //pobranie strony
        // PDPage page = document.getPage(1);
        PDPageContentStream contetStream = new PDPageContentStream(document, blankPage);
        //początek strumienia
        contetStream.beginText();
        //ustawienia lini
        contetStream.setFont(PDType1Font.TIMES_ROMAN, 12);
        //Ustawienie pozycji lini
        contetStream.newLineAtOffset(25, 500);

        String text = tekst;
        //dodatnie tesktu ze zmiennej
        contetStream.showText(text);

        //zakończenie strumienia
        contetStream.endText();
        //zamknięcie strumienia
        contetStream.close();


        document.save(new File("D:/pdf"+nr+".pdf"));
        System.out.println("#####PDF creator##### działa");

        document.close();
    }


}
