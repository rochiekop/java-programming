package pzn.classes;

import java.util.Objects;

public class ObjectsApp {
    public static void main(String[] args) {
        execute(new Data("Data"));
    }

    public static class Data{
        private String data;

        public Data(String data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Data data1 = (Data) o;
            return Objects.equals(data, data1.data);
        }

        @Override
        public String toString() {
            return "Data{" +
                    "data='" + data + '\'' +
                    '}';
        }

        @Override
        public int hashCode() {
            return Objects.hash(data);
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
    }

    public static void execute(Data data){

        /**
         * Will Facing null pointer
         */
        System.out.println(data.toString());
        System.out.println(data.hashCode());
        data.getData();

        /**
         * Prevent null pointer exception
         */
        System.out.println(Objects.toString(data));
        System.out.println(Objects.hashCode(data));
    }

}
