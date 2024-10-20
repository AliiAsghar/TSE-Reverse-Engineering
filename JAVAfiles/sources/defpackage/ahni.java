package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahni implements ahlx {
    public final float a;
    public final int b;
    public final armf c;
    public final algw d;
    private final int e;

    public ahni() {
        throw null;
    }

    public static final ahnh c() {
        ahnh ahnhVar = new ahnh(null);
        ahnhVar.a = 100.0f;
        ahnhVar.e = 1;
        ahnhVar.b = 100;
        ahnhVar.d = (byte) 3;
        return ahnhVar;
    }

    @Override // defpackage.ahlx
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.ahlx
    public final boolean b() {
        int i = this.e;
        if (i == 3 || i == 1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        armf armfVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahni)) {
            return false;
        }
        ahni ahniVar = (ahni) obj;
        int i = this.e;
        int i2 = ahniVar.e;
        if (i != 0) {
            if (i == i2) {
                if (Float.floatToIntBits(this.a) == Float.floatToIntBits(ahniVar.a) && this.b == ahniVar.b && ((armfVar = this.c) != null ? armfVar.equals(ahniVar.c) : ahniVar.c == null) && this.d.equals(ahniVar.d)) {
                    return true;
                }
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.e;
        a.aS(i);
        int floatToIntBits = ((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a);
        armf armfVar = this.c;
        if (armfVar == null) {
            hashCode = 0;
        } else {
            hashCode = armfVar.hashCode();
        }
        return (((((floatToIntBits * 1000003) ^ this.b) * 1000003) ^ hashCode) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        algw algwVar = this.d;
        return "CrashConfigurations{enablement=" + ahly.a(this.e) + ", startupSamplePercentage=" + this.a + ", debugLogsSize=" + this.b + ", metricExtensionProvider=" + String.valueOf(this.c) + ", crashLoopListener=" + String.valueOf(algwVar) + "}";
    }

    public ahni(int i, float f, int i2, armf armfVar, algw algwVar) {
        this.e = i;
        this.a = f;
        this.b = i2;
        this.c = armfVar;
        this.d = algwVar;
    }
}
