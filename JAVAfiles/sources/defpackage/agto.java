package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agto implements Runnable {
    private final agtt a;
    private final agtw b;
    private final Executor c;
    private final algk d;

    public agto(agtt agttVar, agtw agtwVar, Executor executor, algk algkVar) {
        this.a = agttVar;
        this.b = agtwVar;
        this.c = executor;
        this.d = algkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.apply(toString());
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.a(this.a);
        aj.a(this.b);
        aj.a(this.c);
        return aj.toString();
    }
}
