package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vqh {
    public static final vqh a = a(-1, -1).a();
    public final int b;
    public final int c;
    public final tqu d;
    public final Uri e;
    public final int f;
    public final amxb g;
    public final Optional h;
    public final int i;

    public vqh() {
        throw null;
    }

    public static vqg a(int i, int i2) {
        vqg vqgVar = new vqg((byte[]) null);
        vqgVar.a = i;
        byte b = vqgVar.e;
        vqgVar.b = i2;
        vqgVar.e = (byte) (b | 3);
        vqgVar.d(tqu.UNKNOWN);
        vqgVar.b(-2);
        vqgVar.f = 1;
        return vqgVar;
    }

    public final vqh b(Uri uri) {
        vqg vqgVar = new vqg(this);
        vqgVar.c = uri;
        return vqgVar.a();
    }

    public final vqh c(tqu tquVar) {
        vqg vqgVar = new vqg(this);
        vqgVar.d(tquVar);
        return vqgVar.a();
    }

    public final boolean equals(Object obj) {
        Uri uri;
        amxb amxbVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof vqh) {
            vqh vqhVar = (vqh) obj;
            if (this.b == vqhVar.b && this.c == vqhVar.c && this.d.equals(vqhVar.d) && ((uri = this.e) != null ? uri.equals(vqhVar.e) : vqhVar.e == null) && this.f == vqhVar.f && ((amxbVar = this.g) != null ? amxbVar.equals(vqhVar.g) : vqhVar.g == null)) {
                int i = this.i;
                int i2 = vqhVar.i;
                if (i != 0) {
                    if (i2 == 1 && this.h.equals(vqhVar.h)) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
        Uri uri = this.e;
        int i = 0;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i2 = ((((hashCode2 * 1000003) ^ hashCode) * 1000003) ^ this.f) * 1000003;
        amxb amxbVar = this.g;
        if (amxbVar != null) {
            i = amxbVar.hashCode();
        }
        a.bm(this.i);
        return ((((i2 ^ i) * 1000003) ^ 1) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        String str;
        amxb amxbVar = this.g;
        Uri uri = this.e;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(uri);
        String valueOf3 = String.valueOf(amxbVar);
        if (this.i != 0) {
            str = akec.aI(1);
        } else {
            str = "null";
        }
        return "MessageStatusPlusUri{status=" + this.b + ", rawStatus=" + this.c + ", xmsTransportType=" + valueOf + ", uri=" + valueOf2 + ", resultCode=" + this.f + ", rcsDiagnostics=" + valueOf3 + ", mmsApi=" + str + ", retryStrategy=" + String.valueOf(this.h) + "}";
    }

    public vqh(int i, int i2, tqu tquVar, Uri uri, int i3, amxb amxbVar, int i4, Optional optional) {
        this.b = i;
        this.c = i2;
        this.d = tquVar;
        this.e = uri;
        this.f = i3;
        this.g = amxbVar;
        this.i = i4;
        this.h = optional;
    }
}
