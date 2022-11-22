package map;

import java.util.*;

public class Weather {
    public static List<Info> editData(List<Info> list) {
        List<Info> rsl = new ArrayList<>();
        Map<String, Integer> data = new HashMap<>();
        for (Info it : list) {
            data.computeIfPresent(it.getCity(), (key, value) -> value + it.getRainfall());
            data.putIfAbsent(it.getCity(), it.getRainfall());
        }
        for (String it : data.keySet()) {
            rsl.add(new Info(it, data.get(it)));
        }
         rsl.sort(new Comparator<Info>() {
            @Override
            public int compare(Info o1, Info o2) {
                return o2.getRainfall() - o1.getRainfall();
            }
        });
        return rsl;
    }

    public static class Info {
        private String city;

        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall &&
                    Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }
    }
}