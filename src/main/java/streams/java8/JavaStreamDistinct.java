package streams.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamDistinct {

    public static void main(String args[]){
        List<Integer> list = List.of(10, 20, 30, 40, 30, 20, 10,10);
        List<Data> listObjetosData = List.of(new Data(10),new Data(20),new Data(10),new Data(10));

        List<Data> dataList = new ArrayList<>();
        dataList.add(new Data(10));
        dataList.add(new Data(20));
        dataList.add(new Data(10));
        dataList.add(new Data(10));
        dataList.add(new Data(20));
        System.out.println("Data List = " + dataList);
        list.stream().distinct().collect(Collectors.toList());
        System.out.println("===============================");
        listObjetosData.stream().distinct().collect(Collectors.toList());
        System.out.println("===============================");
        List<Data> uniqueDataList = dataList.stream().distinct().collect(Collectors.toList());


        System.out.println("Unique Data List = " + uniqueDataList);
    }

 }
