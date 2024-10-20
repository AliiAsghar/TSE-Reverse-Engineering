package defpackage;

import defpackage.zz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abs<T, V extends zz> implements zn<T, V> {
    public Object a;
    public Object b;
    private final ack c;
    private final acg d;
    private zz e;
    private zz f;
    private final zz g;
    private long h;
    private zz i;

    public abs(zr zrVar, acg acgVar, Object obj, Object obj2, zz zzVar) {
        zz c;
        this.c = zrVar.a(acgVar);
        this.d = acgVar;
        this.a = obj2;
        this.b = obj;
        this.e = (zz) acgVar.b().a(obj);
        this.f = (zz) acgVar.b().a(obj2);
        if (zzVar != null) {
            c = aaa.a(zzVar);
        } else {
            c = ((zz) acgVar.b().a(obj)).c();
        }
        this.g = c;
        this.h = -1L;
    }

    @Override // defpackage.zn
    public final long a() {
        long j = this.h;
        if (j < 0) {
            long a = this.c.a(this.e, this.f, this.g);
            this.h = a;
            return a;
        }
        return j;
    }

    @Override // defpackage.zn
    public final zz b(long j) {
        if (!zm.a(this, j)) {
            return this.c.d(j, this.e, this.f, this.g);
        }
        zz zzVar = this.i;
        if (zzVar == null) {
            zz b = this.c.b(this.e, this.f, this.g);
            this.i = b;
            return b;
        }
        return zzVar;
    }

    @Override // defpackage.zn
    public final acg c() {
        return this.d;
    }

    @Override // defpackage.zn
    public final Object d(long j) {
        if (!zm.a(this, j)) {
            zz c = this.c.c(j, this.e, this.f, this.g);
            int b = c.b();
            for (int i = 0; i < b; i++) {
                if (Float.isNaN(c.a(i))) {
                    abi.b("AnimationVector cannot contain a NaN. " + c + ". Animation: " + this + ", playTimeNanos: " + j);
                }
            }
            return this.d.a().a(c);
        }
        return this.a;
    }

    @Override // defpackage.zn
    public final /* synthetic */ boolean e(long j) {
        return zm.a(this, j);
    }

    @Override // defpackage.zn
    public final boolean f() {
        return this.c.e();
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.b + " -> " + this.a + ",initial velocity: " + this.g + ", duration: " + (a() / 1000000) + " ms,animationSpec: " + this.c;
    }

    public /* synthetic */ abs(zr zrVar, acg acgVar, Object obj, Object obj2) {
        this(zrVar, acgVar, obj, obj2, null);
    }

    @Override // defpackage.zn
    public final void g() {
    }
}
