package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amah {
    public final amag a;
    private final Comparator b;

    public amah(amag amagVar) {
        boolean z;
        amagVar.getClass();
        this.a = amagVar;
        this.b = null;
        if (amagVar != amag.SORTED) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof amah)) {
            return false;
        }
        amah amahVar = (amah) obj;
        if (this.a == amahVar.a) {
            Comparator comparator = amahVar.b;
            if (d.B(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, this.a);
        return aj.toString();
    }
}
