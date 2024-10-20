package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bzg extends arrp implements arqr<bwq, arnb> {
    final /* synthetic */ bzf a;
    final /* synthetic */ int b;
    final /* synthetic */ uv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzg(bzf bzfVar, int i, uv uvVar) {
        super(1);
        this.a = bzfVar;
        this.b = i;
        this.c = uvVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        int i;
        char c;
        bwq bwqVar = (bwq) obj;
        bzf bzfVar = this.a;
        if (bzfVar.e == this.b && d.F(this.c, bzfVar.f) && (bwqVar instanceof bwt)) {
            uv uvVar = this.c;
            int i2 = this.b;
            bzf bzfVar2 = this.a;
            long[] jArr = uvVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = i3 - length;
                        int i5 = 0;
                        while (true) {
                            i = 8 - ((~i4) >>> 31);
                            if (i5 >= i) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj2 = uvVar.b[i6];
                                if (uvVar.c[i6] != i2) {
                                    bwt bwtVar = (bwt) bwqVar;
                                    cbk.c(bwtVar.l, obj2, bzfVar2);
                                    if (obj2 instanceof bxe) {
                                        bxe bxeVar = (bxe) obj2;
                                        if (!ve.e(bwtVar.l, bxeVar)) {
                                            cbk.b(bwtVar.m, bxeVar);
                                        }
                                        ve veVar = bzfVar2.g;
                                        if (veVar != null) {
                                            veVar.g(obj2);
                                        }
                                    }
                                    uvVar.f(i6);
                                    c = '\b';
                                    j >>= c;
                                    i5++;
                                }
                            }
                            c = '\b';
                            j >>= c;
                            i5++;
                        }
                        if (i != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return arnb.a;
    }
}
