package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abbl implements View.OnApplyWindowInsetsListener {
    private final abbk a;

    public abbl(abbk abbkVar) {
        this.a = abbkVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        this.a.a(view, windowInsets);
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup.getChildAt(i).dispatchApplyWindowInsets(windowInsets);
        }
        return windowInsets;
    }
}
