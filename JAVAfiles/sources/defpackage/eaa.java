package defpackage;

import android.content.LocusId;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eaa {
    public final String a;
    public final LocusId b;

    public eaa(String str) {
        dye.j(str);
        this.a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = new LocusId(str);
        } else {
            this.b = null;
        }
    }

    public static eaa a(LocusId locusId) {
        String id;
        d.aC(locusId, "locusId cannot be null");
        id = locusId.getId();
        dye.j(id);
        return new eaa(id);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.a;
        String str2 = ((eaa) obj).a;
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        return str.equals(str2);
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode + 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        sb.append(this.a.length() + "_chars");
        sb.append("]");
        return sb.toString();
    }
}
