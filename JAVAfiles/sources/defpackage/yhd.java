package defpackage;

import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yhd {
    public final Uri a;
    public final File b;
    public final long c;
    public final double d;
    public final boolean e;
    public final double f;
    public final String g;

    public yhd() {
        throw null;
    }

    public static yhc a() {
        yhc yhcVar = new yhc();
        yhcVar.b(1.0d);
        return yhcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yhd) {
            yhd yhdVar = (yhd) obj;
            if (this.a.equals(yhdVar.a) && this.b.equals(yhdVar.b) && this.c == yhdVar.c) {
                if (Double.doubleToLongBits(this.d) == Double.doubleToLongBits(yhdVar.d) && this.e == yhdVar.e) {
                    if (Double.doubleToLongBits(this.f) == Double.doubleToLongBits(yhdVar.f)) {
                        String str = this.g;
                        String str2 = yhdVar.g;
                        if (str != null ? str.equals(str2) : str2 == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long doubleToLongBits = (Double.doubleToLongBits(this.d) >>> 32) ^ Double.doubleToLongBits(this.d);
        long doubleToLongBits2 = (Double.doubleToLongBits(this.f) >>> 32) ^ Double.doubleToLongBits(this.f);
        String str = this.g;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.c;
        int i2 = (int) doubleToLongBits;
        int i3 = ((hashCode2 * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        if (true != this.e) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((((((i3 ^ i2) * 1000003) ^ i) * 1000003) ^ ((int) doubleToLongBits2)) * 1000003) ^ hashCode;
    }

    public final String toString() {
        File file = this.b;
        return "TranscodeParameters{sourceUri=" + String.valueOf(this.a) + ", outputPath=" + String.valueOf(file) + ", sizeLimit=" + this.c + ", bitrateLimitFactor=" + this.d + ", enableHighBudgetVideoCompression=" + this.e + ", mmsVideoCompressionFudgeFactor=" + this.f + ", mimeType=" + this.g + "}";
    }

    public yhd(Uri uri, File file, long j, double d, boolean z, double d2, String str) {
        this.a = uri;
        this.b = file;
        this.c = j;
        this.d = d;
        this.e = z;
        this.f = d2;
        this.g = str;
    }
}
