package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wnb implements xyf {
    public final apwt a;
    public final Executor b;
    public boolean c = false;
    public boolean d = false;

    public wnb(apwt apwtVar, anen anenVar) {
        this.a = apwtVar;
        this.b = new anew(anenVar);
    }

    @Override // defpackage.xyf
    public final void a() {
        qiu.h(aktp.ah(new uql(this, 20), this.b));
    }

    @Override // defpackage.xyf
    public final void b() {
        qiu.h(aktp.ah(new uql(this, 17), this.b));
    }
}
