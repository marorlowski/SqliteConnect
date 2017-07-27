package Controller;

import Dao.AdresDao;
import Dao.PdfCreatorDao;
import Entiti.Adres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AdresController {

    PdfCreatorDao pdf = new PdfCreatorDao();
    String miasto= "puste";
    String nr= "empty";

    @Autowired



    @RequestMapping(value="/adres", method = {RequestMethod.GET, RequestMethod.POST})
    public @ResponseBody List<Adres> getAdres(){

        List<Adres> adresList = new ArrayList<>();
        for (Adres e : new AdresDao().getAllAdres()) {
            System.out.println(e);
            adresList.add(e);
        }
        return adresList;




    }

    @RequestMapping(value = "/adresJson", method = RequestMethod.POST)
    public @ResponseBody List<Adres> getAdresJson (){
        List<Adres> adresList = new ArrayList<>();
        for (Adres e : new AdresDao().getAllAdres()) {
            System.out.println(e);
            adresList.add(e);
        }
        return adresList;
    }

    @RequestMapping(value = "/adresJsonPost", method = RequestMethod.POST)
    public @ResponseBody List<Adres> getAdresJson (@RequestBody List<Adres> jsonString){
        List<Adres> adresList = new ArrayList<>();
        for (Adres e : new AdresDao().getAllAdres()) {
            System.out.println(e);
            adresList.add(e);
        }
        return adresList;
    }


    @RequestMapping(value="/adresPdf", method = {RequestMethod.GET, RequestMethod.POST})
    public @ResponseBody void getAdresPdf() throws IOException {

        for (Adres e : new AdresDao().getAllAdres()) {
            DateFormat dataFormat = new SimpleDateFormat("HH-mm-ss");
            Date data = new Date();

            System.out.println("###### id: " + e.getIdAdres() + ", Miasto: " + e.getMiasto() + " #####");
            miasto = e.getMiasto();
            nr= Integer.toString(e.getIdAdres())+dataFormat.format(data);
            pdf.CreatePdf(miasto,nr);
        }
        }

}
