package defpackage;

import defpackage.zz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acx<V extends zz> implements ack<V> {
    private final /* synthetic */ acr a;

    public acx(float f, float f2, zz zzVar) {
        aab acmVar;
        if (zzVar != null) {
            acmVar = new acl(zzVar, f, f2);
        } else {
            acmVar = new acm(f, f2);
        }
        this.a = new acr(acmVar);
    }

    @Override // defpackage.ack
    public final long a(zz zzVar, zz zzVar2, zz zzVar3) {
        return this.a.a(zzVar, zzVar2, zzVar3);
    }

    @Override // defpackage.ack
    public final zz b(zz zzVar, zz zzVar2, zz zzVar3) {
        return this.a.b(zzVar, zzVar2, zzVar3);
    }

    @Override // defpackage.ack
    public final zz c(long j, zz zzVar, zz zzVar2, zz zzVar3) {
        return this.a.c(j, zzVar, zzVar2, zzVar3);
    }

    @Override // defpackage.ack
    public final zz d(long j, zz zzVar, zz zzVar2, zz zzVar3) {
        return this.a.d(j, zzVar, zzVar2, zzVar3);
    }

    @Override // defpackage.ack
    public final boolean e() {
        return false;
    }
}
