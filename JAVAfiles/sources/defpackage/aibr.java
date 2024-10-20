package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aibr {
    private final List a;

    public aibr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aibr) {
            return this.a.equals(((aibr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "FindAutocompletePredictionsResponse{autocompletePredictions=" + this.a.toString() + "}";
    }

    public aibr(List list) {
        if (list == null) {
            throw new NullPointerException("Null autocompletePredictions");
        }
        this.a = list;
    }
}
