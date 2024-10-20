package defpackage;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class feo extends ezg {
    private fen A;
    private int B;
    private final feh j;
    private final ewl k;
    private final ArrayDeque l;
    private boolean m;
    private boolean n;
    private fem o;
    private long p;
    private long q;
    private int r;
    private int s;
    private eqn t;
    private fei u;
    private ewl v;
    private ImageOutput w;
    private Bitmap x;
    private boolean y;
    private fen z;

    public feo(feh fehVar) {
        super(4);
        this.j = fehVar;
        this.w = W(null);
        this.k = new ewl(0);
        this.o = fem.a;
        this.l = new ArrayDeque();
        this.q = -9223372036854775807L;
        this.p = -9223372036854775807L;
        this.r = 0;
        this.s = 1;
    }

    private static ImageOutput W(ImageOutput imageOutput) {
        if (imageOutput == null) {
            return ImageOutput.a;
        }
        return imageOutput;
    }

    private final void X() {
        int a = this.j.a(this.t);
        if (a != dzn.d(4) && a != dzn.d(3)) {
            throw g(new fej(), this.t, 4005);
        }
        fei feiVar = this.u;
        if (feiVar != null) {
            feiVar.e();
        }
        this.u = new feg();
    }

    private final void Y() {
        this.v = null;
        this.r = 0;
        this.q = -9223372036854775807L;
        fei feiVar = this.u;
        if (feiVar != null) {
            feiVar.e();
            this.u = null;
        }
    }

    private final void Z() {
        this.s = Math.min(this.s, 1);
    }

    @Override // defpackage.fbd, defpackage.fbf
    public final String R() {
        return "ImageRenderer";
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x00d9, code lost:
    
        if (r14 != 2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ed, code lost:
    
        if (r11 == false) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0191 A[Catch: fej -> 0x0237, TryCatch #0 {fej -> 0x0237, blocks: (B:15:0x003c, B:16:0x0041, B:18:0x0048, B:23:0x011f, B:25:0x0123, B:29:0x0233, B:31:0x0129, B:33:0x0131, B:35:0x0135, B:37:0x0139, B:39:0x013d, B:42:0x0147, B:100:0x014b, B:44:0x0163, B:47:0x016e, B:49:0x0179, B:54:0x0191, B:55:0x01a0, B:57:0x01ab, B:58:0x01f5, B:71:0x0200, B:60:0x0205, B:62:0x0216, B:63:0x0221, B:69:0x0219, B:72:0x01ae, B:74:0x01c0, B:76:0x01c9, B:79:0x01d2, B:81:0x01d6, B:86:0x01e1, B:90:0x01ef, B:91:0x0182, B:97:0x0226, B:104:0x004e, B:106:0x0052, B:110:0x0058, B:112:0x0065, B:116:0x006b, B:118:0x006f, B:119:0x007c, B:121:0x0087, B:114:0x008b, B:123:0x0099, B:125:0x009d, B:127:0x00a1, B:129:0x00a5, B:131:0x00b4, B:132:0x00bb, B:141:0x00d3, B:142:0x00d8, B:143:0x00df, B:144:0x00f2, B:146:0x00fa, B:148:0x0108, B:150:0x0113), top: B:14:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ab A[Catch: fej -> 0x0237, TryCatch #0 {fej -> 0x0237, blocks: (B:15:0x003c, B:16:0x0041, B:18:0x0048, B:23:0x011f, B:25:0x0123, B:29:0x0233, B:31:0x0129, B:33:0x0131, B:35:0x0135, B:37:0x0139, B:39:0x013d, B:42:0x0147, B:100:0x014b, B:44:0x0163, B:47:0x016e, B:49:0x0179, B:54:0x0191, B:55:0x01a0, B:57:0x01ab, B:58:0x01f5, B:71:0x0200, B:60:0x0205, B:62:0x0216, B:63:0x0221, B:69:0x0219, B:72:0x01ae, B:74:0x01c0, B:76:0x01c9, B:79:0x01d2, B:81:0x01d6, B:86:0x01e1, B:90:0x01ef, B:91:0x0182, B:97:0x0226, B:104:0x004e, B:106:0x0052, B:110:0x0058, B:112:0x0065, B:116:0x006b, B:118:0x006f, B:119:0x007c, B:121:0x0087, B:114:0x008b, B:123:0x0099, B:125:0x009d, B:127:0x00a1, B:129:0x00a5, B:131:0x00b4, B:132:0x00bb, B:141:0x00d3, B:142:0x00d8, B:143:0x00df, B:144:0x00f2, B:146:0x00fa, B:148:0x0108, B:150:0x0113), top: B:14:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0205 A[Catch: fej -> 0x0237, TryCatch #0 {fej -> 0x0237, blocks: (B:15:0x003c, B:16:0x0041, B:18:0x0048, B:23:0x011f, B:25:0x0123, B:29:0x0233, B:31:0x0129, B:33:0x0131, B:35:0x0135, B:37:0x0139, B:39:0x013d, B:42:0x0147, B:100:0x014b, B:44:0x0163, B:47:0x016e, B:49:0x0179, B:54:0x0191, B:55:0x01a0, B:57:0x01ab, B:58:0x01f5, B:71:0x0200, B:60:0x0205, B:62:0x0216, B:63:0x0221, B:69:0x0219, B:72:0x01ae, B:74:0x01c0, B:76:0x01c9, B:79:0x01d2, B:81:0x01d6, B:86:0x01e1, B:90:0x01ef, B:91:0x0182, B:97:0x0226, B:104:0x004e, B:106:0x0052, B:110:0x0058, B:112:0x0065, B:116:0x006b, B:118:0x006f, B:119:0x007c, B:121:0x0087, B:114:0x008b, B:123:0x0099, B:125:0x009d, B:127:0x00a1, B:129:0x00a5, B:131:0x00b4, B:132:0x00bb, B:141:0x00d3, B:142:0x00d8, B:143:0x00df, B:144:0x00f2, B:146:0x00fa, B:148:0x0108, B:150:0x0113), top: B:14:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ae A[Catch: fej -> 0x0237, TryCatch #0 {fej -> 0x0237, blocks: (B:15:0x003c, B:16:0x0041, B:18:0x0048, B:23:0x011f, B:25:0x0123, B:29:0x0233, B:31:0x0129, B:33:0x0131, B:35:0x0135, B:37:0x0139, B:39:0x013d, B:42:0x0147, B:100:0x014b, B:44:0x0163, B:47:0x016e, B:49:0x0179, B:54:0x0191, B:55:0x01a0, B:57:0x01ab, B:58:0x01f5, B:71:0x0200, B:60:0x0205, B:62:0x0216, B:63:0x0221, B:69:0x0219, B:72:0x01ae, B:74:0x01c0, B:76:0x01c9, B:79:0x01d2, B:81:0x01d6, B:86:0x01e1, B:90:0x01ef, B:91:0x0182, B:97:0x0226, B:104:0x004e, B:106:0x0052, B:110:0x0058, B:112:0x0065, B:116:0x006b, B:118:0x006f, B:119:0x007c, B:121:0x0087, B:114:0x008b, B:123:0x0099, B:125:0x009d, B:127:0x00a1, B:129:0x00a5, B:131:0x00b4, B:132:0x00bb, B:141:0x00d3, B:142:0x00d8, B:143:0x00df, B:144:0x00f2, B:146:0x00fa, B:148:0x0108, B:150:0x0113), top: B:14:0x003c }] */
    @Override // defpackage.fbd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(long r18, long r20) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.feo.S(long, long):void");
    }

    @Override // defpackage.fbd
    public final boolean T() {
        return this.n;
    }

    @Override // defpackage.fbd
    public final boolean U() {
        int i = this.s;
        if (i == 3) {
            return true;
        }
        if (i == 0 && this.y) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fbf
    public final int V(eqn eqnVar) {
        return this.j.a(eqnVar);
    }

    @Override // defpackage.ezg, defpackage.fba
    public final void p(int i, Object obj) {
        ImageOutput imageOutput;
        if (i != 15) {
            return;
        }
        if (obj instanceof ImageOutput) {
            imageOutput = (ImageOutput) obj;
        } else {
            imageOutput = null;
        }
        this.w = W(imageOutput);
    }

    @Override // defpackage.ezg
    protected final void s() {
        this.t = null;
        this.o = fem.a;
        this.l.clear();
        Y();
        this.w.a();
    }

    @Override // defpackage.ezg
    protected final void t(boolean z, boolean z2) {
        this.s = z2 ? 1 : 0;
    }

    @Override // defpackage.ezg
    protected final void u(long j, boolean z) {
        Z();
        this.n = false;
        this.m = false;
        this.x = null;
        this.z = null;
        this.A = null;
        this.y = false;
        this.v = null;
        fei feiVar = this.u;
        if (feiVar != null) {
            feiVar.c();
        }
        this.l.clear();
    }

    @Override // defpackage.ezg
    protected final void v() {
        Y();
    }

    @Override // defpackage.ezg
    protected final void w() {
        Y();
        Z();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r5) goto L15;
     */
    @Override // defpackage.ezg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void z(defpackage.eqn[] r5, long r6, long r8, defpackage.fgv r10) {
        /*
            r4 = this;
            fem r5 = r4.o
            long r5 = r5.c
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L33
            java.util.ArrayDeque r5 = r4.l
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L26
            long r5 = r4.q
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L33
            long r2 = r4.p
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L26
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 < 0) goto L26
            goto L33
        L26:
            java.util.ArrayDeque r5 = r4.l
            fem r6 = new fem
            long r0 = r4.q
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L33:
            fem r5 = new fem
            r5.<init>(r0, r8)
            r4.o = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.feo.z(eqn[], long, long, fgv):void");
    }
}
