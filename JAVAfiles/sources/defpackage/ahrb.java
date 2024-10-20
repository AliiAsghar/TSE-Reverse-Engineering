package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahrb implements ahlx {
    public final float a;
    private final int b;

    public ahrb() {
        throw null;
    }

    public static final ahra c() {
        ahra ahraVar = new ahra();
        ahraVar.a = 0.5f;
        ahraVar.b = (byte) 1;
        ahraVar.c = 1;
        return ahraVar;
    }

    @Override // defpackage.ahlx
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.ahlx
    public final boolean b() {
        if (this.b == 3) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahrb)) {
            return false;
        }
        ahrb ahrbVar = (ahrb) obj;
        int i = this.b;
        int i2 = ahrbVar.b;
        if (i != 0) {
            if (i == i2) {
                if (Float.floatToIntBits(this.a) == Float.floatToIntBits(ahrbVar.a)) {
                    return true;
                }
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        a.aS(i);
        return ((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "TraceConfigurations{enablement=" + ahly.a(this.b) + ", samplingProbability=" + this.a + "}";
    }

    public ahrb(int i, float f) {
        this.b = i;
        this.a = f;
    }
}
