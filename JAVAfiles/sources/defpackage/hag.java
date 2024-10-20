package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hag {
    public static final String a = gsy.b("WorkTimer");
    public final gth b;
    public final Map c = new HashMap();
    public final Map d = new HashMap();
    public final Object e = new Object();

    public hag(gth gthVar) {
        this.b = gthVar;
    }

    public final void a(gyg gygVar) {
        synchronized (this.e) {
            if (((gul) this.c.remove(gygVar)) != null) {
                gsy.a().c(a, a.ch(gygVar, "Stopping timer for "));
                this.d.remove(gygVar);
            }
        }
    }
}
