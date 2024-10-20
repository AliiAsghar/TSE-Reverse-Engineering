package defpackage;

import defpackage.zz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acw<V extends zz> implements acq<V> {
    private final int a;

    public acw(int i) {
        this.a = i;
    }

    @Override // defpackage.ack
    public final /* synthetic */ long a(zz zzVar, zz zzVar2, zz zzVar3) {
        return acp.a(this);
    }

    @Override // defpackage.ack
    public final /* synthetic */ zz b(zz zzVar, zz zzVar2, zz zzVar3) {
        return acj.a(this, zzVar, zzVar2, zzVar3);
    }

    @Override // defpackage.ack
    public final zz c(long j, zz zzVar, zz zzVar2, zz zzVar3) {
        if (j < this.a * 1000000) {
            return zzVar;
        }
        return zzVar2;
    }

    @Override // defpackage.ack
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.acq
    public final int f() {
        return this.a;
    }

    @Override // defpackage.acq
    public final int g() {
        return 0;
    }

    public acw() {
        this(0);
    }

    @Override // defpackage.ack
    public final zz d(long j, zz zzVar, zz zzVar2, zz zzVar3) {
        return zzVar3;
    }
}
