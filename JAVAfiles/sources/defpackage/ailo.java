package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ailo {
    public final boolean a;
    public final boolean b;
    public final ailh c;
    public final algw d;

    public ailo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ailo) {
            ailo ailoVar = (ailo) obj;
            if (this.a == ailoVar.a && this.b == ailoVar.b && this.c.equals(ailoVar.c) && this.d.equals(ailoVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        if (true == this.b) {
            i2 = 1231;
        }
        return ((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        algw algwVar = this.d;
        return "DiscoverySpec{forceIPv4=" + this.a + ", preferIPv6=" + this.b + ", transportProtocol=" + this.c.toString() + ", logPrefix=" + algwVar.toString() + "}";
    }

    public ailo(boolean z, boolean z2, ailh ailhVar, algw algwVar) {
        this.a = z;
        this.b = z2;
        if (ailhVar == null) {
            throw new NullPointerException("Null transportProtocol");
        }
        this.c = ailhVar;
        this.d = algwVar;
    }
}
