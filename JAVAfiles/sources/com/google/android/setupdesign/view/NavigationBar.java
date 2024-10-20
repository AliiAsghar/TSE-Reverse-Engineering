package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class NavigationBar extends LinearLayout implements View.OnClickListener {
    public NavigationBar(Context context) {
        super(a(context));
        b();
    }

    private static Context a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.sudNavBarTheme, android.R.attr.colorForeground, android.R.attr.colorBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId == 0) {
            float[] fArr = new float[3];
            float[] fArr2 = new float[3];
            Color.colorToHSV(obtainStyledAttributes.getColor(1, 0), fArr);
            Color.colorToHSV(obtainStyledAttributes.getColor(2, 0), fArr2);
            if (fArr[2] > fArr2[2]) {
                resourceId = R.style.SudNavBarThemeDark;
            } else {
                resourceId = R.style.SudNavBarThemeLight;
            }
        }
        obtainStyledAttributes.recycle();
        return new ContextThemeWrapper(context, resourceId);
    }

    private final void b() {
        if (isInEditMode()) {
            return;
        }
        View.inflate(getContext(), R.layout.sud_navbar_view, this);
    }

    public NavigationBar(Context context, AttributeSet attributeSet) {
        super(a(context), attributeSet);
        b();
    }

    public NavigationBar(Context context, AttributeSet attributeSet, int i) {
        super(a(context), attributeSet, i);
        b();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }
}
