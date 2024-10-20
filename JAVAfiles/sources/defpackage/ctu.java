package defpackage;

import defpackage.cvm;
import defpackage.cxn;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctu extends cxn.b {
    final /* synthetic */ ctt a;
    final /* synthetic */ arqv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctu(ctt cttVar, arqv arqvVar, String str) {
        super(str);
        this.a = cttVar;
        this.b = arqvVar;
    }

    @Override // defpackage.cue
    public final cuf e(cuh cuhVar, List list, long j) {
        this.a.f.a = cuhVar.q();
        this.a.f.b = cuhVar.ec();
        this.a.f.c = cuhVar.ed();
        if (!cuhVar.ev()) {
            ctt cttVar = this.a;
            if (cttVar.a.k != null) {
                cttVar.e = 0;
                final cuf cufVar = (cuf) this.b.a(cttVar.g, new dqs(j));
                final ctt cttVar2 = this.a;
                final int i = cttVar2.e;
                return new cuf() { // from class: ctu.1
                    @Override // defpackage.cuf
                    public final int j() {
                        return cufVar.j();
                    }

                    @Override // defpackage.cuf
                    public final int k() {
                        return cufVar.k();
                    }

                    @Override // defpackage.cuf
                    public final Map m() {
                        return cufVar.m();
                    }

                    @Override // defpackage.cuf
                    public final arqr n() {
                        return cufVar.n();
                    }

                    @Override // defpackage.cuf
                    public final void o() {
                        int i2;
                        cttVar2.e = i;
                        cufVar.o();
                        ctt cttVar3 = cttVar2;
                        ve veVar = cttVar3.o;
                        long[] jArr = veVar.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j2 = jArr[i3];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = i3 - length;
                                    int i5 = 0;
                                    while (true) {
                                        i2 = 8 - ((~i4) >>> 31);
                                        if (i5 >= i2) {
                                            break;
                                        }
                                        if ((255 & j2) < 128) {
                                            int i6 = (i3 << 3) + i5;
                                            Object obj = veVar.b[i6];
                                            cvm.a aVar = (cvm.a) veVar.c[i6];
                                            int a = cttVar3.h.a(obj);
                                            if (a < 0 || a >= cttVar3.e) {
                                                aVar.b();
                                                veVar.h(i6);
                                            }
                                        }
                                        j2 >>= 8;
                                        i5++;
                                    }
                                    if (i2 != 8) {
                                        return;
                                    }
                                }
                                if (i3 != length) {
                                    i3++;
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                };
            }
        }
        ctt cttVar3 = this.a;
        cttVar3.d = 0;
        final cuf cufVar2 = (cuf) this.b.a(cttVar3.f, new dqs(j));
        final ctt cttVar4 = this.a;
        final int i2 = cttVar4.d;
        return new cuf() { // from class: ctu.2
            @Override // defpackage.cuf
            public final int j() {
                return cufVar2.j();
            }

            @Override // defpackage.cuf
            public final int k() {
                return cufVar2.k();
            }

            @Override // defpackage.cuf
            public final Map m() {
                return cufVar2.m();
            }

            @Override // defpackage.cuf
            public final arqr n() {
                return cufVar2.n();
            }

            @Override // defpackage.cuf
            public final void o() {
                cttVar4.d = i2;
                cufVar2.o();
                ctt cttVar5 = cttVar4;
                cttVar5.h(cttVar5.d);
            }
        };
    }
}
