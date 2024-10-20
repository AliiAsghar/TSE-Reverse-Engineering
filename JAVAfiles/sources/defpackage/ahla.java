package defpackage;

import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahla extends ThreadLocal {
    final /* synthetic */ ahow a;

    public ahla(ahow ahowVar) {
        this.a = ahowVar;
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        ahlb ahlbVar = new ahlb();
        Thread currentThread = Thread.currentThread();
        synchronized (this.a.a) {
            ((WeakHashMap) this.a.a).put(currentThread, ahlbVar);
        }
        return ahlbVar;
    }
}
