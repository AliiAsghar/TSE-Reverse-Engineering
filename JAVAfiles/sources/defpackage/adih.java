package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import j$.util.Optional;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adih {
    public final Object a;
    public final Object b;

    public adih(Context context, Object obj) {
        this.b = context;
        this.a = obj;
    }

    private final String o(adkg adkgVar) {
        int i;
        HashMap hashMap = new HashMap();
        hashMap.put("APP_NAME", "com.google.android.apps.messaging");
        if (!adkgVar.a.isEmpty()) {
            hashMap.put("IMSI", adkg.b(adkgVar.a, adkgVar.f));
        }
        if (!adkgVar.g.isEmpty()) {
            hashMap.put("IMEI", adkg.b(adkgVar.g, adkgVar.f));
        }
        if (!adkgVar.b.isEmpty()) {
            hashMap.put("MSISDN", adkg.b(adkgVar.b, adkgVar.f));
        }
        if (!adkgVar.c.isEmpty()) {
            hashMap.put("MSISDN_TOKEN", adkg.b(adkgVar.c, adkgVar.f));
        }
        if (!adkgVar.d.isEmpty()) {
            hashMap.put("GMSCORE_IID_TOKEN", adkg.b(adkgVar.d, adkgVar.f));
        }
        if (!adkgVar.e.isEmpty()) {
            hashMap.put("JIBE_ACS_COOKIE", adkg.b(adkgVar.e, adkgVar.f));
        }
        Object obj = this.a;
        hashMap.put("PROVISIONING_SESSION_ID", adkg.b((String) adkgVar.h.map(new adkk(1)).orElse("unknown"), adkgVar.f));
        String c = ((zfm) obj).c("rcs_provisioning", hashMap, new DroidGuardResultsRequest());
        Object obj2 = this.b;
        aozy createBuilder = apew.a.createBuilder();
        if (true != TextUtils.isEmpty(c)) {
            i = 3;
        } else {
            i = 4;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apew apewVar = (apew) createBuilder.b;
        apewVar.c = i - 1;
        apewVar.b |= 1;
        apew apewVar2 = (apew) createBuilder.s();
        Optional optional = adkgVar.h;
        adke adkeVar = (adke) obj2;
        aozy c2 = ((acns) obj2).c(adkeVar.c);
        if (c2 == null) {
            advr.h(adke.b, "Could not create DroidGuard token creation event", new Object[0]);
        } else {
            aozy createBuilder2 = apfv.a.createBuilder();
            String str = (String) optional.orElse("unknown");
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar = createBuilder2.b;
            apfv apfvVar = (apfv) apagVar;
            str.getClass();
            apfvVar.b = 1 | apfvVar.b;
            apfvVar.c = str;
            if (!apagVar.isMutable()) {
                createBuilder2.u();
            }
            apfv apfvVar2 = (apfv) createBuilder2.b;
            apewVar2.getClass();
            apfvVar2.h = apewVar2;
            apfvVar2.b |= 16384;
            apfv apfvVar3 = (apfv) createBuilder2.s();
            if (!c2.b.isMutable()) {
                c2.u();
            }
            amno amnoVar = (amno) c2.b;
            amno amnoVar2 = amno.a;
            apfvVar3.getClass();
            amnoVar.f = apfvVar3;
            amnoVar.e = 13;
            ((abnq) adkeVar.d.f((amno) c2.s()).get()).c();
        }
        return c;
    }

    public final InputStream a(String str) {
        try {
            return ((Context) this.b).openFileInput(str);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public final InputStream b(String str) {
        Object obj = this.b;
        InputStream openInputStream = ((Context) obj).getContentResolver().openInputStream(Uri.parse(str));
        openInputStream.getClass();
        return openInputStream;
    }

    public final OutputStream c(String str) {
        try {
            return ((Context) this.b).openFileOutput(str, 0);
        } catch (FileNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String d() {
        return String.valueOf(e()).concat("/rcs/files/");
    }

    public final String e() {
        return ((Context) this.b).getFilesDir().getPath();
    }

    public final void f(String str, String str2, int i) {
        aozy createBuilder = apha.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apha aphaVar = (apha) apagVar;
        str.getClass();
        aphaVar.b |= 2;
        aphaVar.d = str;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apha aphaVar2 = (apha) createBuilder.b;
        str2.getClass();
        aphaVar2.b |= 1;
        aphaVar2.c = str2;
        aozy createBuilder2 = apgx.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        apgx apgxVar = (apgx) apagVar2;
        apgxVar.b |= 1;
        apgxVar.c = i;
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        apgx apgxVar2 = (apgx) createBuilder2.b;
        apgxVar2.d = 3;
        apgxVar2.b |= 2;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apha aphaVar3 = (apha) createBuilder.b;
        apgx apgxVar3 = (apgx) createBuilder2.s();
        apgxVar3.getClass();
        aphaVar3.i = apgxVar3;
        aphaVar3.b |= 64;
        g((apha) createBuilder.s());
    }

    public final void g(apha aphaVar) {
        aozy createBuilder = apgv.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apgv apgvVar = (apgv) apagVar;
        apgvVar.f = 4;
        apgvVar.b |= 2;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apgv apgvVar2 = (apgv) apagVar2;
        apgvVar2.g = 2;
        apgvVar2.b = 4 | apgvVar2.b;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        Object obj = this.b;
        Object obj2 = this.a;
        apgv apgvVar3 = (apgv) createBuilder.b;
        aphaVar.getClass();
        apgvVar3.d = aphaVar;
        apgvVar3.c = 6;
        ((acoc) obj2).h((Context) obj, (apgv) createBuilder.s());
    }

    public final void h(adkg adkgVar, admw admwVar) {
        boolean z;
        int X = a.X(((apig) admwVar.i().b).c);
        if (X != 0 && X == 3) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        String o = o(adkgVar);
        aozy createBuilder = anhw.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        anhw anhwVar = (anhw) apagVar;
        anhwVar.b |= 1;
        anhwVar.c = 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        anhw anhwVar2 = (anhw) apagVar2;
        o.getClass();
        anhwVar2.b |= 2;
        anhwVar2.d = o;
        String str = adkgVar.f;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        anhw anhwVar3 = (anhw) createBuilder.b;
        str.getClass();
        anhwVar3.b |= 4;
        anhwVar3.e = str;
        if (!adkgVar.e.isEmpty()) {
            String str2 = adkgVar.e;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            anhw anhwVar4 = (anhw) createBuilder.b;
            str2.getClass();
            anhwVar4.b |= 128;
            anhwVar4.j = str2;
        }
        if (!adkgVar.d.isEmpty()) {
            String str3 = adkgVar.d;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            anhw anhwVar5 = (anhw) createBuilder.b;
            str3.getClass();
            anhwVar5.b |= 256;
            anhwVar5.k = str3;
        }
        if (!adkgVar.a.isEmpty()) {
            String str4 = adkgVar.a;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            anhw anhwVar6 = (anhw) createBuilder.b;
            str4.getClass();
            anhwVar6.b |= 8;
            anhwVar6.f = str4;
        }
        if (!adkgVar.g.isEmpty()) {
            String str5 = adkgVar.g;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            anhw anhwVar7 = (anhw) createBuilder.b;
            str5.getClass();
            anhwVar7.b |= 16;
            anhwVar7.g = str5;
        }
        if (!adkgVar.b.isEmpty()) {
            String str6 = adkgVar.b;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            anhw anhwVar8 = (anhw) createBuilder.b;
            str6.getClass();
            anhwVar8.b |= 32;
            anhwVar8.h = str6;
        }
        if (!adkgVar.c.isEmpty()) {
            String str7 = adkgVar.c;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            anhw anhwVar9 = (anhw) createBuilder.b;
            str7.getClass();
            anhwVar9.b |= 64;
            anhwVar9.i = str7;
        }
        if (adkgVar.h.isPresent()) {
            String str8 = (String) adkgVar.h.get();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            anhw anhwVar10 = (anhw) createBuilder.b;
            anhwVar10.b |= 512;
            anhwVar10.l = str8;
        }
        admwVar.b = Optional.of((anhw) createBuilder.s());
    }

    public final void i(adkg adkgVar, admw admwVar) {
        admwVar.b("Droid-Guard", o(adkgVar));
        admwVar.b("Droid-Guard-Salt", adkgVar.f);
    }

    public final wfo j() {
        Optional k = ((adnk) this.b).k();
        if (k.isPresent()) {
            wfo b = wfo.b(((whm) k.get()).c);
            if (b == null) {
                return wfo.UNRECOGNIZED;
            }
            return b;
        }
        return wfo.GOOGLE_TOS_CONSENT_STATE_UNSPECIFIED;
    }

    public final void k() {
        advr.c("cleanUpGoogleTosConsentCache", new Object[0]);
        ((adnk) this.b).v(whm.a);
        ((adnk) this.b).p(null);
        ((adnk) this.b).q((Context) this.a, false);
    }

    public final void l(whm whmVar) {
        advr.c("setGoogleTosConfiguration", new Object[0]);
        ((adnk) this.b).v(whmVar);
    }

    public final boolean m() {
        return j().equals(wfo.GOOGLE_TOS_CONSENTED);
    }

    public final boolean n() {
        Optional k = ((adnk) this.b).k();
        if (k.isPresent() && (((whm) k.get()).b & 2) != 0) {
            return true;
        }
        return false;
    }

    public adih(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
