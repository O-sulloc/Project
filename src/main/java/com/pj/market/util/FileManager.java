package com.pj.market.util;

import java.io.File;
import java.util.Calendar;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileManager {

	@Autowired
	private ServletContext servletContext;

	// file 삭제
	public boolean remove(String path, String fileName) throws Exception {
		path = servletContext.getRealPath(path);
		File file = new File(path, fileName);
		return file.delete();
	}

	// file 다운로드.. 쓸 일이 있나 쇼핑몰에서?
	public String save(MultipartFile multipartFile, String path) throws Exception {
		// path=/resources/upload/product
		String realPath = servletContext.getRealPath(path);
		System.out.println(realPath);
		File file = new File(realPath);

		if (file.exists()) {

		} else {
			file.mkdirs();
		}

		String oriName = multipartFile.getOriginalFilename();

		String fileName = UUID.randomUUID().toString();
		fileName = fileName + "_" + oriName;

//		file = new File(realPath, fileName);
//		multipartFile.transferTo(file);

		file = new File(file, fileName);
		FileCopyUtils.copy(multipartFile.getBytes(), file);

		return fileName;
	}
}
