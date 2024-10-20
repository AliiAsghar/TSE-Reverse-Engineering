package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aibz {
    public final List a;
    private final List b;

    public aibz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aibz) {
            aibz aibzVar = (aibz) obj;
            if (this.a.equals(aibzVar.a)) {
                List list = this.b;
                List list2 = aibzVar.b;
                if (list != null ? list.equals(list2) : list2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        List list = this.b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        List list = this.b;
        return "SearchByTextResponse{places=" + String.valueOf(this.a) + ", routingSummaries=" + String.valueOf(list) + "}";
    }

    public aibz(List list, List list2) {
        this.a = list;
        this.b = list2;
    }
}
