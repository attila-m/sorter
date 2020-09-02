package com.sorter.sorter;

import com.sorter.sorter.model.PayloadToSort;
import com.sorter.sorter.service.SortService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SortPayloadTest {

	@Autowired
	SortService sortService;

	@Test
	void sortsPayload() {

		String[] sortKeysActual = new String[]{"fruits", "numbers"};
		Map<String, Object[]> payloadActual = new HashMap<>();
		payloadActual.put("fruits", new Object[]{"watermelon", "apple", "pineapple"});
		payloadActual.put("numbers", new Object[]{1333,4,2431,7});
		payloadActual.put("colors", new Object[]{"green","blue","yellow"});
		PayloadToSort actual = new PayloadToSort(sortKeysActual, payloadActual);

		String[] sortKeysExpected = new String[]{"fruits", "numbers"};
		Map<String, Object[]> payloadExpected = new HashMap<>();
		payloadExpected.put("fruits", new Object[]{"apple", "pineapple", "watermelon",});
		payloadExpected.put("numbers", new Object[]{4,7,1333,2431});
		payloadExpected.put("colors", new Object[]{"green","blue","yellow"});
		PayloadToSort expected = new PayloadToSort(sortKeysExpected, payloadExpected);

		sortService.sortPayload(actual);

		assertArrayEquals(actual.getPayload().get("fruits"), expected.getPayload().get("fruits"));
		assertArrayEquals(actual.getPayload().get("numbers"), expected.getPayload().get("numbers"));
		assertArrayEquals(actual.getPayload().get("colors"), expected.getPayload().get("colors"));

	}

}
