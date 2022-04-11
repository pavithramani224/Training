package com.training.service;

public class Application {
	public static void main(String[] args) {
		StringService service = new StringService();
		String city="Chenai";
		//System.out.pritnln(&city);
		int key=14;
		switch(key) {
		case 1:
			service.stringEquals("ram","ram");
			break;
		case 2:
			service.stringObjectEquals();
			break;
		case 3:
			service.usingTrim("ramesh");
		case 4:
			service.lengthofString("ramesh");
		case 5:
			service.usingSubStrin("RameshKumar");
			break;
		case 6:
			service.usingCharcterAndIndexof("Ram@abc.com");
			break;
		case 7: 
			service.usingReplace("Ram@abc.com", "welcom to Chennai");
			break;
		case 8:
			service.usingConcat("chennai", "place");
			break;
		case 9:
			service.usingComapreTo("Ram","Ram");
			break;
		case 10:
			service.usingStringFormat("pavi", 98.2890);
			break;
		case 11:
			service.usingStringformat(90);
			break;
		case 12:
			service.usingStringformated(16,16);
		case 13:
			service.usingStringFormat("ram","ram");
			break;
		case 14:
			service.usingStringFormatString(-421);
		default:
				break;
			
		}
	}
}
