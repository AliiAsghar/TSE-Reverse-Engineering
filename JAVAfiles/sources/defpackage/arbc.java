package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arbc extends apsd {
    public volatile boolean a;
    public List b;
    public final apsd c;

    public arbc(apsd apsdVar) {
        super(null);
        this.b = new ArrayList();
        this.c = apsdVar;
    }

    private final void f(Runnable runnable) {
        synchronized (this) {
            if (!this.a) {
                this.b.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // defpackage.apsd
    public final void a(Status status, aqut aqutVar) {
        f(new aofo(this, status, aqutVar, 14, (char[]) null));
    }

    @Override // defpackage.apsd
    public final void c(aqut aqutVar) {
        if (this.a) {
            this.c.c(aqutVar);
        } else {
            f(new aqym(this, aqutVar, 6, (char[]) null));
        }
    }

    @Override // defpackage.apsd
    public final void d(Object obj) {
        if (this.a) {
            this.c.d(obj);
        } else {
            f(new aqym(this, obj, 7, (byte[]) null));
        }
    }

    @Override // defpackage.apsd
    public final void e() {
        if (this.a) {
            this.c.e();
        } else {
            f(new aomp(this, 15, null));
        }
    }
}
