package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aela implements aelb {
    public final String a;
    public final String b;
    public final aeli c;
    private final int d = 0;

    public aela(String str, String str2, aeli aeliVar) {
        this.a = str;
        this.b = str2;
        this.c = aeliVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aela)) {
            return false;
        }
        aela aelaVar = (aela) obj;
        if (!d.F(this.a, aelaVar.a)) {
            return false;
        }
        int i = aelaVar.d;
        if (d.F(this.b, aelaVar.b) && d.F(this.c, aelaVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 961) + this.b.hashCode();
        this.c.hashCode();
        return (hashCode * 31) + 32;
    }

    public final String toString() {
        return "Text(text=" + this.a + ", count=0, contentDescription=" + this.b + ", style=" + this.c + ")";
    }
}
