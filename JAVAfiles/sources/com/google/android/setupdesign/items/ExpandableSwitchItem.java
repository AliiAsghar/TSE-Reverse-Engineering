package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import com.google.android.apps.messaging.R;
import defpackage.ajvp;
import defpackage.ajvr;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ExpandableSwitchItem extends SwitchItem implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    public boolean a;

    public ExpandableSwitchItem() {
        this.a = false;
        new ajvr(this);
    }

    @Override // com.google.android.setupdesign.items.SwitchItem, com.google.android.setupdesign.items.Item
    protected final int b() {
        return R.layout.sud_items_expandable_switch;
    }

    public final void c(boolean z) {
        if (this.a == z) {
            return;
        }
        this.a = z;
        a(0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c(!this.a);
    }

    public ExpandableSwitchItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
        new ajvr(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ajvp.d);
        obtainStyledAttributes.getText(0);
        obtainStyledAttributes.getText(1);
        obtainStyledAttributes.getInt(7, 48);
        obtainStyledAttributes.recycle();
    }
}
