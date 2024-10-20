package defpackage;

import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ahyu implements Parcelable {
    public final String a;
    public final String b;
    public final List c;

    public ahyu() {
        throw null;
    }

    public static arbj a(String str, List list) {
        arbj arbjVar = new arbj();
        if (str != null) {
            arbjVar.b = str;
            arbjVar.ab(list);
            return arbjVar;
        }
        throw new NullPointerException("Null name");
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahyu) {
            ahyu ahyuVar = (ahyu) obj;
            if (this.a.equals(ahyuVar.a) && ((str = this.b) != null ? str.equals(ahyuVar.b) : ahyuVar.b == null) && this.c.equals(ahyuVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((hashCode2 * 1000003) ^ hashCode) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "AddressComponent{name=" + this.a + ", shortName=" + this.b + ", types=" + this.c.toString() + "}";
    }

    public ahyu(String str, String str2, List list) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
        this.b = str2;
        if (list != null) {
            this.c = list;
            return;
        }
        throw new NullPointerException("Null types");
    }
}
