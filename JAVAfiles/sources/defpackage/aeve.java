package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeve {
    public final aevl a;
    public final aevd b;
    public final int c;

    public aeve(int i, aevl aevlVar, aevd aevdVar) {
        this.c = i;
        this.a = aevlVar;
        this.b = aevdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeve)) {
            return false;
        }
        aeve aeveVar = (aeve) obj;
        if (this.c == aeveVar.c && d.F(this.a, aeveVar.a) && d.F(this.b, aeveVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        a.bm(i);
        return (((i * 31) + this.a.hashCode()) * 31) + 1231;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ProgressBarOverlayUiData(progressBarPosition=");
        int i = this.c;
        if (i != 1) {
            if (i != 2) {
                str = "CENTER";
            } else {
                str = VCardConstants.PROPERTY_END;
            }
        } else {
            str = "START";
        }
        sb.append((Object) str);
        sb.append(", progressBarUiData=");
        sb.append(this.a);
        sb.append(", flags=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ aeve(int i, aevl aevlVar) {
        this(i, aevlVar, new aevd(null));
    }
}
