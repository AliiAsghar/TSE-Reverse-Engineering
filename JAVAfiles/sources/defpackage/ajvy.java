package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.setupcompat.internal.TemplateLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajvy implements ajvf {
    public final TemplateLayout a;
    private final int b;
    private final ImageView.ScaleType c;
    private final Context d;

    public ajvy(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        ImageView b;
        ImageView.ScaleType scaleType;
        ImageView b2;
        this.a = templateLayout;
        Context context = templateLayout.getContext();
        this.d = context;
        ImageView b3 = b();
        if (b3 != null) {
            this.b = b3.getLayoutParams().height;
            this.c = b3.getScaleType();
        } else {
            this.b = 0;
            this.c = null;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ajvp.h, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0 && (b2 = b()) != null) {
            b2.setImageResource(resourceId);
            b2.setVisibility(0);
            int visibility = b2.getVisibility();
            if (a() != null) {
                a().setVisibility(visibility);
            }
        }
        boolean z = obtainStyledAttributes.getBoolean(2, false);
        ImageView b4 = b();
        if (b4 != null) {
            ViewGroup.LayoutParams layoutParams = b4.getLayoutParams();
            layoutParams.height = z ? b4.getMaxHeight() : this.b;
            b4.setLayoutParams(layoutParams);
            if (z) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            } else {
                scaleType = this.c;
            }
            b4.setScaleType(scaleType);
        }
        int color = obtainStyledAttributes.getColor(1, 0);
        if (color != 0 && (b = b()) != null) {
            b.setColorFilter(color);
        }
        obtainStyledAttributes.recycle();
    }

    public final FrameLayout a() {
        return (FrameLayout) this.a.g(R.id.sud_layout_icon_container);
    }

    public final ImageView b() {
        return (ImageView) this.a.g(R.id.sud_layout_icon);
    }
}
