package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atsh {
    public final String a;
    public final boolean b;

    public atsh() {
        this("", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atsh)) {
            return false;
        }
        atsh atshVar = (atsh) obj;
        if (d.F(this.a, atshVar.a) && this.b == atshVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.v(this.b);
    }

    public final String toString() {
        return "EntryPointUiData(accountName=" + this.a + ", hideEntryForBoundAccount=" + this.b + ")";
    }

    public atsh(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }
}
