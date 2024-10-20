package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wni {
    public final SettableFuture c;
    public final akul d;
    private final anen f;
    private final nwj g;
    public final Object a = new Object();
    public final List b = new ArrayList(2);
    private boolean e = false;

    public wni(anen anenVar, nwj nwjVar) {
        this.f = anenVar;
        this.g = nwjVar;
        akrh e = aktp.e("DynamicFutureListListener");
        try {
            SettableFuture create = SettableFuture.create();
            e.b(create);
            this.c = create;
            this.d = akul.g(create);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean a(ListenableFuture listenableFuture) {
        Executor executor;
        synchronized (this.a) {
            if ((this.e && this.b.isEmpty()) || this.d.isDone()) {
                return false;
            }
            this.b.add(listenableFuture);
            this.e = true;
            vxb vxbVar = new vxb(this, listenableFuture, 11, null);
            if (this.g.a()) {
                executor = andi.a;
            } else {
                executor = this.f;
            }
            qiu.i(listenableFuture, vxbVar, executor);
            return true;
        }
    }
}
