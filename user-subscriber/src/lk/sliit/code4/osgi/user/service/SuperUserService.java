
package lk.sliit.code4.osgi.user.service;

import org.osgi.framework.BundleContext;

public interface SuperUserService {

    // setter
    void setBundleContext(BundleContext context);

    void add();

    void update();

    void delete();

    void view();

    void viewAll();
}
