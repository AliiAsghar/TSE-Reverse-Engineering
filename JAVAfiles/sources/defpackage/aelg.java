package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aelg {
    public final List a;

    public aelg(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aelg) && d.F(this.a, ((aelg) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BadgeRowUiData(groups=" + this.a + ")";
    }

    public aelg() {
        this(arnv.a);
    }
}
