package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rvo {
    public final rtr a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;

    public rvo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rvo) {
            rvo rvoVar = (rvo) obj;
            if (this.a.equals(rvoVar.a) && this.b == rvoVar.b && this.c == rvoVar.c && this.d == rvoVar.d && this.e == rvoVar.e && this.f == rvoVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        int i2 = 1237;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = ((hashCode * 1000003) ^ i) * 1000003;
        if (true == this.c) {
            i2 = 1231;
        }
        return ((((((i3 ^ i2) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f;
    }

    public final String toString() {
        return "DraftConversionKey{draft=" + String.valueOf(this.a) + ", switchToRcs=" + this.b + ", forceChange=" + this.c + ", selfSubId=" + this.d + ", rcsAttachmentLimit=" + this.e + ", mmsAttachmentLimit=" + this.f + "}";
    }

    public rvo(rtr rtrVar, boolean z, boolean z2, int i, int i2, int i3) {
        this.a = rtrVar;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }
}
