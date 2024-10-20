package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeab extends adcx {
    public final String a;
    public final String b;

    public aeab(String str, String str2) {
        super(null, null);
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeab)) {
            return false;
        }
        aeab aeabVar = (aeab) obj;
        if (d.F(this.a, aeabVar.a) && d.F(this.b, aeabVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
