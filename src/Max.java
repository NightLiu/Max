/**
 * Created by Jack on 2017/4/28.
 */
public class Max {

    public int max_unique_substring(char[] str){
        int maxlen = 0;
        int begin = 0;
        int n = str.length;
        for(int i = 0; i < n; ++i){
            for(int j = i+1; j < n; ++j){
                int flag = 0;
                for(int m = i; m < j; ++m){
                    for(int k = m+1; k < j; ++k){
                        if(str[m] == str[k]){
                            flag = 1;
                            break;
                        }
                    }
                    if(1 == flag) break;
                }
                if(0 == flag && j-i+1 > maxlen){
                    maxlen = j-i+1;
                    begin = i;
                }
            }

        }
        StringBuffer s = new StringBuffer();
        for(int g = 0; g < n; ++g){
            s.append(str[g]);
        }
        System.out.println(s.toString().substring(begin,begin+maxlen)+","+maxlen+","+ begin +","+(begin+maxlen));
        return maxlen;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Max max = new Max();
        char[] s = {'a','b','c','d','e','f','a','b','c','d','e','f'};
        char[] t = {};
        char[] u = {'a','b', 'c'};
        char[] v = {'b','b','b','b','b'};
        char[] w = {'c','a','b','c','b'};
        max.max_unique_substring(s);
        max.max_unique_substring(t);
        max.max_unique_substring(u);
        max.max_unique_substring(v);
        max.max_unique_substring(w);
    }



}