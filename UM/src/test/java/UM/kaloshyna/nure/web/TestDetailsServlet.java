package UM.kaloshyna.nure.web;

import UM.kaloshyna.nure.User;
import UM.kaloshyna.nure.web.DetailsServlet;

public class TestDetailsServlet extends MockServletTestCase {
    @Override
    public void setUp() throws Exception {
        super.setUp();
        createServlet(DetailsServlet.class);
    }

    public void testDetails() {
        addRequestParameter("cancelButton", "cancel");
        User user = (User) getWebMockObjectFactory().getMockSession().getAttribute("user");
        assertNull("User is in session", user);
    }
}
