package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahiq {
    public final Uri a;
    public final String b;
    public final ahio c;
    public final alog d;
    private final int e;
    private final algw f;
    private final aoyo g;

    public ahiq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahiq) {
            ahiq ahiqVar = (ahiq) obj;
            if (this.a.equals(ahiqVar.a) && this.b.equals(ahiqVar.b) && this.c.equals(ahiqVar.c) && this.e == ahiqVar.e && alzz.at(this.d, ahiqVar.d) && this.f.equals(ahiqVar.f) && this.g.equals(ahiqVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        aoyo aoyoVar = this.g;
        algw algwVar = this.f;
        alog alogVar = this.d;
        ahio ahioVar = this.c;
        return "DownloadRequest{fileUri=" + String.valueOf(this.a) + ", urlToDownload=" + this.b + ", downloadConstraints=" + String.valueOf(ahioVar) + ", trafficTag=" + this.e + ", extraHttpHeaders=" + String.valueOf(alogVar) + ", inlineDownloadParamsOptional=" + String.valueOf(algwVar) + ", customDownloaderMetadata=" + String.valueOf(aoyoVar) + "}";
    }

    public ahiq(Uri uri, String str, ahio ahioVar, int i, alog alogVar, algw algwVar, aoyo aoyoVar) {
        this.a = uri;
        this.b = str;
        this.c = ahioVar;
        this.e = i;
        this.d = alogVar;
        this.f = algwVar;
        this.g = aoyoVar;
    }
}
