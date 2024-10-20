package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmt implements flu {
    private static final int[] a = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] b = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] c = eul.ac("#!AMR\n");
    private static final byte[] d = eul.ac("#!AMR-WB\n");
    private final byte[] e;
    private final fmq f;
    private boolean g;
    private long h;
    private int i;
    private int j;
    private int k;
    private int l;
    private long m;
    private flw n;
    private fmq o;
    private fmq p;
    private fmk q;
    private long r;
    private boolean s;

    public fmt(byte[] bArr) {
        this.e = new byte[1];
        this.k = -1;
        flr flrVar = new flr();
        this.f = flrVar;
        this.p = flrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0038 A[Catch: EOFException -> 0x0082, TryCatch #0 {EOFException -> 0x0082, blocks: (B:13:0x0009, B:15:0x001a, B:23:0x0038, B:24:0x0041, B:30:0x003d, B:40:0x005c, B:41:0x0075, B:42:0x0076, B:43:0x0081), top: B:12:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003d A[Catch: EOFException -> 0x0082, TryCatch #0 {EOFException -> 0x0082, blocks: (B:13:0x0009, B:15:0x001a, B:23:0x0038, B:24:0x0041, B:30:0x003d, B:40:0x005c, B:41:0x0075, B:42:0x0076, B:43:0x0081), top: B:12:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int a(defpackage.flv r11) {
        /*
            r10 = this;
            java.lang.String r0 = "Illegal AMR "
            int r1 = r10.j
            r2 = 0
            r3 = -1
            r4 = 1
            if (r1 != 0) goto L83
            r11.l()     // Catch: java.io.EOFException -> L82
            byte[] r1 = r10.e     // Catch: java.io.EOFException -> L82
            r11.j(r1, r2, r4)     // Catch: java.io.EOFException -> L82
            byte[] r1 = r10.e     // Catch: java.io.EOFException -> L82
            r1 = r1[r2]     // Catch: java.io.EOFException -> L82
            r5 = r1 & 131(0x83, float:1.84E-43)
            r6 = 0
            if (r5 > 0) goto L76
            int r1 = r1 >> 3
            boolean r5 = r10.g     // Catch: java.io.EOFException -> L82
            r1 = r1 & 15
            if (r5 == 0) goto L2b
            r7 = 10
            if (r1 < r7) goto L36
            r7 = 13
            if (r1 <= r7) goto L2b
            goto L36
        L2b:
            if (r5 != 0) goto L55
            r7 = 12
            if (r1 < r7) goto L36
            r7 = 14
            if (r1 > r7) goto L36
            goto L55
        L36:
            if (r5 == 0) goto L3d
            int[] r0 = defpackage.fmt.b     // Catch: java.io.EOFException -> L82
            r0 = r0[r1]     // Catch: java.io.EOFException -> L82
            goto L41
        L3d:
            int[] r0 = defpackage.fmt.a     // Catch: java.io.EOFException -> L82
            r0 = r0[r1]     // Catch: java.io.EOFException -> L82
        L41:
            r1 = r0
            r10.i = r1     // Catch: java.io.EOFException -> L82
            r10.j = r1
            int r0 = r10.k
            if (r0 != r3) goto L4d
            r10.k = r1
            r0 = r1
        L4d:
            if (r0 != r1) goto L83
            int r0 = r10.l
            int r0 = r0 + r4
            r10.l = r0
            goto L83
        L55:
            java.lang.String r11 = "WB"
            java.lang.String r2 = "NB"
            if (r4 == r5) goto L5c
            r11 = r2
        L5c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L82
            r2.<init>(r0)     // Catch: java.io.EOFException -> L82
            r2.append(r11)     // Catch: java.io.EOFException -> L82
            java.lang.String r11 = " frame type "
            r2.append(r11)     // Catch: java.io.EOFException -> L82
            r2.append(r1)     // Catch: java.io.EOFException -> L82
            java.lang.String r11 = r2.toString()     // Catch: java.io.EOFException -> L82
            erm r0 = new erm     // Catch: java.io.EOFException -> L82
            r0.<init>(r11, r6, r4, r4)     // Catch: java.io.EOFException -> L82
            throw r0     // Catch: java.io.EOFException -> L82
        L76:
            java.lang.String r11 = "Invalid padding bits for frame header "
            java.lang.String r11 = defpackage.a.bV(r1, r11)     // Catch: java.io.EOFException -> L82
            erm r0 = new erm     // Catch: java.io.EOFException -> L82
            r0.<init>(r11, r6, r4, r4)     // Catch: java.io.EOFException -> L82
            throw r0     // Catch: java.io.EOFException -> L82
        L82:
            return r3
        L83:
            fmq r0 = r10.p
            int r11 = r0.d(r11, r1, r4)
            if (r11 != r3) goto L8c
            return r3
        L8c:
            int r0 = r10.j
            int r0 = r0 - r11
            r10.j = r0
            if (r0 <= 0) goto L94
            return r2
        L94:
            fmq r3 = r10.p
            long r4 = r10.h
            int r7 = r10.i
            r8 = 0
            r9 = 0
            r6 = 1
            r3.n(r4, r6, r7, r8, r9)
            long r0 = r10.h
            r3 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r3
            r10.h = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmt.a(flv):int");
    }

    private static boolean b(flv flvVar, byte[] bArr) {
        flvVar.l();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        flvVar.j(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean c(flv flvVar) {
        byte[] bArr = c;
        if (b(flvVar, bArr)) {
            this.g = false;
            flvVar.m(bArr.length);
            return true;
        }
        byte[] bArr2 = d;
        if (!b(flvVar, bArr2)) {
            return false;
        }
        this.g = true;
        flvVar.m(bArr2.length);
        return true;
    }

    @Override // defpackage.flu
    public final /* synthetic */ List d() {
        int i = alog.d;
        return alsx.a;
    }

    @Override // defpackage.flu
    public final void e(flw flwVar) {
        this.n = flwVar;
        fmq p = flwVar.p(0, 1);
        this.o = p;
        this.p = p;
        flwVar.r();
    }

    @Override // defpackage.flu
    public final void f(long j, long j2) {
        this.h = 0L;
        this.i = 0;
        this.j = 0;
        this.r = j2;
        this.m = 0L;
    }

    @Override // defpackage.flu
    public final boolean g(flv flvVar) {
        return c(flvVar);
    }

    @Override // defpackage.flu
    public final int i(flv flvVar, vtk vtkVar) {
        String str;
        int i;
        int i2;
        dzg.h(this.o);
        int i3 = eul.a;
        if (((fln) flvVar).c == 0 && !c(flvVar)) {
            throw new erm("Could not find AMR header.", null, true, 1);
        }
        if (!this.s) {
            this.s = true;
            boolean z = this.g;
            if (true != z) {
                str = "audio/3gpp";
            } else {
                str = "audio/amr-wb";
            }
            if (true != z) {
                i = 8000;
            } else {
                i = 16000;
            }
            if (z) {
                i2 = b[8];
            } else {
                i2 = a[7];
            }
            fmq fmqVar = this.p;
            eqm eqmVar = new eqm();
            eqmVar.b(str);
            eqmVar.n = i2;
            eqmVar.B = 1;
            eqmVar.C = i;
            fmqVar.h(new eqn(eqmVar));
        }
        int a2 = a(flvVar);
        if (this.q == null) {
            fmj fmjVar = new fmj(-9223372036854775807L);
            this.q = fmjVar;
            this.n.w(fmjVar);
        }
        if (a2 == -1) {
            return -1;
        }
        return 0;
    }

    public fmt() {
        this(null);
    }

    @Override // defpackage.flu
    public final /* synthetic */ void h() {
    }
}
