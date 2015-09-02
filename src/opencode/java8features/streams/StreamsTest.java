package opencode.java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import opencode.java8features.streams.Tag.TYPE;

public class StreamsTest {
	public static void main(String[] args){
		
		List<String> myList = Arrays.asList("yet","another", "proof", "that", "java8", "streams","rocks");
		
		//Stream on a list of strings 
		System.out.println("-----------Traversal and filtering----------");
		myList.stream()
		.filter( s -> s.length() <= 4)
		.map(s -> {return s.toUpperCase();})
		.sorted()
		.forEach(System.out::println);
		
		List<Tag> tagsList = Arrays.asList(
				new Tag("tag1", 10, Tag.TYPE.NEWS),
				new Tag("tag2", 20, Tag.TYPE.SPORTS), 
				new Tag("tag3", 40, Tag.TYPE.SPORTS));
		
		System.out.println("-----------sum----------");
		//Stream on a list of objects
		int countSum = tagsList.stream()
		.mapToInt(Tag::getCount)
		.sum();
		
		System.out.println("count sum " + countSum);
		
		//average
		System.out.println("-----------average----------");
		tagsList.stream()
		.mapToInt(Tag::getCount)
		.average()
		.ifPresent(System.out::println);
		
		//Map
		System.out.println("-----------grouping----------");
		Map<TYPE, List<Tag>> map = 
				tagsList.stream()
		.collect(Collectors.groupingBy(Tag::getType));
		
		System.out.println(map);
	}

}
