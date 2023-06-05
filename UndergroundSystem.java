import java.util.HashMap;
import java.util.Map;

class UndergroundSystem {
    private Map<Integer, CheckInRecord> checkIns;
    private Map<String, TravelStats> travelStats;

    public UndergroundSystem() {
        checkIns = new HashMap<>();
        travelStats = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new CheckInRecord(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckInRecord checkInRecord = checkIns.get(id);
        String route = getRouteString(checkInRecord.stationName, stationName);
        int travelTime = t - checkInRecord.time;

        // Update travel statistics for the route
        if (travelStats.containsKey(route)) {
            TravelStats stats = travelStats.get(route);
            stats.totalTime += travelTime;
            stats.count++;
        } else {
            travelStats.put(route, new TravelStats(travelTime, 1));
        }

        checkIns.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {
        String route = getRouteString(startStation, endStation);
        TravelStats stats = travelStats.get(route);
        return (double) stats.totalTime / stats.count;
    }

    private String getRouteString(String startStation, String endStation) {
        return startStation + "->" + endStation;
    }

    private static class CheckInRecord {
        private String stationName;
        private int time;

        public CheckInRecord(String stationName, int time) {
            this.stationName = stationName;
            this.time = time;
        }
    }


    private static class TravelStats {
        private int totalTime;
        private int count;

        public TravelStats(int totalTime, int count) {
            this.totalTime = totalTime;
            this.count = count;
        }
    }
}
