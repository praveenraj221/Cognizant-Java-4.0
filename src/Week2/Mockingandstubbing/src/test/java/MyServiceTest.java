import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {
    @Test
    public void testExternalApi() {
        // Step 1: Create a mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub the method to return fixed data
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Inject mock into MyService
        MyService service = new MyService(mockApi);

        // Step 4: Call the method and verify the result
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
}
