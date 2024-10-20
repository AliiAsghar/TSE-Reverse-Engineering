package defpackage;

import defpackage.xq;
import defpackage.zz;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acs<V extends zz> implements aco<V> {
    public final aas a;
    public zz b;
    public zz c;
    private zz d;

    public acs(aas aasVar) {
        this.a = aasVar;
    }

    @Override // defpackage.aco
    public final zz a(zz zzVar, zz zzVar2) {
        if (this.d == null) {
            this.d = zzVar.c();
        }
        zz zzVar3 = this.d;
        String str = "targetVector";
        if (zzVar3 == null) {
            arro.b("targetVector");
            zzVar3 = null;
        }
        int b = zzVar3.b();
        int i = 0;
        while (i < b) {
            zz zzVar4 = this.d;
            if (zzVar4 == null) {
                arro.b(str);
                zzVar4 = null;
            }
            aas aasVar = this.a;
            float a = zzVar.a(i);
            float a2 = zzVar2.a(i);
            zzVar4.e(i, a + (((float) (r6.a * r6.b * Math.exp((xr.a / (xr.a - 1.0d)) * ((zf) aasVar).a.a(a2)))) * Math.signum(a2)));
            i++;
            str = str;
        }
        String str2 = str;
        zz zzVar5 = this.d;
        if (zzVar5 == null) {
            arro.b(str2);
            return null;
        }
        return zzVar5;
    }

    @Override // defpackage.aco
    public final zz b(long j, zz zzVar, zz zzVar2) {
        float f;
        if (this.c == null) {
            this.c = zzVar.c();
        }
        zz zzVar3 = this.c;
        if (zzVar3 == null) {
            arro.b("velocityVector");
            zzVar3 = null;
        }
        int b = zzVar3.b();
        for (int i = 0; i < b; i++) {
            zz zzVar4 = this.c;
            if (zzVar4 == null) {
                arro.b("velocityVector");
                zzVar4 = null;
            }
            aas aasVar = this.a;
            zzVar.a(i);
            xq.a b2 = ((zf) aasVar).a.b(zzVar2.a(i));
            long j2 = b2.c;
            if (j2 > 0) {
                f = ((float) (j / 1000000)) / ((float) j2);
            } else {
                f = 1.0f;
            }
            int i2 = vq.a;
            zzVar4.e(i, (((vq.a(f).b * Math.signum(b2.a)) * b2.b) / ((float) b2.c)) * 1000.0f);
        }
        zz zzVar5 = this.c;
        if (zzVar5 == null) {
            arro.b("velocityVector");
            return null;
        }
        return zzVar5;
    }
}
