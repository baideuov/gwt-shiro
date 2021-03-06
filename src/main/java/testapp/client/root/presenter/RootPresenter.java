package testapp.client.root.presenter;

import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.mvp4g.client.Mvp4gLoader;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import com.mvp4g.client.presenter.LazyPresenter;
import com.sencha.gxt.widget.core.client.box.MessageBox;
import testapp.client.common.presenter.interfaces.INamedView;
import testapp.client.root.LayoutEventBus;
import testapp.client.root.presenter.interfaces.IRootView;
import testapp.client.root.view.RootView;
import testapp.client.service.AuthService;
import testapp.client.service.AuthServiceAsync;

@Presenter(view = RootView.class)
public class RootPresenter extends LazyPresenter<IRootView, LayoutEventBus> implements IRootView.IRootPresenter, Mvp4gLoader<LayoutEventBus> {

    public void onGoToHomePage() {
        eventBus.changeViewPortContent(view);
    }

    public void onOpenFrame(INamedView frame) {
        view.openFrame(frame);
    }

    public void onStart() {
        eventBus.goToPage1();
    }

    @Override
    public void preLoad(LayoutEventBus eventBus, String eventName, Object[] params, Command load) {
        load.execute();
    }

    @Override
    public void onSuccess(LayoutEventBus eventBus, String eventName, Object[] params) {

    }

    @Override
    public void onFailure(LayoutEventBus eventBus, String eventName, Object[] params, Throwable err) {

    }
}
