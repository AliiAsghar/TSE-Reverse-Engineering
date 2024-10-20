package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.libraries.compose.ui.views.RoundedImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agft extends ViewOutlineProvider {
    final /* synthetic */ RoundedImageView a;

    public agft(RoundedImageView roundedImageView) {
        this.a = roundedImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        view.getClass();
        outline.getClass();
        outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), this.a.b);
    }
}
