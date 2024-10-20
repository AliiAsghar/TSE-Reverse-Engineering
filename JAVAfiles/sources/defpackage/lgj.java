package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgj {
    public final ascv a;

    public lgj(ascv ascvVar) {
        ascvVar.getClass();
        this.a = ascvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lgj) && d.F(this.a, ((lgj) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BottomContentUiData(composeRow=" + this.a + ")";
    }
}
