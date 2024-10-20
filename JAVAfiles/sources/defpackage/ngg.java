package defpackage;

import com.google.android.ims.provisioning.config.Configuration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ngg implements ngi {
    public final Configuration a;
    private final arml b;
    private final arml c;
    private final arml d;
    private final arml e;

    public ngg(ydf ydfVar, armf armfVar, znj znjVar, Configuration configuration) {
        ydfVar.getClass();
        armfVar.getClass();
        znjVar.getClass();
        this.a = configuration;
        this.b = armd.a(new mtx(this, 5));
        this.c = armd.a(new mtx(this, 8));
        this.d = armd.a(new mtx(this, 6));
        this.e = armd.a(new mtx(this, 7));
    }

    @Override // defpackage.ngi
    public final int a() {
        return ((Number) this.b.a()).intValue();
    }

    @Override // defpackage.ngi
    public final int b() {
        return ((Number) this.d.a()).intValue();
    }

    @Override // defpackage.ngi
    public final int c() {
        return ((Number) this.e.a()).intValue();
    }

    @Override // defpackage.ngi
    public final int d() {
        return ((Number) this.c.a()).intValue();
    }
}
