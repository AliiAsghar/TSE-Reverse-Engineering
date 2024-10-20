package defpackage;

import defpackage.cfc;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cfd extends arrp implements arqg<arnb> {
    final /* synthetic */ cfc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfd(cfc cfcVar) {
        super(0);
        this.a = cfcVar;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        Object[] objArr;
        int i;
        int i2;
        do {
            cfc cfcVar = this.a;
            synchronized (cfcVar.e) {
                if (!cfcVar.c) {
                    cfcVar.c = true;
                    try {
                        cbh cbhVar = cfcVar.d;
                        int i3 = cbhVar.b;
                        if (i3 > 0) {
                            Object[] objArr2 = cbhVar.a;
                            int i4 = 0;
                            while (true) {
                                cfc.a aVar = (cfc.a) objArr2[i4];
                                vh vhVar = aVar.k;
                                arqr arqrVar = aVar.a;
                                Object[] objArr3 = vhVar.b;
                                long[] jArr = vhVar.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i5 = 0;
                                    while (true) {
                                        long j = jArr[i5];
                                        i = i3;
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i6 = i5 - length;
                                            int i7 = 0;
                                            while (true) {
                                                objArr = objArr2;
                                                i2 = 8 - ((~i6) >>> 31);
                                                if (i7 >= i2) {
                                                    break;
                                                }
                                                if ((j & 255) < 128) {
                                                    arqrVar.a(objArr3[(i5 << 3) + i7]);
                                                }
                                                j >>= 8;
                                                i7++;
                                                objArr2 = objArr;
                                            }
                                            if (i2 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr2;
                                        }
                                        if (i5 == length) {
                                            break;
                                        }
                                        i5++;
                                        i3 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    objArr = objArr2;
                                    i = i3;
                                }
                                vhVar.d();
                                i4++;
                                int i8 = i;
                                if (i4 >= i8) {
                                    break;
                                }
                                i3 = i8;
                                objArr2 = objArr;
                            }
                        }
                        cfcVar.c = false;
                    } finally {
                    }
                }
            }
        } while (this.a.f());
        return arnb.a;
    }
}
