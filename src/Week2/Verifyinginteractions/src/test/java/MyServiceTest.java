import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Arrange: Create a mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Act: Call the method
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Assert: Verify that getData() was called
        verify(mockApi).getData();
    }
}
