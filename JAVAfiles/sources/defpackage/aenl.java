package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aenl {
    public final String a;

    public aenl(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aenl) && d.F(this.a, ((aenl) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComposeRowDraftInfoUiData(text=" + this.a + ")";
    }
}
