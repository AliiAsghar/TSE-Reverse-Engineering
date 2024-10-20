package defpackage;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aolp extends aqst {
    private final AtomicReference a;

    public aolp(aqru aqruVar) {
        super(aqruVar);
        this.a = new AtomicReference(atal.d(1));
    }

    @Override // defpackage.aqsu, defpackage.aqru
    public final void a(apsd apsdVar, aqut aqutVar) {
        atal atalVar;
        atal atalVar2;
        do {
            atalVar = (atal) this.a.get();
            if (atalVar.a == 1) {
                atalVar2 = atal.d(2);
            } else {
                atalVar2 = atalVar;
            }
        } while (!a.bC(this.a, atalVar, atalVar2));
        int i = atalVar.a;
        if (i != 1) {
            if (i == 4) {
                apsdVar.a((Status) atalVar.b, new aqut());
                return;
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Already started");
                this.c.c("start() called more than once", illegalStateException);
                throw illegalStateException;
            }
        }
        this.c.a(apsdVar, aqutVar);
    }

    @Override // defpackage.aqvg, defpackage.aqru
    public final void c(String str, Throwable th) {
        atal atalVar;
        atal c;
        Status status = Status.c;
        if (str != null) {
            status = status.withDescription(str);
        }
        if (th != null) {
            status = status.d(th);
        }
        do {
            atalVar = (atal) this.a.get();
            int i = atalVar.a;
            if (i == 4) {
                c = atalVar;
            } else if (i == 1) {
                c = atal.c(4, status);
            } else {
                c = atal.c(5, status);
            }
        } while (!a.bC(this.a, atalVar, c));
        this.c.c(str, th);
    }

    @Override // defpackage.aqvg, defpackage.aqru
    public final void d() {
        atal atalVar;
        do {
            atalVar = (atal) this.a.get();
            if (atalVar.a != 2) {
                throw new IllegalStateException("Call was either not started or already half-closed.");
            }
        } while (!a.bC(this.a, atalVar, atal.d(3)));
        this.c.d();
    }

    @Override // defpackage.aqvg, defpackage.aqru
    public final void e(int i) {
        int i2 = ((atal) this.a.get()).a;
        boolean z = true;
        if (i2 != 1 && i2 != 4) {
            if (i < 0) {
                z = false;
            }
            d.t(z, "Number requested must be non-negative");
            this.c.e(i);
            return;
        }
        throw new IllegalStateException("Not started");
    }

    @Override // defpackage.aqsu, defpackage.aqru
    public final void f(Object obj) {
        obj.getClass();
        int i = ((atal) this.a.get()).a;
        if (i == 2) {
            this.c.f(obj);
        } else if (i == 5) {
        } else {
            throw new IllegalStateException("Call was either not started or already half-closed.");
        }
    }
}
