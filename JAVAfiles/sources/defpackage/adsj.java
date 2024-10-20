package defpackage;

import com.google.android.ims.provisioning.config.ImsConfiguration;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adsj {
    private final Object a;
    private final Object b;

    public adsj(aduu aduuVar) {
        this.b = new ConcurrentHashMap();
        this.a = aduuVar;
    }

    public final long a() {
        if (aczx.y() && ((aduu) this.a).x()) {
            advr.k("Session ID counter has been reset.", new Object[0]);
            Collection.EL.stream(((ConcurrentHashMap) this.b).entrySet()).map(new adof(11)).forEach(new aavc(15));
        }
        long c = ((aduu) this.a).c();
        advr.c("session ID %d is generated.", Long.valueOf(c));
        return c;
    }

    public final void b(String str, adsi adsiVar) {
        ((ConcurrentHashMap) this.b).put(str, adsiVar);
    }

    public final void c(aioo aiooVar) {
        if (aiooVar != null) {
            if (aiooVar.j("Proxy-Authenticate") != null) {
                ((adtv) this.b).b = aiooVar.k("Proxy-Authenticate", "realm");
                ((adtv) this.b).e = aiooVar.k("Proxy-Authenticate", "qop");
                ((adtv) this.b).d = aiooVar.k("Proxy-Authenticate", "nonce");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("SIP response must not be null");
    }

    public final void d(aion aionVar) {
        Object obj = this.b;
        adtv adtvVar = (adtv) obj;
        if (adtvVar.b != null && adtvVar.d != null) {
            try {
                ((adtv) obj).c();
                Object obj2 = this.a;
                String b = ((adtv) this.b).b(((ImsConfiguration) obj2).mAuthDigestUsername, ((ImsConfiguration) obj2).mAuthDigestPassword, aionVar.z(), aionVar.A(), ((adtv) this.b).a(), aionVar.g());
                String str = ((ImsConfiguration) this.a).mAuthDigestUsername;
                String A = aionVar.A();
                Object obj3 = this.b;
                String str2 = ((adtv) obj3).b;
                String a = ((adtv) obj3).a();
                Object obj4 = this.b;
                String str3 = "Proxy-Authorization: Digest username=\"" + str + "\",uri=\"" + A + "\",algorithm=MD5,realm=\"" + str2 + "\",nc=" + a + ",nonce=\"" + ((adtv) obj4).c + "\",response=\"" + b + "\",cnonce=\"" + ((adtv) obj4).a + "\"";
                String str4 = ((adtv) this.b).e;
                if (str4 != null) {
                    str3 = a.co(str4, str3, ",qop=");
                }
                aionVar.r(str3);
            } catch (Exception e) {
                advr.i(e, "Can't create the proxy authorization header", new Object[0]);
                throw new IllegalArgumentException("Can't create the proxy authorization header");
            }
        }
    }

    public adsj(ImsConfiguration imsConfiguration) {
        this.b = new adtv();
        this.a = imsConfiguration;
    }
}
