package application;

import java.util.Vector;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;


public class PosteController {
	@FXML TextArea ListCP = new TextArea();
	@FXML TextArea ListPeP = new TextArea();
	@FXML TextArea ListSeR = new TextArea();
	@FXML TextArea ListUO = new TextArea();
	Vector<String> VCP = new Vector<String>();
	Vector<String> VPeP = new Vector<String>();
	Vector<String> VSeR = new Vector<String>();
	Vector<String> VUO = new Vector<String>();
	String cpval = new String();
	String pepval = new String();
	String serval = new String();
	String uoval = new String();
	int cpvalnum=0,pepvalnum=0,servalnum=0,uovalnum=0;
	

	public void IncrementListCP()
	{
		cpvalnum++;
		cpval="CP "+cpvalnum;
		System.out.println(cpval);
		VCP.add(cpval);
		ListCP.appendText(cpval+"\n");
	}

	public void IncrementListPeP()
	{
		pepvalnum++;
		pepval="PeP "+pepvalnum;
		System.out.println(pepval);
		VPeP.add(pepval);
		ListPeP.appendText(pepval+"\n");
	}

	public void IncrementListSeR()
	{
		servalnum++;
		serval="SeR "+servalnum;
		System.out.println(serval);
		VUO.add(serval);
		ListSeR.appendText(serval+"\n");
	}

	public void IncrementListUO()
	{
		uovalnum++;
		uoval="SeR "+uovalnum;
		System.out.println(uoval);
		VUO.add(uoval);
		ListUO.appendText(uoval+"\n");
	}
}

