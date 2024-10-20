package defpackage;

import com.google.android.libraries.compose.ui.keyboard.detector.KeyboardDetectorViewInsetsListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agbi extends agbk {
    public final agbr a;
    public final KeyboardDetectorViewInsetsListener b;
    public final agar c;

    public agbi(agbr agbrVar, KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener, agar agarVar) {
        this.a = agbrVar;
        this.b = keyboardDetectorViewInsetsListener;
        this.c = agarVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agbi)) {
            return false;
        }
        agbi agbiVar = (agbi) obj;
        if (d.F(this.a, agbiVar.a) && d.F(this.b, agbiVar.b) && d.F(this.c, agbiVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Attached(detectorView=" + this.a + ", insetsListener=" + this.b + ", stateListener=" + this.c + ")";
    }
}
