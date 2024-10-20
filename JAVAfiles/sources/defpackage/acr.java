package defpackage;

import defpackage.zz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acr<V extends zz> implements ack<V> {
    private final aab a;
    private zz b;
    private zz c;
    private zz d;

    public acr(aab aabVar) {
        this.a = aabVar;
    }

    @Override // defpackage.ack
    public final long a(zz zzVar, zz zzVar2, zz zzVar3) {
        int b = zzVar.b();
        long j = 0;
        for (int i = 0; i < b; i++) {
            j = Math.max(j, this.a.a(i).e(zzVar.a(i), zzVar2.a(i), zzVar3.a(i)));
        }
        return j;
    }

    @Override // defpackage.ack
    public final zz b(zz zzVar, zz zzVar2, zz zzVar3) {
        if (this.d == null) {
            this.d = zzVar3.c();
        }
        zz zzVar4 = this.d;
        if (zzVar4 == null) {
            arro.b("endVelocityVector");
            zzVar4 = null;
        }
        int b = zzVar4.b();
        for (int i = 0; i < b; i++) {
            zz zzVar5 = this.d;
            if (zzVar5 == null) {
                arro.b("endVelocityVector");
                zzVar5 = null;
            }
            zzVar5.e(i, this.a.a(i).b(zzVar.a(i), zzVar2.a(i), zzVar3.a(i)));
        }
        zz zzVar6 = this.d;
        if (zzVar6 == null) {
            arro.b("endVelocityVector");
            return null;
        }
        return zzVar6;
    }

    @Override // defpackage.ack
    public final zz c(long j, zz zzVar, zz zzVar2, zz zzVar3) {
        if (this.b == null) {
            this.b = zzVar.c();
        }
        zz zzVar4 = this.b;
        if (zzVar4 == null) {
            arro.b("valueVector");
            zzVar4 = null;
        }
        int b = zzVar4.b();
        for (int i = 0; i < b; i++) {
            zz zzVar5 = this.b;
            if (zzVar5 == null) {
                arro.b("valueVector");
                zzVar5 = null;
            }
            zzVar5.e(i, this.a.a(i).c(j, zzVar.a(i), zzVar2.a(i), zzVar3.a(i)));
        }
        zz zzVar6 = this.b;
        if (zzVar6 == null) {
            arro.b("valueVector");
            return null;
        }
        return zzVar6;
    }

    @Override // defpackage.ack
    public final zz d(long j, zz zzVar, zz zzVar2, zz zzVar3) {
        if (this.c == null) {
            this.c = zzVar3.c();
        }
        zz zzVar4 = this.c;
        if (zzVar4 == null) {
            arro.b("velocityVector");
            zzVar4 = null;
        }
        int b = zzVar4.b();
        for (int i = 0; i < b; i++) {
            zz zzVar5 = this.c;
            if (zzVar5 == null) {
                arro.b("velocityVector");
                zzVar5 = null;
            }
            zzVar5.e(i, this.a.a(i).d(j, zzVar.a(i), zzVar2.a(i), zzVar3.a(i)));
        }
        zz zzVar6 = this.c;
        if (zzVar6 == null) {
            arro.b("velocityVector");
            return null;
        }
        return zzVar6;
    }

    @Override // defpackage.ack
    public final /* synthetic */ boolean e() {
        return false;
    }

    public acr(final aar aarVar) {
        this(new aab() { // from class: acr.1
            @Override // defpackage.aab
            public final aar a(int i) {
                return aar.this;
            }
        });
    }
}
