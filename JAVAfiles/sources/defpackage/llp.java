package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class llp implements lkf {
    public final Uri a;
    public final msh b;
    public final List c;
    public final int d;

    public llp(Uri uri, msh mshVar, int i, List list) {
        list.getClass();
        this.a = uri;
        this.b = mshVar;
        this.d = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llp)) {
            return false;
        }
        llp llpVar = (llp) obj;
        if (d.F(this.a, llpVar.a) && d.F(this.b, llpVar.b) && this.d == llpVar.d && d.F(this.c, llpVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Uri uri = this.a;
        int i = 0;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        msh mshVar = this.b;
        if (mshVar != null) {
            i = mshVar.hashCode();
        }
        int i2 = ((hashCode * 31) + i) * 31;
        int i3 = this.d;
        a.bm(i3);
        return ((i2 + i3) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ContactEditor(contactUri=" + this.a + ", identity=" + this.b + ", source=" + ((Object) Integer.toString(a.M(this.d))) + ", contentValues=" + this.c + ")";
    }
}
