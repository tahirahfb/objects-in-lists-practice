import java.util.*;

public class TvShowMain {
    public static void main(String[] args){
        Scanner showDetails = new Scanner(System.in);
        ArrayList<TvShow> listOfShows = new ArrayList<>();

        System.out.println("TV Show List:");
        System.out.println("Notice: Entering nothing will stop the list!");

        while(true){
            System.out.println("Name a TV show:");
            String showName = showDetails.nextLine();

            if(showName.isBlank()){
                break;
            }

            System.out.println("How many episodes?");
            int numOfEpisodes = Integer.valueOf(showDetails.nextLine());
            System.out.println("What is the genre?");
            String genre = showDetails.nextLine();


            listOfShows.add(new TvShow(showName, numOfEpisodes, genre));
        }

        for (TvShow list : listOfShows){
            System.out.println(list.toString());
        }

        showDetails.close();
    }
    
}
