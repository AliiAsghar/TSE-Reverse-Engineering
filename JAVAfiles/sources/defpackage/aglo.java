package defpackage;

import android.content.Context;
import android.os.Trace;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aglo {
    public static volatile aglo f;

    public aglo() {
    }

    public static ListenableFuture A(agvi agviVar) {
        return ancj.f(agviVar.a(), new abes(18), andi.a);
    }

    public static void B(agvi agviVar, agxy agxyVar) {
        if (agxyVar.b() == 1) {
            agviVar.e(agxyVar.a());
        }
    }

    public static aoij C(agnw agnwVar, String str, aglo agloVar) {
        adwp u = u();
        Integer a = agnb.a(str);
        int i = 0;
        if (a != null) {
            Log.i("D26R", "BULK INSERT " + str + " " + agloVar.t().length);
            for (int i2 = 0; i2 < agloVar.t().length; i2++) {
                Log.i("D26R", "  @" + i2 + " BINDDATA: " + agloVar.t()[i2].a());
            }
            adwp.l(a.intValue());
        }
        return u.q(agnwVar, new agol(str, i), agloVar);
    }

    public static boolean l(Context context) {
        if ("com.google.android.gms".equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    public static long m(boolean z, boolean z2, boolean z3, int i, int i2, int i3, long j) {
        long j2;
        long j3;
        long j4 = 0;
        if (true != z) {
            j2 = 0;
        } else {
            j2 = 1;
        }
        if (true != z2) {
            j3 = 0;
        } else {
            j3 = 1;
        }
        long j5 = j2 + j2;
        if (true == z3) {
            j4 = 1;
        }
        long j6 = j3 | j5;
        return (((((((((j6 + j6) | j4) << 6) | ((i + 21) & 63)) << 6) | (i2 + 21)) << 6) | ((i3 + 21) & 63)) << 43) | (8796093022207L & j);
    }

    @Deprecated
    public static String n(agpj agpjVar) {
        return agpjVar.ad(agpo.b());
    }

    public static void o(agoz agozVar) {
        u().m(agozVar);
    }

    public static adwp u() {
        return ((agoj) akec.w(agnc.b, agoj.class)).Qi();
    }

    public static /* synthetic */ String v(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "LOADING_SPINNER";
                    }
                    return "EMPTY_CATEGORY_DESC";
                }
                return "CATEGORY";
            }
            return "IMAGE";
        }
        return "EMOJI";
    }

    public static agxy w(String str) {
        str.getClass();
        return new agxm(str);
    }

    public static /* synthetic */ String x(agxp agxpVar) {
        throw new UnsupportedOperationException(v(agxpVar.b()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static alog y(aguz aguzVar, alog alogVar, int i, agxe agxeVar, boolean z, boolean z2, int i2) {
        int i3;
        alob alobVar = new alob();
        agxl.a();
        int size = alogVar.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            agxy agxyVar = (agxy) alogVar.get(i5);
            if (i2 != -1 && i4 >= i2) {
                break;
            }
            if (agxyVar.b() == 1) {
                if (agxl.c(agxyVar.a(), agxeVar)) {
                    int i6 = i4 + 1;
                    alog d = agxl.d(aguzVar.c(agxyVar.a()), agxeVar);
                    if (!z2 || ((alsx) d).c <= 1) {
                        d = alsx.a;
                    }
                    alobVar.h(new agwn(i, i4, agxyVar.a(), d, z));
                    i4 = i6;
                }
            } else {
                agxyVar.b();
                if (agxyVar.b() == 4) {
                    i3 = i4 + 1;
                    alobVar.h(new agwo(i, i4, agxyVar.c()));
                } else if (agxyVar.b() == 3) {
                    i3 = i4 + 1;
                    agxyVar.d();
                    alobVar.h(new agvl(i, i4));
                } else if (agxyVar.b() == 5) {
                    alobVar.h(new agwy(i, i4));
                    i4++;
                } else {
                    agxyVar.b();
                }
                i4 = i3;
            }
        }
        return alobVar.g();
    }

    public static ListenableFuture z(aguz aguzVar, agvj agvjVar, agxe agxeVar, int i, boolean z, Optional optional) {
        gvf.bd("ItemViewDataUtils.getRecentItemViewData");
        try {
            ListenableFuture b = agvjVar.b();
            return albo.bW(b, ((aguq) aguzVar).k).a(new agwx(b, optional, aguzVar, agxeVar, z, i, 0), andi.a);
        } finally {
            Trace.endSection();
        }
    }

    public aglz p() {
        return null;
    }

    public agoz q() {
        return null;
    }

    public agpr r() {
        return null;
    }

    public agpw s() {
        return null;
    }

    public aglz[] t() {
        return null;
    }

    public aglo(byte[] bArr) {
    }
}
