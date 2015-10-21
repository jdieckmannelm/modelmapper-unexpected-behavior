import org.modelmapper.ModelMapper;
import static org.testng.Assert.assertNull;

public class Example
{
	public static void main(String... args) {
		TokenRequest tokenRequest = new TokenRequest();
		tokenRequest.setConsumerId(123);

		ModelMapper modelMapper = new ModelMapper();
		Token token = modelMapper.map(tokenRequest, Token.class);

		assertNull(token.getId());
	}

}
