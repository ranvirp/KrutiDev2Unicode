
package my.Kruti2Unicode;

/**
 *
 * @author acer
 */
import java.io.*;

    public class Kruti2uni
    {
        private
                 String[] array_one;
        private String[] array_two;

        public Kruti2uni()
        {

            array_one = new String[]{"Q+Z","sas","aa",")Z","ZZ","‘","’","“","”",
    
    "å",  "ƒ",  "„",   "…",   "†",   "‡",   "ˆ",   "‰",   "Š",   "‹", 
    
    "¶+",   "d+", "[+k","[+", "x+",  "T+",  "t+", "M+", "<+", "Q+", ";+", "j+", "u+",
    "Ùk", "Ù", "ä", "–", "—","é","™","=kk","f=k",  
    
    "à",   "á",    "â",   "ã",   "ºz",  "º",   "í", "{k", "{", "=",  "«",   
    "Nî",   "Vî",    "Bî",   "Mî",   "<î", "|", "K", "}",
    "J",   "Vª",   "Mª",  "<ªª",  "Nª",   "Ø",  "Ý", "nzZ",  "æ", "ç", "Á", "xz", "#", ":",
    
    "v‚","vks",  "vkS",  "vk",    "v",  "b±", "Ã",  "bZ",  "b",  "m",  "Å",  ",s",  ",",   "_",
    
    "ô",  "d", "Dk", "D", "[k", "[", "x","Xk", "X", "Ä", "?k", "?",   "³", 
    "pkS",  "p", "Pk", "P",  "N",  "t", "Tk", "T",  ">", "÷", "¥",
    
    "ê",  "ë",   "V",  "B",   "ì",   "ï", "M+", "<+", "M",  "<", ".k", ".",    
    "r",  "Rk", "R",   "Fk", "F",  ")", "n", "/k", "èk",  "/", "Ë", "è", "u", "Uk", "U",   
    
    "i",  "Ik", "I",   "Q",    "¶",  "c", "Ck",  "C",  "Hk",  "H", "e", "Ek",  "E",
    ";",  "¸",   "j",    "y", "Yk",  "Y",  "G",  "o", "Ok", "O",
    "'k", "'",   "\"k",  "\"",  "l", "Lk",  "L",   "g", 
    
    "È", "z", 
    "Ì", "Í", "Î",  "Ï",  "Ñ",  "Ò",  "Ó",  "Ô",   "Ö",  "Ø",  "Ù","Ük", "Ü",
    
    "‚",    "ks",   "kS",   "k",  "h",    "q",   "w",   "`",    "s",    "S",
    "a",    "¡",    "%",     "W",  "•", "·", "∙", "·", "~j",  "~", "\\","+"," ः",
    "^", "*",  "Þ", "ß", "(", "¼", "½", "¿", "À", "¾", "A", "-", "&", "&", "Œ", "]","~ ","@"};

            array_two = new String[]  {
                                 
                                 "QZ+","sa","a","र्द्ध","Z","\"","\"","'","'",
    
    "०",  "१",  "२",  "३",     "४",   "५",  "६",   "७",   "८",   "९",   
    
    "फ़्",  "क़",  "ख़", "ख़्",  "ग़", "ज़्", "ज़",  "ड़",  "ढ़",   "फ़",  "य़",  "ऱ",  "ऩ",    // one-byte nukta varNas
    "त्त", "त्त्", "क्त",  "दृ",  "कृ","न्न","न्न्","=k","f=",
    
    "ह्न",  "ह्य",  "हृ",  "ह्म",  "ह्र",  "ह्",   "द्द",  "क्ष", "क्ष्", "त्र", "त्र्", 
    "छ्य",  "ट्य",  "ठ्य",  "ड्य",  "ढ्य", "द्य", "ज्ञ", "द्व",
    "श्र",  "ट्र",    "ड्र",    "ढ्र",    "छ्र",   "क्र",  "फ्र", "र्द्र",  "द्र",   "प्र", "प्र",  "ग्र", "रु",  "रू",
    
    "ऑ",   "ओ",  "औ",  "आ",   "अ", "ईं", "ई",  "ई",   "इ",  "उ",   "ऊ",  "ऐ",  "ए", "ऋ",
    
    "क्क", "क", "क", "क्", "ख", "ख्", "ग", "ग", "ग्", "घ", "घ", "घ्", "ङ",
    "चै",  "च", "च", "च्", "छ", "ज", "ज", "ज्",  "झ",  "झ्", "ञ",
    
    "ट्ट",   "ट्ठ",   "ट",   "ठ",   "ड्ड",   "ड्ढ",  "ड़", "ढ़", "ड",   "ढ", "ण", "ण्",   
    "त", "त", "त्", "थ", "थ्",  "द्ध",  "द", "ध", "ध", "ध्", "ध्", "ध्", "न", "न", "न्",    
    
    "प", "प", "प्",  "फ", "फ्",  "ब", "ब", "ब्",  "भ", "भ्",  "म",  "म", "म्",  
    "य", "य्",  "र", "ल", "ल", "ल्",  "ळ",  "व", "व", "व्",   
    "श", "श्",  "ष", "ष्", "स", "स", "स्", "ह", 
    
    "ीं", "्र",    
    "द्द", "ट्ट","ट्ठ","ड्ड","कृ","भ","्य","ड्ढ","झ्","क्र","त्त्","श","श्",
    
    "ॉ",  "ो",   "ौ",   "ा",   "ी",   "ु",   "ू",   "ृ",   "े",   "ै",
    "ं",   "ँ",   "ः",   "ॅ",  "ऽ", "ऽ", "ऽ", "ऽ", "्र",  "्", "?", "़",":",
    "‘",   "’",   "“",   "”",  ";",  "(",    ")",   "{",    "}",   "=", "।", ".", "-",  "µ", "॰", ",","् ","/"};



            //**************************************************************************************
            // The following two characters are to be replaced through proper checking of locations:
            //**************************************************************************************
            // "Ô" 
            // "र्" (reph) 
            //
            // "×"  or "Û"
            // "ि"  
            //**************************************************************************************


            //print implode(",",this->array_one); 
        }
        String Replace_Symbols(String modified_substring)
        {
            //substitute array_two elements in place of corresponding array_one elements
System.out.println(modified_substring);
            if (modified_substring != "")  // if stringto be converted is non-blank then no need of any processing.
            {
                for (int input_symbol_idx = 0; input_symbol_idx < array_one.length; input_symbol_idx++)
                {


                    int idx = 0;  // index of the symbol being searched for replacement

                    while (idx != -1) //while-00
                    {
                        String x = array_one[input_symbol_idx];
                        String y = array_two[input_symbol_idx];

                        modified_substring = modified_substring.replace(x, y);
                        idx = -1;
                        // MessageBox.Show(modified_substring[0]);
                        //modified_substring.i
                        //modified_substring.
                        //idx = modified_substring.IndexOf(array_one[input_symbol_idx]);

                    } // end of while-00 loop
                    // alert(" end of while loop")
                } // end of for loop
                // alert(" end of for loop")

                // alert(" modified substring2 = "+modified_substring)
                modified_substring = modified_substring.replace("±", "Zं"); // at some places  ì  is  used eg  in "कर्कंधु,पूर्णांक".
                //
                //**********************************************************************************
                // Glyp2: Æ
                // code for replacing "f" with "ि" and correcting its position too. (moving it one position forward)
                //**********************************************************************************

                modified_substring = modified_substring.replace("Æ", "र्f");  // at some places  Æ  is  used eg  in "धार्मिक".

                int position_of_i = modified_substring.indexOf("f");
                int sublength = 0;
                String f = "f";
                // stringstream ss;
                //http://stackoverflow.com/questions/137487/-1-vs-false-vs-0
                while ((position_of_i != -1) && (position_of_i+sublength+1 < modified_substring.length()))  //while-02
                {
                    //print position_of_i.":".modified_substring ."<br>";
                    //print position_of_i."<br>";
                    position_of_i += sublength;
                    //print "modified_substring <br>";
                    //string charecter_next_to_i;
                    //="ल";

                    // string::iterator   w = modified_substring.begin() +position_of_i;
                    //uint32_t nextc = utf8::next(w,modified_substring.end());
                    //string charecter_next_to_i ;
                    //ss<<*w;
                    //ss>>charecter_next_to_i;

                   
                    // string charecter_next_to_i = modified_substring.Substring(position_of_i+1 ,3);
                    char charecter_next_to_i = modified_substring.charAt(position_of_i + 1);

                    // string s;
                    //ss<<charecter_next_to_i;
                    //ss>>s;
                    //  s=charecter_next_to_i;
                    //string charecter_next_to_i = modified_substring[position_of_i +4];

                    //string::iterator  i;

                    //string charecter_next_to_i = utf8::next(&modified_substring+position_of_i+1,&modified_substring+position_of_i+2);

                    //  cout<<" is character next to i \n " + "ि" + charecter_next_to_i;
                    String charecter_to_be_replaced = f + charecter_next_to_i;



                    String harshi = "ि";
                    // harshi.insert(0,1,charecter_next_to_i);
                    modified_substring = modified_substring.replace(charecter_to_be_replaced, charecter_next_to_i + harshi);
                    //print "modified_substring <br>";

                    String x = modified_substring.substring(position_of_i + 1);
                    sublength = modified_substring.length() - x.length();
                    position_of_i = x.indexOf("f"); // search for i ahead of the current position.
                    //print "modified_substring <br>";

                } // end of while-02 loop

                //**********************************************************************************
                // Code for Glyph11 : Ø ("िं") 
                // Code for Glyph12 : Ú ("र्िं")
                //   replace Ú with "िं"  and correcting its position too(moving it two positions forward)
                //**********************************************************************************
                modified_substring = modified_substring.replace("Ç", "fa"); ; // at some places  Ç  is  used eg  in "किंकर".
                modified_substring = modified_substring.replace("É", "र्fa"); ; // at some places  É  is  used eg  in "शर्मिंदा"

                position_of_i = modified_substring.indexOf("fa");
                sublength = 0;
                while (position_of_i != -1)  //while-02
                {
                    position_of_i += sublength;
                    char charecter_next_to_ip2 = modified_substring.charAt(position_of_i + 2);
                    String charecter_to_be_replaced = "fa" + charecter_next_to_ip2;
                    modified_substring = modified_substring.replace(charecter_to_be_replaced, charecter_next_to_ip2 + "िं");
                    String x = modified_substring.substring(position_of_i + 2);
                    sublength = modified_substring.length() - x.length();
                    position_of_i = x.indexOf("fa");   // search for i ahead of the current position.

                } // end of while-02 loop


                //**********************************************************************************
                // End of Code for Replacing four Special glyphs
                //**********************************************************************************

                int position_of_wrong_ee = modified_substring.indexOf("ि्");
                sublength = 0;
                while (position_of_wrong_ee != -1)  //while-03
                {
                   try {
                    System.out.println(String.format("%s  %d %d",modified_substring,position_of_wrong_ee,modified_substring.length()));
                    position_of_wrong_ee += sublength;
                    char consonent_next_to_wrong_ee = modified_substring.charAt(position_of_wrong_ee + 2);
                    String charecter_to_be_replaced = "ि्" + consonent_next_to_wrong_ee;
                    modified_substring = modified_substring.replace(charecter_to_be_replaced, "्" + consonent_next_to_wrong_ee + "ि");
                    String x = modified_substring.substring(position_of_wrong_ee + 2);
                    sublength = modified_substring.length() - x.length();
                    position_of_wrong_ee = x.indexOf("ि्"); // search for 'wrong ee' ahead of the current position. 
                   } catch (Exception e){}

                } // end of while-03 loop

                //**************************************
                // 
                //**************************************
                //   alert(modified_substring);
                //**************************************

                // Eliminating reph "Z" and putting 'half - r' at proper position for this.
                String set_of_matras = "अ आ इ ई उ ऊ ए ऐ ओ औ ा ि ी ु ू ृ े ै ो ौ ं : ँ ॅ";
                int position_of_R = modified_substring.indexOf("Z");

                while (position_of_R != -1)  // while-04
                {
                    int probable_position_of_half_r = position_of_R - 1;
                    char charecter_at_probable_position_of_half_r = modified_substring.charAt(probable_position_of_half_r);


                    // trying to find non-maatra position left to current O (ie, half -r).

                    while (set_of_matras.indexOf(charecter_at_probable_position_of_half_r) != -1)  // while-05
                    {
                        probable_position_of_half_r = probable_position_of_half_r - 1;
                        charecter_at_probable_position_of_half_r = modified_substring.charAt(probable_position_of_half_r);

                    } // end of while-05


                    String charecter_to_be_replaced = modified_substring.substring(probable_position_of_half_r, position_of_R );
                    String new_replacement_string = "र्" + charecter_to_be_replaced;
                    charecter_to_be_replaced = charecter_to_be_replaced + "Z";
                    modified_substring = modified_substring.replace(charecter_to_be_replaced, new_replacement_string); ;
                    position_of_R = modified_substring.indexOf("Z");

                } // end of while-04

            } // end of IF  statement  meant to  supress processing of  blank  string.



            return modified_substring;
        } // end of the function  Replace_Symbols
        public String converter(String input)
        {
            //input=utf8_encode(input);
            //print "input <br>";
            String modified_substring;
            // cout<<input;
            //****************************************************************************************
            //  Break the long text into small bunches of max. max_text_size  characters each.
            //****************************************************************************************
            int text_size = input.length();
            // string processed_text = "";  //blank
            //processed_text=utf8_encode(processed_text);
            //**********************************************
            //    alert("text size = "+text_size);
            //**********************************************

            int sthiti1 = 0; int sthiti2 = 0; int chale_chalo = 1;

            int max_text_size = 60000;

            while (chale_chalo == 1)
            {
                sthiti1 = sthiti2;

                if (sthiti2 < (text_size - max_text_size))
                {
                    sthiti2 += max_text_size;
                    while (input.substring(sthiti2, 1) != " ") { sthiti2--; }
                }
                else { sthiti2 = text_size; chale_chalo = 0; }

                //   alert(" sthiti 1 = "+sthiti1); alert(" sthit 2 = "+sthiti2) 

                modified_substring = input.substring(sthiti1, sthiti2);

                modified_substring = Replace_Symbols(modified_substring);

                return modified_substring;

                //****************************************************************************************
                //  Breaking part code over
                //****************************************************************************************
                //  processed_text = processed_text.replace( /mangal/g , "DVB-TTYogeshEN " ) ;   

            }
            //print "Final is processed_text<br>";
            return "";

        }

    }



