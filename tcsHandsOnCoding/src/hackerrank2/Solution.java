package hackerrank2;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
        public static void swap(Document[] doc,int i,int j){
            Document temp = doc[i];
            doc[i] = doc[j];
            doc[j] = temp;
        }
        public static Document[] docsWithOddPages(Document[] doc) {
        int count=0;
        for(int i=0;i<doc.length;i++) {
            if(doc[i].getPages() %2==0) {
                count++;
            }
        }
        if(count==0) return null;
        Document[] res = new Document[count];
        int j=0;
        for (Document document : doc) {
            if (document.getPages()%2!=0) {
                res[j++]=document;
            }
        }
        for (int i = 0; i < res.length; i++) {
            for (int k = i+1; k < res.length; k++) {
               if (res[k]!=null && res[i]!=null) {
                    if (res[i].getId()>res[k].getId()) {
                    swap(res,i,k);
                }
               }
            }
        }
        return res;
    }
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        Document[] doc = new Document[4];
        for (int i = 0; i < doc.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String t = sc.nextLine();
            String fN = sc.nextLine();
            int pg = sc.nextInt();
            doc[i] = new Document(id, t, fN, pg);
        }
        Document[] res = docsWithOddPages(doc);
        if (res != null) {
               for (Document document : res) {
                   if (document!=null) {
                       System.out.println(document.getId() + " "+ document.getTitle()+" "+document.getFolderName()+ " "+ document.getPages());
                   }
        }
        }else{
            System.out.println("No Such Document");
        }
    }
}

class Document
{
    int id;
    String title;
    String folderName;
    int pages;
    public Document(int id, String title, String folderName, int pages) {
        super();
        this.id = id;
        this.title = title;
        this.folderName = folderName;
        this.pages = pages;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getFolderName() {
        return folderName;
    }
    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
 
}