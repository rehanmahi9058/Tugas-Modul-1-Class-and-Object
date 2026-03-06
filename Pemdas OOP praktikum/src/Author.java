public class Author {

    String[] nama = new String[3];

    Author(){}

    Author(String nama){
        String[] temp = nama.split("&");
        for(int i = 0;i<temp.length;i++){
            this.nama[i] = temp[i].trim();
        }
    }

    public void displayAuthor(){
        System.out.print("Author: ");
        for (int i=0;i<nama.length-1;i++){
            if(nama[i]==null){
            } else {
                System.out.print(nama[i]);
            }

            if(nama[i+1]==null||i==nama.length-2){
            } else{
                System.out.print(", ");
            }
            
        }
        System.out.println();
    }
    
}
