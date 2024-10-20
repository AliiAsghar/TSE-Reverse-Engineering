package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aquu {
    public String a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;

    public aquu() {
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, aquv] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, aquv] */
    public final aqux a() {
        return new aqux((aquw) this.e, this.a, this.c, this.d, this.b);
    }

    public final void b() {
        this.b = true;
    }

    public final void c() {
        adtv adtvVar = (adtv) this.c;
        adtvVar.d = null;
        adtvVar.b = null;
        adtvVar.c = null;
    }

    public final void d(aioo aiooVar) {
        String str;
        String j = aiooVar.j("WWW-Authenticate");
        String j2 = aiooVar.j("Authentication-Info");
        if (j != null) {
            try {
                ((adtv) this.c).b = aiooVar.k("WWW-Authenticate", "realm");
                ((adtv) this.c).e = aiooVar.k("WWW-Authenticate", "qop");
                ((adtv) this.c).d = aiooVar.k("WWW-Authenticate", "nonce");
                return;
            } catch (Exception e) {
                advr.i(e, "Can't read the WWW-Authenticate header", new Object[0]);
                throw new adfj("Can't read the security header: ".concat(String.valueOf(e.getMessage())), e);
            }
        }
        if (j2 != null) {
            try {
                Object obj = this.c;
                advp advpVar = adwf.a;
                int indexOf = j2.indexOf("nextnonce=");
                if (indexOf != -1) {
                    int indexOf2 = j2.indexOf(",", indexOf);
                    if (indexOf2 == -1) {
                        indexOf2 = j2.length();
                    }
                    str = j2.substring(indexOf + 11, indexOf2 - 1);
                } else {
                    str = null;
                }
                ((adtv) obj).d = str;
                return;
            } catch (Exception e2) {
                advr.i(e2, "Can't read the authentication-info header", new Object[0]);
                throw new adfj("Can't read the security header".concat(String.valueOf(e2.getMessage())), e2);
            }
        }
        if (this.b) {
            c();
        }
    }

    public aquu(byte[] bArr, byte[] bArr2) {
        this.c = new adtv();
        this.b = true;
    }
}
