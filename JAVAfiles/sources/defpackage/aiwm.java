package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiwm {
    public final Uri a;
    public final apbt b;
    public final algw c;
    public final alog d;
    public final boolean e;
    public final ahmc f;

    public aiwm() {
        throw null;
    }

    public static aiwl a() {
        aiwl aiwlVar = new aiwl((byte[]) null);
        aiwlVar.g = aiwq.a;
        aiwlVar.b();
        aiwlVar.a = true;
        aiwlVar.b = (byte) (1 | aiwlVar.b);
        return aiwlVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiwm) {
            aiwm aiwmVar = (aiwm) obj;
            if (this.a.equals(aiwmVar.a) && this.b.equals(aiwmVar.b) && this.c.equals(aiwmVar.c) && alzz.at(this.d, aiwmVar.d) && this.f.equals(aiwmVar.f) && this.e == aiwmVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f.hashCode();
        if (true != this.e) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((hashCode * 1000003) ^ i) * 1000003) ^ 1237;
    }

    public final String toString() {
        ahmc ahmcVar = this.f;
        alog alogVar = this.d;
        algw algwVar = this.c;
        apbt apbtVar = this.b;
        return "ProtoDataStoreConfig{uri=" + String.valueOf(this.a) + ", schema=" + String.valueOf(apbtVar) + ", handler=" + String.valueOf(algwVar) + ", migrations=" + String.valueOf(alogVar) + ", variantConfig=" + String.valueOf(ahmcVar) + ", useGeneratedExtensionRegistry=" + this.e + ", enableTracing=false}";
    }

    public aiwm(Uri uri, apbt apbtVar, algw algwVar, alog alogVar, ahmc ahmcVar, boolean z) {
        this.a = uri;
        this.b = apbtVar;
        this.c = algwVar;
        this.d = alogVar;
        this.f = ahmcVar;
        this.e = z;
    }
}
