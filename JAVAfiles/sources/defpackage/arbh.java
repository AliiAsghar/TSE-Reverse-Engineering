package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arbh implements aral {
    public final aral a;
    public volatile boolean b;
    public List c = new ArrayList();

    public arbh(aral aralVar) {
        this.a = aralVar;
    }

    private final void b(Runnable runnable) {
        synchronized (this) {
            if (!this.b) {
                this.c.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // defpackage.aral
    public final void a(Status status, arak arakVar, aqut aqutVar) {
        b(new uju((Object) this, status, arakVar, aqutVar, 13));
    }

    @Override // defpackage.aral
    public final void c(aqut aqutVar) {
        b(new aqym(this, aqutVar, 14, (char[]) null));
    }

    @Override // defpackage.arhq
    public final void d(arhp arhpVar) {
        if (this.b) {
            this.a.d(arhpVar);
        } else {
            b(new aqym(this, arhpVar, 13, (byte[]) null));
        }
    }

    @Override // defpackage.arhq
    public final void e() {
        if (this.b) {
            this.a.e();
        } else {
            b(new arbg(this, 3));
        }
    }
}
