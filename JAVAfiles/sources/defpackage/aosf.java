package defpackage;

import com.android.vcard.VCardConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aosf {
    private static final Pattern A;
    private static aosf B;
    public static final Logger a = Logger.getLogger(aosf.class.getName());
    public static final alor b;
    public static final Pattern c;
    static final Pattern d;
    static final Pattern e;
    static final Pattern f;
    static final Pattern g;
    static final Pattern h;
    public static final aorv i;
    private static final alpt j;
    private static final alor k;
    private static final alor l;
    private static final alor m;
    private static final String n;
    private static final Pattern o;
    private static final Pattern p;
    private static final Pattern q;
    private static final Pattern r;
    private static final String s;
    private static final String t;
    private static final String u;
    private static final String v;
    private static final String w;
    private static final String x;
    private static final Pattern y;
    private static final Pattern z;
    private final Map C;
    private final aosv G;
    private final Set D = EnumSet.noneOf(aorv.class);
    private final aojj H = new aojj((byte[]) null);
    private final Set E = new HashSet(320);
    private final Set F = new HashSet();

    static {
        alor.l(54, "9");
        alpr alprVar = new alpr();
        alprVar.c(86);
        alpt g2 = alprVar.g();
        j = g2;
        new altx(52);
        alpr alprVar2 = new alpr();
        alprVar2.c(52);
        alprVar2.c(54);
        alprVar2.c(55);
        alprVar2.c(62);
        alprVar2.j(g2);
        alprVar2.g();
        alok alokVar = new alok();
        alokVar.h('0', '0');
        alokVar.h('1', '1');
        alokVar.h('2', '2');
        alokVar.h('3', '3');
        alokVar.h('4', '4');
        alokVar.h('5', '5');
        alokVar.h('6', '6');
        alokVar.h('7', '7');
        alokVar.h('8', '8');
        alokVar.h('9', '9');
        alor b2 = alokVar.b();
        k = b2;
        alok alokVar2 = new alok();
        alokVar2.l(b2);
        alokVar2.h('+', '+');
        alokVar2.h('*', '*');
        alokVar2.h('#', '#');
        alokVar2.b();
        alok alokVar3 = new alok();
        alokVar3.h('A', '2');
        alokVar3.h('B', '2');
        alokVar3.h('C', '2');
        alokVar3.h('D', '3');
        alokVar3.h('E', '3');
        alokVar3.h('F', '3');
        alokVar3.h('G', '4');
        alokVar3.h('H', '4');
        alokVar3.h('I', '4');
        alokVar3.h('J', '5');
        alokVar3.h('K', '5');
        alokVar3.h('L', '5');
        alokVar3.h('M', '6');
        alokVar3.h('N', '6');
        alokVar3.h('O', '6');
        alokVar3.h('P', '7');
        alokVar3.h('Q', '7');
        alokVar3.h('R', '7');
        alokVar3.h('S', '7');
        alokVar3.h('T', '8');
        alokVar3.h('U', '8');
        alokVar3.h('V', '8');
        alokVar3.h('W', '9');
        alokVar3.h('X', '9');
        alokVar3.h('Y', '9');
        alokVar3.h('Z', '9');
        alor b3 = alokVar3.b();
        l = b3;
        alok alokVar4 = new alok();
        alokVar4.l(b3);
        alokVar4.l(b2);
        m = alokVar4.b();
        HashMap hashMap = new HashMap();
        aluq listIterator = b3.keySet().listIterator();
        while (listIterator.hasNext()) {
            Character ch = (Character) listIterator.next();
            hashMap.put(Character.valueOf(albo.an(ch.charValue())), ch);
            hashMap.put(ch, ch);
        }
        alok alokVar5 = new alok();
        alokVar5.l(k);
        alokVar5.l(hashMap);
        alokVar5.h('-', '-');
        alokVar5.h((char) 65293, '-');
        alokVar5.h((char) 8208, '-');
        alokVar5.h((char) 8209, '-');
        alokVar5.h((char) 8210, '-');
        alokVar5.h((char) 8211, '-');
        alokVar5.h((char) 8212, '-');
        alokVar5.h((char) 8213, '-');
        alokVar5.h((char) 8722, '-');
        alokVar5.h('/', '/');
        alokVar5.h((char) 65295, '/');
        alokVar5.h(' ', ' ');
        alokVar5.h((char) 12288, ' ');
        alokVar5.h((char) 8288, ' ');
        alokVar5.h('.', '.');
        alokVar5.h((char) 65294, '.');
        b = alokVar5.b();
        c = Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        alor alorVar = l;
        String concat = String.valueOf(alorVar.keySet().toString().replaceAll("[, \\[\\]]", "")).concat(String.valueOf(albo.ap(alorVar.keySet().toString()).replaceAll("[, \\[\\]]", "")));
        n = concat;
        d = Pattern.compile("[+＋]+");
        o = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        p = Pattern.compile("(\\p{Nd})");
        q = Pattern.compile("[+＋\\p{Nd}]");
        e = Pattern.compile("[\\\\/] *x");
        f = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        r = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String str = "\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*" + concat + "\\p{Nd}]*";
        s = str;
        String F = F(true);
        t = F;
        F(false);
        g = Pattern.compile("^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$");
        String concat2 = String.valueOf(concat).concat("\\p{Nd}");
        u = concat2;
        String str2 = "[" + concat2 + "]+((\\-)*[" + concat2 + "])*";
        v = str2;
        String str3 = "[" + concat + "]+((\\-)*[" + concat2 + "])*";
        w = str3;
        String str4 = "^(" + str2 + "\\.)*" + str3 + "\\.?$";
        x = str4;
        h = Pattern.compile(str4);
        y = Pattern.compile("(?:" + F + ")$", 66);
        z = Pattern.compile(str + "(?:" + F + ")?", 66);
        Pattern.compile("(\\D+)");
        A = Pattern.compile("(\\$\\d)");
        Pattern.compile("\\(?\\$1\\)?");
        B = null;
        i = aosh.a;
    }

    public aosf(aosv aosvVar, Map map) {
        this.G = aosvVar;
        this.C = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && i.equals(list.get(0))) {
                this.F.add((Integer) entry.getKey());
            } else {
                this.E.addAll(list);
            }
        }
        if (this.E.remove(i)) {
            a.logp(Level.WARNING, "com.google.i18n.phonenumbers.PhoneNumberUtil", "<init>", "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.D.addAll((Collection) map.get(1));
    }

    static void A(StringBuilder sb) {
        if (r.matcher(sb).matches()) {
            sb.replace(0, sb.length(), B(sb, m));
        } else {
            sb.replace(0, sb.length(), j(sb));
        }
    }

    public static String B(CharSequence charSequence, Map map) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            Character ch = (Character) map.get(Character.valueOf(albo.ao(charSequence.charAt(i2))));
            if (ch != null) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    static final boolean E(String str, aose aoseVar) {
        apao apaoVar = aoseVar.d;
        if ((!apaoVar.isEmpty() && !apaoVar.contains(Integer.valueOf(str.length()))) || aotl.p(str, aoseVar) != 1) {
            return false;
        }
        return true;
    }

    private static String F(boolean z2) {
        String G = G(20);
        String str = ";ext=".concat(G) + "|" + ("[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + G(20) + "#?") + "|" + ("[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + G(9) + "#?") + "|" + ("[- ]+" + G(6) + "#");
        if (z2) {
            return str + "|" + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + G(15) + "#?") + "|" + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + G(9) + "#?");
        }
        return str;
    }

    private static String G(int i2) {
        return a.cb(i2, "(\\p{Nd}{1,", "})");
    }

    private static void H(aosc aoscVar, String str) {
        if (aoscVar != null) {
        } else {
            throw new aorz(str);
        }
    }

    private static boolean I(aose aoseVar) {
        if (aoseVar.d.size() != 1 || aoseVar.d.d(0) != -1) {
            return true;
        }
        return false;
    }

    private static aose J(aosc aoscVar, int i2) {
        switch (i2 - 1) {
            case 0:
            case 2:
                aose aoseVar = aoscVar.d;
                if (aoseVar == null) {
                    return aose.a;
                }
                return aoseVar;
            case 1:
                aose aoseVar2 = aoscVar.e;
                if (aoseVar2 == null) {
                    return aose.a;
                }
                return aoseVar2;
            case 3:
                aose aoseVar3 = aoscVar.f;
                if (aoseVar3 == null) {
                    return aose.a;
                }
                return aoseVar3;
            case 4:
                aose aoseVar4 = aoscVar.g;
                if (aoseVar4 == null) {
                    return aose.a;
                }
                return aoseVar4;
            case 5:
                aose aoseVar5 = aoscVar.h;
                if (aoseVar5 == null) {
                    return aose.a;
                }
                return aoseVar5;
            case 6:
                aose aoseVar6 = aoscVar.j;
                if (aoseVar6 == null) {
                    return aose.a;
                }
                return aoseVar6;
            case 7:
                aose aoseVar7 = aoscVar.i;
                if (aoseVar7 == null) {
                    return aose.a;
                }
                return aoseVar7;
            case 8:
                aose aoseVar8 = aoscVar.k;
                if (aoseVar8 == null) {
                    return aose.a;
                }
                return aoseVar8;
            case 9:
                aose aoseVar9 = aoscVar.l;
                if (aoseVar9 == null) {
                    return aose.a;
                }
                return aoseVar9;
            case 10:
                aose aoseVar10 = aoscVar.m;
                if (aoseVar10 == null) {
                    return aose.a;
                }
                return aoseVar10;
            default:
                aose aoseVar11 = aoscVar.c;
                if (aoseVar11 == null) {
                    return aose.a;
                }
                return aoseVar11;
        }
    }

    private final int K(CharSequence charSequence, aosc aoscVar) {
        return L(charSequence, aoscVar, 12);
    }

    private final int L(CharSequence charSequence, aosc aoscVar, int i2) {
        List list;
        apao apaoVar;
        aose J = J(aoscVar, i2);
        if (J.d.size() == 0) {
            aose aoseVar = aoscVar.c;
            if (aoseVar == null) {
                aoseVar = aose.a;
            }
            list = aoseVar.d;
        } else {
            list = J.d;
        }
        List list2 = J.e;
        if (i2 == 3) {
            if (!I(J(aoscVar, 1))) {
                return L(charSequence, aoscVar, 2);
            }
            aose J2 = J(aoscVar, 2);
            if (I(J2)) {
                List arrayList = new ArrayList(list);
                if (J2.d.size() == 0) {
                    aose aoseVar2 = aoscVar.c;
                    if (aoseVar2 == null) {
                        aoseVar2 = aose.a;
                    }
                    apaoVar = aoseVar2.d;
                } else {
                    apaoVar = J2.d;
                }
                arrayList.addAll(apaoVar);
                Collections.sort(arrayList);
                if (list2.isEmpty()) {
                    list2 = J2.e;
                } else {
                    List arrayList2 = new ArrayList(list2);
                    arrayList2.addAll(J2.e);
                    Collections.sort(arrayList2);
                    list2 = arrayList2;
                }
                list = arrayList;
            }
        }
        if (((Integer) list.get(0)).intValue() == -1) {
            return 5;
        }
        int length = charSequence.length();
        Object valueOf = Integer.valueOf(length);
        if (list2.contains(valueOf)) {
            return 2;
        }
        int intValue = ((Integer) list.get(0)).intValue();
        if (intValue == length) {
            return 1;
        }
        if (intValue > length) {
            return 4;
        }
        if (((Integer) list.get(list.size() - 1)).intValue() < length) {
            return 6;
        }
        if (list.subList(1, list.size()).contains(valueOf)) {
            return 1;
        }
        return 5;
    }

    private static final boolean M(aosw aoswVar, aosw aoswVar2) {
        String valueOf = String.valueOf(aoswVar.d);
        String valueOf2 = String.valueOf(aoswVar2.d);
        if (!valueOf.endsWith(valueOf2) && !valueOf2.endsWith(valueOf)) {
            return false;
        }
        return true;
    }

    private static aozy N(aosw aoswVar) {
        aozy createBuilder = aosw.a.createBuilder();
        int i2 = aoswVar.c;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        aosw aoswVar2 = (aosw) apagVar;
        aoswVar2.b |= 1;
        aoswVar2.c = i2;
        long j2 = aoswVar.d;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        aosw aoswVar3 = (aosw) createBuilder.b;
        aoswVar3.b |= 2;
        aoswVar3.d = j2;
        if (aoswVar.e.length() > 0) {
            String str = aoswVar.e;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aosw aoswVar4 = (aosw) createBuilder.b;
            str.getClass();
            aoswVar4.b |= 4;
            aoswVar4.e = str;
        }
        if (aoswVar.f) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aosw.a((aosw) createBuilder.b);
            int i3 = aoswVar.g;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aosw aoswVar5 = (aosw) createBuilder.b;
            aoswVar5.b |= 16;
            aoswVar5.g = i3;
        }
        return createBuilder;
    }

    public static synchronized aosf g() {
        aosf aosfVar;
        synchronized (aosf.class) {
            if (B == null) {
                k(new aosf((aosv) atii.j().a, aorx.a));
            }
            aosfVar = B;
        }
        return aosfVar;
    }

    public static String j(CharSequence charSequence) {
        return aetn.bb(charSequence).toString();
    }

    static synchronized void k(aosf aosfVar) {
        synchronized (aosf.class) {
            B = aosfVar;
        }
    }

    static boolean p(CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return false;
        }
        return z.matcher(charSequence).matches();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int C(java.lang.CharSequence r9, defpackage.aosc r10, java.lang.StringBuilder r11, boolean r12, defpackage.aozy r13) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aosf.C(java.lang.CharSequence, aosc, java.lang.StringBuilder, boolean, aozy):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(java.lang.CharSequence r17, defpackage.aorv r18, boolean r19, boolean r20, defpackage.aozy r21) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aosf.D(java.lang.CharSequence, aorv, boolean, boolean, aozy):void");
    }

    public final int a(aorv aorvVar) {
        aosc e2 = e(aorvVar);
        if (e2 != null) {
            return e2.o;
        }
        throw new IllegalArgumentException("Invalid region code: ".concat(String.valueOf(String.valueOf(aorvVar))));
    }

    public final aorv b(int i2) {
        List list = (List) this.C.get(Integer.valueOf(i2));
        if (list == null) {
            return aorv.ZZ;
        }
        return (aorv) list.get(0);
    }

    public final aorv c(aosw aoswVar) {
        int i2 = aoswVar.c;
        List<aorv> list = (List) this.C.get(Integer.valueOf(i2));
        if (list == null) {
            a.logp(Level.INFO, "com.google.i18n.phonenumbers.PhoneNumberUtil", "getRegionCodeForNumber", a.cb(i2, "Missing/invalid country_code (", ")"));
            return null;
        }
        if (list.size() != 1) {
            String i3 = i(aoswVar);
            for (aorv aorvVar : list) {
                aosc e2 = e(aorvVar);
                if ((e2.b & VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS) != 0) {
                    if (this.H.c(e2.x).matcher(i3).lookingAt()) {
                        return aorvVar;
                    }
                } else if (s(i3, e2) != 12) {
                    return aorvVar;
                }
            }
            return null;
        }
        return (aorv) list.get(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final aosa d(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aosa aosaVar = (aosa) it.next();
            int size = aosaVar.e.size();
            if (size != 0) {
                if (!this.H.c((String) aosaVar.e.get(size - 1)).matcher(str).lookingAt()) {
                    continue;
                }
            }
            if (this.H.c(aosaVar.c).matcher(str).matches()) {
                return aosaVar;
            }
        }
        return null;
    }

    public final aosc e(aorv aorvVar) {
        if (!o(aorvVar)) {
            return null;
        }
        aosv aosvVar = this.G;
        d.s(aosh.a(aorvVar));
        aosc b2 = ((aosp) aosvVar.b.d(aosvVar.a.b(aorvVar))).b.b(aorvVar);
        H(b2, "Missing metadata for region code ".concat(String.valueOf(String.valueOf(aorvVar))));
        return b2;
    }

    public final aosc f(int i2, aorv aorvVar) {
        if (i.equals(aorvVar)) {
            Set set = this.F;
            Integer valueOf = Integer.valueOf(i2);
            if (!set.contains(valueOf)) {
                return null;
            }
            aosv aosvVar = this.G;
            aorv aorvVar2 = aosh.a;
            List list = (List) aorx.a.get(Integer.valueOf(i2));
            boolean z2 = false;
            if (list != null && !list.contains(aosh.a)) {
                z2 = true;
            }
            d.s(!z2);
            aosc b2 = ((aosp) aosvVar.b.d(aosvVar.a.b(valueOf))).a.b(valueOf);
            H(b2, a.bV(i2, "Missing metadata for country code "));
            return b2;
        }
        return e(aorvVar);
    }

    public final aosw h(CharSequence charSequence, aorv aorvVar) {
        aozy createBuilder = aosw.a.createBuilder();
        D(charSequence, aorvVar, false, true, createBuilder);
        return (aosw) createBuilder.s();
    }

    public final String i(aosw aoswVar) {
        int i2;
        StringBuilder sb = new StringBuilder();
        if (aoswVar.f && (i2 = aoswVar.g) > 0) {
            char[] cArr = new char[i2];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(aoswVar.d);
        return sb.toString();
    }

    public final boolean l(int i2) {
        return this.C.containsKey(Integer.valueOf(i2));
    }

    public final boolean m(aorv aorvVar) {
        return this.D.contains(aorvVar);
    }

    public final boolean n(aosw aoswVar) {
        int t2 = t(aoswVar);
        if (t2 == 1 || t2 == 2) {
            return true;
        }
        return false;
    }

    public final boolean o(aorv aorvVar) {
        if (aorvVar != null && this.E.contains(aorvVar)) {
            return true;
        }
        return false;
    }

    public final int q(aosw aoswVar, aosw aoswVar2) {
        aozy N = N(aoswVar);
        aosw aoswVar3 = (aosw) N.s();
        aosw aoswVar4 = (aosw) N(aoswVar2).s();
        if ((aoswVar3.b & 4) != 0 && (aoswVar4.b & 4) != 0 && !aoswVar3.e.equals(aoswVar4.e)) {
            return 2;
        }
        int i2 = aoswVar3.c;
        int i3 = aoswVar4.c;
        if (i2 != 0 && i3 != 0) {
            if (aoswVar3.equals(aoswVar4)) {
                return 5;
            }
            if (i2 != i3 || !M(aoswVar3, aoswVar4)) {
                return 2;
            }
            return 3;
        }
        if (!N.b.isMutable()) {
            N.u();
        }
        aosw aoswVar5 = (aosw) N.b;
        aoswVar5.b |= 1;
        aoswVar5.c = i3;
        aosw aoswVar6 = (aosw) N.s();
        if (aoswVar6.equals(aoswVar4)) {
            return 4;
        }
        if (!M(aoswVar6, aoswVar4)) {
            return 2;
        }
        return 3;
    }

    public final int r(aosw aoswVar, CharSequence charSequence) {
        try {
            return q(aoswVar, h(charSequence, aorv.ZZ));
        } catch (aosb e2) {
            if (e2.a == 1) {
                aorv b2 = b(aoswVar.c);
                try {
                    if (!b2.equals(aorv.ZZ)) {
                        int q2 = q(aoswVar, h(charSequence, b2));
                        if (q2 == 5) {
                            return 4;
                        }
                        return q2;
                    }
                    aozy createBuilder = aosw.a.createBuilder();
                    D(charSequence, null, false, false, createBuilder);
                    return q(aoswVar, (aosw) createBuilder.s());
                } catch (aosb unused) {
                    return 1;
                }
            }
            return 1;
        }
    }

    public final int s(String str, aosc aoscVar) {
        aose aoseVar = aoscVar.c;
        if (aoseVar == null) {
            aoseVar = aose.a;
        }
        if (!E(str, aoseVar)) {
            return 12;
        }
        aose aoseVar2 = aoscVar.g;
        if (aoseVar2 == null) {
            aoseVar2 = aose.a;
        }
        if (!E(str, aoseVar2)) {
            aose aoseVar3 = aoscVar.f;
            if (aoseVar3 == null) {
                aoseVar3 = aose.a;
            }
            if (!E(str, aoseVar3)) {
                aose aoseVar4 = aoscVar.h;
                if (aoseVar4 == null) {
                    aoseVar4 = aose.a;
                }
                if (!E(str, aoseVar4)) {
                    aose aoseVar5 = aoscVar.j;
                    if (aoseVar5 == null) {
                        aoseVar5 = aose.a;
                    }
                    if (!E(str, aoseVar5)) {
                        aose aoseVar6 = aoscVar.i;
                        if (aoseVar6 == null) {
                            aoseVar6 = aose.a;
                        }
                        if (!E(str, aoseVar6)) {
                            aose aoseVar7 = aoscVar.k;
                            if (aoseVar7 == null) {
                                aoseVar7 = aose.a;
                            }
                            if (!E(str, aoseVar7)) {
                                aose aoseVar8 = aoscVar.l;
                                if (aoseVar8 == null) {
                                    aoseVar8 = aose.a;
                                }
                                if (!E(str, aoseVar8)) {
                                    aose aoseVar9 = aoscVar.m;
                                    if (aoseVar9 == null) {
                                        aoseVar9 = aose.a;
                                    }
                                    if (!E(str, aoseVar9)) {
                                        aose aoseVar10 = aoscVar.d;
                                        if (aoseVar10 == null) {
                                            aoseVar10 = aose.a;
                                        }
                                        if (E(str, aoseVar10)) {
                                            if (aoscVar.u) {
                                                return 3;
                                            }
                                            aose aoseVar11 = aoscVar.e;
                                            if (aoseVar11 == null) {
                                                aoseVar11 = aose.a;
                                            }
                                            if (E(str, aoseVar11)) {
                                                return 3;
                                            }
                                            return 1;
                                        }
                                        if (!aoscVar.u) {
                                            aose aoseVar12 = aoscVar.e;
                                            if (aoseVar12 == null) {
                                                aoseVar12 = aose.a;
                                            }
                                            if (E(str, aoseVar12)) {
                                                return 2;
                                            }
                                        }
                                        return 12;
                                    }
                                    return 11;
                                }
                                return 10;
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 7;
                }
                return 6;
            }
            return 4;
        }
        return 5;
    }

    public final int t(aosw aoswVar) {
        String i2 = i(aoswVar);
        int i3 = aoswVar.c;
        if (!l(i3)) {
            return 3;
        }
        return L(i2, f(i3, b(i3)), 12);
    }

    public final String u(aosw aoswVar, int i2) {
        if (aoswVar.d == 0) {
            String str = aoswVar.h;
            if (str.length() > 0 || (aoswVar.b & 1) == 0) {
                return str;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        sb.setLength(0);
        int i3 = aoswVar.c;
        String i4 = i(aoswVar);
        if (i2 == 1) {
            sb.append(i4);
            x(i3, 1, sb);
        } else if (!l(i3)) {
            sb.append(i4);
        } else {
            aosc f2 = f(i3, b(i3));
            sb.append(v(i4, f2, i2));
            w(aoswVar, f2, i2, sb);
            x(i3, i2, sb);
        }
        return sb.toString();
    }

    public final String v(String str, aosc aoscVar, int i2) {
        apax apaxVar;
        if (!aoscVar.w.isEmpty() && i2 != 3) {
            apaxVar = aoscVar.w;
        } else {
            apaxVar = aoscVar.v;
        }
        aosa d2 = d(apaxVar, str);
        if (d2 == null) {
            return str;
        }
        return y(str, d2, i2);
    }

    public final void w(aosw aoswVar, aosc aoscVar, int i2, StringBuilder sb) {
        if ((aoswVar.b & 4) != 0 && aoswVar.e.length() > 0) {
            if (i2 != 4) {
                if ((aoscVar.b & 4194304) != 0) {
                    sb.append(aoscVar.r);
                    sb.append(aoswVar.e);
                    return;
                } else {
                    sb.append(" ext. ");
                    sb.append(aoswVar.e);
                    return;
                }
            }
            sb.append(";ext=");
            sb.append(aoswVar.e);
        }
    }

    public final void x(int i2, int i3, StringBuilder sb) {
        int i4 = i3 - 1;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 3) {
                    return;
                }
                sb.insert(0, "-").insert(0, i2).insert(0, '+').insert(0, "tel:");
                return;
            }
            sb.insert(0, " ").insert(0, i2).insert(0, '+');
            return;
        }
        sb.insert(0, i2).insert(0, '+');
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String y(java.lang.String r4, defpackage.aosa r5, int r6) {
        /*
            r3 = this;
            aojj r0 = r3.H
            java.lang.String r1 = r5.d
            java.lang.String r2 = r5.c
            java.util.regex.Pattern r0 = r0.c(r2)
            java.util.regex.Matcher r4 = r0.matcher(r4)
            java.lang.String r5 = r5.f
            r0 = 3
            if (r6 != r0) goto L29
            int r6 = r5.length()
            if (r6 <= 0) goto L28
            java.util.regex.Pattern r6 = defpackage.aosf.A
            java.util.regex.Matcher r6 = r6.matcher(r1)
            java.lang.String r5 = r6.replaceFirst(r5)
            java.lang.String r4 = r4.replaceAll(r5)
            goto L2e
        L28:
            r6 = r0
        L29:
            java.lang.String r4 = r4.replaceAll(r1)
            r0 = r6
        L2e:
            r5 = 4
            if (r0 != r5) goto L4d
            java.util.regex.Pattern r5 = defpackage.aosf.o
            java.util.regex.Matcher r5 = r5.matcher(r4)
            boolean r6 = r5.lookingAt()
            if (r6 == 0) goto L43
            java.lang.String r4 = ""
            java.lang.String r4 = r5.replaceFirst(r4)
        L43:
            java.util.regex.Matcher r4 = r5.reset(r4)
            java.lang.String r5 = "-"
            java.lang.String r4 = r4.replaceAll(r5)
        L4d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aosf.y(java.lang.String, aosa, int):java.lang.String");
    }

    final void z(StringBuilder sb, aosc aoscVar, StringBuilder sb2) {
        int length = sb.length();
        String str = aoscVar.s;
        if (length != 0 && str.length() != 0) {
            Matcher matcher = this.H.c(str).matcher(sb);
            if (matcher.lookingAt()) {
                aose aoseVar = aoscVar.c;
                if (aoseVar == null) {
                    aoseVar = aose.a;
                }
                int p2 = aotl.p(sb, aoseVar);
                int groupCount = matcher.groupCount();
                String str2 = aoscVar.t;
                if (str2.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder sb3 = new StringBuilder(sb);
                    sb3.replace(0, length, matcher.replaceFirst(str2));
                    if (p2 != 1 || aotl.p(sb3.toString(), aoseVar) == 1) {
                        if (sb2 != null && groupCount > 1) {
                            sb2.append(matcher.group(1));
                        }
                        sb.replace(0, sb.length(), sb3.toString());
                        return;
                    }
                    return;
                }
                if (p2 != 1 || aotl.p(sb.substring(matcher.end()), aoseVar) == 1) {
                    if (sb2 != null && groupCount > 0 && matcher.group(groupCount) != null) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                }
            }
        }
    }
}
