package com.google.android.apps.messaging.conversation.settings;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.abbu;
import defpackage.iix;
import defpackage.iyj;
import defpackage.iys;
import defpackage.mho;
import defpackage.xvd;
import defpackage.xyl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BusinessContactActionView extends iys {
    public mho a;
    public abbu b;

    public BusinessContactActionView(Context context) {
        super(context);
    }

    public final void a(xvd xvdVar, String str, String str2, boolean z) {
        iyj iyjVar = (iyj) getTag();
        int i = 8;
        if (iyjVar == null) {
            setVisibility(8);
            xyl.c("Cant't render business contact action: null view holder.");
            return;
        }
        TextView textView = iyjVar.a;
        TextView textView2 = iyjVar.b;
        ImageView imageView = iyjVar.c;
        View view = iyjVar.d;
        View view2 = iyjVar.e;
        textView.setText(str);
        if (xvdVar == null) {
            imageView.setVisibility(4);
        } else {
            imageView.setImageDrawable(xvdVar.f(getContext().getColor(R.color.info_and_options_contact_action_icon_tint_m2)));
            imageView.setVisibility(0);
            if (TextUtils.isEmpty(str2)) {
                str2 = xvdVar.a.getResources().getString(xvdVar.a());
            }
            view2.setContentDescription(xvdVar.g(str2));
        }
        textView2.setText(str2);
        view2.setOnClickListener(new iix(this, xvdVar, 5));
        if (true == z) {
            i = 0;
        }
        view.setVisibility(i);
    }

    public BusinessContactActionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
