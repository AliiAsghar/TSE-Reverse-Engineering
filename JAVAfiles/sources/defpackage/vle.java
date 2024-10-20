package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vle {
    public final Optional a;
    public final CharSequence b;
    public final long c;
    public final Optional d;
    public final Optional e;

    public vle() {
        throw null;
    }

    public static vld a(vlq vlqVar, CharSequence charSequence, long j) {
        vld vldVar = new vld((byte[]) null);
        vldVar.b = Optional.of(vlqVar);
        vldVar.b(charSequence);
        vldVar.c(j);
        return vldVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vle) {
            vle vleVar = (vle) obj;
            if (this.a.equals(vleVar.a) && this.b.equals(vleVar.b) && this.c == vleVar.c && this.d.equals(vleVar.d) && this.e.equals(vleVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.c;
        return (((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        Optional optional = this.e;
        Optional optional2 = this.d;
        CharSequence charSequence = this.b;
        return "NotificationMessage{personInfo=" + String.valueOf(this.a) + ", messageText=" + String.valueOf(charSequence) + ", messageTimestamp=" + this.c + ", attachmentType=" + String.valueOf(optional2) + ", attachmentUri=" + String.valueOf(optional) + "}";
    }

    public vle(Optional optional, CharSequence charSequence, long j, Optional optional2, Optional optional3) {
        this.a = optional;
        this.b = charSequence;
        this.c = j;
        this.d = optional2;
        this.e = optional3;
    }
}
