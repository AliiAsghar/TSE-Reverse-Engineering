package defpackage;

import defpackage.dhv;

/* compiled from: PG */
@armg
/* loaded from: classes.dex */
public final class djh implements dhv.a {
    public final String a;

    public djh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof djh) && d.F(this.a, ((djh) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UrlAnnotation(url=" + this.a + ')';
    }
}
