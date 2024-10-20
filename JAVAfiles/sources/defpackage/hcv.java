package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hcv implements hct {
    private final hie a;
    private float b = -1.0f;

    public hcv(List list) {
        this.a = (hie) list.get(0);
    }

    @Override // defpackage.hct
    public final float a() {
        return this.a.b();
    }

    @Override // defpackage.hct
    public final float b() {
        return this.a.c();
    }

    @Override // defpackage.hct
    public final hie c() {
        return this.a;
    }

    @Override // defpackage.hct
    public final boolean d(float f) {
        if (this.b == f) {
            return true;
        }
        this.b = f;
        return false;
    }

    @Override // defpackage.hct
    public final boolean e() {
        return false;
    }

    @Override // defpackage.hct
    public final boolean f(float f) {
        if (!this.a.e()) {
            return true;
        }
        return false;
    }
}
