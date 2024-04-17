
package PK;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BarcodeQRCode;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Logica {
    
    
    String nombreArchivo;
    String fecha;
    String rutaImagen;
    ArrayList<datos> datos;
    
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;

    public Logica(String nombreArchivo, String fecha, String rutaImagen, ArrayList<datos> datos) {
        this.nombreArchivo = nombreArchivo;
        this.fecha = fecha;
        this.rutaImagen = rutaImagen;
        this.datos = datos;
        
        documento = new Document();
        titulo = new Paragraph("Reporte de datos del curso");
    }
    
    public void crearReporte(){
        
        try {
            
            archivo = new FileOutputStream(nombreArchivo+".pdf");
            PdfWriter.getInstance(documento, archivo);
            
            documento.open();
            
            titulo.setAlignment(1);
            documento.add(titulo);
            
            
            Image imagenReporte = null;
            
            try {
                imagenReporte = Image.getInstance(rutaImagen);
                imagenReporte.scaleAbsolute(100, 100);
                imagenReporte.setAbsolutePosition(450, 750);
                
            } catch (Exception e) {
            }
            
            
            documento.add(imagenReporte);
            
            
            
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Este es un reporte para demostrar los datos almaasdnasndknaksndkanskjdnkasnkdnaksndknaskjndkanksdnkasnkdnakjsndjknasjknkxnasjkndkjcenados"));
            documento.add(Chunk.NEWLINE);
            Paragraph textoLargo = new Paragraph("ajsndanlkdmnaklsmdlkasmkldmasmnsdkamslkdmlkasmdlkmaslkdmlkasmdlkamskldmlasmldkmalkmdklasmkldmalsmdlsdnfvndfskjvmnkdfnvkjdfnkvndfmvldfmvlkdfmlvkmdflkvmdlfkmvldfmvldfmflvmdflk");
            textoLargo.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(textoLargo);
            documento.add(Chunk.NEWLINE);
            
            PdfPTable tabla = new PdfPTable(4);
            
            tabla.setWidthPercentage(100);
            
            PdfPCell nombre = new PdfPCell(new Phrase("Nombre"));
            nombre.setBackgroundColor(BaseColor.DARK_GRAY);
            
            PdfPCell telefono = new PdfPCell(new Phrase("Telefono"));
            telefono.setBackgroundColor(BaseColor.DARK_GRAY);
            
            PdfPCell edad = new PdfPCell(new Phrase("Edad"));
            edad.setBackgroundColor(BaseColor.DARK_GRAY);
            
            PdfPCell direccion = new PdfPCell(new Phrase("Direccion"));
            direccion.setBackgroundColor(BaseColor.DARK_GRAY);
            
            tabla.addCell(nombre);
            tabla.addCell(telefono);
            tabla.addCell(edad);
            tabla.addCell(direccion);
            
            
            for (datos d : datos) {
                
                tabla.addCell(d.getNombre());
                tabla.addCell(d.getTelefono());
                tabla.addCell(d.getEdad()+"");
                tabla.addCell(d.getTelefono());
                
            }
            
            documento.add(tabla);
            documento.add(Chunk.NEWLINE);
            
            BarcodeQRCode codigoQr = new BarcodeQRCode("Vista mi sitio web", 1, 1, null);
            Image qrimagen = codigoQr.getImage();
            qrimagen.scalePercent(400);
            documento.add(qrimagen);
            
            documento.add(new Paragraph("Fecha : " + fecha));

                        
                        
            
            
            
            
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado");
            
            
            
            
            
            
            
        } catch (Exception e) {
        }
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
}
