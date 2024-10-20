package defpackage;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anbj {
    private static final algc a = new alfs('.');
    private static final algc b = new alfs(':');

    static {
    }

    public static InetAddress a(String str) {
        aodz aodzVar = new aodz((char[]) null);
        byte[] f = f(str, aodzVar);
        if (f != null) {
            return d(f, (String) aodzVar.a);
        }
        throw c("'%s' is not an IP string literal.", str);
    }

    public static boolean b(String str) {
        if (f(str, null) != null) {
            return true;
        }
        return false;
    }

    private static IllegalArgumentException c(String str, Object... objArr) {
        return new IllegalArgumentException(String.format(Locale.ROOT, str, objArr));
    }

    private static InetAddress d(byte[] bArr, String str) {
        try {
            InetAddress byAddress = InetAddress.getByAddress(bArr);
            if (str == null) {
                return byAddress;
            }
            d.t(byAddress instanceof Inet6Address, "Unexpected state, scope should only appear for ipv6");
            Inet6Address inet6Address = (Inet6Address) byAddress;
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (i <= 214748364) {
                    int i3 = i * 10;
                    int digit = Character.digit(str.charAt(i2), 10);
                    if (digit >= 0) {
                        i = i3 + digit;
                    }
                }
                i = -1;
            }
            if (i != -1) {
                return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), i);
            }
            try {
                NetworkInterface byName = NetworkInterface.getByName(str);
                if (byName != null) {
                    return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), byName);
                }
                throw c("No such interface: '%s'", str);
            } catch (SocketException | UnknownHostException e) {
                throw new IllegalArgumentException(a.cp(str, "No such interface: "), e);
            }
        } catch (UnknownHostException e2) {
            throw new AssertionError(e2);
        }
    }

    private static byte[] e(String str) {
        if (a.k(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int indexOf = str.indexOf(46, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int i3 = indexOf - i;
            if (i3 > 0 && i3 <= 3) {
                if (i3 > 1) {
                    try {
                        if (str.charAt(i) == '0') {
                            throw new NumberFormatException();
                        }
                    } catch (NumberFormatException unused) {
                        return null;
                    }
                }
                int i4 = 0;
                while (i < indexOf) {
                    int i5 = i4 * 10;
                    int digit = Character.digit(str.charAt(i), 10);
                    if (digit >= 0) {
                        i4 = i5 + digit;
                        i++;
                    } else {
                        throw new NumberFormatException();
                    }
                }
                if (i4 <= 255) {
                    bArr[i2] = (byte) i4;
                    i = indexOf + 1;
                } else {
                    throw new NumberFormatException();
                }
            } else {
                throw new NumberFormatException();
            }
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0146, code lost:
    
        r14.putShort((short) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0152, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0157, code lost:
    
        return r14.array();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x010e, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0100, code lost:
    
        if (r14 == 8) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0158, code lost:
    
        if (r2 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x015a, code lost:
    
        if (r1 == (-1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x015c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0161, code lost:
    
        return e(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0162, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0032, code lost:
    
        if (r3 == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        if (r2 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0039, code lost:
    
        r2 = r13.lastIndexOf(58) + 1;
        r10 = r13.substring(0, r2);
        r13 = e(r13.substring(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
    
        if (r13 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (r13 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004e, code lost:
    
        r13 = r10 + java.lang.Integer.toHexString(((r13[0] & 255) << 8) | (r13[1] & 255)) + ":" + java.lang.Integer.toHexString((r13[3] & 255) | ((r13[2] & 255) << 8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (r1 == (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
    
        if (r14 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        r14.a = r13.substring(r1 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        r13 = r13.substring(0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        r14 = defpackage.anbj.b.k(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        if (r14 < 2) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        if (r14 <= 8) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a2, code lost:
    
        r14 = r14 + 1;
        r1 = 8 - r14;
        r2 = 0;
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ac, code lost:
    
        if (r2 >= (r13.length() - 1)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
    
        if (r13.charAt(r2) != ':') goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ba, code lost:
    
        if (r13.charAt(r2 + 1) != ':') goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bc, code lost:
    
        if (r3 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c0, code lost:
    
        r3 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c2, code lost:
    
        if (r2 != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c4, code lost:
    
        r3 = r1 + 2;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cd, code lost:
    
        if (r2 != (r13.length() - 2)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cf, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d1, code lost:
    
        r1 = r3;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d9, code lost:
    
        if (r13.charAt(0) != ':') goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00df, code lost:
    
        if (r13.charAt(1) == ':') goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ec, code lost:
    
        if (r13.charAt(r13.length() - 1) != ':') goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f8, code lost:
    
        if (r13.charAt(r13.length() - 2) == ':') goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fb, code lost:
    
        if (r3 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00fd, code lost:
    
        if (r1 > 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0103, code lost:
    
        r14 = java.nio.ByteBuffer.allocate(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010b, code lost:
    
        if (r13.charAt(0) != ':') goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0113, code lost:
    
        if (r9 >= r13.length()) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0115, code lost:
    
        r2 = r13.indexOf(58, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0119, code lost:
    
        if (r2 != (-1)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x011b, code lost:
    
        r2 = r13.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0123, code lost:
    
        if (r13.charAt(r9) != ':') goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0125, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0126, code lost:
    
        if (r3 >= r1) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0128, code lost:
    
        r14.putShort(0);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x014a, code lost:
    
        r9 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x012e, code lost:
    
        r3 = r2 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0130, code lost:
    
        if (r3 <= 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0133, code lost:
    
        if (r3 > 4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0135, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0136, code lost:
    
        if (r9 >= r2) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0138, code lost:
    
        r3 = (r3 << 4) | java.lang.Character.digit(r13.charAt(r9), 16);
        r9 = r9 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] f(java.lang.String r13, defpackage.aodz r14) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anbj.f(java.lang.String, aodz):byte[]");
    }
}
