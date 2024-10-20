package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iaw {
    public static final long a = ckw.j(brg.a, brg.a, brg.a, 0.3f, null, 16);
    public static final arqr b = gvj.d;

    @armg
    public static final kkc a(bwj bwjVar) {
        dtf dtfVar;
        Window window;
        bwjVar.y(-715745933);
        bwjVar.y(1009281237);
        ViewParent parent = ((View) bwjVar.g(AndroidCompositionLocals_androidKt.f)).getParent();
        Window window2 = null;
        if (parent instanceof dtf) {
            dtfVar = (dtf) parent;
        } else {
            dtfVar = null;
        }
        if (dtfVar != null) {
            window = dtfVar.a();
        } else {
            window = null;
        }
        if (window == null) {
            Context context = ((View) bwjVar.g(AndroidCompositionLocals_androidKt.f)).getContext();
            context.getClass();
            while (true) {
                if (context instanceof Activity) {
                    window2 = ((Activity) context).getWindow();
                    break;
                }
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
                context.getClass();
            }
        } else {
            window2 = window;
        }
        bwk bwkVar = (bwk) bwjVar;
        bwkVar.Y();
        View view = (View) bwjVar.g(AndroidCompositionLocals_androidKt.f);
        bwjVar.y(1969318995);
        boolean G = bwjVar.G(window2) | bwjVar.G(view);
        Object T = bwkVar.T();
        if (G || T == bwj.a.a) {
            T = new kkc(view, window2);
            bwkVar.ad(T);
        }
        kkc kkcVar = (kkc) T;
        bwkVar.Y();
        bwkVar.Y();
        return kkcVar;
    }
}
