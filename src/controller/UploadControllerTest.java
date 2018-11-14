package controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
@WebServlet(urlPatterns="/checkupload")
public class UploadControllerTest extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	RequestDispatcher dispatcher= req.getRequestDispatcher("/view/upload1.jsp");
	dispatcher.forward(req, resp);
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	DiskFileItemFactory factory = new DiskFileItemFactory();
	ServletFileUpload fileupload = new ServletFileUpload(factory);
	try {
		List<FileItem> items = fileupload.parseRequest(req);
		for (FileItem item : items) {
			if (item.getFieldName().equals("name")) {


			} else if (item.getFieldName().equals("userName")) {


			} else if (item.getFieldName().equals("password")) {


			} else if (item.getFieldName().equals("file")) {
				final String dir= "C:\\Users\\mai vien\\Desktop\\upload";
				String originalFileName= item.getName();
				int index= originalFileName.lastIndexOf(".");
				String ext=originalFileName.substring(index+1);
				String fileName= System.currentTimeMillis()+"."+ext;
				File file=new File(dir+"/"+fileName);
				item.write(file);
				req.setAttribute("img", dir+"/"+fileName);
			}	

		}		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	getServletContext().getRequestDispatcher("/view/check-upload.jsp").forward(
           req,resp);

	}
}
