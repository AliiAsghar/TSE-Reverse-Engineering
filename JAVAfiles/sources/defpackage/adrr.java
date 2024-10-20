package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adrr {
    public final boolean a;
    public final ajpz b;

    public adrr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adrr) {
            adrr adrrVar = (adrr) obj;
            if (this.a == adrrVar.a && this.b.equals(adrrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((i ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SendCpimMessageRequest{requiresFailureReport=" + this.a + ", message=" + String.valueOf(this.b) + "}";
    }

    public adrr(boolean z, ajpz ajpzVar) {
        this.a = z;
        this.b = ajpzVar;
    }
}
