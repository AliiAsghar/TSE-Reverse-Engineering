package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agou {
    public final agoz a;
    public final agmc b;
    public final int c;
    public final List d;

    public agou() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agou) {
            agou agouVar = (agou) obj;
            if (this.a.equals(agouVar.a) && this.b.equals(agouVar.b) && this.c == agouVar.c && this.d.equals(agouVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.d) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        List list = this.d;
        agmc agmcVar = this.b;
        return "PreChangeCallState{query=" + this.a.toString() + ", changeListener=" + agmcVar.toString() + ", listPosition=" + this.c + ", preChangeDataObjects=" + list.toString() + "}";
    }

    public agou(agoz agozVar, agmc agmcVar, int i, List list) {
        this.a = agozVar;
        if (agmcVar == null) {
            throw new NullPointerException("Null changeListener");
        }
        this.b = agmcVar;
        this.c = i;
        if (list != null) {
            this.d = list;
            return;
        }
        throw new NullPointerException("Null preChangeDataObjects");
    }
}
