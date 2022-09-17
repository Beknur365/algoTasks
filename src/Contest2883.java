public class Contest2883 {
    public String minimizeResult(String expression) {
        String left = expression.split("\\+")[0], right = expression.split("\\+")[1], res = "";
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < left.length(); i++){
            int l = left.substring(0, i).length() > 0 ? Integer.parseInt(left.substring(0, i)) : 1;
            int l1 = left.substring(i).length() > 0  ? Integer.parseInt(left.substring(i)) : 0;
            for(int j = 0; j <= right.length(); j++){
                int r = right.substring(0, j).length() > 0 ? Integer.parseInt(right.substring(0, j)) : 0;
                int r1 = right.substring(j).length() > 0  ? Integer.parseInt(right.substring(j)) : 1;
                if(min > l*(l1 + r) * r1){
                    min = l * (l1 + r) * r1;
                    if(left.substring(i).length() > 0 && right.substring(0, j).length() > 0){
                        res = left.substring(0, i)  + "(" + left.substring(i) +"+" + right.substring(0, j) +")" + right.substring(j);
                    }
                    else if(left.substring(i).length() == 0 && right.substring(0, j).length() > 0){
                        res = "(" + left.substring(0, i)  + "+" + right.substring(0, j) +")" + right.substring(j);
                    }
                    else if(left.substring(i).length() > 0 && right.substring(0, j).length() == 0){
                        res = left.substring(0, i)  + "(" + left.substring(i) +"+" + right.substring(j)+")";
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Contest2883 c = new Contest2883();
        System.out.println(c.minimizeResult("999+999"));
    }
}
