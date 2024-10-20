package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class afzi {
    public final View a;
    public final afll b;

    public afzi(View view, afll afllVar) {
        this.a = view;
        this.b = afllVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afzi)) {
            return false;
        }
        afzi afziVar = (afzi) obj;
        if (d.F(this.a, afziVar.a) && d.F(this.b, afziVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "TextControl(view=" + this.a + ", controller=" + this.b + ")";
    }
}
