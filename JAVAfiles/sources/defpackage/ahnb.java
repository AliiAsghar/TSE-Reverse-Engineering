package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahnb implements ahlx {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final double e;
    private final int f;

    public ahnb() {
        throw null;
    }

    @Override // defpackage.ahlx
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.ahlx
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahnb)) {
            return false;
        }
        ahnb ahnbVar = (ahnb) obj;
        int i = this.f;
        int i2 = ahnbVar.f;
        if (i != 0) {
            if (i2 == 1 && this.a == ahnbVar.a && this.b == ahnbVar.b && this.c == ahnbVar.c && this.d == ahnbVar.d) {
                if (Double.doubleToLongBits(this.e) == Double.doubleToLongBits(ahnbVar.e)) {
                    return true;
                }
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        a.aS(this.f);
        return ((int) ((Double.doubleToLongBits(this.e) >>> 32) ^ Double.doubleToLongBits(this.e))) ^ ((((((((this.a ^ (-722379962)) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        return "CpuProfilingConfigurations{enablement=" + ahly.a(this.f) + ", maxBufferSizeBytes=" + this.a + ", sampleDurationMs=" + this.b + ", sampleDurationSkewMs=" + this.c + ", sampleFrequencyMicro=" + this.d + ", samplesPerEpoch=" + this.e + "}";
    }

    public ahnb(byte[] bArr) {
        this.f = 1;
        this.a = 2097152;
        this.b = 30000;
        this.c = 5000;
        this.d = 1000;
        this.e = 5.0d;
    }
}
