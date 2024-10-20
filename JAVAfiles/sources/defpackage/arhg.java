package defpackage;

import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arhg {
    public final String a;
    public final Map b;

    public arhg(String str, Map map) {
        str.getClass();
        this.a = str;
        map.getClass();
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof arhg) {
            arhg arhgVar = (arhg) obj;
            if (this.a.equals(arhgVar.a) && this.b.equals(arhgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("policyName", this.a);
        aj.b("rawConfigValue", this.b);
        return aj.toString();
    }
}
