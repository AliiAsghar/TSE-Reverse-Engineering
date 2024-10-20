package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akfq {
    public final Object a = new Object();
    public ahmn b;
    private andc c;

    public akfq(andc andcVar, akfr akfrVar) {
        aiut.c();
        this.c = andcVar;
        akfrVar.getClass();
    }

    private final void d() {
        synchronized (this.a) {
            albo.T(this.c.f().isDone());
            this.c.k(new akfp(this, 0), andi.a);
            this.c = null;
        }
    }

    public final akfa a() {
        akfa akfaVar;
        synchronized (this.a) {
            if (this.c != null) {
                d();
            }
            try {
                akfaVar = (akfa) this.b.v();
            } catch (ExecutionException e) {
                throw new akgj(e.getCause());
            }
        }
        return akfaVar;
    }

    public final ListenableFuture b() {
        synchronized (this.a) {
            andc andcVar = this.c;
            if (andcVar != null) {
                return andcVar.f();
            }
            return albo.bI(null);
        }
    }

    public final void c() {
        synchronized (this.a) {
            andc andcVar = this.c;
            if (andcVar != null) {
                andcVar.m();
                d();
            }
            this.b.w();
        }
    }
}
