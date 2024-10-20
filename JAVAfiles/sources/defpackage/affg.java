package defpackage;

import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class affg {
    public final Uri a;
    public final aipw b;
    public final afrs c;
    public final int d;
    public final int e;
    public final affi f;
    public final Duration g;
    public final arqv h;
    public final Integer i;
    public final arqv j;
    public final arqw k;
    private final int l = 1;

    public affg(Uri uri, aipw aipwVar, afrs afrsVar, int i, int i2, affi affiVar, Duration duration, arqv arqvVar, Integer num, arqv arqvVar2, arqw arqwVar) {
        this.a = uri;
        this.b = aipwVar;
        this.c = afrsVar;
        this.d = i;
        this.e = i2;
        this.f = affiVar;
        this.g = duration;
        this.h = arqvVar;
        this.i = num;
        this.j = arqvVar2;
        this.k = arqwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof affg)) {
            return false;
        }
        affg affgVar = (affg) obj;
        if (!d.F(this.a, affgVar.a) || !d.F(this.b, affgVar.b) || !d.F(this.c, affgVar.c) || this.d != affgVar.d) {
            return false;
        }
        int i = affgVar.l;
        if (this.e == affgVar.e && d.F(this.f, affgVar.f) && d.F(this.g, affgVar.g) && d.F(this.h, affgVar.h) && d.F(this.i, affgVar.i) && d.F(this.j, affgVar.j) && d.F(this.k, affgVar.k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        affi affiVar = this.f;
        int i = 0;
        if (affiVar == null) {
            hashCode = 0;
        } else {
            hashCode = affiVar.hashCode();
        }
        int i2 = ((((((((hashCode3 * 31) + this.d) * 31) + 1) * 31) + this.e) * 31) + hashCode) * 31;
        Duration duration = this.g;
        if (duration == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = duration.hashCode();
        }
        int hashCode4 = (((i2 + hashCode2) * 31) + this.h.hashCode()) * 31;
        Integer num = this.i;
        if (num != null) {
            i = num.hashCode();
        }
        return ((((hashCode4 + i) * 31) + this.j.hashCode()) * 31) + this.k.hashCode();
    }

    public final String toString() {
        return "AudioRecorderConfiguration(outputUri=" + this.a + ", sourcePolicy=" + this.b + ", format=" + this.c + ", sampleRate=" + this.d + ", channelCount=1, bitRate=" + this.e + ", recorderEffectFactory=" + this.f + ", maxDuration=" + this.g + ", onMaxDurationReached=" + this.h + ", maxFileSize=" + this.i + ", onMaxFileSizeReached=" + this.j + ", onError=" + this.k + ")";
    }
}
