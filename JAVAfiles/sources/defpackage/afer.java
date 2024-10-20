package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afer {
    public final Uri a;
    public final aipw b;
    public final int c;
    public final int d;
    public final Integer e;
    private final int f = 1;
    private final int g = 2;

    public afer(Uri uri, aipw aipwVar, int i, int i2, Integer num) {
        this.a = uri;
        this.b = aipwVar;
        this.c = i;
        this.d = i2;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afer)) {
            return false;
        }
        afer aferVar = (afer) obj;
        if (!d.F(this.a, aferVar.a) || !d.F(this.b, aferVar.b) || this.c != aferVar.c) {
            return false;
        }
        int i = aferVar.f;
        int i2 = aferVar.g;
        if (this.d == aferVar.d && d.F(this.e, aferVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        Integer num = this.e;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return (((((((((hashCode2 * 31) + this.c) * 31) + 1) * 31) + 2) * 31) + this.d) * 31) + hashCode;
    }

    public final String toString() {
        return "AmrEncoderConfiguration(outputUri=" + this.a + ", sourcePolicy=" + this.b + ", sampleRate=" + this.c + ", channelCount=1, pcmEncoding=2, bitRate=" + this.d + ", maxFileSize=" + this.e + ")";
    }
}
