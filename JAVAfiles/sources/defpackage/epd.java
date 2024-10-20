package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class epd {
    public final Map b = new LinkedHashMap();

    public abstract Object a(epc epcVar);

    public final boolean equals(Object obj) {
        if ((obj instanceof epd) && d.F(this.b, ((epd) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.b + ')';
    }
}
