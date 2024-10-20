package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.WindowManager;
import com.google.android.apps.messaging.R;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wtp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/screendetection/ScreenDetectionHelper");
    public final armf b;
    public final armf c;
    public final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final arwe h;
    private final aneo i;

    public wtp(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, arwe arweVar, aneo aneoVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        arweVar.getClass();
        aneoVar.getClass();
        this.e = armfVar;
        this.f = armfVar2;
        this.b = armfVar3;
        this.g = armfVar4;
        this.c = armfVar6;
        this.d = armfVar7;
        this.h = arweVar;
        this.i = aneoVar;
    }

    private final DisplayManager i() {
        return (DisplayManager) ((Context) this.b.b()).getSystemService("display");
    }

    private final WindowManager j() {
        return (WindowManager) ((Context) this.b.b()).getSystemService("window");
    }

    private final wtm k(arqg arqgVar) {
        DisplayManager i = i();
        if (i == null) {
            return new wtm(null, null, 3);
        }
        wto wtoVar = new wto(this, arqgVar);
        i.registerDisplayListener(wtoVar, (Handler) this.g.b());
        akrh e = aktp.e("ScreenDetectionHelper.onUpdate.initial");
        try {
            arqgVar.a();
            armd.i(e, null);
            return new wtm(wtoVar, null, 2);
        } finally {
        }
    }

    private final void l() {
        akrh e = aktp.e("ScreenDetectionHelper.refreshNotifications");
        try {
            qjh.l(this.h, null, new uxs(this, (arpe) null, 9), 3);
            armd.i(e, null);
        } finally {
        }
    }

    @armg
    public final DisplayManager.DisplayListener a(arqg arqgVar) {
        akrh e = aktp.e("ScreenDetectionHelper.registerDisplayListener");
        try {
            DisplayManager i = i();
            if (i == null) {
                armd.i(e, null);
                return null;
            }
            wtn wtnVar = new wtn(arqgVar);
            i.registerDisplayListener(wtnVar, (Handler) this.g.b());
            armd.i(e, null);
            return wtnVar;
        } finally {
        }
    }

    public final wth b(wth wthVar) {
        akrh e = aktp.e("ScreenDetectionHelper.handleDisplayChange");
        try {
            wth a2 = ((wti) this.e.b()).a();
            if (wthVar == null || wthVar.a != a2.a) {
                l();
            }
            armd.i(e, null);
            return a2;
        } finally {
        }
    }

    public final wth c(boolean z, wth wthVar) {
        akrh e = aktp.e("ScreenDetectionHelper.handleRecordingCallback");
        try {
            wth wthVar2 = new wth(z);
            if (wthVar == null || wthVar.a != wthVar2.a) {
                l();
            }
            armd.i(e, null);
            return wthVar2;
        } finally {
        }
    }

    public final wtk d(wth wthVar) {
        wthVar.getClass();
        String str = wthVar.b;
        if (str != null && str.length() != 0) {
            String string = ((Context) this.b.b()).getString(R.string.screen_detection_dialog_body_with_package_name, str);
            string.getClass();
            int T = arsd.T(string, str, 0, 6);
            return new wtk(string, Integer.valueOf(T), Integer.valueOf(T + str.length()));
        }
        String string2 = ((Context) this.b.b()).getString(R.string.screen_detection_dialog_body_no_package_name);
        string2.getClass();
        return new wtk(string2, null, null);
    }

    public final wtm e(wtl wtlVar, arqg arqgVar) {
        int addScreenRecordingCallback;
        akrh e = aktp.e("ScreenDetectionHelper.registerDisplayListener");
        try {
            if (!((wti) this.e.b()).c()) {
                wtm k = k(arqgVar);
                armd.i(e, null);
                return k;
            }
            WindowManager j = j();
            if (j == null) {
                wtm wtmVar = new wtm(null, null, 3);
                armd.i(e, null);
                return wtmVar;
            }
            vxb vxbVar = new vxb(this, wtlVar, 13);
            try {
                addScreenRecordingCallback = j.addScreenRecordingCallback(this.i, vxbVar);
                e = aktp.e("ScreenDetectionHelper.onRecordingCallback.initial");
                try {
                    wtlVar.a(h(addScreenRecordingCallback));
                    armd.i(e, null);
                    wtm wtmVar2 = new wtm(null, vxbVar, 1);
                    armd.i(e, null);
                    return wtmVar2;
                } finally {
                }
            } catch (NoSuchMethodException e2) {
                alvw i = a.i();
                i.X(alwp.a, "BugleNotifications");
                ((alvg) ((alvg) i).g(e2).h("com/google/android/apps/messaging/shared/screendetection/ScreenDetectionHelper", "registerRecordingCallbacks$third_party_java_src_android_app_bugle_shared_java_com_google_android_apps_messaging_shared_screendetection_screen_detection_helper_AUTO_DEPS_ORIGINAL", 119, "ScreenDetectionHelper.kt")).q("This API requires V+, but was introduced after initial developer previews, so some users may be on V without access to this API. In this case, fallback to pre-V behavior.");
                wtm k2 = k(arqgVar);
                armd.i(e, null);
                return k2;
            }
        } finally {
        }
    }

    @armg
    public final void f(DisplayManager.DisplayListener displayListener) {
        displayListener.getClass();
        akrh e = aktp.e("ScreenDetectionHelper.unregisterDisplayListener");
        try {
            DisplayManager i = i();
            if (i != null) {
                i.unregisterDisplayListener(displayListener);
            }
            armd.i(e, null);
        } finally {
        }
    }

    public final void g(wtm wtmVar) {
        DisplayManager i;
        WindowManager j;
        wtmVar.getClass();
        akrh e = aktp.e("ScreenDetectionHelper.unregisterDisplayListener");
        try {
            if (wtmVar.b != null && ((wti) this.e.b()).c() && (j = j()) != null) {
                Consumer consumer = wtmVar.b;
                consumer.getClass();
                j.removeScreenRecordingCallback(consumer);
            }
            if (wtmVar.a != null && (i = i()) != null) {
                i.unregisterDisplayListener(wtmVar.a);
            }
            armd.i(e, null);
        } finally {
        }
    }

    public final boolean h(int i) {
        if (i == 1) {
            ((wti) this.e.b()).b();
            return true;
        }
        return false;
    }
}
