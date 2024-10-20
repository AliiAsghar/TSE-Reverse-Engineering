package com.google.android.apps.messaging.ui.rcs.setup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.aaxc;
import defpackage.aaym;
import defpackage.aayo;
import defpackage.armf;
import defpackage.mho;
import defpackage.yjy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RcsPromoView extends aaym {
    public yjy a;
    public armf b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public ImageView g;
    public aayo h;

    public RcsPromoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.e = (TextView) findViewById(R.id.rcs_promo_title);
        this.f = (TextView) findViewById(R.id.rcs_promo_subtitle);
        TextView textView = (TextView) findViewById(R.id.conversation_list_rcs_promo_positive_button);
        this.c = textView;
        textView.setOnClickListener(new aaxc(this, 8));
        TextView textView2 = (TextView) findViewById(R.id.conversation_list_rcs_promo_negative_button);
        this.d = textView2;
        textView2.setOnClickListener(new aaxc(this, 9));
        this.g = (ImageView) findViewById(R.id.rcs_promo_icon);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            ((mho) this.b.b()).aS(12);
        }
    }
}
