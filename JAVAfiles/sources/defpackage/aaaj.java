package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaaj {
    public final aehz a;

    public aaaj(aehz aehzVar) {
        this.a = aehzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aaaj) && d.F(this.a, ((aaaj) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        aehz aehzVar = this.a;
        if (aehzVar == null) {
            return 0;
        }
        return aehzVar.hashCode();
    }

    public final String toString() {
        return "TopbarUiData(goBackAction=" + this.a + ")";
    }
}
