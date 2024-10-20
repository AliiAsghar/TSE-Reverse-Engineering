package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yeo {
    public final List a;

    public yeo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yeo) {
            return this.a.equals(((yeo) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "TenorSearchResponse{results=" + this.a.toString() + "}";
    }

    public yeo(List list) {
        if (list == null) {
            throw new NullPointerException("Null results");
        }
        this.a = list;
    }
}
