import java.util.*;

/*
* Finding the Shortest Path Between Two Stations
You are tasked with designing a system to find the shortest path between two train stations in a network. The system is based on a graph, where each station is a node, and there is an edge between two stations if there is a direct train route between them.
You are given the following two classes:
Station Class:
The Station class has:
A name (String) representing the station's name.
A list of adjacent stations (List ‹Station> adjacentStations), which are the stations directly connected to this station.
TrainMap Class:
The TrainMap class has:
A map (Map<String, Station» trainMap) to store train stations by their names_Each entry consists of a rain name (key) and the corresponding Station object (value).
A method getStation(String trainName) to get the Station by its name.
Assumptions:
The network of stations is connected, i.e., there exists a path between any two stations.
Each station can only be visited once in a given path (i.e.,, no loops).
There could be multiple paths between the two stations , but you need to return the shortest one
* */

class Station{
    String name;
    List<Station> adjacentStations;

    public Station(String name){
        this.name=name;
        this.adjacentStations=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Station> getAdjacentStations() {
        return adjacentStations;
    }

    public void addAdjacentStations(Station station) {
        adjacentStations.add(station);
    }
}

class TreeMap{
    Map<String,Station> trainMap;

    public TreeMap(){
        this.trainMap=new HashMap<>();
    }

    public Station getStation(String name){
        return trainMap.get(name);
    }

    public void addStation(String name){
        trainMap.putIfAbsent(name,new Station(name));
    }

    public void connectStations(String name1,String name2){
        Station station1=trainMap.get(name1);
        Station station2=trainMap.get(name2);
        if(station1!=null&&station2!=null){
            station1.addAdjacentStations(station2);
            station2.addAdjacentStations(station1);
        }
    }

    public List<Station> findShortestPath(String startName,String endName){
        Station start=getStation(startName);
        Station end=getStation(endName);

        if(start==null||end==null)
            return null;
        Map<Station,Station> parentMap=new HashMap<>();
        Set<Station> visited=new HashSet<>();
        Queue<Station> queue=new LinkedList<>();

        queue.offer(start);
        visited.add(start);

        while(!queue.isEmpty()){
            Station current=queue.poll();
            if(current.equals(end))
                break;
            for(Station nextStation:current.getAdjacentStations()){
                if(!visited.contains(nextStation)){
                    visited.add(nextStation);
                    parentMap.put(nextStation,current);
                    queue.offer(nextStation);
                }
            }
        }

        List<Station> path=new LinkedList<>();
        for(Station at=end;at!=null;at=parentMap.get(at)){
            path.add(0,at);
        }

        if(!path.isEmpty()&&path.get(0).equals(start)){
            return path;
        }else {
            return null;
        }
    }
}
public class ShortestPathTwoStation {
    public static void main(String[] args) {
        TreeMap map=new TreeMap();
        map.addStation("A");
        map.addStation("B");
        map.addStation("C");
        map.addStation("D");
        map.addStation("E");

        map.connectStations("A","B");
        map.connectStations("B","C");
        map.connectStations("B","D");
        map.connectStations("D","E");
        map.connectStations("D","B");

        List<Station> path=map.findShortestPath("A","E");

        if(path!=null){
            System.out.println("Shortest Path: ");
            for (Station station:path){
                System.out.print(station.getName()+" ");
            }
        }else {
            System.out.println("No path found.");
        }

    }
}
