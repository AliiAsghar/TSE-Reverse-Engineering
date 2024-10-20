package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqs {
    public final String a;
    public final String b;

    static {
        eul.M(0);
        eul.M(1);
    }

    public eqs(String str, String str2) {
        this.a = eul.O(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            eqs eqsVar = (eqs) obj;
            if (Objects.equals(this.a, eqsVar.a) && Objects.equals(this.b, eqsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode() * 31;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
