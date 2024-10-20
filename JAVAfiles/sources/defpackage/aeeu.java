package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeeu extends adcx {
    public final aect a;
    public final String b;
    public final List c;
    public final List d;

    public aeeu(aect aectVar, String str, List list, List list2) {
        super(null, null);
        this.a = aectVar;
        this.b = str;
        this.c = list;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeeu)) {
            return false;
        }
        aeeu aeeuVar = (aeeu) obj;
        if (d.F(this.a, aeeuVar.a) && d.F(this.b, aeeuVar.b) && d.F(this.c, aeeuVar.c) && d.F(this.d, aeeuVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((hashCode2 + hashCode) * 31) + this.c.hashCode()) * 31) + 1;
    }
}
