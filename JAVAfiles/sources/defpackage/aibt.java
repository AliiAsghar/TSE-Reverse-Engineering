package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aibt {
    public final List a;

    public aibt() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aibt) {
            return this.a.equals(((aibt) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "FindCurrentPlaceResponse{placeLikelihoods=" + this.a.toString() + "}";
    }

    public aibt(List list) {
        if (list == null) {
            throw new NullPointerException("Null placeLikelihoods");
        }
        this.a = list;
    }
}
