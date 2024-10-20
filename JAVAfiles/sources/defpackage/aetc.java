package defpackage;

import com.android.vcard.VCardConstants;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aetc {
    public final List a;
    public final int b;

    public aetc(int i, List list) {
        this.b = i;
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aetc)) {
            return false;
        }
        aetc aetcVar = (aetc) obj;
        if (this.b == aetcVar.b && d.F(this.a, aetcVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        a.bm(i);
        return (i * 31) + this.a.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TextListItemAnnotation(target=");
        if (this.b != 1) {
            str = "SUBTITLE";
        } else {
            str = VCardConstants.PROPERTY_TITLE;
        }
        sb.append((Object) str);
        sb.append(", annotations=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
