package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeom {
    public final List a;
    public final Integer b;
    public final arqr c;

    public aeom(List list, Integer num, arqr arqrVar) {
        list.getClass();
        this.a = list;
        this.b = num;
        this.c = arqrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeom)) {
            return false;
        }
        aeom aeomVar = (aeom) obj;
        if (d.F(this.a, aeomVar.a) && d.F(this.b, aeomVar.b) && d.F(this.c, aeomVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ComposeRowSimSelectorUiData(sims=" + this.a + ", selected=" + this.b + ", onSelect=" + this.c + ")";
    }
}
