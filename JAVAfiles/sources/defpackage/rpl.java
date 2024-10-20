package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rpl {
    public final boolean a;
    public final boolean b;

    public rpl(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpl)) {
            return false;
        }
        rpl rplVar = (rpl) obj;
        if (this.a == rplVar.a && this.b == rplVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.v(this.a) * 31) + a.v(this.b);
    }

    public final String toString() {
        return "DatabaseRestoreConfig(enableBasicXmsMessageDeduplication=" + this.a + ", enableDuplicatePartMapping=" + this.b + ")";
    }
}
