package defpackage;

import defpackage.zz;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abo<V extends zz> implements ack<V> {
    private final ack a;
    private final long b;

    public abo(ack ackVar, long j) {
        this.a = ackVar;
        this.b = j;
    }

    @Override // defpackage.ack
    public final long a(zz zzVar, zz zzVar2, zz zzVar3) {
        return this.a.a(zzVar, zzVar2, zzVar3) + this.b;
    }

    @Override // defpackage.ack
    public final /* synthetic */ zz b(zz zzVar, zz zzVar2, zz zzVar3) {
        return acj.a(this, zzVar, zzVar2, zzVar3);
    }

    @Override // defpackage.ack
    public final zz c(long j, zz zzVar, zz zzVar2, zz zzVar3) {
        long j2 = this.b;
        if (j < j2) {
            return zzVar;
        }
        return this.a.c(j - j2, zzVar, zzVar2, zzVar3);
    }

    @Override // defpackage.ack
    public final zz d(long j, zz zzVar, zz zzVar2, zz zzVar3) {
        long j2 = this.b;
        if (j < j2) {
            return zzVar3;
        }
        return this.a.d(j - j2, zzVar, zzVar2, zzVar3);
    }

    @Override // defpackage.ack
    public final boolean e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof abo)) {
            return false;
        }
        abo aboVar = (abo) obj;
        if (aboVar.b != this.b || !d.F(aboVar.a, this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.A(this.b);
    }
}
