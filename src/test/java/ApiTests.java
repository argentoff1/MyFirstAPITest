import api.ApiResource;
import api.ApiUser;
import models.resource.RootSingle;
import models.user.Root;
import models.user.RootDelayedResponse;
import models.user.RootListUsers;
import org.testng.annotations.Test;

public class ApiTests {
    ApiUser apiUser = new ApiUser();
    ApiResource apiResource = new ApiResource();

    @Test
    public void getUserTest() {
        Root root = new Root();
        root = apiUser.getUser(1);
        System.out.println(root.toString());
    }

    @Test
    public void getListOfUsersTest() {
        RootListUsers root2 = new RootListUsers();
        root2 = apiUser.getListOfUsers();
        System.out.println(root2.toString());
    }

    @Test
    public void getNonexistentUser() {
        Root root = new Root();
        root = apiUser.getNonexistentUser();
        System.out.println(root.toString());
    }

    @Test
    public void getListResource() {
        models.resource.Root root = new models.resource.Root();
        root = apiResource.getListResource();
        System.out.println(root.toString());
    }

    @Test
    public void getSingleResource() {
        RootSingle rootSingle = new RootSingle();
        rootSingle = apiResource.getSingleResource(2);
        System.out.println(rootSingle.toString());
    }

    @Test
    public void getNonexistentResource() {
        RootSingle rootSingle = new RootSingle();
        rootSingle = apiResource.getNonexistentResource();
        System.out.println(rootSingle.toString());
    }

    @Test
    public void getDelayedResponse() {
        RootDelayedResponse rootDelayedResponse = new RootDelayedResponse();
        rootDelayedResponse = apiUser.getDelayedResponse();
        System.out.println(rootDelayedResponse.toString());
    }
}
