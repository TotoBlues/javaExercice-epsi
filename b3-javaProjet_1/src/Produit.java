import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
 
 public class Produit extends FicheSortie {
	 private float prix;
	 

	public Produit(String path) {
		super(path);
	}
	
	public void fillFiche(String[] infos, float tva) throws DocumentException {
		if (infos == null)
			return;
		this.prix = Float.parseFloat(infos[4].replace(',', '.'));
		this.getDocument().add(new Paragraph());
		
		this.getDocument().newPage();
		
		// Affichage du code de produit
		this.getDocument().add(new Paragraph("Code: " + infos[0].toUpperCase()));
		this.getDocument().add(new Paragraph(" "));
		this.getDocument().add(new Paragraph(" "));
		
		// Affichage de la categorie
		Paragraph categorie = new Paragraph("Catégorie: " + infos[3]);
		categorie.setAlignment(Element.ALIGN_RIGHT);
		this.getDocument().add(categorie);
		
		// Affichage du titre
		this.getDocument().add(new Paragraph(infos[1].toUpperCase()));
		this.getDocument().add(new Paragraph(" "));
		
		// Affichage de la description
		this.getDocument().add(new Paragraph("Description"));
		
		PdfPTable table = new PdfPTable(1);
        PdfPCell cell1 = new PdfPCell(new Paragraph(infos[2]));
        table.setSpacingBefore(10f);
        cell1.setFixedHeight(400);
        table.setWidthPercentage(100);
        table.addCell(cell1);
		this.getDocument().add(table);
		
		
		//affichage du montant
		table = new PdfPTable(4);
		table.setWidthPercentage(100);
		cell1 = new PdfPCell(new Paragraph(""));
		PdfPCell cell2 = new PdfPCell(new Paragraph(""));
		PdfPCell cell3 = new PdfPCell(new Paragraph("Montant HT: "));
		PdfPCell cell4 = new PdfPCell(new Paragraph((this.prix) + "€"));
		
		cell4.setHorizontalAlignment(PdfPCell.ALIGN_RIGHT);
		PdfPCell cell5 = new PdfPCell(new Paragraph(""));
		PdfPCell cell6 = new PdfPCell(new Paragraph(""));
		PdfPCell cell7 = new PdfPCell(new Paragraph("TVA: "));
		PdfPCell cell8 = new PdfPCell(new Paragraph((this.prix * (tva/100)) + "€"));
		
		cell8.setHorizontalAlignment(PdfPCell.ALIGN_RIGHT);
		PdfPCell cell9 = new PdfPCell(new Paragraph(""));
		PdfPCell cell10 = new PdfPCell(new Paragraph(""));
		PdfPCell cell11 = new PdfPCell(new Paragraph("Montant TTC: "));
		PdfPCell cell12 = new PdfPCell(new Paragraph((this.prix + (this.prix * (tva/100)))+"€"));
		cell12.setHorizontalAlignment(PdfPCell.ALIGN_RIGHT);
		cell1.setBorder(Rectangle.NO_BORDER);
		cell2.setBorder(Rectangle.NO_BORDER);
		cell3.setBorder(Rectangle.NO_BORDER);
		cell4.setBorder(Rectangle.NO_BORDER);
		cell5.setBorder(Rectangle.NO_BORDER);
		cell6.setBorder(Rectangle.NO_BORDER);
		cell7.setBorder(Rectangle.NO_BORDER);
		cell8.setBorder(Rectangle.NO_BORDER);
		cell9.setBorder(Rectangle.NO_BORDER);
		cell10.setBorder(Rectangle.NO_BORDER);
		cell11.setBorder(Rectangle.NO_BORDER);
		cell12.setBorder(Rectangle.NO_BORDER);
		table.addCell(cell1);
		table.addCell(cell2);
		table.addCell(cell3);
		table.addCell(cell4);
		table.addCell(cell5);
		table.addCell(cell6);
		table.addCell(cell7);
		table.addCell(cell8);
		table.addCell(cell9);
		table.addCell(cell10);
		table.addCell(cell11);
		table.addCell(cell12);
		this.getDocument().add(table);
	}
 }
