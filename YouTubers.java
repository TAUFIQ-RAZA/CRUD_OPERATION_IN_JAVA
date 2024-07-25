// CRUD operations :

public class YouTubers{

	//Creating Array
	String[] youtubersNames= new String[5];
	int index=0;
	
	//method:1 Checking Array Length:
	public int getArrayLength(){
		return youtubersNames.length;
	}
	
	//method:2 Insert Operation
	public String insertArrayElements(String youtubersName){
		if(this.index<this.getArrayLength()){
			youtubersNames[index]= youtubersName;
			System.out.println(index+":"+youtubersName);
			index++;
			return "Inserted SuccessFully";
		}
		
		return "Insert UnsuccessFully";
	}
	
	//method:3 Read Operation
	public void readArrayElements(){
		for(String name : youtubersNames){
			System.out.println("- "+name);
		}
	}
	
	//method:4 Update Operation
	public String updateArrayElements(String oldYoutubersName,String newYoutubersName){
	  for(int i=0; i<this.getArrayLength();i++){
		if(youtubersNames[i]==oldYoutubersName){
		   youtubersNames[i]= newYoutubersName;
		   System.out.println("The Upadted YouTuber at:"+i+" & Element is:"+newYoutubersName);
		   return "Updated SuccessFully";
		   }
		}
		return "not Updated";
	}
	
	//method:5 Delete Operation 
	public String deleteArrayElement(String youtubersName){
		for(int i=0;i<this.getArrayLength();i++){
			if(youtubersNames[i] == youtubersName){
				youtubersNames[i]=null;
				System.out.println("The Deleted YouTuber is:"+youtubersName);
				return "Deleted SuccessFully"+youtubersNames[i];
			}
		}
		return "Not deleted";
	}
	
	//method:6 Search Operation
	public String searchArrayElement(String youtubersName){
		for(String name : youtubersNames){
			if(name == youtubersName){
				return "Search SuccessFully Done:\nYoutuber:"+name;
			}
		}
		return "Search Element Not Found";
	}
	
	
	public static void main(String args[]){
		// instance Creation
		YouTubers UTube = new YouTubers();
		
		// 1 Method Invoking
		System.out.println("========Creating========="); 
		int length=UTube.getArrayLength();
		System.out.println("Array is Created of length:"+length);
		
		//2 Method : inserting
		System.out.println("========Inserting=========");
		UTube.insertArrayElements("Mr.Beast");
		UTube.insertArrayElements("R2H");
		UTube.insertArrayElements("Dhruve Rathee");
		UTube.insertArrayElements("Zakir Khan");
		UTube.insertArrayElements("Ashish Chanclani");
		
		//3 Method : Read
		System.out.println("========Reading=========");
		UTube.readArrayElements();
		
		//4 Method : Updated
		System.out.println("========Updated=========");
		UTube.updateArrayElements("R2H","Sandeep Maheshwari");
		UTube.readArrayElements();
		
		//5 Method : Delete
		System.out.println("========Delete=========");
		UTube.deleteArrayElement("Ashish Chanclani");
		UTube.readArrayElements();
		
		//6 Method : Search
		System.out.println("========Search=========");
		String search=UTube.searchArrayElement("Dhruve Rathee");
		System.out.println(search);
	}
}