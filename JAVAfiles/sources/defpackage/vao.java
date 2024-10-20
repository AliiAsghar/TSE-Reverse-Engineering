package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vao {
    private static final xze d = xze.g("Bugle", "PduComposer");
    private static final vl e = new vl();
    public int b;
    private final gj f;
    private final ContentResolver g;
    private final gp h;
    public final vam c = new vam(this);
    public ByteArrayOutputStream a = new ByteArrayOutputStream();

    static {
        int i = 0;
        while (true) {
            String[] strArr = gn.a;
            if (i < 83) {
                e.put(gn.a[i], Integer.valueOf(i));
                i++;
            } else {
                return;
            }
        }
    }

    public vao(Context context, gj gjVar) {
        this.b = 0;
        this.f = gjVar;
        this.g = context.getContentResolver();
        this.h = gjVar.a;
        this.b = 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x001b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x001e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0014. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0180 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int d(int r9) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vao.d(int):int");
    }

    private final int e() {
        String str;
        InputStream openInputStream;
        int i;
        this.c.c();
        gp gpVar = this.h;
        van a = this.c.a();
        byte[] k = gpVar.k(132);
        if (k == null) {
            str = "";
        } else {
            str = new String(k);
        }
        Integer num = (Integer) e.get(str);
        int i2 = 1;
        if (num == null) {
            return 1;
        }
        j(num.intValue());
        gqg gqgVar = ((gm) this.f).b;
        if (gqgVar != null && gqgVar.i() != 0) {
            byte b = 62;
            try {
                gs j = gqgVar.j(0);
                byte[] l = j.l();
                if (l != null) {
                    a(138);
                    if (l[0] == 60 && l[l.length - 1] == 62) {
                        k(l);
                    } else {
                        k(("<" + new String(l) + ">").getBytes());
                    }
                }
                a(137);
                k(j.n());
            } catch (ArrayIndexOutOfBoundsException e2) {
                d.n("cannot make message body", e2);
            }
            int a2 = a.a();
            this.c.d();
            m(a2);
            this.c.b();
            int i3 = gqgVar.i();
            l(i3);
            int i4 = 0;
            while (i4 < i3) {
                gs j2 = gqgVar.j(i4);
                this.c.c();
                vam vamVar = this.c;
                van a3 = vamVar.a();
                vamVar.c();
                van a4 = this.c.a();
                byte[] n = j2.n();
                if (n == null) {
                    return i2;
                }
                Integer num2 = (Integer) e.get(new String(n));
                if (num2 == null) {
                    k(n);
                } else {
                    j(num2.intValue());
                }
                byte[] p = j2.p();
                if (p == null && (p = j2.o()) == null && (p = j2.m()) == null) {
                    p = "smil.xml".getBytes();
                }
                a(133);
                k(p);
                int a5 = j2.a();
                if (a5 != 0) {
                    a(129);
                    j(a5);
                }
                int a6 = a4.a();
                this.c.d();
                m(a6);
                this.c.b();
                byte[] l2 = j2.l();
                if (l2 != null) {
                    a(192);
                    if (l2[0] == 60 && l2[l2.length - 1] == b) {
                        i(l2);
                    } else {
                        i(("<" + new String(l2) + ">").getBytes());
                    }
                }
                byte[] m = j2.m();
                if (m != null) {
                    a(142);
                    k(m);
                }
                int a7 = a3.a();
                aozb aozbVar = j2.f;
                if (aozbVar != null) {
                    try {
                        aozbVar.q(this.a);
                        this.b += aozbVar.d();
                        i = aozbVar.d();
                    } catch (IOException e3) {
                        throw new IllegalStateException("ByteArrayOutputStream shouldn't throw IOException when written to.", e3);
                    }
                } else {
                    InputStream inputStream = null;
                    try {
                        byte[] bArr = new byte[1024];
                        Uri uri = j2.e;
                        if (uri != null && (openInputStream = this.g.openInputStream(uri)) != null) {
                            i = 0;
                            while (true) {
                                int read = openInputStream.read(bArr);
                                if (read != -1) {
                                    this.a.write(bArr, 0, read);
                                    this.b += read;
                                    i += read;
                                } else {
                                    try {
                                        break;
                                    } catch (IOException unused) {
                                    }
                                }
                            }
                            openInputStream.close();
                        } else {
                            return 1;
                        }
                    } catch (IOException | RuntimeException unused2) {
                        if (0 != 0) {
                            try {
                                inputStream.close();
                                return 1;
                            } catch (IOException unused3) {
                                return 1;
                            }
                        }
                        return 1;
                    } catch (Throwable th) {
                        if (0 != 0) {
                            try {
                                inputStream.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                }
                if (i == a3.a() - a7) {
                    this.c.d();
                    l(a7);
                    l(i);
                    this.c.b();
                    i4++;
                    i2 = 1;
                    b = 62;
                } else {
                    throw new RuntimeException("BUG: Length sanity check failed");
                }
            }
            return 0;
        }
        l(0L);
        this.c.d();
        this.c.b();
        return 0;
    }

    private static gi f(gi giVar) {
        char c;
        String b = giVar.b();
        if (b.matches("[0-9]{1,3}\\.{1}[0-9]{1,3}\\.{1}[0-9]{1,3}\\.{1}[0-9]{1,3}")) {
            c = 3;
        } else if (b.matches("\\+?[0-9|\\.|\\-]+")) {
            c = 1;
        } else if (b.matches("[a-zA-Z| ]*\\<{0,1}[a-zA-Z| ]+@{1}[a-zA-Z| ]+\\.{1}[a-zA-Z| ]+\\>{0,1}")) {
            c = 2;
        } else if (b.matches("[a-fA-F]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}")) {
            c = 4;
        } else {
            c = 5;
        }
        gi giVar2 = new gi(giVar.a, giVar.b);
        if (c == 1) {
            giVar2.c("/TYPE=PLMN".getBytes());
        } else if (c == 3) {
            giVar2.c("/TYPE=IPV4".getBytes());
        } else if (c == 4) {
            giVar2.c("/TYPE=IPV6".getBytes());
        }
        return giVar2;
    }

    private final void g(gi giVar) {
        byte[] e2 = giVar.e();
        if (e2 == null) {
            return;
        }
        int i = giVar.a;
        this.c.c();
        van a = this.c.a();
        j(i);
        k(e2);
        int a2 = a.a();
        this.c.d();
        m(a2);
        this.c.b();
    }

    private final void h(long j) {
        int i = 0;
        long j2 = j;
        int i2 = 0;
        while (j2 != 0 && i2 < 8) {
            j2 >>>= 8;
            i2++;
        }
        a(i2);
        int i3 = (i2 - 1) * 8;
        while (i < i2) {
            a((int) ((j >>> i3) & 255));
            i++;
            i3 -= 8;
        }
    }

    private final void i(byte[] bArr) {
        a(34);
        c(bArr, bArr.length);
        a(0);
    }

    private final void j(int i) {
        a((i | 128) & 255);
    }

    private final void k(byte[] bArr) {
        if ((bArr[0] & 255) > 127) {
            a(127);
        }
        c(bArr, bArr.length);
        a(0);
    }

    private final void l(long j) {
        int i = 0;
        long j2 = 127;
        while (i < 5 && j >= j2) {
            j2 = (j2 << 7) | 127;
            i++;
        }
        while (i > 0) {
            a((int) (((j >>> (i * 7)) & 127) | 128));
            i--;
        }
        a((int) (j & 127));
    }

    private final void m(long j) {
        if (j < 31) {
            a((int) j);
        } else {
            a(31);
            l(j);
        }
    }

    protected final void a(int i) {
        this.a.write(i);
        this.b++;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0023. Please report as an issue. */
    public final byte[] b() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        switch (this.f.a()) {
            case 128:
                if (this.a == null) {
                    this.a = new ByteArrayOutputStream();
                    this.b = 0;
                }
                a(140);
                a(128);
                a(152);
                byte[] k = this.h.k(152);
                if (k != null) {
                    k(k);
                    if (d(141) == 0) {
                        d(133);
                        if (d(137) == 0) {
                            if (d(151) == 1) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (d(130) != 1) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            boolean z4 = !z2;
                            if (d(129) == 1) {
                                z3 = true;
                            }
                            boolean z5 = !z3;
                            if (d(186) != 1 || (z | z4 | z5)) {
                                d(150);
                                d(138);
                                d(136);
                                d(143);
                                d(134);
                                d(144);
                                a(132);
                                if (e() != 0) {
                                    return null;
                                }
                                return this.a.toByteArray();
                            }
                            return null;
                        }
                        return null;
                    }
                    return null;
                }
                throw new IllegalArgumentException("Transaction-ID is null.");
            case 129:
            case 134:
            default:
                return null;
            case 130:
                if (this.a == null) {
                    this.a = new ByteArrayOutputStream();
                    this.b = 0;
                }
                a(140);
                a(130);
                if (d(152) == 0 && d(141) == 0 && d(137) == 0) {
                    d(150);
                    if (d(138) != 0 || d(142) != 0 || d(136) != 0 || d(131) != 0) {
                        return null;
                    }
                    return this.a.toByteArray();
                }
                return null;
            case 131:
                if (this.a == null) {
                    this.a = new ByteArrayOutputStream();
                    this.b = 0;
                }
                a(140);
                a(131);
                if (d(152) != 0 || d(141) != 0 || d(149) != 0) {
                    return null;
                }
                return this.a.toByteArray();
            case 132:
                if (this.a == null) {
                    this.a = new ByteArrayOutputStream();
                    this.b = 0;
                }
                a(140);
                a(132);
                if (d(152) == 0 && d(141) == 0 && d(139) == 0 && d(133) == 0 && d(137) == 0) {
                    int d2 = d(186);
                    if (d2 == 0 || d2 == 2) {
                        int d3 = d(151);
                        if (d3 == 0 || d3 == 2) {
                            int d4 = d(153);
                            if (d4 == 0 || d4 == 2) {
                                a(132);
                                if (e() != 0) {
                                    return null;
                                }
                                return this.a.toByteArray();
                            }
                            return null;
                        }
                        return null;
                    }
                    return null;
                }
                return null;
            case 133:
                if (this.a == null) {
                    this.a = new ByteArrayOutputStream();
                    this.b = 0;
                }
                a(140);
                a(133);
                if (d(152) == 0 && d(141) == 0) {
                    d(145);
                    return this.a.toByteArray();
                }
                return null;
            case 135:
                if (this.a == null) {
                    this.a = new ByteArrayOutputStream();
                    this.b = 0;
                }
                a(140);
                a(135);
                if (d(141) == 0 && d(139) == 0 && d(151) == 0 && d(137) == 0) {
                    d(133);
                    if (d(155) != 0) {
                        return null;
                    }
                    return this.a.toByteArray();
                }
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(byte[] bArr, int i) {
        this.a.write(bArr, 0, i);
        this.b += i;
    }
}
