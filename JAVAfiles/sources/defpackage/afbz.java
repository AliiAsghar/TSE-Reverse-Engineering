package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afbz {
    public final List a;
    public final Uri b;
    public final long c;
    public final long d;
    public final float e;
    public final boolean f;
    public final int g;
    public final boolean h;

    public afbz(List list, Uri uri, long j, long j2, float f, boolean z, int i, boolean z2) {
        this.a = list;
        this.b = uri;
        this.c = j;
        this.d = j2;
        this.e = f;
        this.f = z;
        this.g = i;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afbz)) {
            return false;
        }
        afbz afbzVar = (afbz) obj;
        if (d.F(this.a, afbzVar.a) && d.F(this.b, afbzVar.b) && this.c == afbzVar.c && this.d == afbzVar.d && Float.compare(this.e, afbzVar.e) == 0 && this.f == afbzVar.f && this.g == afbzVar.g && this.h == afbzVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Uri uri = this.b;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        return ((((((((((((hashCode2 + hashCode) * 31) + a.A(this.c)) * 31) + a.A(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + a.v(this.f)) * 31) + this.g) * 31) + a.v(this.h);
    }

    public final String toString() {
        return "VoiceMoodBoxUiData(animatedEmojis=" + this.a + ", backgroundUri=" + this.b + ", gradientStartColorHex=" + this.c + ", gradientEndColorHex=" + this.d + ", gradientAngle=" + this.e + ", onlyShowStaticPrimaryEmoji=" + this.f + ", contentDescriptionResId=" + this.g + ", animateEmoji=" + this.h + ")";
    }
}
