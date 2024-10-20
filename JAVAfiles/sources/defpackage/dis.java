package defpackage;

import defpackage.dhv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dis implements dhv.a {
    public final String a;

    public /* synthetic */ dis(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dis) && d.F(this.a, ((dis) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringAnnotation(value=" + this.a + ')';
    }
}
