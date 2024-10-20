package defpackage;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class albo {
    public albo() {
    }

    public static void A(boolean z, String str, Object... objArr) {
        if (z) {
        } else {
            throw new alia(F(str, objArr));
        }
    }

    public static void B(boolean z, int i, int i2) {
        if (z) {
        } else {
            throw new alia(F("Require minMessagesToUpdatePerBatch <= maxMessagesToUpdatePerBatch, but found %s > %s.", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void C(Object obj) {
        Object[] objArr = new Object[0];
        if (obj != null) {
        } else {
            throw new alia(F("expected a non-null reference", objArr));
        }
    }

    public static alhr D(alhr alhrVar) {
        if (!(alhrVar instanceof alhu) && !(alhrVar instanceof alht)) {
            if (alhrVar instanceof Serializable) {
                return new alht(alhrVar);
            }
            return new alhu(alhrVar);
        }
        return alhrVar;
    }

    public static alhr E(alhr alhrVar, Duration duration) {
        boolean z = false;
        if (!duration.isNegative() && !duration.isZero()) {
            z = true;
        }
        N(z, "duration (%s) must be > 0", duration);
        return new alhs(alhrVar, al(duration));
    }

    public static String F(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        String valueOf = String.valueOf(str);
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e) {
                    String str3 = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str3), (Throwable) e);
                    str2 = "<" + str3 + " threw " + e.getClass().getName() + ">";
                }
            }
            objArr[i2] = str2;
            i2++;
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = valueOf.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) valueOf, i3, indexOf);
            sb.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) valueOf, i3, valueOf.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String G(String str, int i) {
        boolean z = false;
        if (i <= 1) {
            if (i >= 0) {
                z = true;
            }
            L(z, "invalid count: %s", i);
            if (i == 0) {
                return "";
            }
            return str;
        }
        int length = str.length();
        long j = length * i;
        int i2 = (int) j;
        if (i2 == j) {
            char[] cArr = new char[i2];
            str.getChars(0, length, cArr, 0);
            while (true) {
                int i3 = i2 - length;
                if (length < i3) {
                    System.arraycopy(cArr, 0, cArr, length, length);
                    length += length;
                } else {
                    System.arraycopy(cArr, 0, cArr, length, i3);
                    return new String(cArr);
                }
            }
        } else {
            throw new ArrayIndexOutOfBoundsException(a.ck(j, "Required array size too large: "));
        }
    }

    public static void H(int i, Set set) {
        set.add(Integer.valueOf(i));
    }

    public static void I(int i, int i2, Set set) {
        while (i <= i2) {
            set.add(Integer.valueOf(i));
            i++;
        }
    }

    public static algy J(algy algyVar, algy algyVar2) {
        algyVar.getClass();
        return new algz(Arrays.asList(algyVar, algyVar2));
    }

    public static void K(boolean z, String str, char c) {
        if (z) {
        } else {
            throw new IllegalArgumentException(F(str, Character.valueOf(c)));
        }
    }

    public static void L(boolean z, String str, int i) {
        if (z) {
        } else {
            throw new IllegalArgumentException(F(str, Integer.valueOf(i)));
        }
    }

    public static void M(boolean z, String str, long j) {
        if (z) {
        } else {
            throw new IllegalArgumentException(F(str, Long.valueOf(j)));
        }
    }

    public static void N(boolean z, String str, Object obj) {
        if (z) {
        } else {
            throw new IllegalArgumentException(F(str, obj));
        }
    }

    public static void O(boolean z, String str, int i, int i2) {
        if (z) {
        } else {
            throw new IllegalArgumentException(F(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void P(boolean z, String str, Object obj, int i) {
        if (z) {
        } else {
            throw new IllegalArgumentException(F(str, obj, Integer.valueOf(i)));
        }
    }

    public static void Q(boolean z, String str, Object obj, Object obj2) {
        if (z) {
        } else {
            throw new IllegalArgumentException(F(str, obj, obj2));
        }
    }

    public static void R(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (z) {
        } else {
            throw new IllegalArgumentException(F(str, obj, obj2, obj3));
        }
    }

    public static void S(int i, int i2, int i3) {
        String da;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                da = F("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                da = da(i2, i3, "end index");
            }
        } else {
            da = da(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(da);
    }

    public static void T(boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void U(boolean z, Object obj) {
        if (z) {
        } else {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void V(boolean z, String str, int i) {
        if (z) {
        } else {
            throw new IllegalStateException(F(str, Integer.valueOf(i)));
        }
    }

    public static void W(boolean z, String str, long j) {
        if (z) {
        } else {
            throw new IllegalStateException(F(str, Long.valueOf(j)));
        }
    }

    public static void X(boolean z, String str, Object obj) {
        if (z) {
        } else {
            throw new IllegalStateException(F(str, obj));
        }
    }

    public static void Y(boolean z, String str, int i, int i2) {
        if (z) {
        } else {
            throw new IllegalStateException(F(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void Z(boolean z, String str, Object obj, Object obj2) {
        if (z) {
        } else {
            throw new IllegalStateException(F(str, obj, obj2));
        }
    }

    public static boolean aA(anit anitVar) {
        anitVar.getClass();
        int ordinal = anitVar.c.ordinal();
        if (ordinal != 0 && ordinal != 5 && ordinal != 6) {
            return true;
        }
        return false;
    }

    public static Status aB(Exception exc) {
        if (!(exc instanceof SQLiteException)) {
            return Status.c(exc).withDescription(exc.getMessage());
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(exc);
        boolean z = false;
        Throwable th = exc;
        Exception exc2 = exc;
        while (true) {
            Throwable cause = exc2.getCause();
            if (cause != null) {
                arrayList.add(cause);
                if (cause != th) {
                    if (z) {
                        th = th.getCause();
                    }
                    z = !z;
                    exc2 = cause;
                } else {
                    throw new IllegalArgumentException("Loop in causal chain detected.", cause);
                }
            } else {
                List unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
                int i = 18;
                String d = new algs("\nCaused by: ").d(alzz.aL(unmodifiableList, new akdg(i)));
                if (alzz.aT(unmodifiableList, new evp(i))) {
                    return Status.n.withDescription(d);
                }
                if (!d.contains("no such table") && !d.contains("no such column")) {
                    return Status.m.withDescription(d);
                }
                return Status.o.withDescription(d);
            }
        }
    }

    public static int aC(long j) {
        if (j <= 0) {
            return 0;
        }
        return ((int) Math.log10(j)) + 1;
    }

    public static long aD(long j) {
        return (long) Math.pow(10.0d, aC(j) - 1);
    }

    public static int aE(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int aF(int i) {
        switch (i) {
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
            case 8:
            default:
                return 0;
            case 6:
                return 8;
            case 7:
                return 9;
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
            case 18:
                return 20;
            case 19:
                return 21;
            case 20:
                return 22;
            case 21:
                return 23;
            case 22:
                return 24;
            case 23:
                return 25;
            case 24:
                return 26;
            case 25:
                return 27;
            case 26:
                return 28;
            case 27:
                return 29;
            case 28:
                return 30;
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                return 31;
            case 30:
                return 32;
            case 31:
                return 33;
            case 32:
                return 34;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                return 35;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                return 36;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                return 37;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                return 38;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                return 39;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                return 40;
            case 39:
                return 41;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                return 42;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                return 43;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                return 44;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                return 45;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                return 46;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                return 47;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                return 48;
            case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                return 49;
            case 48:
                return 50;
            case 49:
                return 51;
        }
    }

    public static String aG(int i) {
        return Integer.toString(aE(i));
    }

    public static int aH(int i) {
        if (i != 0) {
            switch (i) {
                case 2:
                    return 1;
                case 3:
                    return 2;
                case 4:
                    return 3;
                case 5:
                    return 4;
                case 6:
                    return 6;
                case 7:
                    return 7;
                case 8:
                    return 5;
                case 9:
                    return 8;
                case 10:
                    return 9;
                case 11:
                    return 10;
                case 12:
                    return 11;
                case 13:
                    return 12;
                case 14:
                    return 13;
                case 15:
                    return 14;
                default:
                    return 0;
            }
        }
        return 15;
    }

    public static byte[] aI(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        try {
            return aode.s("HmacSHA256", aode.J(eCPrivateKey, eCPublicKey), null, "xELpwbCabRriJEkOYBagfJpHrrmNqlaZMTxsacBQjsLjUHtQexWNQCiMCkrxBzWEifExJkkOJwOziTQQJyRWVUbauuCHZrYlenSAiqtKtT".getBytes(), 32);
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("Problem calculating shared secret for the given keys.", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2 A[Catch: GeneralSecurityException -> 0x013f, TryCatch #0 {GeneralSecurityException -> 0x013f, blocks: (B:3:0x0002, B:4:0x0010, B:6:0x0017, B:8:0x0021, B:12:0x002d, B:13:0x0033, B:14:0x003d, B:16:0x0043, B:19:0x005b, B:21:0x006b, B:24:0x0082, B:25:0x008c, B:34:0x0098, B:36:0x00a4, B:38:0x00aa, B:40:0x00b4, B:46:0x00c8, B:47:0x00cc, B:49:0x00d2, B:52:0x00dc, B:67:0x00fa, B:68:0x0103, B:70:0x010e, B:72:0x0109, B:76:0x00ea, B:80:0x0113, B:81:0x0119, B:83:0x012b, B:84:0x0137, B:90:0x009d), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e1 A[EDGE_INSN: B:59:0x00e1->B:60:0x00e1 BREAK  A[LOOP:3: B:47:0x00cc->B:57:0x00cc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ea A[Catch: GeneralSecurityException -> 0x013f, TryCatch #0 {GeneralSecurityException -> 0x013f, blocks: (B:3:0x0002, B:4:0x0010, B:6:0x0017, B:8:0x0021, B:12:0x002d, B:13:0x0033, B:14:0x003d, B:16:0x0043, B:19:0x005b, B:21:0x006b, B:24:0x0082, B:25:0x008c, B:34:0x0098, B:36:0x00a4, B:38:0x00aa, B:40:0x00b4, B:46:0x00c8, B:47:0x00cc, B:49:0x00d2, B:52:0x00dc, B:67:0x00fa, B:68:0x0103, B:70:0x010e, B:72:0x0109, B:76:0x00ea, B:80:0x0113, B:81:0x0119, B:83:0x012b, B:84:0x0137, B:90:0x009d), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List aJ(byte[] r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.albo.aJ(byte[], java.lang.String):java.util.List");
    }

    public static List aK(ECPrivateKey eCPrivateKey, Collection collection, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            alur it = ((alog) collection).iterator();
            while (it.hasNext()) {
                arrayList.addAll(aJ(aode.J(eCPrivateKey, (ECPublicKey) it.next()), str));
            }
            return arrayList;
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("Problem calculating shared secret for the given keys.", e);
        }
    }

    public static boolean aL() {
        ahtp.f(anfi.b());
        return aqlu.a.get().a();
    }

    public static boolean aM() {
        ahtp.f(anfi.b());
        return aqkw.a.get().a();
    }

    public static boolean aN() {
        ahtp.f(anfi.b());
        return aqlx.a.get().a();
    }

    public static boolean aO() {
        ahtp.f(anfi.b());
        return aqkq.a.get().a();
    }

    public static boolean aP() {
        ahtp.f(anfi.b());
        return aqlc.a.get().a();
    }

    public static boolean aQ() {
        ahtp.f(anfi.b());
        return aqke.a.get().a();
    }

    public static boolean aR() {
        ahtp.f(anfi.b());
        return aqlx.a.get().b();
    }

    public static boolean aS() {
        ahtp.f(anfi.b());
        return aqlx.a.get().c();
    }

    public static boolean aT() {
        ahtp.f(anfi.b());
        return aqlx.a.get().d();
    }

    public static boolean aU() {
        ahtp.f(anfi.b());
        return aqlx.a.get().e();
    }

    public static boolean aV() {
        ahtp.f(anfi.b());
        return aqma.a.get().a();
    }

    public static boolean aW() {
        ahtp.f(anfi.b());
        return aqlr.a.get().a();
    }

    public static boolean aX() {
        ahtp.f(anfi.b());
        return aqma.a.get().b();
    }

    public static boolean aY() {
        ahtp.f(anfi.b());
        return aqkb.a.get().a();
    }

    public static boolean aZ() {
        ahtp.f(anfi.b());
        return aqlx.a.get().f();
    }

    public static void aa(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (z) {
        } else {
            throw new IllegalStateException(F(str, obj, obj2, obj3));
        }
    }

    public static void ab(boolean z, String str, Object obj) {
        if (z) {
        } else {
            throw new IllegalArgumentException(F(str, 4800, obj));
        }
    }

    public static void ac(boolean z, long j, Object obj) {
        if (z) {
        } else {
            throw new IllegalArgumentException(F("duration cannot be negative: %s %s", Long.valueOf(j), obj));
        }
    }

    public static void ad(int i, int i2) {
        String F;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 < 0) {
                throw new IllegalArgumentException(a.bV(i2, "negative size: "));
            }
            F = F("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            F = F("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(F);
    }

    public static void ae(int i, int i2) {
        if (i >= 0 && i <= i2) {
        } else {
            throw new IndexOutOfBoundsException(da(i, i2, "index"));
        }
    }

    public static String af(String str) {
        if (ah(str)) {
            return null;
        }
        return str;
    }

    public static String ag(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    public static boolean ah(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }

    public static algv ai(Class cls) {
        return new algv(cls.getSimpleName());
    }

    public static algv aj(Object obj) {
        return new algv(obj.getClass().getSimpleName());
    }

    public static Object ak(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static long al(Duration duration) {
        try {
            return duration.toNanos();
        } catch (ArithmeticException unused) {
            if (duration.isNegative()) {
                return Long.MIN_VALUE;
            }
            return Long.MAX_VALUE;
        }
    }

    public static Object am(algf algfVar, Object obj) {
        Object fu = algfVar.fu(obj);
        fu.getClass();
        return fu;
    }

    public static char an(char c) {
        if (at(c)) {
            return (char) (c ^ ' ');
        }
        return c;
    }

    public static char ao(char c) {
        if (as(c)) {
            return (char) (c ^ ' ');
        }
        return c;
    }

    public static String ap(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (at(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (at(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String aq(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (as(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (as(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static boolean ar(CharSequence charSequence, CharSequence charSequence2) {
        int b;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2 && ((b = b(charAt)) >= 26 || b != b(charAt2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean as(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        return false;
    }

    public static boolean at(char c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;
    }

    public static String au(String str) {
        String ap = ap(str);
        ap.getClass();
        return ap;
    }

    public static int av(int i) {
        if (i != 0) {
            if (i != 20) {
                if (i != 21) {
                    switch (i) {
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
                        case 18:
                            return 20;
                        default:
                            return 0;
                    }
                }
                return 23;
            }
            return 22;
        }
        return 2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Set, java.lang.Object] */
    public static void aw(ansy ansyVar, Set set) {
        for (Integer num : ansyVar.b) {
            num.intValue();
            set.add(num);
        }
    }

    public static arwl ax(arwe arweVar, ahlp ahlpVar, arqv arqvVar) {
        arweVar.getClass();
        return arrn.I(arweVar, null, arwf.d, new albn(ahlpVar, arqvVar, (arpe) null, 0), 1);
    }

    public static anjv ay() {
        anjv anjvVar = new anjv();
        anjvVar.h(1);
        anjvVar.g(1);
        return anjvVar;
    }

    public static anjm az() {
        anjm anjmVar = new anjm();
        anjmVar.e(anjq.b);
        return anjmVar;
    }

    private static int b(char c) {
        return (char) ((c | ' ') - 97);
    }

    public static void bA(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    public static anen bB(ExecutorService executorService) {
        anen anepVar;
        if (executorService instanceof anen) {
            return (anen) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            anepVar = new anes((ScheduledExecutorService) executorService);
        } else {
            anepVar = new anep(executorService);
        }
        return anepVar;
    }

    public static aneo bC(ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService instanceof aneo) {
            return (aneo) scheduledExecutorService;
        }
        return new anes(scheduledExecutorService);
    }

    public static Executor bD(Executor executor, ance anceVar) {
        executor.getClass();
        if (executor == andi.a) {
            return executor;
        }
        return new ajzt(executor, anceVar, 4);
    }

    public static ListenableFuture bE(Iterable iterable) {
        return new andd(alog.j(iterable), true);
    }

    @SafeVarargs
    public static ListenableFuture bF(ListenableFuture... listenableFutureArr) {
        return new andd(alog.p(listenableFutureArr), true);
    }

    public static ListenableFuture bG() {
        anef anefVar = anef.a;
        if (anefVar != null) {
            return anefVar;
        }
        return new anef();
    }

    public static ListenableFuture bH(Throwable th) {
        th.getClass();
        return new aneg(th);
    }

    public static ListenableFuture bI(Object obj) {
        if (obj == null) {
            return aneh.a;
        }
        return new aneh(obj);
    }

    public static ListenableFuture bJ(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        aned anedVar = new aned(listenableFuture);
        listenableFuture.c(anedVar, andi.a);
        return anedVar;
    }

    public static ListenableFuture bK(ancr ancrVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        anfd anfdVar = new anfd(ancrVar);
        anfdVar.c(new akwm(scheduledExecutorService.schedule(anfdVar, j, timeUnit), 9), andi.a);
        return anfdVar;
    }

    public static ListenableFuture bL(Runnable runnable, Executor executor) {
        anfd d = anfd.d(runnable, null);
        executor.execute(d);
        return d;
    }

    public static ListenableFuture bM(Callable callable, Executor executor) {
        anfd anfdVar = new anfd(callable);
        executor.execute(anfdVar);
        return anfdVar;
    }

    public static ListenableFuture bN(ancr ancrVar, Executor executor) {
        anfd anfdVar = new anfd(ancrVar);
        executor.execute(anfdVar);
        return anfdVar;
    }

    public static ListenableFuture bO(Iterable iterable) {
        return new andd(alog.j(iterable), false);
    }

    public static ListenableFuture bP(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        anfa anfaVar = new anfa(listenableFuture);
        aney aneyVar = new aney(anfaVar);
        anfaVar.b = scheduledExecutorService.schedule(aneyVar, j, timeUnit);
        listenableFuture.c(aneyVar, andi.a);
        return anfaVar;
    }

    public static Object bQ(Future future) {
        X(future.isDone(), "Future was expected to be done: %s", future);
        return d.p(future);
    }

    public static void bR(ListenableFuture listenableFuture, andy andyVar, Executor executor) {
        andyVar.getClass();
        listenableFuture.c(new andz(listenableFuture, andyVar), executor);
    }

    public static void bS(ListenableFuture listenableFuture, Future future) {
        if (listenableFuture instanceof ance) {
            ((ance) listenableFuture).l(future);
        } else if (listenableFuture != null && listenableFuture.isCancelled() && future != null) {
            future.cancel(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void bT(ListenableFuture listenableFuture, Future future) {
        listenableFuture.getClass();
        if (!future.isDone()) {
            if (listenableFuture.isDone()) {
                bS(listenableFuture, future);
                return;
            }
            anea aneaVar = new anea(listenableFuture, future, 0);
            listenableFuture.c(aneaVar, andi.a);
            if (future instanceof ListenableFuture) {
                future.c(aneaVar, andi.a);
            }
        }
    }

    public static Object bU(andc andcVar, alog alogVar, boolean z) {
        T(true);
        d.s(alogVar.contains(andcVar));
        return bQ(andcVar.c);
    }

    public static atkn bV(Iterable iterable) {
        return new atkn(false, (Object) alog.j(iterable));
    }

    @SafeVarargs
    public static atkn bW(ListenableFuture... listenableFutureArr) {
        return new atkn(false, (Object) alog.p(listenableFutureArr));
    }

    public static atkn bX(Iterable iterable) {
        return new atkn(true, (Object) alog.j(iterable));
    }

    @SafeVarargs
    public static atkn bY(ListenableFuture... listenableFutureArr) {
        return new atkn(true, (Object) alog.p(listenableFutureArr));
    }

    @Deprecated
    public static void bZ() {
        if (!System.getenv().containsKey("TEST_TMPDIR")) {
            System.exit(0);
            return;
        }
        throw new SecurityException("Test code should never call System.exit()");
    }

    public static boolean ba() {
        ahtp.f(anfi.b());
        return aqlx.a.get().g();
    }

    public static boolean bb() {
        ahtp.f(anfi.b());
        return aqlx.a.get().h();
    }

    public static boolean bc() {
        ahtp.f(anfi.b());
        return aqkz.a.get().a();
    }

    public static boolean bd() {
        ahtp.f(anfi.b());
        return aqlx.a.get().i();
    }

    public static boolean be() {
        ahtp.f(anfi.b());
        return aqlx.a.get().j();
    }

    public static boolean bf() {
        ahtp.f(anfi.b());
        return aqkk.a.get().a();
    }

    public static boolean bg() {
        ahtp.f(anfi.b());
        return aqlx.a.get().k();
    }

    public static boolean bh() {
        ahtp.f(anfi.b());
        return aqlx.a.get().l();
    }

    public static boolean bi() {
        ahtp.f(anfi.b());
        return aqlx.a.get().m();
    }

    public static boolean bj() {
        ahtp.f(anfi.b());
        return aqlx.a.get().n();
    }

    public static boolean bk() {
        ahtp.f(anfi.b());
        return aqli.a.get().a();
    }

    public static boolean bl() {
        ahtp.f(anfi.b());
        return aqll.a.get().a();
    }

    public static boolean bm() {
        ahtp.f(anfi.b());
        return aqlf.a.get().a();
    }

    public static boolean bn() {
        ahtp.f(anfi.b());
        return aqkt.a.get().a();
    }

    public static boolean bo() {
        ahtp.f(anfi.b());
        return aqlx.a.get().o();
    }

    public static boolean bp() {
        ahtp.f(anfi.b());
        return aqkn.a.get().a();
    }

    public static boolean bq() {
        ahtp.f(anfi.b());
        return aqlo.a.get().a();
    }

    public static boolean br() {
        ahtp.f(anfi.b());
        return aqlx.a.get().p();
    }

    public static boolean bs() {
        ahtp.f(anfi.b());
        return aqkh.a.get().a();
    }

    public static boolean bt() {
        ahtp.f(anfi.b());
        return aqjy.a.get().a();
    }

    public static boolean bu() {
        ahtp.f(anfi.b());
        return aqlx.a.get().q();
    }

    public static boolean bv() {
        ahtp.f(anfi.b());
        return aqlx.a.get().r();
    }

    public static boolean bw() {
        ahtp.f(anfi.b());
        return aqlx.a.get().s();
    }

    public static boolean bx() {
        ahtp.f(anfi.b());
        return aqlx.a.get().t();
    }

    public static boolean by() {
        ahtp.f(anfi.b());
        return aqlx.a.get().u();
    }

    public static void bz(long j, TimeUnit timeUnit) {
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(j);
            long nanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.sleep(nanos);
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                    nanos = nanoTime - System.nanoTime();
                }
            }
        } finally {
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private static byte[] c(byte[] bArr, String str) {
        return aode.s("HmacSHA256", bArr, null, str.getBytes(StandardCharsets.UTF_8), 32);
    }

    public static int cA(float[] fArr, float f, int i, int i2) {
        while (i < i2) {
            if (fArr[i] == f) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static List cB(float... fArr) {
        int length = fArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new anbl(fArr, 0, length);
    }

    public static char cC(long j) {
        boolean z;
        char c = (char) j;
        if (c == j) {
            z = true;
        } else {
            z = false;
        }
        M(z, "Out of range: %s", j);
        return c;
    }

    public static char cD(byte b, byte b2) {
        return (char) ((b << 8) | (b2 & 255));
    }

    public static byte[] cE(byte[]... bArr) {
        boolean z;
        long j = 0;
        int i = 0;
        while (true) {
            if (i >= bArr.length) {
                break;
            }
            j += bArr[i].length;
            i++;
        }
        int i2 = (int) j;
        if (j == i2) {
            z = true;
        } else {
            z = false;
        }
        M(z, "the total number of elements (%s) in the arrays must fit in an int", j);
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (byte[] bArr3 : bArr) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i3, length);
            i3 += length;
        }
        return bArr2;
    }

    public static void cF(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + i + ", " + i2 + ")");
    }

    public static void cG(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j + ", " + j2 + ")");
    }

    public static void cH(boolean z) {
        if (z) {
        } else {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static void cI(String str, long j) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static int cJ(long j, int i) {
        long j2 = i;
        long j3 = j % j2;
        if (j3 < 0) {
            j3 += j2;
        }
        return (int) j3;
    }

    public static long cK(long j, long j2) {
        boolean z;
        boolean z2 = true;
        if ((j ^ j2) < 0) {
            z = true;
        } else {
            z = false;
        }
        long j3 = j + j2;
        if ((j ^ j3) < 0) {
            z2 = false;
        }
        cG(z | z2, "checkedAdd", j, j2);
        return j3;
    }

    public static long cL(long j, long j2) {
        boolean z;
        boolean z2;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2);
        long j3 = j * j2;
        if (numberOfLeadingZeros > 65) {
            return j3;
        }
        if (numberOfLeadingZeros >= 64) {
            z = true;
        } else {
            z = false;
        }
        cG(z, "checkedMultiply", j, j2);
        cG(true, "checkedMultiply", j, j2);
        if (j != 0 && j3 / j != j2) {
            z2 = false;
        } else {
            z2 = true;
        }
        cG(z2, "checkedMultiply", j, j2);
        return j3;
    }

    public static long cM(long j, long j2) {
        boolean z;
        boolean z2 = true;
        if ((j ^ j2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        long j3 = j - j2;
        if ((j ^ j3) < 0) {
            z2 = false;
        }
        cG(z | z2, "checkedSubtract", j, j2);
        return j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r8 > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r8 < 0) goto L23;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001f. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long cN(long r8, long r10, java.math.RoundingMode r12) {
        /*
            r12.getClass()
            long r0 = r8 / r10
            long r2 = r10 * r0
            long r2 = r8 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            goto L55
        L10:
            long r8 = r8 ^ r10
            int[] r6 = defpackage.anbg.a
            int r7 = r12.ordinal()
            r6 = r6[r7]
            r7 = 63
            long r8 = r8 >> r7
            int r8 = (int) r8
            r8 = r8 | 1
            switch(r6) {
                case 1: goto L51;
                case 2: goto L55;
                case 3: goto L4c;
                case 4: goto L4e;
                case 5: goto L49;
                case 6: goto L28;
                case 7: goto L28;
                case 8: goto L28;
                default: goto L22;
            }
        L22:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L28:
            long r2 = java.lang.Math.abs(r2)
            long r9 = java.lang.Math.abs(r10)
            long r9 = r9 - r2
            long r2 = r2 - r9
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 != 0) goto L46
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_UP
            if (r12 == r9) goto L4e
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_EVEN
            if (r12 != r9) goto L55
            r9 = 1
            long r9 = r9 & r0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto L55
            goto L4e
        L46:
            if (r9 <= 0) goto L55
            goto L4e
        L49:
            if (r8 <= 0) goto L55
            goto L4e
        L4c:
            if (r8 >= 0) goto L55
        L4e:
            long r8 = (long) r8
            long r0 = r0 + r8
            return r0
        L51:
            r8 = 0
            cH(r8)
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.albo.cN(long, long, java.math.RoundingMode):long");
    }

    public static long cO(long j, long j2) {
        cI("a", j);
        cI("b", j2);
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long j3 = j >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j4 = j2 >> numberOfTrailingZeros2;
        while (j3 != j4) {
            long j5 = j3 - j4;
            long j6 = (j5 >> 63) & j5;
            long j7 = (j5 - j6) - j6;
            j3 = j7 >> Long.numberOfTrailingZeros(j7);
            j4 += j6;
        }
        return j3 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static long cP(long j, long j2) {
        boolean z;
        boolean z2;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = j ^ j2;
        boolean z3 = true;
        if (numberOfLeadingZeros < 64) {
            z = true;
        } else {
            z = false;
        }
        if (j < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 != Long.MIN_VALUE) {
            z3 = false;
        }
        long j4 = (j3 >>> 63) + Long.MAX_VALUE;
        if (z | (z3 & z2)) {
            return j4;
        }
        long j5 = j * j2;
        if (j != 0 && j5 / j != j2) {
            return j4;
        }
        return j5;
    }

    public static int cQ(int i, int i2) {
        boolean z;
        long j = i + i2;
        int i3 = (int) j;
        if (j == i3) {
            z = true;
        } else {
            z = false;
        }
        cF(z, "checkedAdd", i, i2);
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (((r0 & 1) & r3) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r1 > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (r5 > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r5 < 0) goto L27;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001c. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int cR(int r5, int r6, java.math.RoundingMode r7) {
        /*
            r7.getClass()
            if (r6 == 0) goto L4f
            int r0 = r5 / r6
            int r1 = r6 * r0
            int r1 = r5 - r1
            if (r1 != 0) goto Le
            goto L4e
        Le:
            r5 = r5 ^ r6
            int[] r2 = defpackage.anbf.a
            int r3 = r7.ordinal()
            r2 = r2[r3]
            int r5 = r5 >> 31
            r3 = 1
            r5 = r5 | r3
            r4 = 0
            switch(r2) {
                case 1: goto L4b;
                case 2: goto L4e;
                case 3: goto L47;
                case 4: goto L49;
                case 5: goto L44;
                case 6: goto L25;
                case 7: goto L25;
                case 8: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L25:
            int r1 = java.lang.Math.abs(r1)
            int r6 = java.lang.Math.abs(r6)
            int r6 = r6 - r1
            int r1 = r1 - r6
            if (r1 != 0) goto L41
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP
            if (r7 == r6) goto L49
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_EVEN
            if (r7 != r6) goto L3a
            goto L3b
        L3a:
            r3 = r4
        L3b:
            r6 = r0 & 1
            r6 = r6 & r3
            if (r6 == 0) goto L4e
            goto L49
        L41:
            if (r1 <= 0) goto L4e
            goto L49
        L44:
            if (r5 <= 0) goto L4e
            goto L49
        L47:
            if (r5 >= 0) goto L4e
        L49:
            int r0 = r0 + r5
            return r0
        L4b:
            cH(r4)
        L4e:
            return r0
        L4f:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "/ by zero"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.albo.cR(int, int, java.math.RoundingMode):int");
    }

    public static int cS(int i, int i2) {
        return cu(i + i2);
    }

    public static double cT(double d) {
        return -Math.nextUp(-d);
    }

    public static long cU(double d) {
        d.t(cV(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        if (exponent == -1023) {
            return doubleToRawLongBits + doubleToRawLongBits;
        }
        return doubleToRawLongBits | 4503599627370496L;
    }

    public static boolean cV(double d) {
        if (Math.getExponent(d) <= 1023) {
            return true;
        }
        return false;
    }

    public static aozy cW(Throwable th) {
        aozy createBuilder = anba.a.createBuilder();
        aozy cZ = cZ(th, false);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        anba anbaVar = (anba) createBuilder.b;
        anax anaxVar = (anax) cZ.s();
        anaxVar.getClass();
        anbaVar.e = anaxVar;
        anbaVar.b |= 1;
        while (true) {
            th = th.getCause();
            if (th != null) {
                aozy cZ2 = cZ(th, false);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                anba anbaVar2 = (anba) createBuilder.b;
                anax anaxVar2 = (anax) cZ2.s();
                anaxVar2.getClass();
                anbaVar2.a();
                anbaVar2.f.add(anaxVar2);
            } else {
                return createBuilder;
            }
        }
    }

    public static aozy cX(Throwable th) {
        aozy createBuilder = anaz.a.createBuilder();
        aozy cZ = cZ(th, true);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        anaz anazVar = (anaz) createBuilder.b;
        anax anaxVar = (anax) cZ.s();
        anaxVar.getClass();
        anazVar.c = anaxVar;
        anazVar.b |= 1;
        return createBuilder;
    }

    private static long cY(long j) {
        return j ^ Long.MIN_VALUE;
    }

    private static aozy cZ(Throwable th, boolean z) {
        StackTraceElement[] stackTraceElementArr;
        aozy createBuilder = anax.a.createBuilder();
        String name = th.getClass().getName();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        anax anaxVar = (anax) createBuilder.b;
        name.getClass();
        anaxVar.b |= 1;
        anaxVar.c = name;
        if (z && th.getMessage() != null) {
            String message = th.getMessage();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            anax anaxVar2 = (anax) createBuilder.b;
            message.getClass();
            anaxVar2.b |= 2;
            anaxVar2.d = message;
        }
        try {
            stackTraceElementArr = th.getStackTrace();
        } catch (NullPointerException unused) {
            stackTraceElementArr = null;
        }
        if (stackTraceElementArr != null) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                aozy createBuilder2 = anaw.a.createBuilder();
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    anaw anawVar = (anaw) createBuilder2.b;
                    className.getClass();
                    anawVar.b |= 1;
                    anawVar.c = className;
                    String methodName = stackTraceElement.getMethodName();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    anaw anawVar2 = (anaw) createBuilder2.b;
                    methodName.getClass();
                    anawVar2.b |= 2;
                    anawVar2.d = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    anaw anawVar3 = (anaw) createBuilder2.b;
                    anawVar3.b |= 8;
                    anawVar3.f = lineNumber;
                    if (stackTraceElement.getFileName() != null) {
                        String fileName = stackTraceElement.getFileName();
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        anaw anawVar4 = (anaw) createBuilder2.b;
                        fileName.getClass();
                        anawVar4.b |= 4;
                        anawVar4.e = fileName;
                    }
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                anax anaxVar3 = (anax) createBuilder.b;
                anaw anawVar5 = (anaw) createBuilder2.s();
                anawVar5.getClass();
                apax apaxVar = anaxVar3.f;
                if (!apaxVar.c()) {
                    anaxVar3.f = apag.mutableCopy(apaxVar);
                }
                anaxVar3.f.add(anawVar5);
            }
        }
        return createBuilder;
    }

    public static Duration ca(Instant instant, Instant instant2) {
        instant.getClass();
        instant2.getClass();
        Duration between = Duration.between(instant2, instant);
        between.getClass();
        return between;
    }

    public static Duration cb(int i) {
        return cc(i);
    }

    public static Duration cc(long j) {
        Duration ofMinutes = Duration.ofMinutes(j);
        ofMinutes.getClass();
        return ofMinutes;
    }

    public static Duration cd(int i) {
        return ce(i);
    }

    public static Duration ce(long j) {
        Duration ofSeconds = Duration.ofSeconds(j);
        ofSeconds.getClass();
        return ofSeconds;
    }

    public static Object cf(Duration duration, arpe arpeVar) {
        Object n = arwi.n(arut.i(arsd.p(duration.getSeconds(), aruv.d), arsd.o(duration.getNano(), aruv.a)), arpeVar);
        if (n == arpl.a) {
            return n;
        }
        return arnb.a;
    }

    public static int cg(long j, long j2) {
        return Long.compare(cY(j), cY(j2));
    }

    public static byte ch(long j) {
        boolean z;
        if ((j >> 8) == 0) {
            z = true;
        } else {
            z = false;
        }
        M(z, "out of range: %s", j);
        return (byte) j;
    }

    public static int ci(byte b) {
        return b & 255;
    }

    public static int cj(long[] jArr, long j, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static long ck(byte[] bArr) {
        boolean z;
        int length = bArr.length;
        if (length >= 8) {
            z = true;
        } else {
            z = false;
        }
        O(z, "array too small: %s < %s", length, 8);
        return cl(bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]);
    }

    public static long cl(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        return ((b6 & 255) << 16) | ((b & 255) << 56) | ((b2 & 255) << 48) | ((b3 & 255) << 40) | ((b4 & 255) << 32) | ((b5 & 255) << 24) | ((b7 & 255) << 8) | (b8 & 255);
    }

    public static long cm(long... jArr) {
        d.s(true);
        long j = jArr[0];
        for (int i = 1; i < 3; i++) {
            long j2 = jArr[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }

    public static byte[] cn(long j) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) (255 & j);
            j >>= 8;
        }
        return bArr;
    }

    public static int co(long j) {
        boolean z;
        int i = (int) j;
        if (i == j) {
            z = true;
        } else {
            z = false;
        }
        M(z, "Out of range: %s", j);
        return i;
    }

    public static int cp(int i, int i2, int i3) {
        O(true, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return Math.min(Math.max(i, i2), i3);
    }

    public static int cq(byte[] bArr) {
        boolean z;
        int length = bArr.length;
        if (length >= 4) {
            z = true;
        } else {
            z = false;
        }
        O(z, "array too small: %s < %s", length, 4);
        return cr(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int cr(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static int cs(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int ct(int... iArr) {
        d.s(true);
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 < i) {
                i = i3;
            }
        }
        return i;
    }

    public static int cu(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static Integer cv(String str) {
        return cw(str, 10);
    }

    public static Integer cw(String str, int i) {
        Long valueOf;
        str.getClass();
        if (!str.isEmpty()) {
            int i2 = 0;
            char charAt = str.charAt(0);
            if (charAt == '-') {
                i2 = 1;
            }
            if (i2 != str.length()) {
                int i3 = i2 + 1;
                int a = anbo.a(str.charAt(i2));
                if (a >= 0 && a < i) {
                    long j = i;
                    long j2 = -a;
                    long j3 = Long.MIN_VALUE / j;
                    while (true) {
                        if (i3 < str.length()) {
                            int i4 = i3 + 1;
                            int a2 = anbo.a(str.charAt(i3));
                            if (a2 < 0 || a2 >= i || j2 < j3) {
                                break;
                            }
                            char c = charAt;
                            long j4 = a2;
                            long j5 = j2 * j;
                            if (j5 < j4 - Long.MIN_VALUE) {
                                break;
                            }
                            j2 = j5 - j4;
                            i3 = i4;
                            charAt = c;
                        } else if (charAt == '-') {
                            valueOf = Long.valueOf(j2);
                        } else if (j2 != Long.MIN_VALUE) {
                            valueOf = Long.valueOf(-j2);
                        }
                    }
                }
            }
        }
        valueOf = null;
        if (valueOf != null && valueOf.longValue() == valueOf.intValue()) {
            return Integer.valueOf(valueOf.intValue());
        }
        return null;
    }

    public static List cx(int... iArr) {
        int length = iArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new anbn(iArr, 0, length);
    }

    public static int[] cy(Collection collection) {
        if (collection instanceof anbn) {
            anbn anbnVar = (anbn) collection;
            return Arrays.copyOfRange(anbnVar.a, anbnVar.b, anbnVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static int cz(float f) {
        return Float.valueOf(f).hashCode();
    }

    public static asai d(asai asaiVar, arqv arqvVar) {
        return new aghw(armd.u(new asae(new albu(asaiVar, arqvVar, (arpe) null, 0)), 2), 6);
    }

    private static String da(int i, int i2, String str) {
        if (i < 0) {
            return F("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return F("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(a.bV(i2, "negative size: "));
    }

    public static InputStream e(alcs alcsVar) {
        if ((alcsVar.b & 2) != 0) {
            String str = alcsVar.d;
            if (str.startsWith("https://www.gstatic.com")) {
                return new URL(str).openStream();
            }
            return new FileInputStream(alcsVar.d);
        }
        throw new FileNotFoundException(String.format(Locale.US, "Cannot find file because spec is missing local path: %s", alcsVar.d));
    }

    public static andc f(alcs alcsVar) {
        return andc.b(new lff(alcsVar, 5), andi.a);
    }

    public static String g(alcs alcsVar) {
        StringBuilder sb = new StringBuilder();
        if ((alcsVar.b & 2) != 0) {
            sb.append("local_file_path: ");
            sb.append(alcsVar.d);
        }
        int i = alcsVar.b;
        if ((i & 1) != 0) {
            if ((i & 2) != 0) {
                sb.append("\n");
            }
            sb.append("mdd_file {    id: ");
            alct alctVar = alcsVar.c;
            if (alctVar == null) {
                alctVar = alct.a;
            }
            sb.append(alctVar.c);
            sb.append("\n    group: ");
            alct alctVar2 = alcsVar.c;
            if (alctVar2 == null) {
                alctVar2 = alct.a;
            }
            sb.append(alctVar2.d);
            sb.append("\n}");
        }
        return sb.toString();
    }

    public static /* synthetic */ String h(int i) {
        if (i != 1) {
            return "ENUM_VALUE";
        }
        return "STRING_VALUE";
    }

    public static akzq i(ArrayList arrayList, boolean z, boolean z2) {
        return new akzq(DesugarCollections.unmodifiableList(arrayList), z, z2);
    }

    public static void j(boolean z) {
        new akzj(DesugarCollections.unmodifiableList(Collections.emptyList()), z);
    }

    public static void k(ArrayList arrayList, boolean z) {
        new akzh(DesugarCollections.unmodifiableList(arrayList), z);
    }

    public static Collector l() {
        return Collectors.collectingAndThen(Collectors.toList(), new akyg(11));
    }

    public static Object m(List list, akxw akxwVar) {
        return akxwVar.a((albi) list.get(0));
    }

    public static alba n(Enum r3) {
        aozy createBuilder = alba.a.createBuilder();
        String str = r3.toString();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        alba albaVar = (alba) createBuilder.b;
        str.getClass();
        albaVar.b |= 1;
        albaVar.c = str;
        return (alba) createBuilder.s();
    }

    public static List o(akzk akzkVar, Function function) {
        return (List) Collection.EL.stream(akzkVar.a()).map(function).collect(l());
    }

    public static aozy p(String str, akzk akzkVar) {
        aozy createBuilder = alay.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((alay) createBuilder.b).b = str;
        boolean c = akzkVar.c();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((alay) createBuilder.b).d = c;
        boolean d = akzkVar.d();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((alay) createBuilder.b).e = d;
        boolean b = akzkVar.b();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((alay) createBuilder.b).f = b;
        return createBuilder;
    }

    public static void q(ListenableFuture listenableFuture, akxq akxqVar, Executor executor) {
        listenableFuture.c(new gul(listenableFuture, akxqVar, 4, (char[]) null), executor);
    }

    public static /* synthetic */ String r(int i) {
        switch (i) {
            case 1:
                return "NO_ERROR";
            case 2:
                return "UNKNOWN_ERROR";
            case 3:
                return "NOT_HANDLED";
            case 4:
                return "INVALID_PARAMETERS";
            case 5:
                return "CANCELLED";
            case 6:
                return "NULL_RESPONSE";
            case 7:
                return "TIME_OUT";
            default:
                return "TASK_CAPABILITY_INTERNAL_ERROR";
        }
    }

    public static Bundle s(String str, apbt apbtVar) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(str, apbtVar.toByteArray());
        return bundle;
    }

    public static boolean t(java.util.Collection collection, java.util.Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean u(java.util.Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static void v(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            } else {
                throw new NullPointerException(a.bX(obj, "null value in entry: ", "=null"));
            }
        }
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(String.valueOf(obj2))));
    }

    public static void w(boolean z) {
        U(z, "no calls to next() since the last call to remove()");
    }

    public static void x(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static void y(boolean z) {
        if (z) {
        } else {
            throw new alia();
        }
    }

    public static void z(boolean z, String str, Object obj) {
        if (z) {
        } else {
            throw new alia(F(str, obj));
        }
    }

    public albo(byte[] bArr) {
    }

    public albo(byte[] bArr, byte[] bArr2) {
        Pattern pattern = anfl.a;
        Set set = anfn.a;
    }
}
