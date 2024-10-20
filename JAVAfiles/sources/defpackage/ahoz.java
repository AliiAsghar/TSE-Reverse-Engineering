package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahoz implements ahlx {
    public final boolean a;
    public final algw b;
    public final boolean c;
    public final boolean d;
    private final int e;
    private final int f;

    public ahoz() {
        throw null;
    }

    public static ahoy c() {
        ahoy ahoyVar = new ahoy(null);
        ahoyVar.a = 3;
        ahoyVar.d = (byte) (ahoyVar.d | 1);
        ahoyVar.c(false);
        ahoyVar.b = alfd.a;
        ahoyVar.b(false);
        ahoyVar.c = true;
        byte b = ahoyVar.d;
        ahoyVar.e = 1;
        ahoyVar.d = (byte) (b | 120);
        return ahoyVar;
    }

    @Override // defpackage.ahlx
    public final int a() {
        return this.e;
    }

    @Override // defpackage.ahlx
    public final boolean b() {
        if (this.f != 2) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahoz)) {
            return false;
        }
        ahoz ahozVar = (ahoz) obj;
        int i = this.f;
        int i2 = ahozVar.f;
        if (i != 0) {
            if (i == i2 && this.e == ahozVar.e && this.a == ahozVar.a && this.b.equals(ahozVar.b) && this.c == ahozVar.c && this.d == ahozVar.d) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.f;
        a.aS(i3);
        int i4 = 1231;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i5 = i3 ^ 1000003;
        int i6 = this.e;
        if (true != this.c) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i7 = ((((((((((i5 * 1000003) ^ i6) * 1000003) ^ i) * 1000003) ^ 2040732332) * 1000003) ^ i2) * 1000003) ^ 1237) * 1000003;
        if (true != this.d) {
            i4 = 1237;
        }
        return ((((i7 ^ i4) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "MemoryConfigurations{enablement=" + ahly.a(this.f) + ", rateLimitPerSecond=" + this.e + ", recordMetricPerProcess=" + this.a + ", metricExtensionProvider=" + String.valueOf(this.b) + ", forceGcBeforeRecordMemory=" + this.c + ", captureDebugMetrics=false, captureMemoryInfo=" + this.d + ", recordMemoryPeriodically=false, randomizePeriodicMemoryMetricStartTime=false}";
    }

    public ahoz(int i, int i2, boolean z, algw algwVar, boolean z2, boolean z3) {
        this.f = i;
        this.e = i2;
        this.a = z;
        this.b = algwVar;
        this.c = z2;
        this.d = z3;
    }
}
