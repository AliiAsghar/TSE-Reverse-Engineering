package defpackage;

import defpackage.xq;
import defpackage.zz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaf<T, V extends zz> implements zn<T, V> {
    private final aco a;
    private final acg b;
    private final Object c;
    private final zz d;
    private final zz e;
    private final zz f;
    private final Object g;
    private final long h;

    public aaf(aag aagVar, acg acgVar, Object obj, zz zzVar) {
        aco a = aagVar.a();
        this.a = a;
        this.b = acgVar;
        this.c = obj;
        zz zzVar2 = (zz) acgVar.b().a(obj);
        this.d = zzVar2;
        this.e = aaa.a(zzVar);
        this.g = acgVar.a().a(a.a(zzVar2, zzVar));
        acs acsVar = (acs) a;
        if (acsVar.c == null) {
            acsVar.c = zzVar2.c();
        }
        zz zzVar3 = acsVar.c;
        if (zzVar3 == null) {
            arro.b("velocityVector");
            zzVar3 = null;
        }
        int b = zzVar3.b();
        long j = 0;
        for (int i = 0; i < b; i++) {
            aas aasVar = acsVar.a;
            zzVar2.a(i);
            j = Math.max(j, ((long) (Math.exp(((zf) aasVar).a.a(zzVar.a(i)) / (xr.a - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.h = j;
        zz a2 = aaa.a(this.a.b(j, this.d, zzVar));
        this.f = a2;
        int b2 = a2.b();
        for (int i2 = 0; i2 < b2; i2++) {
            zz zzVar4 = this.f;
            zzVar4.e(i2, arrn.q(zzVar4.a(i2), brg.a, brg.a));
        }
    }

    @Override // defpackage.zn
    public final long a() {
        return this.h;
    }

    @Override // defpackage.zn
    public final zz b(long j) {
        if (!zm.a(this, j)) {
            return this.a.b(j, this.d, this.e);
        }
        return this.f;
    }

    @Override // defpackage.zn
    public final acg c() {
        return this.b;
    }

    @Override // defpackage.zn
    public final Object d(long j) {
        float f;
        if (!zm.a(this, j)) {
            acg acgVar = this.b;
            aco acoVar = this.a;
            zz zzVar = this.d;
            zz zzVar2 = this.e;
            arqr a = acgVar.a();
            acs acsVar = (acs) acoVar;
            if (acsVar.b == null) {
                acsVar.b = zzVar.c();
            }
            zz zzVar3 = acsVar.b;
            zz zzVar4 = null;
            if (zzVar3 == null) {
                arro.b("valueVector");
                zzVar3 = null;
            }
            int b = zzVar3.b();
            for (int i = 0; i < b; i++) {
                zz zzVar5 = acsVar.b;
                if (zzVar5 == null) {
                    arro.b("valueVector");
                    zzVar5 = null;
                }
                aas aasVar = acsVar.a;
                float a2 = zzVar.a(i);
                xq.a b2 = ((zf) aasVar).a.b(zzVar2.a(i));
                long j2 = b2.c;
                if (j2 > 0) {
                    f = ((float) (j / 1000000)) / ((float) j2);
                } else {
                    f = 1.0f;
                }
                float signum = b2.b * Math.signum(b2.a);
                int i2 = vq.a;
                zzVar5.e(i, a2 + (signum * vq.a(f).a));
            }
            zz zzVar6 = acsVar.b;
            if (zzVar6 == null) {
                arro.b("valueVector");
            } else {
                zzVar4 = zzVar6;
            }
            return a.a(zzVar4);
        }
        return this.g;
    }

    @Override // defpackage.zn
    public final /* synthetic */ boolean e(long j) {
        return zm.a(this, j);
    }

    @Override // defpackage.zn
    public final boolean f() {
        return false;
    }

    @Override // defpackage.zn
    public final void g() {
    }
}
