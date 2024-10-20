package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class koi implements emx {
    public static final xze a = xze.g("Bugle", "BugleSensorObserver");
    public final apwt b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final Context f;
    public boolean g = false;
    private final anen h;

    public koi(Context context, apwt apwtVar, armf armfVar, anen anenVar, armf armfVar2, armf armfVar3) {
        this.f = context;
        this.b = apwtVar;
        this.c = armfVar;
        this.h = anenVar;
        this.d = armfVar2;
        this.e = armfVar3;
    }

    @Override // defpackage.emx
    public final void f(enm enmVar) {
        if (this.g) {
            koh kohVar = (koh) this.b.b();
            ListenableFuture listenableFuture = kohVar.j;
            if (listenableFuture != null) {
                listenableFuture.cancel(true);
            }
            kohVar.h.unregisterListener(kohVar);
            ((koh) this.b.b()).i.remove(this);
        }
    }

    @Override // defpackage.emx
    public final void gG(enm enmVar) {
        uuf uufVar = knn.a;
        uufVar.getClass();
        albo.bR(this.h.submit(new gvk(uufVar, 16)), qjc.a(new isn(this, 2)), this.h);
    }

    @Override // defpackage.emx
    public final /* synthetic */ void d(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gF(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void h(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void i(enm enmVar) {
    }
}
