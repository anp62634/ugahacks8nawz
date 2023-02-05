import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoConfig {

    private static final String CONNECTION_STRING = "mongodb://%s:%d";
    private static final String HOST = "localhost";

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {

        int randomPort = SocketUtils.findAvailableTcpPort();

        ImmutableMongodConfig mongoDbConfig = MongodConfig.builder()
          .version(Version.Main.PRODUCTION)
          .net(new Net(HOST, randomPort, Network.localhostIsIPv6()))
          .build();

        MongodStarter starter = MongodStarter.getDefaultInstance();
        MongodExecutable mongodExecutable = starter.prepare(mongoDbConfig);
        mongodExecutable.start();
        return new MongoTemplate(MongoClients.create(String.format(CONNECTION_STRING, HOST, randomPort)), "mongo_auth");
    }
}