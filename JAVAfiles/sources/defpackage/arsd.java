package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import com.android.vcard.VCardBuilder;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arsd {
    public static boolean A(String str, String str2, int i, boolean z) {
        str.getClass();
        if (!z) {
            return str.startsWith(str2, i);
        }
        return y(str, i, str2, 0, str2.length(), true);
    }

    public static int B(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static CharSequence C(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
        throw new IndexOutOfBoundsException(a.cl(i, i2, "End index (", ") is less than start index (", ")."));
    }

    public static CharSequence D(CharSequence charSequence) {
        int i;
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (true != z) {
                i = i2;
            } else {
                i = length;
            }
            boolean g = arro.g(charSequence.charAt(i));
            if (!z) {
                if (!g) {
                    z = true;
                } else {
                    i2++;
                }
            } else {
                if (!g) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static CharSequence E(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!arro.g(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    public static CharSequence F(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!arro.g(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static String G(String str, CharSequence charSequence) {
        if (z(str, (String) charSequence, false)) {
            String substring = str.substring(charSequence.length());
            substring.getClass();
            return substring;
        }
        return str;
    }

    public static String H(CharSequence charSequence, artb artbVar) {
        artbVar.getClass();
        return charSequence.subSequence(artbVar.d().intValue(), artbVar.c().intValue() + 1).toString();
    }

    public static String I(String str, char c, String str2) {
        int S = S(str, c, 0, 6);
        if (S == -1) {
            return str2;
        }
        String substring = str.substring(S + 1, str.length());
        substring.getClass();
        return substring;
    }

    public static String J(String str, String str2, String str3) {
        int T = T(str, str2, 0, 6);
        if (T == -1) {
            return str3;
        }
        String substring = str.substring(T + str2.length(), str.length());
        substring.getClass();
        return substring;
    }

    public static List K(CharSequence charSequence) {
        return arrn.g(L(charSequence));
    }

    public static artx L(CharSequence charSequence) {
        return arrn.i(W(charSequence, new String[]{VCardBuilder.VCARD_END_OF_LINE, "\n", "\r"}, 0), new arnd(charSequence, 5));
    }

    public static boolean M(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!arro.g(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean N(CharSequence charSequence, char c) {
        charSequence.getClass();
        if (S(charSequence, c, 0, 2) < 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean O(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        if (T(charSequence, (String) charSequence2, 0, 2) < 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean P(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence instanceof String) {
            return ((String) charSequence).endsWith((String) charSequence2);
        }
        return X(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length());
    }

    public static int R(CharSequence charSequence, String str, int i) {
        charSequence.getClass();
        str.getClass();
        if (!(charSequence instanceof String)) {
            artb artbVar = new artb(arrn.r(i, 0), arrn.s(charSequence.length(), charSequence.length()));
            int i2 = artbVar.a;
            int i3 = artbVar.b;
            int i4 = artbVar.c;
            if ((i4 <= 0 || i2 > i3) && (i4 >= 0 || i3 > i2)) {
                return -1;
            }
            while (!X(str, 0, charSequence, i2, str.length())) {
                if (i2 == i3) {
                    return -1;
                }
                i2 += i4;
            }
            return i2;
        }
        return ((String) charSequence).indexOf(str, i);
    }

    public static /* synthetic */ int S(CharSequence charSequence, char c, int i, int i2) {
        charSequence.getClass();
        boolean z = charSequence instanceof String;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if (!z) {
            char[] cArr = {c};
            arob it = new artb(arrn.r(i, 0), B(charSequence)).iterator();
            while (it.a) {
                int a = it.a();
                if (arro.k(cArr[0], charSequence.charAt(a))) {
                    return a;
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int T(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return R(charSequence, str, i);
    }

    public static /* synthetic */ int U(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = B(charSequence);
        }
        return ((String) charSequence).lastIndexOf(c, i);
    }

    public static String V(String str, int i) {
        CharSequence charSequence;
        str.getClass();
        if (i <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            arob it = new artb(1, i - str.length()).iterator();
            while (it.a) {
                it.a();
                sb.append('0');
            }
            sb.append((CharSequence) str);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    static /* synthetic */ artx W(CharSequence charSequence, String[] strArr, int i) {
        return new arun(charSequence, i, new ahhd(aqil.c(strArr), 3));
    }

    public static boolean X(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        charSequence.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!arro.k(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String Y(String str, char c, char c2) {
        str.getClass();
        String replace = str.replace(c, c2);
        replace.getClass();
        return replace;
    }

    public static /* synthetic */ String Z(String str, String str2, String str3) {
        str.getClass();
        int i = 0;
        int R = R(str, str2, 0);
        if (R >= 0) {
            int length = str2.length();
            int length2 = (str.length() - length) + str3.length();
            if (length2 >= 0) {
                StringBuilder sb = new StringBuilder(length2);
                do {
                    sb.append((CharSequence) str, i, R);
                    sb.append(str3);
                    i = R + length;
                    if (R >= str.length()) {
                        break;
                    }
                    R = R(str, str2, R + arrn.r(length, 1));
                } while (R > 0);
                sb.append((CharSequence) str, i, str.length());
                return sb.toString();
            }
            throw new OutOfMemoryError();
        }
        return str;
    }

    public static ClassCastException a(ClassCastException classCastException) {
        arro.d(classCastException, arsd.class.getName());
        throw classCastException;
    }

    private static List aA(CharSequence charSequence, String str, int i) {
        int i2 = 0;
        int R = R(charSequence, str, 0);
        if (R != -1) {
            boolean z = true;
            if (i != 1) {
                if (i <= 0) {
                    z = false;
                }
                int i3 = 10;
                if (z) {
                    i3 = arrn.s(i, 10);
                }
                ArrayList arrayList = new ArrayList(i3);
                do {
                    arrayList.add(charSequence.subSequence(i2, R).toString());
                    i2 = str.length() + R;
                    if (z && arrayList.size() == i - 1) {
                        break;
                    }
                    R = R(charSequence, str, i2);
                } while (R != -1);
                arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
                return arrayList;
            }
        }
        return aqjn.y(charSequence.toString());
    }

    public static /* synthetic */ List aa(CharSequence charSequence, char[] cArr) {
        charSequence.getClass();
        return aA(charSequence, String.valueOf(cArr[0]), 0);
    }

    public static /* synthetic */ List ab(CharSequence charSequence, String[] strArr, int i, int i2) {
        charSequence.getClass();
        String str = strArr[0];
        int length = str.length();
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if (length == 0) {
            arud arudVar = new arud(W(charSequence, strArr, i), 0);
            ArrayList arrayList = new ArrayList(aqjn.J(arudVar, 10));
            Iterator it = arudVar.iterator();
            while (it.hasNext()) {
                arrayList.add(H(charSequence, (artb) it.next()));
            }
            return arrayList;
        }
        return aA(charSequence, str, i);
    }

    public static /* synthetic */ boolean ac(String str, String str2, int i) {
        return A(str, str2, i, false);
    }

    public static /* synthetic */ boolean ad(String str, String str2) {
        return z(str, str2, false);
    }

    public static /* synthetic */ String ae(String str) {
        str.getClass();
        str.getClass();
        int U = U(str, '.', 0, 6);
        if (U == -1) {
            return str;
        }
        String substring = str.substring(U + 1, str.length());
        substring.getClass();
        return substring;
    }

    public static /* synthetic */ String af(String str) {
        int ai = ai(str, "(");
        if (ai == -1) {
            return str;
        }
        String substring = str.substring(0, ai);
        substring.getClass();
        return substring;
    }

    public static char ag(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(B(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String ah(String str, int i) {
        str.getClass();
        String substring = str.substring(0, arrn.s(i, str.length()));
        substring.getClass();
        return substring;
    }

    public static /* synthetic */ int ai(CharSequence charSequence, String str) {
        int B = B(charSequence);
        charSequence.getClass();
        return ((String) charSequence).lastIndexOf(str, B);
    }

    public static final arwb an(Executor executor) {
        arwr arwrVar;
        if (executor instanceof arwr) {
            arwrVar = (arwr) executor;
        } else {
            arwrVar = null;
        }
        if (arwrVar != null) {
            return arwrVar.a;
        }
        return new arxf(executor);
    }

    public static final CancellationException ao(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static void ap(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    public static boolean aq(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            return false;
        }
        return true;
    }

    public static int ar(int i) {
        switch (i) {
            case -1:
                return 1;
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
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            case 14:
                return 16;
            case 15:
                return 17;
            case 16:
                return 18;
            case 17:
                return 19;
            default:
                return 0;
        }
    }

    public static int as(int i) {
        if (i != 99) {
            switch (i) {
                case 0:
                    return 1;
                case 1:
                    return 2;
                case 2:
                    return 3;
                case 3:
                    return 4;
                case 4:
                    return 5;
                case 5:
                    return 6;
                case 6:
                    return 7;
                case 7:
                    return 8;
                case 8:
                    return 9;
                case 9:
                    return 10;
                case 10:
                    return 11;
                case 11:
                    return 12;
                case 12:
                    return 13;
                case 13:
                    return 14;
                case 14:
                    return 15;
                default:
                    return 0;
            }
        }
        return 100;
    }

    public static int at(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static final Object au(acir acirVar, arpe arpeVar) {
        return av(acirVar, null, arpeVar);
    }

    public static final Object av(acir acirVar, acit acitVar, arpe arpeVar) {
        if (acirVar.k()) {
            Exception g = acirVar.g();
            if (g == null) {
                if (!((aciv) acirVar).c) {
                    return acirVar.h();
                }
                throw new CancellationException(a.cc(acirVar, "Task ", " was cancelled normally."));
            }
            throw g;
        }
        arvp arvpVar = new arvp(arhi.i(arpeVar), 1);
        arvpVar.A();
        acirVar.n(hym.a, new uyb((arvo) arvpVar, 15));
        if (acitVar != null) {
            arvpVar.d(new arnd(acitVar, 15));
        }
        Object l = arvpVar.l();
        if (l == arpl.a) {
            arpeVar.getClass();
        }
        return l;
    }

    public static final void aw(asgj asgjVar, long j, arqr arqrVar) {
        asgf asgfVar = new asgf(j);
        asge asgeVar = asge.a;
        g(asgeVar, 3);
        asgjVar.f(new asgg(asgfVar, asgeVar, asgk.a, asgk.f, arqrVar), false);
    }

    public static final void ax(asgj asgjVar, long j, arqr arqrVar) {
        aw(asgjVar, arwi.k(j), arqrVar);
    }

    public static final Object ay(asfk asfkVar, Object obj, arqv arqvVar) {
        Object arvxVar;
        try {
            if (!(arqvVar instanceof arpq)) {
                arvxVar = arhi.g(arqvVar, obj, asfkVar);
            } else {
                g(arqvVar, 2);
                arvxVar = arqvVar.a(obj, asfkVar);
            }
        } catch (Throwable th) {
            arvxVar = new arvx(th);
        }
        arpl arplVar = arpl.a;
        if (arvxVar != arplVar) {
            Object H = asfkVar.H(arvxVar);
            if (H == arxx.b) {
                return arpl.a;
            }
            if (H instanceof arvx) {
                Throwable th2 = ((arvx) H).b;
                arpe arpeVar = asfkVar.e;
                if (arwh.b && (arpeVar instanceof arpt)) {
                    throw asfm.a(th2, (arpt) arpeVar);
                }
                throw th2;
            }
            return arxx.b(H);
        }
        return arplVar;
    }

    private static arqr az() {
        if ("".length() == 0) {
            return arua.d;
        }
        return new arnd(3);
    }

    public static List b(Object obj) {
        if ((obj instanceof arse) && !(obj instanceof arsh)) {
            c(obj, "kotlin.collections.MutableList");
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw a(e);
        }
    }

    public static void c(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        throw a(new ClassCastException(a.co(str, name, " cannot be cast to ")));
    }

    public static boolean d(Object obj, int i) {
        int i2;
        if (obj instanceof armh) {
            if (obj instanceof arrl) {
                i2 = ((arrl) obj).dO();
            } else if (obj instanceof arqg) {
                i2 = 0;
            } else if (obj instanceof arqr) {
                i2 = 1;
            } else if (obj instanceof arqv) {
                i2 = 2;
            } else if (obj instanceof arqw) {
                i2 = 3;
            } else if (obj instanceof arqx) {
                i2 = 4;
            } else if (obj instanceof arqy) {
                i2 = 5;
            } else if (obj instanceof arqz) {
                i2 = 6;
            } else if (obj instanceof arra) {
                i2 = 7;
            } else if (obj instanceof arrb) {
                i2 = 8;
            } else if (obj instanceof arrc) {
                i2 = 9;
            } else if (obj instanceof arqh) {
                i2 = 10;
            } else if (obj instanceof arqi) {
                i2 = 11;
            } else if (obj instanceof arqj) {
                i2 = 12;
            } else if (obj instanceof arqk) {
                i2 = 13;
            } else if (obj instanceof arql) {
                i2 = 14;
            } else if (obj instanceof arqm) {
                i2 = 15;
            } else if (obj instanceof arqn) {
                i2 = 16;
            } else if (obj instanceof arqo) {
                i2 = 17;
            } else if (obj instanceof arqp) {
                i2 = 18;
            } else if (obj instanceof arqq) {
                i2 = 19;
            } else if (obj instanceof arqs) {
                i2 = 20;
            } else if (obj instanceof arqt) {
                i2 = 21;
            } else if (obj instanceof arqu) {
                i2 = 22;
            } else {
                i2 = -1;
            }
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        if ((obj instanceof arse) && !(obj instanceof arsh)) {
            return false;
        }
        return true;
    }

    public static boolean f(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        if ((obj instanceof arse) && !(obj instanceof arsj)) {
            return false;
        }
        return true;
    }

    public static void g(Object obj, int i) {
        if (obj != null && !d(obj, i)) {
            c(obj, a.bV(i, "kotlin.jvm.functions.Function"));
        }
    }

    public static void h(Object obj) {
        if ((obj instanceof arse) && !(obj instanceof arsf)) {
            c(obj, "kotlin.collections.MutableCollection");
        }
    }

    public static void i(Object obj) {
        if ((obj instanceof arse) && !(obj instanceof arsi)) {
            c(obj, "kotlin.collections.MutableMap");
        }
    }

    public static final Object j(Optional optional, Object obj) {
        optional.getClass();
        if (optional.isPresent()) {
            return optional.get();
        }
        return obj;
    }

    public static final Object k(Optional optional) {
        optional.getClass();
        return optional.orElse(null);
    }

    public static final long l(long j) {
        long j2 = arut.a;
        int i = aruu.a;
        return j + j + 1;
    }

    public static final long m(long j) {
        return j * 1000000;
    }

    public static final long n(long j) {
        return j / 1000000;
    }

    public static final long o(int i, aruv aruvVar) {
        aruvVar.getClass();
        long j = i;
        if (aruvVar.compareTo(aruv.d) <= 0) {
            long o = arrj.o(j, aruvVar, aruv.a);
            long j2 = arut.a;
            int i2 = aruu.a;
            return o + o;
        }
        return p(j, aruvVar);
    }

    public static final long p(long j, aruv aruvVar) {
        aruvVar.getClass();
        long o = arrj.o(4611686018426999999L, aruv.a, aruvVar);
        if (new artd(-o, o).b(j)) {
            long o2 = arrj.o(j, aruvVar, aruv.a);
            long j2 = arut.a;
            int i = aruu.a;
            return o2 + o2;
        }
        return l(arrn.x(arrj.n(j, aruvVar, aruv.c), -4611686018427387903L, 4611686018427387903L));
    }

    public static String q(String str) {
        int i;
        Comparable comparable;
        int i2;
        List K = K(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : K) {
            if (!M((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(aqjn.J(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i < length) {
                    if (!arro.g(str2.charAt(i))) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                i = str2.length();
            }
            arrayList2.add(Integer.valueOf(i));
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        int length2 = str.length();
        K.size();
        arqr az = az();
        int z = aqjn.z(K);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : K) {
            int i3 = i + 1;
            if (i < 0) {
                aqjn.G();
            }
            String str3 = (String) obj2;
            if ((i == 0 || i == z) && M(str3)) {
                str3 = null;
            } else {
                str3.getClass();
                if (i2 >= 0) {
                    String substring = str3.substring(arrn.s(i2, str3.length()));
                    substring.getClass();
                    String str4 = (String) az.a(substring);
                    if (str4 != null) {
                        str3 = str4;
                    }
                } else {
                    throw new IllegalArgumentException(a.cb(i2, "Requested character count ", " is less than zero."));
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i = i3;
        }
        StringBuilder sb = new StringBuilder(length2);
        aqjn.aN(arrayList3, sb, null, 124);
        return sb.toString();
    }

    public static /* synthetic */ String s(String str) {
        if (!M("|")) {
            List K = K(str);
            K.size();
            arqr az = az();
            int z = aqjn.z(K);
            ArrayList arrayList = new ArrayList();
            Iterator it = K.iterator();
            int i = 0;
            while (true) {
                String str2 = null;
                if (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        aqjn.G();
                    }
                    String str3 = (String) next;
                    if ((i != 0 && i != z) || !M(str3)) {
                        int length = str3.length();
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                if (!arro.g(str3.charAt(i3))) {
                                    break;
                                }
                                i3++;
                            } else {
                                i3 = -1;
                                break;
                            }
                        }
                        if (i3 != -1 && A(str3, "|", i3, false)) {
                            str3.getClass();
                            str2 = str3.substring(i3 + 1);
                            str2.getClass();
                        }
                        if (str2 == null || (str2 = (String) az.a(str2)) == null) {
                            str2 = str3;
                        }
                    }
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                    i = i2;
                } else {
                    StringBuilder sb = new StringBuilder(str.length());
                    aqjn.aN(arrayList, sb, null, 124);
                    return sb.toString();
                }
            }
        } else {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
    }

    public static void t(StringBuilder sb, String... strArr) {
        for (int i = 0; i < 2; i++) {
            sb.append(strArr[i]);
        }
    }

    public static Integer u(String str) {
        boolean z;
        int i;
        str.getClass();
        arro.i(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        int i3 = -2147483647;
        if (arro.a(charAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i3 = Integer.MIN_VALUE;
                z = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z = false;
            }
        } else {
            z = false;
            i = 0;
        }
        int i4 = -59652323;
        while (i < length) {
            int j = arro.j(str.charAt(i));
            if (j < 0) {
                return null;
            }
            if (i2 < i4) {
                if (i4 != -59652323) {
                    return null;
                }
                i4 = -214748364;
                if (i2 < -214748364) {
                    return null;
                }
            }
            int i5 = i2 * 10;
            if (i5 < i3 + j) {
                return null;
            }
            i2 = i5 - j;
            i++;
        }
        if (z) {
            return Integer.valueOf(i2);
        }
        return Integer.valueOf(-i2);
    }

    public static Long v(String str) {
        int i;
        str.getClass();
        arro.i(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        boolean z = false;
        char charAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (arro.a(charAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j = Long.MIN_VALUE;
                z = true;
            } else if (charAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int j4 = arro.j(str.charAt(i));
            if (j4 < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = -922337203685477580L;
                if (j2 < -922337203685477580L) {
                    return null;
                }
            }
            long j5 = j2 * 10;
            long j6 = j4;
            if (j5 < j + j6) {
                return null;
            }
            j2 = j5 - j6;
            i++;
        }
        if (z) {
            return Long.valueOf(j2);
        }
        return Long.valueOf(-j2);
    }

    public static String w(CharSequence charSequence, int i) {
        if (i >= 0) {
            if (i == 0) {
                return "";
            }
            if (i != 1) {
                int length = charSequence.length();
                if (length == 0) {
                    charSequence = "";
                } else if (length != 1) {
                    StringBuilder sb = new StringBuilder(charSequence.length() * i);
                    arob it = new artb(1, i).iterator();
                    while (it.a) {
                        it.a();
                        sb.append(charSequence);
                    }
                    charSequence = sb.toString();
                } else {
                    char charAt = charSequence.charAt(0);
                    char[] cArr = new char[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        cArr[i2] = charAt;
                    }
                    charSequence = new String(cArr);
                }
            }
            return (String) charSequence;
        }
        throw new IllegalArgumentException(a.cb(i, "Count 'n' must be non-negative, but was ", "."));
    }

    public static boolean x(String str, String str2, boolean z) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static boolean y(String str, int i, String str2, int i2, int i3, boolean z) {
        str.getClass();
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(true, i, str2, i2, i3);
    }

    public static boolean z(String str, String str2, boolean z) {
        str.getClass();
        if (!z) {
            return str.startsWith(str2);
        }
        return y(str, 0, str2, 0, str2.length(), true);
    }
}
