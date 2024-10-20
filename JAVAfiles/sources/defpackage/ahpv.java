package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahpv implements ahlx {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final alog e;
    private final int f;

    public ahpv() {
        throw null;
    }

    @Override // defpackage.ahlx
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.ahlx
    public final boolean b() {
        int i = this.f;
        if (i == 3 || i == 1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahpv) {
            ahpv ahpvVar = (ahpv) obj;
            if (this.a == ahpvVar.a && this.b == ahpvVar.b && this.c == ahpvVar.c && this.d == ahpvVar.d && alzz.at(this.e, ahpvVar.e)) {
                int i = this.f;
                int i2 = ahpvVar.f;
                if (i != 0) {
                    if (i == i2) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
        int i = this.f;
        a.aS(i);
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        return "StallConfigurations{initialMonitoringDelayMs=" + this.a + ", checkForResponseIntervalMs=" + this.b + ", midStallCheckForResponseIntervalMs=" + this.c + ", postToMainIntervalMs=" + this.d + ", stallThresholdsMs=" + String.valueOf(this.e) + ", enablement=" + ahly.a(this.f) + "}";
    }

    public ahpv(int i, int i2, int i3, int i4, alog alogVar, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = alogVar;
        this.f = i5;
    }
}
