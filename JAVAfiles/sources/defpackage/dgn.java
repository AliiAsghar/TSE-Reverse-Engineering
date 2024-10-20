package defpackage;

import defpackage.armh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgn<T extends armh<? extends Boolean>> {
    public final String a;
    public final armh b;

    public dgn(String str, armh armhVar) {
        this.a = str;
        this.b = armhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgn)) {
            return false;
        }
        dgn dgnVar = (dgn) obj;
        if (d.F(this.a, dgnVar.a) && d.F(this.b, dgnVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        armh armhVar = this.b;
        if (armhVar != null) {
            i2 = armhVar.hashCode();
        }
        return (i * 31) + i2;
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
