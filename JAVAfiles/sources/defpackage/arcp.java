package defpackage;

import io.grpc.Status;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arcp implements aree {
    public final arau a;
    boolean b = false;
    public final /* synthetic */ arcr c;

    public arcp(arcr arcrVar, arau arauVar) {
        this.c = arcrVar;
        this.a = arauVar;
    }

    @Override // defpackage.aree
    public final void a(boolean z) {
        this.c.f(this.a, z);
    }

    @Override // defpackage.aree
    public final void b() {
        this.c.c.a(2, "READY");
        this.c.f.execute(new arbg(this, 9));
    }

    @Override // defpackage.aree
    public final void c(Status status) {
        this.c.c.b(2, "{0} SHUTDOWN with {1}", this.a.c(), arcr.k(status));
        this.b = true;
        this.c.f.execute(new aqym(this, status, 20, (char[]) null));
    }

    @Override // defpackage.aree
    public final void d() {
        albo.U(this.b, "transportShutdown() must be called before transportTerminated().");
        this.c.c.b(2, "{0} Terminated", this.a.c());
        aqtc.c(this.c.b.f, this.a);
        this.c.f(this.a, false);
        Iterator it = this.c.e.iterator();
        if (!it.hasNext()) {
            this.c.f.execute(new arbg(this, 10));
        } else {
            this.a.r();
            throw null;
        }
    }

    @Override // defpackage.aree
    public final void e() {
        Iterator it = this.c.e.iterator();
        if (!it.hasNext()) {
            return;
        }
        throw null;
    }
}
