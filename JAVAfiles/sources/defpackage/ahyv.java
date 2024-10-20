package defpackage;

import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ahyv implements Parcelable {
    public final List a;

    public ahyv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahyv) {
            return this.a.equals(((ahyv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AddressComponents{asList=" + this.a.toString() + "}";
    }

    public ahyv(List list) {
        if (list == null) {
            throw new NullPointerException("Null asList");
        }
        this.a = list;
    }
}
