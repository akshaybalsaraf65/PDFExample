package pdfexample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class CreatePDF {

	public static void main(String[] args) {
		
		Document document = new Document();
		try {
			
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("TechMeDevited.pdf"));
			document.open();
			document.addHeader("TechMerdevoted", "PdfFile");
			document.addAuthor("TechMeDevoted");
			document.addTitle("TechMeDevoted title");
			document.add(new Paragraph("Welcome to TechMeDevoted"));
			document.close();
			writer.close();
		} catch (DocumentException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
