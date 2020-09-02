package com.sorter.sorter;

import com.sorter.sorter.model.PayloadToSort;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PayloadToSortTest {

	@Test
	void canCreatePayloadToSortObject() {

		Map<String, Object[]> payload = new HashMap<>();
		payload.put("payload", new Object[1]);

		PayloadToSort payloadToSort = new PayloadToSort(new String[]{"sortKey"}, payload);
		assertNotNull(payloadToSort);

	}

}
