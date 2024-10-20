package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xop {
    public final armf a;
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;

    public xop(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.d = armfVar4;
        this.e = armfVar5;
        this.f = armfVar6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xop)) {
            return false;
        }
        xop xopVar = (xop) obj;
        if (d.F(this.a, xopVar.a) && d.F(this.b, xopVar.b) && d.F(this.c, xopVar.c) && d.F(this.d, xopVar.d) && d.F(this.e, xopVar.e) && d.F(this.f, xopVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "BugleCronetConfig(copperHostsList=" + this.a + ", cronetCacheMaxSize=" + this.b + ", staleDnsFreshLookoutTimeout=" + this.c + ", staleDnsMaxExpiredDelay=" + this.d + ", staleDnsAllowCrossNetworkUsage=" + this.e + ", quicRetransmittableOnWireTimeoutMillis=" + this.f + ")";
    }
}
