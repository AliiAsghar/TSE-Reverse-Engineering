package defpackage;

import android.app.Application;
import android.app.Service;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apxl implements apxq {
    private final Service a;
    private Object b;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface a {
        ngu QL();
    }

    public apxl(Service service) {
        this.a = service;
    }

    @Override // defpackage.apxq
    public final Object aS() {
        if (this.b == null) {
            Application application = this.a.getApplication();
            apzj.g(application instanceof apxq, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
            ngu QL = ((a) aovp.m(application, a.class)).QL();
            QL.b = this.a;
            apzj.f(QL.b, Service.class);
            this.b = new kqo((krv) QL.a, (Service) QL.b);
        }
        return this.b;
    }
}
