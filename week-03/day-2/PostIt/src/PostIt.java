public class PostIt {
    //    Create a PostIt class that has
//            a backgroundColor
//            a text on it
//            a textColor
//            Create a few example post-it objects:
//    an orange with blue text: "Idea 1"
//    a pink with black text: "Awesome"
//    a yellow with green text: "Superb!"
    public static void main(String[] args) {
        PostItCreator example1 = new PostItCreator("Orange", "Idea1", "Blue");
        PostItCreator example2 = new PostItCreator("Pink", "Awesome", "Black");
        PostItCreator example3 = new PostItCreator("Yellow", "Superb!", "Green");
    }
}
