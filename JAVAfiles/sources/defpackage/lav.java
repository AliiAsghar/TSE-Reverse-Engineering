package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lav extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float f;
        int width = view.getWidth();
        int height = view.getHeight();
        float min = Math.min(1.0f, Math.abs(view.getTranslationX()) / (view.getWidth() / 3.0f)) * 10.0f * view.getContext().getResources().getDisplayMetrics().density;
        if (min < 1.0f) {
            f = 0.0f;
        } else {
            f = min;
        }
        outline.setRoundRect(0, 0, width, height, f);
    }
}
