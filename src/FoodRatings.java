import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;
class Food{
    int rate;
    String food, cuisine;
    Food(String food, String cuisine, int rate){
        this.food = food;
        this.cuisine = cuisine;
        this.rate = rate;
    }
}
public class FoodRatings {
    Map<String, PriorityQueue<Food>> m = new HashMap<>();
    Map<String, Food> menu = new HashMap<>();
    PriorityQueue<Food> pq = new PriorityQueue<>((a,b)->
            b.rate-a.rate==0 ? a.food.compareTo(b.food) : b.rate-a.rate);
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for(int i = 0; i < foods.length; i++){
            Food fd = new Food(foods[i], cuisines[i], ratings[i]);
            if(m.containsKey(cuisines[i])){
                pq = m.get(cuisines[i]);
                pq.add(fd);
                m.put(cuisines[i], pq);
            }
            else{
                pq.add(fd);
                m.put(cuisines[i], pq);
            }
            menu.put(foods[i], fd);
        }
    }

    public void changeRating(String food, int newRating) {
        Food f = menu.get(food);
        PriorityQueue<Food> fq = m.get(f.cuisine);
        fq.remove(f);
        f.rate = newRating;
        m.put(f.cuisine, fq);
        menu.put(food,f);
    }

    public String highestRated(String cuisine) {
        return m.get(cuisine).peek().food;
    }

    public static void main(String[] args) {
        FoodRatings f = new FoodRatings(new String[]{"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"}, new String[]{"korean", "japanese", "japanese", "greek", "japanese", "korean"}, new int[]{9, 12, 8, 15, 14, 7});
        System.out.println(f.highestRated("korean"));
    }
}
