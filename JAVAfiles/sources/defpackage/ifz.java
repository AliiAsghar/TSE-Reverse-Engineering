package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifz {
    public final String a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final alog e;
    public final int f;

    public ifz() {
        throw null;
    }

    public static pwq a() {
        pwq pwqVar = new pwq(null, null);
        int i = alog.d;
        pwqVar.j(alsx.a);
        pwqVar.i(0);
        return pwqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ifz) {
            ifz ifzVar = (ifz) obj;
            if (this.a.equals(ifzVar.a) && this.b.equals(ifzVar.b) && this.c.equals(ifzVar.c) && this.d.equals(ifzVar.d) && alzz.at(this.e, ifzVar.e) && this.f == ifzVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f;
    }

    public final String toString() {
        alog alogVar = this.e;
        Optional optional = this.d;
        Optional optional2 = this.c;
        return "Request{displayDestination=" + this.a + ", newBlockStatus=" + String.valueOf(this.b) + ", newSpamStatus=" + String.valueOf(optional2) + ", undoAction=" + String.valueOf(optional) + ", snackbarInteractions=" + String.valueOf(alogVar) + ", anchorViewId=" + this.f + "}";
    }

    public ifz(String str, Optional optional, Optional optional2, Optional optional3, alog alogVar, int i) {
        this.a = str;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
        this.e = alogVar;
        this.f = i;
    }
}
