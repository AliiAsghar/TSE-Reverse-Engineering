package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import defpackage.ajhx;
import defpackage.ajhy;
import defpackage.ecl;
import defpackage.eek;
import defpackage.im;
import defpackage.iw;
import defpackage.mt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class NavigationMenuItemView extends ajhx implements iw {
    private static final int[] e = {R.attr.state_checked};
    public boolean c;
    boolean d;
    private int f;
    private final CheckedTextView g;
    private FrameLayout h;
    private im i;
    private final ecl j;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    @Override // defpackage.iw
    public final im a() {
        return this.i;
    }

    @Override // defpackage.iw
    public final boolean e() {
        return false;
    }

    @Override // defpackage.iw
    public final void f(im imVar) {
        int i;
        StateListDrawable stateListDrawable;
        this.i = imVar;
        int i2 = imVar.a;
        if (i2 > 0) {
            setId(i2);
        }
        int i3 = 1;
        if (true != imVar.isVisible()) {
            i = 8;
        } else {
            i = 0;
        }
        setVisibility(i);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.google.android.apps.messaging.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(e, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        boolean isCheckable = imVar.isCheckable();
        refreshDrawableState();
        if (this.c != isCheckable) {
            this.c = isCheckable;
            this.j.e(this.g, 2048);
        }
        boolean isChecked = imVar.isChecked();
        refreshDrawableState();
        this.g.setChecked(isChecked);
        CheckedTextView checkedTextView = this.g;
        Typeface typeface = checkedTextView.getTypeface();
        if (!isChecked || !this.d) {
            i3 = 0;
        }
        checkedTextView.setTypeface(typeface, i3);
        setEnabled(imVar.isEnabled());
        this.g.setText(imVar.d);
        Drawable icon = imVar.getIcon();
        if (icon != null) {
            int i4 = this.f;
            icon.setBounds(0, 0, i4, i4);
        }
        this.g.setCompoundDrawablesRelative(icon, null, null, null);
        View actionView = imVar.getActionView();
        if (actionView != null) {
            if (this.h == null) {
                this.h = (FrameLayout) ((ViewStub) findViewById(com.google.android.apps.messaging.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (actionView.getParent() != null) {
                ((ViewGroup) actionView.getParent()).removeView(actionView);
            }
            this.h.removeAllViews();
            this.h.addView(actionView);
        }
        setContentDescription(imVar.l);
        setTooltipText(imVar.m);
        im imVar2 = this.i;
        if (imVar2.d == null && imVar2.getIcon() == null && this.i.getActionView() != null) {
            this.g.setVisibility(8);
            FrameLayout frameLayout = this.h;
            if (frameLayout != null) {
                mt mtVar = (mt) frameLayout.getLayoutParams();
                mtVar.width = -1;
                this.h.setLayoutParams(mtVar);
                return;
            }
            return;
        }
        this.g.setVisibility(0);
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            mt mtVar2 = (mt) frameLayout2.getLayoutParams();
            mtVar2.width = -2;
            this.h.setLayoutParams(mtVar2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        im imVar = this.i;
        if (imVar != null && imVar.isCheckable() && imVar.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, e);
        }
        return onCreateDrawableState;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
        ajhy ajhyVar = new ajhy(this);
        this.j = ajhyVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.google.android.apps.messaging.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.f = context.getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.google.android.apps.messaging.R.id.design_menu_item_text);
        this.g = checkedTextView;
        eek.n(checkedTextView, ajhyVar);
    }
}
