package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoml {
    public final boolean a;
    public final boolean b;

    public aoml() {
        throw null;
    }

    public static aomk a() {
        aomk aomkVar = new aomk();
        aomkVar.b(false);
        aomkVar.c(false);
        aomkVar.a = (byte) (aomkVar.a | 4);
        return aomkVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aoml) {
            aoml aomlVar = (aoml) obj;
            if (this.a == aomlVar.a && this.b == aomlVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1231;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        if (true != this.b) {
            i2 = 1237;
        }
        return ((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "EncoderOptions{enableCelLogsiteMetadata=" + this.a + ", enableSafeFormatArgs=" + this.b + ", includeSuppressedExceptions=false}";
    }

    public aoml(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
