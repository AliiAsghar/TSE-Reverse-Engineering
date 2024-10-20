package defpackage;

import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqj extends arrp implements arqg {
    private final /* synthetic */ int u;
    public static final gqj t = new gqj(20);
    public static final gqj s = new gqj(19);
    public static final gqj r = new gqj(18);
    public static final gqj q = new gqj(17);
    public static final gqj p = new gqj(16);
    public static final gqj o = new gqj(15);
    public static final gqj n = new gqj(14);
    public static final gqj m = new gqj(13);
    public static final gqj l = new gqj(12);
    public static final gqj k = new gqj(11);
    public static final gqj j = new gqj(10);
    public static final gqj i = new gqj(9);
    public static final gqj h = new gqj(8);
    public static final gqj g = new gqj(7);
    public static final gqj f = new gqj(5);
    public static final gqj e = new gqj(4);
    public static final gqj d = new gqj(3);
    public static final gqj c = new gqj(2);
    public static final gqj b = new gqj(1);
    public static final gqj a = new gqj(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqj(int i2) {
        super(0);
        this.u = i2;
    }

    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        kkc kkcVar;
        WindowLayoutComponent f2;
        Object grfVar;
        boolean z = true;
        switch (this.u) {
            case 0:
                Method method = ry$$ExternalSyntheticApiModelOutline0.m$9().getMethod("setAnimationParams", ry$$ExternalSyntheticApiModelOutline0.m$7());
                method.getClass();
                if (!gvf.aC(method) || !gvf.az(method, ry$$ExternalSyntheticApiModelOutline0.m$9())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                Method method2 = ry$$ExternalSyntheticApiModelOutline0.m$22().getMethod("isDraggingToFullscreenAllowed", null);
                method2.getClass();
                if (!gvf.aC(method2) || !gvf.az(method2, Boolean.TYPE)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                Method method3 = ry$$ExternalSyntheticApiModelOutline0.m$9().getMethod("setDividerAttributes", ry$$ExternalSyntheticApiModelOutline0.m$22());
                method3.getClass();
                if (!gvf.aC(method3) || !gvf.az(method3, ry$$ExternalSyntheticApiModelOutline0.m$9())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                Method method4 = ry$$ExternalSyntheticApiModelOutline0.m$23().getMethod("setDraggingToFullscreenAllowed", Boolean.TYPE);
                method4.getClass();
                if (!gvf.aC(method4) || !gvf.az(method4, ry$$ExternalSyntheticApiModelOutline0.m$23())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                Method method5 = ry$$ExternalSyntheticApiModelOutline0.m$12().getMethod("getToken", null);
                method5.getClass();
                if (!gvf.aC(method5) || !gvf.az(method5, IBinder.class)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                try {
                    ClassLoader classLoader = gqw.class.getClassLoader();
                    if (classLoader != null) {
                        kkcVar = new kkc(classLoader, new goq(classLoader));
                    } else {
                        kkcVar = null;
                    }
                    if (kkcVar == null || (f2 = kkcVar.f()) == null) {
                        return null;
                    }
                    classLoader.getClass();
                    goq goqVar = new goq(classLoader);
                    int i2 = gor.a;
                    int a2 = gor.a();
                    if (a2 >= 6) {
                        grfVar = new grh(f2, goqVar);
                    } else if (a2 >= 2) {
                        grfVar = new grh(f2, goqVar);
                    } else if (a2 == 1) {
                        grfVar = new grg(f2, goqVar);
                    } else {
                        grfVar = new grf();
                    }
                    return grfVar;
                } catch (Throwable unused) {
                    arml armlVar = gqv.a;
                    return null;
                }
            case 6:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            case 7:
                return new Handler(Looper.getMainLooper());
            case 8:
                return arnb.a;
            case 9:
                return arnb.a;
            case 10:
                return arnb.a;
            case 11:
                return arnb.a;
            case 12:
                return arnb.a;
            case 13:
                afsf afsfVar = afsk.b;
                return afwv.K();
            case 14:
                return aauj.a(amqh.CONTACT, amqi.EXPANDED);
            case 15:
                return aauj.a(amqh.CONTACT, amqi.EXPANDED);
            case 16:
                return aauj.a(amqh.FILE, amqi.EXPANDED);
            case 17:
                return aauj.a(amqh.FILE, amqi.EXPANDED);
            case 18:
                return agek.values();
            case 19:
                return ins.values();
            default:
                return aqil.r(new ins[]{ins.MAGIC_COMPOSE, ins.VOICE});
        }
    }
}
