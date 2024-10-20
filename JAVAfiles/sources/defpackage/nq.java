package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EdgeEffect;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nq {
    public nq() {
    }

    public static boolean A(MotionEvent motionEvent) {
        return y(motionEvent, 1);
    }

    public static boolean B(MotionEvent motionEvent) {
        return y(motionEvent, 4);
    }

    public static int C(InputStream inputStream) {
        return (int) F(inputStream, 2);
    }

    public static int D(InputStream inputStream) {
        return (int) F(inputStream, 1);
    }

    public static int E(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    static long F(InputStream inputStream, int i) {
        byte[] P = P(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (P[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    public static long G(InputStream inputStream) {
        return F(inputStream, 4);
    }

    public static String H(InputStream inputStream, int i) {
        return new String(P(inputStream, i), StandardCharsets.UTF_8);
    }

    public static void I(OutputStream outputStream, byte[] bArr) {
        M(outputStream, bArr.length);
        byte[] O = O(bArr);
        M(outputStream, O.length);
        outputStream.write(O);
    }

    public static void J(OutputStream outputStream, String str) {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    static void K(OutputStream outputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static void L(OutputStream outputStream, int i) {
        K(outputStream, i, 2);
    }

    public static void M(OutputStream outputStream, long j) {
        K(outputStream, j, 4);
    }

    public static void N(OutputStream outputStream, int i) {
        K(outputStream, i, 1);
    }

    public static byte[] O(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] P(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw new IllegalStateException(a.bV(i, "Not enough bytes to read: "));
            }
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (r0.finished() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] Q(java.io.InputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L69
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L69
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L69
            if (r6 != 0) goto L47
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L69
            if (r6 != 0) goto L47
            if (r4 >= r9) goto L47
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L69
            if (r6 < 0) goto L39
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L69
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.util.zip.DataFormatException -> L2e java.lang.Throwable -> L69
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L69
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L69
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L69
            throw r9     // Catch: java.lang.Throwable -> L69
        L39:
            java.lang.String r8 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            java.lang.String r10 = " bytes"
            java.lang.String r8 = defpackage.a.cb(r9, r8, r10)     // Catch: java.lang.Throwable -> L69
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L69
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L69
            throw r9     // Catch: java.lang.Throwable -> L69
        L47:
            if (r4 != r9) goto L5b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L69
            if (r8 == 0) goto L53
            r0.end()
            return r1
        L53:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L69
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L69
            throw r9     // Catch: java.lang.Throwable -> L69
        L5b:
            java.lang.String r8 = "Didn't read enough bytes during decompression. expected="
            java.lang.String r10 = " actual="
            java.lang.String r8 = defpackage.a.bU(r4, r9, r8, r10)     // Catch: java.lang.Throwable -> L69
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L69
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L69
            throw r9     // Catch: java.lang.Throwable -> L69
        L69:
            r8 = move-exception
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq.Q(java.io.InputStream, int, int):byte[]");
    }

    public static boolean R(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z = true;
            for (File file2 : listFiles) {
                if (R(file2) && z) {
                    z = true;
                } else {
                    z = false;
                }
            }
            return z;
        }
        file.delete();
        return true;
    }

    public static asai S(arqv arqvVar) {
        return armd.u(new asaa(new gds(arqvVar, (arpe) null, 0)), -2);
    }

    public static int T(gdm gdmVar, atkn atknVar, gdm gdmVar2, int i) {
        int a;
        gdmVar.getClass();
        atknVar.getClass();
        gdmVar2.getClass();
        if (!atknVar.a) {
            return arrn.t(i, arrn.B(0, gdmVar2.f()));
        }
        int e = i - gdmVar.e();
        int a2 = gdmVar.a();
        if (e >= 0 && e < a2) {
            for (int i2 = 0; i2 < 30; i2++) {
                int i3 = i2 / 2;
                int i4 = 1;
                if (i2 % 2 == 1) {
                    i4 = -1;
                }
                int i5 = (i3 * i4) + e;
                if (i5 >= 0 && i5 < gdmVar.a() && (a = ((hc) atknVar.b).a(i5)) != -1) {
                    return a + gdmVar2.e();
                }
            }
        }
        return arrn.t(i, arrn.B(0, gdmVar2.f()));
    }

    public static atkn U(gdm gdmVar, gdm gdmVar2, hd hdVar) {
        gdmVar.getClass();
        gdmVar2.getClass();
        hc a = hg.a(new gdn(gdmVar, gdmVar2, hdVar, gdmVar.a(), gdmVar2.a()));
        boolean z = false;
        arob it = arrn.B(0, gdmVar.a()).iterator();
        while (true) {
            if (!it.a) {
                break;
            }
            if (a.a(it.a()) != -1) {
                z = true;
                break;
            }
        }
        return new atkn(a, z);
    }

    public static void V(gdm gdmVar, hh hhVar, gdm gdmVar2, atkn atknVar) {
        gdmVar.getClass();
        hhVar.getClass();
        gdmVar2.getClass();
        atknVar.getClass();
        if (atknVar.a) {
            gbd gbdVar = new gbd(gdmVar, gdmVar2, hhVar);
            ((hc) atknVar.b).b(gbdVar);
            int min = Math.min(gbdVar.a.e(), gbdVar.d);
            int e = gbdVar.b.e() - gbdVar.d;
            if (e > 0) {
                if (min > 0) {
                    gbdVar.c.a(0, min, gaa.PLACEHOLDER_POSITION_CHANGE);
                }
                gbdVar.c.b(0, e);
            } else if (e < 0) {
                gbdVar.c.d(0, -e);
                int i = min + e;
                if (i > 0) {
                    gbdVar.c.a(0, i, gaa.PLACEHOLDER_POSITION_CHANGE);
                }
            }
            gbdVar.d = gbdVar.b.e();
            int min2 = Math.min(gbdVar.a.d(), gbdVar.e);
            int d = gbdVar.b.d();
            int i2 = gbdVar.e;
            int i3 = d - i2;
            int i4 = gbdVar.d + gbdVar.f + i2;
            int i5 = i4 - min2;
            int f = gbdVar.a.f() - min2;
            if (i3 > 0) {
                gbdVar.c.b(i4, i3);
            } else if (i3 < 0) {
                gbdVar.c.d(i4 + i3, -i3);
                min2 += i3;
            }
            if (min2 > 0 && i5 != f) {
                gbdVar.c.a(i5, min2, gaa.PLACEHOLDER_POSITION_CHANGE);
            }
            gbdVar.e = gbdVar.b.d();
            return;
        }
        int max = Math.max(gdmVar.e(), gdmVar2.e());
        int min3 = Math.min(gdmVar.e() + gdmVar.a(), gdmVar2.e() + gdmVar2.a());
        int i6 = min3 - max;
        if (i6 > 0) {
            hhVar.d(max, i6);
            hhVar.b(max, i6);
        }
        int min4 = Math.min(max, min3);
        int max2 = Math.max(max, min3);
        dyh.f(hhVar, min4, max2, arrn.s(gdmVar.e(), gdmVar2.f()), arrn.s(gdmVar.e() + gdmVar.a(), gdmVar2.f()), gaa.ITEM_TO_PLACEHOLDER);
        dyh.f(hhVar, min4, max2, arrn.s(gdmVar2.e(), gdmVar.f()), arrn.s(gdmVar2.e() + gdmVar2.a(), gdmVar.f()), gaa.PLACEHOLDER_TO_ITEM);
        int f2 = gdmVar2.f() - gdmVar.f();
        if (f2 > 0) {
            hhVar.b(gdmVar.f(), f2);
        } else if (f2 < 0) {
            hhVar.d(gdmVar.f() + f2, -f2);
        }
    }

    public static void m(View view, float f) {
        try {
            view.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static rg o(rm rmVar, enm enmVar, boolean z, arqr arqrVar) {
        rmVar.getClass();
        rn rnVar = new rn(z, arqrVar);
        rmVar.b(enmVar, rnVar);
        return rnVar;
    }

    public static int q(ol olVar, nl nlVar, View view, View view2, nw nwVar, boolean z) {
        if (nwVar.at() != 0 && olVar.a() != 0 && view != null && view2 != null) {
            if (!z) {
                return Math.abs(nw.bt(view) - nw.bt(view2)) + 1;
            }
            return Math.min(nlVar.k(), nlVar.a(view2) - nlVar.d(view));
        }
        return 0;
    }

    public static int r(ol olVar, nl nlVar, View view, View view2, nw nwVar, boolean z, boolean z2) {
        int max;
        if (nwVar.at() == 0 || olVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(nw.bt(view), nw.bt(view2));
        int max2 = Math.max(nw.bt(view), nw.bt(view2));
        if (z2) {
            max = Math.max(0, (olVar.a() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((max * (Math.abs(nlVar.a(view2) - nlVar.d(view)) / (Math.abs(nw.bt(view) - nw.bt(view2)) + 1))) + (nlVar.j() - nlVar.d(view)));
    }

    public static int s(ol olVar, nl nlVar, View view, View view2, nw nwVar, boolean z) {
        if (nwVar.at() != 0 && olVar.a() != 0 && view != null && view2 != null) {
            if (!z) {
                return olVar.a();
            }
            return (int) (((nlVar.a(view2) - nlVar.d(view)) / (Math.abs(nw.bt(view) - nw.bt(view2)) + 1)) * olVar.a());
        }
        return 0;
    }

    public static boolean u(int i, int i2) {
        if ((i & i2) != 0) {
            return true;
        }
        return false;
    }

    public static boolean v(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            return true;
        }
        return false;
    }

    public static boolean w(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 2) {
            return true;
        }
        return false;
    }

    public static boolean x(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            return true;
        }
        return false;
    }

    public static boolean y(MotionEvent motionEvent, int i) {
        if ((motionEvent.getButtonState() & i) == i) {
            return true;
        }
        return false;
    }

    public static boolean z(MotionEvent motionEvent) {
        return u(motionEvent.getMetaState(), 4096);
    }

    public void a(Rect rect, View view, RecyclerView recyclerView, ol olVar) {
        ((nx) view.getLayoutParams()).a();
        rect.set(0, 0, 0, 0);
    }

    public void dB(int i, int i2, Object obj) {
        dA(i, i2);
    }

    public EdgeEffect n(RecyclerView recyclerView) {
        throw null;
    }

    public nq(char[] cArr) {
    }

    public void dE() {
    }

    public void dz() {
    }

    public void b(Canvas canvas, RecyclerView recyclerView) {
    }

    public void dA(int i, int i2) {
    }

    public void dC(int i, int i2) {
    }

    public void dD(int i, int i2) {
    }

    public void dF(int i, int i2) {
    }

    public void l(Canvas canvas, RecyclerView recyclerView) {
    }

    public void t(RecyclerView recyclerView, int i) {
    }

    public void dG(RecyclerView recyclerView, int i, int i2) {
    }
}
