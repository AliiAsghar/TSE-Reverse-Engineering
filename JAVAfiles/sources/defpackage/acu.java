package defpackage;

import defpackage.zz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acu<V extends zz> {
    public final zz a;
    public final aak b;
    public final int c = 0;

    public acu(zz zzVar, aak aakVar) {
        this.a = zzVar;
        this.b = aakVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acu)) {
            return false;
        }
        acu acuVar = (acu) obj;
        if (!d.F(this.a, acuVar.a) || !d.F(this.b, acuVar.b)) {
            return false;
        }
        int i = acuVar.c;
        if (a.bA(0, 0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
