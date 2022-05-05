import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class test {

		private HttpClient client;
		
		public void JsonClient() {
			this.client = HttpClient.newHttpClient();
		}
		
		public String get(String url) throws IOException, InterruptedException {
			HttpRequest hr = HttpRequest.newBuilder()
										.uri(URI.create(url))
										.header("content-type", "application/json")
										.version(HttpClient.Version.HTTP_1_1)
										.build();
			HttpResponse<String> hresp = this.client.send(hr, BodyHandlers.ofString());
			return hresp.body();
		}
	
	}
