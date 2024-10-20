package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjp {
    private final arqg a;

    public jjp(arqg arqgVar) {
        this.a = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jjp) && d.F(this.a, ((jjp) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DoNotShowCameraUiData(onCameraButtonClick=" + this.a + ")";
    }
}
