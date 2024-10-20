package com.google.android.apps.messaging.ui.conversation.message;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.aacm;
import defpackage.aacx;
import defpackage.apwt;
import defpackage.armf;
import defpackage.uuf;
import defpackage.uuh;
import defpackage.xzb;
import defpackage.yai;
import defpackage.zrd;
import defpackage.zrg;
import defpackage.zxp;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationMessageMetadataView extends aacx {
    public static final uuf a = uuh.q(155151230);
    public yai b;
    public apwt c;
    public armf d;
    public final MessageMetadataDetailsView e;
    public final TextView f;
    public final TextView g;
    public final ImageView h;
    public final TextView i;
    public TextView j;
    public boolean k;
    public zxp l;
    private int m;

    public ConversationMessageMetadataView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void a(View view, String str, StringBuilder sb) {
        if (view.getVisibility() == 0) {
            CharSequence contentDescription = view.getContentDescription();
            if (!TextUtils.isEmpty(contentDescription)) {
                sb.append(str);
                sb.append(contentDescription);
            }
        }
    }

    public static void b(View view, int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = i;
        view.setLayoutParams(layoutParams);
    }

    public final void c() {
        if (((Optional) this.c.b()).isEmpty()) {
            return;
        }
        ((Optional) this.d.b()).ifPresent(new zrg(this, 19));
        ((Optional) this.d.b()).ifPresent(new zrg(this, 20));
        ((Optional) this.d.b()).ifPresent(new aacm(this, 1));
    }

    public final void d(boolean z, boolean z2) {
        int i;
        this.k = z;
        this.e.clearAnimation();
        clearAnimation();
        if (this.m == 0) {
            return;
        }
        if (z) {
            i = this.e.getMeasuredHeight();
        } else {
            i = 0;
        }
        xzb.k("Bugle", "Update metadata height to %d", Integer.valueOf(i));
        if (z2) {
            this.b.j(this, i, yai.a(getContext()));
        } else {
            getLayoutParams().height = i;
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0074 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x032f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.rry r20, defpackage.aack r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 1206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.conversation.message.ConversationMessageMetadataView.e(rry, aack, boolean):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l = new zrd(this, 2);
        ((Optional) this.c.b()).ifPresent(new zrg(this, 18));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        ((Optional) this.c.b()).ifPresent(new zrg(this, 17));
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (this.m != size && size > 0) {
            this.m = size;
            this.e.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            d(this.k, false);
        }
        super.onMeasure(i, i2);
    }

    public ConversationMessageMetadataView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = 0;
        this.k = true;
        MessageMetadataDetailsView messageMetadataDetailsView = (MessageMetadataDetailsView) View.inflate(context, R.layout.conversation_message_meta_view, this).findViewById(R.id.message_details);
        this.e = messageMetadataDetailsView;
        this.f = (TextView) messageMetadataDetailsView.findViewById(R.id.sim_name);
        this.g = (TextView) messageMetadataDetailsView.findViewById(R.id.message_status);
        this.h = (ImageView) messageMetadataDetailsView.findViewById(R.id.message_lock_icon);
        this.i = (TextView) messageMetadataDetailsView.findViewById(R.id.link_settings);
    }
}
