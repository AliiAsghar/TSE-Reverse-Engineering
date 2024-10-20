package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ng extends nd implements ne {
    public static Method a;
    public ne b;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                a = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public ng(Context context, int i) {
        super(context, null, i, null);
    }

    @Override // defpackage.nd
    public final mh p(Context context, boolean z) {
        nf nfVar = new nf(context, z);
        nfVar.e = this;
        return nfVar;
    }
}
