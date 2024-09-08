package week3.assignments;

public class Elements extends Button  {

	public static void main(String[] args) {
		
		
		TextField textObj = new TextField();
		checkBoxButton checkObj = new checkBoxButton();
		RadioButton radioObj = new RadioButton();
		
		System.out.println(checkObj.setText("hey") +"\n"+textObj.getText()+"\n"+radioObj.selectRadioButton()+"\n"+checkObj.clickCheckButton()+"\n"+checkObj.click()+"\n"+checkObj.submit());
			
	
	}

}
