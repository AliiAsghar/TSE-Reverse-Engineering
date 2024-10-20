package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aejp implements aejs {
    public final String a;
    public final String b;
    private final boolean c;
    private final String d;

    public /* synthetic */ aejp(String str, String str2, String str3, int i) {
        this.a = str;
        this.b = (i & 2) != 0 ? null : str2;
        this.c = false;
        this.d = str3;
    }

    @Override // defpackage.aejt
    public final String c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aejp)) {
            return false;
        }
        aejp aejpVar = (aejp) obj;
        if (!d.F(this.a, aejpVar.a) || !d.F(this.b, aejpVar.b)) {
            return false;
        }
        boolean z = aejpVar.c;
        if (d.F(this.d, aejpVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((hashCode2 + hashCode) * 31) + 1237) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Error(title=" + this.a + ", subtitle=" + this.b + ", isIconHighlighted=false, contentDescription=" + this.d + ")";
    }
}
