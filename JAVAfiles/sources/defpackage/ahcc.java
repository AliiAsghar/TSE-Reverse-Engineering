package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahcc {
    public final String a;
    public final int b;

    public ahcc(int i, String str) {
        this.b = i;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ahcc) {
            ahcc ahccVar = (ahcc) obj;
            if (ahccVar.b - 1 == this.b - 1 && d.B(ahccVar.a, this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (this.b - 1) + (hashCode * 31);
    }
}
