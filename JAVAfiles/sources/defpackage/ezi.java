package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezi {
    public final String a;
    public final eqn b;
    public final eqn c;
    public final int d;
    public final int e;

    public ezi(String str, eqn eqnVar, eqn eqnVar2, int i, int i2) {
        boolean z = true;
        if (i != 0) {
            if (i2 == 0) {
                i2 = 0;
            } else {
                z = false;
            }
        }
        d.s(z);
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
            this.b = eqnVar;
            dzg.g(eqnVar2);
            this.c = eqnVar2;
            this.d = i;
            this.e = i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ezi eziVar = (ezi) obj;
            if (this.d == eziVar.d && this.e == eziVar.e && this.a.equals(eziVar.a) && this.b.equals(eziVar.b) && this.c.equals(eziVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.d + 527) * 31) + this.e) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
