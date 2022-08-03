package zadachi.den12;


import org.jetbrains.annotations.Nullable;

import java.time.LocalDate;
import java.util.*;

public class MusicBand  {
    private String groupName;
    private   List<Participants> participantsList;
    @Nullable
    private Integer Year;

    public MusicBand() {
    }
//  Participants participants;

    public MusicBand(String groupName, int Year, List<Participants> participantsList) {
        this.groupName = groupName;
        this.Year = Year;

        this.participantsList = new ArrayList<>(participantsList);
    }

    public MusicBand(Object b) {
    }

    public List<Participants> getParticipantsList() {
        return participantsList;
    }

    public void setParticipantsList(List<Participants> participantsList) {
        this.participantsList = participantsList;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(Integer year) {
        this.Year = year;
    }

@Nullable

public static MusicBand transferMembers(MusicBand b, MusicBand z) {

    b.getParticipantsList().addAll(z.getParticipantsList());
    b.setGroupName(b.getGroupName().substring(0,3) + z.groupName.substring(0,3));

 MusicBand v = new MusicBand(b.getGroupName(),LocalDate.now().getYear(),b.getParticipantsList());

    b.setParticipantsList(null);b.setGroupName(null);b.setYear(null);
    z.setParticipantsList(null);z.setGroupName(null);z.setYear(null);


   return v;
    }


    @Override
    public String toString() {
        return "MusicBand{" +
                "groupName='" + groupName + '\'' +
                ", participantName=" + participantsList +
                ", Year=" + Year +
                '}';
    }

    public static class Participants{
        String name;
        String surname;

    public Participants(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

        @Override
        public String toString() {
            return "Participants{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
    }


}

class Test {
    public static void main(String[] args) {
        List<MusicBand> musicBandList = new ArrayList<>();

        Collections.addAll(musicBandList,
                new MusicBand("Caramell", 1993, List.of(new MusicBand.Participants("Bob", "Marley"))),


                new MusicBand("Manau", 1998, List.of(new MusicBand.Participants("Antony", "Fred"))),
                new MusicBand("Celesty", 1999, List.of(new MusicBand.Participants("Nikolay", "Bascov"))),
                new MusicBand("Converter", 1997, List.of(new MusicBand.Participants("Antony", "Hopkings"))),
                new MusicBand("Metric", 2003, List.of(new MusicBand.Participants("Lary", "Kingsly"))),
                new MusicBand("Maroon", 2007, List.of(new MusicBand.Participants("Helen", "Gardner"))),
                new MusicBand("Lustra", 2005,Arrays.asList(new MusicBand.Participants("Jamy","Jackson"))),
                new MusicBand("Mnemic", 2007, Arrays.asList(new MusicBand.Participants ("Emyli", "Hamilton"))),
                new MusicBand("Mnemic", 2007, Arrays.asList(new MusicBand.Participants ("Emyli", "Hamilton"))),
                new MusicBand("Mnemic", 2007, Arrays.asList(new MusicBand.Participants ("Emyli", "Hamilton"))),
                new MusicBand("Mnemic", 2007, Arrays.asList(new MusicBand.Participants ("Emyli", "Hamilton"))),
                new MusicBand("Le Tigre", 2003,Arrays.asList(new MusicBand.Participants("Fred","Lee"))));

        Collections.shuffle(musicBandList);
        System.out.println(groupAfter2000(musicBandList));
        System.out.println();
      MusicBand low =  new MusicBand("Low", 2005,Arrays.asList(new MusicBand.Participants("Recma","Ashley")));
      MusicBand dfsfs = new MusicBand("dfsfs", 2008,Arrays.asList(new MusicBand.Participants("Jeremy","Fredy")));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(dfsfs);
        System.out.println();
        System.out.println(low);
        System.out.println();
        System.out.println(MusicBand.transferMembers(low,dfsfs));
        System.out.println();
        System.out.println(dfsfs);
        System.out.println();
        System.out.println(low);

    }

@Nullable
    public static List<MusicBand> groupAfter2000(List<MusicBand> musicBandList) {
        List<MusicBand> groupAfter2000 = new ArrayList<>();
        for (MusicBand band : musicBandList) {
            if (band.getYear() >= 2000){
            groupAfter2000.add(band);
            }
        }
        return groupAfter2000;
    }
}
