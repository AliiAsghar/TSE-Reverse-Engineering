package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahja {
    public final Uri a;
    public final String b;
    public final ahio c;
    public final algw d;
    public final int e;
    public final alog f;
    public final aoyo g;
    private final int h;
    private final String i;
    private final algw j;
    private final algw k;
    private final boolean l;

    public ahja() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahja) {
            ahja ahjaVar = (ahja) obj;
            if (this.a.equals(ahjaVar.a) && this.b.equals(ahjaVar.b) && this.c.equals(ahjaVar.c) && this.d.equals(ahjaVar.d) && this.e == ahjaVar.e && alzz.at(this.f, ahjaVar.f) && this.h == ahjaVar.h && this.i.equals(ahjaVar.i) && this.j.equals(ahjaVar.j) && this.k.equals(ahjaVar.k) && this.l == ahjaVar.l && this.g.equals(ahjaVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode();
        if (true != this.l) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((((((hashCode * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ i) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        aoyo aoyoVar = this.g;
        algw algwVar = this.k;
        algw algwVar2 = this.j;
        alog alogVar = this.f;
        algw algwVar3 = this.d;
        ahio ahioVar = this.c;
        return "DownloadRequest{destinationFileUri=" + String.valueOf(this.a) + ", urlToDownload=" + this.b + ", downloadConstraints=" + String.valueOf(ahioVar) + ", listenerOptional=" + String.valueOf(algwVar3) + ", trafficTag=" + this.e + ", extraHttpHeaders=" + String.valueOf(alogVar) + ", fileSizeBytes=" + this.h + ", notificationContentTitle=" + this.i + ", notificationContentTextOptional=" + String.valueOf(algwVar2) + ", notificationContentIntentOptional=" + String.valueOf(algwVar) + ", showDownloadedNotification=" + this.l + ", customDownloaderMetadata=" + String.valueOf(aoyoVar) + "}";
    }

    public ahja(Uri uri, String str, ahio ahioVar, algw algwVar, int i, alog alogVar, int i2, String str2, algw algwVar2, algw algwVar3, boolean z, aoyo aoyoVar) {
        this.a = uri;
        this.b = str;
        this.c = ahioVar;
        this.d = algwVar;
        this.e = i;
        this.f = alogVar;
        this.h = i2;
        this.i = str2;
        this.j = algwVar2;
        this.k = algwVar3;
        this.l = z;
        this.g = aoyoVar;
    }
}
