package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import com.google.android.libraries.compose.ui.keyboard.detector.KeyboardDetectorViewInsetsListener;
import com.google.android.libraries.compose.ui.rendering.container.RendererContainer;
import java.util.Map;
import java.util.logging.FileHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aefw implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aefw(agai agaiVar, int i) {
        this.b = i;
        this.a = agaiVar;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, aglh] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, aglh] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.b) {
            case 0:
                try {
                    Thread.sleep(Math.max(0L, 600000L));
                } catch (InterruptedException e) {
                    Log.e("AppDoctorRestartUtil", "Interrupted. Killing processes now.", e);
                    Thread.currentThread().interrupt();
                }
                aefx.a((Context) this.a);
                aefx.b();
                return;
            case 1:
                FileHandler fileHandler = ((advt) this.a).a;
                if (fileHandler != null) {
                    fileHandler.close();
                    return;
                }
                return;
            case 2:
                ((aehw) this.a).a();
                return;
            case 3:
                Process.setThreadPriority(-16);
                this.a.run();
                return;
            case 4:
                ((RecyclerView) this.a).requestLayout();
                return;
            case 5:
                ((RecyclerView) this.a).requestLayout();
                return;
            case 6:
                int i = afvp.c;
                this.a.a();
                return;
            case 7:
                cg cgVar = (cg) this.a;
                if (cgVar.aw() && (view = cgVar.Q) != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 8:
                int i2 = KeyboardDetectorViewInsetsListener.e;
                this.a.a();
                return;
            case 9:
                ((RendererContainer) this.a).b = null;
                return;
            case 10:
                this.a.c();
                return;
            case 11:
                if (Build.VERSION.SDK_INT < 31) {
                    Binder.flushPendingCommands();
                }
                this.a.b();
                return;
            case 12:
                agkg.d();
                this.a.run();
                return;
            case 13:
                ((agjs) this.a).a.cancel(false);
                return;
            case 14:
                int i3 = agkg.a;
                throw ((Throwable) this.a);
            case 15:
                throw ((Throwable) this.a);
            case 16:
                throw ((Throwable) this.a);
            case 17:
                ((agmp) this.a).close();
                return;
            case 18:
                ((agmp) this.a).close();
                return;
            case 19:
                ((Map) agoz.a.get()).remove(this.a);
                return;
            default:
                agnw p = ((agoz) this.a).p();
                agni agniVar = new agni("add-change-listener");
                abnl abnlVar = new abnl(6);
                ajpj a = agnv.a();
                a.d(true);
                return;
        }
    }

    public /* synthetic */ aefw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
