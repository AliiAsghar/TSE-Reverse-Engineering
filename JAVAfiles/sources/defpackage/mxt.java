package defpackage;

import com.google.android.ims.message.rbm.RbmSpecificMessage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxt implements mye {
    public final alog a;
    public final int b;

    public mxt(alog alogVar, int i) {
        alogVar.getClass();
        this.a = alogVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxt)) {
            return false;
        }
        mxt mxtVar = (mxt) obj;
        if (d.F(this.a, mxtVar.a) && this.b == mxtVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = this.b;
        a.bm(i);
        return hashCode + i;
    }

    @Override // defpackage.mym
    public final String j() {
        return RbmSpecificMessage.CONTENT_TYPE;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BugleRichCardCarouselContent(cards=");
        sb.append(this.a);
        sb.append(", cardWidth=");
        if (this.b != 1) {
            str = "MEDIUM";
        } else {
            str = "SMALL";
        }
        sb.append((Object) str);
        sb.append(")");
        return sb.toString();
    }
}
