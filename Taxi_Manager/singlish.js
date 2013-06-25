var text;
var nVowels;
var consonants= new Array()
var consonantsUni= new Array()
var vowels= new Array()
var vowelsUni= new Array()
var vowelModifiersUni= new Array()
var specialConsonants= new Array()
var specialConsonantsUni= new Array()
var specialCharUni= new Array()
var specialChar= new Array()


    vowelsUni[0]='?';    vowels[0]='oo';    vowelModifiersUni[0]='?';
    vowelsUni[1]='?';    vowels[1]='o\\)';    vowelModifiersUni[1]='?';
    vowelsUni[2]='?';    vowels[2]='oe';    vowelModifiersUni[2]='?';
    vowelsUni[3]='?';    vowels[3]='aa';    vowelModifiersUni[3]='?';
    vowelsUni[4]='?';    vowels[4]='a\\)';    vowelModifiersUni[4]='?';
    vowelsUni[5]='?';    vowels[5]='Aa';    vowelModifiersUni[5]='?';
    vowelsUni[6]='?';    vowels[6]='A\\)';    vowelModifiersUni[6]='?';
    vowelsUni[7]='?';    vowels[7]='ae';    vowelModifiersUni[7]='?';
    vowelsUni[8]='?';    vowels[8]='ii';    vowelModifiersUni[8]='?';
    vowelsUni[9]='?';    vowels[9]='i\\)';    vowelModifiersUni[9]='?';
    vowelsUni[10]='?';    vowels[10]='ie';    vowelModifiersUni[10]='?';
    vowelsUni[11]='?';    vowels[11]='ee';    vowelModifiersUni[11]='?';
    vowelsUni[12]='?';    vowels[12]='ea';    vowelModifiersUni[12]='?';
    vowelsUni[13]='?';    vowels[13]='e\\)';    vowelModifiersUni[13]='?';
    vowelsUni[14]='?';    vowels[14]='ei';    vowelModifiersUni[14]='?';
    vowelsUni[15]='?';    vowels[15]='uu';    vowelModifiersUni[15]='?';
    vowelsUni[16]='?';    vowels[16]='u\\)';    vowelModifiersUni[16]='?';
    vowelsUni[17]='?';    vowels[17]='au';    vowelModifiersUni[17]='?';
    vowelsUni[18]='?';    vowels[18]='/\a';    vowelModifiersUni[18]='?';
    
    vowelsUni[19]='?';    vowels[19]='a';    vowelModifiersUni[19]='';
    vowelsUni[20]='?';    vowels[20]='A';    vowelModifiersUni[20]='?';
    vowelsUni[21]='?';    vowels[21]='i';    vowelModifiersUni[21]='?';
    vowelsUni[22]='?';    vowels[22]='e';    vowelModifiersUni[22]='?';
    vowelsUni[23]='?';    vowels[23]='u';    vowelModifiersUni[23]='?';
    vowelsUni[24]='?';    vowels[24]='o';    vowelModifiersUni[24]='?';
    vowelsUni[25]='?';    vowels[25]='I';    vowelModifiersUni[25]='?';
    nVowels=26;

    specialConsonantsUni[0]='?'; specialConsonants[0]=/\\n/g;
    specialConsonantsUni[1]='?'; specialConsonants[1]=/\\h/g;
    specialConsonantsUni[2]='?'; specialConsonants[2]=/\\N/g;
    specialConsonantsUni[3]='?'; specialConsonants[3]=/\\R/g;
    //special characher Repaya
    specialConsonantsUni[4]='??'+'\u200D'; specialConsonants[4]=/R/g;
    specialConsonantsUni[5]='??'+'\u200D'; specialConsonants[5]=/\\r/g;
    
    consonantsUni[0]='?'; consonants[0]='nnd';
    consonantsUni[1]='?'; consonants[1]='nndh';
    consonantsUni[2]='?'; consonants[2]='nng';
    consonantsUni[3]='?'; consonants[3]='th';
    consonantsUni[4]='?'; consonants[4]='dh';
    consonantsUni[5]='?'; consonants[5]='gh';
    consonantsUni[6]='?'; consonants[6]='ch';
    consonantsUni[7]='?'; consonants[7]='ph';
    consonantsUni[8]='?'; consonants[8]='bh';
    consonantsUni[9]='?'; consonants[9]='jh';
    consonantsUni[10]='?'; consonants[10]='sh';
    consonantsUni[11]='?'; consonants[11]='GN';
    consonantsUni[12]='?'; consonants[12]='KN';
    consonantsUni[13]='??'; consonants[13]='Lu';
    consonantsUni[14]='?'; consonants[14]='kh';
    consonantsUni[15]='?'; consonants[15]='Th';
    consonantsUni[16]='?'; consonants[16]='Dh';
    
    consonantsUni[17]='?'; consonants[17]='S';
    consonantsUni[18]='?'; consonants[18]='d';
    consonantsUni[19]='?'; consonants[19]='c';
    consonantsUni[20]='?'; consonants[20]='t';
    consonantsUni[21]='?'; consonants[21]='T';
    consonantsUni[22]='?'; consonants[22]='k';
    consonantsUni[23]='?'; consonants[23]='D';
    consonantsUni[24]='?'; consonants[24]='n';
    consonantsUni[25]='?'; consonants[25]='p';
    consonantsUni[26]='?'; consonants[26]='b';
    consonantsUni[27]='?'; consonants[27]='m';
    consonantsUni[28]='??'; consonants[28]='\\u005C' + 'y';
    consonantsUni[29]='??'; consonants[29]='Y';
    consonantsUni[30]='?'; consonants[30]='y';
    consonantsUni[31]='?'; consonants[31]='j';
    consonantsUni[32]='?'; consonants[32]='l';
    consonantsUni[33]='?'; consonants[33]='v';
    consonantsUni[34]='?'; consonants[34]='w';
    consonantsUni[35]='?'; consonants[35]='s';
    consonantsUni[36]='?'; consonants[36]='h';
    consonantsUni[37]='?'; consonants[37]='N';
    consonantsUni[38]='?'; consonants[38]='L';
    consonantsUni[39]='?'; consonants[39]='K';
    consonantsUni[40]='?'; consonants[40]='G';
    consonantsUni[41]='?'; consonants[41]='P';
    consonantsUni[42]='?'; consonants[42]='B';
    consonantsUni[43]='?'; consonants[43]='f';
    consonantsUni[44]='?'; consonants[44]='g';
    //last because we need to ommit this in dealing with Rakaransha
    consonantsUni[45]='?'; consonants[45]='r'; 
    
    specialCharUni[0]='?'; specialChar[0]='ruu';
    specialCharUni[1]='?'; specialChar[1]='ru';
    //specialCharUni[2]='???'; specialChar[2]='ra';


function startText() {
    var s,r,v;
    text = document.txtBox.box1.value;  
      
    //special consonents
    for (var i=0; i<specialConsonants.length; i++)
        text = text.replace(specialConsonants[i], specialConsonantsUni[i]);
   
    //consonents + special Chars
    for (var i=0; i<specialCharUni.length; i++){
        for (var j=0;j<consonants.length;j++){
            s = consonants[j] + specialChar[i];
            v = consonantsUni[j] + specialCharUni[i];
            r = new RegExp(s,"g");
            text = text.replace(r, v);
        }
    }
    //consonants + Rakaransha + vowel modifiers
    for (var j=0;j<consonants.length;j++){
        for (var i=0;i<vowels.length;i++){
            s = consonants[j] + "r" + vowels[i];
            v = consonantsUni[j] + "???" + vowelModifiersUni[i];
            r = new RegExp(s,"g");
            text = text.replace(r, v);
        }
        s = consonants[j] + "r";
        v = consonantsUni[j] + "???";
        r = new RegExp(s,"g");
        text = text.replace(r, v);
    }
    //consonents + vowel modifiers
    for (var i=0;i<consonants.length;i++){
        for (var j=0;j<nVowels;j++){ 
            s = consonants[i]+vowels[j];
            v = consonantsUni[i] + vowelModifiersUni[j];
            r = new RegExp(s,"g");
            text = text.replace(r, v);
        }
    }

    //consonents + HAL
    for (var i=0; i<consonants.length; i++){
        r = new RegExp(consonants[i],"g");
        text = text.replace(r, consonantsUni[i]+"?");
    }
        
    //vowels
    for (var i=0; i<vowels.length; i++){
        r = new RegExp(vowels[i],"g");
        text = text.replace(r, vowelsUni[i]);
    }

    document.txtBox.box2.value=text;
}

