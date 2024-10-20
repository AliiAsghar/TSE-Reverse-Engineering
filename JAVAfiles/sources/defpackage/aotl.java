package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.Parcelable;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementResponse;
import io.grpc.Status;
import j$.time.Duration;
import j$.time.Instant;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ProtocolException;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aotl {
    public static volatile aqux a;
    public static volatile aotl b;

    public aotl() {
    }

    public static String A(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String B(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (Character.isLetter(charAt)) {
                if (!Character.isUpperCase(charAt)) {
                    char upperCase = Character.toUpperCase(charAt);
                    if (i == 0) {
                        return upperCase + str.substring(1);
                    }
                    return str.substring(0, i) + upperCase + str.substring(i + 1);
                }
            } else {
                i++;
            }
        }
        return str;
    }

    public static final void C(aomb aombVar, Parcelable parcelable, aqsm aqsmVar) {
        aqsmVar.getClass();
        ((AtomicReference) aombVar.d.a(aqsmVar)).set(parcelable);
    }

    public static aqrv D(armf armfVar) {
        return new aoli(new aolb(armfVar, 3), apbt.class, apbt.class);
    }

    public static void E(aqux aquxVar, Class cls, boolean z) {
        aquv aquvVar;
        Class<?> cls2;
        boolean z2;
        String str;
        String str2;
        if (z) {
            aquvVar = aquxVar.d;
        } else {
            aquvVar = aquxVar.e;
        }
        try {
            cls2 = ((arkw) aquvVar).a.getClass();
            z2 = false;
        } catch (ClassCastException unused) {
            cls2 = Object.class;
            z2 = true;
        }
        if (!cls.isAssignableFrom(cls2)) {
            if (true != z) {
                str = GroupManagementResponse.XML_TAG;
            } else {
                str = GroupManagementRequest.XML_TAG;
            }
            String str3 = aquxVar.b;
            Status status = Status.m;
            String name = cls2.getName();
            if (true != z2) {
                str2 = "";
            } else {
                str2 = ", assumed because method doesn't use ReflectableMarshaller";
            }
            throw status.withDescription("AsyncClientInterceptor: The " + str + " message type of method " + str3 + " (" + name + str2 + ") must be a subclass of " + cls.toString()).asException();
        }
    }

    public static void F(byte[] bArr, int i, long j) {
        bArr[i] = (byte) (j & 255);
        bArr[i + 1] = (byte) ((j >> 8) & 255);
        bArr[i + 2] = (byte) ((j >> 16) & 255);
        bArr[i + 3] = (byte) ((j >> 24) & 255);
        bArr[i + 4] = (byte) ((j >> 32) & 255);
        bArr[i + 5] = (byte) ((j >> 40) & 255);
        bArr[i + 6] = (byte) ((j >> 48) & 255);
        bArr[i + 7] = (byte) ((j >> 56) & 255);
    }

    public static int G(int i, int i2, int i3) {
        int i4 = 1;
        while (i3 >= 32) {
            i4 = (int) (((((i4 * i2) & 4294967295L) * i) + i4) >>> 32);
            i3 -= 32;
        }
        if (i3 > 0) {
            return (int) (((((((-1) >>> (-i3)) & (i2 * i4)) & 4294967295L) * i) + i4) >>> i3);
        }
        return i4;
    }

    public static int H(int i) {
        char c = (char) i;
        int i2 = (c | (c << '\b')) & 16711935;
        int i3 = (i2 | (i2 << 4)) & 252645135;
        int i4 = (i3 | (i3 << 2)) & 858993459;
        return (i4 | (i4 + i4)) & 1431655765;
    }

    public static Class I(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader != null) {
                return classLoader.loadClass(str);
            }
            return (Class) AccessController.doPrivileged(new atdd(str, 1));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static asst J(assy assyVar) {
        return new astj(assyVar.c(), 0);
    }

    public static /* synthetic */ void K() {
        new ASN1ObjectIdentifier("2.5.29.9");
        new ASN1ObjectIdentifier("2.5.29.14");
        new ASN1ObjectIdentifier("2.5.29.15");
        new ASN1ObjectIdentifier("2.5.29.16");
        new ASN1ObjectIdentifier("2.5.29.17");
        new ASN1ObjectIdentifier("2.5.29.18");
        new ASN1ObjectIdentifier("2.5.29.19");
        new ASN1ObjectIdentifier("2.5.29.20");
        new ASN1ObjectIdentifier("2.5.29.21");
        new ASN1ObjectIdentifier("2.5.29.23");
        new ASN1ObjectIdentifier("2.5.29.24");
        new ASN1ObjectIdentifier("2.5.29.27");
        new ASN1ObjectIdentifier("2.5.29.28");
        new ASN1ObjectIdentifier("2.5.29.29");
        new ASN1ObjectIdentifier("2.5.29.30");
        new ASN1ObjectIdentifier("2.5.29.31");
        new ASN1ObjectIdentifier("2.5.29.32");
        new ASN1ObjectIdentifier("2.5.29.33");
        new ASN1ObjectIdentifier("2.5.29.35");
        new ASN1ObjectIdentifier("2.5.29.36");
        new ASN1ObjectIdentifier("2.5.29.37");
        new ASN1ObjectIdentifier("2.5.29.46");
        new ASN1ObjectIdentifier("2.5.29.54");
        new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.1");
        new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.11");
        new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.12");
        new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.2");
        new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.3");
        new ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.4");
        new ASN1ObjectIdentifier("2.5.29.56");
        new ASN1ObjectIdentifier("2.5.29.55");
    }

    public static /* synthetic */ void L(StringBuffer stringBuffer, String str, String str2, String str3) {
        stringBuffer.append("    ");
        stringBuffer.append(str2);
        stringBuffer.append(":");
        stringBuffer.append(str);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    public static final int M(asrn asrnVar, int i) {
        int i2;
        int length = asrnVar.e.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 <= length) {
                int i4 = i + 1;
                i2 = (i3 + length) >>> 1;
                int i5 = asrnVar.f[i2];
                if (i5 < i4) {
                    i3 = i2 + 1;
                } else {
                    if (i5 <= i4) {
                        break;
                    }
                    length = i2 - 1;
                }
            } else {
                i2 = (-i3) - 1;
                break;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }

    public static final String N(byte[] bArr) {
        bArr.getClass();
        return new String(bArr, arul.a);
    }

    public static final byte[] O(String str) {
        byte[] bytes = str.getBytes(arul.a);
        bytes.getClass();
        return bytes;
    }

    public static final asqx Q(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i + i;
                bArr[i] = (byte) ((asru.a(str.charAt(i2)) << 4) + asru.a(str.charAt(i2 + 1)));
            }
            return new asqx(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
    }

    public static final asqx R(String str) {
        str.getClass();
        asqx asqxVar = new asqx(O(str));
        asqxVar.d = str;
        return asqxVar;
    }

    public static final String S(int i) {
        if (i == 0) {
            return "0";
        }
        char c = asru.a[(i >> 28) & 15];
        char[] cArr = asru.a;
        int i2 = 0;
        char[] cArr2 = {c, cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        aqil.L(i2, 8, 8);
        return new String(cArr2, i2, 8 - i2);
    }

    public static final void T(long j, long j2, long j3) {
        if ((j2 | j3) >= 0 && j2 <= j && j - j2 >= j3) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
    }

    public static final boolean U(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        bArr.getClass();
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0057, code lost:
    
        r7 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String V(byte[] r13, byte[][] r14, int r15) {
        /*
            int r0 = r13.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L84
            int r3 = r2 + r0
            int r3 = r3 / 2
        L9:
            r4 = 10
            if (r3 < 0) goto L14
            r5 = r13[r3]
            if (r5 == r4) goto L14
            int r3 = r3 + (-1)
            goto L9
        L14:
            int r5 = r3 + 1
            r6 = 1
            r7 = r6
        L18:
            int r8 = r5 + r7
            r9 = r13[r8]
            if (r9 == r4) goto L21
            int r7 = r7 + 1
            goto L18
        L21:
            int r4 = r8 - r5
            r9 = r15
            r7 = r1
            r10 = r7
            r11 = r10
        L27:
            if (r7 == 0) goto L2c
            r7 = 46
            goto L34
        L2c:
            r7 = r14[r9]
            r7 = r7[r10]
            int r7 = defpackage.asmt.y(r7)
        L34:
            int r12 = r5 + r11
            r12 = r13[r12]
            int r12 = defpackage.asmt.y(r12)
            int r7 = r7 - r12
            if (r7 != 0) goto L58
            int r11 = r11 + 1
            int r10 = r10 + 1
            if (r11 == r4) goto L57
            r7 = r14[r9]
            int r7 = r7.length
            if (r7 != r10) goto L55
            int r7 = r14.length
            r12 = -1
            int r7 = r7 + r12
            if (r9 != r7) goto L50
            goto L57
        L50:
            int r9 = r9 + 1
            r7 = r6
            r10 = r12
            goto L27
        L55:
            r7 = r1
            goto L27
        L57:
            r7 = r1
        L58:
            if (r7 >= 0) goto L5c
        L5a:
            r0 = r3
            goto L3
        L5c:
            if (r7 <= 0) goto L61
        L5e:
            int r2 = r8 + 1
            goto L3
        L61:
            int r6 = r4 - r11
            r7 = r14[r9]
            int r7 = r7.length
            int r7 = r7 - r10
            int r9 = r9 + 1
            int r10 = r14.length
        L6a:
            if (r9 >= r10) goto L73
            r11 = r14[r9]
            int r11 = r11.length
            int r7 = r7 + r11
            int r9 = r9 + 1
            goto L6a
        L73:
            if (r7 >= r6) goto L76
            goto L5a
        L76:
            if (r7 <= r6) goto L79
            goto L5e
        L79:
            java.nio.charset.Charset r14 = java.nio.charset.StandardCharsets.UTF_8
            r14.getClass()
            java.lang.String r15 = new java.lang.String
            r15.<init>(r13, r5, r4, r14)
            goto L85
        L84:
            r15 = 0
        L85:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aotl.V(byte[], byte[][], int):java.lang.String");
    }

    public static final aspz W(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions == null) {
            return null;
        }
        return new aspz(x509TrustManager, x509TrustManagerExtensions);
    }

    public static final boolean X() {
        aspx aspxVar = aspx.b;
        if (Z() && Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    public static final List Y(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((asmf) obj) != asmf.a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(aqjn.J(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((asmf) it.next()).g);
        }
        return arrayList2;
    }

    public static final boolean Z() {
        return d.F("Dalvik", System.getProperty("java.vm.name"));
    }

    public static final /* synthetic */ aotg a(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (aotg) s;
    }

    public static final int aa(int i, int i2, int i3) {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException(a.bU(i, i3, "PROTOCOL_ERROR padding ", " > remaining length "));
    }

    public static /* synthetic */ String ab(int i) {
        switch (i) {
            case 1:
                return "NO_ERROR";
            case 2:
                return "PROTOCOL_ERROR";
            case 3:
                return "INTERNAL_ERROR";
            case 4:
                return "FLOW_CONTROL_ERROR";
            case 5:
                return "SETTINGS_TIMEOUT";
            case 6:
                return "STREAM_CLOSED";
            case 7:
                return "FRAME_SIZE_ERROR";
            case 8:
                return "REFUSED_STREAM";
            case 9:
                return "CANCEL";
            case 10:
                return "COMPRESSION_ERROR";
            case 11:
                return "CONNECT_ERROR";
            case 12:
                return "ENHANCE_YOUR_CALM";
            case 13:
                return "INADEQUATE_SECURITY";
            default:
                return "HTTP_1_1_REQUIRED";
        }
    }

    public static int[] ac() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    }

    public static final int ad(int i) {
        int[] ac = ac();
        for (int i2 = 0; i2 < 14; i2++) {
            int i3 = ac[i2];
            int i4 = i3 - 1;
            if (i3 != 0) {
                if (i4 == i) {
                    return i3;
                }
            } else {
                throw null;
            }
        }
        return 0;
    }

    public static final asny ae(String str) {
        asmf asmfVar;
        int i;
        String str2;
        if (arsd.ad(str, "HTTP/1.")) {
            i = 9;
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt != 0) {
                    if (charAt == 1) {
                        asmfVar = asmf.b;
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                } else {
                    asmfVar = asmf.a;
                }
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else if (arsd.ad(str, "ICY ")) {
            asmfVar = asmf.a;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                String substring = str.substring(i, i2);
                substring.getClass();
                int parseInt = Integer.parseInt(substring);
                if (str.length() > i2) {
                    if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                        str2.getClass();
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                } else {
                    str2 = "";
                }
                return new asny(asmfVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        }
        throw new ProtocolException("Unexpected status line: ".concat(str));
    }

    public static final String af(aslx aslxVar) {
        String b2 = aslxVar.b();
        String c = aslxVar.c();
        if (c != null) {
            return a.co(c, b2, "?");
        }
        return b2;
    }

    public static final boolean ag(String str) {
        if (!d.F(str, "GET") && !d.F(str, "HEAD")) {
            return true;
        }
        return false;
    }

    public static final String ah(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        format.getClass();
        return format;
    }

    public static final void ai(asmv asmvVar, asmx asmxVar, String str) {
        Logger logger = asmy.b;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        format.getClass();
        logger.fine(asmxVar.b + " " + format + ": " + asmvVar.a);
    }

    public static final asmm aj(asmm asmmVar) {
        asmp asmpVar;
        if (asmmVar != null) {
            asmpVar = asmmVar.g;
        } else {
            asmpVar = null;
        }
        if (asmpVar != null) {
            asml asmlVar = new asml(asmmVar);
            asmlVar.e = null;
            return asmlVar.a();
        }
        return asmmVar;
    }

    public static final String ak(String str) {
        InetAddress ay;
        str.getClass();
        int i = -1;
        int i2 = 0;
        if (arsd.O(str, ":")) {
            if (arsd.ad(str, "[") && str.endsWith("]")) {
                ay = ay(str, 1, str.length() - 1);
            } else {
                ay = ay(str, 0, str.length());
            }
            if (ay == null) {
                return null;
            }
            byte[] address = ay.getAddress();
            int length = address.length;
            if (length == 16) {
                address.getClass();
                int i3 = 0;
                int i4 = 0;
                while (i3 < address.length) {
                    int i5 = i3;
                    while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                        i5 += 2;
                    }
                    int i6 = i5 - i3;
                    if (i6 > i4 && i6 >= 4) {
                        i = i3;
                        i4 = i6;
                    }
                    i3 = i5 + 2;
                }
                asqu asquVar = new asqu();
                while (i2 < address.length) {
                    if (i2 == i) {
                        asquVar.M(58);
                        i2 += i4;
                        if (i2 == 16) {
                            asquVar.M(58);
                        }
                    } else {
                        if (i2 > 0) {
                            asquVar.M(58);
                        }
                        asquVar.V((asmt.y(address[i2]) << 8) | asmt.y(address[i2 + 1]));
                        i2 += 2;
                    }
                }
                return asquVar.m();
            }
            if (length == 4) {
                return ay.getHostAddress();
            }
            throw new AssertionError(a.bW(str, "Invalid IPv6 address: '", "'"));
        }
        try {
            String ascii = IDN.toASCII(str);
            ascii.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = ascii.toLowerCase(locale);
            lowerCase.getClass();
            if (lowerCase.length() != 0) {
                int length2 = lowerCase.length();
                for (int i7 = 0; i7 < length2; i7++) {
                    char charAt = lowerCase.charAt(i7);
                    if (arro.a(charAt, 31) > 0 && arro.a(charAt, 127) < 0 && arsd.S(" #%/:?@[\\]", charAt, 0, 6) == -1) {
                    }
                    return null;
                }
                return lowerCase;
            }
        } catch (IllegalArgumentException unused) {
        }
        return null;
    }

    public static final asmr al(String str) {
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return asmr.c;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return asmr.b;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return asmr.a;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return asmr.d;
            }
        } else if (str.equals("SSLv3")) {
            return asmr.e;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static final asmk am(byte[] bArr) {
        asmt.z(0L, 0L);
        return new asmj(bArr);
    }

    public static final aslz an(String str) {
        str.getClass();
        Matcher matcher = aslz.a.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            group.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = group.toLowerCase(locale);
            lowerCase.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            Locale locale2 = Locale.US;
            locale2.getClass();
            group2.toLowerCase(locale2).getClass();
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = aslz.b.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group3 = matcher2.group(1);
                    if (group3 == null) {
                        end = matcher2.end();
                    } else {
                        String group4 = matcher2.group(2);
                        if (group4 == null) {
                            group4 = matcher2.group(3);
                        } else if (arsd.ad(group4, "'") && group4.endsWith("'") && group4.length() > 2) {
                            group4 = group4.substring(1, group4.length() - 1);
                            group4.getClass();
                        }
                        arrayList.add(group3);
                        arrayList.add(group4);
                        end = matcher2.end();
                    }
                } else {
                    String substring = str.substring(end);
                    substring.getClass();
                    throw new IllegalArgumentException(a.bZ(str, substring, "Parameter is not formatted correctly: \"", "\" for: \"", "\""));
                }
            }
            return new aslz(str, lowerCase, (String[]) arrayList.toArray(new String[0]));
        }
        throw new IllegalArgumentException(a.bW(str, "No subtype found for: \"", "\""));
    }

    public static final int ao(String str) {
        if (d.F(str, "http")) {
            return 80;
        }
        if (!d.F(str, "https")) {
            return -1;
        }
        return 443;
    }

    public static /* synthetic */ String ap(String str, int i, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z2 = false;
        boolean z3 = true;
        if (1 == (i3 & 1)) {
            i = 0;
        }
        if ((i3 & 4) == 0) {
            z2 = true;
        }
        boolean z4 = z & z2;
        str.getClass();
        int i4 = i;
        while (i4 < i2) {
            char charAt = str.charAt(i4);
            if (charAt != '%') {
                if (charAt != '+' || !z4) {
                    i4++;
                }
            } else {
                z3 = z4;
            }
            asqu asquVar = new asqu();
            asquVar.R(str, i, i4);
            while (i4 < i2) {
                int codePointAt = str.codePointAt(i4);
                if (codePointAt == 37) {
                    int i5 = i4 + 2;
                    if (i5 < i2) {
                        int f = asmt.f(str.charAt(i4 + 1));
                        int f2 = asmt.f(str.charAt(i5));
                        if (f != -1 && f2 != -1) {
                            asquVar.M((f << 4) + f2);
                            i4 = Character.charCount(37) + i5;
                        } else {
                            codePointAt = 37;
                            asquVar.S(codePointAt);
                            i4 += Character.charCount(codePointAt);
                        }
                    } else {
                        codePointAt = 37;
                    }
                }
                if (codePointAt == 43 && z3) {
                    asquVar.M(32);
                    i4++;
                }
                asquVar.S(codePointAt);
                i4 += Character.charCount(codePointAt);
            }
            return asquVar.m();
        }
        String substring = str.substring(i, i2);
        substring.getClass();
        return substring;
    }

    public static final List aq(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int S = arsd.S(str, '&', i, 4);
            if (S == -1) {
                S = str.length();
            }
            int S2 = arsd.S(str, '=', i, 4);
            if (S2 != -1 && S2 <= S) {
                String substring = str.substring(i, S2);
                substring.getClass();
                arrayList.add(substring);
                String substring2 = str.substring(S2 + 1, S);
                substring2.getClass();
                arrayList.add(substring2);
            } else {
                String substring3 = str.substring(i, S);
                substring3.getClass();
                arrayList.add(substring3);
                arrayList.add(null);
            }
            i = S + 1;
        }
        return arrayList;
    }

    public static /* synthetic */ String ar(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        int i4;
        int i5;
        boolean z5;
        boolean z6;
        boolean z7;
        char c;
        int i6;
        String str3;
        if ((i3 & 2) != 0) {
            i4 = str.length();
        } else {
            i4 = i2;
        }
        boolean z8 = false;
        boolean z9 = true;
        if (1 == (i3 & 1)) {
            i5 = 0;
        } else {
            i5 = i;
        }
        if ((i3 & 8) != 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        boolean z10 = z5 & z;
        if ((i3 & 16) != 0) {
            z6 = false;
        } else {
            z6 = true;
        }
        boolean z11 = z6 & z2;
        if ((i3 & 32) != 0) {
            z7 = false;
        } else {
            z7 = true;
        }
        boolean z12 = z7 & z3;
        if ((i3 & 64) == 0) {
            z8 = true;
        }
        boolean z13 = z8 & z4;
        str.getClass();
        int i7 = i5;
        while (i7 < i4) {
            int codePointAt = str.codePointAt(i7);
            int i8 = 43;
            int i9 = 127;
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z13) && !arsd.N(str2, (char) codePointAt) && (codePointAt != 37 || (z10 && (!z11 || az(str, i7, i4)))))) {
                if (codePointAt == 43 && z12) {
                    z12 = true;
                } else {
                    i7 += Character.charCount(codePointAt);
                }
            }
            asqu asquVar = new asqu();
            asquVar.R(str, i5, i7);
            asqu asquVar2 = null;
            while (i7 < i4) {
                int codePointAt2 = str.codePointAt(i7);
                if (z10) {
                    if (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12) {
                        if (codePointAt2 == 13) {
                            codePointAt2 = 13;
                        }
                    }
                    c = '%';
                    i7 += Character.charCount(codePointAt2);
                    z9 = true;
                    i8 = 43;
                    i9 = 127;
                }
                if (codePointAt2 == i8 && z12) {
                    if (z9 != z10) {
                        str3 = "%2B";
                    } else {
                        str3 = "+";
                    }
                    asquVar.Z(str3);
                    c = '%';
                    i7 += Character.charCount(codePointAt2);
                    z9 = true;
                    i8 = 43;
                    i9 = 127;
                } else {
                    if (codePointAt2 >= 32 && codePointAt2 != i9) {
                        if ((codePointAt2 < 128 || z13) && !arsd.N(str2, (char) codePointAt2)) {
                            if (codePointAt2 == 37) {
                                if (z10 && (!z11 || az(str, i7, i4))) {
                                    i6 = 37;
                                }
                            } else {
                                i6 = codePointAt2;
                            }
                            asquVar.S(codePointAt2);
                            codePointAt2 = i6;
                            c = '%';
                            i7 += Character.charCount(codePointAt2);
                            z9 = true;
                            i8 = 43;
                            i9 = 127;
                        }
                    }
                    if (asquVar2 == null) {
                        asquVar2 = new asqu();
                    }
                    asquVar2.S(codePointAt2);
                    while (!asquVar2.C()) {
                        byte d = asquVar2.d();
                        asquVar.M(37);
                        asquVar.M(aslx.a[(d & 255) >> 4]);
                        asquVar.M(aslx.a[d & 15]);
                    }
                    c = '%';
                    i7 += Character.charCount(codePointAt2);
                    z9 = true;
                    i8 = 43;
                    i9 = 127;
                }
            }
            return asquVar.m();
        }
        String substring = str.substring(i5, i4);
        substring.getClass();
        return substring;
    }

    public static final void as(String str) {
        if (str.length() > 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt < '!' || charAt >= 127) {
                    throw new IllegalArgumentException(asmt.j("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty");
    }

    public static final void at(String str, String str2) {
        String concat;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (charAt < ' ' || charAt >= 127)) {
                String j = asmt.j("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2);
                if (asmt.v(str2)) {
                    concat = "";
                } else {
                    concat = ": ".concat(String.valueOf(str));
                }
                throw new IllegalArgumentException(j.concat(concat));
            }
        }
    }

    public static final aslv au(String... strArr) {
        if ((strArr.length & 1) == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                String str = strArr2[i2];
                if (str != null) {
                    strArr2[i2] = arsd.D(str).toString();
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            int e = arhi.e(0, strArr2.length - 1, 2);
            if (e >= 0) {
                while (true) {
                    String str2 = strArr2[i];
                    String str3 = strArr2[i + 1];
                    as(str2);
                    at(str3, str2);
                    if (i == e) {
                        break;
                    }
                    i += 2;
                }
            }
            return new aslv(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values");
    }

    private static void av(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    private final void aw(long j, asqu asquVar, int i, List list, int i2, int i3, List list2) {
        int i4;
        int i5;
        int i6;
        long j2;
        int i7;
        asqu asquVar2;
        int i8;
        int i9 = i;
        if (i2 < i3) {
            for (int i10 = i2; i10 < i3; i10++) {
                if (((asqx) list.get(i10)).b() < i9) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            asqx asqxVar = (asqx) list.get(i2);
            asqx asqxVar2 = (asqx) list.get(i3 - 1);
            if (i9 == asqxVar.b()) {
                int i11 = i2 + 1;
                i5 = i11;
                i4 = ((Number) list2.get(i2)).intValue();
                asqxVar = (asqx) list.get(i11);
            } else {
                i4 = -1;
                i5 = i2;
            }
            int i12 = i5 + 1;
            if (asqxVar.a(i9) != asqxVar2.a(i9)) {
                int i13 = 1;
                while (i12 < i3) {
                    if (((asqx) list.get(i12 - 1)).a(i9) != ((asqx) list.get(i12)).a(i9)) {
                        i13++;
                    }
                    i12++;
                }
                long ax = j + ax(asquVar) + 2;
                int i14 = i13 + i13;
                asquVar.O(i13);
                asquVar.O(i4);
                for (int i15 = i5; i15 < i3; i15++) {
                    byte a2 = ((asqx) list.get(i15)).a(i9);
                    if (i15 == i5 || a2 != ((asqx) list.get(i15 - 1)).a(i9)) {
                        asquVar.O(a2 & 255);
                    }
                }
                asqu asquVar3 = new asqu();
                int i16 = i5;
                while (i16 < i3) {
                    int i17 = i9 + 1;
                    byte a3 = ((asqx) list.get(i16)).a(i9);
                    int i18 = i16 + 1;
                    int i19 = i18;
                    while (true) {
                        if (i19 < i3) {
                            if (a3 != ((asqx) list.get(i19)).a(i9)) {
                                i6 = i19;
                                break;
                            }
                            i19++;
                        } else {
                            i6 = i3;
                            break;
                        }
                    }
                    if (i18 == i6 && i17 == ((asqx) list.get(i16)).b()) {
                        asquVar.O(((Number) list2.get(i16)).intValue());
                        i8 = i14;
                        j2 = ax;
                        i7 = i6;
                        asquVar2 = asquVar3;
                    } else {
                        long j3 = ax + i14;
                        j2 = ax;
                        asquVar.O(-((int) (j3 + ax(asquVar3))));
                        i7 = i6;
                        asquVar2 = asquVar3;
                        i8 = i14;
                        aw(j3, asquVar3, i17, list, i16, i7, list2);
                    }
                    i16 = i7;
                    asquVar3 = asquVar2;
                    i14 = i8;
                    ax = j2;
                }
                asquVar.L(asquVar3);
                return;
            }
            int min = Math.min(asqxVar.b(), asqxVar2.b());
            int i20 = 0;
            for (int i21 = i9; i21 < min && asqxVar.a(i21) == asqxVar2.a(i21); i21++) {
                i20++;
            }
            long ax2 = j + ax(asquVar) + 2;
            long j4 = i20;
            asquVar.O(-i20);
            asquVar.O(i4);
            int i22 = i9 + i20;
            while (i9 < i22) {
                asquVar.O(asqxVar.a(i9) & 255);
                i9++;
            }
            if (i12 == i3) {
                if (i22 == ((asqx) list.get(i5)).b()) {
                    asquVar.O(((Number) list2.get(i5)).intValue());
                    return;
                }
                throw new IllegalStateException("Check failed.");
            }
            long j5 = ax2 + j4 + 1;
            asqu asquVar4 = new asqu();
            asquVar.O(-((int) (ax(asquVar4) + j5)));
            aw(j5, asquVar4, i22, list, i5, i3, list2);
            asquVar.L(asquVar4);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private static final long ax(asqu asquVar) {
        return asquVar.b / 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.net.InetAddress ay(java.lang.String r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aotl.ay(java.lang.String, int, int):java.net.InetAddress");
    }

    private static final boolean az(String str, int i, int i2) {
        int i3 = i + 2;
        if (i3 < i2 && str.charAt(i) == '%' && asmt.f(str.charAt(i + 1)) != -1 && asmt.f(str.charAt(i3)) != -1) {
            return true;
        }
        return false;
    }

    public static final void b(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aotg aotgVar = (aotg) aozyVar.b;
        aotg aotgVar2 = aotg.a;
        aotgVar.c = a.am(i);
    }

    public static int c() {
        return a.an(2);
    }

    public static /* synthetic */ String d(int i) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            return "UNRECOGNIZED";
                        }
                        return "PII_FORMAT_IGNORED";
                    }
                    return "PII_FORMAT_FULL";
                }
                return "PII_FORMAT_SHORT";
            }
            return "PII_FORMAT_NONE";
        }
        return "PII_FORMAT_UNDEFINED";
    }

    public static int e(int i) {
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
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                return 34;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                return 35;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                return 36;
            default:
                return 0;
        }
    }

    public static /* synthetic */ String f(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN_CATEGORY";
            case 2:
                return "AUTHENTICATION";
            case 3:
                return "FILE_TRANSFER";
            case 4:
                return "IMS";
            case 5:
                return "GROUPS";
            case 6:
                return "CHAT_SESSION";
            case 7:
                return "LOCATION";
            case 8:
                return "PRESENCE";
            default:
                return "SMS";
        }
    }

    public static final apdu g(apdw apdwVar) {
        apdv apdvVar = (apdv) apdwVar;
        if ((apdvVar.b & 1) != 0) {
            apdu apduVar = apdvVar.c;
            if (apduVar == null) {
                return apdu.a;
            }
            return apduVar;
        }
        return null;
    }

    public static final apdx h(apdw apdwVar) {
        apdv apdvVar = (apdv) apdwVar;
        if ((apdvVar.b & 2) != 0) {
            apdx apdxVar = apdvVar.d;
            if (apdxVar == null) {
                return apdx.a;
            }
            return apdxVar;
        }
        return null;
    }

    public static aozn i(Duration duration) {
        return apdp.e(duration.getSeconds(), duration.getNano());
    }

    public static apct j(Instant instant) {
        return apds.d(instant.getEpochSecond(), instant.getNano());
    }

    public static Duration k(aozn aoznVar) {
        return Duration.ofSeconds(apdp.e(aoznVar.b, aoznVar.c).b, r4.c);
    }

    public static Instant l(apct apctVar) {
        return Instant.ofEpochSecond(apds.d(apctVar.b, apctVar.c).b, r4.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m(java.lang.String r7) {
        /*
            int r0 = r7.length()
            r1 = 0
            r2 = r1
        L6:
            if (r2 == r0) goto L90
            int r3 = r2 + 1
            char r4 = r7.charAt(r2)
            r5 = 126(0x7e, float:1.77E-43)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 > r5) goto L1a
            r5 = 32
            if (r4 < r5) goto L21
            goto L48
        L1a:
            if (r4 >= r6) goto L21
            r5 = 160(0xa0, float:2.24E-43)
            if (r4 < r5) goto L21
            goto L48
        L21:
            if (r4 >= r6) goto L34
            r2 = 10
            if (r4 == r2) goto L48
            r2 = 13
            if (r4 == r2) goto L48
            r2 = 9
            if (r4 == r2) goto L48
            r2 = 12
            if (r4 == r2) goto L48
            goto L58
        L34:
            r5 = 57343(0xdfff, float:8.0355E-41)
            r6 = 65534(0xfffe, float:9.1833E-41)
            if (r4 <= r5) goto L4a
            r2 = 64976(0xfdd0, float:9.1051E-41)
            if (r4 < r2) goto L48
            r2 = 65007(0xfdef, float:9.1094E-41)
            if (r4 <= r2) goto L58
            if (r4 >= r6) goto L58
        L48:
            r2 = r3
            goto L6
        L4a:
            int r3 = java.lang.Character.codePointAt(r7, r2)
            r4 = 65536(0x10000, float:9.1835E-41)
            if (r3 < r4) goto L58
            r3 = r3 & r6
            if (r3 == r6) goto L58
            int r2 = r2 + 2
            goto L6
        L58:
            int r0 = r7.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
        L61:
            if (r1 >= r0) goto L8c
            char r3 = r7.charAt(r1)
            boolean r4 = n(r3)
            if (r4 == 0) goto L73
            r2.append(r3)
            int r1 = r1 + 1
            goto L61
        L73:
            int r3 = java.lang.Character.codePointAt(r7, r1)
            boolean r4 = n(r3)
            r5 = 1
            if (r5 == r4) goto L82
            r4 = 65533(0xfffd, float:9.1831E-41)
            goto L83
        L82:
            r4 = r3
        L83:
            r2.appendCodePoint(r4)
            int r3 = java.lang.Character.charCount(r3)
            int r1 = r1 + r3
            goto L61
        L8c:
            java.lang.String r7 = r2.toString()
        L90:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aotl.m(java.lang.String):java.lang.String");
    }

    public static boolean n(int i) {
        if (i <= 126) {
            if (i < 32 && i != 10 && i != 13 && i != 9 && i != 12) {
                return false;
            }
            return true;
        }
        if (i < 55296) {
            if (i < 160) {
                return false;
            }
            return true;
        }
        if (i < 64976) {
            if (i <= 57343) {
                return false;
            }
            return true;
        }
        if (i <= 65007 || (i & 65534) == 65534 || i > 1114111) {
            return false;
        }
        return true;
    }

    public static int o(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            if (i != 5) {
                if (i != 10) {
                    if (i != 20) {
                        return 0;
                    }
                    return 21;
                }
                return 11;
            }
            return 6;
        }
        return 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0056, code lost:
    
        if ((r0 & 4096) != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:
    
        r0 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0064, code lost:
    
        if ((r0 & (1 << r2)) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a6, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0082, code lost:
    
        if (r0 != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0096, code lost:
    
        if ((r0 & 16) != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a2, code lost:
    
        if ((r0 & 15) == r8.h()) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int p(java.lang.CharSequence r7, defpackage.aose r8) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aotl.p(java.lang.CharSequence, aose):int");
    }

    public static String q(String str) {
        return "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str);
    }

    public static aood r(aoro aoroVar) {
        boolean z;
        try {
            try {
                aoroVar.t();
                try {
                    return aopt.e(aoroVar);
                } catch (EOFException e) {
                    e = e;
                    z = false;
                    if (z) {
                        return aoof.a;
                    }
                    throw new aook(e);
                }
            } catch (aorq e2) {
                throw new aook(e2);
            } catch (IOException e3) {
                throw new aooe(e3);
            } catch (NumberFormatException e4) {
                throw new aook(e4);
            }
        } catch (EOFException e5) {
            e = e5;
            z = true;
        }
    }

    public static void s(aood aoodVar, aorp aorpVar) {
        aorg.T.b(aorpVar, aoodVar);
    }

    public static boolean t(AccessibleObject accessibleObject, Object obj) {
        return aopm.b.a(accessibleObject, obj);
    }

    public static int u(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int a2 = ((aool) it.next()).a();
            if (a2 != 2) {
                return a2;
            }
        }
        return 1;
    }

    public static Class v(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Void.TYPE) {
            return Void.class;
        }
        return cls;
    }

    public static BigDecimal w(String str) {
        av(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(String.valueOf(str)));
    }

    public static BigInteger x(String str) {
        av(str);
        return new BigInteger(str);
    }

    public static /* synthetic */ Number y(int i, aoro aoroVar) {
        if (i - 1 != 0) {
            return new aopb(aoroVar.j());
        }
        return Double.valueOf(aoroVar.a());
    }

    public static aood z(aoro aoroVar) {
        int i = aoroVar.i;
        if (i == 2) {
            aoroVar.u(1);
        }
        try {
            try {
                return r(aoroVar);
            } catch (OutOfMemoryError e) {
                throw new aooh(a.bX(aoroVar, "Failed parsing JSON source: ", " to Json"), e);
            } catch (StackOverflowError e2) {
                throw new aooh(a.bX(aoroVar, "Failed parsing JSON source: ", " to Json"), e2);
            }
        } finally {
            aoroVar.u(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.asrf P(defpackage.asqx... r12) {
        /*
            r11 = this;
            java.util.List r5 = defpackage.aqil.q(r12)
            defpackage.aqjn.L(r5)
            int r0 = r5.size()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            r9 = 0
            r1 = r9
        L12:
            if (r1 >= r0) goto L1f
            r2 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8.add(r2)
            int r1 = r1 + 1
            goto L12
        L1f:
            int r0 = r12.length
            r1 = r9
            r2 = r1
        L22:
            if (r1 >= r0) goto L37
            r3 = r12[r1]
            int r4 = r2 + 1
            int r3 = defpackage.aqjn.H(r5, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8.set(r3, r2)
            int r1 = r1 + 1
            r2 = r4
            goto L22
        L37:
            java.lang.Object r0 = r5.get(r9)
            asqx r0 = (defpackage.asqx) r0
            int r0 = r0.b()
            if (r0 <= 0) goto Lde
            r0 = r9
        L44:
            int r1 = r5.size()
            if (r0 >= r1) goto Laa
            java.lang.Object r1 = r5.get(r0)
            asqx r1 = (defpackage.asqx) r1
            int r2 = r0 + 1
            r3 = r2
        L53:
            int r4 = r5.size()
            if (r3 >= r4) goto La8
            java.lang.Object r4 = r5.get(r3)
            asqx r4 = (defpackage.asqx) r4
            boolean r6 = r4.i(r1)
            if (r6 == 0) goto La8
            int r6 = r4.b()
            int r7 = r1.b()
            if (r6 == r7) goto L95
            java.lang.Object r4 = r8.get(r3)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Object r6 = r8.get(r0)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r4 <= r6) goto L92
            r5.remove(r3)
            java.lang.Object r4 = r8.remove(r3)
            java.lang.Number r4 = (java.lang.Number) r4
            r4.intValue()
            goto L53
        L92:
            int r3 = r3 + 1
            goto L53
        L95:
            java.util.Objects.toString(r4)
            java.lang.String r12 = java.lang.String.valueOf(r4)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "duplicate option: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        La8:
            r0 = r2
            goto L44
        Laa:
            asqu r10 = new asqu
            r10.<init>()
            r6 = 0
            int r7 = r5.size()
            r1 = 0
            r4 = 0
            r0 = r11
            r3 = r10
            r0.aw(r1, r3, r4, r5, r6, r7, r8)
            long r0 = ax(r10)
            int r0 = (int) r0
            int[] r1 = new int[r0]
        Lc3:
            if (r9 >= r0) goto Lce
            int r2 = r10.f()
            r1[r9] = r2
            int r9 = r9 + 1
            goto Lc3
        Lce:
            int r0 = r12.length
            asrf r2 = new asrf
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r0)
            r12.getClass()
            asqx[] r12 = (defpackage.asqx[]) r12
            r2.<init>(r12, r1)
            return r2
        Lde:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "the empty byte string is not a supported option"
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aotl.P(asqx[]):asrf");
    }

    public aotl(aqut aqutVar) {
        aqutVar.getClass();
    }

    public aotl(char[] cArr) {
        new asti(128);
        new asti(256);
    }

    public aotl(Object obj) {
        obj.getClass();
    }
}
