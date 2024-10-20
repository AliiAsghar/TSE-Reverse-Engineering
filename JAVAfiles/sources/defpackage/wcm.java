package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wcm {
    public static volatile aqvw a;
    private static volatile aqux b;
    private static volatile aqux c;
    private static volatile aqux d;
    private static volatile aqux e;
    private static volatile aqux f;
    private static volatile aqux g;
    private static volatile aqux h;
    private static volatile aqux i;

    public static final void A(String str, aozy aozyVar) {
        str.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wwz wwzVar = (wwz) aozyVar.b;
        wwz wwzVar2 = wwz.a;
        wwzVar.b |= 2;
        wwzVar.d = str;
    }

    public static akul B() {
        return aktp.ag(null);
    }

    public static /* synthetic */ apbt C(arqr arqrVar, Object obj) {
        arqrVar.getClass();
        return (apbt) arqrVar.a(obj);
    }

    public static final Boolean D() {
        return (Boolean) ((utz) wti.b.get()).e();
    }

    public static final /* synthetic */ wsa E(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (wsa) s;
    }

    public static final void F(wrz wrzVar, aozy aozyVar) {
        wrzVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wsa wsaVar = (wsa) aozyVar.b;
        wsa wsaVar2 = wsa.a;
        wsaVar.c = wrzVar.a();
        wsaVar.b |= 1;
    }

    public static apwl G(String str) {
        if (!TextUtils.isEmpty(str)) {
            int length = str.length();
            do {
                length--;
                if (length < 0) {
                    break;
                }
            } while (L(str.charAt(length)));
            str = str.substring(length + 1);
        }
        return (apwl) apag.parseFrom(apwl.a, Base64.decode(str, 0), aozs.a());
    }

    public static final byte[] H(apwl apwlVar, String str) {
        byte[] encode = Base64.encode(apwlVar.toByteArray(), 0);
        if (!TextUtils.isEmpty(str)) {
            if (L(str.charAt(str.length() - 1))) {
                str = String.valueOf(str).concat(" ");
            }
            return albo.cE(str.getBytes(), encode);
        }
        return encode;
    }

    @Deprecated
    public static final void I(MessageCoreData messageCoreData, String str) {
        if (!adah.b(str) && !adah.f(str)) {
            return;
        }
        messageCoreData.bn();
    }

    public static String J(int i2) {
        switch (i2) {
            case 0:
            case 1:
                return "invited";
            case 2:
                return "left";
            case 3:
                return "different config";
            case 4:
                return "recovered from telephony";
            case 5:
                return "rcs group creation failed";
            case 6:
                return "forked";
            case 7:
                return "setting up for Vanilla RCS";
            case 8:
                return "setting up RCS group conversation";
            case 9:
                return "satellite ended";
            default:
                throw new IllegalArgumentException(a.cb(i2, "invalid join state (", ")"));
        }
    }

    public static agmh[] K() {
        return sni.c.ax;
    }

    private static boolean L(char c2) {
        if (c2 < 'a' || c2 > 'z') {
            if (c2 < 'A' || c2 > 'Z') {
                if ((c2 < '0' || c2 > '9') && c2 != '+' && c2 != '/' && c2 != '=' && c2 != '\n' && c2 != '\r') {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static aqux a() {
        aqux aquxVar = f;
        if (aquxVar == null) {
            synchronized (wcm.class) {
                aquxVar = f;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("bugle.smapi.rcs.MessagingEngineService", "AddUserToGroup");
                    a2.b();
                    wbg wbgVar = wbg.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(wbgVar);
                    a2.d = new arkw(wbh.a);
                    aquxVar = a2.a();
                    f = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static aqux b() {
        aqux aquxVar = e;
        if (aquxVar == null) {
            synchronized (wcm.class) {
                aquxVar = e;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("bugle.smapi.rcs.MessagingEngineService", "CreateGroup");
                    a2.b();
                    wbn wbnVar = wbn.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(wbnVar);
                    a2.d = new arkw(wbo.a);
                    aquxVar = a2.a();
                    e = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static aqux c() {
        aqux aquxVar = g;
        if (aquxVar == null) {
            synchronized (wcm.class) {
                aquxVar = g;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("bugle.smapi.rcs.MessagingEngineService", "RemoveUserFromGroup");
                    a2.b();
                    wdd wddVar = wdd.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(wddVar);
                    a2.d = new arkw(wde.a);
                    aquxVar = a2.a();
                    g = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static aqux d() {
        aqux aquxVar = d;
        if (aquxVar == null) {
            synchronized (wcm.class) {
                aquxVar = d;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("bugle.smapi.rcs.MessagingEngineService", "RevokeMessage");
                    a2.b();
                    wdj wdjVar = wdj.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(wdjVar);
                    a2.d = new arkw(wdk.a);
                    aquxVar = a2.a();
                    d = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static aqux e() {
        aqux aquxVar = c;
        if (aquxVar == null) {
            synchronized (wcm.class) {
                aquxVar = c;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("bugle.smapi.rcs.MessagingEngineService", "SendFile");
                    a2.b();
                    wdn wdnVar = wdn.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(wdnVar);
                    a2.d = new arkw(wdo.a);
                    aquxVar = a2.a();
                    c = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static aqux f() {
        aqux aquxVar = b;
        if (aquxVar == null) {
            synchronized (wcm.class) {
                aquxVar = b;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("bugle.smapi.rcs.MessagingEngineService", "SendMessage");
                    a2.b();
                    wdr wdrVar = wdr.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(wdrVar);
                    a2.d = new arkw(wds.a);
                    aquxVar = a2.a();
                    b = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static aqux g() {
        aqux aquxVar = i;
        if (aquxVar == null) {
            synchronized (wcm.class) {
                aquxVar = i;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("bugle.smapi.rcs.MessagingEngineService", "TriggerGroupNotification");
                    a2.b();
                    wdx wdxVar = wdx.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(wdxVar);
                    a2.d = new arkw(wdy.a);
                    aquxVar = a2.a();
                    i = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static aqux h() {
        aqux aquxVar = h;
        if (aquxVar == null) {
            synchronized (wcm.class) {
                aquxVar = h;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("bugle.smapi.rcs.MessagingEngineService", "UpdateGroup");
                    a2.b();
                    web webVar = web.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(webVar);
                    a2.d = new arkw(wec.a);
                    aquxVar = a2.a();
                    h = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static final String i(adiv adivVar) {
        adivVar.getClass();
        String c2 = advq.SIM_ID.c(adom.n(adivVar).a);
        c2.getClass();
        return c2;
    }

    public static final wrj j(String str) {
        try {
            byte[] decode = Base64.decode(str, 3);
            try {
                wrj wrjVar = (wrj) apag.parseFrom(wrj.a, decode, aozs.a());
                wrjVar.getClass();
                return wrjVar;
            } catch (apba e2) {
                throw new woz("Malformed raw proto", e2);
            }
        } catch (IllegalArgumentException e3) {
            throw new woz("Not a Base64 encoded string", e3);
        }
    }

    public static final /* synthetic */ wrl k(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (wrl) s;
    }

    public static final void l(wsa wsaVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wrl wrlVar = (wrl) aozyVar.b;
        wrl wrlVar2 = wrl.a;
        wrlVar.c = wsaVar;
        wrlVar.b |= 1;
    }

    public static final /* synthetic */ wre m(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (wre) s;
    }

    public static final void n(wrv wrvVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wre wreVar = (wre) aozyVar.b;
        wre wreVar2 = wre.a;
        wreVar.e = wrvVar;
        wreVar.b |= 4;
    }

    public static final void o(String str, aozy aozyVar) {
        str.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wre wreVar = (wre) aozyVar.b;
        wre wreVar2 = wre.a;
        wreVar.b |= 1;
        wreVar.c = str;
    }

    public static final /* synthetic */ wrd p(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (wrd) s;
    }

    public static final void q(String str, aozy aozyVar) {
        str.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wrd wrdVar = (wrd) aozyVar.b;
        wrd wrdVar2 = wrd.a;
        wrdVar.b |= 1;
        wrdVar.c = str;
    }

    public static final wrt r(int i2) {
        int i3 = i2 - 2;
        if (i3 != 1) {
            if (i3 != 2) {
                return wrt.OUTCOME_UNSPECIFIED;
            }
            return wrt.OUTCOME_FAILURE;
        }
        return wrt.OUTCOME_SUCCESS;
    }

    public static final /* synthetic */ wxa s(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (wxa) s;
    }

    public static final void t(wwz wwzVar, aozy aozyVar) {
        wwzVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wxa wxaVar = (wxa) aozyVar.b;
        wxa wxaVar2 = wxa.a;
        wxaVar.d = wwzVar;
        wxaVar.b |= 1;
    }

    public static final /* synthetic */ void u(Iterable iterable, aozy aozyVar) {
        iterable.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wxa wxaVar = (wxa) aozyVar.b;
        wxa wxaVar2 = wxa.a;
        apax apaxVar = wxaVar.c;
        if (!apaxVar.c()) {
            wxaVar.c = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, wxaVar.c);
    }

    public static final /* synthetic */ wwz w(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (wwz) s;
    }

    public static final void x(String str, aozy aozyVar) {
        str.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wwz wwzVar = (wwz) aozyVar.b;
        wwz wwzVar2 = wwz.a;
        wwzVar.b |= 1;
        wwzVar.c = str;
    }

    public static final void y(String str, aozy aozyVar) {
        str.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wwz wwzVar = (wwz) aozyVar.b;
        wwz wwzVar2 = wwz.a;
        wwzVar.b |= 4;
        wwzVar.e = str;
    }

    public static final void z(String str, aozy aozyVar) {
        str.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wwz wwzVar = (wwz) aozyVar.b;
        wwz wwzVar2 = wwz.a;
        wwzVar.b |= 8;
        wwzVar.f = str;
    }
}
