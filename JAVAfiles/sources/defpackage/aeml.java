package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeml {
    public final String a;
    public final boolean b;
    public final arqr c;
    public final boolean d;

    public aeml() {
        this(false, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeml)) {
            return false;
        }
        aeml aemlVar = (aeml) obj;
        if (d.F(this.a, aemlVar.a) && this.b == aemlVar.b && d.F(this.c, aemlVar.c) && this.d == aemlVar.d) {
            return true;
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
        return (((((hashCode * 31) + a.v(this.b)) * 31) + this.c.hashCode()) * 31) + a.v(this.d);
    }

    public final String toString() {
        return "CircleCheckboxUiData(contentDescription=" + this.a + ", isChecked=" + this.b + ", onCheckedChange=" + this.c + ", isTalkbackTarget=" + this.d + ")";
    }

    public aeml(String str, boolean z, arqr arqrVar, boolean z2) {
        arqrVar.getClass();
        this.a = str;
        this.b = z;
        this.c = arqrVar;
        this.d = z2;
    }

    public /* synthetic */ aeml(boolean z, arqr arqrVar, int i) {
        this(null, z & ((i & 2) == 0), (i & 4) != 0 ? aedh.h : arqrVar, true);
    }
}
