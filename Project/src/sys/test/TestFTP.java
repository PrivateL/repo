package sys.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

public class TestFTP {
	
	@Test
	public void testFtpClient() throws SocketException, IOException{
		//创建FTPClient对象
		FTPClient ftpClient = new FTPClient();
		//创建ftp连接，使用主机名和端口号
		ftpClient.connect("10.0.0.20");
		//登录ftp服务器，使用用户名和密码
		ftpClient.login("ftpuser", "ftpuser");
		//设置上传目录
		ftpClient.changeWorkingDirectory("/home/ftpuser/images");
		//设置文件格式
		ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
		//上传文件
		FileInputStream local = new FileInputStream(new File("C:\\Users\\huangkai\\Desktop\\BigLibrary\\img\\109951162908070058.jpg"));
		ftpClient.storeFile("02.jpg", local);
		//关闭连接
		ftpClient.logout();
	}

}
