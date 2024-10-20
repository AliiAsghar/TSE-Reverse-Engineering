package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class absy<L> {
    public volatile Object a;
    public volatile absw b;
    private final Executor c;

    public absy(Looper looper, Object obj, String str) {
        this.c = new ebx(looper, 2);
        d.aC(obj, "Listener must not be null");
        this.a = obj;
        abhg.k(str);
        this.b = new absw(obj, str);
    }

    public final void a() {
        this.a = null;
        this.b = null;
    }

    public final void b(absx absxVar) {
        this.c.execute(new aanh(this, absxVar, 17, null));
    }

    public absy(Executor executor, Object obj) {
        d.aC(executor, "Executor must not be null");
        this.c = executor;
        this.a = obj;
        abhg.k("GetCurrentLocation");
        this.b = new absw(obj, "GetCurrentLocation");
    }
}
