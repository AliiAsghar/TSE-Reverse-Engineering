package defpackage;

import defpackage.zz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class act<V extends zz> implements ack<V> {
    private final acq a;
    private final abj b;
    private final long c;

    public act(acq acqVar, abj abjVar) {
        this.a = acqVar;
        this.b = abjVar;
        this.c = (acqVar.f() + acqVar.g()) * 1000000;
    }

    private final long f(long j) {
        if (j <= 0) {
            return 0L;
        }
        long j2 = j / this.c;
        if (this.b != abj.a && j2 % 2 != 0) {
            return ((j2 + 1) * this.c) - j;
        }
        return j - (j2 * this.c);
    }

    private final zz g(long j, zz zzVar, zz zzVar2, zz zzVar3) {
        long j2 = this.c;
        if (j > j2) {
            return this.a.d(j2, zzVar, zzVar3, zzVar2);
        }
        return zzVar2;
    }

    @Override // defpackage.ack
    public final long a(zz zzVar, zz zzVar2, zz zzVar3) {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.ack
    public final /* synthetic */ zz b(zz zzVar, zz zzVar2, zz zzVar3) {
        return acj.a(this, zzVar, zzVar2, zzVar3);
    }

    @Override // defpackage.ack
    public final zz c(long j, zz zzVar, zz zzVar2, zz zzVar3) {
        return this.a.c(f(j), zzVar, zzVar2, g(j, zzVar, zzVar3, zzVar2));
    }

    @Override // defpackage.ack
    public final zz d(long j, zz zzVar, zz zzVar2, zz zzVar3) {
        return this.a.d(f(j), zzVar, zzVar2, g(j, zzVar, zzVar3, zzVar2));
    }

    @Override // defpackage.ack
    public final boolean e() {
        return true;
    }
}
