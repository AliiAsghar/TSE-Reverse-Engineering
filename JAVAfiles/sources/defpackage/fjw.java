package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.android.vcard.VCardConfig;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjw extends ffh implements fkg {
    private static final int[] w = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean x;
    private static boolean y;
    private final boolean A;
    private final fkh B;
    private final fkf C;
    private boolean D;
    private boolean E;
    private boolean F;
    private List G;
    private fjy H;
    private eug I;
    private boolean J;
    private int K;
    private int L;
    private long M;
    private int N;
    private int O;
    private long P;
    private int Q;
    private long R;
    private esn S;
    private int T;
    private int U;
    private fke V;
    private long W;
    private long X;
    private boolean Y;
    private akrq Z;
    private final fvq aa;
    public Surface j;
    public int k;
    public esn l;
    public fka v;
    private final Context z;

    public fjw(Context context, ffa ffaVar, ffj ffjVar, Handler handler, faa faaVar) {
        super(2, ffaVar, ffjVar, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.z = applicationContext;
        this.v = null;
        this.aa = new fvq(handler, faaVar);
        this.B = new fkh(applicationContext, this);
        this.C = new fkf();
        this.A = "NVIDIA".equals(eul.c);
        this.I = eug.a;
        this.K = 1;
        this.L = 0;
        this.l = esn.a;
        this.U = 0;
        this.S = null;
        this.T = -1000;
        this.W = -9223372036854775807L;
        this.X = -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0064, code lost:
    
        if (r3.equals("video/mp4v-es") != false) goto L41;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0084. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int aC(defpackage.ffe r9, defpackage.eqn r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjw.aC(ffe, eqn):int");
    }

    protected static int aD(ffe ffeVar, eqn eqnVar) {
        if (eqnVar.p != -1) {
            int size = eqnVar.r.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += ((byte[]) eqnVar.r.get(i2)).length;
            }
            return eqnVar.p + i;
        }
        return aC(ffeVar, eqnVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x04c3, code lost:
    
        if (r13.equals("deb") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x079e, code lost:
    
        if (r0.equals("JSN-L21") == false) goto L514;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static final boolean aI(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 2926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjw.aI(java.lang.String):boolean");
    }

    protected static final boolean aK(ffe ffeVar) {
        if (eul.a >= 35 && ffeVar.h) {
            return true;
        }
        return false;
    }

    private static int aM(int i, int i2) {
        return (i * 3) / (i2 + i2);
    }

    private final Surface aN(ffe ffeVar) {
        boolean z;
        int i;
        fka fkaVar = this.v;
        if (fkaVar != null) {
            dzg.d(fkaVar.k());
            esk eskVar = fkaVar.c;
            dzg.h(eskVar);
            return eskVar.b();
        }
        Surface surface = this.j;
        if (surface != null) {
            return surface;
        }
        if (aK(ffeVar)) {
            return null;
        }
        dzg.d(aU(ffeVar));
        fjy fjyVar = this.H;
        if (fjyVar != null) {
            if (fjyVar.b != ffeVar.f) {
                aS();
            }
        }
        if (this.H == null) {
            boolean z2 = ffeVar.f;
            boolean z3 = false;
            if (z2 && !fjy.a()) {
                z = false;
            } else {
                z = true;
            }
            dzg.d(z);
            fjx fjxVar = new fjx();
            if (z2) {
                i = fjy.a;
            } else {
                i = 0;
            }
            fjxVar.start();
            fjxVar.b = new Handler(fjxVar.getLooper(), fjxVar);
            fjxVar.a = new eto(fjxVar.b);
            synchronized (fjxVar) {
                fjxVar.b.obtainMessage(1, i, 0).sendToTarget();
                while (fjxVar.e == null && fjxVar.d == null && fjxVar.c == null) {
                    try {
                        fjxVar.wait();
                    } catch (InterruptedException unused) {
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = fjxVar.d;
            if (runtimeException == null) {
                Error error = fjxVar.c;
                if (error == null) {
                    fjy fjyVar2 = fjxVar.e;
                    dzg.g(fjyVar2);
                    this.H = fjyVar2;
                } else {
                    throw error;
                }
            } else {
                throw runtimeException;
            }
        }
        return this.H;
    }

    private static List aO(Context context, ffj ffjVar, eqn eqnVar, boolean z, boolean z2) {
        if (eqnVar.o == null) {
            int i = alog.d;
            return alsx.a;
        }
        int i2 = eul.a;
        if ("video/dolby-vision".equals(eqnVar.o) && !eed.i(context)) {
            List e = ffp.e(eqnVar, z, z2);
            if (!e.isEmpty()) {
                return e;
            }
        }
        return ffp.f(eqnVar, z, z2);
    }

    private final void aP() {
        if (this.N > 0) {
            eN();
            fvq fvqVar = this.aa;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Object obj = fvqVar.a;
            if (obj != null) {
                ((Handler) obj).post(new fhg(fvqVar, 8));
            }
            this.N = 0;
            this.M = elapsedRealtime;
        }
    }

    private final void aQ() {
        esn esnVar = this.S;
        if (esnVar != null) {
            this.aa.g(esnVar);
        }
    }

    private final void aR(long j, long j2, eqn eqnVar) {
        fke fkeVar = this.V;
        if (fkeVar != null) {
            fkeVar.c(j, j2, eqnVar, ((ffh) this).o);
        }
    }

    private final void aS() {
        fjy fjyVar = this.H;
        if (fjyVar != null) {
            fjyVar.release();
            this.H = null;
        }
    }

    private final boolean aT(ffe ffeVar) {
        Surface surface = this.j;
        if ((surface == null || !surface.isValid()) && !aK(ffeVar) && !aU(ffeVar)) {
            return false;
        }
        return true;
    }

    private static final boolean aU(ffe ffeVar) {
        int i = eul.a;
        if (aI(ffeVar.a)) {
            return false;
        }
        if (ffeVar.f && !fjy.a()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ffh, defpackage.ezg, defpackage.fbd
    public final void G(float f, float f2) {
        super.G(f, f2);
        fka fkaVar = this.v;
        if (fkaVar != null) {
            fkaVar.g(f);
        } else {
            this.B.l(f);
        }
    }

    @Override // defpackage.fbd, defpackage.fbf
    public final String R() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.ffh, defpackage.fbd
    public final void S(long j, long j2) {
        super.S(j, j2);
        fka fkaVar = this.v;
        if (fkaVar != null) {
            try {
                fkaVar.d(j, j2);
            } catch (fko e) {
                throw g(e, e.a, 7001);
            }
        }
    }

    @Override // defpackage.ffh, defpackage.fbd
    public final boolean T() {
        if (!this.r) {
            return false;
        }
        fka fkaVar = this.v;
        if (fkaVar == null) {
            return true;
        }
        if (!fkaVar.k()) {
            return false;
        }
        long j = fkaVar.k;
        if (j == -9223372036854775807L || !fkaVar.r.g(j)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ffh, defpackage.fbd
    public final boolean U() {
        boolean z;
        boolean U = super.U();
        fka fkaVar = this.v;
        boolean z2 = true;
        if (fkaVar != null) {
            if (U && fkaVar.k()) {
                z = true;
            } else {
                z = false;
            }
            fkd fkdVar = fkaVar.r;
            if (!z || fkdVar.n != 0) {
                z2 = false;
            }
            return fkdVar.e.a.m(z2);
        }
        if (U) {
            if (((ffh) this).n == null || this.j == null) {
                return true;
            }
        } else {
            z2 = false;
        }
        return this.B.m(z2);
    }

    @Override // defpackage.ffh
    protected final int W(ffj ffjVar, eqn eqnVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (erl.j(eqnVar.o)) {
            if (eqnVar.s != null) {
                z = true;
            } else {
                z = false;
            }
            List aO = aO(this.z, ffjVar, eqnVar, z, false);
            if (z && aO.isEmpty()) {
                aO = aO(this.z, ffjVar, eqnVar, false, false);
            }
            if (aO.isEmpty()) {
                i5 = 1;
            } else if (!ay(eqnVar)) {
                i5 = 2;
            } else {
                ffe ffeVar = (ffe) aO.get(0);
                boolean d = ffeVar.d(eqnVar);
                if (!d) {
                    for (int i6 = 1; i6 < aO.size(); i6++) {
                        ffe ffeVar2 = (ffe) aO.get(i6);
                        if (ffeVar2.d(eqnVar)) {
                            z2 = false;
                            d = true;
                            ffeVar = ffeVar2;
                            break;
                        }
                    }
                }
                z2 = true;
                if (true != d) {
                    i = 3;
                } else {
                    i = 4;
                }
                int i7 = i;
                if (true != ffeVar.f(eqnVar)) {
                    i2 = 8;
                } else {
                    i2 = 16;
                }
                int i8 = i2;
                if (true != ffeVar.g) {
                    i3 = 0;
                } else {
                    i3 = 64;
                }
                if (true != z2) {
                    i4 = 0;
                } else {
                    i4 = 128;
                }
                int i9 = eul.a;
                if ("video/dolby-vision".equals(eqnVar.o) && !eed.i(this.z)) {
                    i4 = 256;
                }
                int i10 = i4;
                if (d) {
                    List aO2 = aO(this.z, ffjVar, eqnVar, z, true);
                    if (!aO2.isEmpty()) {
                        ffe ffeVar3 = (ffe) ffp.d(aO2, eqnVar).get(0);
                        if (ffeVar3.d(eqnVar) && ffeVar3.f(eqnVar)) {
                            i5 = 32;
                        }
                    }
                }
                return dzn.f(i7, i8, i5, i3, i10, 0);
            }
        }
        return dzn.d(i5);
    }

    @Override // defpackage.ffh
    protected final ezi X(ffe ffeVar, eqn eqnVar, eqn eqnVar2) {
        int i;
        int i2;
        ezi b = ffeVar.b(eqnVar, eqnVar2);
        int i3 = b.e;
        akrq akrqVar = this.Z;
        dzg.g(akrqVar);
        if (eqnVar2.v > akrqVar.c || eqnVar2.w > akrqVar.a) {
            i3 |= 256;
        }
        if (aD(ffeVar, eqnVar2) > akrqVar.b) {
            i3 |= 64;
        }
        String str = ffeVar.a;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = b.d;
            i2 = 0;
        }
        return new ezi(str, eqnVar, eqnVar2, i, i2);
    }

    @Override // defpackage.ffh
    protected final List Y(ffj ffjVar, eqn eqnVar, boolean z) {
        return ffp.d(aO(this.z, ffjVar, eqnVar, z, false), eqnVar);
    }

    @Override // defpackage.ffh
    protected final void Z(ewl ewlVar) {
        if (this.E) {
            ByteBuffer byteBuffer = ewlVar.g;
            dzg.g(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        ffb ffbVar = ((ffh) this).n;
                        dzg.g(ffbVar);
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        ffbVar.l(bundle);
                    }
                }
            }
        }
    }

    @Override // defpackage.ffh
    protected final void aA() {
        this.k++;
        int i = eul.a;
    }

    @Override // defpackage.ffh
    protected final void aB() {
        int i = eul.a;
    }

    protected final long aE() {
        return -this.W;
    }

    public final void aF() {
        this.aa.f(this.j);
        this.J = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aG(int i, int i2) {
        ezh ezhVar = this.t;
        ezhVar.h += i;
        int i3 = i + i2;
        ezhVar.g += i3;
        this.N += i3;
        int i4 = this.O + i3;
        this.O = i4;
        ezhVar.i = Math.max(i4, ezhVar.i);
        if (this.N >= 50) {
            aP();
        }
    }

    protected final void aH(long j) {
        ezh ezhVar = this.t;
        ezhVar.k += j;
        ezhVar.l++;
        this.P += j;
        this.Q++;
    }

    protected final void aJ(ffb ffbVar, int i, long j) {
        Trace.beginSection("releaseOutputBuffer");
        ffbVar.j(i, j);
        Trace.endSection();
        this.t.e++;
        this.O = 0;
        if (this.v == null) {
            esn esnVar = this.l;
            if (!esnVar.equals(esn.a) && !esnVar.equals(this.S)) {
                this.S = esnVar;
                this.aa.g(esnVar);
            }
            if (this.B.n() && this.j != null) {
                aF();
            }
        }
    }

    protected final void aL(ffb ffbVar, int i) {
        Trace.beginSection("skipVideoBuffer");
        ffbVar.o(i);
        Trace.endSection();
        this.t.f++;
    }

    @Override // defpackage.ffh
    protected final void aa(Exception exc) {
        eub.d("MediaCodecVideoRenderer", "Video codec error", exc);
        fvq fvqVar = this.aa;
        Object obj = fvqVar.a;
        if (obj != null) {
            ((Handler) obj).post(new fhg(fvqVar, 10));
        }
    }

    @Override // defpackage.ffh
    protected final void ab(String str) {
        fvq fvqVar = this.aa;
        Object obj = fvqVar.a;
        if (obj != null) {
            ((Handler) obj).post(new fhg(fvqVar, 13));
        }
    }

    @Override // defpackage.ffh
    protected final void ac(eqn eqnVar, MediaFormat mediaFormat) {
        boolean z;
        int integer;
        int integer2;
        boolean z2;
        ffb ffbVar = ((ffh) this).n;
        if (ffbVar != null) {
            ffbVar.m(this.K);
        }
        dzg.g(mediaFormat);
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        if (z) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        float f = eqnVar.z;
        if (eul.a >= 30 && mediaFormat != null && mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) {
            f = mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height");
        }
        int i = eqnVar.y;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.l = new esn(integer, integer2, f);
        fka fkaVar = this.v;
        if (fkaVar != null && this.Y) {
            eqm eqmVar = new eqm(eqnVar);
            eqmVar.t = integer;
            eqmVar.u = integer2;
            eqmVar.x = f;
            eqn eqnVar2 = new eqn(eqmVar);
            dzg.d(fkaVar.k());
            fkaVar.r.d.j(eqnVar2.x);
            fkaVar.e = 1;
            fkaVar.d = eqnVar2;
            if (!fkaVar.m) {
                fkaVar.c();
                fkaVar.m = true;
                fkaVar.n = false;
                fkaVar.o = -9223372036854775807L;
            } else {
                if (fkaVar.l != -9223372036854775807L) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                dzg.d(z2);
                fkaVar.n = true;
                fkaVar.o = fkaVar.l;
            }
        } else {
            this.B.j(eqnVar.x);
        }
        this.Y = false;
    }

    @Override // defpackage.ffh
    protected final void ad() {
        fka fkaVar = this.v;
        if (fkaVar != null) {
            fkaVar.h(am(), al(), aE(), this.f);
        } else {
            this.B.e();
        }
        this.Y = true;
    }

    @Override // defpackage.ffh
    protected final boolean af(long j, long j2, ffb ffbVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, eqn eqnVar) {
        fka fkaVar;
        ffb ffbVar2;
        fka fkaVar2;
        fjw fjwVar;
        long j4;
        long j5;
        boolean z3;
        boolean z4;
        fjw fjwVar2 = this;
        dzg.g(ffbVar);
        long al = j3 - al();
        fka fkaVar3 = fjwVar2.v;
        if (fkaVar3 != null) {
            long aE = j3 + aE();
            try {
                dzg.d(fkaVar3.k());
                long j6 = aE - fkaVar3.h;
                try {
                } catch (ezo e) {
                    e = e;
                    fkaVar = fkaVar3;
                }
                try {
                    try {
                        if (fkaVar3.r.d.a(j6, j, j2, fkaVar3.f, z2, fkaVar3.b) == 4) {
                            return false;
                        }
                        if (j6 < fkaVar3.i) {
                            if (!z2) {
                                aL(ffbVar, i);
                                return true;
                            }
                            ffbVar2 = ffbVar;
                            fkaVar2 = fkaVar3;
                            fjwVar = this;
                            j4 = j;
                            j5 = j2;
                            z3 = true;
                        } else {
                            ffbVar2 = ffbVar;
                            fkaVar2 = fkaVar3;
                            fjwVar = this;
                            j4 = j;
                            j5 = j2;
                            z3 = z2;
                        }
                        fkaVar2.d(j4, j5);
                        if (fkaVar2.n) {
                            long j7 = fkaVar2.o;
                            if (j7 != -9223372036854775807L && !fkaVar2.r.g(j7)) {
                                return false;
                            }
                            fkaVar2.c();
                            z4 = false;
                            fkaVar2.n = false;
                            fkaVar2.o = -9223372036854775807L;
                        } else {
                            z4 = false;
                        }
                        esk eskVar = fkaVar2.c;
                        dzg.h(eskVar);
                        if (eskVar.a() < fkaVar2.a) {
                            esk eskVar2 = fkaVar2.c;
                            dzg.h(eskVar2);
                            if (eskVar2.g()) {
                                if (fkaVar2.j) {
                                    fkd fkdVar = fkaVar2.r;
                                    long j8 = fkaVar2.h;
                                    long j9 = fkaVar2.g;
                                    fkdVar.p = j8;
                                    fkl fklVar = fkdVar.e;
                                    fklVar.i.h(j6, Long.valueOf(j9));
                                    fkaVar2.j = z4;
                                }
                                fkaVar2.l = j6;
                                if (z3) {
                                    fkaVar2.k = j6;
                                }
                                fjwVar.aJ(ffbVar2, i, aE * 1000);
                                return true;
                            }
                        }
                        return z4;
                    } catch (fko e2) {
                        e = e2;
                        fjwVar2 = this;
                        throw fjwVar2.g(e, e.a, 7001);
                    }
                } catch (ezo e3) {
                    e = e3;
                    fkaVar = fkaVar3;
                    eqn eqnVar2 = fkaVar.d;
                    dzg.h(eqnVar2);
                    throw new fko(e, eqnVar2);
                }
            } catch (fko e4) {
                e = e4;
            }
        } else {
            int a = fjwVar2.B.a(j3, j, j2, am(), z2, fjwVar2.C);
            if (a == 4) {
                return false;
            }
            if (z && !z2) {
                fjwVar2.aL(ffbVar, i);
                return true;
            }
            if (fjwVar2.j == null) {
                if (fjwVar2.C.a >= 30000) {
                    return false;
                }
                fjwVar2.aL(ffbVar, i);
                fjwVar2.aH(fjwVar2.C.a);
                return true;
            }
            if (a != 0) {
                if (a != 1) {
                    if (a != 2) {
                        if (a != 3) {
                            if (a == 5) {
                                return false;
                            }
                            throw new IllegalStateException(String.valueOf(a));
                        }
                        fjwVar2.aL(ffbVar, i);
                        fjwVar2.aH(fjwVar2.C.a);
                        return true;
                    }
                    Trace.beginSection("dropVideoBuffer");
                    ffbVar.o(i);
                    Trace.endSection();
                    fjwVar2.aG(0, 1);
                    fjwVar2.aH(fjwVar2.C.a);
                    return true;
                }
                dzg.h(ffbVar);
                fkf fkfVar = fjwVar2.C;
                long j10 = fkfVar.b;
                long j11 = fkfVar.a;
                if (j10 == fjwVar2.R) {
                    fjwVar2.aL(ffbVar, i);
                } else {
                    aR(al, j10, eqnVar);
                    fjwVar2.aJ(ffbVar, i, j10);
                }
                fjwVar2.aH(j11);
                fjwVar2.R = j10;
                return true;
            }
            eN();
            long nanoTime = System.nanoTime();
            aR(al, nanoTime, eqnVar);
            fjwVar2.aJ(ffbVar, i, nanoTime);
            fjwVar2.aH(fjwVar2.C.a);
            return true;
        }
    }

    @Override // defpackage.ffh
    protected final float ah(float f, eqn[] eqnVarArr) {
        float f2 = -1.0f;
        for (eqn eqnVar : eqnVarArr) {
            float f3 = eqnVar.x;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // defpackage.ffh
    protected final void ai(String str, long j, long j2) {
        fvq fvqVar = this.aa;
        Object obj = fvqVar.a;
        if (obj != null) {
            ((Handler) obj).post(new fhg(fvqVar, 7));
        }
        this.D = aI(str);
        ffe ffeVar = ((ffh) this).p;
        dzg.g(ffeVar);
        boolean z = false;
        if (eul.a >= 29 && "video/x-vnd.on2.vp9".equals(ffeVar.b)) {
            MediaCodecInfo.CodecProfileLevel[] h = ffeVar.h();
            int length = h.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (h[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.E = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ffh
    public final ezi aj(fqu fquVar) {
        ezi aj = super.aj(fquVar);
        dzg.g(fquVar.a);
        fvq fvqVar = this.aa;
        Object obj = fvqVar.a;
        if (obj != null) {
            ((Handler) obj).post(new fhg(fvqVar, 12));
        }
        return aj;
    }

    @Override // defpackage.ffh
    protected final gbl ak(ffe ffeVar, eqn eqnVar, MediaCrypto mediaCrypto, float f) {
        boolean z;
        int i;
        Point point;
        int i2;
        int i3;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i4;
        boolean z2;
        boolean z3;
        int i5;
        int aC;
        eqn[] M = M();
        int length = M.length;
        int aD = aD(ffeVar, eqnVar);
        int i6 = eqnVar.v;
        int i7 = eqnVar.w;
        if (length == 1) {
            if (aD != -1 && (aC = aC(ffeVar, eqnVar)) != -1) {
                aD = Math.min((int) (aD * 1.5f), aC);
            }
        } else {
            boolean z4 = false;
            for (int i8 = 0; i8 < length; i8++) {
                eqn eqnVar2 = M[i8];
                eqd eqdVar = eqnVar.C;
                if (eqdVar != null && eqnVar2.C == null) {
                    eqm eqmVar = new eqm(eqnVar2);
                    eqmVar.A = eqdVar;
                    eqnVar2 = new eqn(eqmVar);
                }
                if (ffeVar.b(eqnVar, eqnVar2).d != 0) {
                    int i9 = eqnVar2.v;
                    if (i9 != -1 && eqnVar2.w != -1) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    z4 |= z3;
                    i6 = Math.max(i6, i9);
                    i7 = Math.max(i7, eqnVar2.w);
                    aD = Math.max(aD, aD(ffeVar, eqnVar2));
                }
            }
            if (z4) {
                eub.f("MediaCodecVideoRenderer", a.bU(i7, i6, "Resolutions unknown. Codec max resolution: ", "x"));
                int i10 = eqnVar.w;
                int i11 = eqnVar.v;
                if (i10 > i11) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i = i10;
                } else {
                    i = i11;
                }
                if (true == z) {
                    i10 = i11;
                }
                int[] iArr = w;
                int i12 = 0;
                while (i12 < 9) {
                    float f2 = i;
                    float f3 = i10;
                    int i13 = iArr[i12];
                    int[] iArr2 = iArr;
                    float f4 = i13;
                    if (i13 <= i || (i2 = (int) (f4 * (f3 / f2))) <= i10) {
                        break;
                    }
                    if (true != z) {
                        i3 = i13;
                    } else {
                        i3 = i2;
                    }
                    if (true != z) {
                        i13 = i2;
                    }
                    MediaCodecInfo.CodecCapabilities codecCapabilities = ffeVar.d;
                    if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        point = null;
                    } else {
                        point = ffe.a(videoCapabilities, i3, i13);
                    }
                    float f5 = eqnVar.x;
                    if (point != null) {
                        z2 = z;
                        i4 = i10;
                        if (ffeVar.g(point.x, point.y, f5)) {
                            break;
                        }
                    } else {
                        i4 = i10;
                        z2 = z;
                    }
                    i12++;
                    z = z2;
                    iArr = iArr2;
                    i10 = i4;
                }
                point = null;
                if (point != null) {
                    i6 = Math.max(i6, point.x);
                    i7 = Math.max(i7, point.y);
                    eqm eqmVar2 = new eqm(eqnVar);
                    eqmVar2.t = i6;
                    eqmVar2.u = i7;
                    aD = Math.max(aD, aC(ffeVar, new eqn(eqmVar2)));
                    eub.f("MediaCodecVideoRenderer", a.bU(i7, i6, "Codec max resolution adjusted to: ", "x"));
                }
            }
        }
        String str = ffeVar.c;
        akrq akrqVar = new akrq(i6, i7, aD, null);
        this.Z = akrqVar;
        boolean z5 = this.A;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", eqnVar.v);
        mediaFormat.setInteger("height", eqnVar.w);
        dzh.k(mediaFormat, eqnVar.r);
        dzh.l(mediaFormat, eqnVar.x);
        dzh.i(mediaFormat, "rotation-degrees", eqnVar.y);
        dzh.h(mediaFormat, eqnVar.C);
        if ("video/dolby-vision".equals(eqnVar.o)) {
            int i14 = ffp.a;
            Pair a = etj.a(eqnVar);
            if (a != null) {
                dzh.i(mediaFormat, "profile", ((Integer) a.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", akrqVar.c);
        mediaFormat.setInteger("max-height", akrqVar.a);
        dzh.i(mediaFormat, "max-input-size", akrqVar.b);
        int i15 = eul.a;
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (z5) {
            mediaFormat.setInteger("no-post-process", 1);
            i5 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            i5 = 0;
        }
        if (eul.a >= 35) {
            mediaFormat.setInteger(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.IMPORTANCE, Math.max(i5, -this.T));
        }
        Surface aN = aN(ffeVar);
        if (this.v != null && !eul.X(this.z)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new gbl(ffeVar, mediaFormat, eqnVar, aN, mediaCrypto, (fez) null);
    }

    @Override // defpackage.ffh
    protected final ffd an(Throwable th, ffe ffeVar) {
        return new fju(th, ffeVar, this.j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ffh
    public final void ap(long j) {
        super.ap(j);
        this.k--;
    }

    @Override // defpackage.ffh
    protected final void aq(eqn eqnVar) {
        boolean z;
        eqd eqdVar;
        fka fkaVar = this.v;
        if (fkaVar != null && !fkaVar.k()) {
            try {
                dzg.d(!fkaVar.k());
                fkd fkdVar = fkaVar.r;
                if (fkdVar.o == 0) {
                    z = true;
                } else {
                    z = false;
                }
                dzg.d(z);
                eqd e = fkd.e(eqnVar.C);
                if (e.e == 7 && eul.a < 34) {
                    eqdVar = new eqd(e.c, e.d, 6, e.f, e.g, e.h);
                } else {
                    eqdVar = e;
                }
                eti etiVar = fkdVar.h;
                Looper myLooper = Looper.myLooper();
                dzg.h(myLooper);
                fkdVar.l = etiVar.b(myLooper, null);
                try {
                    eru eruVar = fkdVar.f;
                    Context context = fkdVar.b;
                    eqg eqgVar = eqg.a;
                    etu etuVar = fkdVar.l;
                    etuVar.getClass();
                    fcv fcvVar = new fcv(etuVar, 3);
                    int i = alog.d;
                    fkdVar.q = eruVar.a(context, eqdVar, eqgVar, fkdVar, fcvVar, alsx.a);
                    Pair pair = fkdVar.m;
                    if (pair != null) {
                        Surface surface = (Surface) pair.first;
                        eug eugVar = (eug) fkdVar.m.second;
                        fkdVar.f(surface, eugVar.b, eugVar.c);
                    }
                    fkdVar.q.b(0);
                    fkdVar.o = 1;
                    fkaVar.c = fkdVar.q.a(0);
                } catch (esh e2) {
                    throw new fko(e2, eqnVar);
                }
            } catch (fko e3) {
                throw g(e3, eqnVar, 7000);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ffh
    public final void as() {
        super.as();
        this.k = 0;
    }

    @Override // defpackage.ffh
    protected final boolean aw(ffe ffeVar) {
        return aT(ffeVar);
    }

    @Override // defpackage.ffh
    protected final boolean ax(ewl ewlVar) {
        if (ewlVar.eQ(VCardConfig.FLAG_APPEND_TYPE_PARAM) && !K() && !ewlVar.g() && this.X != -9223372036854775807L) {
            if (this.X - (ewlVar.f - al()) > 100000 && !ewlVar.j() && ewlVar.f < this.f) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ezg, defpackage.fbd
    public final void o() {
        fka fkaVar = this.v;
        if (fkaVar != null) {
            fkaVar.r.d.b();
        } else {
            this.B.b();
        }
    }

    @Override // defpackage.ffh, defpackage.ezg, defpackage.fba
    public final void p(int i, Object obj) {
        Surface surface;
        if (i != 1) {
            if (i != 7) {
                if (i != 10) {
                    if (i != 16) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 13) {
                                    if (i != 14) {
                                        super.p(i, obj);
                                        return;
                                    }
                                    dzg.g(obj);
                                    eug eugVar = (eug) obj;
                                    if (eugVar.b != 0 && eugVar.c != 0) {
                                        this.I = eugVar;
                                        fka fkaVar = this.v;
                                        if (fkaVar != null) {
                                            Surface surface2 = this.j;
                                            dzg.h(surface2);
                                            fkaVar.f(surface2, eugVar);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                dzg.g(obj);
                                List list = (List) obj;
                                this.G = list;
                                fka fkaVar2 = this.v;
                                if (fkaVar2 != null) {
                                    fkaVar2.i(list);
                                    return;
                                }
                                return;
                            }
                            dzg.g(obj);
                            int intValue = ((Integer) obj).intValue();
                            this.L = intValue;
                            fka fkaVar3 = this.v;
                            if (fkaVar3 != null) {
                                fkaVar3.e(intValue);
                                return;
                            } else {
                                this.B.i(intValue);
                                return;
                            }
                        }
                        dzg.g(obj);
                        int intValue2 = ((Integer) obj).intValue();
                        this.K = intValue2;
                        ffb ffbVar = ((ffh) this).n;
                        if (ffbVar != null) {
                            ffbVar.m(intValue2);
                            return;
                        }
                        return;
                    }
                    dzg.g(obj);
                    this.T = ((Integer) obj).intValue();
                    ffb ffbVar2 = ((ffh) this).n;
                    if (ffbVar2 != null && eul.a >= 35) {
                        Bundle bundle = new Bundle();
                        bundle.putInt(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.IMPORTANCE, Math.max(0, -this.T));
                        ffbVar2.l(bundle);
                        return;
                    }
                    return;
                }
                dzg.g(obj);
                int intValue3 = ((Integer) obj).intValue();
                if (this.U != intValue3) {
                    this.U = intValue3;
                    return;
                }
                return;
            }
            dzg.g(obj);
            fke fkeVar = (fke) obj;
            this.V = fkeVar;
            fka fkaVar4 = this.v;
            if (fkaVar4 != null) {
                fkaVar4.j(fkeVar);
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            surface = null;
        }
        if (this.j != surface) {
            this.j = surface;
            if (this.v == null) {
                this.B.k(surface);
            }
            this.J = false;
            int i2 = this.c;
            ffb ffbVar3 = ((ffh) this).n;
            if (ffbVar3 != null && this.v == null) {
                ffe ffeVar = ((ffh) this).p;
                dzg.g(ffeVar);
                boolean aT = aT(ffeVar);
                int i3 = eul.a;
                if (aT && !this.D) {
                    Surface aN = aN(ffeVar);
                    if (aN != null) {
                        ffbVar3.k(aN);
                    } else if (eul.a >= 35) {
                        ffbVar3.g();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    ar();
                    ao();
                }
            }
            if (surface != null) {
                aQ();
                if (i2 == 2) {
                    fka fkaVar5 = this.v;
                    if (fkaVar5 != null) {
                        fkaVar5.b(true);
                        return;
                    } else {
                        this.B.c(true);
                        return;
                    }
                }
                return;
            }
            this.S = null;
            fka fkaVar6 = this.v;
            if (fkaVar6 != null) {
                int i4 = eug.a.b;
                int i5 = eug.a.c;
                fkd fkdVar = fkaVar6.r;
                fkdVar.f(null, i4, i5);
                fkdVar.m = null;
                return;
            }
            return;
        }
        if (surface != null) {
            aQ();
            Surface surface3 = this.j;
            if (surface3 != null && this.J) {
                this.aa.f(surface3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ffh, defpackage.ezg
    public final void s() {
        this.S = null;
        this.X = -9223372036854775807L;
        fka fkaVar = this.v;
        if (fkaVar != null) {
            fkaVar.r.d.d();
        } else {
            this.B.d();
        }
        this.J = false;
        try {
            super.s();
        } finally {
            this.aa.e(this.t);
            this.aa.g(esn.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ffh, defpackage.ezg
    public final void t(boolean z, boolean z2) {
        super.t(z, z2);
        O();
        dzg.d(true);
        fvq fvqVar = this.aa;
        Object obj = fvqVar.a;
        if (obj != null) {
            ((Handler) obj).post(new fhg(fvqVar, 11));
        }
        if (!this.F) {
            if (this.G != null && this.v == null) {
                fjz fjzVar = new fjz(this.z, this.B);
                fjzVar.f = eN();
                dzg.d(!fjzVar.g);
                if (fjzVar.d == null) {
                    if (fjzVar.c == null) {
                        fjzVar.c = new fkb();
                    }
                    fjzVar.d = new fkc(fjzVar.c);
                }
                fkd fkdVar = new fkd(fjzVar);
                fjzVar.g = true;
                this.v = fkdVar.c;
            }
            this.F = true;
        }
        fka fkaVar = this.v;
        if (fkaVar != null) {
            fjv fjvVar = new fjv(this);
            andi andiVar = andi.a;
            fkaVar.p = fjvVar;
            fkaVar.q = andiVar;
            fke fkeVar = this.V;
            if (fkeVar != null) {
                fkaVar.j(fkeVar);
            }
            if (this.j != null && !this.I.equals(eug.a)) {
                this.v.f(this.j, this.I);
            }
            this.v.e(this.L);
            this.v.g(((ffh) this).m);
            List list = this.G;
            if (list != null) {
                this.v.i(list);
            }
            this.v.r.d.a = z2 ? 1 : 0;
            return;
        }
        this.B.b = eN();
        this.B.a = z2 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ffh, defpackage.ezg
    public final void u(long j, boolean z) {
        fka fkaVar = this.v;
        if (fkaVar != null) {
            fkaVar.a(true);
            this.v.h(am(), al(), aE(), this.f);
            this.Y = true;
        }
        super.u(j, z);
        if (this.v == null) {
            this.B.h();
        }
        if (z) {
            fka fkaVar2 = this.v;
            if (fkaVar2 != null) {
                fkaVar2.b(false);
            } else {
                this.B.c(false);
            }
        }
        this.O = 0;
    }

    @Override // defpackage.ezg
    protected final void v() {
        fka fkaVar = this.v;
        if (fkaVar != null) {
            fkd fkdVar = fkaVar.r;
            if (fkdVar.o != 2) {
                etu etuVar = fkdVar.l;
                if (etuVar != null) {
                    etuVar.d();
                }
                eyt eytVar = fkdVar.q;
                if (eytVar != null) {
                    eytVar.f();
                }
                fkdVar.m = null;
                fkdVar.o = 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ffh, defpackage.ezg
    public final void w() {
        try {
            super.w();
        } finally {
            this.F = false;
            this.W = -9223372036854775807L;
            aS();
        }
    }

    @Override // defpackage.ezg
    protected final void x() {
        this.N = 0;
        eN();
        this.M = SystemClock.elapsedRealtime();
        this.P = 0L;
        this.Q = 0;
        fka fkaVar = this.v;
        if (fkaVar != null) {
            fkaVar.r.d.f();
        } else {
            this.B.f();
        }
    }

    @Override // defpackage.ezg
    protected final void y() {
        aP();
        if (this.Q != 0) {
            fvq fvqVar = this.aa;
            Object obj = fvqVar.a;
            if (obj != null) {
                ((Handler) obj).post(new fhg(fvqVar, 9));
            }
            this.P = 0L;
            this.Q = 0;
        }
        fka fkaVar = this.v;
        if (fkaVar != null) {
            fkaVar.r.d.g();
        } else {
            this.B.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ffh, defpackage.ezg
    public final void z(eqn[] eqnVarArr, long j, long j2, fgv fgvVar) {
        super.z(eqnVarArr, j, j2, fgvVar);
        if (this.W == -9223372036854775807L) {
            this.W = j;
        }
        erz erzVar = this.h;
        if (erzVar.q()) {
            this.X = -9223372036854775807L;
        } else {
            this.X = erzVar.o(fgvVar.a, new erx()).d;
        }
    }
}
