package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahqz implements ahlx {
    public final int a;
    public final boolean b;
    public final ahqy c;
    private final int d;

    public ahqz() {
        throw null;
    }

    public static final ahqx c() {
        ahqx ahqxVar = new ahqx();
        ahqxVar.a = 10;
        byte b = ahqxVar.c;
        ahqxVar.b = true;
        ahqxVar.c = (byte) (b | 3);
        ahqxVar.e = new ahqy(1.0f);
        ahqxVar.d = 1;
        ahqxVar.c = (byte) (b | 7);
        return ahqxVar;
    }

    @Override // defpackage.ahlx
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ahlx
    public final boolean b() {
        if (this.d == 3) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahqz)) {
            return false;
        }
        ahqz ahqzVar = (ahqz) obj;
        int i = this.d;
        int i2 = ahqzVar.d;
        if (i != 0) {
            if (i == i2 && this.a == ahqzVar.a && this.c.equals(ahqzVar.c) && this.b == ahqzVar.b) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = this.d;
        a.aS(i2);
        int hashCode = ((((i2 ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.c.hashCode();
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((hashCode * 1000003) ^ i) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "TikTokTraceConfigurations{enablement=" + ahly.a(this.d) + ", rateLimitPerSecond=" + this.a + ", dynamicSampler=" + String.valueOf(this.c) + ", recordTimerDuration=" + this.b + ", sendEmptyTraces=false}";
    }

    public ahqz(int i, int i2, ahqy ahqyVar, boolean z) {
        this.d = i;
        this.a = i2;
        this.c = ahqyVar;
        this.b = z;
    }
}
