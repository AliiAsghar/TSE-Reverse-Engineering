package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afew {
    public final Uri a;
    public final aipw b;
    public final int c;
    public final int d;
    public final Integer e;
    private final int f = 1;
    private final int g = 2;
    private final int h = 2;

    public afew(Uri uri, aipw aipwVar, int i, int i2, Integer num) {
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
        if (!(obj instanceof afew)) {
            return false;
        }
        afew afewVar = (afew) obj;
        if (!d.F(this.a, afewVar.a) || !d.F(this.b, afewVar.b) || this.c != afewVar.c) {
            return false;
        }
        int i = afewVar.f;
        int i2 = afewVar.g;
        if (this.d != afewVar.d) {
            return false;
        }
        int i3 = afewVar.h;
        if (d.F(this.e, afewVar.e)) {
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
        return (((((((((((hashCode2 * 31) + this.c) * 31) + 1) * 31) + 2) * 31) + this.d) * 31) + 2) * 31) + hashCode;
    }

    public final String toString() {
        return "Mpeg4EncoderConfiguration(outputUri=" + this.a + ", sourcePolicy=" + this.b + ", sampleRate=" + this.c + ", channelCount=1, pcmEncoding=2, bitRate=" + this.d + ", aacProfile=2, maxFileSize=" + this.e + ")";
    }
}
