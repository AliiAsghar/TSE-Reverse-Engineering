package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aezy {
    public static final bzc a = new cat(aezo.c);

    public static final aaw a(final float f) {
        return zs.b(zs.d(1300, 0, new aak() { // from class: aezv
            @Override // defpackage.aak
            public final float a(float f2) {
                bzc bzcVar = aezy.a;
                float f3 = f;
                if (f2 < f3) {
                    return f2 / f3;
                }
                return (1.0f - f2) / (1.0f - f3);
            }
        }, 2), abj.a, 4);
    }

    public static final acf b() {
        return zs.d(333, 0, aao.b, 2);
    }

    public static final aezu c(boolean z) {
        if (z) {
            return new aezu(g(), h(), i(), j(), b(), m(), e(), aezx.a, d(), o(), p(), q(), k(), l(), r(), f(), xl.a, xn.a, n());
        }
        return new aezu(g(), h(), i(), j(), b(), m(), e(), aezw.a, d(), o(), p(), q(), k(), l(), r(), f(), wx.g(zs.d(250, 500, null, 4), 2).a(wx.f(zs.d(500, 0, null, 6), 14)), wx.l().a(wx.h(null, 3)), n());
    }

    private static final aaw d() {
        return zs.b(new acf(1300, BasePaymentResult.ERROR_REQUEST_FAILED, aao.d), abj.a, 4);
    }

    private static final aaw e() {
        return zs.b(zs.d(1000, 0, aao.c, 2), null, 6);
    }

    private static final acf f() {
        return zs.d(1000, 0, new aae(brg.a, 0.4f, 1.0f, 0.6f), 2);
    }

    private static final acf g() {
        return zs.d(700, 0, aam.c, 2);
    }

    private static final acf h() {
        return zs.d(300, 0, aao.c, 2);
    }

    private static final acf i() {
        return new acf(150, 150, aao.b);
    }

    private static final acf j() {
        return zs.d(150, 0, aao.c, 2);
    }

    private static final acf k() {
        return zs.d(500, 0, aam.a, 2);
    }

    private static final acf l() {
        return zs.d(1000, 0, aam.b, 2);
    }

    private static final acf m() {
        return zs.d(BasePaymentResult.ERROR_REQUEST_FAILED, 0, null, 6);
    }

    private static final acf n() {
        return zs.d(250, 0, new aae(brg.a, brg.a, brg.a, 1.0f), 2);
    }

    private static final acf o() {
        return zs.d(1, BasePaymentResult.ERROR_REQUEST_FAILED, null, 4);
    }

    private static final acf p() {
        return zs.d(600, 0, aao.a, 2);
    }

    private static final acf q() {
        return zs.d(250, 0, aao.a, 2);
    }

    private static final acf r() {
        return zs.d(1400, 0, aao.a, 2);
    }
}
