

public class HttpSessionTest {
//	@Test
//	public void testRedisControlsSession() {
//	    ResponseEntity<String> result = testRestTemplateWithAuth.getForEntity(testUrl, String.class);
//	    assertEquals("hello admin", result.getBody()); //login worked
//	 
//	    Set<String> redisResult = jedis.keys("*");
//	    assertTrue(redisResult.size() > 0); //redis is populated with session data
//	 
//	    String sessionCookie = result.getHeaders().get("Set-Cookie").get(0).split(";")[0];
//	    HttpHeaders headers = new HttpHeaders();
//	    headers.add("Cookie", sessionCookie);
//	    HttpEntity<String> httpEntity = new HttpEntity<>(headers);
//	 
//	    result = testRestTemplate.exchange(testUrl, HttpMethod.GET, httpEntity, String.class);
//	    assertEquals("hello admin", result.getBody()); //access with session works worked
//	 
//	    jedis.flushAll(); //clear all keys in redis
//	 
//	    result = testRestTemplate.exchange(testUrl, HttpMethod.GET, httpEntity, String.class);
//	    assertEquals(HttpStatus.UNAUTHORIZED, result.getStatusCode());//access denied after sessions are removed in redis
//	}
}
