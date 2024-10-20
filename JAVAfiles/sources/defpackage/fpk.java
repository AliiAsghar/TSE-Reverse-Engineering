package defpackage;

import android.util.SparseArray;
import com.android.vcard.VCardConfig;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpk implements flu {
    public static final Map c;
    private final fpl B;
    private final SparseArray C;
    private final boolean D;
    private final frj E;
    private final euf F;
    private final euf G;
    private final euf H;
    private final euf I;
    private final euf J;
    private final euf K;
    private final euf L;
    private final euf M;
    private final euf N;
    private final euf O;
    private ByteBuffer P;
    private long Q;
    private boolean R;
    private int S;
    private long T;
    private int U;
    private int V;
    private int[] W;
    private int X;
    private int Y;
    private int Z;
    private int aa;
    private int ab;
    private int ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private int ag;
    private byte ah;
    private boolean ai;
    private final fpi aj;
    public final boolean d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public fpj j;
    public boolean k;
    public int l;
    public long m;
    public boolean n;
    public long o;
    public long p;
    public boolean q;
    public long r;
    public int s;
    public boolean t;
    public long u;
    public flw v;
    public atkv w;
    public atkv x;
    private static final byte[] y = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] a = eul.ac("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] z = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] A = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    public static final UUID b = new UUID(72057594037932032L, -9223371306706625679L);

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        c = DesugarCollections.unmodifiableMap(hashMap);
    }

    @Deprecated
    public fpk() {
        this(new fpi(), 2, frj.a);
    }

    private final int m() {
        int i = this.ab;
        r();
        return i;
    }

    private final int n(flv flvVar, fpj fpjVar, int i, boolean z2) {
        int i2;
        if ("S_TEXT/UTF8".equals(fpjVar.b)) {
            s(flvVar, y, i);
            return m();
        }
        if ("S_TEXT/ASS".equals(fpjVar.b)) {
            s(flvVar, z, i);
            return m();
        }
        if ("S_TEXT/WEBVTT".equals(fpjVar.b)) {
            s(flvVar, A, i);
            return m();
        }
        fmq fmqVar = fpjVar.Y;
        boolean z3 = true;
        if (!this.ad) {
            if (fpjVar.h) {
                this.Z &= -1073741825;
                int i3 = 128;
                if (!this.ae) {
                    flvVar.k(this.H.a, 0, 1);
                    this.aa++;
                    byte b2 = this.H.a[0];
                    if ((b2 & 128) != 128) {
                        this.ah = b2;
                        this.ae = true;
                    } else {
                        throw new erm("Extension bit is set in signal byte", null, true, 1);
                    }
                }
                byte b3 = this.ah;
                if ((b3 & 1) == 1) {
                    int i4 = b3 & 2;
                    this.Z |= 1073741824;
                    if (!this.ai) {
                        flvVar.k(this.M.a, 0, 8);
                        this.aa += 8;
                        this.ai = true;
                        euf eufVar = this.H;
                        if (i4 != 2) {
                            i3 = 0;
                        }
                        eufVar.a[0] = (byte) (i3 | 8);
                        eufVar.J(0);
                        fmqVar.m(this.H, 1, 1);
                        this.ab++;
                        this.M.J(0);
                        fmqVar.m(this.M, 8, 1);
                        this.ab += 8;
                    }
                    if (i4 == 2) {
                        if (!this.af) {
                            flvVar.k(this.H.a, 0, 1);
                            this.aa++;
                            this.H.J(0);
                            this.ag = this.H.j();
                            this.af = true;
                        }
                        int i5 = this.ag * 4;
                        this.H.F(i5);
                        flvVar.k(this.H.a, 0, i5);
                        this.aa += i5;
                        int i6 = (this.ag >> 1) + 1;
                        int i7 = (i6 * 6) + 2;
                        ByteBuffer byteBuffer = this.P;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.P = ByteBuffer.allocate(i7);
                        }
                        this.P.position(0);
                        this.P.putShort((short) i6);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.ag;
                            if (i8 >= i2) {
                                break;
                            }
                            int m = this.H.m();
                            int i10 = m - i9;
                            if (i8 % 2 == 0) {
                                this.P.putShort((short) i10);
                            } else {
                                this.P.putInt(i10);
                            }
                            i8++;
                            i9 = m;
                        }
                        int i11 = (i - this.aa) - i9;
                        if ((i2 & 1) == 1) {
                            this.P.putInt(i11);
                        } else {
                            this.P.putShort((short) i11);
                            this.P.putInt(0);
                        }
                        this.N.H(this.P.array(), i7);
                        fmqVar.m(this.N, i7, 1);
                        this.ab += i7;
                    }
                }
            } else {
                byte[] bArr = fpjVar.i;
                if (bArr != null) {
                    this.K.H(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(fpjVar.b) ? fpjVar.f > 0 : z2) {
                this.Z |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                this.O.F(0);
                int i12 = (this.K.c + i) - this.aa;
                this.H.F(4);
                euf eufVar2 = this.H;
                byte[] bArr2 = eufVar2.a;
                bArr2[0] = (byte) ((i12 >> 24) & 255);
                bArr2[1] = (byte) ((i12 >> 16) & 255);
                bArr2[2] = (byte) ((i12 >> 8) & 255);
                bArr2[3] = (byte) (i12 & 255);
                fmqVar.m(eufVar2, 4, 2);
                this.ab += 4;
            }
            this.ad = true;
        }
        int i13 = i + this.K.c;
        if (!"V_MPEG4/ISO/AVC".equals(fpjVar.b) && !"V_MPEGH/ISO/HEVC".equals(fpjVar.b)) {
            if (fpjVar.U != null) {
                if (this.K.c != 0) {
                    z3 = false;
                }
                dzg.d(z3);
                fpjVar.U.d(flvVar);
            }
            while (true) {
                int i14 = this.aa;
                if (i14 >= i13) {
                    break;
                }
                int o = o(flvVar, fmqVar, i13 - i14);
                this.aa += o;
                this.ab += o;
            }
        } else {
            byte[] bArr3 = this.G.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i15 = fpjVar.Z;
            int i16 = 4 - i15;
            while (this.aa < i13) {
                int i17 = this.ac;
                if (i17 == 0) {
                    int min = Math.min(i15, this.K.b());
                    flvVar.k(bArr3, i16 + min, i15 - min);
                    if (min > 0) {
                        this.K.E(bArr3, i16, min);
                    }
                    this.aa += i15;
                    this.G.J(0);
                    this.ac = this.G.m();
                    this.F.J(0);
                    fmqVar.l(this.F, 4);
                    this.ab += 4;
                } else {
                    int o2 = o(flvVar, fmqVar, i17);
                    this.aa += o2;
                    this.ab += o2;
                    this.ac -= o2;
                }
            }
        }
        if ("A_VORBIS".equals(fpjVar.b)) {
            this.I.J(0);
            fmqVar.l(this.I, 4);
            this.ab += 4;
        }
        return m();
    }

    private final int o(flv flvVar, fmq fmqVar, int i) {
        int b2 = this.K.b();
        if (b2 > 0) {
            int min = Math.min(i, b2);
            fmqVar.l(this.K, min);
            return min;
        }
        return fmqVar.d(flvVar, i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4 A[EDGE_INSN: B:50:0x00d4->B:49:0x00d4 BREAK  A[LOOP:0: B:42:0x00c1->B:46:0x00d1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void p(defpackage.fpj r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpk.p(fpj, long, int, int, int):void");
    }

    private final void q(flv flvVar, int i) {
        euf eufVar = this.H;
        if (eufVar.c >= i) {
            return;
        }
        if (eufVar.c() < i) {
            euf eufVar2 = this.H;
            int c2 = eufVar2.c();
            eufVar2.D(Math.max(c2 + c2, i));
        }
        euf eufVar3 = this.H;
        byte[] bArr = eufVar3.a;
        int i2 = eufVar3.c;
        flvVar.k(bArr, i2, i - i2);
        this.H.I(i);
    }

    private final void r() {
        this.aa = 0;
        this.ab = 0;
        this.ac = 0;
        this.ad = false;
        this.ae = false;
        this.af = false;
        this.ag = 0;
        this.ah = (byte) 0;
        this.ai = false;
        this.K.F(0);
    }

    private final void s(flv flvVar, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length + i;
        if (this.L.c() < i2) {
            this.L.G(Arrays.copyOf(bArr, i2 + i));
        } else {
            System.arraycopy(bArr, 0, this.L.a, 0, length);
        }
        flvVar.k(this.L.a, length, i);
        this.L.J(0);
        this.L.I(i2);
    }

    private static byte[] t(long j, String str, long j2) {
        boolean z2;
        if (j != -9223372036854775807L) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.s(z2);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer valueOf = Integer.valueOf(i);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer valueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        return eul.ac(String.format(locale, str, valueOf, valueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    private static int[] u(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        if (length >= i) {
            return iArr;
        }
        return new int[Math.max(length + length, i)];
    }

    public final long a(long j) {
        long j2 = this.g;
        if (j2 != -9223372036854775807L) {
            return eul.w(j, j2, 1000L);
        }
        throw new erm("Can't scale timecode prior to timecodeScale being set.", null, true, 1);
    }

    public final fpj b(int i) {
        j(i);
        return this.j;
    }

    public final void c(int i) {
        if (this.w != null && this.x != null) {
        } else {
            throw new erm(a.cb(i, "Element ", " must be in a Cues"), null, true, 1);
        }
    }

    @Override // defpackage.flu
    public final /* synthetic */ List d() {
        int i = alog.d;
        return alsx.a;
    }

    @Override // defpackage.flu
    public final void e(flw flwVar) {
        this.v = flwVar;
        if (this.D) {
            flwVar = new frm(flwVar, this.E);
        }
        this.v = flwVar;
    }

    @Override // defpackage.flu
    public final void f(long j, long j2) {
        this.p = -9223372036854775807L;
        this.S = 0;
        fpi fpiVar = this.aj;
        fpiVar.d = 0;
        fpiVar.b.clear();
        fpiVar.c.d();
        this.B.d();
        r();
        for (int i = 0; i < this.C.size(); i++) {
            fmr fmrVar = ((fpj) this.C.valueAt(i)).U;
            if (fmrVar != null) {
                fmrVar.b();
            }
        }
    }

    @Override // defpackage.flu
    public final boolean g(flv flvVar) {
        aspp asppVar = new aspp((char[]) null);
        long j = ((fln) flvVar).b;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        flvVar.j(((euf) asppVar.b).a, 0, 4);
        long r = ((euf) asppVar.b).r();
        asppVar.a = 4;
        while (true) {
            if (r != 440786851) {
                int i = (int) j2;
                int i2 = asppVar.a + 1;
                asppVar.a = i2;
                if (i2 == i) {
                    break;
                }
                flvVar.j(((euf) asppVar.b).a, 0, 1);
                r = ((r << 8) & (-256)) | (((euf) asppVar.b).a[0] & 255);
            } else {
                long q = asppVar.q(flvVar);
                long j3 = asppVar.a;
                if (q != Long.MIN_VALUE) {
                    long j4 = j3 + q;
                    if (j == -1 || j4 < j) {
                        while (true) {
                            long j5 = asppVar.a;
                            if (j5 < j4) {
                                if (asppVar.q(flvVar) == Long.MIN_VALUE) {
                                    break;
                                }
                                long q2 = asppVar.q(flvVar);
                                if (q2 < 0) {
                                    break;
                                }
                                if (q2 != 0) {
                                    int i3 = (int) q2;
                                    flvVar.g(i3);
                                    asppVar.a += i3;
                                }
                            } else if (j5 == j4) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0c4c, code lost:
    
        r3 = ((defpackage.fln) r35).c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0c53, code lost:
    
        if (r2.n == false) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0c65, code lost:
    
        if (r2.k == false) goto L639;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0c67, code lost:
    
        r3 = r2.Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0c6d, code lost:
    
        if (r3 == (-1)) goto L640;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0c6f, code lost:
    
        r36.a = r3;
        r2.Q = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0c75, code lost:
    
        r0 = r2;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0c55, code lost:
    
        r2.Q = r3;
        r36.a = r2.o;
        r2.n = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0c5f, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x0a77, code lost:
    
        if (r0 == 1) goto L532;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:115:0x034b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x04dd. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:552:0x0a8d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:570:0x0add. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0707  */
    /* JADX WARN: Type inference failed for: r2v10, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v73 */
    @Override // defpackage.flu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(defpackage.flv r35, defpackage.vtk r36) {
        /*
            Method dump skipped, instructions count: 4028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpk.i(flv, vtk):int");
    }

    public final void j(int i) {
        if (this.j != null) {
        } else {
            throw new erm(a.cb(i, "Element ", " must be in a TrackEntry"), null, true, 1);
        }
    }

    public final void k() {
        dzg.h(this.v);
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x024b, code lost:
    
        throw new defpackage.erm("EBML lacing sample size out of range.", null, true, 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void l(int r22, int r23, defpackage.flv r24) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpk.l(int, int, flv):void");
    }

    public fpk(fpi fpiVar, int i, frj frjVar) {
        this.f = -1L;
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.o = -1L;
        this.Q = -1L;
        this.p = -9223372036854775807L;
        this.aj = fpiVar;
        fpiVar.g = new qdq(this, null);
        this.E = frjVar;
        this.d = 1 == ((i & 1) ^ 1);
        this.D = (i & 2) == 0;
        this.B = new fpl();
        this.C = new SparseArray();
        this.H = new euf(4);
        this.I = new euf(ByteBuffer.allocate(4).putInt(-1).array());
        this.J = new euf(4);
        this.F = new euf(euw.a);
        this.G = new euf(4);
        this.K = new euf();
        this.L = new euf();
        this.M = new euf(8);
        this.N = new euf();
        this.O = new euf();
        this.W = new int[1];
    }

    @Override // defpackage.flu
    public final /* synthetic */ void h() {
    }
}
