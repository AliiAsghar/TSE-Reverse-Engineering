package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import defpackage.cgq;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbd implements ViewTranslationCallback {
    public static final dbd a = new dbd();

    private dbd() {
    }

    public final boolean onClearTranslation(View view) {
        int i;
        arqg arqgVar;
        view.getClass();
        cgq cgqVar = ((dai) view).l;
        cgqVar.b = cgq.a.a;
        tx a2 = cgqVar.a();
        Object[] objArr = a2.c;
        long[] jArr = a2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            dgy dgyVar = ((ddw) objArr[(i2 << 3) + i4]).a.c;
                            dhn dhnVar = dhh.a;
                            if (dgz.a(dgyVar, dhh.z) != null) {
                                dhn dhnVar2 = dgx.a;
                                dgn dgnVar = (dgn) dgz.a(dgyVar, dgx.l);
                                if (dgnVar != null && (arqgVar = (arqg) dgnVar.b) != null) {
                                }
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        return true;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    public final boolean onHideTranslation(View view) {
        int i;
        arqr arqrVar;
        view.getClass();
        cgq cgqVar = ((dai) view).l;
        cgqVar.b = cgq.a.a;
        tx a2 = cgqVar.a();
        Object[] objArr = a2.c;
        long[] jArr = a2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            dgy dgyVar = ((ddw) objArr[(i2 << 3) + i4]).a.c;
                            dhn dhnVar = dhh.a;
                            if (d.F(dgz.a(dgyVar, dhh.z), true)) {
                                dhn dhnVar2 = dgx.a;
                                dgn dgnVar = (dgn) dgz.a(dgyVar, dgx.k);
                                if (dgnVar != null && (arqrVar = (arqr) dgnVar.b) != null) {
                                }
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return true;
    }

    public final boolean onShowTranslation(View view) {
        int i;
        arqr arqrVar;
        view.getClass();
        cgq cgqVar = ((dai) view).l;
        cgqVar.b = cgq.a.b;
        tx a2 = cgqVar.a();
        Object[] objArr = a2.c;
        long[] jArr = a2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            dgy dgyVar = ((ddw) objArr[(i2 << 3) + i4]).a.c;
                            dhn dhnVar = dhh.a;
                            if (d.F(dgz.a(dgyVar, dhh.z), false)) {
                                dhn dhnVar2 = dgx.a;
                                dgn dgnVar = (dgn) dgz.a(dgyVar, dgx.k);
                                if (dgnVar != null && (arqrVar = (arqr) dgnVar.b) != null) {
                                }
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return true;
    }
}
