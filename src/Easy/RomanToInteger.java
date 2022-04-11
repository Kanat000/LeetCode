package Easy;

public class RomanToInteger {
    public static int romanToInt(String s) {
        char[] charArr = s.toCharArray();
        int integer = 0;
        for(int i=0;i<charArr.length;i++){
            boolean isFour = false,isNine = false,isFourty = false,isNinety=false,
                    isFourHundred=false,isNineHundred = false;
            if(i<charArr.length-1){
                isFour = charArr[i + 1] == 'V';
                isNine = charArr[i + 1] == 'X';

                isFourty = charArr[i + 1] == 'L';
                isNinety = charArr[i + 1] == 'C';

                isFourHundred = charArr[i + 1] == 'D';
                isNineHundred = charArr[i + 1] == 'M';
            }

            switch (charArr[i]){

                case 'I':
                    if (isFour){
                        integer +=4;
                        i++;
                    }
                    else if (isNine) {
                        integer += 9;
                        i++;
                    }
                    else integer +=1;
                    break;
                case 'V': integer +=5;break;
                case 'X':
                    if (isFourty) {
                        integer += 40;
                        i++;
                    }
                    else if (isNinety) {
                        integer += 90;
                        i++;
                    }
                    else
                        integer +=10;
                    break;
                case 'L':
                    integer +=50;break;
                case 'C':
                    if (isFourHundred) {
                        integer += 400;
                        i++;
                    }
                    else if (isNineHundred) {
                        integer += 900;
                        i++;
                    }
                    else
                        integer +=100;
                    break;
                case 'D':
                    integer += 500;
                    break;
                case 'M':
                    integer +=1000;
                    break;

            }

        }
        return integer;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("DC"));
    }
}
