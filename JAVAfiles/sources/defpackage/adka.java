package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.asterism.GetAsterismConsentRequest;
import com.google.android.gms.asterism.SetAsterismConsentRequest;
import com.google.android.gms.asterism.SetAsterismConsentResponse;
import com.google.android.gms.common.Feature;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adka implements adkc {
    public final Context b;
    public final adnk c;
    public final anen d;
    public final armf e;
    public final acnz f;
    public final adkd g;
    public final adih h;
    private final String k;
    private final armf l;
    private final anen m;
    private final vau n;
    private final armf o;
    private final armf p;
    private final acwl q;
    private final vjs r;
    public final advp a = new advp("AsterismGoogleTosConsentApi");
    private final AtomicInteger j = new AtomicInteger();

    public adka(Context context, armf armfVar, adnk adnkVar, acnz acnzVar, adtl adtlVar, adih adihVar, adkd adkdVar, anen anenVar, vau vauVar, vjs vjsVar, anen anenVar2, armf armfVar2, armf armfVar3, armf armfVar4, acwl acwlVar) {
        this.b = context;
        this.c = adnkVar;
        this.f = acnzVar;
        this.k = adtlVar.f();
        this.l = armfVar;
        this.h = adihVar;
        this.g = adkdVar;
        this.m = anenVar;
        this.n = vauVar;
        this.r = vjsVar;
        this.d = anenVar2;
        this.e = armfVar2;
        this.o = armfVar3;
        this.p = armfVar4;
        this.q = acwlVar;
    }

    private final ListenableFuture j(final whm whmVar, final apkl apklVar, int i) {
        SetAsterismConsentRequest a;
        Bundle bundle = new Bundle();
        bundle.putString("is_mo_allowed", "false");
        abkn abknVar = new abkn();
        abknVar.a = this.j.incrementAndGet();
        abknVar.b();
        abknVar.c();
        abknVar.c = 2;
        abknVar.d = bundle;
        if (i != 2 && i != 3) {
            abknVar.d();
            abknVar.b = Long.valueOf(Instant.now().toEpochMilli());
            Context context = this.b;
            abknVar.e = adww.e(context, adww.a(context), 1);
            abknVar.f = whmVar.d;
            abknVar.g = whmVar.e;
            a = abknVar.a();
        } else {
            abknVar.h = i;
            a = abknVar.a();
        }
        final String l = l();
        final int i2 = 0;
        final SetAsterismConsentRequest setAsterismConsentRequest = a;
        ListenableFuture f = ancj.f(agkx.f(((abkm) this.l.b()).a(a)), akto.a(new algk(this) { // from class: adjz
            public final /* synthetic */ adka a;

            {
                this.a = this;
            }

            @Override // defpackage.algk
            public final Object apply(Object obj) {
                if (i2 != 0) {
                    Throwable th = (Throwable) obj;
                    if (th != null) {
                        whm whmVar2 = whmVar;
                        SetAsterismConsentRequest setAsterismConsentRequest2 = setAsterismConsentRequest;
                        String str = l;
                        adka adkaVar = this.a;
                        Integer valueOf = Integer.valueOf(setAsterismConsentRequest2.a);
                        wfo b = wfo.b(whmVar2.c);
                        if (b == null) {
                            b = wfo.UNRECOGNIZED;
                        }
                        advp advpVar = adkaVar.a;
                        apkl apklVar2 = apklVar;
                        advr.t(th, advpVar, "setAsterismConsent failure: sessionId=%s requestCode=%s consent=%s googleToSConsentSource=%s", str, valueOf, b.toString(), apklVar2);
                        acnz acnzVar = adkaVar.f;
                        Context context2 = adkaVar.b;
                        int i3 = setAsterismConsentRequest2.a;
                        wfo b2 = wfo.b(whmVar2.c);
                        if (b2 == null) {
                            b2 = wfo.UNRECOGNIZED;
                        }
                        wfo wfoVar = b2;
                        whk b3 = whk.b(whmVar2.h);
                        if (b3 == null) {
                            b3 = whk.UNRECOGNIZED;
                        }
                        acnzVar.s(context2, str, i3, wfoVar, b3, apklVar2, false, false, false, th, true);
                        ((vyv) adkaVar.e.b()).e(5);
                    }
                    return th;
                }
                SetAsterismConsentResponse setAsterismConsentResponse = (SetAsterismConsentResponse) obj;
                String str2 = l;
                SetAsterismConsentRequest setAsterismConsentRequest3 = setAsterismConsentRequest;
                Integer valueOf2 = Integer.valueOf(setAsterismConsentRequest3.a);
                whm whmVar3 = whmVar;
                wfo b4 = wfo.b(whmVar3.c);
                if (b4 == null) {
                    b4 = wfo.UNRECOGNIZED;
                }
                String wfoVar2 = b4.toString();
                whk b5 = whk.b(whmVar3.h);
                if (b5 == null) {
                    b5 = whk.UNRECOGNIZED;
                }
                adka adkaVar2 = this.a;
                apkl apklVar3 = apklVar;
                advr.l(adkaVar2.a, "setAsterismConsent for Revoke Consent succeeded: sessionId=%s requestCode=%s tosConsent=%s rcsDefaultOnConsent=%s googleToSConsentSource=%s responseHasGmscoreIidToken=%s", str2, valueOf2, wfoVar2, b5.toString(), apklVar3, Boolean.valueOf(!setAsterismConsentResponse.b.isEmpty()));
                int i4 = setAsterismConsentRequest3.a;
                wfo b6 = wfo.b(whmVar3.c);
                if (b6 == null) {
                    b6 = wfo.UNRECOGNIZED;
                }
                wfo wfoVar3 = b6;
                whk b7 = whk.b(whmVar3.h);
                if (b7 == null) {
                    b7 = whk.UNRECOGNIZED;
                }
                adkaVar2.f.s(adkaVar2.b, str2, i4, wfoVar3, b7, apklVar3, false, !setAsterismConsentResponse.b.isEmpty(), true, null, true);
                return setAsterismConsentResponse.b;
            }
        }), this.d);
        final int i3 = 1;
        return aktp.B(f, new algk(this) { // from class: adjz
            public final /* synthetic */ adka a;

            {
                this.a = this;
            }

            @Override // defpackage.algk
            public final Object apply(Object obj) {
                if (i3 != 0) {
                    Throwable th = (Throwable) obj;
                    if (th != null) {
                        whm whmVar2 = whmVar;
                        SetAsterismConsentRequest setAsterismConsentRequest2 = setAsterismConsentRequest;
                        String str = l;
                        adka adkaVar = this.a;
                        Integer valueOf = Integer.valueOf(setAsterismConsentRequest2.a);
                        wfo b = wfo.b(whmVar2.c);
                        if (b == null) {
                            b = wfo.UNRECOGNIZED;
                        }
                        advp advpVar = adkaVar.a;
                        apkl apklVar2 = apklVar;
                        advr.t(th, advpVar, "setAsterismConsent failure: sessionId=%s requestCode=%s consent=%s googleToSConsentSource=%s", str, valueOf, b.toString(), apklVar2);
                        acnz acnzVar = adkaVar.f;
                        Context context2 = adkaVar.b;
                        int i32 = setAsterismConsentRequest2.a;
                        wfo b2 = wfo.b(whmVar2.c);
                        if (b2 == null) {
                            b2 = wfo.UNRECOGNIZED;
                        }
                        wfo wfoVar = b2;
                        whk b3 = whk.b(whmVar2.h);
                        if (b3 == null) {
                            b3 = whk.UNRECOGNIZED;
                        }
                        acnzVar.s(context2, str, i32, wfoVar, b3, apklVar2, false, false, false, th, true);
                        ((vyv) adkaVar.e.b()).e(5);
                    }
                    return th;
                }
                SetAsterismConsentResponse setAsterismConsentResponse = (SetAsterismConsentResponse) obj;
                String str2 = l;
                SetAsterismConsentRequest setAsterismConsentRequest3 = setAsterismConsentRequest;
                Integer valueOf2 = Integer.valueOf(setAsterismConsentRequest3.a);
                whm whmVar3 = whmVar;
                wfo b4 = wfo.b(whmVar3.c);
                if (b4 == null) {
                    b4 = wfo.UNRECOGNIZED;
                }
                String wfoVar2 = b4.toString();
                whk b5 = whk.b(whmVar3.h);
                if (b5 == null) {
                    b5 = whk.UNRECOGNIZED;
                }
                adka adkaVar2 = this.a;
                apkl apklVar3 = apklVar;
                advr.l(adkaVar2.a, "setAsterismConsent for Revoke Consent succeeded: sessionId=%s requestCode=%s tosConsent=%s rcsDefaultOnConsent=%s googleToSConsentSource=%s responseHasGmscoreIidToken=%s", str2, valueOf2, wfoVar2, b5.toString(), apklVar3, Boolean.valueOf(!setAsterismConsentResponse.b.isEmpty()));
                int i4 = setAsterismConsentRequest3.a;
                wfo b6 = wfo.b(whmVar3.c);
                if (b6 == null) {
                    b6 = wfo.UNRECOGNIZED;
                }
                wfo wfoVar3 = b6;
                whk b7 = whk.b(whmVar3.h);
                if (b7 == null) {
                    b7 = whk.UNRECOGNIZED;
                }
                adkaVar2.f.s(adkaVar2.b, str2, i4, wfoVar3, b7, apklVar3, false, !setAsterismConsentResponse.b.isEmpty(), true, null, true);
                return setAsterismConsentResponse.b;
            }
        }, this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0051, code lost:
    
        if (r1.equals(defpackage.wfo.GOOGLE_TOS_CONSENTED) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006c, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x006a, code lost:
    
        if (r1.equals(defpackage.wfo.GOOGLE_TOS_CONSENTED) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.common.util.concurrent.ListenableFuture k(final defpackage.whm r14, final defpackage.apkl r15) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adka.k(whm, apkl):com.google.common.util.concurrent.ListenableFuture");
    }

    private final String l() {
        if (((acxv) this.o.b()).a()) {
            return ((aday) this.p.b()).o(this.k);
        }
        Context context = this.b;
        String str = this.k;
        adnu.a();
        return adnu.r(context, str);
    }

    private final boolean m() {
        if (aczv.x() && aczv.X()) {
            return this.r.B(this.k);
        }
        return aczv.D();
    }

    private final boolean n(whm whmVar) {
        if (m()) {
            whk b = whk.b(whmVar.h);
            if (b == null) {
                b = whk.UNRECOGNIZED;
            }
            if (b.equals(whk.LEGAL_FYI_SEEN)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final akul a(boolean z) {
        return aktp.ah(new hwm(this, z, 10, null), this.d);
    }

    @Override // defpackage.adkc
    public final ListenableFuture b() {
        GetAsterismConsentRequest getAsterismConsentRequest = new GetAsterismConsentRequest(this.j.incrementAndGet(), 2);
        String l = l();
        abkm abkmVar = (abkm) this.l.b();
        ajxp ajxpVar = new ajxp(null);
        ajxpVar.c = new abkk(getAsterismConsentRequest, 1);
        ajxpVar.d = new Feature[]{abvu.a};
        ajxpVar.b = 11301;
        byte[] bArr = null;
        return aktp.B(ancj.f(agkx.f(abkmVar.g(ajxpVar.b())), akto.a(new yxu(this, l, getAsterismConsentRequest, 3, bArr)), andi.a), new yxu(this, l, getAsterismConsentRequest, 4, bArr), andi.a);
    }

    @Override // defpackage.adkc
    public final ListenableFuture c(apkl apklVar, boolean z) {
        if (aczv.J() && z) {
            return aktp.aj(new xpx(this, apklVar, 8), this.d);
        }
        Optional k = this.c.k();
        if (!k.isEmpty()) {
            wfo wfoVar = wfo.GOOGLE_TOS_DECLINED;
            wfo b = wfo.b(((whm) k.get()).c);
            if (b == null) {
                b = wfo.UNRECOGNIZED;
            }
            if (wfoVar.equals(b)) {
                return ancj.f(anee.o(k((whm) k.get(), apklVar)), new adhe(this, 6), this.m);
            }
        }
        advr.k("Google ToS config is not available from Bugle storage or not declined.", new Object[0]);
        return aneh.a;
    }

    public final ListenableFuture d(apkl apklVar, whm whmVar) {
        Optional of;
        int ordinal = this.g.a().ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                of = Optional.empty();
            } else {
                of = Optional.of(3);
            }
        } else {
            of = Optional.of(2);
        }
        if (of.isEmpty()) {
            advr.l(this.a, "RcsDefaultOnConsentState is not LEGAL_FYI_SEEN or OOB_CONSENT", new Object[0]);
            return aneh.a;
        }
        return ancj.f(anee.o(j(whmVar, apklVar, ((Integer) of.get()).intValue())), new adhe(this, 5), this.d);
    }

    public final ListenableFuture e(apkl apklVar, whm whmVar) {
        return ancj.f(anee.o(j(whmVar, apklVar, 1)), new adhe(this, 4), this.d);
    }

    @Override // defpackage.adkc
    public final ListenableFuture f(apkl apklVar) {
        Object obj;
        if (h(apklVar)) {
            whm e = this.c.e();
            obj = e;
            if (!g()) {
                whk b = whk.b(e.h);
                if (b == null) {
                    b = whk.UNRECOGNIZED;
                }
                obj = e;
                if (b.equals(whk.RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED)) {
                    return albo.bH(new IllegalStateException("RCS Default On config is not available from Bugle storage."));
                }
            }
        } else {
            Optional k = this.c.k();
            if (!k.isEmpty()) {
                wfo b2 = wfo.b(((whm) k.get()).c);
                if (b2 == null) {
                    b2 = wfo.UNRECOGNIZED;
                }
                if (!b2.equals(wfo.GOOGLE_TOS_CONSENT_STATE_UNSPECIFIED)) {
                    obj = k.get();
                }
            }
            return albo.bH(new IllegalStateException("Google ToS config is not available from Bugle storage."));
        }
        return ancj.g(anee.o(k((whm) obj, apklVar)), new yui(this, apklVar, 16), this.d);
    }

    public final boolean g() {
        if (aczv.x() && aczv.X()) {
            return this.r.C(this.k);
        }
        return aczv.G();
    }

    public final boolean h(apkl apklVar) {
        if (m() && apklVar.equals(apkl.LEGAL_FYI_SEEN)) {
            return true;
        }
        if (g() && apklVar.equals(apkl.RCS_DEFAULT_ON_OOB_CONSENT)) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if (g() && this.g.a().equals(whk.RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED)) {
            return true;
        }
        return false;
    }
}
