package ObjectOrientedPrograming_Part2.Polymorphism;

class Movie {
    private String name;

    public String getName() {
        return this.name;
    }

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "no plot here";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "Jaws eats people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Will Smith saves the world";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Running around mazes";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "In a galaxy far far away.. imperial forces try to take over the universe";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Independence Day");
    }
    //no plot method:
}

public class Main {
    public static void main(String[] args) {
        //polymorphism demo:
        for(int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie # is " + i +
                    " and the name is " + movie.getName() + "\n" +
                    //assign different functionality depending on the type of object
                    //this is how polymorphism works!
                    "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        //returns a number between 0 and 4 then we are adding 1 to that answer.
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgettable();

        }
        return null;
    }
}
