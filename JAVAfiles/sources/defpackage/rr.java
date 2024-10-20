package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rr {
    public static final /* synthetic */ int a = 0;
    private static final bzc b = new bxj(cav.a, ry.b);

    public static final ro a(bwj bwjVar) {
        bwjVar.z(-2068013981);
        ro roVar = (ro) bwjVar.g(b);
        bwjVar.z(544164296);
        if (roVar == null) {
            View view = (View) bwjVar.g(AndroidCompositionLocals_androidKt.f);
            view.getClass();
            roVar = (ro) arrn.f(arrn.j(arrn.e(view, rp.b), rp.a));
        }
        bwk bwkVar = (bwk) bwjVar;
        bwkVar.Y();
        if (roVar == null) {
            Object obj = (Context) bwjVar.g(AndroidCompositionLocals_androidKt.b);
            while (true) {
                if (obj instanceof ContextWrapper) {
                    if (obj instanceof ro) {
                        break;
                    }
                    obj = ((ContextWrapper) obj).getBaseContext();
                } else {
                    obj = null;
                    break;
                }
            }
            roVar = (ro) obj;
        }
        bwkVar.Y();
        return roVar;
    }
}
