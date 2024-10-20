package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aerk {
    public final String a;
    private final String b;

    public aerk(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aerk)) {
            return false;
        }
        aerk aerkVar = (aerk) obj;
        if (d.F(this.a, aerkVar.a) && d.F(this.b, aerkVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MddFile(fileId=" + this.a + ", fileGroup=" + this.b + ")";
    }
}
