package defpackage;

import java.net.URL;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrv implements hne {
    public final hrw b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    private volatile byte[] g;
    private int h;

    public hrv(String str, hrw hrwVar) {
        this.c = null;
        hwr.g(str);
        this.d = str;
        hwr.i(hrwVar);
        this.b = hrwVar;
    }

    @Override // defpackage.hne
    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = b().getBytes(a);
        }
        messageDigest.update(this.g);
    }

    public final String b() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        hwr.i(url);
        return url.toString();
    }

    @Override // defpackage.hne
    public final boolean equals(Object obj) {
        if (obj instanceof hrv) {
            hrv hrvVar = (hrv) obj;
            if (b().equals(hrvVar.b()) && this.b.equals(hrvVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hne
    public final int hashCode() {
        int i = this.h;
        if (i == 0) {
            int hashCode = b().hashCode();
            this.h = hashCode;
            int hashCode2 = (hashCode * 31) + this.b.hashCode();
            this.h = hashCode2;
            return hashCode2;
        }
        return i;
    }

    public final String toString() {
        return b();
    }

    public hrv(URL url) {
        hrw hrwVar = hrw.a;
        hwr.i(url);
        this.c = url;
        this.d = null;
        hwr.i(hrwVar);
        this.b = hrwVar;
    }
}
