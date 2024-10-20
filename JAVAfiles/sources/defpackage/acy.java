package defpackage;

import defpackage.zz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acy<V extends zz> implements acq<V> {
    private final int a;
    private final int b;
    private final aak c;
    private final acr d;

    public acy(int i, int i2, aak aakVar) {
        this.a = i;
        this.b = i2;
        this.c = aakVar;
        this.d = new acr(new aau(i, i2, aakVar));
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
        return this.d.c(j, zzVar, zzVar2, zzVar3);
    }

    @Override // defpackage.ack
    public final zz d(long j, zz zzVar, zz zzVar2, zz zzVar3) {
        return this.d.d(j, zzVar, zzVar2, zzVar3);
    }

    @Override // defpackage.ack
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.acq
    public final int f() {
        return this.b;
    }

    @Override // defpackage.acq
    public final int g() {
        return this.a;
    }

    public acy() {
        this(300, 0, aao.a);
    }
}
