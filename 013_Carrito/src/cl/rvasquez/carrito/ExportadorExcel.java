package cl.rvasquez.carrito;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExportadorExcel implements Exportador {
	@Override
	public void exportar(List<Object> lista) {
		String fechaHoyString = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
		HSSFWorkbook libro = new HSSFWorkbook();
		HSSFSheet hoja = libro.createSheet();
		for(int i=0; i<lista.size();i++) {
			String datos = lista.get(i).toString();
			HSSFRow fila = hoja.createRow(i);
			HSSFCell celda = fila.createCell((short)0);
			celda.setCellValue(datos);
		}
		try {
			FileOutputStream elFichero = new FileOutputStream("Orden_Despacho_"+fechaHoyString+"_.xls");
			libro.write(elFichero);
			elFichero.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		try {
			libro.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
