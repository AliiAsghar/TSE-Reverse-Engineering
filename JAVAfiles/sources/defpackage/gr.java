package defpackage;

import android.util.Base64;
import android.util.SparseArray;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gr {
    private static final alvi a = alvi.m("android/support/v7/mms/pdu/PduParser");
    private static final String[] b = {"/type=plmn@tmomail.net", "/type=plmn@mmsc1.mtel.ba", "/type=plmn@mmsc1.hteronet.ba"};
    private static byte[] c = null;
    private static byte[] d = null;
    private ByteArrayInputStream e;
    private final boolean g;
    private gp f = null;
    private gqg h = null;

    public gr(byte[] bArr, boolean z) {
        this.e = null;
        this.e = new ByteArrayInputStream(bArr);
        this.g = z;
    }

    private static int b(ByteArrayInputStream byteArrayInputStream) {
        return byteArrayInputStream.read() & 255;
    }

    private static int c(ByteArrayInputStream byteArrayInputStream) {
        return byteArrayInputStream.read() & 127;
    }

    private static int d(ByteArrayInputStream byteArrayInputStream) {
        int read = byteArrayInputStream.read();
        if (read != -1) {
            int i = 0;
            do {
                i = (i << 7) | (read & 127);
                if ((read & 128) != 0) {
                    read = byteArrayInputStream.read();
                } else {
                    return i;
                }
            } while (read != -1);
        }
        return -1;
    }

    private static int e(ByteArrayInputStream byteArrayInputStream) {
        int read = byteArrayInputStream.read() & 255;
        if (read <= 30) {
            return read;
        }
        if (read == 31) {
            return d(byteArrayInputStream);
        }
        throw new gq();
    }

    private static int f(ByteArrayInputStream byteArrayInputStream, int i) {
        int read = byteArrayInputStream.read(new byte[i], 0, i);
        if (read < i) {
            return -1;
        }
        return read;
    }

    private static long g(ByteArrayInputStream byteArrayInputStream) {
        byteArrayInputStream.mark(1);
        int read = byteArrayInputStream.read();
        byteArrayInputStream.reset();
        if (read > 127) {
            return c(byteArrayInputStream);
        }
        return h(byteArrayInputStream);
    }

    private static long h(ByteArrayInputStream byteArrayInputStream) {
        int read = byteArrayInputStream.read() & 255;
        if (read <= 8) {
            long j = 0;
            for (int i = 0; i < read; i++) {
                j = (j << 8) + (byteArrayInputStream.read() & 255);
            }
            return j;
        }
        throw new RuntimeException("Octet count greater than 8 and I can't represent that!");
    }

    private static gi i(ByteArrayInputStream byteArrayInputStream) {
        int i;
        gi giVar;
        byteArrayInputStream.mark(1);
        int read = byteArrayInputStream.read() & 255;
        if (read == 0) {
            return new gi("");
        }
        byteArrayInputStream.reset();
        if (read < 32) {
            e(byteArrayInputStream);
            i = c(byteArrayInputStream);
        } else {
            i = 0;
        }
        byte[] l = l(byteArrayInputStream, 0);
        try {
            if (i != 0) {
                giVar = new gi(i, l);
            } else {
                giVar = new gi(l);
            }
            return giVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0061. Please report as an issue. */
    private static gp j(ByteArrayInputStream byteArrayInputStream) {
        gi giVar;
        byte[] e;
        String[] strArr;
        int i;
        gp gpVar = new gp();
        int i2 = 1;
        boolean z = true;
        while (z && byteArrayInputStream.available() > 0) {
            byteArrayInputStream.mark(i2);
            int b2 = b(byteArrayInputStream);
            if (b2 >= 32 && b2 <= 127) {
                byteArrayInputStream.reset();
                byte[] l = l(byteArrayInputStream, 0);
                alvw f = a.f();
                f.X(alwp.a, "PduParser");
                ((alvg) ((alvg) f).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 221, "PduParser.java")).t("TextHeader: %s", new String(l));
            } else {
                switch (b2) {
                    case 129:
                    case 130:
                    case 151:
                        gi i3 = i(byteArrayInputStream);
                        if (i3 != null) {
                            byte[] e2 = i3.e();
                            if (e2 != null) {
                                String str = new String(e2);
                                alvw f2 = a.f();
                                f2.X(alwp.a, "PduParser");
                                ((alvg) ((alvg) f2).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 425, "PduParser.java")).u("parseHeaders: (to/cc/bcc) address: %d redacted-pii[%d-chars]", b2, str.length());
                                int indexOf = str.indexOf(47);
                                if (indexOf > 0) {
                                    str = str.substring(0, indexOf);
                                }
                                try {
                                    i3.d(str.getBytes());
                                } catch (NullPointerException e3) {
                                    alvw h = a.h();
                                    h.X(alwp.a, "PduParser");
                                    ((alvg) ((alvg) ((alvg) h).g(e3)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 435, "PduParser.java")).r("Null pointer error parsing address for header field: %d", b2);
                                    return null;
                                }
                            }
                            try {
                                gpVar.f(i3, b2);
                            } catch (NullPointerException e4) {
                                alvw h2 = a.h();
                                h2.X(alwp.a, "PduParser");
                                ((alvg) ((alvg) ((alvg) h2).g(e4)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 444, "PduParser.java")).u("Null pointer error while appending string value to headers, redacted-pii[%d-chars], header field: %d", i3.a(), b2);
                            } catch (RuntimeException e5) {
                                alvw h3 = a.h();
                                h3.X(alwp.a, "PduParser");
                                ((alvg) ((alvg) ((alvg) h3).g(e5)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 449, "PduParser.java")).r("%d is not Encoded-String-Value header field!", b2);
                                return null;
                            }
                        }
                        z = true;
                        i2 = 1;
                        break;
                    case 131:
                    case 139:
                    case 152:
                    case 158:
                    case 183:
                    case 184:
                    case 185:
                    case 189:
                    case 190:
                        byte[] l2 = l(byteArrayInputStream, 0);
                        if (l2 != null) {
                            try {
                                alvw f3 = a.f();
                                f3.X(alwp.a, "PduParser");
                                alvg alvgVar = (alvg) ((alvg) f3).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 370, "PduParser.java");
                                Integer valueOf = Integer.valueOf(b2);
                                alvgVar.J("parseHeaders: headerField: %d (%02x) CONTENT_LOCATION redacted-pii[%d-chars]", valueOf, valueOf, Integer.valueOf(l2.length));
                                gpVar.j(l2, b2);
                            } catch (NullPointerException e6) {
                                alvw h4 = a.h();
                                h4.X(alwp.a, "PduParser");
                                ((alvg) ((alvg) ((alvg) h4).g(e6)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", (char) 375, "PduParser.java")).q("Null pointer error while parsing content location");
                            } catch (RuntimeException e7) {
                                alvw h5 = a.h();
                                h5.X(alwp.a, "PduParser");
                                ((alvg) ((alvg) ((alvg) h5).g(e7)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 378, "PduParser.java")).r("%d is not Text-String header field!", b2);
                                return null;
                            }
                        }
                        z = true;
                        i2 = 1;
                        break;
                    case 132:
                        SparseArray sparseArray = new SparseArray();
                        byte[] k = k(byteArrayInputStream, sparseArray);
                        if (k != null) {
                            try {
                                alvw f4 = a.f();
                                f4.X(alwp.a, "PduParser");
                                alvg alvgVar2 = (alvg) ((alvg) f4).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 766, "PduParser.java");
                                Integer valueOf2 = Integer.valueOf(b2);
                                alvgVar2.J("parseHeaders: headerField: %d (%02x) CONTENT_TYPE %s", valueOf2, valueOf2, new String(k));
                                gpVar.j(k, 132);
                            } catch (NullPointerException e8) {
                                alvw h6 = a.h();
                                h6.X(alwp.a, "PduParser");
                                ((alvg) ((alvg) ((alvg) h6).g(e8)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", (char) 771, "PduParser.java")).q("Null pointer error while setting the content type");
                            } catch (RuntimeException e9) {
                                alvw h7 = a.h();
                                h7.X(alwp.a, "PduParser");
                                ((alvg) ((alvg) ((alvg) h7).g(e9)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 774, "PduParser.java")).r("%d is not Text-String header field!", b2);
                                return null;
                            }
                        }
                        d = (byte[]) sparseArray.get(153);
                        c = (byte[]) sparseArray.get(131);
                        z = false;
                        i2 = 1;
                        break;
                    case 133:
                    case 142:
                    case 159:
                        try {
                            long h8 = h(byteArrayInputStream);
                            alvw f5 = a.f();
                            f5.X(alwp.a, "PduParser");
                            alvg alvgVar3 = (alvg) ((alvg) f5).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 317, "PduParser.java");
                            Integer valueOf3 = Integer.valueOf(b2);
                            alvgVar3.J("parseHeaders: headerField: %d (%02x) Octet value %d", valueOf3, valueOf3, Long.valueOf(h8));
                            gpVar.h(h8, b2);
                            z = true;
                            i2 = 1;
                            break;
                        } catch (RuntimeException e10) {
                            alvw h9 = a.h();
                            h9.X(alwp.a, "PduParser");
                            ((alvg) ((alvg) ((alvg) h9).g(e10)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 322, "PduParser.java")).r("%d is not Long-Integer header field!", b2);
                            return null;
                        }
                    case 134:
                    case 143:
                    case 144:
                    case 145:
                    case 146:
                    case 148:
                    case 149:
                    case 153:
                    case 155:
                    case 156:
                    case 162:
                    case 163:
                    case 165:
                    case 167:
                    case 169:
                    case 171:
                    case 177:
                    case 180:
                    case 186:
                    case 187:
                    case 188:
                    case 191:
                        int b3 = b(byteArrayInputStream);
                        alvw f6 = a.f();
                        f6.X(alwp.a, "PduParser");
                        alvg alvgVar4 = (alvg) ((alvg) f6).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 293, "PduParser.java");
                        Integer valueOf4 = Integer.valueOf(b2);
                        alvgVar4.J("parseHeaders: headerField: %d (%02x) Octet value %d", valueOf4, valueOf4, Integer.valueOf(b3));
                        try {
                            gpVar.i(b3, b2);
                            z = true;
                            i2 = 1;
                            break;
                        } catch (gk e11) {
                            alvw h10 = a.h();
                            h10.X(alwp.a, "PduParser");
                            ((alvg) ((alvg) ((alvg) h10).g(e11)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 300, "PduParser.java")).u("Set invalid Octet value: %d into the header filed: %d", b3, b2);
                            return null;
                        } catch (RuntimeException e12) {
                            alvw h11 = a.h();
                            h11.X(alwp.a, "PduParser");
                            ((alvg) ((alvg) ((alvg) h11).g(e12)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 304, "PduParser.java")).r("%d is not Octet header field!", b2);
                            return null;
                        }
                    case 135:
                    case 136:
                    case 157:
                        e(byteArrayInputStream);
                        int b4 = b(byteArrayInputStream);
                        try {
                            long h12 = h(byteArrayInputStream);
                            if (b4 == 129) {
                                h12 += System.currentTimeMillis() / 1000;
                            }
                            try {
                                alvw f7 = a.f();
                                f7.X(alwp.a, "PduParser");
                                alvg alvgVar5 = (alvg) ((alvg) f7).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 485, "PduParser.java");
                                Integer valueOf5 = Integer.valueOf(b2);
                                alvgVar5.J("parseHeaders: headerField: %d (%02x) time value %d", valueOf5, valueOf5, Long.valueOf(h12));
                                gpVar.h(h12, b2);
                                z = true;
                                i2 = 1;
                                break;
                            } catch (RuntimeException e13) {
                                alvw h13 = a.h();
                                h13.X(alwp.a, "PduParser");
                                ((alvg) ((alvg) ((alvg) h13).g(e13)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 490, "PduParser.java")).r("%d is not Long-Integer header field!", b2);
                                return null;
                            }
                        } catch (RuntimeException e14) {
                            alvw h14 = a.h();
                            h14.X(alwp.a, "PduParser");
                            ((alvg) ((alvg) ((alvg) h14).g(e14)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 474, "PduParser.java")).r("%d is not Long-Integer header field!", b2);
                            return null;
                        }
                    case 137:
                        e(byteArrayInputStream);
                        if (b(byteArrayInputStream) == 128) {
                            giVar = i(byteArrayInputStream);
                            if (giVar != null && (e = giVar.e()) != null) {
                                String str2 = new String(e);
                                String[] strArr2 = b;
                                int i4 = 0;
                                while (true) {
                                    if (i4 < 3) {
                                        String str3 = strArr2[i4];
                                        int indexOf2 = str2.toLowerCase(Locale.US).indexOf(str3);
                                        if (indexOf2 > 0) {
                                            strArr = strArr2;
                                            if (str2.length() == indexOf2 + str3.length()) {
                                                alvw g = a.g();
                                                g.X(alwp.a, "PduParser");
                                                ((alvg) ((alvg) g).h("android/support/v7/mms/pdu/PduParser", "stripAddressingIndicator", 811, "PduParser.java")).t("Irregular addressing indicator found, removing %s", str3);
                                                str2 = str2.substring(0, indexOf2);
                                            }
                                        } else {
                                            strArr = strArr2;
                                        }
                                        i4++;
                                        strArr2 = strArr;
                                    } else {
                                        int indexOf3 = str2.indexOf("/TYPE=");
                                        int lastIndexOf = str2.lastIndexOf(64);
                                        if (indexOf3 > 0 && lastIndexOf < 0) {
                                            alvw g2 = a.g();
                                            g2.X(alwp.a, "PduParser");
                                            ((alvg) ((alvg) g2).h("android/support/v7/mms/pdu/PduParser", "stripAddressingIndicator", 823, "PduParser.java")).q("Phone number addressing indicator found, removing");
                                            str2 = str2.substring(0, indexOf3);
                                        } else {
                                            alvw g3 = a.g();
                                            g3.X(alwp.a, "PduParser");
                                            ((alvg) ((alvg) g3).h("android/support/v7/mms/pdu/PduParser", "stripAddressingIndicator", 827, "PduParser.java")).q("No addressing indicator found, using phone number as is.");
                                        }
                                    }
                                }
                                try {
                                    giVar.d(str2.getBytes());
                                } catch (NullPointerException e15) {
                                    alvw h15 = a.h();
                                    h15.X(alwp.a, "PduParser");
                                    ((alvg) ((alvg) ((alvg) h15).g(e15)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", (char) 521, "PduParser.java")).q("Null pointer error while parsing From: address.");
                                    return null;
                                }
                            }
                        } else {
                            try {
                                giVar = new gi("insert-address-token".getBytes());
                            } catch (NullPointerException e16) {
                                alvw h16 = a.h();
                                h16.X(alwp.a, "PduParser");
                                ((alvg) ((alvg) ((alvg) h16).g(e16)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 531, "PduParser.java")).r("%d is not Encoded-String-Value header field!", b2);
                                return null;
                            }
                        }
                        gi giVar2 = giVar;
                        try {
                            alvw f8 = a.f();
                            f8.X(alwp.a, "PduParser");
                            alvg alvgVar6 = (alvg) ((alvg) f8).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 538, "PduParser.java");
                            Integer valueOf6 = Integer.valueOf(b2);
                            alvgVar6.J("parseHeaders: headerField: %d (%02x) from address redacted-pii[%d-chars]", valueOf6, valueOf6, Integer.valueOf(giVar2.a()));
                            gpVar.g(giVar2, 137);
                        } catch (NullPointerException e17) {
                            alvw h17 = a.h();
                            h17.X(alwp.a, "PduParser");
                            ((alvg) ((alvg) ((alvg) h17).g(e17)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 543, "PduParser.java")).r("Null pointer error while setting encoded string value for headers, from redacted-pii[%d-chars]", giVar2.a());
                        } catch (RuntimeException e18) {
                            alvw h18 = a.h();
                            h18.X(alwp.a, "PduParser");
                            ((alvg) ((alvg) ((alvg) h18).g(e18)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 548, "PduParser.java")).r("%d is not Encoded-String-Value header field!", b2);
                            return null;
                        }
                        z = true;
                        i2 = 1;
                        break;
                    case 138:
                        byteArrayInputStream.mark(1);
                        int b5 = b(byteArrayInputStream);
                        alvw f9 = a.f();
                        f9.X(alwp.a, "PduParser");
                        alvg alvgVar7 = (alvg) ((alvg) f9).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 560, "PduParser.java");
                        Integer valueOf7 = Integer.valueOf(b2);
                        alvgVar7.J("parseHeaders: headerField: %d (%02x) MESSAGE_CLASS %d", valueOf7, valueOf7, Integer.valueOf(b5));
                        if (b5 >= 128) {
                            if (b5 == 128) {
                                try {
                                    try {
                                        gpVar.j("personal".getBytes(), 138);
                                    } catch (NullPointerException e19) {
                                        e = e19;
                                        i = b5;
                                        alvw h19 = a.h();
                                        h19.X(alwp.a, "PduParser");
                                        ((alvg) ((alvg) ((alvg) h19).g(e)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 583, "PduParser.java")).r("Null pointer error while setting message class, message class: %d", i);
                                        z = true;
                                        i2 = 1;
                                    }
                                } catch (RuntimeException e20) {
                                    alvw h20 = a.h();
                                    h20.X(alwp.a, "PduParser");
                                    ((alvg) ((alvg) ((alvg) h20).g(e20)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 587, "PduParser.java")).r("%d is not Text-String header field!", b2);
                                    return null;
                                }
                            } else if (b5 == 129) {
                                gpVar.j("advertisement".getBytes(), 138);
                            } else if (b5 == 130) {
                                gpVar.j("informational".getBytes(), 138);
                            } else if (b5 == 131) {
                                try {
                                    gpVar.j("auto".getBytes(), 138);
                                } catch (NullPointerException e21) {
                                    e = e21;
                                    i = 131;
                                    alvw h192 = a.h();
                                    h192.X(alwp.a, "PduParser");
                                    ((alvg) ((alvg) ((alvg) h192).g(e)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 583, "PduParser.java")).r("Null pointer error while setting message class, message class: %d", i);
                                    z = true;
                                    i2 = 1;
                                }
                            }
                        } else {
                            byteArrayInputStream.reset();
                            byte[] l3 = l(byteArrayInputStream, 0);
                            if (l3 != null) {
                                try {
                                    gpVar.j(l3, 138);
                                } catch (NullPointerException e22) {
                                    alvw h21 = a.h();
                                    h21.X(alwp.a, "PduParser");
                                    ((alvg) ((alvg) ((alvg) h21).g(e22)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", (char) 599, "PduParser.java")).q("Null pointer error while setting non-personal message class");
                                } catch (RuntimeException e23) {
                                    alvw h22 = a.h();
                                    h22.X(alwp.a, "PduParser");
                                    ((alvg) ((alvg) ((alvg) h22).g(e23)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 602, "PduParser.java")).r("%d is not Text-String header field!", b2);
                                    return null;
                                }
                            }
                        }
                        z = true;
                        i2 = 1;
                    case 140:
                        int b6 = b(byteArrayInputStream);
                        alvw f10 = a.f();
                        f10.X(alwp.a, "PduParser");
                        ((alvg) ((alvg) f10).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 229, "PduParser.java")).u("parseHeaders: messageType: %d headerField (%02x)", b6, b2);
                        switch (b6) {
                            case 137:
                            case 138:
                            case 139:
                            case 140:
                            case 141:
                            case 142:
                            case 143:
                            case 144:
                            case 145:
                            case 146:
                            case 147:
                            case 148:
                            case 149:
                            case 150:
                            case 151:
                                return null;
                            default:
                                try {
                                    gpVar.i(b6, b2);
                                    break;
                                } catch (gk e24) {
                                    alvw h23 = a.h();
                                    h23.X(alwp.a, "PduParser");
                                    ((alvg) ((alvg) ((alvg) h23).g(e24)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 254, "PduParser.java")).u("Set invalid Octet value: %d into the header filed: %d", b6, b2);
                                    return null;
                                } catch (RuntimeException e25) {
                                    alvw h24 = a.h();
                                    h24.X(alwp.a, "PduParser");
                                    ((alvg) ((alvg) ((alvg) h24).g(e25)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 259, "PduParser.java")).r("%d is not Octet header field!", b2);
                                    return null;
                                }
                        }
                        z = true;
                        i2 = 1;
                        break;
                    case 141:
                        int c2 = c(byteArrayInputStream);
                        try {
                            alvw f11 = a.f();
                            f11.X(alwp.a, "PduParser");
                            alvg alvgVar8 = (alvg) ((alvg) f11).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 616, "PduParser.java");
                            Integer valueOf8 = Integer.valueOf(b2);
                            alvgVar8.J("parseHeaders: headerField: %d (%02x) MMS_VERSION %d", valueOf8, valueOf8, Integer.valueOf(c2));
                            gpVar.i(c2, 141);
                            z = true;
                            i2 = 1;
                            break;
                        } catch (gk e26) {
                            alvw h25 = a.h();
                            h25.X(alwp.a, "PduParser");
                            ((alvg) ((alvg) ((alvg) h25).g(e26)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 621, "PduParser.java")).u("Set invalid Octet value: %d into the header field: %d", c2, b2);
                            return null;
                        } catch (RuntimeException e27) {
                            alvw h26 = a.h();
                            h26.X(alwp.a, "PduParser");
                            ((alvg) ((alvg) ((alvg) h26).g(e27)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 625, "PduParser.java")).r("%d is not Octet header field!", b2);
                            return null;
                        }
                    case 147:
                    case 150:
                    case 154:
                    case 166:
                    case 181:
                    case 182:
                        gi i5 = i(byteArrayInputStream);
                        if (i5 != null) {
                            try {
                                alvw f12 = a.f();
                                f12.X(alwp.a, "PduParser");
                                alvg alvgVar9 = (alvg) ((alvg) f12).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 399, "PduParser.java");
                                Integer valueOf9 = Integer.valueOf(b2);
                                alvgVar9.J("parseHeaders: headerField: %d (%02x) encoded string %s", valueOf9, valueOf9, i5.b());
                                gpVar.g(i5, b2);
                            } catch (NullPointerException e28) {
                                alvw h27 = a.h();
                                h27.X(alwp.a, "PduParser");
                                ((alvg) ((alvg) ((alvg) h27).g(e28)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", (char) 404, "PduParser.java")).q("Null pointer error while parsing response text.");
                            } catch (RuntimeException e29) {
                                alvw h28 = a.h();
                                h28.X(alwp.a, "PduParser");
                                ((alvg) ((alvg) ((alvg) h28).g(e29)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 407, "PduParser.java")).r("%d is not Encoded-String-Value header field!", b2);
                                return null;
                            }
                        }
                        z = true;
                        i2 = 1;
                        break;
                    case 160:
                        e(byteArrayInputStream);
                        try {
                            g(byteArrayInputStream);
                            gi i6 = i(byteArrayInputStream);
                            if (i6 != null) {
                                try {
                                    alvw f13 = a.f();
                                    f13.X(alwp.a, "PduParser");
                                    alvg alvgVar10 = (alvg) ((alvg) f13).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 650, "PduParser.java");
                                    Integer valueOf10 = Integer.valueOf(b2);
                                    alvgVar10.J("parseHeaders: headerField: %d (%02x) PREVIOUSLY_SENT_BY: %s", valueOf10, valueOf10, i6.b());
                                    gpVar.g(i6, 160);
                                } catch (NullPointerException e30) {
                                    alvw h29 = a.h();
                                    h29.X(alwp.a, "PduParser");
                                    ((alvg) ((alvg) ((alvg) h29).g(e30)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", (char) 655, "PduParser.java")).q("Null pointer error while setting previously_sent_by value");
                                } catch (RuntimeException e31) {
                                    alvw h30 = a.h();
                                    h30.X(alwp.a, "PduParser");
                                    ((alvg) ((alvg) ((alvg) h30).g(e31)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 658, "PduParser.java")).r("%d is not Encoded-String-Value header field!", b2);
                                    return null;
                                }
                            }
                            z = true;
                            i2 = 1;
                            break;
                        } catch (RuntimeException e32) {
                            alvw h31 = a.h();
                            h31.X(alwp.a, "PduParser");
                            ((alvg) ((alvg) ((alvg) h31).g(e32)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 642, "PduParser.java")).r("%d is not Integer-Value", b2);
                            return null;
                        }
                    case 161:
                        e(byteArrayInputStream);
                        try {
                            g(byteArrayInputStream);
                            try {
                                long h32 = h(byteArrayInputStream);
                                alvw f14 = a.f();
                                f14.X(alwp.a, "PduParser");
                                alvg alvgVar11 = (alvg) ((alvg) f14).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 684, "PduParser.java");
                                Integer valueOf11 = Integer.valueOf(b2);
                                alvgVar11.J("parseHeaders: headerField: %d (%02x) PREVIOUSLY_SENT_DATE %d", valueOf11, valueOf11, Long.valueOf(h32));
                                gpVar.h(h32, 161);
                                z = true;
                                i2 = 1;
                                break;
                            } catch (RuntimeException e33) {
                                alvw h33 = a.h();
                                h33.X(alwp.a, "PduParser");
                                ((alvg) ((alvg) ((alvg) h33).g(e33)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 689, "PduParser.java")).r("%d is not Long-Integer header field!", b2);
                                return null;
                            }
                        } catch (RuntimeException e34) {
                            alvw h34 = a.h();
                            h34.X(alwp.a, "PduParser");
                            ((alvg) ((alvg) ((alvg) h34).g(e34)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 677, "PduParser.java")).r("%d is not Integer-Value", b2);
                            return null;
                        }
                    case 164:
                        alvw f15 = a.f();
                        f15.X(alwp.a, "PduParser");
                        ((alvg) ((alvg) f15).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 703, "PduParser.java")).u("parseHeaders: headerField: %d (%02x) MM_FLAGS NOT REALLY SUPPORTED", b2, b2);
                        e(byteArrayInputStream);
                        b(byteArrayInputStream);
                        i(byteArrayInputStream);
                        z = true;
                        i2 = 1;
                        break;
                    case 168:
                    case 174:
                    case 176:
                    default:
                        alvw h35 = a.h();
                        h35.X(alwp.a, "PduParser");
                        ((alvg) ((alvg) h35).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 795, "PduParser.java")).u("parseHeaders: Unknown header: %d (%02x)", b2, b2);
                        z = true;
                        i2 = 1;
                        break;
                    case 170:
                    case 172:
                        alvw f16 = a.f();
                        f16.X(alwp.a, "PduParser");
                        ((alvg) ((alvg) f16).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 726, "PduParser.java")).u("parseHeaders: headerField: %d (%02x) MBOX_", b2, b2);
                        e(byteArrayInputStream);
                        b(byteArrayInputStream);
                        try {
                            g(byteArrayInputStream);
                            z = true;
                            i2 = 1;
                            break;
                        } catch (RuntimeException e35) {
                            alvw h36 = a.h();
                            h36.X(alwp.a, "PduParser");
                            ((alvg) ((alvg) ((alvg) h36).g(e35)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 738, "PduParser.java")).r("%d is not Integer-Value", b2);
                            return null;
                        }
                    case 173:
                    case 175:
                    case 179:
                        try {
                            long g4 = g(byteArrayInputStream);
                            alvw f17 = a.f();
                            f17.X(alwp.a, "PduParser");
                            alvg alvgVar12 = (alvg) ((alvg) f17).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 336, "PduParser.java");
                            Integer valueOf12 = Integer.valueOf(b2);
                            alvgVar12.J("parseHeaders: headerField: %d (%02x) Octet value %d", valueOf12, valueOf12, Long.valueOf(g4));
                            gpVar.h(g4, b2);
                            z = true;
                            i2 = 1;
                            break;
                        } catch (RuntimeException e36) {
                            alvw h37 = a.h();
                            h37.X(alwp.a, "PduParser");
                            ((alvg) ((alvg) ((alvg) h37).g(e36)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 341, "PduParser.java")).r("%d is not Long-Integer header field!", b2);
                            return null;
                        }
                    case 178:
                        alvw f18 = a.f();
                        f18.X(alwp.a, "PduParser");
                        ((alvg) ((alvg) f18).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 749, "PduParser.java")).u("parseHeaders: headerField: %d (%02x) ELEMENT_DESCRIPTOR", b2, b2);
                        k(byteArrayInputStream, null);
                        z = true;
                        i2 = 1;
                        break;
                }
            }
        }
        return gpVar;
    }

    private static byte[] k(ByteArrayInputStream byteArrayInputStream, SparseArray sparseArray) {
        byte[] l;
        int available;
        char c2;
        byteArrayInputStream.mark(1);
        int read = byteArrayInputStream.read();
        byteArrayInputStream.reset();
        int i = read & 255;
        if (i < 32) {
            int e = e(byteArrayInputStream);
            int available2 = byteArrayInputStream.available();
            byteArrayInputStream.mark(1);
            int read2 = byteArrayInputStream.read();
            byteArrayInputStream.reset();
            int i2 = read2 & 255;
            if (i2 >= 32 && i2 <= 127) {
                l = l(byteArrayInputStream, 0);
            } else if (i2 > 127) {
                int c3 = c(byteArrayInputStream);
                String[] strArr = gn.a;
                if (c3 < 83) {
                    l = gn.a[c3].getBytes();
                } else {
                    byteArrayInputStream.reset();
                    l = l(byteArrayInputStream, 0);
                }
            } else {
                alvw h = a.h();
                h.X(alwp.a, "PduParser");
                ((alvg) ((alvg) h).h("android/support/v7/mms/pdu/PduParser", "parseContentType", 1522, "PduParser.java")).q("Corrupt content-type");
                return gn.a[0].getBytes();
            }
            int available3 = e - (available2 - byteArrayInputStream.available());
            if (available3 > 0) {
                Integer valueOf = Integer.valueOf(available3);
                int available4 = byteArrayInputStream.available();
                valueOf.getClass();
                int i3 = available3;
                while (i3 > 0) {
                    int read3 = byteArrayInputStream.read();
                    i3--;
                    if (read3 != 129) {
                        if (read3 != 131) {
                            if (read3 != 133 && read3 != 151) {
                                if (read3 != 153) {
                                    if (read3 != 137) {
                                        if (read3 != 138) {
                                            alvi alviVar = a;
                                            alvw h2 = alviVar.h();
                                            h2.X(alwp.a, "PduParser");
                                            ((alvg) ((alvg) h2).h("android/support/v7/mms/pdu/PduParser", "parseContentTypeParams", 1461, "PduParser.java")).q("Not supported Content-Type parameter");
                                            if (f(byteArrayInputStream, i3) == -1) {
                                                alvw h3 = alviVar.h();
                                                h3.X(alwp.a, "PduParser");
                                                ((alvg) ((alvg) h3).h("android/support/v7/mms/pdu/PduParser", "parseContentTypeParams", 1463, "PduParser.java")).q("Corrupt Content-Type");
                                            } else {
                                                i3 = 0;
                                            }
                                        }
                                    }
                                }
                                byte[] l2 = l(byteArrayInputStream, 0);
                                if (l2 != null && sparseArray != null) {
                                    sparseArray.put(153, l2);
                                }
                                available = byteArrayInputStream.available();
                                valueOf.getClass();
                            } else {
                                byte[] l3 = l(byteArrayInputStream, 0);
                                if (l3 != null && sparseArray != null) {
                                    sparseArray.put(151, l3);
                                }
                                available = byteArrayInputStream.available();
                                valueOf.getClass();
                            }
                        }
                        byteArrayInputStream.mark(1);
                        int b2 = b(byteArrayInputStream);
                        byteArrayInputStream.reset();
                        if (b2 > 127) {
                            int c4 = c(byteArrayInputStream);
                            String[] strArr2 = gn.a;
                            c2 = 'S';
                            if (c4 < 83) {
                                sparseArray.put(131, gn.a[c4].getBytes());
                            }
                        } else {
                            c2 = 'S';
                            byte[] l4 = l(byteArrayInputStream, 0);
                            if (l4 != null && sparseArray != null) {
                                sparseArray.put(131, l4);
                            }
                        }
                        int available5 = byteArrayInputStream.available();
                        valueOf.getClass();
                        i3 = available3 - (available4 - available5);
                    } else {
                        byteArrayInputStream.mark(1);
                        int b3 = b(byteArrayInputStream);
                        byteArrayInputStream.reset();
                        if ((b3 > 32 && b3 < 127) || b3 == 0) {
                            byte[] l5 = l(byteArrayInputStream, 0);
                            try {
                                Integer num = (Integer) ((alsw) gg.a).d.get(new String(l5));
                                if (num != null) {
                                    num.intValue();
                                    sparseArray.put(129, num);
                                } else {
                                    throw new UnsupportedEncodingException();
                                    break;
                                }
                            } catch (UnsupportedEncodingException e2) {
                                alvw h4 = a.h();
                                h4.X(alwp.a, "PduParser");
                                ((alvg) ((alvg) ((alvg) h4).g(e2)).h("android/support/v7/mms/pdu/PduParser", "parseContentTypeParams", 1428, "PduParser.java")).t("unsupported encoding: %s", Arrays.toString(l5));
                                sparseArray.put(129, 0);
                            }
                        } else {
                            int g = (int) g(byteArrayInputStream);
                            if (sparseArray != null) {
                                sparseArray.put(129, Integer.valueOf(g));
                            }
                        }
                        available = byteArrayInputStream.available();
                        valueOf.getClass();
                    }
                    i3 = available3 - (available4 - available);
                }
                if (i3 != 0) {
                    alvw h5 = a.h();
                    h5.X(alwp.a, "PduParser");
                    ((alvg) ((alvg) h5).h("android/support/v7/mms/pdu/PduParser", "parseContentTypeParams", 1472, "PduParser.java")).q("Corrupt Content-Type");
                }
            }
            if (available3 < 0) {
                alvw h6 = a.h();
                h6.X(alwp.a, "PduParser");
                ((alvg) ((alvg) h6).h("android/support/v7/mms/pdu/PduParser", "parseContentType", 1533, "PduParser.java")).q("Corrupt MMS message");
                return gn.a[0].getBytes();
            }
            return l;
        }
        if (i <= 127) {
            return l(byteArrayInputStream, 0);
        }
        return gn.a[c(byteArrayInputStream)].getBytes();
    }

    private static byte[] l(ByteArrayInputStream byteArrayInputStream, int i) {
        byteArrayInputStream.mark(1);
        int read = byteArrayInputStream.read();
        if (i == 1) {
            if (read == 34) {
                byteArrayInputStream.mark(1);
            }
            byteArrayInputStream.reset();
        } else {
            if (read == 127) {
                byteArrayInputStream.mark(1);
            }
            byteArrayInputStream.reset();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int read2 = byteArrayInputStream.read();
        while (read2 != -1 && read2 != 0) {
            if ((read2 >= 32 && read2 <= 126) || ((read2 >= 128 && read2 <= 255) || read2 == 9 || read2 == 10 || read2 == 13)) {
                byteArrayOutputStream.write(read2);
            }
            read2 = byteArrayInputStream.read();
        }
        if (byteArrayOutputStream.size() > 0) {
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    private final gqg m(ByteArrayInputStream byteArrayInputStream) {
        int i;
        gqg gqgVar;
        int i2;
        int i3;
        byte[] n;
        gqg gqgVar2;
        byte[] l;
        int i4;
        int i5;
        char c2;
        int available;
        int i6;
        gqg gqgVar3 = null;
        if (byteArrayInputStream == null) {
            return null;
        }
        int d2 = d(byteArrayInputStream);
        gqg gqgVar4 = new gqg();
        char c3 = 0;
        int i7 = 0;
        while (i7 < d2) {
            int d3 = d(byteArrayInputStream);
            int d4 = d(byteArrayInputStream);
            gs gsVar = new gs();
            int available2 = byteArrayInputStream.available();
            if (available2 <= 0) {
                return gqgVar3;
            }
            SparseArray sparseArray = new SparseArray();
            byte[] k = k(byteArrayInputStream, sparseArray);
            if (k != null) {
                gsVar.h(k);
            } else {
                gsVar.h(gn.a[c3].getBytes());
            }
            byte[] bArr = (byte[]) sparseArray.get(151);
            if (bArr != null) {
                gsVar.k(bArr);
            }
            Integer num = (Integer) sparseArray.get(129);
            if (num != null) {
                gsVar.d(num.intValue());
            }
            int available3 = d3 - (available2 - byteArrayInputStream.available());
            if (available3 > 0) {
                int available4 = byteArrayInputStream.available();
                int i8 = available3;
                while (i8 > 0) {
                    int read = byteArrayInputStream.read();
                    int i9 = i8 - 1;
                    int i10 = d2;
                    int i11 = i7;
                    gqg gqgVar5 = gqgVar4;
                    if (read > 127) {
                        if (read != 142) {
                            if (read != 174) {
                                if (read != 192) {
                                    if (read != 197) {
                                        alvi alviVar = a;
                                        alvw f = alviVar.f();
                                        i6 = d4;
                                        f.X(alwp.a, "PduParser");
                                        ((alvg) ((alvg) f).h("android/support/v7/mms/pdu/PduParser", "parsePartHeaders", 1660, "PduParser.java")).r("Not supported Part headers: %d", read);
                                        if (f(byteArrayInputStream, i9) == -1) {
                                            alvw h = alviVar.h();
                                            h.X(alwp.a, "PduParser");
                                            ((alvg) ((alvg) h).h("android/support/v7/mms/pdu/PduParser", "parsePartHeaders", 1662, "PduParser.java")).q("Corrupt Part headers");
                                            return null;
                                        }
                                        d2 = i10;
                                        i7 = i11;
                                        gqgVar4 = gqgVar5;
                                        d4 = i6;
                                        i8 = 0;
                                    }
                                } else {
                                    i4 = d4;
                                    byte[] l2 = l(byteArrayInputStream, 1);
                                    if (l2 != null) {
                                        gsVar.f(l2);
                                    }
                                    i8 = available3 - (available4 - byteArrayInputStream.available());
                                    d2 = i10;
                                    i7 = i11;
                                    gqgVar4 = gqgVar5;
                                    d4 = i4;
                                }
                            }
                            i4 = d4;
                            if (this.g) {
                                int e = e(byteArrayInputStream);
                                byteArrayInputStream.mark(1);
                                int available5 = byteArrayInputStream.available();
                                int read2 = byteArrayInputStream.read();
                                if (read2 == 128) {
                                    gsVar.e(gs.a);
                                    i5 = 0;
                                    c2 = 129;
                                } else {
                                    c2 = 129;
                                    if (read2 == 129) {
                                        gsVar.e(gs.b);
                                    } else if (read2 == 130) {
                                        gsVar.e(gs.c);
                                    } else {
                                        byteArrayInputStream.reset();
                                        i5 = 0;
                                        gsVar.e(l(byteArrayInputStream, 0));
                                    }
                                    i5 = 0;
                                }
                                if (available5 - byteArrayInputStream.available() < e) {
                                    if (byteArrayInputStream.read() == 152) {
                                        gsVar.j(l(byteArrayInputStream, i5));
                                    }
                                    int available6 = available5 - byteArrayInputStream.available();
                                    if (available6 < e) {
                                        int i12 = e - available6;
                                        byteArrayInputStream.read(new byte[i12], i5, i12);
                                    }
                                }
                                available = byteArrayInputStream.available();
                            } else {
                                i8 = i9;
                                d2 = i10;
                                i7 = i11;
                                gqgVar4 = gqgVar5;
                                d4 = i4;
                            }
                        } else {
                            i4 = d4;
                            i5 = 0;
                            c2 = 129;
                            byte[] l3 = l(byteArrayInputStream, 0);
                            if (l3 != null) {
                                gsVar.g(l3);
                            }
                            available = byteArrayInputStream.available();
                        }
                        i8 = available3 - (available4 - available);
                        d2 = i10;
                        i7 = i11;
                        gqgVar4 = gqgVar5;
                        d4 = i4;
                    } else {
                        i6 = d4;
                        if (read >= 32) {
                            byte[] l4 = l(byteArrayInputStream, 0);
                            byte[] l5 = l(byteArrayInputStream, 0);
                            if (assi.b.equalsIgnoreCase(new String(l4))) {
                                if (l5 != null) {
                                    gsVar.d.put(BasePaymentResult.ERROR_REQUEST_FAILED, l5);
                                } else {
                                    throw new NullPointerException("null content-transfer-encoding");
                                }
                            }
                            i8 = available3 - (available4 - byteArrayInputStream.available());
                            d2 = i10;
                            i7 = i11;
                            gqgVar4 = gqgVar5;
                            d4 = i6;
                        } else {
                            alvi alviVar2 = a;
                            alvw f2 = alviVar2.f();
                            f2.X(alwp.a, "PduParser");
                            ((alvg) ((alvg) f2).h("android/support/v7/mms/pdu/PduParser", "parsePartHeaders", 1681, "PduParser.java")).r("Not supported Part headers: %d", read);
                            if (f(byteArrayInputStream, i9) == -1) {
                                alvw h2 = alviVar2.h();
                                h2.X(alwp.a, "PduParser");
                                ((alvg) ((alvg) h2).h("android/support/v7/mms/pdu/PduParser", "parsePartHeaders", 1684, "PduParser.java")).q("Corrupt Part headers");
                                return null;
                            }
                            d2 = i10;
                            i7 = i11;
                            gqgVar4 = gqgVar5;
                            d4 = i6;
                            i8 = 0;
                        }
                    }
                }
                i = d2;
                gqgVar = gqgVar4;
                i2 = i7;
                i3 = d4;
                if (i8 != 0) {
                    alvw h3 = a.h();
                    h3.X(alwp.a, "PduParser");
                    ((alvg) ((alvg) h3).h("android/support/v7/mms/pdu/PduParser", "parsePartHeaders", 1692, "PduParser.java")).q("Corrupt Part headers");
                    return null;
                }
            } else {
                i = d2;
                gqgVar = gqgVar4;
                i2 = i7;
                i3 = d4;
                if (available3 < 0) {
                    return gqgVar3;
                }
            }
            if (gsVar.m() == null && gsVar.p() == null && gsVar.o() == null && gsVar.l() == null) {
                gsVar.g(Long.toOctalString(System.currentTimeMillis()).getBytes());
            }
            if (i3 > 0) {
                int i13 = i3;
                byte[] bArr2 = new byte[i13];
                String str = new String(gsVar.n());
                c3 = 0;
                byteArrayInputStream.read(bArr2, 0, i13);
                if (str.equalsIgnoreCase("application/vnd.wap.multipart.alternative")) {
                    gsVar = m(new ByteArrayInputStream(bArr2)).j(0);
                    gqgVar3 = null;
                } else {
                    byte[] bArr3 = (byte[]) gsVar.d.get(BasePaymentResult.ERROR_REQUEST_FAILED);
                    if (bArr3 != null) {
                        String str2 = new String(bArr3);
                        if (str2.equalsIgnoreCase("base64")) {
                            bArr2 = Base64.decode(bArr2, 0);
                        } else if (str2.equalsIgnoreCase("quoted-printable")) {
                            bArr2 = d.d(bArr2);
                        }
                    }
                    if (bArr2 == null) {
                        alvw h4 = a.h();
                        h4.X(alwp.a, "PduParser");
                        ((alvg) ((alvg) h4).h("android/support/v7/mms/pdu/PduParser", "parseParts", 929, "PduParser.java")).q("Decode part data error!");
                        return null;
                    }
                    gqgVar3 = null;
                    gsVar.i(bArr2);
                }
            } else {
                gqgVar3 = null;
                c3 = 0;
            }
            byte[] bArr4 = c;
            if ((bArr4 == null && d == null) || (d == null ? bArr4 == null || (n = gsVar.n()) == null || !Arrays.equals(c, n) : (l = gsVar.l()) == null || !Arrays.equals(d, l))) {
                gqgVar2 = gqgVar;
                gqgVar2.l(gsVar);
            } else {
                gqgVar2 = gqgVar;
                gqgVar2.k(gsVar);
            }
            i7 = i2 + 1;
            gqgVar4 = gqgVar2;
            d2 = i;
        }
        return gqgVar4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0079. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:37:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x06bd A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0525  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.gj a() {
        /*
            Method dump skipped, instructions count: 1772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gr.a():gj");
    }
}
