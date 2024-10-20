package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class affr {
    public final Uri a;
    public final aipw b;
    public final ascg c;
    public final afrs d;
    public final int e;
    public final int f;
    public final Integer g;
    public final arqr h;
    public final arqv i;
    private final int j;

    public affr(Uri uri, aipw aipwVar, ascg ascgVar, afrs afrsVar, int i, int i2, Integer num, arqr arqrVar, arqv arqvVar) {
        ascgVar.getClass();
        this.a = uri;
        this.b = aipwVar;
        this.c = ascgVar;
        this.d = afrsVar;
        this.e = i;
        this.j = 1;
        this.f = i2;
        this.g = num;
        this.h = arqrVar;
        this.i = arqvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof affr)) {
            return false;
        }
        affr affrVar = (affr) obj;
        if (!d.F(this.a, affrVar.a) || !d.F(this.b, affrVar.b) || !d.F(this.c, affrVar.c) || !d.F(this.d, affrVar.d) || this.e != affrVar.e) {
            return false;
        }
        int i = affrVar.j;
        if (this.f == affrVar.f && d.F(this.g, affrVar.g) && d.F(this.h, affrVar.h) && d.F(this.i, affrVar.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        Integer num = this.g;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return (((((((((((hashCode2 * 31) + this.e) * 31) + 1) * 31) + this.f) * 31) + hashCode) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "FileAudioSinkConfiguration(outputUri=" + this.a + ", sourcePolicy=" + this.b + ", inputFlow=" + this.c + ", format=" + this.d + ", sampleRate=" + this.e + ", channelCount=1, bitRate=" + this.f + ", maxFileSize=" + this.g + ", onMaxFileSizeReached=" + this.h + ", onError=" + this.i + ")";
    }
}
