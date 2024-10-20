package defpackage;

import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aiaf implements Parcelable {
    public final List a;

    public aiaf() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiaf) {
            return this.a.equals(((aiaf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "FuelOptions{fuelPrices=" + this.a.toString() + "}";
    }

    public aiaf(List list) {
        if (list == null) {
            throw new NullPointerException("Null fuelPrices");
        }
        this.a = list;
    }
}
