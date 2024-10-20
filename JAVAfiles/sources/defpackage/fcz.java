package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Objects;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcz extends ffh implements fan {
    private long A;
    private boolean B;
    private int C;
    private final fcx D;
    public boolean j;
    public boolean k;
    public final fdx l;
    private final fez v;
    private int w;
    private boolean x;
    private eqn y;
    private eqn z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcz(Context context, ffa ffaVar, ffj ffjVar, Handler handler, faa faaVar, fcx fcxVar) {
        super(1, ffaVar, ffjVar, 44100.0f);
        fez fezVar;
        if (eul.a >= 35) {
            fezVar = new fez();
        } else {
            fezVar = null;
        }
        context.getApplicationContext();
        this.D = fcxVar;
        this.v = fezVar;
        this.C = -1000;
        this.l = new fdx(handler, faaVar);
        fcxVar.W = new qdq(this, null);
    }

    private final void aC() {
        long j;
        long s;
        long w;
        boolean T = T();
        fcx fcxVar = this.D;
        if (fcxVar.s() && !fcxVar.y) {
            long min = Math.min(fcxVar.h.a(T), fcxVar.m.a(fcxVar.c()));
            while (!fcxVar.i.isEmpty() && min >= ((mkk) fcxVar.i.getFirst()).b) {
                fcxVar.S = (mkk) fcxVar.i.remove();
            }
            long j2 = min - fcxVar.S.b;
            if (fcxVar.i.isEmpty()) {
                kkc kkcVar = fcxVar.V;
                if (((esw) kkcVar.c).h()) {
                    esw eswVar = (esw) kkcVar.c;
                    if (eswVar.j >= 1024) {
                        long j3 = eswVar.i;
                        dzg.g(eswVar.h);
                        long b = j3 - r2.b();
                        int i = eswVar.f.b;
                        int i2 = eswVar.e.b;
                        if (i == i2) {
                            w = eul.w(j2, b, eswVar.j);
                        } else {
                            w = eul.w(j2, b * i, i2 * eswVar.j);
                        }
                        j2 = w;
                    } else {
                        j2 = (long) (eswVar.c * j2);
                    }
                }
                s = fcxVar.S.a + j2;
            } else {
                mkk mkkVar = (mkk) fcxVar.i.getFirst();
                s = mkkVar.a - eul.s(mkkVar.b - min, ((ero) fcxVar.S.c).b);
            }
            long j4 = ((fdb) fcxVar.V.b).f;
            j = s + fcxVar.m.a(j4);
            long j5 = fcxVar.M;
            if (j4 > j5) {
                long a = fcxVar.m.a(j4 - j5);
                fcxVar.M = j4;
                fcxVar.N += a;
                if (fcxVar.O == null) {
                    fcxVar.O = new Handler(Looper.myLooper());
                }
                fcxVar.O.removeCallbacksAndMessages(null);
                fcxVar.O.postDelayed(new exl(fcxVar, 16), 100L);
            }
        } else {
            j = Long.MIN_VALUE;
        }
        if (j != Long.MIN_VALUE) {
            if (!this.j) {
                j = Math.max(this.A, j);
            }
            this.A = j;
            this.j = false;
        }
    }

    private static List aD(ffj ffjVar, eqn eqnVar, boolean z, fcx fcxVar) {
        ffe a;
        if (eqnVar.o == null) {
            int i = alog.d;
            return alsx.a;
        }
        if (fcxVar.u(eqnVar) && (a = ffp.a()) != null) {
            return alog.r(a);
        }
        return ffp.f(eqnVar, z, false);
    }

    private static final int aE(ffe ffeVar, eqn eqnVar) {
        if ("OMX.google.raw.decoder".equals(ffeVar.a)) {
            int i = eul.a;
        }
        return eqnVar.p;
    }

    @Override // defpackage.fbd, defpackage.fbf
    public final String R() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.ffh, defpackage.fbd
    public final boolean T() {
        if (this.r) {
            fcx fcxVar = this.D;
            if (fcxVar.s()) {
                if (fcxVar.D && !fcxVar.r()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ffh, defpackage.fbd
    public final boolean U() {
        if (!this.D.r() && !super.U()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ffh
    protected final int W(ffj ffjVar, eqn eqnVar) {
        int i;
        boolean z;
        int i2;
        fcg fcgVar;
        boolean booleanValue;
        boolean z2;
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
        boolean z3;
        int i3;
        int i4 = 0;
        if (erl.g(eqnVar.o)) {
            int i5 = eqnVar.L;
            boolean ay = ay(eqnVar);
            int i6 = 4;
            int i7 = 8;
            if (ay && (i5 == 0 || ffp.a() != null)) {
                fcx fcxVar = this.D;
                if (fcxVar.J) {
                    fcgVar = fcg.a;
                } else {
                    fcp fcpVar = fcxVar.P;
                    epz epzVar = fcxVar.r;
                    dzg.g(eqnVar);
                    dzg.g(epzVar);
                    if (eul.a >= 29 && eqnVar.E != -1) {
                        Object obj = fcpVar.a;
                        Object obj2 = fcpVar.b;
                        if (obj2 != null) {
                            booleanValue = ((Boolean) obj2).booleanValue();
                        } else {
                            if (obj != null) {
                                AudioManager audioManager = (AudioManager) ((Context) obj).getSystemService("audio");
                                if (audioManager != null) {
                                    String parameters = audioManager.getParameters("offloadVariableRateSupported");
                                    if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    fcpVar.b = Boolean.valueOf(z2);
                                } else {
                                    fcpVar.b = false;
                                }
                            } else {
                                fcpVar.b = false;
                            }
                            booleanValue = ((Boolean) fcpVar.b).booleanValue();
                        }
                        String str = eqnVar.o;
                        dzg.g(str);
                        int a = erl.a(str, eqnVar.k);
                        if (a != 0 && eul.a >= eul.g(a)) {
                            int h = eul.h(eqnVar.D);
                            if (h == 0) {
                                fcgVar = fcg.a;
                            } else {
                                try {
                                    AudioFormat B = eul.B(eqnVar.E, h, a);
                                    if (eul.a >= 31) {
                                        playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(B, (AudioAttributes) epzVar.a().a);
                                        if (playbackOffloadSupport == 0) {
                                            fcgVar = fcg.a;
                                        } else {
                                            hov hovVar = new hov();
                                            if (eul.a > 32 && playbackOffloadSupport == 2) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            hovVar.f();
                                            hovVar.c = z3;
                                            hovVar.a = booleanValue;
                                            fcgVar = hovVar.e();
                                        }
                                    } else {
                                        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(B, (AudioAttributes) epzVar.a().a);
                                        if (!isOffloadedPlaybackSupported) {
                                            fcgVar = fcg.a;
                                        } else {
                                            hov hovVar2 = new hov();
                                            hovVar2.f();
                                            hovVar2.a = booleanValue;
                                            fcgVar = hovVar2.e();
                                        }
                                    }
                                } catch (IllegalArgumentException unused) {
                                    fcgVar = fcg.a;
                                }
                            }
                        } else {
                            fcgVar = fcg.a;
                        }
                    } else {
                        fcgVar = fcg.a;
                    }
                }
                if (!fcgVar.b) {
                    i3 = 0;
                } else {
                    if (true != fcgVar.c) {
                        i3 = 512;
                    } else {
                        i3 = 1536;
                    }
                    if (fcgVar.d) {
                        i3 |= 2048;
                    }
                }
                if (!this.D.u(eqnVar)) {
                    i = i3;
                } else {
                    return dzn.e(4, 8, 32, i3);
                }
            } else {
                i = 0;
            }
            if ((!"audio/raw".equals(eqnVar.o) || this.D.u(eqnVar)) && this.D.u(eul.F(2, eqnVar.D, eqnVar.E))) {
                List aD = aD(ffjVar, eqnVar, false, this.D);
                if (!aD.isEmpty()) {
                    if (!ay) {
                        i4 = 2;
                    } else {
                        ffe ffeVar = (ffe) aD.get(0);
                        boolean d = ffeVar.d(eqnVar);
                        if (!d) {
                            for (int i8 = 1; i8 < ((alsx) aD).c; i8++) {
                                ffe ffeVar2 = (ffe) aD.get(i8);
                                if (ffeVar2.d(eqnVar)) {
                                    z = false;
                                    ffeVar = ffeVar2;
                                    d = true;
                                    break;
                                }
                            }
                        }
                        z = true;
                        if (true != d) {
                            i6 = 3;
                        }
                        if (d && ffeVar.f(eqnVar)) {
                            i7 = 16;
                        }
                        if (true != ffeVar.g) {
                            i2 = 0;
                        } else {
                            i2 = 64;
                        }
                        if (true == z) {
                            i4 = 128;
                        }
                        return dzn.f(i6, i7, 32, i2, i4, i);
                    }
                }
            }
            i4 = 1;
        }
        return dzn.d(i4);
    }

    @Override // defpackage.ffh
    protected final ezi X(ffe ffeVar, eqn eqnVar, eqn eqnVar2) {
        int i;
        int i2;
        ezi b = ffeVar.b(eqnVar, eqnVar2);
        int i3 = b.e;
        if (av(eqnVar2)) {
            i3 |= 32768;
        }
        if (aE(ffeVar, eqnVar2) > this.w) {
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
        return ffp.d(aD(ffjVar, eqnVar, z, this.D), eqnVar);
    }

    @Override // defpackage.ffh
    protected final void Z(ewl ewlVar) {
        eqn eqnVar;
        if (eul.a >= 29 && (eqnVar = ewlVar.b) != null && Objects.equals(eqnVar.o, "audio/opus") && ((ffh) this).q) {
            ByteBuffer byteBuffer = ewlVar.g;
            dzg.g(byteBuffer);
            dzg.g(ewlVar.b);
            if (byteBuffer.remaining() == 8) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong();
                AudioTrack audioTrack = this.D.o;
                if (audioTrack != null) {
                    fcx.t(audioTrack);
                }
            }
        }
    }

    @Override // defpackage.fan
    public final long a() {
        if (this.c == 2) {
            aC();
        }
        return this.A;
    }

    @Override // defpackage.ffh
    protected final void aa(Exception exc) {
        eub.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        fdx fdxVar = this.l;
        Object obj = fdxVar.a;
        if (obj != null) {
            ((Handler) obj).post(new exl(fdxVar, 11));
        }
    }

    @Override // defpackage.ffh
    protected final void ab(String str) {
        fdx fdxVar = this.l;
        Object obj = fdxVar.a;
        if (obj != null) {
            ((Handler) obj).post(new exl(fdxVar, 15));
        }
    }

    @Override // defpackage.ffh
    protected final void ac(eqn eqnVar, MediaFormat mediaFormat) {
        int i;
        eqn eqnVar2;
        eso esoVar;
        int i2;
        int i3;
        int i4;
        int intValue;
        int i5;
        boolean z;
        int i6;
        int i7;
        int d;
        int b;
        boolean z2;
        eqn eqnVar3 = eqnVar;
        eqn eqnVar4 = this.z;
        int[] iArr = null;
        int i8 = 2;
        if (eqnVar4 != null) {
            eqnVar2 = eqnVar4;
        } else {
            if (((ffh) this).n != null) {
                dzg.g(mediaFormat);
                if ("audio/raw".equals(eqnVar3.o)) {
                    i = eqnVar3.F;
                } else {
                    int i9 = eul.a;
                    if (mediaFormat.containsKey("pcm-encoding")) {
                        i = mediaFormat.getInteger("pcm-encoding");
                    } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                        i = eul.m(mediaFormat.getInteger("v-bits-per-sample"));
                    } else {
                        i = 2;
                    }
                }
                eqm eqmVar = new eqm();
                eqmVar.b("audio/raw");
                eqmVar.D = i;
                eqmVar.E = eqnVar3.G;
                eqmVar.F = eqnVar3.H;
                eqmVar.k = eqnVar3.l;
                Object obj = eqnVar3.m;
                eqmVar.a = eqnVar3.a;
                eqmVar.b = eqnVar3.b;
                eqmVar.c = alog.n(eqnVar3.c);
                eqmVar.d = eqnVar3.d;
                eqmVar.e = eqnVar3.e;
                eqmVar.f = eqnVar3.f;
                eqmVar.B = mediaFormat.getInteger("channel-count");
                eqmVar.C = mediaFormat.getInteger("sample-rate");
                eqnVar3 = new eqn(eqmVar);
                if (this.x) {
                    int i10 = eqnVar3.D;
                    if (i10 != 3) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    if (i10 == 8) {
                                        iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                                    }
                                } else {
                                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                                }
                            } else {
                                iArr = new int[]{0, 2, 1, 5, 3, 4};
                            }
                        } else {
                            iArr = new int[]{0, 2, 1, 3, 4};
                        }
                    } else {
                        iArr = new int[]{0, 2, 1};
                    }
                }
            }
            eqnVar2 = eqnVar3;
        }
        try {
            if (eul.a >= 29) {
                if (((ffh) this).q) {
                    O();
                }
                if (eul.a >= 29) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                dzg.d(z2);
            }
            fcx fcxVar = this.D;
            fcxVar.i();
            if ("audio/raw".equals(eqnVar2.o)) {
                d.s(eul.W(eqnVar2.F));
                int n = eul.n(eqnVar2.F, eqnVar2.D);
                alob alobVar = new alob();
                int i11 = eqnVar2.F;
                alobVar.j(fcxVar.f);
                alobVar.i((Object[]) fcxVar.V.a);
                eso esoVar2 = new eso(alobVar.g());
                if (esoVar2.equals(fcxVar.n)) {
                    esoVar2 = fcxVar.n;
                }
                fdd fddVar = fcxVar.e;
                int i12 = eqnVar2.G;
                int i13 = eqnVar2.H;
                fddVar.e = i12;
                fddVar.f = i13;
                fcxVar.d.e = iArr;
                try {
                    esp a = esoVar2.a(new esp(eqnVar2));
                    i5 = a.d;
                    int i14 = a.b;
                    int i15 = a.c;
                    int h = eul.h(i15);
                    i4 = eul.n(i5, i15);
                    esoVar = esoVar2;
                    i8 = 0;
                    i2 = n;
                    i3 = i14;
                    intValue = h;
                } catch (esq e) {
                    throw new fch(e, eqnVar2);
                }
            } else {
                int i16 = alog.d;
                eso esoVar3 = new eso(alsx.a);
                int i17 = eqnVar2.E;
                fcg fcgVar = fcg.a;
                Pair a2 = fcxVar.p.a(eqnVar2, fcxVar.r);
                if (a2 != null) {
                    int intValue2 = ((Integer) a2.first).intValue();
                    esoVar = esoVar3;
                    i2 = -1;
                    i3 = i17;
                    i4 = -1;
                    intValue = ((Integer) a2.second).intValue();
                    i5 = intValue2;
                } else {
                    throw new fch("Unable to configure passthrough for: ".concat(String.valueOf(String.valueOf(eqnVar2))), eqnVar2);
                }
            }
            if (i5 != 0) {
                if (intValue != 0) {
                    int i18 = eqnVar2.j;
                    if ("audio/vnd.dts.hd;profile=lbr".equals(eqnVar2.o) && i18 == -1) {
                        i18 = 768000;
                    }
                    int minBufferSize = AudioTrack.getMinBufferSize(i3, intValue, i5);
                    if (minBufferSize != -2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    dzg.d(z);
                    if (i4 != -1) {
                        i6 = i4;
                    } else {
                        i6 = 1;
                    }
                    int i19 = 250000;
                    if (i8 != 0) {
                        if (i8 != 1) {
                            if (i5 == 5) {
                                i19 = 500000;
                            } else if (i5 == 8) {
                                i19 = 1000000;
                                i5 = 8;
                            }
                            if (i18 != -1) {
                                b = albo.cR(i18, 8, RoundingMode.CEILING);
                            } else {
                                b = fcy.b(i5);
                            }
                            i7 = i4;
                            d = albo.co((i19 * b) / 1000000);
                        } else {
                            i7 = i4;
                            d = albo.co((fcy.b(i5) * 50000000) / 1000000);
                        }
                    } else {
                        i7 = i4;
                        d = eul.d(minBufferSize * 4, fcy.a(250000, i3, i6), fcy.a(750000, i3, i6));
                    }
                    int i20 = i5;
                    fcxVar.J = false;
                    fcs fcsVar = new fcs(eqnVar2, i2, i8, i7, i3, intValue, i20, (((Math.max(minBufferSize, d) + i6) - 1) / i6) * i6, esoVar);
                    if (fcxVar.s()) {
                        fcxVar.l = fcsVar;
                        return;
                    } else {
                        fcxVar.m = fcsVar;
                        return;
                    }
                }
                throw new fch("Invalid output channel config (mode=" + i8 + ") for: " + String.valueOf(eqnVar2), eqnVar2);
            }
            throw new fch("Invalid output encoding (mode=" + i8 + ") for: " + String.valueOf(eqnVar2), eqnVar2);
        } catch (fch e2) {
            throw g(e2, e2.a, 5001);
        }
    }

    @Override // defpackage.ffh
    protected final void ad() {
        this.D.g();
    }

    @Override // defpackage.ffh
    protected final void ae() {
        int i;
        try {
            fcx fcxVar = this.D;
            if (!fcxVar.D && fcxVar.s() && fcxVar.p()) {
                fcxVar.k();
                fcxVar.D = true;
            }
        } catch (fck e) {
            if (true != ((ffh) this).q) {
                i = 5002;
            } else {
                i = 5003;
            }
            throw h(e, e.c, e.b, i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0479, code lost:
    
        if (r1 != 0) goto L207;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x0294. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:109:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0350 A[Catch: fck -> 0x0563, fci -> 0x0567, TryCatch #0 {fci -> 0x0567, blocks: (B:47:0x01ef, B:49:0x01f8, B:51:0x020c, B:52:0x020f, B:57:0x0231, B:59:0x0241, B:61:0x0254, B:62:0x025e, B:64:0x0262, B:67:0x026d, B:75:0x0278, B:77:0x027e, B:79:0x0282, B:84:0x0294, B:86:0x0299, B:87:0x029c, B:88:0x02a7, B:89:0x02a8, B:90:0x0477, B:93:0x02c8, B:95:0x02d7, B:99:0x02e3, B:102:0x02ee, B:105:0x0306, B:97:0x02e5, B:110:0x031d, B:115:0x0350, B:116:0x0355, B:117:0x032d, B:120:0x0334, B:123:0x033a, B:128:0x0348, B:129:0x0356, B:131:0x0366, B:134:0x0385, B:135:0x0377, B:137:0x0391, B:139:0x039d, B:142:0x03a8, B:145:0x03b5, B:150:0x03c5, B:151:0x03fa, B:152:0x0414, B:153:0x03d7, B:154:0x03f8, B:155:0x03e8, B:156:0x03ff, B:157:0x0418, B:160:0x044e, B:162:0x0463, B:163:0x046a, B:165:0x0422, B:167:0x042e, B:169:0x0438, B:171:0x0441, B:173:0x044c, B:174:0x047b, B:176:0x047f, B:178:0x0485, B:180:0x048b, B:182:0x04a5, B:184:0x04b2, B:186:0x04b6, B:187:0x04be, B:188:0x04c1, B:190:0x04c5, B:192:0x04cb, B:196:0x04e2, B:197:0x04e9, B:199:0x04ef, B:200:0x0504, B:201:0x04fa, B:203:0x0508, B:205:0x0513, B:206:0x051c, B:210:0x0533, B:212:0x0542), top: B:46:0x01ef }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0356 A[Catch: fck -> 0x0563, fci -> 0x0567, TryCatch #0 {fci -> 0x0567, blocks: (B:47:0x01ef, B:49:0x01f8, B:51:0x020c, B:52:0x020f, B:57:0x0231, B:59:0x0241, B:61:0x0254, B:62:0x025e, B:64:0x0262, B:67:0x026d, B:75:0x0278, B:77:0x027e, B:79:0x0282, B:84:0x0294, B:86:0x0299, B:87:0x029c, B:88:0x02a7, B:89:0x02a8, B:90:0x0477, B:93:0x02c8, B:95:0x02d7, B:99:0x02e3, B:102:0x02ee, B:105:0x0306, B:97:0x02e5, B:110:0x031d, B:115:0x0350, B:116:0x0355, B:117:0x032d, B:120:0x0334, B:123:0x033a, B:128:0x0348, B:129:0x0356, B:131:0x0366, B:134:0x0385, B:135:0x0377, B:137:0x0391, B:139:0x039d, B:142:0x03a8, B:145:0x03b5, B:150:0x03c5, B:151:0x03fa, B:152:0x0414, B:153:0x03d7, B:154:0x03f8, B:155:0x03e8, B:156:0x03ff, B:157:0x0418, B:160:0x044e, B:162:0x0463, B:163:0x046a, B:165:0x0422, B:167:0x042e, B:169:0x0438, B:171:0x0441, B:173:0x044c, B:174:0x047b, B:176:0x047f, B:178:0x0485, B:180:0x048b, B:182:0x04a5, B:184:0x04b2, B:186:0x04b6, B:187:0x04be, B:188:0x04c1, B:190:0x04c5, B:192:0x04cb, B:196:0x04e2, B:197:0x04e9, B:199:0x04ef, B:200:0x0504, B:201:0x04fa, B:203:0x0508, B:205:0x0513, B:206:0x051c, B:210:0x0533, B:212:0x0542), top: B:46:0x01ef }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0513 A[Catch: fck -> 0x0563, fci -> 0x0567, TryCatch #0 {fci -> 0x0567, blocks: (B:47:0x01ef, B:49:0x01f8, B:51:0x020c, B:52:0x020f, B:57:0x0231, B:59:0x0241, B:61:0x0254, B:62:0x025e, B:64:0x0262, B:67:0x026d, B:75:0x0278, B:77:0x027e, B:79:0x0282, B:84:0x0294, B:86:0x0299, B:87:0x029c, B:88:0x02a7, B:89:0x02a8, B:90:0x0477, B:93:0x02c8, B:95:0x02d7, B:99:0x02e3, B:102:0x02ee, B:105:0x0306, B:97:0x02e5, B:110:0x031d, B:115:0x0350, B:116:0x0355, B:117:0x032d, B:120:0x0334, B:123:0x033a, B:128:0x0348, B:129:0x0356, B:131:0x0366, B:134:0x0385, B:135:0x0377, B:137:0x0391, B:139:0x039d, B:142:0x03a8, B:145:0x03b5, B:150:0x03c5, B:151:0x03fa, B:152:0x0414, B:153:0x03d7, B:154:0x03f8, B:155:0x03e8, B:156:0x03ff, B:157:0x0418, B:160:0x044e, B:162:0x0463, B:163:0x046a, B:165:0x0422, B:167:0x042e, B:169:0x0438, B:171:0x0441, B:173:0x044c, B:174:0x047b, B:176:0x047f, B:178:0x0485, B:180:0x048b, B:182:0x04a5, B:184:0x04b2, B:186:0x04b6, B:187:0x04be, B:188:0x04c1, B:190:0x04c5, B:192:0x04cb, B:196:0x04e2, B:197:0x04e9, B:199:0x04ef, B:200:0x0504, B:201:0x04fa, B:203:0x0508, B:205:0x0513, B:206:0x051c, B:210:0x0533, B:212:0x0542), top: B:46:0x01ef }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x051c A[Catch: fck -> 0x0563, fci -> 0x0567, TryCatch #0 {fci -> 0x0567, blocks: (B:47:0x01ef, B:49:0x01f8, B:51:0x020c, B:52:0x020f, B:57:0x0231, B:59:0x0241, B:61:0x0254, B:62:0x025e, B:64:0x0262, B:67:0x026d, B:75:0x0278, B:77:0x027e, B:79:0x0282, B:84:0x0294, B:86:0x0299, B:87:0x029c, B:88:0x02a7, B:89:0x02a8, B:90:0x0477, B:93:0x02c8, B:95:0x02d7, B:99:0x02e3, B:102:0x02ee, B:105:0x0306, B:97:0x02e5, B:110:0x031d, B:115:0x0350, B:116:0x0355, B:117:0x032d, B:120:0x0334, B:123:0x033a, B:128:0x0348, B:129:0x0356, B:131:0x0366, B:134:0x0385, B:135:0x0377, B:137:0x0391, B:139:0x039d, B:142:0x03a8, B:145:0x03b5, B:150:0x03c5, B:151:0x03fa, B:152:0x0414, B:153:0x03d7, B:154:0x03f8, B:155:0x03e8, B:156:0x03ff, B:157:0x0418, B:160:0x044e, B:162:0x0463, B:163:0x046a, B:165:0x0422, B:167:0x042e, B:169:0x0438, B:171:0x0441, B:173:0x044c, B:174:0x047b, B:176:0x047f, B:178:0x0485, B:180:0x048b, B:182:0x04a5, B:184:0x04b2, B:186:0x04b6, B:187:0x04be, B:188:0x04c1, B:190:0x04c5, B:192:0x04cb, B:196:0x04e2, B:197:0x04e9, B:199:0x04ef, B:200:0x0504, B:201:0x04fa, B:203:0x0508, B:205:0x0513, B:206:0x051c, B:210:0x0533, B:212:0x0542), top: B:46:0x01ef }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[Catch: fck -> 0x058d, fci -> 0x05a1, TryCatch #3 {fci -> 0x05a1, blocks: (B:14:0x0034, B:19:0x0040, B:21:0x0048, B:25:0x0051, B:27:0x005b, B:29:0x0061, B:31:0x0067, B:33:0x006d, B:35:0x0073, B:37:0x0083, B:39:0x0089, B:40:0x009a, B:41:0x008e, B:43:0x0097, B:44:0x009d, B:258:0x0580, B:260:0x0584, B:261:0x058c), top: B:13:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f8 A[Catch: fck -> 0x0563, fci -> 0x0567, TryCatch #0 {fci -> 0x0567, blocks: (B:47:0x01ef, B:49:0x01f8, B:51:0x020c, B:52:0x020f, B:57:0x0231, B:59:0x0241, B:61:0x0254, B:62:0x025e, B:64:0x0262, B:67:0x026d, B:75:0x0278, B:77:0x027e, B:79:0x0282, B:84:0x0294, B:86:0x0299, B:87:0x029c, B:88:0x02a7, B:89:0x02a8, B:90:0x0477, B:93:0x02c8, B:95:0x02d7, B:99:0x02e3, B:102:0x02ee, B:105:0x0306, B:97:0x02e5, B:110:0x031d, B:115:0x0350, B:116:0x0355, B:117:0x032d, B:120:0x0334, B:123:0x033a, B:128:0x0348, B:129:0x0356, B:131:0x0366, B:134:0x0385, B:135:0x0377, B:137:0x0391, B:139:0x039d, B:142:0x03a8, B:145:0x03b5, B:150:0x03c5, B:151:0x03fa, B:152:0x0414, B:153:0x03d7, B:154:0x03f8, B:155:0x03e8, B:156:0x03ff, B:157:0x0418, B:160:0x044e, B:162:0x0463, B:163:0x046a, B:165:0x0422, B:167:0x042e, B:169:0x0438, B:171:0x0441, B:173:0x044c, B:174:0x047b, B:176:0x047f, B:178:0x0485, B:180:0x048b, B:182:0x04a5, B:184:0x04b2, B:186:0x04b6, B:187:0x04be, B:188:0x04c1, B:190:0x04c5, B:192:0x04cb, B:196:0x04e2, B:197:0x04e9, B:199:0x04ef, B:200:0x0504, B:201:0x04fa, B:203:0x0508, B:205:0x0513, B:206:0x051c, B:210:0x0533, B:212:0x0542), top: B:46:0x01ef }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0241 A[Catch: fck -> 0x0563, fci -> 0x0567, TryCatch #0 {fci -> 0x0567, blocks: (B:47:0x01ef, B:49:0x01f8, B:51:0x020c, B:52:0x020f, B:57:0x0231, B:59:0x0241, B:61:0x0254, B:62:0x025e, B:64:0x0262, B:67:0x026d, B:75:0x0278, B:77:0x027e, B:79:0x0282, B:84:0x0294, B:86:0x0299, B:87:0x029c, B:88:0x02a7, B:89:0x02a8, B:90:0x0477, B:93:0x02c8, B:95:0x02d7, B:99:0x02e3, B:102:0x02ee, B:105:0x0306, B:97:0x02e5, B:110:0x031d, B:115:0x0350, B:116:0x0355, B:117:0x032d, B:120:0x0334, B:123:0x033a, B:128:0x0348, B:129:0x0356, B:131:0x0366, B:134:0x0385, B:135:0x0377, B:137:0x0391, B:139:0x039d, B:142:0x03a8, B:145:0x03b5, B:150:0x03c5, B:151:0x03fa, B:152:0x0414, B:153:0x03d7, B:154:0x03f8, B:155:0x03e8, B:156:0x03ff, B:157:0x0418, B:160:0x044e, B:162:0x0463, B:163:0x046a, B:165:0x0422, B:167:0x042e, B:169:0x0438, B:171:0x0441, B:173:0x044c, B:174:0x047b, B:176:0x047f, B:178:0x0485, B:180:0x048b, B:182:0x04a5, B:184:0x04b2, B:186:0x04b6, B:187:0x04be, B:188:0x04c1, B:190:0x04c5, B:192:0x04cb, B:196:0x04e2, B:197:0x04e9, B:199:0x04ef, B:200:0x0504, B:201:0x04fa, B:203:0x0508, B:205:0x0513, B:206:0x051c, B:210:0x0533, B:212:0x0542), top: B:46:0x01ef }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0262 A[Catch: fck -> 0x0563, fci -> 0x0567, TryCatch #0 {fci -> 0x0567, blocks: (B:47:0x01ef, B:49:0x01f8, B:51:0x020c, B:52:0x020f, B:57:0x0231, B:59:0x0241, B:61:0x0254, B:62:0x025e, B:64:0x0262, B:67:0x026d, B:75:0x0278, B:77:0x027e, B:79:0x0282, B:84:0x0294, B:86:0x0299, B:87:0x029c, B:88:0x02a7, B:89:0x02a8, B:90:0x0477, B:93:0x02c8, B:95:0x02d7, B:99:0x02e3, B:102:0x02ee, B:105:0x0306, B:97:0x02e5, B:110:0x031d, B:115:0x0350, B:116:0x0355, B:117:0x032d, B:120:0x0334, B:123:0x033a, B:128:0x0348, B:129:0x0356, B:131:0x0366, B:134:0x0385, B:135:0x0377, B:137:0x0391, B:139:0x039d, B:142:0x03a8, B:145:0x03b5, B:150:0x03c5, B:151:0x03fa, B:152:0x0414, B:153:0x03d7, B:154:0x03f8, B:155:0x03e8, B:156:0x03ff, B:157:0x0418, B:160:0x044e, B:162:0x0463, B:163:0x046a, B:165:0x0422, B:167:0x042e, B:169:0x0438, B:171:0x0441, B:173:0x044c, B:174:0x047b, B:176:0x047f, B:178:0x0485, B:180:0x048b, B:182:0x04a5, B:184:0x04b2, B:186:0x04b6, B:187:0x04be, B:188:0x04c1, B:190:0x04c5, B:192:0x04cb, B:196:0x04e2, B:197:0x04e9, B:199:0x04ef, B:200:0x0504, B:201:0x04fa, B:203:0x0508, B:205:0x0513, B:206:0x051c, B:210:0x0533, B:212:0x0542), top: B:46:0x01ef }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x054f  */
    @Override // defpackage.ffh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean af(long r27, long r29, defpackage.ffb r31, java.nio.ByteBuffer r32, int r33, int r34, int r35, long r36, boolean r38, boolean r39, defpackage.eqn r40) {
        /*
            Method dump skipped, instructions count: 1496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcz.af(long, long, ffb, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, eqn):boolean");
    }

    @Override // defpackage.ffh
    protected final boolean ag(eqn eqnVar) {
        O();
        return this.D.u(eqnVar);
    }

    @Override // defpackage.ffh
    protected final float ah(float f, eqn[] eqnVarArr) {
        int i = -1;
        for (eqn eqnVar : eqnVarArr) {
            int i2 = eqnVar.E;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // defpackage.ffh
    protected final void ai(String str, long j, long j2) {
        fdx fdxVar = this.l;
        Object obj = fdxVar.a;
        if (obj != null) {
            ((Handler) obj).post(new exl(fdxVar, 14));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ffh
    public final ezi aj(fqu fquVar) {
        eqn eqnVar = fquVar.a;
        dzg.g(eqnVar);
        this.y = eqnVar;
        fdx fdxVar = this.l;
        Object obj = fdxVar.a;
        ezi aj = super.aj(fquVar);
        if (obj != null) {
            ((Handler) obj).post(new exl(fdxVar, 13));
        }
        return aj;
    }

    @Override // defpackage.ffh
    protected final gbl ak(ffe ffeVar, eqn eqnVar, MediaCrypto mediaCrypto, float f) {
        boolean z;
        eqn[] M = M();
        int length = M.length;
        int aE = aE(ffeVar, eqnVar);
        if (length != 1) {
            for (eqn eqnVar2 : M) {
                if (ffeVar.b(eqnVar, eqnVar2).d != 0) {
                    aE = Math.max(aE, aE(ffeVar, eqnVar2));
                }
            }
        }
        this.w = aE;
        int i = eul.a;
        String str = ffeVar.a;
        if (!str.equals("OMX.google.opus.decoder") && !str.equals("c2.android.opus.decoder") && !str.equals("OMX.google.vorbis.decoder") && !str.equals("c2.android.vorbis.decoder")) {
            z = false;
        } else {
            z = true;
        }
        this.x = z;
        String str2 = ffeVar.c;
        int i2 = this.w;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        mediaFormat.setInteger("channel-count", eqnVar.D);
        mediaFormat.setInteger("sample-rate", eqnVar.E);
        dzh.k(mediaFormat, eqnVar.r);
        dzh.i(mediaFormat, "max-input-size", i2);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (eul.a <= 28 && "audio/ac4".equals(eqnVar.o)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (this.D.a(eul.F(4, eqnVar.D, eqnVar.E)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (eul.a >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (eul.a >= 35) {
            mediaFormat.setInteger(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.IMPORTANCE, Math.max(0, -this.C));
        }
        eqn eqnVar3 = null;
        if ("audio/raw".equals(ffeVar.b) && !"audio/raw".equals(eqnVar.o)) {
            eqnVar3 = eqnVar;
        }
        this.z = eqnVar3;
        return new gbl(ffeVar, mediaFormat, eqnVar, (Surface) null, mediaCrypto, this.v);
    }

    @Override // defpackage.fan
    public final ero b() {
        return this.D.s;
    }

    @Override // defpackage.fan
    public final void c(ero eroVar) {
        ero eroVar2 = new ero(eul.a(eroVar.b, 0.1f, 8.0f), eul.a(eroVar.c, 0.1f, 8.0f));
        fcx fcxVar = this.D;
        fcxVar.s = eroVar2;
        fcxVar.n(eroVar);
    }

    @Override // defpackage.fan
    public final boolean f() {
        boolean z = this.k;
        this.k = false;
        return z;
    }

    @Override // defpackage.ffh, defpackage.ezg, defpackage.fba
    public final void p(int i, Object obj) {
        fez fezVar;
        LoudnessCodecController create;
        boolean addMediaCodec;
        if (i != 2) {
            if (i != 3) {
                if (i != 6) {
                    efu efuVar = null;
                    if (i != 12) {
                        if (i != 16) {
                            if (i != 9) {
                                if (i != 10) {
                                    super.p(i, obj);
                                    return;
                                }
                                dzg.g(obj);
                                int intValue = ((Integer) obj).intValue();
                                fcx fcxVar = this.D;
                                if (fcxVar.G != intValue) {
                                    fcxVar.G = intValue;
                                    fcxVar.f();
                                }
                                if (eul.a >= 35 && (fezVar = this.v) != null) {
                                    Object obj2 = fezVar.b;
                                    if (obj2 != null) {
                                        dbc$$ExternalSyntheticApiModelOutline0.m(obj2).close();
                                        fezVar.b = null;
                                    }
                                    create = LoudnessCodecController.create(intValue, andi.a, new fey());
                                    fezVar.b = create;
                                    Iterator it = ((HashSet) fezVar.a).iterator();
                                    while (it.hasNext()) {
                                        addMediaCodec = create.addMediaCodec((MediaCodec) it.next());
                                        if (!addMediaCodec) {
                                            it.remove();
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            fcx fcxVar2 = this.D;
                            dzg.g(obj);
                            fcxVar2.t = ((Boolean) obj).booleanValue();
                            fcxVar2.n(fcxVar2.s);
                            return;
                        }
                        dzg.g(obj);
                        this.C = ((Integer) obj).intValue();
                        ffb ffbVar = ((ffh) this).n;
                        if (ffbVar != null && eul.a >= 35) {
                            Bundle bundle = new Bundle();
                            bundle.putInt(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.IMPORTANCE, Math.max(0, -this.C));
                            ffbVar.l(bundle);
                            return;
                        }
                        return;
                    }
                    int i2 = eul.a;
                    fcx fcxVar3 = this.D;
                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                    if (audioDeviceInfo != null) {
                        efuVar = new efu(audioDeviceInfo);
                    }
                    fcxVar3.U = efuVar;
                    fcf fcfVar = fcxVar3.q;
                    if (fcfVar != null) {
                        fcfVar.b(audioDeviceInfo);
                    }
                    AudioTrack audioTrack = fcxVar3.o;
                    if (audioTrack != null) {
                        edx.h(audioTrack, fcxVar3.U);
                        return;
                    }
                    return;
                }
                eqa eqaVar = (eqa) obj;
                fcx fcxVar4 = this.D;
                dzg.g(eqaVar);
                if (!fcxVar4.H.equals(eqaVar)) {
                    if (fcxVar4.o != null) {
                        int i3 = fcxVar4.H.a;
                    }
                    fcxVar4.H = eqaVar;
                    return;
                }
                return;
            }
            epz epzVar = (epz) obj;
            fcx fcxVar5 = this.D;
            dzg.g(epzVar);
            if (!fcxVar5.r.equals(epzVar)) {
                fcxVar5.r = epzVar;
                fcf fcfVar2 = fcxVar5.q;
                if (fcfVar2 != null) {
                    fcfVar2.g = epzVar;
                    fcfVar2.a(fcb.d(fcfVar2.a, epzVar, fcfVar2.i));
                }
                fcxVar5.f();
                return;
            }
            return;
        }
        fcx fcxVar6 = this.D;
        dzg.g(obj);
        float floatValue = ((Float) obj).floatValue();
        if (fcxVar6.A != floatValue) {
            fcxVar6.A = floatValue;
            fcxVar6.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ffh, defpackage.ezg
    public final void s() {
        this.B = true;
        this.y = null;
        try {
            this.D.f();
            super.s();
        } catch (Throwable th) {
            super.s();
            throw th;
        } finally {
            this.l.a(this.t);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ffh, defpackage.ezg
    public final void t(boolean z, boolean z2) {
        super.t(z, z2);
        fdx fdxVar = this.l;
        Object obj = fdxVar.a;
        if (obj != null) {
            ((Handler) obj).post(new exl(fdxVar, 6));
        }
        O();
        this.D.k = k();
        this.D.h.u = eN();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ffh, defpackage.ezg
    public final void u(long j, boolean z) {
        super.u(j, z);
        this.D.f();
        this.A = j;
        this.k = false;
        this.j = true;
    }

    @Override // defpackage.ezg
    protected final void v() {
        fez fezVar;
        fcf fcfVar = this.D.q;
        if (fcfVar != null && fcfVar.h) {
            fcfVar.f = null;
            int i = eul.a;
            fcc fccVar = fcfVar.c;
            if (fccVar != null) {
                AudioManager audioManager = (AudioManager) fcfVar.a.getSystemService("audio");
                dzg.g(audioManager);
                audioManager.unregisterAudioDeviceCallback(fccVar);
            }
            fcfVar.a.unregisterReceiver(fcfVar.d);
            fcd fcdVar = fcfVar.e;
            if (fcdVar != null) {
                fcdVar.a.unregisterContentObserver(fcdVar);
            }
            fcfVar.h = false;
        }
        if (eul.a >= 35 && (fezVar = this.v) != null) {
            ((HashSet) fezVar.a).clear();
            Object obj = fezVar.b;
            if (obj != null) {
                dbc$$ExternalSyntheticApiModelOutline0.m(obj).close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ffh, defpackage.ezg
    public final void w() {
        this.k = false;
        try {
            super.w();
            if (this.B) {
                this.B = false;
                this.D.m();
            }
        } catch (Throwable th) {
            if (this.B) {
                this.B = false;
                this.D.m();
            }
            throw th;
        }
    }

    @Override // defpackage.ezg
    protected final void x() {
        this.D.j();
    }

    @Override // defpackage.ezg
    protected final void y() {
        aC();
        fcx fcxVar = this.D;
        fcxVar.F = false;
        if (fcxVar.s()) {
            fcn fcnVar = fcxVar.h;
            fcnVar.c();
            if (fcnVar.o == -9223372036854775807L) {
                fcm fcmVar = fcnVar.c;
                dzg.g(fcmVar);
                fcmVar.d();
            } else {
                fcnVar.q = fcnVar.b();
                if (!fcx.t(fcxVar.o)) {
                    return;
                }
            }
            fcxVar.o.pause();
        }
    }

    @Override // defpackage.ezg, defpackage.fbd
    public final fan i() {
        return this;
    }
}
