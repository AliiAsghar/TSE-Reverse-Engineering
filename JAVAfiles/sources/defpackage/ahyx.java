package defpackage;

import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ahyx implements Parcelable {
    public final List a;

    public ahyx() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahyx) {
            return this.a.equals(((ahyx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AuthorAttributions{asList=" + this.a.toString() + "}";
    }

    public ahyx(List list) {
        if (list == null) {
            throw new NullPointerException("Null asList");
        }
        this.a = list;
    }
}
