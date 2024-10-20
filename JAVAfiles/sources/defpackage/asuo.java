package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.asn1.ASN1Sequence;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asuo {
    private static volatile Provider b;
    public final Object a;

    public asuo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new arve(new asfg(8, false), arvf.a);
    }

    private static synchronized Provider q() {
        synchronized (asuo.class) {
            Provider provider = Security.getProvider("BC");
            if (provider instanceof asus) {
                return provider;
            }
            if (b != null) {
                return b;
            }
            b = new asus();
            return b;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        if (r3 > 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r0.length() == 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.String r(java.io.InputStream r5) {
        /*
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
        L5:
            int r1 = r5.read()
            r2 = 10
            r3 = 13
            if (r1 == r3) goto L18
            if (r1 == r2) goto L18
            if (r1 < 0) goto L18
            char r1 = (char) r1
            r0.append(r1)
            goto L5
        L18:
            if (r1 < 0) goto L20
            int r4 = r0.length()
            if (r4 == 0) goto L5
        L20:
            if (r1 >= 0) goto L2a
            int r5 = r0.length()
            if (r5 != 0) goto L3f
            r5 = 0
            return r5
        L2a:
            if (r1 != r3) goto L3f
            r1 = 1
            r5.mark(r1)
            int r3 = r5.read()
            if (r3 != r2) goto L3a
            r5.mark(r1)
            goto L3c
        L3a:
            if (r3 <= 0) goto L3f
        L3c:
            r5.reset()
        L3f:
            java.lang.String r5 = r0.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asuo.r(java.io.InputStream):java.lang.String");
    }

    private final asmb s(String str) {
        for (int i = 0; i != 3; i++) {
            asmb asmbVar = ((asmb[]) this.a)[i];
            if (asmbVar.j(str) || asmbVar.i(str)) {
                return asmbVar;
            }
        }
        return null;
    }

    public final Signature a(String str) {
        return Signature.getInstance(str, (Provider) this.a);
    }

    public final CertificateFactory b() {
        return CertificateFactory.getInstance("X.509", (Provider) this.a);
    }

    public final ASN1Sequence c(InputStream inputStream, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        asmb asmbVar = null;
        while (asmbVar == null) {
            String r = r(inputStream);
            if (r == null) {
                break;
            }
            asmbVar = s(r);
            if (asmbVar != null && !asmbVar.j(r)) {
                throw new IOException("malformed PEM data: found footer where header was expected");
            }
        }
        if (asmbVar == null) {
            if (!z) {
                return null;
            }
            throw new IOException("malformed PEM data: no header found");
        }
        asmb asmbVar2 = null;
        while (asmbVar2 == null) {
            String r2 = r(inputStream);
            if (r2 == null) {
                break;
            }
            asmbVar2 = s(r2);
            if (asmbVar2 != null) {
                if (!asmbVar.i(r2)) {
                    throw new IOException("malformed PEM data: header/footer mismatch");
                }
            } else {
                stringBuffer.append(r2);
            }
        }
        if (asmbVar2 != null) {
            if (stringBuffer.length() == 0) {
                return null;
            }
            try {
                String stringBuffer2 = stringBuffer.toString();
                atdk atdkVar = atdh.a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((stringBuffer2.length() / 4) * 3);
                try {
                    atdk atdkVar2 = atdh.a;
                    byte[] bArr = new byte[54];
                    int length = stringBuffer2.length();
                    while (length > 0) {
                        int i = length - 1;
                        if (!atdi.a(stringBuffer2.charAt(i))) {
                            break;
                        }
                        length = i;
                    }
                    if (length != 0) {
                        int i2 = length;
                        int i3 = 0;
                        while (i2 > 0 && i3 != 4) {
                            i2--;
                            if (!atdi.a(stringBuffer2.charAt(i2))) {
                                i3++;
                            }
                        }
                        int b2 = atdi.b(stringBuffer2, 0, i2);
                        int i4 = 0;
                        while (b2 < i2) {
                            int i5 = b2 + 1;
                            byte b3 = ((atdi) atdkVar2).c[stringBuffer2.charAt(b2)];
                            int b4 = atdi.b(stringBuffer2, i5, i2);
                            int i6 = b4 + 1;
                            byte b5 = ((atdi) atdkVar2).c[stringBuffer2.charAt(b4)];
                            int b6 = atdi.b(stringBuffer2, i6, i2);
                            int i7 = b6 + 1;
                            byte b7 = ((atdi) atdkVar2).c[stringBuffer2.charAt(b6)];
                            int b8 = atdi.b(stringBuffer2, i7, i2);
                            int i8 = b8 + 1;
                            byte b9 = ((atdi) atdkVar2).c[stringBuffer2.charAt(b8)];
                            if ((b3 | b5 | b7 | b9) >= 0) {
                                bArr[i4] = (byte) ((b3 << 2) | (b5 >> 4));
                                int i9 = i4 + 2;
                                bArr[i4 + 1] = (byte) ((b5 << 4) | (b7 >> 2));
                                i4 += 3;
                                bArr[i9] = (byte) ((b7 << 6) | b9);
                                if (i4 == 54) {
                                    byteArrayOutputStream.write(bArr);
                                    i4 = 0;
                                }
                                b2 = atdi.b(stringBuffer2, i8, i2);
                            } else {
                                throw new IOException("invalid characters encountered in base64 data");
                            }
                        }
                        if (i4 > 0) {
                            byteArrayOutputStream.write(bArr, 0, i4);
                        }
                        int b10 = atdi.b(stringBuffer2, b2, length);
                        int b11 = atdi.b(stringBuffer2, b10 + 1, length);
                        int b12 = atdi.b(stringBuffer2, b11 + 1, length);
                        int b13 = atdi.b(stringBuffer2, b12 + 1, length);
                        char charAt = stringBuffer2.charAt(b10);
                        char charAt2 = stringBuffer2.charAt(b11);
                        char charAt3 = stringBuffer2.charAt(b12);
                        char charAt4 = stringBuffer2.charAt(b13);
                        byte b14 = ((atdi) atdkVar2).b;
                        if (charAt3 == b14) {
                            if (charAt4 == b14) {
                                byte[] bArr2 = ((atdi) atdkVar2).c;
                                byte b15 = bArr2[charAt];
                                byte b16 = bArr2[charAt2];
                                if ((b15 | b16) >= 0) {
                                    byteArrayOutputStream.write((b16 >> 4) | (b15 << 2));
                                } else {
                                    throw new IOException("invalid characters encountered at end of base64 data");
                                }
                            } else {
                                throw new IOException("invalid characters encountered at end of base64 data");
                            }
                        } else if (charAt4 == b14) {
                            byte[] bArr3 = ((atdi) atdkVar2).c;
                            byte b17 = bArr3[charAt];
                            byte b18 = bArr3[charAt2];
                            byte b19 = bArr3[charAt3];
                            if ((b17 | b18 | b19) >= 0) {
                                byteArrayOutputStream.write((b17 << 2) | (b18 >> 4));
                                byteArrayOutputStream.write((b19 >> 2) | (b18 << 4));
                            } else {
                                throw new IOException("invalid characters encountered at end of base64 data");
                            }
                        } else {
                            byte[] bArr4 = ((atdi) atdkVar2).c;
                            byte b20 = bArr4[charAt];
                            byte b21 = bArr4[charAt2];
                            byte b22 = bArr4[charAt3];
                            byte b23 = bArr4[charAt4];
                            if ((b20 | b21 | b22 | b23) >= 0) {
                                byteArrayOutputStream.write((b20 << 2) | (b21 >> 4));
                                byteArrayOutputStream.write((b21 << 4) | (b22 >> 2));
                                byteArrayOutputStream.write(b23 | (b22 << 6));
                            } else {
                                throw new IOException("invalid characters encountered at end of base64 data");
                            }
                        }
                    }
                    return ASN1Sequence.j(byteArrayOutputStream.toByteArray());
                } catch (Exception e) {
                    throw new atdj("unable to decode base64 string: ".concat(String.valueOf(e.getMessage())), e);
                }
            } catch (Exception unused) {
                throw new IOException("malformed PEM data encountered");
            }
        }
        throw new IOException("malformed PEM data: no footer found");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    public final synchronized void d(asmq asmqVar) {
        this.a.remove(asmqVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    public final synchronized void e(asmq asmqVar) {
        this.a.add(asmqVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    public final synchronized boolean f(asmq asmqVar) {
        return this.a.contains(asmqVar);
    }

    public final void g(Runnable runnable) {
        runnable.getClass();
        ((ThreadPoolExecutor) this.a).execute(runnable);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Collection, java.lang.Object] */
    public final aslv h() {
        return new aslv((String[]) this.a.toArray(new String[0]));
    }

    public final void i(String str, String str2) {
        str.getClass();
        str2.getClass();
        aotl.as(str);
        aotl.at(str2, str);
        j(str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    public final void j(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a.add(str);
        this.a.add(arsd.D(str2).toString());
    }

    public final void k(String str, String str2) {
        aotl.as(str);
        aotl.at(str2, str);
        l(str);
        j(str, str2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List, java.lang.Object] */
    public final void l(String str) {
        int i = 0;
        while (i < this.a.size()) {
            if (arsd.x(str, (String) this.a.get(i), true)) {
                this.a.remove(i);
                this.a.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public final int m() {
        long j = ((asfg) ((arve) this.a).a).b.b;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object n() {
        while (true) {
            asfg asfgVar = (asfg) ((arve) this.a).a;
            Object b2 = asfgVar.b();
            if (b2 != asfg.a) {
                return b2;
            }
            ((arve) this.a).d(asfgVar, asfgVar.c());
        }
    }

    public final void o() {
        while (true) {
            asfg asfgVar = (asfg) ((arve) this.a).a;
            if (asfgVar.d()) {
                return;
            }
            ((arve) this.a).d(asfgVar, asfgVar.c());
        }
    }

    public final boolean p(Object obj) {
        while (true) {
            asfg asfgVar = (asfg) ((arve) this.a).a;
            int a = asfgVar.a(obj);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return false;
            }
            ((arve) this.a).d(asfgVar, asfgVar.c());
        }
    }

    public asuo(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(null, null, null, null);
    }

    public asuo(byte[] bArr, char[] cArr) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        timeUnit.getClass();
        this.a = new asnl(asmy.a, timeUnit);
    }

    public asuo(char[] cArr) {
        this.a = new ArrayList(20);
    }

    public asuo(ThreadFactory threadFactory) {
        this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
    }

    public asuo(byte[] bArr, byte[] bArr2) {
        this.a = new LinkedHashSet();
    }

    public asuo(byte[] bArr) {
        this.a = new ThreadLocal();
    }

    public asuo(String str) {
        this.a = new asmb[]{new asmb(str), new asmb("X509 ".concat(str)), new asmb("PKCS7")};
    }

    public asuo() {
        this.a = q();
    }
}
