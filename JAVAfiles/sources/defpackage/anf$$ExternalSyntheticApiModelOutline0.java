package defpackage;

import android.app.ApplicationExitInfo;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.telephony.ims.ImsException;
import android.telephony.ims.ImsManager;
import android.telephony.ims.RcsUceAdapter;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowMetrics;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class anf$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ int m() {
        return WindowInsets.Type.ime();
    }

    /* renamed from: m$2 */
    public static /* bridge */ /* synthetic */ Class m87m$2() {
        return ImsException.class;
    }

    /* renamed from: m$1 */
    public static /* bridge */ /* synthetic */ Class m84m$1() {
        return WindowMetrics.class;
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo m(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ ImsException m68m(Object obj) {
        return (ImsException) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ ImsManager m69m(Object obj) {
        return (ImsManager) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ RcsUceAdapter m70m(Object obj) {
        return (RcsUceAdapter) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ WindowInsetsAnimation m73m(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ Class m77m() {
        return ImsManager.class;
    }

    public static /* bridge */ /* synthetic */ boolean m(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.quickReject(f, f2, f3, f4);
    }

    public static /* bridge */ /* synthetic */ boolean m(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public static /* bridge */ /* synthetic */ boolean m(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }
}
