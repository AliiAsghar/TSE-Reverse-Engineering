package com.google.android.libraries.compose.proxy.ui.search;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.afwl;
import defpackage.afwm;
import defpackage.ajig;
import defpackage.ajnr;
import defpackage.arro;
import defpackage.kn;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class SearchBarView extends kn {
    private Rect a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchBarView(Context context) {
        this(context, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.openSearchBarStyle);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarView(Context context, AttributeSet attributeSet, int i) {
        super(ajnr.a(context, attributeSet, i, 0), attributeSet, i);
        context.getClass();
        float dimension = getResources().getDimension(R.dimen.google_opensearchbar_radius);
        TypedArray a = ajig.a(context, attributeSet, afwl.a, i, 0, new int[0]);
        int resourceId = a.getResourceId(0, -1);
        String string = a.getString(1);
        String string2 = a.getString(2);
        a.recycle();
        if (resourceId != -1) {
            setTextAppearance(resourceId);
        }
        setText(string);
        setHint(string2);
        setClickable(true);
        setFocusable(true);
        setClipToOutline(true);
        float elevation = getElevation() * 0.8f;
        float elevation2 = getElevation() * 0.5f;
        Rect rect = null;
        if (this.a == null) {
            Rect rect2 = new Rect();
            Drawable background = getBackground();
            InsetDrawable insetDrawable = background instanceof InsetDrawable ? (InsetDrawable) background : null;
            if (insetDrawable != null) {
                insetDrawable.getPadding(rect2);
            }
            this.a = rect2;
        }
        Rect rect3 = this.a;
        if (rect3 == null) {
            arro.b("backgroundInsets");
        } else {
            rect = rect3;
        }
        setOutlineProvider(new afwm((int) elevation2, rect, (int) elevation, dimension));
    }
}
