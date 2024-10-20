package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardBuilder;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwe {
    public final adwg b;
    private static final acyz c = aczd.a(116284689);
    private static final acyz d = aczd.a(181241346);
    public static final acyz a = acyy.b("bug_191166396");

    public adwe(adwg adwgVar) {
        this.b = adwgVar;
    }

    public static ailx a(aikb aikbVar, boolean z, String[] strArr) {
        if (aikbVar != null) {
            String str = aikbVar.c;
            advp advpVar = adwf.a;
            return new ailx(ahji.l(str, z, aikbVar.o(), aikbVar.k()), aikbVar.m(), aikbVar.a(), Optional.ofNullable(aikbVar.n()), strArr);
        }
        throw new IllegalArgumentException("sipStack cannot be null.");
    }

    public static ainj b(int i, aini ainiVar) {
        advp advpVar = adwf.a;
        if (ainiVar != null) {
            ainj ainjVar = new ainj(i, ainj.y(i));
            for (aimh aimhVar : ainiVar.d) {
                if ((aimhVar instanceof aimg) || (aimhVar instanceof aimy) || (aimhVar instanceof ainc) || (aimhVar instanceof ailu) || (aimhVar instanceof aimr) || aimhVar.c.equalsIgnoreCase("Time-Stamp")) {
                    ainjVar.k(aimhVar);
                }
            }
            ailt ailtVar = ainiVar.g;
            if (ailtVar != null) {
                ainjVar.k(ailtVar);
            }
            ainjVar.k = null;
            ainjVar.m(assi.a);
            ainjVar.m("Content-Length");
            Collection.EL.stream(ainjVar.g().a).forEach(new aavc(16));
            return ainjVar;
        }
        throw new NullPointerException("null parameters");
    }

    public static void i(aini ainiVar, String... strArr) {
        ainiVar.k(ahmc.X("Require", (String) DesugarArrays.stream(strArr).collect(Collectors.joining(","))));
    }

    public static void j(aini ainiVar, String... strArr) {
        ainiVar.k(ahmc.X("Proxy-Require", (String) DesugarArrays.stream(strArr).collect(Collectors.joining(","))));
    }

    public static void k(aini ainiVar, String str) {
        ainiVar.k(ahmc.X("Security-Verify", str));
    }

    public static void l(aini ainiVar, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                ainiVar.k((aimh) arrayList.get(i));
            }
        }
    }

    public static void m(String str, String str2, String str3) {
        if (str != null) {
            if (str2 != null) {
                if (str3 != null) {
                    return;
                } else {
                    throw new aild("remoteParty is null.");
                }
            }
            throw new aild("localParty is null.");
        }
        throw new aild("call-ID is null.");
    }

    private static void t(aion aionVar) {
        if (adwf.z(aionVar)) {
        } else {
            throw new adwd();
        }
    }

    private static final ainj u(aion aionVar, int i) {
        t(aionVar);
        try {
            ainj b = b(i, (aini) aionVar.a);
            aimy aimyVar = (aimy) b.d("To");
            String l = aionVar.l();
            if (aimyVar != null && l != null) {
                if (!l.contains("tag")) {
                    aimyVar.f(aikx.a());
                }
                return b;
            }
            throw new aild("To header is null.");
        } catch (Exception e) {
            advr.i(e, "Can't create SIP message", new Object[0]);
            throw new aild("Can't create SIP response");
        }
    }

    private static final ainj v(aion aionVar, String str, int i) {
        t(aionVar);
        try {
            ainj b = b(i, (aini) aionVar.a);
            if (str != null) {
                aimy aimyVar = (aimy) b.d("To");
                if (aimyVar != null) {
                    aimyVar.f(str);
                } else {
                    throw new aild("To header is null.");
                }
            }
            return b;
        } catch (ailb e) {
            advr.i(e, "Can't create SIP message: ", new Object[0]);
            throw new aild("Can't create SIP response");
        }
    }

    public final aion c(aikb aikbVar, aijw aijwVar, String str, byte[] bArr, String str2, Optional optional) {
        try {
            String str3 = aijwVar.f;
            String str4 = aijwVar.a;
            String str5 = aijwVar.g;
            String str6 = aijwVar.h;
            m(str4, str5, str6);
            advp advpVar = adwf.a;
            aiks j = ahji.j(str3);
            ailu S = ahmc.S(str4);
            ailt R = ahmc.R(aijwVar.b, "MESSAGE");
            aikn h = ahji.h(str5);
            aini f = ahji.f(j, "MESSAGE", S, R, ahmc.W(h, aijwVar.d), ahmc.Z(ahji.h(str6), aijwVar.e), adwf.q(aikbVar), adwf.g());
            aion aionVar = new aion(f);
            ArrayList arrayList = aijwVar.j;
            if (arrayList != null) {
                l(f, arrayList);
            }
            f.k(ahmc.X("P-Preferred-Identity", h.c()));
            try {
                f.k(adwf.f(this.b.a()));
                String[] split = TextUtils.split(str, "/");
                f.o(bArr, ahmc.U(split[0], split[1]));
                f.p(ahmc.T(bArr.length));
                if (optional.isPresent() && ((Boolean) c.a()).booleanValue()) {
                    f.k(ahmc.X("Contribution-ID", (String) optional.get()));
                }
                if (((Boolean) d.a()).booleanValue()) {
                    Optional optional2 = aikbVar.e;
                    if (optional2.isPresent()) {
                        k(f, (String) optional2.get());
                        i(f, "sec-agree");
                        j(f, "sec-agree");
                    }
                }
                aionVar.b = str2;
                return aionVar;
            } catch (Exception e) {
                e = e;
                advr.i(e, "Can't create SIP message", new Object[0]);
                throw new aild("Can't create SIP MESSAGE message");
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final aion d(aikb aikbVar, aijw aijwVar, String str, int i, String str2, String str3, byte[] bArr) {
        try {
            String str4 = aijwVar.f;
            String str5 = aijwVar.a;
            String str6 = aijwVar.g;
            String str7 = aijwVar.h;
            m(str5, str6, str7);
            advp advpVar = adwf.a;
            aiks j = ahji.j(str4);
            ailu S = ahmc.S(str5);
            ailt R = ahmc.R(aijwVar.b, "PUBLISH");
            aikn h = ahji.h(str6);
            aini f = ahji.f(j, "PUBLISH", S, R, ahmc.W(h, aijwVar.d), ahmc.Z(ahji.h(str7), null), adwf.q(aikbVar), adwf.g());
            ArrayList arrayList = aijwVar.j;
            if (arrayList != null) {
                l(f, arrayList);
            }
            if (i >= 0) {
                f.k(ahmc.V(i));
            }
            if (str2 != null) {
                f.k(ahmc.X("SIP-If-Match", str2));
            }
            f.k(ahmc.X("P-Preferred-Identity", h.c()));
            try {
                f.k(adwf.f(this.b.a()));
                f.k(ahmc.X("Event", str));
                if (bArr != null && str3 != null) {
                    f.p(ahmc.T(0));
                    String[] split = TextUtils.split(str3, "/");
                    f.o(bArr, ahmc.U(split[0], split[1]));
                }
                return new aion(f);
            } catch (Exception e) {
                e = e;
                advr.i(e, "Can't create SIP message: %s", e.getMessage());
                throw new aild("Can't create SIP PUBLISH message");
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final aion e(aikb aikbVar, aijw aijwVar, int i, String str, String[] strArr) {
        aikn h;
        aini f;
        try {
            String str2 = aijwVar.f;
            String str3 = aijwVar.a;
            String str4 = aijwVar.g;
            String str5 = aijwVar.h;
            m(str3, str4, str5);
            advp advpVar = adwf.a;
            aiks j = ahji.j(str2);
            ailu S = ahmc.S(str3);
            ailt R = ahmc.R(aijwVar.b, "SUBSCRIBE");
            if (aijwVar.x) {
                h = ahji.h("sip:anonymous@anonymous.invalid");
            } else {
                h = ahji.h(str4);
            }
            f = ahji.f(j, "SUBSCRIBE", S, R, ahmc.W(h, aijwVar.d), ahmc.Z(ahji.h(str5), aijwVar.e), adwf.q(aikbVar), adwf.g());
            ArrayList arrayList = aijwVar.j;
            if (arrayList != null) {
                l(f, arrayList);
            }
            f.k(ahmc.V(i));
            f.k(ahmc.X("P-Preferred-Identity", str4));
        } catch (Exception e) {
            e = e;
        }
        try {
            f.k(adwf.f(this.b.a()));
            f.k(a(aikbVar, false, strArr));
            ahmc.Q(f, a.cp(str, "Event: "));
            Optional optional = aikbVar.e;
            if (optional.isPresent()) {
                k(f, (String) optional.get());
                i(f, "sec-agree");
                j(f, "sec-agree");
            }
            return new aion(f);
        } catch (Exception e2) {
            e = e2;
            advr.i(e, "Can't create SIP message", new Object[0]);
            throw new aild("Can't create SIP SUBSCRIBE message");
        }
    }

    public final aioo f(aikb aikbVar, aijw aijwVar) {
        aion aionVar = aijwVar.i;
        aion aionVar2 = aijwVar.p;
        if (aionVar2 != null) {
            aionVar = aionVar2;
        }
        if (aionVar == null) {
            return null;
        }
        return g(aikbVar, aijwVar, aionVar);
    }

    public final aioo g(aikb aikbVar, aijw aijwVar, aion aionVar) {
        try {
            ainj b = b(BasePaymentResult.ERROR_REQUEST_FAILED, aionVar.y());
            aimy aimyVar = (aimy) b.d("To");
            if (aimyVar != null) {
                aimyVar.f(aijwVar.d);
                b.k(a(aikbVar, false, new String[0]));
                b.k(adwf.e(this.b.a()));
                b.k(ahmc.X("Require", "timer"));
                b.p(ahmc.T(0));
                aiok[] aiokVarArr = aijwVar.r;
                if (aiokVarArr != null) {
                    if (aiokVarArr.length == 1) {
                        b.o(aiokVarArr[0].a, ahmc.U("application", "sdp"));
                    } else {
                        String concat = "b".concat(aikx.a());
                        byte[] B = adwf.B(aiokVarArr, concat);
                        aimb U = ahmc.U("multipart", "mixed");
                        U.n(concat);
                        b.o(B, U);
                    }
                }
                return new aioo(b);
            }
            throw new aild("To header is null.");
        } catch (Exception e) {
            advr.i(e, "Can't create SIP message", new Object[0]);
            throw new aild("Can't create SIP response");
        }
    }

    public final aioo h(aion aionVar, String str, int i) {
        return new aioo(v(aionVar, str, i));
    }

    public final aioo n(aion aionVar) {
        return new aioo(u(aionVar, BasePaymentResult.ERROR_REQUEST_FAILED));
    }

    public final aioo o(aion aionVar, int i, int i2) {
        ainj u = u(aionVar, i);
        if (((Boolean) a.a()).booleanValue()) {
            u.m = i2;
        }
        return new aioo(u);
    }

    public final aioo p(aion aionVar, String str, int i, int i2) {
        ainj v = v(aionVar, str, i);
        if (((Boolean) a.a()).booleanValue()) {
            v.m = i2;
        }
        return new aioo(v);
    }

    public final aion q(aikb aikbVar, aijw aijwVar) {
        try {
            String str = aijwVar.f;
            String str2 = aijwVar.a;
            String str3 = aijwVar.g;
            String str4 = aijwVar.h;
            m(str2, str3, str4);
            advp advpVar = adwf.a;
            aiks j = ahji.j(str);
            ailu S = ahmc.S(str2);
            ailt R = ahmc.R(aijwVar.b, "ACK");
            aimg W = ahmc.W(ahji.h(str3), aijwVar.d);
            aimy Z = ahmc.Z(ahji.h(str4), aijwVar.e);
            aion aionVar = aijwVar.i;
            try {
                if (aionVar != null) {
                    String b = ((ainb) aionVar.a.g().e(0)).b();
                    int y = aijwVar.q.y();
                    if (y > 199 && y < 300) {
                        b = adwf.p();
                    }
                    if (b != null) {
                        ainb aa = ahmc.aa(aikbVar.k(), aikbVar.a(), aikbVar.m(), b);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(aa);
                        aini f = ahji.f(j, "ACK", S, R, W, Z, arrayList, adwf.g());
                        ArrayList arrayList2 = aijwVar.j;
                        if (arrayList2 != null) {
                            l(f, arrayList2);
                        }
                        f.k(a(aikbVar, false, new String[0]));
                        f.k(adwf.f(this.b.a()));
                        f.k(adwf.F());
                        return new aion(f);
                    }
                    throw new aild("Branch is null.");
                }
                throw new aild("INVITE is null.");
            } catch (Exception e) {
                e = e;
                advr.i(e, "Can't create SIP message", new Object[0]);
                throw new aild("Can't create SIP ACK message");
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final aion r(aikb aikbVar, aijw aijwVar) {
        aiks j;
        int length;
        int i = 0;
        try {
            String str = aijwVar.f;
            String str2 = aijwVar.a;
            String str3 = aijwVar.g;
            String str4 = aijwVar.h;
            try {
                if (str2 != null && str3 != null && str4 != null) {
                    if (aijwVar.k && aijwVar.v != null) {
                        advp advpVar = adwf.a;
                        j = ahji.j(aijwVar.v);
                    } else if (str != null) {
                        advp advpVar2 = adwf.a;
                        j = ahji.j(str);
                    } else {
                        throw new aild("Target is null.");
                    }
                    aiks aiksVar = j;
                    ailu S = ahmc.S(str2);
                    ailt R = ahmc.R(aijwVar.b, "INVITE");
                    aikn h = ahji.h(str3);
                    aini f = ahji.f(aiksVar, "INVITE", S, R, ahmc.W(h, aijwVar.d), ahmc.Z(ahji.h(str4), aijwVar.e), adwf.r(aikbVar, true), adwf.g());
                    ailw ailwVar = aijwVar.c;
                    if (ailwVar != null) {
                        f.k(ailwVar);
                        advr.c("set conference header: %s", ailwVar.a);
                    }
                    f.k(a(aikbVar, false, new String[0]));
                    ArrayList arrayList = aijwVar.j;
                    if (arrayList != null) {
                        l(f, arrayList);
                    }
                    f.k(ahmc.X("P-Preferred-Identity", h.c()));
                    f.k(adwf.f(this.b.a()));
                    f.k(adwf.F());
                    f.k(ahmc.X("Supported", "timer"));
                    if (!aczf.I() && (!((Boolean) aczf.o().a.L.a()).booleanValue() || aczf.o().M())) {
                        aimw aimwVar = (aimw) ahmc.X("Session-Expires", "1800");
                        f.k(aimwVar);
                        String str5 = aijwVar.w;
                        if (str5 != null) {
                            aimwVar.f(str5);
                        }
                    }
                    Optional optional = aikbVar.e;
                    if (optional.isPresent()) {
                        k(f, (String) optional.get());
                        i(f, "sec-agree");
                        j(f, "sec-agree");
                    }
                    f.p(ahmc.T(0));
                    aiok[] aiokVarArr = aijwVar.t;
                    if (aiokVarArr == null) {
                        aiokVarArr = aijwVar.r;
                    }
                    if (aiokVarArr != null && (length = aiokVarArr.length) > 0) {
                        if (length == 1) {
                            String[] split = TextUtils.split(aiokVarArr[0].b, "/");
                            f.o(aiokVarArr[0].a, ahmc.U(split[0], split[1]));
                        } else {
                            String cp = a.cp(aikx.a(), "b");
                            aimb U = ahmc.U("multipart", "mixed");
                            U.n(cp);
                            f.o(adwf.B(aiokVarArr, cp), U);
                        }
                    }
                    aion aionVar = new aion(f);
                    if (aiokVarArr != null) {
                        StringBuilder sb = new StringBuilder();
                        String str6 = "";
                        while (i < aiokVarArr.length) {
                            aiok aiokVar = aiokVarArr[i];
                            sb.append(str6);
                            sb.append(aiokVar.c());
                            i++;
                            str6 = VCardBuilder.VCARD_END_OF_LINE;
                        }
                        aionVar.b = sb.toString();
                    }
                    return aionVar;
                }
                throw new aild(a.cr(aijwVar, "Call-ID, localParty or remoteParty is null. "));
            } catch (Exception e) {
                e = e;
                advr.i(e, "Can't create SIP message", new Object[0]);
                throw new aild("Can't create SIP INVITE message", e);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final aion s(aikb aikbVar, aijw aijwVar) {
        try {
            String str = aijwVar.f;
            String str2 = aijwVar.a;
            String str3 = aijwVar.g;
            String str4 = aijwVar.h;
            m(str2, str3, str4);
            advp advpVar = adwf.a;
            aiks j = ahji.j(str);
            ailu S = ahmc.S(str2);
            ailt R = ahmc.R(aijwVar.b, "OPTIONS");
            aikn h = ahji.h(str3);
            aini f = ahji.f(j, "OPTIONS", S, R, ahmc.W(h, aijwVar.d), ahmc.Z(ahji.h(str4), null), adwf.q(aikbVar), adwf.g());
            f.k(a(aikbVar, false, new String[0]));
            f.k(ahmc.X("Accept", "application/sdp"));
            ArrayList arrayList = aijwVar.j;
            if (arrayList != null) {
                l(f, arrayList);
            }
            f.k(ahmc.X("P-Preferred-Identity", h.c()));
            try {
                f.k(adwf.f(this.b.a()));
                f.k(adwf.F());
                return new aion(f);
            } catch (Exception e) {
                e = e;
                advr.i(e, "Can't create SIP message", new Object[0]);
                throw new aild("Can't create SIP OPTIONS message");
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
