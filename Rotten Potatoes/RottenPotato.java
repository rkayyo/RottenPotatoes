public class RottenPotato {

    public static void main(String[] args) {

        int[][] ratings = { {4,6,2,5},
                            {7,9,4,8},
                            {6,9,3,7} };

        System.out.println("Movie zero's average rating: " + movieAvgRating(ratings, 0));                    
        System.out.println("Movie one's average rating: " + movieAvgRating(ratings, 1));    
        System.out.println("Reviewer zero's average rating: " + reviewerAvgRating(ratings, 0));    
        System.out.println("Reviewer one's average rating: " + reviewerAvgRating(ratings, 1));
        System.out.println("Average rating for all movies in 2018: " + avgRating2018(ratings));    
        System.out.println("Hardest reviewer is #" + hardestReviewer2018(ratings));
        System.out.println("Worst movie is #" + worstMovie2018(ratings));
    }

    //Question 1
    public static double movieAvgRating(int[][] ratings, int movie) {
        double sum = 0;
        double answer = 0;
            for(int c = 0; c < ratings[0].length; c++){
                sum += ratings[movie][c];
            }
            answer = sum /= ratings[0].length-1;
            return answer;
        }  
    //Question 2
    public static double reviewerAvgRating(int[][] ratings,int reviewer) {
        double sum = 0;
        double answer = 0;
        for(int r = 0; r <ratings.length; r++){
            sum += ratings[r][reviewer];
        }
        answer = sum /= ratings.length-1;
        return answer;
    }

    //Question 3
    public static double avgRating2018(int[][] ratings) {
        double sum = 0;
        double answer;
        for(int r = 0; r<ratings.length;r++){
            for(int c = 0; c<ratings[0].length;c++){
             sum += ratings[r][c];   
            }
            
        }
        answer = sum /= ratings[ratings.length-1][ratings[0].length-1];
        return answer;
    }

    //Question 4
    public static int hardestReviewer2018(int[][] ratings) {
        int sum = 0;
        int smallestSum = 0;
        int smallestReviewer = 0;
        for(int r = 0; r < ratings.length; r++){
            if(sum < smallestSum) smallestSum = sum;
            sum = 0;
            smallestReviewer = r;
            for(int c = 0; c< ratings[0].length; c++){
                sum += ratings[r][c];
            }
    }
    return smallestReviewer;
}

    //question 5
    public static int worstMovie2018(int[][] ratings) {
        int sum = 0;
        int lowestMovie = 0;
        int worstMovie = 0;
        for(int r = 0; r < ratings.length; r++){
            if(sum < lowestMovie)lowestMovie = sum;
            sum = 0;
            worstMovie = r;
            for(int c = 0; c< ratings[0].length; c++){
                sum += ratings[r][c];
            }
    }
    return worstMovie;
    }   
}