package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zeo {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/startchat/tracker/SelectedSelfIdentityTrackerImpl");
    public final arwe b;
    public final armf c;
    public final AtomicBoolean d;
    public final ascv e;
    private final ascd f;

    public zeo(arwe arweVar, armf armfVar) {
        arweVar.getClass();
        armfVar.getClass();
        this.b = arweVar;
        this.c = armfVar;
        ascd a2 = ascy.a(null);
        this.f = a2;
        this.d = new AtomicBoolean(false);
        this.e = new ascf(a2);
    }

    public final void a(nfw nfwVar) {
        ascd ascdVar;
        Object c;
        do {
            ascdVar = this.f;
            c = ascdVar.c();
        } while (!ascdVar.g(c, nfwVar));
    }
}
