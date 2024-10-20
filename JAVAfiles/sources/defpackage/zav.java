package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zav {
    public final arqg a;

    public zav(arqg arqgVar) {
        this.a = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zav) && d.F(this.a, ((zav) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DuplicateGroupNoticeUiData(onDuplicateGroupLinkClick=" + this.a + ")";
    }

    public zav() {
        this(yyo.f);
    }
}
