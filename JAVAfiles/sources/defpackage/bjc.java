package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjc {
    private static final boolean a = d.F(Build.DEVICE, "layoutlib");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewParent] */
    public static final ViewGroup a(View view) {
        while (!(view instanceof ViewGroup)) {
            ?? parent = view.getParent();
            if (parent instanceof View) {
                view = parent;
            } else {
                throw new IllegalArgumentException(a.cc(view, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"));
            }
        }
        return (ViewGroup) view;
    }

    public static final bis b(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof bis) {
                return (bis) childAt;
            }
        }
        bis bisVar = new bis(viewGroup.getContext());
        viewGroup.addView(bisVar);
        return bisVar;
    }

    public static final cwo c(ajq ajqVar, boolean z, float f, ckx ckxVar, arqg arqgVar) {
        if (a) {
            return new bij(ajqVar, z, f, ckxVar, arqgVar);
        }
        return new bii(ajqVar, z, f, ckxVar, arqgVar);
    }
}
