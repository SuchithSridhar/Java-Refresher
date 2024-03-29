class Files{
	public static void main(String[] args){
		System.out.println("File manipulations");
	}
}

class FileManager{
	File file;
	FileWriter fw;
	Scanner fr;
	FileManager(String filename){
		this.file = File(filename);
	}
	String read(){
		String data = "";
		try{
			fr = Scanner(file);
			while(fr.hasNextLine()){
				data += fr.nextLine();
			}
		}catch (IOException){
			System.out.println("Some IO error occured");
		}
	}
	void write(String data){
		try{
			fw = FileWriter(file);
			fw.write(data);
			fw.close();
		}catch(IOException){
			System.out.println("Some IO error occured");
		}
    }
}


