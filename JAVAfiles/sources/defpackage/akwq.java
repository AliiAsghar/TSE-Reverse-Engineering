package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akwq {
    public final List a;

    static {
        new akwq(Collections.emptyList());
    }

    public akwq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof akwq) && this.a.equals(((akwq) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "DescribeActionsResponse{actions=" + this.a.toString() + ", loading=false}";
    }

    public akwq(List list) {
        if (list == null) {
            throw new NullPointerException("Null actions");
        }
        this.a = list;
    }
}
