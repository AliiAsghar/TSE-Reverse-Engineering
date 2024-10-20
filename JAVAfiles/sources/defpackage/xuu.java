package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xuu {
    public final List a;
    public final xuv b;
    public final boolean c;
    public final boolean d;
    public final voe e;
    private final String f;

    public xuu(List list, xuv xuvVar, boolean z, boolean z2, voe voeVar) {
        list.getClass();
        xuvVar.getClass();
        this.a = list;
        this.b = xuvVar;
        this.c = z;
        this.d = z2;
        this.e = voeVar;
        this.f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xuu)) {
            return false;
        }
        xuu xuuVar = (xuu) obj;
        if (!d.F(this.a, xuuVar.a) || !d.F(this.b, xuuVar.b) || this.c != xuuVar.c || this.d != xuuVar.d || !d.F(this.e, xuuVar.e)) {
            return false;
        }
        String str = xuuVar.f;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        voe voeVar = this.e;
        if (voeVar == null) {
            hashCode = 0;
        } else {
            hashCode = voeVar.hashCode();
        }
        return ((((((hashCode2 * 31) + a.v(this.c)) * 31) + a.v(this.d)) * 31) + hashCode) * 31;
    }

    public final String toString() {
        return "MessageAttachmentsParams(attachments=" + this.a + ", attachmentClickListener=" + this.b + ", isIncoming=" + this.c + ", isSenderRbmBot=" + this.d + ", googlePhotosSharingState=" + this.e + ", searchFilter=null)";
    }
}
