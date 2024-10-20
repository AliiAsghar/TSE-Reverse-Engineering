package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class kq extends PopupWindow {
    public kq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        ktk A = ktk.A(context, attributeSet, gc.t, i, 0);
        if (A.v(2)) {
            setOverlapAnchor(A.u(2, false));
        }
        setBackgroundDrawable(A.p(0));
        A.t();
    }
}
