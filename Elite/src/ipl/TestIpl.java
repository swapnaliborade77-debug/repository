package ipl;

public class TestIpl {

    public static void main(String[] args) {


        IPLData rcb = new Team("Royal Challengers Bangalore");

        IPLData mi = new Team("Mumbai Indians");

        IPLData csk = new Team("Chennai Super Kings");


        rcb.addPlayers(
                new Players("Virat",18.00),
                new Players("Rajat",10.00),
                new Players("Bhuvaneshwar",12.00)
        );


        mi.addPlayers(
                new Players("Rohit",18.00),
                new Players("Surya",10.00),
                new Players("Bumrah",12.00)
        );


        csk.addPlayers(
                new Players("M S Dhoni",18.00),
                new Players("Ruturaj",10.00),
                new Players("Kamboj",12.00)
        );


        rcb.getInfo();


        System.out.println("Find Player:");
        System.out.println(mi.Find("Rohit"));


        csk.getInfo();


        csk.RemovePlayer("Ruturaj");


        System.out.println("After Removing:");
        csk.getInfo();
    }
}