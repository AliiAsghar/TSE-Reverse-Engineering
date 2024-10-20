package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsh {
    public static final Rect a(cin cinVar, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        cjp d = cinVar.d();
        if (d == null) {
            return null;
        }
        int i = iArr[0];
        int i2 = ((int) d.b) + i;
        int i3 = iArr2[0];
        int i4 = iArr[1];
        int i5 = ((int) d.c) + i4;
        int i6 = iArr2[1];
        return new Rect(i2 - i3, i5 - i6, (((int) d.d) + i) - i3, (((int) d.e) + i4) - i6);
    }

    public static final View b(cga.c cVar) {
        View view;
        drx drxVar = cwp.e(cVar.p).m;
        if (drxVar != null) {
            view = drxVar.c;
        } else {
            view = null;
        }
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    public static final boolean c(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }
}
