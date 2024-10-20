package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lnl implements lkf {
    public final Uri a;
    private final Integer b;
    private final int c = 6;

    public lnl(Uri uri, Integer num) {
        this.a = uri;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnl)) {
            return false;
        }
        lnl lnlVar = (lnl) obj;
        int i = lnlVar.c;
        if (d.F(this.a, lnlVar.a) && d.F(this.b, lnlVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        a.bm(6);
        Uri uri = this.a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        return ((hashCode + 186) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PenPalMagicEdit(openingSource=" + ((Object) akec.aj(6)) + ", uri=" + this.a + ", position=" + this.b + ")";
    }
}
