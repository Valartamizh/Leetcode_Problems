class Solution {
    String q(int h){
        String a="";
        for(int i=0;i<h;i++)a+=" ";
        return a;
    }
    int x(String[] a){
        int b=0;
        for(String s:a)b+=s.length();
        return b;
    }
    public List<String> fullJustify(String[] w, int m) {
        List<String> s=new ArrayList<>();
        int i=0,e=w.length;
        for(i=0;i<e;){
            String a="";
            for(;i<e&&(a+w[i]).length()<=m;i++)a+=w[i]+" ";
            a=a.trim();
            String l[];
            int k=(l=a.split(" ")).length,b=m-a.length();
            if(i==e||k==1)s.add(a+q(b));
            else if(k==2)s.add(l[0]+q(b+1)+l[1]);
            else {int v=x(l);
                r:while(v<=m)
                for(int p=0;p<l.length-1;p++){
                    l[p]+=" ";v++;
                    if(v==m)break r;
            }
            a="";
            for(String u:l)a+=u;
            s.add(a);
            }
        }
        return s;
    }
}