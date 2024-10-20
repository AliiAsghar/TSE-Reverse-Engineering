package defpackage;

import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aibe implements Parcelable {
    public final List a;

    public aibe() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aibe) {
            return this.a.equals(((aibe) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RoutingSummary{legs=" + this.a.toString() + "}";
    }

    public aibe(List list) {
        if (list == null) {
            throw new NullPointerException("Null legs");
        }
        this.a = list;
    }
}
