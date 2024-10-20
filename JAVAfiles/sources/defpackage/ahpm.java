package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahpm implements ahlx {
    public final int a;
    public final boolean b;
    public final algw c;
    private final int d;

    public ahpm() {
        throw null;
    }

    public static final ahqx c() {
        ahqx ahqxVar = new ahqx(null, null);
        ahqxVar.d(false);
        ahqxVar.d = 50;
        ahqxVar.c = (byte) (ahqxVar.c | 1);
        ahqxVar.e = alfd.a;
        ahqxVar.a = 1;
        return ahqxVar;
    }

    @Override // defpackage.ahlx
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
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
        if (!(obj instanceof ahpm)) {
            return false;
        }
        ahpm ahpmVar = (ahpm) obj;
        int i = this.d;
        int i2 = ahpmVar.d;
        if (i != 0) {
            if (i == i2 && this.a == ahpmVar.a && this.b == ahpmVar.b && this.c.equals(ahpmVar.c)) {
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
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((((((i2 ^ 1000003) * 1000003) ^ this.a) * (-721379959)) ^ i) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "NetworkConfigurations{enablement=" + ahly.a(this.d) + ", batchSize=" + this.a + ", urlSanitizer=null, enableUrlAutoSanitization=" + this.b + ", metricExtensionProvider=" + String.valueOf(this.c) + "}";
    }

    public ahpm(int i, int i2, boolean z, algw algwVar) {
        this.d = i;
        this.a = i2;
        this.b = z;
        this.c = algwVar;
    }
}
