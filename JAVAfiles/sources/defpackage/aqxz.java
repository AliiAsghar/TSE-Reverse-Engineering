package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aqxz implements arhd {
    private final aqxq a;
    private final aqye b;
    private final aqrm c;

    public aqxz(aqxq aqxqVar, aqye aqyeVar, aqrm aqrmVar) {
        this.a = aqxqVar;
        this.b = aqyeVar;
        this.c = aqrmVar;
    }

    @Override // defpackage.arhd
    public final aqrm a() {
        return this.c;
    }

    @Override // defpackage.arhd
    public final arhn b() {
        return this.b.f;
    }

    @Override // defpackage.arhd
    public final void c(Status status) {
        synchronized (this.a) {
            this.a.i(status);
        }
    }

    @Override // defpackage.arhd
    public final void e(Status status, aqut aqutVar) {
        boolean z;
        try {
            synchronized (this.b) {
                aqye aqyeVar = this.b;
                if (aqyeVar.b == null) {
                    if (aqyeVar.c == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    albo.T(z);
                    aqyeVar.b = status;
                    aqyeVar.c = aqutVar;
                    aqyeVar.e();
                    aqyeVar.f();
                    aqyeVar.g();
                }
            }
            synchronized (this.a) {
                this.a.f();
            }
        } catch (StatusException e) {
            synchronized (this.a) {
                this.a.h(e.a);
            }
        }
    }

    @Override // defpackage.arho
    public final void g(int i) {
        synchronized (this.a) {
            this.a.n(i);
        }
    }

    @Override // defpackage.arhd
    public final void i(arhe arheVar) {
        synchronized (this.a) {
            this.a.l(this.b, arheVar);
        }
    }

    @Override // defpackage.arhd
    public final void j(aqut aqutVar) {
        try {
            synchronized (this.b) {
                aqye aqyeVar = this.b;
                aqyeVar.a = aqutVar;
                aqyeVar.e();
                aqyeVar.g();
            }
        } catch (StatusException e) {
            synchronized (this.a) {
                this.a.h(e.a);
            }
        }
    }

    @Override // defpackage.arhd
    public final void k() {
    }

    @Override // defpackage.arho
    public final void n(InputStream inputStream) {
        try {
            synchronized (this.b) {
                this.b.d(inputStream);
                this.b.g();
            }
        } catch (StatusException e) {
            synchronized (this.a) {
                this.a.h(e.a);
            }
        }
    }

    @Override // defpackage.arho
    public final boolean o() {
        return this.b.h();
    }

    public final String toString() {
        aqye aqyeVar = this.b;
        return "MultiMessageServerStream[" + this.a.toString() + "/" + aqyeVar.toString() + "]";
    }

    @Override // defpackage.arho
    public final void d() {
    }

    @Override // defpackage.arho
    public final void f() {
    }

    @Override // defpackage.arho
    public final void h(aqsa aqsaVar) {
    }
}
