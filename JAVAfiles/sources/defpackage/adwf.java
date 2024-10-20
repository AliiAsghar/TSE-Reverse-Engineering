package defpackage;

import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.android.vcard.VCardBuilder;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwf {
    public static final ahji c = new ahji();
    public static final advp a = new advp("SipUtils");
    private static final acyz d = aczd.a(188805143);
    public static final acyz b = acyy.b("do_not_respond_to_ack");
    private static final alpt e = alpt.s("+g.gsma.rcs.msgrevoke", "vnd.google.rcs.encrypted", "+vnd.google.rcs.encrypted");

    public static boolean A(String str, String str2) {
        aikp aikpVar;
        if (str != null && str2 != null && !agkx.ae(str) && !agkx.ae(str2)) {
            try {
                aiks j = ahji.j(str);
                aiks j2 = ahji.j(str2);
                if (j.l() && j2.l()) {
                    aikp aikpVar2 = (aikp) j;
                    aikp aikpVar3 = (aikp) j2;
                    if (!agkx.ac(aikpVar2.e(), aikpVar3.e()) || !agkx.ac(aikpVar2.b(), aikpVar3.b())) {
                        return false;
                    }
                    return true;
                }
                boolean z = j instanceof aikq;
                if (z && (j2 instanceof aikq)) {
                    return agkx.ac(((aikq) j).a(), ((aikq) j2).a());
                }
                aikq aikqVar = null;
                if (j.l()) {
                    aikpVar = (aikp) j;
                } else if (j2.l()) {
                    aikpVar = (aikp) j2;
                } else {
                    aikpVar = null;
                }
                if (z) {
                    aikqVar = (aikq) j;
                } else if (j2 instanceof aikq) {
                    aikqVar = (aikq) j2;
                }
                if (aikpVar == null || aikqVar == null) {
                    return false;
                }
                boolean ac = agkx.ac(aikpVar.e(), aikqVar.b());
                advr.c("Comparing sip uri %s and tel uri %s equal %b", advq.URI_SIP.c(aikpVar), advq.URI_TEL.c(aikqVar), Boolean.valueOf(ac));
                return ac;
            } catch (Exception e2) {
                advr.i(e2, "Cannot compare URIs: %s, %s", str, str2);
            }
        }
        return false;
    }

    public static byte[] B(aiok[] aiokVarArr, String str) {
        StringBuilder sb = new StringBuilder();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i < aiokVarArr.length; i++) {
            try {
                sb.setLength(0);
                if (i > 0) {
                    sb.append(VCardBuilder.VCARD_END_OF_LINE);
                }
                sb.append("--");
                sb.append(str);
                sb.append(VCardBuilder.VCARD_END_OF_LINE);
                sb.append("Content-Type: ");
                sb.append(aiokVarArr[i].b);
                sb.append(VCardBuilder.VCARD_END_OF_LINE);
                if (aiokVarArr[i].c != null) {
                    sb.append("Content-Disposition: ");
                    sb.append(aiokVarArr[i].c);
                    sb.append(VCardBuilder.VCARD_END_OF_LINE);
                }
                if (aiokVarArr[i].d != null) {
                    sb.append("Content-ID: <");
                    sb.append(aiokVarArr[i].d);
                    sb.append(">");
                    sb.append(VCardBuilder.VCARD_END_OF_LINE);
                }
                byte[] bArr = aiokVarArr[i].a;
                sb.append("Content-Length: ");
                sb.append(bArr.length);
                sb.append(VCardBuilder.VCARD_END_OF_LINE);
                sb.append(VCardBuilder.VCARD_END_OF_LINE);
                byteArrayOutputStream.write(sb.toString().getBytes("utf-8"));
                byteArrayOutputStream.write(bArr);
            } catch (Exception e2) {
                advr.i(e2, "Error while getting multipart content: %s", e2.getMessage());
                return null;
            }
        }
        sb.setLength(0);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        sb.append("--");
        sb.append(str);
        sb.append("--");
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        byteArrayOutputStream.write(sb.toString().getBytes("utf-8"));
        return byteArrayOutputStream.toByteArray();
    }

    @Deprecated
    public static String[] C(boolean z) {
        if (z) {
            return D(null, null, Arrays.asList("urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session"));
        }
        return D(Arrays.asList("+g.oma.sip-im"), null, null);
    }

    public static String[] D(List list, List list2, List list3) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list2 != null && !list2.isEmpty()) {
            arrayList.add(String.format("%s=\"%s\"", "+g.3gpp.iari-ref", TextUtils.join(",", list2)));
        }
        if (list3 != null && !list3.isEmpty()) {
            arrayList.add(String.format("%s=\"%s\"", "+g.3gpp.icsi-ref", TextUtils.join(",", list3)));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int E(aiom aiomVar) {
        char c2;
        String P = ahmc.P(aiomVar);
        if (P == null) {
            return 1;
        }
        switch (P.hashCode()) {
            case -2130369783:
                if (P.equals("INVITE")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1986360503:
                if (P.equals("NOTIFY")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1785516855:
                if (P.equals("UPDATE")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case -993530582:
                if (P.equals("SUBSCRIBE")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case -531492226:
                if (P.equals("OPTIONS")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 64617:
                if (P.equals("ACK")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 66254:
                if (P.equals("BYE")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 2251950:
                if (P.equals("INFO")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 76389159:
                if (P.equals("PRACK")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 77853792:
                if (P.equals("REFER")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 92413603:
                if (P.equals("REGISTER")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 482617583:
                if (P.equals("PUBLISH")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 1672907751:
                if (P.equals("MESSAGE")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 1980572282:
                if (P.equals("CANCEL")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case '\b':
                return 10;
            case '\t':
                return 11;
            case '\n':
                return 12;
            case 11:
                return 13;
            case '\f':
                return 14;
            case '\r':
                return 15;
            default:
                return 1;
        }
    }

    public static aimh F() {
        return ahmc.X("Allow", "INVITE, ACK, BYE, CANCEL, NOTIFY, OPTIONS, MESSAGE");
    }

    private static String G(String str, String str2, String str3, yjr yjrVar, boolean z) {
        String str4;
        if (!aczf.w()) {
            str4 = yjrVar.q(str);
        } else {
            str4 = str;
        }
        boolean isGlobalPhoneNumber = PhoneNumberUtils.isGlobalPhoneNumber(str4);
        if (z) {
            if (isGlobalPhoneNumber) {
                return "tel:" + str4 + albo.ag(str3);
            }
        } else if (isGlobalPhoneNumber) {
            if (str3 == null) {
                str3 = ";user=phone";
            } else if (!str3.contains("user=phone")) {
                str3 = ";user=phone".concat(str3);
            }
            return "sip:" + str4 + "@" + str2 + str3;
        }
        return H(str, str2, str3);
    }

    private static String H(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            if (str3 == null) {
                str3 = "";
            }
            return "sip:" + str2 + str3;
        }
        if (str3 == null) {
            str3 = "";
        }
        return "sip:" + str + "@" + str2 + str3;
    }

    public static int a(aiom aiomVar) {
        aimh d2 = aiomVar.a.d("Min-Expires");
        if (d2 == null) {
            return -1;
        }
        return d2.h(-1);
    }

    public static aiks b(aion aionVar, yjr yjrVar) {
        String aiksVar;
        ailx b2;
        aimi e2 = aionVar.y().e("P-Asserted-Identity");
        if (e2 != null && e2.b() > 0) {
            for (aimh aimhVar : e2.a) {
                try {
                    String a2 = aimhVar.a();
                    String str = aimhVar.c;
                    a2.getClass();
                    aiks aiksVar2 = ahji.h(a2).b;
                    if (aiksVar2 == null) {
                        continue;
                    } else {
                        if (aiksVar2.d().equals("tel") && ((aikq) aiksVar2).e()) {
                            return aiksVar2;
                        }
                        if (aiksVar2.l()) {
                            String e3 = ((aikp) aiksVar2).e();
                            e3.getClass();
                            if (PhoneNumberUtils.isGlobalPhoneNumber(e3)) {
                                return aiksVar2;
                            }
                        } else {
                            continue;
                        }
                    }
                } catch (ailb unused) {
                }
            }
            try {
                aimh f = e2.f();
                f.getClass();
                String a3 = f.a();
                a3.getClass();
                aiks aiksVar3 = ahji.h(a3).b;
                if (aiksVar3.l()) {
                    if (((Boolean) d.a()).booleanValue() && (b2 = aionVar.b()) != null && b2.l("+g.gsma.rcs.isbot")) {
                        return aiksVar3;
                    }
                    aikp aikpVar = (aikp) aiksVar3;
                    String e4 = aikpVar.e();
                    e4.getClass();
                    if (!aczf.w()) {
                        e4 = yjrVar.q(e4);
                    }
                    aikpVar.k(e4);
                    aikpVar.b.i("user");
                    aikpVar.b.f("user", "phone");
                    return aikpVar;
                }
                if (aiksVar3 instanceof aikq) {
                    aikq aikqVar = (aikq) aiksVar3;
                    String a4 = aikqVar.a();
                    if (!aczf.w()) {
                        a4 = yjrVar.q(aikqVar.a());
                    }
                    aikr aikrVar = aikqVar.a;
                    aikrVar.b = a4;
                    aikrVar.a = true;
                    return aikqVar;
                }
            } catch (ailb unused2) {
                return null;
            }
        }
        try {
            aimg aimgVar = aionVar.a.e;
            if (aimgVar == null) {
                aiksVar = null;
            } else {
                aiksVar = aimgVar.a.b.toString();
            }
            aiksVar.getClass();
            return ahji.h(aiksVar).b;
        } catch (ailb e5) {
            advr.i(e5, "Error while parsing remote address: %s", e5.getMessage());
            return null;
        }
    }

    public static aiks c(String str, ImsConfiguration imsConfiguration, yjr yjrVar) {
        return d(str, imsConfiguration.mDomain, yjrVar, y(imsConfiguration));
    }

    public static aiks d(String str, String str2, yjr yjrVar, boolean z) {
        try {
            return ahji.h(m(str, str2, yjrVar, z)).b;
        } catch (ailb e2) {
            advr.i(e2, "Error while parsing remote address: %s", e2.getMessage());
            return null;
        }
    }

    public static aimh e(String str) {
        return ahmc.X("Server", str);
    }

    public static aimh f(String str) {
        if (!TextUtils.isEmpty(adaa.r())) {
            str = adaa.r();
        }
        return ahmc.X("User-Agent", str);
    }

    public static aimj g() {
        return ahmc.Y(70);
    }

    public static String h(String str) {
        aikv aikvVar;
        String str2;
        try {
            aikn h = ahji.h(str);
            aiks aiksVar = h.b;
            if (aiksVar instanceof aikp) {
                aikw a2 = ((aikp) aiksVar).a();
                if (a2 == null) {
                    aikvVar = null;
                } else {
                    aikvVar = a2.a;
                }
                if (a2 != null && aikvVar != null) {
                    String str3 = aikvVar.a;
                    if (h.a() != -1) {
                        str2 = ":" + h.a();
                    } else {
                        str2 = "";
                    }
                    return str3 + str2;
                }
                throw new IllegalArgumentException("SipURI does not have host port.");
            }
            throw new IllegalArgumentException("address is not a SipURI");
        } catch (Exception unused) {
            return null;
        }
    }

    public static String i(String str) {
        int indexOf;
        if (str != null && (indexOf = str.indexOf("tag=")) > 0) {
            return str.substring(indexOf + 4);
        }
        return null;
    }

    public static String j(aiks aiksVar, yjr yjrVar) {
        String aiksVar2;
        if (aiksVar instanceof aikp) {
            aiksVar2 = (String) ((aikp) aiksVar).a.a().map(new aegk(1)).orElse("");
        } else if (aiksVar instanceof aikq) {
            aikq aikqVar = (aikq) aiksVar;
            String a2 = aikqVar.a();
            if (aikqVar.e()) {
                aiksVar2 = "+".concat(String.valueOf(a2));
            } else {
                aiksVar2 = a2;
            }
        } else {
            aiksVar2 = aiksVar.toString();
        }
        if (w(aiksVar2) && !aczf.w()) {
            return yjrVar.q(aiksVar2);
        }
        return aiksVar2;
    }

    public static String k(String str, yjr yjrVar) {
        try {
            aiks aiksVar = ahji.h(str).b;
            if (aiksVar == null) {
                advr.g("SipUtils: null uri returned for address: %s", str);
                return null;
            }
            return j(aiksVar, yjrVar);
        } catch (ailb e2) {
            advr.i(e2, "captured ParseException extracting username from address %s", str);
            return null;
        }
    }

    public static String l(String str, ImsConfiguration imsConfiguration, yjr yjrVar) {
        return m(str, imsConfiguration.mDomain, yjrVar, y(imsConfiguration));
    }

    public static String m(String str, String str2, yjr yjrVar, boolean z) {
        int indexOf;
        if (agkx.ad(str)) {
            return "sip:".concat(String.valueOf(str));
        }
        String str3 = null;
        if (!w(str)) {
            if (str != null && (indexOf = str.indexOf(59)) >= 0) {
                str3 = str.substring(indexOf);
                if (str3.endsWith(">")) {
                    str3 = str3.substring(0, str3.length() - 1);
                }
            }
            String k = k(str, yjrVar);
            String h = h(str);
            if (h != null) {
                str2 = h;
            }
            if (k != null) {
                str = k;
            }
            if (w(str)) {
                return G(str, str2, str3, yjrVar, z);
            }
            return H(str, str2, str3);
        }
        return G(str, str2, null, yjrVar, z);
    }

    public static String n(String str, yjr yjrVar) {
        String k = k(str, yjrVar);
        String h = h(str);
        if (!TextUtils.isEmpty(k) && !TextUtils.isEmpty(h)) {
            return a.co(h, k, "@");
        }
        return null;
    }

    public static String o(String str, yjr yjrVar) {
        String k = k(str, yjrVar);
        if (TextUtils.isEmpty(k)) {
            return str;
        }
        return k;
    }

    public static String p() {
        return "z9hG4bK".concat(aikx.a());
    }

    public static ArrayList q(aikb aikbVar) {
        return r(aikbVar, false);
    }

    public static ArrayList r(aikb aikbVar, boolean z) {
        String p = p();
        if (aikbVar != null) {
            ainb aa = ahmc.aa(aikbVar.k(), aikbVar.a(), aikbVar.m(), p);
            if (z) {
                aa.f();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(aa);
            return arrayList;
        }
        throw new IllegalArgumentException("sipStack cannot be null.");
    }

    public static ArrayList s(aiom aiomVar, boolean z) {
        int i;
        ArrayList arrayList = new ArrayList();
        Iterator it = aiomVar.a.j("Record-Route").iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            aimq aimqVar = (aimq) ((aimh) it.next());
            aimt aimtVar = new aimt(aimqVar.a);
            if (aimqVar.m()) {
                Iterator<aikz> it2 = aimqVar.e.iterator();
                while (it2.hasNext()) {
                    aimtVar.e.e((aikz) it2.next().clone());
                }
            }
            if (z) {
                arrayList.add(0, aimtVar.a());
            } else {
                arrayList.add(aimtVar.a());
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (i = 0; i < arrayList.size(); i++) {
            try {
                arrayList2.add((aimt) ahmc.X("Route", (String) arrayList.get(i)));
            } catch (ailb e2) {
                System.err.print("Can't create default Route header ".concat(String.valueOf(e2.getMessage())));
            }
        }
        return arrayList2;
    }

    public static void t(aiom aiomVar, String[] strArr, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            if (E(aiomVar) != 2 || !e.contains(str)) {
                sb.append(";");
                sb.append(str);
            }
        }
        if (z) {
            sb.append(";explicit");
        }
        if (z2) {
            sb.append(";require");
        }
        aiomVar.a.p(ahmc.X("Accept-Contact", "*".concat(sb.toString())));
    }

    public static void u(aiom aiomVar, String str, String[] strArr) {
        boolean z;
        String[] strArr2;
        Object[] objArr;
        aily c2;
        boolean z2 = false;
        if (strArr.length != 0 && (c2 = aiomVar.a.c()) != null && !c2.i()) {
            ailx ailxVar = (ailx) aiomVar.a.c().f();
            ailxVar.getClass();
            for (int i = 0; i < strArr.length; i++) {
                if (!strArr[i].contains("+sip.instance")) {
                    ailxVar.j(new aikz(strArr[i], null));
                }
            }
        }
        if (aiomVar.x()) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            Object bW = a.bW(str, "+sip.instance=\"<", ">\"");
            z = true;
            if (strArr == null) {
                Object[] objArr2 = (Object[]) Array.newInstance(bW.getClass(), 1);
                objArr2[0] = bW;
                objArr = objArr2;
            } else {
                Class<?> componentType = strArr.getClass().getComponentType();
                objArr = strArr;
                if (!Objects.isNull(componentType)) {
                    int length = strArr.length;
                    Object[] objArr3 = (Object[]) Array.newInstance(componentType, length + 1);
                    System.arraycopy(strArr, 0, objArr3, 0, length);
                    objArr3[objArr3.length - 1] = bW;
                    objArr = objArr3;
                }
            }
            z2 = true;
            strArr2 = (String[]) objArr;
        } else {
            z = false;
            strArr2 = strArr;
        }
        t(aiomVar, strArr2, z2, z);
    }

    public static boolean v(String str) {
        if (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.US).startsWith("sip:") || w(str.substring(4).split("@", -1)[0])) {
            return false;
        }
        return agkx.ad(str.substring(4));
    }

    public static boolean w(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!PhoneNumberUtils.isDialable(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean x(String str, String str2) {
        if (str != null && str.toLowerCase(Locale.US).contains(str2)) {
            return true;
        }
        return false;
    }

    public static boolean y(ImsConfiguration imsConfiguration) {
        return "tel".equals(imsConfiguration.mIntUrlFmt);
    }

    public static boolean z(aion aionVar) {
        if (!((Boolean) b.a()).booleanValue() || !"ACK".equals(aionVar.z())) {
            return true;
        }
        return false;
    }
}
