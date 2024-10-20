package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egw {
    public final int a;
    public final CharSequence b;

    static {
        aqjn.v(new armo(5, 5), new armo(12, 12), new armo(1, 1), new armo(7, 7), new armo(9, 9), new armo(11, 11), new armo(14, 14), new armo(4, 4), new armo(15, 15), new armo(3, 3), new armo(2, 2), new armo(10, 10), new armo(8, 8));
    }

    public egw(int i, CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof egw) {
            egw egwVar = (egw) obj;
            if (this.a == egwVar.a && d.F(this.b, egwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }
}
