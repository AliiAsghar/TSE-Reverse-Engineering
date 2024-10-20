package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Point;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Patterns;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ajw;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agkx {
    public static volatile Context a;

    public static final acf A(apdt apdtVar) {
        int i = apdtVar.b;
        int i2 = apdtVar.c;
        int T = a.T(apdtVar.d);
        if (T == 0) {
            T = 1;
        }
        return new acf(i, i2, y(T));
    }

    public static final void B(cga cgaVar, aeqf aeqfVar, bwj bwjVar, int i) {
        int i2;
        cdi e;
        int i3;
        int i4;
        cgaVar.getClass();
        int i5 = i & 14;
        bwj c = bwjVar.c(-977599828);
        if (i5 == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeqfVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 91) == 18 && c.L()) {
            c.v();
        } else {
            String str = aeqfVar.a;
            arqg arqgVar = aeqfVar.f;
            aewr aewrVar = aeqfVar.e;
            c.y(-1715217906);
            if (aewrVar == null) {
                e = null;
            } else {
                e = cdk.e(-873122628, new aekj(aewrVar, 18), c);
            }
            ((bwk) c).Y();
            ahji.as(arqgVar, cdk.e(-319590556, new aekj(aeqfVar, 19), c), cgaVar, e, cdk.e(1388464257, new aekj(aeqfVar, 20), c), cdk.e(526160096, new aeqh(str, 1), c), cdk.e(-336144065, new aeqh(aeqfVar, 0), c), null, 0L, brg.a, 0L, 0L, 0L, null, c, ((i6 << 6) & 896) | 1794096, 0, 16256);
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new aeol(cgaVar, aeqfVar, i, 14, null);
        }
    }

    public static final void C(aeqe aeqeVar, bwj bwjVar, int i) {
        bwj c = bwjVar.c(1322571187);
        c.y(412401879);
        aeke.bf(aeqeVar.a, null, amv.h(cga.e, 64.0f), null, null, null, null, null, brg.a, null, null, null, "verification_dialog_glide_icon", null, null, null, c, 440, 196608, 491512);
        ((bwk) c).Y();
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelf(aeqeVar, i, 16);
        }
    }

    public static final void D(cga cgaVar, aeqd aeqdVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        cgaVar.getClass();
        int i5 = i & 14;
        bwj c = bwjVar.c(1718024472);
        if (i5 == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeqdVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            M(cgaVar, true, aeqdVar.e, null, cdk.e(-1332743906, new aelu(aeqdVar, 12), c), c, (i2 & 14) | 24624, 8);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeol(cgaVar, aeqdVar, i, 13, null);
        }
    }

    public static final void E(cga cgaVar, aeqc aeqcVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        cgaVar.getClass();
        int i5 = i & 14;
        bwj c = bwjVar.c(-1053356268);
        if (i5 == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeqcVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
            bzz e = c.e();
            if (e != null) {
                ((bzf) e).d = new aeol(cgaVar, aeqcVar, i, 12, null);
                return;
            }
            return;
        }
        throw null;
    }

    public static final void F(cga cgaVar, aeqb aeqbVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        cgaVar.getClass();
        int i5 = i & 14;
        bwj c = bwjVar.c(-220114193);
        if (i5 == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeqbVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
            bzz e = c.e();
            if (e != null) {
                ((bzf) e).d = new aeol(cgaVar, aeqbVar, i, 11, null);
                return;
            }
            return;
        }
        throw null;
    }

    public static final void G(cga cgaVar, aeqa aeqaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        cgaVar.getClass();
        int i5 = i & 14;
        bwj c = bwjVar.c(348394206);
        if (i5 == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeqaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            M(amv.q(cgaVar, brg.a, ((Configuration) c.g(AndroidCompositionLocals_androidKt.a)).screenHeightDp, 1), false, aeqaVar.g, null, cdk.e(1592593124, new aelu(aeqaVar, 11), c), c, 24576, 10);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeol(cgaVar, aeqaVar, i, 10, null);
        }
    }

    public static aeqg H(aeqg aeqgVar, boolean z, arqg arqgVar) {
        arqg arqgVar2;
        aewr aewrVar;
        arqg arqgVar3;
        aewr aewrVar2;
        aewr aewrVar3;
        arqg arqgVar4;
        aewr aewrVar4;
        arqg arqgVar5;
        if (aeqgVar instanceof aepx) {
            aepx aepxVar = (aepx) aeqgVar;
            aewr aewrVar5 = aepxVar.g;
            aewr a2 = aewr.a(aewrVar5, new aenj(arqgVar, aewrVar5, 3));
            aewr aewrVar6 = aepxVar.h;
            if (aewrVar6 != null) {
                aewrVar4 = aewr.a(aewrVar6, new aenj(arqgVar, aewrVar6, 3));
            } else {
                aewrVar4 = null;
            }
            arqg arqgVar6 = aepxVar.i;
            if (z) {
                arqgVar5 = new aenj(arqgVar, arqgVar6, 4, null);
            } else {
                arqgVar5 = arqgVar6;
            }
            return new aepx(aepxVar.a, aepxVar.b, aepxVar.c, aepxVar.d, aepxVar.e, aepxVar.f, a2, aewrVar4, arqgVar5);
        }
        if (!(aeqgVar instanceof aeqb)) {
            if (aeqgVar instanceof aeqa) {
                aeqa aeqaVar = (aeqa) aeqgVar;
                aewr aewrVar7 = aeqaVar.e;
                if (aewrVar7 != null) {
                    aewrVar2 = aewr.a(aewrVar7, new aenj(arqgVar, aewrVar7, 3));
                } else {
                    aewrVar2 = null;
                }
                aewr aewrVar8 = aeqaVar.f;
                if (aewrVar8 != null) {
                    aewrVar3 = aewr.a(aewrVar8, new aenj(arqgVar, aewrVar8, 3));
                } else {
                    aewrVar3 = null;
                }
                arqg arqgVar7 = aeqaVar.g;
                if (z) {
                    arqgVar4 = new aenj(arqgVar, arqgVar7, 4, null);
                } else {
                    arqgVar4 = arqgVar7;
                }
                return aeqa.b(aeqaVar, null, null, null, aewrVar2, aewrVar3, arqgVar4, 15);
            }
            if (!(aeqgVar instanceof aepy)) {
                if (!(aeqgVar instanceof aeqc)) {
                    if (aeqgVar instanceof aeqf) {
                        aeqf aeqfVar = (aeqf) aeqgVar;
                        aewr aewrVar9 = aeqfVar.d;
                        aewr a3 = aewr.a(aewrVar9, new aenj(arqgVar, aewrVar9, 3));
                        aewr aewrVar10 = aeqfVar.e;
                        if (aewrVar10 != null) {
                            aewrVar = aewr.a(aewrVar10, new aenj(arqgVar, aewrVar10, 3));
                        } else {
                            aewrVar = null;
                        }
                        arqg arqgVar8 = aeqfVar.f;
                        if (z) {
                            arqgVar3 = new aenj(arqgVar, arqgVar8, 4, null);
                        } else {
                            arqgVar3 = arqgVar8;
                        }
                        return new aeqf(aeqfVar.g, aeqfVar.a, aeqfVar.b, aeqfVar.c, a3, aewrVar, arqgVar3);
                    }
                    if (aeqgVar instanceof aeqd) {
                        aeqd aeqdVar = (aeqd) aeqgVar;
                        arqg arqgVar9 = aeqdVar.e;
                        if (z) {
                            arqgVar2 = new aenj(arqgVar, arqgVar9, 4, null);
                        } else {
                            arqgVar2 = arqgVar9;
                        }
                        return new aeqd(aeqdVar.a, aeqdVar.b, aeqdVar.c, aeqdVar.d, arqgVar2);
                    }
                    throw new armm();
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public static final void I(aeqg aeqgVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        aeqgVar.getClass();
        int i4 = i & 14;
        bwj c = bwjVar.c(-1263223211);
        if (i4 == 0) {
            if (true != c.G(aeqgVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 48;
        if ((i5 & 91) == 18 && c.L()) {
            c.v();
        } else {
            boolean z = aeqgVar instanceof aepx;
            cga.a aVar = cga.e;
            if (z) {
                c.y(752221063);
                adom.C(aVar, (aepx) aeqgVar, c, (i5 >> 3) & 14);
                ((bwk) c).Y();
            } else if (aeqgVar instanceof aepy) {
                c.y(752223184);
                adom.B(aVar, (aepy) aeqgVar, c, (i5 >> 3) & 14);
                ((bwk) c).Y();
            } else if (aeqgVar instanceof aeqa) {
                c.y(752225320);
                G(aVar, (aeqa) aeqgVar, c, (i5 >> 3) & 14);
                ((bwk) c).Y();
            } else if (aeqgVar instanceof aeqb) {
                c.y(752227241);
                F(aVar, (aeqb) aeqgVar, c, (i5 >> 3) & 14);
                ((bwk) c).Y();
            } else if (aeqgVar instanceof aeqc) {
                c.y(752229259);
                E(aVar, (aeqc) aeqgVar, c, (i5 >> 3) & 14);
                ((bwk) c).Y();
            } else if (aeqgVar instanceof aeqf) {
                c.y(752231438);
                B(aVar, (aeqf) aeqgVar, c, (i5 >> 3) & 14);
                ((bwk) c).Y();
            } else if (aeqgVar instanceof aeqd) {
                c.y(752233512);
                D(aVar, (aeqd) aeqgVar, c, (i5 >> 3) & 14);
                ((bwk) c).Y();
            } else {
                c.y(752220124);
                ((bwk) c).Y();
                throw new armm();
            }
            cgaVar = aVar;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeol(aeqgVar, cgaVar, i, 9);
        }
    }

    public static final void J(cga cgaVar, arqg arqgVar, String str, boolean z, bwj bwjVar, int i, int i2) {
        cga cgaVar2;
        int i3;
        int i4;
        cga cgaVar3;
        int i5;
        int i6;
        int i7;
        bwj c = bwjVar.c(-535680474);
        if (i2 != 0) {
            i3 = i | 6;
            cgaVar2 = cgaVar;
        } else if ((i & 14) == 0) {
            cgaVar2 = cgaVar;
            if (true != c.G(cgaVar2)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i3 = i4 | i;
        } else {
            cgaVar2 = cgaVar;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.I(arqgVar)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i3 |= i7;
        }
        if ((i & 896) == 0) {
            if (true != c.G(str)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i3 |= i6;
        }
        if ((i & 7168) == 0) {
            if (true != c.H(z)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i3 |= i5;
        }
        if ((i3 & 5851) == 1170 && c.L()) {
            c.v();
            cgaVar3 = cgaVar2;
        } else {
            if (i2 != 0) {
                cgaVar3 = cga.e;
            } else {
                cgaVar3 = cgaVar2;
            }
            int i8 = i3 >> 3;
            cga cgaVar4 = cgaVar3;
            ahji.an(arqgVar, cgaVar4, z, null, null, null, null, cdk.e(-1880376669, new aelu(str, 10), c), c, (i8 & 896) | ((i3 << 3) & 112) | (i8 & 14) | 805306368, 504);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aenf(cgaVar3, arqgVar, str, z, i, i2, 3);
        }
    }

    public static final void K(aewr aewrVar, aewr aewrVar2, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-746255723);
        if (i5 == 0) {
            if (true != c.G(aewrVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aewrVar2)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            cga j = amh.j(cga.e, 24.0f, 24.0f, 24.0f, brg.a, 8);
            ajw.b bVar = ajw.b;
            int i6 = cfq.a;
            cue a2 = amq.a(bVar, cfq.a.j, c, 6);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, j);
            int i7 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a2, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            amx.a(ams.a(amu.a, cga.e, 1.0f), c);
            c.y(-427431601);
            if (aewrVar2 != null) {
                boolean z = aewrVar2.b;
                J(null, aewrVar2.c, aewrVar2.a, z, c, 0, 1);
            }
            bwkVar.Y();
            c.y(-427427165);
            if (aewrVar != null) {
                cga j2 = amh.j(cga.e, 8.0f, brg.a, brg.a, brg.a, 14);
                boolean z2 = aewrVar.b;
                J(j2, aewrVar.c, aewrVar.a, z2, c, 6, 0);
            }
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeol(aewrVar, aewrVar2, i, 7, null);
        }
    }

    public static final void L(aerb aerbVar, cku ckuVar, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        cku ckuVar2;
        long j;
        cku ckuVar3;
        int i6 = i2 & 1;
        bwj c = bwjVar.c(2134529896);
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (true != c.G(aerbVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (true != c.G(ckuVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i3 |= i5;
        }
        if ((i3 & 91) == 18 && c.L()) {
            c.v();
            ckuVar3 = ckuVar;
        } else {
            if (i7 != 0) {
                ckuVar2 = null;
            } else {
                ckuVar2 = ckuVar;
            }
            cor bg = aeke.bg(aerbVar, c);
            c.y(-154630586);
            if (ckuVar2 == null) {
                j = ((cku) c.g(blp.a)).i;
            } else {
                j = ckuVar2.i;
            }
            ((bwk) c).Y();
            ahji.N(bg, null, null, j, c, 8, 4);
            ckuVar3 = ckuVar2;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeis(aerbVar, ckuVar3, i, i2, 3);
        }
    }

    public static final void M(cga cgaVar, boolean z, arqg arqgVar, dte dteVar, arqw arqwVar, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        dte dteVar2;
        int i6;
        int i7;
        cgaVar.getClass();
        arqwVar.getClass();
        int i8 = i2 & 1;
        bwj c = bwjVar.c(-5142472);
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (true != c.H(z)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i3 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c.I(arqgVar)) {
                i7 = 128;
            } else {
                i7 = 256;
            }
            i3 |= i7;
        }
        int i10 = i3 | 3072;
        if ((57344 & i) == 0) {
            if (true != c.I(arqwVar)) {
                i6 = 8192;
            } else {
                i6 = 16384;
            }
            i10 |= i6;
        }
        if ((46811 & i10) == 9362 && c.L()) {
            c.v();
            dteVar2 = dteVar;
            z3 = z;
        } else {
            boolean z4 = z & z2;
            dte dteVar3 = new dte((byte[]) null);
            int i11 = i10 >> 6;
            dsq.a(arqgVar, dteVar3, cdk.e(-1593463167, new aens(z4, cgaVar, arqwVar, 2), c), c, (i11 & 14) | 384 | (i11 & 112), 0);
            z3 = z4;
            dteVar2 = dteVar3;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aetl(cgaVar, z3, arqgVar, dteVar2, arqwVar, i, i2, 1);
        }
    }

    public static final void N(String str, boolean z, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        dqi dqiVar;
        boolean z3 = z;
        int i6 = i2 & 1;
        bwj c = bwjVar.c(-651317604);
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (true != c.G(str)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i3 = i | i4;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (true != c.H(z3)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i3 |= i5;
        }
        if ((i3 & 91) == 18 && c.L()) {
            c.v();
        } else {
            z3 &= z2;
            cga i8 = amh.i(amv.p(cga.e), 24.0f, brg.a, 2);
            long ax = ahji.ax(c);
            dje djeVar = bmp.d(c).f;
            if (z3) {
                dqiVar = new dqi(3);
            } else {
                dqiVar = null;
            }
            ahji.e(str, i8, ax, 0L, 0L, dqiVar, 0L, 0, false, 0, 0, null, djeVar, c, (i3 & 14) | 48, 0, 65016);
        }
        boolean z4 = z3;
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new lil(str, z4, i, i2, 3);
        }
    }

    public static final void O(aewr aewrVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1231953501);
        if (i4 == 0) {
            if (true != c.G(aewrVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 48;
        if ((i5 & 91) == 18 && c.L()) {
            c.v();
        } else {
            cgaVar = cga.e;
            J(cgaVar, aewrVar.c, aewrVar.a, aewrVar.b, c, (i5 >> 3) & 14, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeol(aewrVar, cgaVar, i, 6);
        }
    }

    public static final void P(cga cgaVar, List list, bwj bwjVar, int i) {
        bwj c = bwjVar.c(978261951);
        anp.a(amv.e(amh.j(cgaVar, 8.0f, 24.0f, 8.0f, brg.a, 8), 84.0f, 252.0f), aoz.a(c), null, false, null, null, null, false, new aeju(list, 19), c, 0, 252);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeol(cgaVar, list, i, 8, null);
        }
    }

    public static final void Q(String str, List list, cga cgaVar, bwj bwjVar, int i, int i2) {
        cga cgaVar2;
        int i3 = i2 & 4;
        bwj c = bwjVar.c(-2117342138);
        if (i3 != 0) {
            cgaVar2 = cga.e;
        } else {
            cgaVar2 = cgaVar;
        }
        aeim.f(new aeiq(str, list, 8), afs.c(cgaVar2, afs.b(c, 0), false, 14), ahji.aw(c), dje.y(bmp.d(c).k, 0L, 0L, null, null, null, null, 0L, Integer.MIN_VALUE, 0, 0L, null, null, 0, 16744447), 0L, null, false, null, c, 0, 496);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeob(str, list, cgaVar2, i, i2, 2);
        }
    }

    public static void R() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            advr.u("Cannot be called from the main thread!", new Object[0]);
        }
    }

    public static List S(String str) {
        return Arrays.asList(str.split("\\s*,\\s*"));
    }

    public static boolean T() {
        if (Build.VERSION.SDK_INT < 29 && Build.VERSION.SDK_INT < 29) {
            return false;
        }
        return true;
    }

    public static boolean U(Context context) {
        return al(context, "com.google.android.ims");
    }

    public static boolean V(Context context) {
        return al(context, context.getPackageName());
    }

    public static final Long W() {
        return Long.valueOf(System.currentTimeMillis());
    }

    public static boolean X(Context context, String str) {
        if (egl.e(context, str) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, acyz] */
    public static synchronized String Y(Context context, String str, int i) {
        String am;
        synchronized (agkx.class) {
            advr.c("Generating client ID of type %s subId %d", str, Integer.valueOf(i));
            if (!"1".equals(str)) {
                String str2 = (String) aczg.a().a.d.a();
                if (an(str2)) {
                    advr.k("Overriding Imei, should be only done for emulator testing!", new Object[0]);
                } else {
                    str2 = null;
                    try {
                        adwt f = adwt.g(context).f(i);
                        if (f != null) {
                            try {
                                str2 = f.a.getImei();
                            } catch (SecurityException e) {
                                throw new adwk("READ_PRIVILEGED_PHONE_STATE permission is missing.", e);
                            }
                        }
                    } catch (adwk e2) {
                        advr.s(e2, "Failed to get device id.", new Object[0]);
                    }
                }
                if (!Objects.isNull(str2) && an(str2)) {
                    am = Z(str2);
                } else {
                    advr.q("Unable to retrieve IMEI from device. Falling back to UUID!", new Object[0]);
                    am = am();
                }
                return am;
            }
            return am();
        }
    }

    public static String Z(String str) {
        String substring = str.substring(0, 8);
        String substring2 = str.substring(8, 14);
        String substring3 = str.substring(14, str.length());
        if (str.indexOf(45) > 1) {
            return "urn:gsma:imei:".concat(String.valueOf(str));
        }
        StringBuilder sb = new StringBuilder("urn:gsma:imei:");
        sb.append(substring);
        sb.append("-");
        sb.append(substring2);
        sb.append("-");
        if (substring3.length() == 1) {
            sb.append("0");
        } else {
            sb.append(substring3);
        }
        return sb.toString();
    }

    public static void aa(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            advr.i(e, "Unable to close resource %s", closeable.toString());
        }
    }

    public static boolean ab(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null && str2 != null) {
            return str.equals(str2);
        }
        return false;
    }

    public static boolean ac(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null && str2 != null) {
            return str.equalsIgnoreCase(str2);
        }
        return false;
    }

    public static boolean ad(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    public static boolean ae(String str) {
        if (str != null && str.trim().length() != 0) {
            return false;
        }
        return true;
    }

    public static boolean af(String str, String str2) {
        if (str == null || str2.length() > str.length()) {
            return false;
        }
        return str.substring(0, str2.length()).equalsIgnoreCase(str2);
    }

    public static rve ag() {
        return rve.a(ah());
    }

    public static String ah() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        return "Ms".concat(String.valueOf(Base64.encodeToString(wrap.array(), 11).replace('_', '=')));
    }

    public static String ai(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int read = inputStream.read();
        do {
            if (read == 13) {
                read = inputStream.read();
            } else {
                if (read == 10) {
                    return new String(byteArrayOutputStream.toByteArray(), "utf-8");
                }
                byteArrayOutputStream.write(read);
                read = inputStream.read();
            }
        } while (read > 0);
        throw new advm("0d0a sequence not read before InputStream EOF.");
    }

    public static void aj(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception unused) {
            }
        }
    }

    private static final long ak(aeqj aeqjVar, bwj bwjVar) {
        long h;
        bwjVar.y(1654322127);
        if (aeqjVar.b) {
            bwjVar.y(1301347753);
            h = bmp.a(bwjVar).b;
            ((bwk) bwjVar).Y();
        } else {
            bwjVar.y(1301398965);
            h = cku.h(bmp.a(bwjVar).q, 0.38f);
            ((bwk) bwjVar).Y();
        }
        ((bwk) bwjVar).Y();
        return h;
    }

    private static boolean al(Context context, String str) {
        return adwm.a(context).isIgnoringBatteryOptimizations(str);
    }

    private static String am() {
        return "urn:uuid:".concat(String.valueOf(UUID.randomUUID().toString()));
    }

    private static boolean an(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 14 || str.length() > 16) {
            return false;
        }
        return true;
    }

    public static aglc b(byte[] bArr, int i) {
        boolean z = false;
        int i2 = 0;
        long j = 0;
        long j2 = -1;
        long j3 = -1;
        int i3 = 0;
        while (i3 < i) {
            int i4 = i3 + 1;
            byte b = bArr[i3];
            if (b == 32) {
                if (!z) {
                    break;
                }
                if (i2 == 0) {
                    j2 = j;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = j;
                }
                i2++;
                z = false;
                j = 0;
                i3 = i4;
            } else {
                if (b < 48 || b > 57 || j > 922337203685477580L) {
                    break;
                }
                j = (j * 10) + (b - 48);
                i3 = i4;
                z = true;
            }
        }
        if (i2 == 2) {
            return new aglc(j2, j3, j);
        }
        throw new ParseException("Failed to parse SchedStat", i2);
    }

    public static void c(agnw agnwVar, String str, Runnable runnable) {
        agnwVar.U(str, runnable, agnt.NO_TXN);
    }

    @Deprecated
    public static boolean d(agnw agnwVar) {
        return ((uci) agnwVar).k().inTransaction();
    }

    public static void e(agnq agnqVar, agnp agnpVar, String str, Runnable runnable, agnt agntVar) {
        ((agnw) ((ukc) agnqVar).a.b()).U(str, new ryv(agnpVar, runnable, 20), agntVar);
    }

    public static ListenableFuture f(acir acirVar) {
        agqp agqpVar = new agqp(acirVar);
        acirVar.n(andi.a, new uyb(agqpVar, 9));
        return agqpVar;
    }

    public static acir g(ListenableFuture listenableFuture) {
        acit acitVar = new acit((byte[]) null);
        acit acitVar2 = new acit((adae) acitVar.a);
        albo.bR(listenableFuture, new vdc(acitVar2, listenableFuture, acitVar, 2), andi.a);
        return (acir) acitVar2.a;
    }

    public static agpj h(agpj agpjVar) {
        return new agpk("(coalesce(($V), 0) + 1)", new Object[]{agpjVar});
    }

    public static Object i(ListenableFuture listenableFuture, Object obj) {
        try {
            return albo.bQ(listenableFuture);
        } catch (IllegalStateException | ExecutionException unused) {
            return obj;
        }
    }

    public static boolean j(Future future) {
        if (future != null && future.isDone() && !future.isCancelled()) {
            try {
                albo.bQ(future);
                return true;
            } catch (ExecutionException unused) {
                return false;
            }
        }
        return false;
    }

    public static void k() {
        if (!a.y()) {
            if (!ahaw.a) {
                Log.wtf("ThreadUtil", "Expected in UI thread, but not.");
                return;
            }
            throw new IllegalThreadStateException("Expected in UI thread, but not.");
        }
    }

    public static Point l(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    public static void m(ImageView imageView, int i) {
        if (i > 0) {
            imageView.setImageResource(i);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
    }

    public static void n(View view, View view2, int i, int i2) {
        view.post(new uym(view2, i, i2, view, 3));
    }

    public static final long o(ahhm ahhmVar) {
        return ckw.c(eap.e(ckw.b(ahhmVar.ac), ckw.b(ahhmVar.ab), 0.5f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x063e, code lost:
    
        if (r0[0] > 100.01d) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x064a, code lost:
    
        if (r0[1] > 100.01d) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0656, code lost:
    
        if (r0[2] <= 100.01d) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0659, code lost:
    
        r0 = defpackage.ajge.c(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0759 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long p(long r67, defpackage.bwj r69) {
        /*
            Method dump skipped, instructions count: 2665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agkx.p(long, bwj):long");
    }

    public static final void q(aeqj aeqjVar, bwj bwjVar, int i) {
        int i2;
        float f;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(1517292247);
        if (i4 == 0) {
            if (true != c.G(aeqjVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            cga b = wj.b(cga.e);
            int i5 = cfq.a;
            cue a2 = amq.a(ajw.a, cfq.a.k, c, 48);
            int a3 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b2 = cfv.b(c, b);
            int i6 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a2, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b2, cwl.a.c);
            if (aeqjVar.c != null) {
                f = 12.0f;
            } else {
                f = 20.0f;
            }
            ahji.e(aeqjVar.a, amh.j(cga.e, 20.0f, brg.a, f, brg.a, 10), ak(aeqjVar, c), 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(c).m, c, 0, 0, 65528);
            aerb aerbVar = aeqjVar.c;
            c.y(-898641264);
            if (aerbVar != null) {
                ahji.N(aeke.bg(aerbVar, c), null, amh.j(cga.e, brg.a, brg.a, 16.0f, brg.a, 11), ak(aeqjVar, c), c, 392, 0);
            }
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelf(aeqjVar, i, 17);
        }
    }

    public static final void r(cga cgaVar, aeqj aeqjVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        long h;
        float f;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(1610429955);
        if (i6 == 0) {
            if (true != c.G(cgaVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeqjVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            cga d = amv.d(cgaVar, 56.0f);
            c.y(1396298423);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = aedh.p;
                bwkVar.ad(T);
            }
            bwkVar.Y();
            cga d2 = dhb.d(d, (arqr) T);
            boolean z = aeqjVar.b;
            awg a2 = awh.a(16.0f);
            c.y(-1688276486);
            if (aeqjVar.b) {
                c.y(-1248543818);
                h = bmp.a(c).a;
                bwkVar.Y();
            } else {
                c.y(-1248494528);
                h = cku.h(bmp.a(c).q, 0.12f);
                bwkVar.Y();
            }
            bwkVar.Y();
            if (true != aeqjVar.b) {
                f = brg.a;
            } else {
                f = 6.0f;
            }
            bqv.d(aeqjVar.d, d2, z, a2, h, 0L, f, null, null, arqvVar, c, 864);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aelx(cgaVar, aeqjVar, arqvVar, i, 13, (byte[]) null);
        }
    }

    public static final void s(aeqj aeqjVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1760125035);
        if (i5 == 0) {
            if (true != c.G(aeqjVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            r(cgaVar, aeqjVar, cdk.e(1646791523, new aeqh(aeqjVar, 2), c), c, ((i2 << 3) & 112) | ((i2 >> 3) & 14) | 384);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeol(aeqjVar, cgaVar, i, 17);
        }
    }

    public static final void t(aeqi aeqiVar, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        aerb aerbVar;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1332291043);
        if (i5 == 0) {
            if (true != c.G(aeqiVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            if (aeqiVar.b) {
                aerbVar = aerb.q;
            } else {
                aerbVar = aerb.p;
            }
            ahji.an(aeqiVar.c, cgaVar, false, null, null, null, null, cdk.e(83767770, new ifo(aeqiVar, aerbVar, 12, null), c), c, (i2 & 112) | 805306368, 508);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeol(aeqiVar, cgaVar, i, 16);
        }
    }

    public static final float u(byj byjVar) {
        return byjVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void v(defpackage.ake r26, defpackage.apeb r27, boolean r28, defpackage.arqg r29, defpackage.bwj r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agkx.v(ake, apeb, boolean, arqg, bwj, int, int):void");
    }

    public static final void w(apdy apdyVar, zj zjVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        zjVar.getClass();
        int i5 = i & 14;
        bwj c = bwjVar.c(-41620519);
        if (i5 == 0) {
            if (true != c.G(apdyVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(zjVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            bxl.f(apdyVar, zjVar, new adzx(zjVar, apdyVar, (arpe) null, 6), c);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeol(apdyVar, zjVar, i, 15);
        }
    }

    public static final void x(apdy apdyVar, zj zjVar, long j, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        zjVar.getClass();
        int i6 = i & 14;
        bwj c = bwjVar.c(-706631248);
        if (i6 == 0) {
            if (true != c.G(apdyVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(zjVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.F(j)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            bxl.g(apdyVar, new jmn(zjVar, apdyVar, j, (arpe) null, 6), c);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeus(apdyVar, zjVar, j, i, 1);
        }
    }

    public static final aak y(int i) {
        int i2 = i - 2;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return aao.d;
                    }
                    return aao.b;
                }
                return aao.d;
            }
            return aao.a;
        }
        return aao.c;
    }

    public static final acf z(apdt apdtVar) {
        int i = apdtVar.b;
        int i2 = apdtVar.c;
        int T = a.T(apdtVar.d);
        if (T == 0) {
            T = 1;
        }
        return new acf(i, i2, y(T));
    }

    public final agkw a() {
        agkw agkwVar = new agkw(agkz.b, Process.myTid(), true, 0, false, 104);
        agkz.c = agkwVar;
        return agkwVar;
    }
}
