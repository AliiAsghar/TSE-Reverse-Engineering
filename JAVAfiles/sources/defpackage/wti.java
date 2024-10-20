package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import java.lang.reflect.Method;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wti {
    private static final uuf f;
    private static final uuf g;
    public final armf c;
    private final armf h;
    private final armf i;
    private final arwe j;
    private static final alvi d = alvi.m("com/google/android/apps/messaging/shared/screendetection/ScreenDetectionChecker");
    public static final alhr a = uuh.y("enable_screen_detection_checker_2");
    private static final alhr e = uuh.y("enable_skip_screen_detection_check_v");
    public static final alhr b = uuh.y("enable_screen_detection_use_v_api");

    static {
        ahtn ahtnVar = uuh.b;
        aozy createBuilder = aplg.a.createBuilder();
        createBuilder.by(aqjn.D("com.google.android.projection.gearhead", "com.google.android.marvin.talkback"));
        f = uuh.u(ahtnVar, "screen_detection_checker_allowed_packages", createBuilder.s(), new mdd(8));
        g = uuh.u(uuh.b, "screen_detection_checker_denied_packages", aplg.a.createBuilder().s(), new mdd(8));
    }

    public wti(armf armfVar, armf armfVar2, armf armfVar3, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        arweVar.getClass();
        this.h = armfVar;
        this.i = armfVar2;
        this.c = armfVar3;
        this.j = arweVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final wth a() {
        wth wthVar;
        String str;
        akrh e2 = aktp.e("ScreenDetectionChecker.isScreenCaptureProbablyActiveWithPackageName");
        try {
            if (!((Boolean) ((utz) a.get()).e()).booleanValue()) {
                wth wthVar2 = new wth(false);
                armd.i(e2, null);
                return wthVar2;
            }
            akrh e3 = aktp.e("ScreenDetectionChecker#isScreenCaptureProbablyActiveWithoutLogging");
            try {
                DisplayManager displayManager = (DisplayManager) ((Context) this.i.b()).getSystemService("display");
                if (displayManager == null) {
                    wthVar = new wth(false);
                    armd.i(e3, null);
                } else {
                    Display[] displays = displayManager.getDisplays();
                    if (displays.length <= 1) {
                        wthVar = new wth(false);
                        armd.i(e3, null);
                    } else {
                        Iterator a2 = arrj.a(displays);
                        while (true) {
                            if (a2.hasNext()) {
                                Display display = (Display) a2.next();
                                try {
                                    Method declaredMethod = display.getClass().getDeclaredMethod("getOwnerPackageName", null);
                                    str = new quz(declaredMethod, display, 9, null).a();
                                } catch (Throwable th) {
                                    ((alvg) ((alvg) d.h()).g(th).h("com/google/android/apps/messaging/shared/screendetection/ScreenDetectionChecker", "isScreenCaptureProbablyActiveWithoutLogging", 128, "ScreenDetectionChecker.kt")).q("ScreenDetectionChecker: failed to call getOwnerPackageName");
                                    str = null;
                                }
                                if (str != null && str.length() != 0) {
                                    if (!((aplg) f.e()).b.contains(str)) {
                                        if (((aplg) g.e()).b.contains(str)) {
                                            wthVar = new wth(true, str);
                                            armd.i(e3, null);
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                int flags = display.getFlags();
                                if ((flags & 1) == 0 && (flags & 2) == 0 && display.getDisplayId() != 0) {
                                    wthVar = new wth(true, str);
                                    armd.i(e3, null);
                                    break;
                                }
                            } else {
                                wthVar = new wth(false);
                                armd.i(e3, null);
                                break;
                            }
                        }
                    }
                }
                if (wthVar.a) {
                    b();
                }
                armd.i(e2, null);
                return wthVar;
            } finally {
            }
        } finally {
        }
    }

    public final void b() {
        qjh.l(this.j, null, new uxs(this, (arpe) null, 8), 3);
    }

    public final boolean c() {
        if (yhx.i && ((Context) this.i.b()).checkSelfPermission("android.permission.DETECT_SCREEN_RECORDING") == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        akrh e2 = aktp.e("ScreenDetectionChecker.isScreenCaptureProbablyActive");
        try {
            if (((Boolean) ((utz) e.get()).e()).booleanValue() && yhx.i) {
                armd.i(e2, null);
                return false;
            }
            if (!((Boolean) ((utz) a.get()).e()).booleanValue()) {
                armd.i(e2, null);
                return false;
            }
            boolean z = a().a;
            armd.i(e2, null);
            return z;
        } finally {
        }
    }
}
