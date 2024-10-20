package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.constellation.PhoneNumberInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ytw {
    public static final xze a = xze.g("Bugle", "VerifiedSmsRegistrationHelper");
    public final yul b;
    public final yuu c;
    public final yby d;
    public final ytk e;
    public final yjy f;
    public final ytm g;
    public final armf h;
    public final Context i;
    public final anen j;
    public final mbl k;
    public final xnv l;
    public final armf m;
    public volatile akul n = aktp.ag(false);
    public final vjs o;
    private final anen p;

    public ytw(yul yulVar, yby ybyVar, ytk ytkVar, yjy yjyVar, vjs vjsVar, yuu yuuVar, ytm ytmVar, armf armfVar, xnv xnvVar, Context context, anen anenVar, anen anenVar2, mbl mblVar, armf armfVar2) {
        this.b = yulVar;
        this.d = ybyVar;
        this.e = ytkVar;
        this.f = yjyVar;
        this.o = vjsVar;
        this.c = yuuVar;
        this.g = ytmVar;
        this.h = armfVar;
        this.l = xnvVar;
        this.i = context;
        this.j = anenVar;
        this.p = anenVar2;
        this.k = mblVar;
        this.m = armfVar2;
    }

    public static String d(PhoneNumberInfo phoneNumberInfo) {
        return phoneNumberInfo.d.getString("id_token");
    }

    public final akul a(String str, yub yubVar, String str2) {
        if (yubVar.d.G() && yubVar.e.isEmpty()) {
            a.o("No Vsms RCS or C11N token stored after all");
            return aktp.ag(false);
        }
        xyo c = a.c();
        c.H("Generating KeyPair for vsms registration");
        c.w("msisdn", str, 2);
        c.q();
        return aktp.ai(new vcr(17), this.c.d).i(new vug(this, yubVar, str, str2, 16), this.j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final akul b(yuf yufVar, String str, String str2) {
        String str3;
        str.getClass();
        apbo apboVar = yufVar.d;
        if (apboVar.containsKey(str)) {
            str3 = (String) apboVar.get(str);
        } else {
            str3 = "";
        }
        boolean equals = TextUtils.equals(str3, str2);
        yub yubVar = yub.a;
        apbo apboVar2 = yufVar.e;
        if (apboVar2.containsKey(str2)) {
            yubVar = (yub) apboVar2.get(str2);
        }
        xze xzeVar = a;
        xzeVar.o("Checking if vsms key registration is necessary");
        int i = 0;
        if (equals && !yubVar.b.isEmpty()) {
            xzeVar.o("Not registering, keys already present");
            return aktp.ag(false);
        }
        if (!yubVar.b.isEmpty() && !equals) {
            xzeVar.o("Associating new imsi with existing keys for same msisdn");
            return this.b.b(str, str2).h(new yts(i), this.j);
        }
        return a(str2, yubVar, str);
    }

    public final akul c(String str, String str2, String str3) {
        if (!this.e.e()) {
            a.o("Verified SMS is disabled or not supported, not storing RCS token.");
            return aktp.ag(null);
        }
        if (!this.n.isDone()) {
            a.o("Received a registration request for RCS but something else is already running.");
            return this.n;
        }
        try {
            akul i = aktp.ai(new ytr(this, 0), this.p).i(new vug(this, str, str2, (Object) aozb.w(Base64.decode(str3, 8)), 14), this.j).i(new xfn(this, 18), this.j).i(new xrd(this, str, str2, 6, (short[]) null), this.j);
            this.n = i;
            return i;
        } catch (IllegalArgumentException e) {
            a.r("Cannot decode RCS token.", e);
            return aktp.af(e);
        }
    }

    public final akul e(anmf anmfVar, int i, Throwable th) {
        if (!((Boolean) ytk.d.e()).booleanValue()) {
            return aktp.ag(null);
        }
        return this.b.g().i(new tuy(this, anmfVar, i, th, 5), this.j);
    }
}
