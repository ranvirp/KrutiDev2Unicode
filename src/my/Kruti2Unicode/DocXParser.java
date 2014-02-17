/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.Kruti2Unicode;

/**
 *
 * @author acer
 */
import java.io.*;
import java.io.File;   
  import java.io.FileOutputStream;   
  import org.apache.poi.xwpf.usermodel.XWPFDocument;   
  import org.apache.poi.xwpf.usermodel.XWPFParagraph;   
  import org.apache.poi.xwpf.usermodel.XWPFRun; 
import org.apache.poi.xwpf.converter.core.styles.XWPFStylesDocument;
import org.apache.poi.xwpf.converter.core.styles.run.RunFontFamilyValueProvider;
import java.util.*;
//import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;
//import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;
public class DocXParser {
    public void parseDocX(String filename)   
         throws Exception {  
        try {
            Kruti2uni kr = new Kruti2uni();
        FileInputStream fis = new FileInputStream(filename);
        
        RunFontFamilyValueProvider rffvp = RunFontFamilyValueProvider.INSTANCE;
        
       XWPFDocument document = new XWPFDocument(fis);  
       XWPFStylesDocument stylesdoc = new XWPFStylesDocument(document);
       List l = document.getParagraphs();
       ListIterator paras = l.listIterator();
       int paraIndex=-1;
       int runIndex=-1;
       while (paras.hasNext())
       {
          XWPFParagraph para = (XWPFParagraph) paras.next();
          List<XWPFRun> runsList=para.getRuns();
          
         // ListIterator runs = runsList.listIterator();
          paraIndex++;
          int prevKruti=0;
          int krutiBegin=0;
          String krutiText="";
         for  (XWPFRun run:runsList)
          {
              runIndex++;
              //XWPFRun run =(XWPFRun)runs.next();
              String font=rffvp.getValue(run,stylesdoc);
             
             // CTR runctr = run.getCTR();
             
              //CTRPr pr = runctr.getRPr();
             // pr.dump();
            //  runctr.dump();
            //  if (pr!=null){
              //System.out.println(pr.getRFonts().xmlText());
            //  }
             // else 
             // {
                System.out.println(font);  
             // }
             // run.setText("We have discovered this");
               
              if (font!=null)
              {
                 if (font.toLowerCase().startsWith("kruti"))
                 {
                   // para.removeRun(runIndex);
                    //XWPFRun runNew = (XWPFRun) runsList.get(runIndex);
                      String xwpfRunText = run.getText(run.getTextPosition());
                     
                       krutiText+=xwpfRunText;
                       //document.getParagraphArray(paraIndex).removeRun(runIndex);
                       
                       prevKruti=1; 
                    
                  // para.addRun(run);
                 
                 } else 
                 {
                    
                     if (prevKruti==1)
                     {
                        // XWPFRun runNew = para.createRun();
                         String uniText=kr.converter(krutiText);
                         //runNew.setText(uniText);
                         System.out.println(uniText);
                         // document.getParagraphArray(paraIndex).addRun(runNew);
                         //paras.add(runNew);
                         
                         
                     }
                     prevKruti=0;
                         krutiText="";
                 }
              }
              if (prevKruti==1)
                     {
                        // XWPFRun runNew = para.createRun();
                         String uniText=kr.converter(krutiText);
                        // runNew.setText(uniText);
                         System.out.println(uniText);
                         //para.addRun(runNew);
                         prevKruti=0;
                         krutiText="";
                         
                     }
          }
          
       }
       
      //  FileOutputStream fos = new FileOutputStream("d:/test_unicode.docx");
      //document.write(fos);
      //fos.close();
      fis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
      
    }   
    public static void main(String[] args) throws Exception {   
         DocXParser app = new DocXParser();  
         
         app.parseDocX("d:/test.docx");   

    }    
}
