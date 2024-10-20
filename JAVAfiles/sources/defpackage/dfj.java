package defpackage;

import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfj {
    public static final void a(dai daiVar) {
        ViewParent parent = daiVar.getParent();
        if (parent == null) {
            return;
        }
        parent.onDescendantInvalidated(daiVar, daiVar);
    }
}
