package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahwa {
    public static final Logger a = Logger.getLogger(ahwa.class.getName());
    public static final Pattern b;
    public static final Pattern c;
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f;
    public static final Pattern g;
    public static final Pattern h;
    private static final Map m;
    private static final Map n;
    private static final String o;
    private static final Pattern p;
    private static final Pattern q;
    private static final String r;
    private static final String s;
    private static final String t;
    private static final String u;
    private static final String v;
    private static final String w;
    private static final Pattern x;
    private static ahwa y;
    public final Map i;
    public final agrk l;
    private final ahmn A = new ahmn();
    private final Set z = new HashSet(35);
    private final adxs B = new adxs();
    public final Set j = new HashSet(320);
    public final Set k = new HashSet();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(54, "9");
        DesugarCollections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        DesugarCollections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        DesugarCollections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(52);
        hashSet3.add(54);
        hashSet3.add(55);
        hashSet3.add(62);
        hashSet3.addAll(hashSet);
        DesugarCollections.unmodifiableSet(hashSet3);
        HashMap hashMap2 = new HashMap();
        hashMap2.put('0', '0');
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        HashMap hashMap3 = new HashMap(40);
        hashMap3.put('A', '2');
        hashMap3.put('B', '2');
        hashMap3.put('C', '2');
        hashMap3.put('D', '3');
        hashMap3.put('E', '3');
        hashMap3.put('F', '3');
        hashMap3.put('G', '4');
        hashMap3.put('H', '4');
        hashMap3.put('I', '4');
        hashMap3.put('J', '5');
        hashMap3.put('K', '5');
        hashMap3.put('L', '5');
        hashMap3.put('M', '6');
        hashMap3.put('N', '6');
        hashMap3.put('O', '6');
        hashMap3.put('P', '7');
        hashMap3.put('Q', '7');
        hashMap3.put('R', '7');
        hashMap3.put('S', '7');
        hashMap3.put('T', '8');
        hashMap3.put('U', '8');
        hashMap3.put('V', '8');
        hashMap3.put('W', '9');
        hashMap3.put('X', '9');
        hashMap3.put('Y', '9');
        hashMap3.put('Z', '9');
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap3);
        m = unmodifiableMap;
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(unmodifiableMap);
        hashMap4.putAll(hashMap2);
        n = DesugarCollections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        DesugarCollections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        for (Character ch : unmodifiableMap.keySet()) {
            hashMap6.put(Character.valueOf(Character.toLowerCase(ch.charValue())), ch);
            hashMap6.put(ch, ch);
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put('-', '-');
        hashMap6.put((char) 65293, '-');
        hashMap6.put((char) 8208, '-');
        hashMap6.put((char) 8209, '-');
        hashMap6.put((char) 8210, '-');
        hashMap6.put((char) 8211, '-');
        hashMap6.put((char) 8212, '-');
        hashMap6.put((char) 8213, '-');
        hashMap6.put((char) 8722, '-');
        hashMap6.put('/', '/');
        hashMap6.put((char) 65295, '/');
        hashMap6.put(' ', ' ');
        hashMap6.put((char) 12288, ' ');
        hashMap6.put((char) 8288, ' ');
        hashMap6.put('.', '.');
        hashMap6.put((char) 65294, '.');
        DesugarCollections.unmodifiableMap(hashMap6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        Map map = m;
        String concat = String.valueOf(Arrays.toString(map.keySet().toArray()).replaceAll("[, \\[\\]]", "")).concat(String.valueOf(Arrays.toString(map.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", "")));
        o = concat;
        b = Pattern.compile("[+＋]+");
        Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        p = Pattern.compile("(\\p{Nd})");
        c = Pattern.compile("[+＋\\p{Nd}]");
        d = Pattern.compile("[\\\\/] *x");
        e = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        q = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String str = "\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*" + concat + "\\p{Nd}]*";
        r = str;
        String m2 = m(true);
        s = m2;
        m(false);
        f = Pattern.compile("^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$");
        String concat2 = String.valueOf(concat).concat("\\p{Nd}");
        t = concat2;
        String str2 = "[" + concat2 + "]+((\\-)*[" + concat2 + "])*";
        u = str2;
        String str3 = "[" + concat + "]+((\\-)*[" + concat2 + "])*";
        v = str3;
        String str4 = "^(" + str2 + "\\.)*" + str3 + "\\.?$";
        w = str4;
        g = Pattern.compile(str4);
        h = Pattern.compile("(?:" + m2 + ")$", 66);
        x = Pattern.compile(str + "(?:" + m2 + ")?", 66);
        Pattern.compile("(\\D+)");
        Pattern.compile("(\\$\\d)");
        Pattern.compile("\\(?\\$1\\)?");
        y = null;
    }

    public ahwa(agrk agrkVar, Map map) {
        this.l = agrkVar;
        this.i = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.k.add(entry.getKey());
            } else {
                this.j.addAll(list);
            }
        }
        if (this.j.remove("001")) {
            a.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.z.addAll((Collection) map.get(1));
    }

    public static synchronized ahwa a() {
        ahwa ahwaVar;
        synchronized (ahwa.class) {
            if (y == null) {
                ahwh ahwhVar = ahwh.a;
                ahvx ahvxVar = ahwhVar.c;
                ahwq ahwqVar = ahwhVar.d;
                ahwj ahwjVar = ahwh.a.b;
                e(new ahwa(new agrk(ahwqVar), ahmc.B()));
            }
            ahwaVar = y;
        }
        return ahwaVar;
    }

    public static String c(CharSequence charSequence) {
        return aetn.bb(charSequence).toString();
    }

    public static void d(ahwc ahwcVar, String str) {
        if (ahwcVar != null) {
        } else {
            throw new ahvy(str);
        }
    }

    static synchronized void e(ahwa ahwaVar) {
        synchronized (ahwa.class) {
            y = ahwaVar;
        }
    }

    public static boolean g(CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return false;
        }
        return x.matcher(charSequence).matches();
    }

    static final ahwe i(ahwc ahwcVar, int i) {
        switch (i - 1) {
            case 0:
            case 2:
                return ahwcVar.b;
            case 1:
                return ahwcVar.c;
            case 3:
                return ahwcVar.d;
            case 4:
                return ahwcVar.e;
            case 5:
                return ahwcVar.f;
            case 6:
                return ahwcVar.h;
            case 7:
                return ahwcVar.g;
            case 8:
                return ahwcVar.i;
            case 9:
                return ahwcVar.j;
            case 10:
                return ahwcVar.k;
            default:
                return ahwcVar.a;
        }
    }

    public static void l(StringBuilder sb) {
        if (q.matcher(sb).matches()) {
            int length = sb.length();
            Map map = n;
            StringBuilder sb2 = new StringBuilder(sb.length());
            for (int i = 0; i < sb.length(); i++) {
                Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(sb.charAt(i))));
                if (ch != null) {
                    sb2.append(ch);
                }
            }
            sb.replace(0, length, sb2.toString());
            return;
        }
        sb.replace(0, sb.length(), c(sb));
    }

    private static String m(boolean z) {
        String n2 = n(20);
        String str = ";ext=".concat(n2) + "|" + ("[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + n(20) + "#?") + "|" + ("[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + n(9) + "#?") + "|" + ("[- ]+" + n(6) + "#");
        if (z) {
            return str + "|" + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + n(15) + "#?") + "|" + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + n(9) + "#?");
        }
        return str;
    }

    private static String n(int i) {
        return a.cb(i, "(\\p{Nd}{1,", "})");
    }

    private static boolean o(ahwe ahweVar) {
        if (ahweVar.a() != 1 || ((Integer) ahweVar.b.get(0)).intValue() != -1) {
            return true;
        }
        return false;
    }

    private final int p(CharSequence charSequence, ahwc ahwcVar, int i) {
        List list;
        List list2;
        ahwe i2 = i(ahwcVar, i);
        if (i2.b.isEmpty()) {
            list = ahwcVar.a.b;
        } else {
            list = i2.b;
        }
        List list3 = i2.c;
        if (i == 3) {
            if (!o(i(ahwcVar, 1))) {
                return p(charSequence, ahwcVar, 2);
            }
            ahwe i3 = i(ahwcVar, 2);
            if (o(i3)) {
                ArrayList arrayList = new ArrayList(list);
                if (i3.a() == 0) {
                    list2 = ahwcVar.a.b;
                } else {
                    list2 = i3.b;
                }
                arrayList.addAll(list2);
                Collections.sort(arrayList);
                if (list3.isEmpty()) {
                    list3 = i3.c;
                } else {
                    ArrayList arrayList2 = new ArrayList(list3);
                    arrayList2.addAll(i3.c);
                    Collections.sort(arrayList2);
                    list3 = arrayList2;
                }
                list = arrayList;
            }
        }
        if (((Integer) list.get(0)).intValue() == -1) {
            return 5;
        }
        int length = charSequence.length();
        Integer valueOf = Integer.valueOf(length);
        if (list3.contains(valueOf)) {
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

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ahwq] */
    public final ahwc b(String str) {
        if (!f(str)) {
            return null;
        }
        agrk agrkVar = this.l;
        if (ahmc.A(str)) {
            ahwc b2 = ((ahwk) ((agrk) agrkVar.a).n(agrkVar.b.a(str))).b.b(str);
            d(b2, "Missing metadata for region code ".concat(String.valueOf(str)));
            return b2;
        }
        throw new IllegalArgumentException(String.valueOf(str).concat(" region code is a non-geo entity"));
    }

    public final boolean f(String str) {
        if (str != null && this.j.contains(str)) {
            return true;
        }
        return false;
    }

    public final int h(CharSequence charSequence, ahwc ahwcVar) {
        return p(charSequence, ahwcVar, 12);
    }

    public final int j(CharSequence charSequence, ahwc ahwcVar, StringBuilder sb, ahwf ahwfVar) {
        String str;
        int i = 0;
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        if (ahwcVar != null) {
            str = ahwcVar.n;
        } else {
            str = "NonMatch";
        }
        if (sb2.length() != 0) {
            Matcher matcher = b.matcher(sb2);
            if (matcher.lookingAt()) {
                sb2.delete(0, matcher.end());
                l(sb2);
            } else {
                Pattern f2 = this.B.f(str);
                l(sb2);
                Matcher matcher2 = f2.matcher(sb2);
                if (matcher2.lookingAt()) {
                    int end = matcher2.end();
                    Matcher matcher3 = p.matcher(sb2.substring(end));
                    if (!matcher3.find() || !c(matcher3.group(1)).equals("0")) {
                        sb2.delete(0, end);
                    }
                }
            }
            if (sb2.length() > 2) {
                if (sb2.length() != 0 && sb2.charAt(0) != '0') {
                    int length = sb2.length();
                    int i2 = 1;
                    while (true) {
                        if (i2 > 3 || i2 > length) {
                            break;
                        }
                        int parseInt = Integer.parseInt(sb2.substring(0, i2));
                        if (this.i.containsKey(Integer.valueOf(parseInt))) {
                            sb.append(sb2.substring(i2));
                            i = parseInt;
                            break;
                        }
                        i2++;
                    }
                }
                if (i != 0) {
                    ahwfVar.a(i);
                    return i;
                }
                throw new ahvz(1, "Country calling code supplied was not recognised.");
            }
            throw new ahvz(3, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
        }
        if (ahwcVar != null) {
            int i3 = ahwcVar.m;
            String valueOf = String.valueOf(i3);
            String sb3 = sb2.toString();
            if (sb3.startsWith(valueOf)) {
                StringBuilder sb4 = new StringBuilder(sb3.substring(valueOf.length()));
                ahwe ahweVar = ahwcVar.a;
                k(sb4, ahwcVar, null);
                if ((!this.A.b(sb2, ahweVar) && this.A.b(sb4, ahweVar)) || h(sb2, ahwcVar) == 6) {
                    sb.append((CharSequence) sb4);
                    ahwfVar.a(i3);
                    return i3;
                }
            }
        }
        ahwfVar.a(0);
        return 0;
    }

    public final void k(StringBuilder sb, ahwc ahwcVar, StringBuilder sb2) {
        int length = sb.length();
        String str = ahwcVar.q;
        if (length != 0 && str.length() != 0) {
            Matcher matcher = this.B.f(str).matcher(sb);
            if (matcher.lookingAt()) {
                ahwe ahweVar = ahwcVar.a;
                boolean b2 = this.A.b(sb, ahweVar);
                int groupCount = matcher.groupCount();
                String str2 = ahwcVar.r;
                if (str2 != null && str2.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder sb3 = new StringBuilder(sb);
                    sb3.replace(0, length, matcher.replaceFirst(str2));
                    if (!b2 || this.A.b(sb3.toString(), ahweVar)) {
                        if (sb2 != null && groupCount > 1) {
                            sb2.append(matcher.group(1));
                        }
                        sb.replace(0, sb.length(), sb3.toString());
                        return;
                    }
                    return;
                }
                if (!b2 || this.A.b(sb.substring(matcher.end()), ahweVar)) {
                    if (sb2 != null && groupCount > 0 && matcher.group(groupCount) != null) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                }
            }
        }
    }
}
