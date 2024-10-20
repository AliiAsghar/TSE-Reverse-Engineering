package defpackage;

import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aiad implements Parcelable {
    public final Integer a;
    public final List b;

    public aiad() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiad) {
            aiad aiadVar = (aiad) obj;
            if (this.a.equals(aiadVar.a) && this.b.equals(aiadVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "EVChargeOptions{connectorCount=" + this.a + ", connectorAggregations=" + this.b.toString() + "}";
    }

    public aiad(Integer num, List list) {
        this.a = num;
        if (list == null) {
            throw new NullPointerException("Null connectorAggregations");
        }
        this.b = list;
    }
}
