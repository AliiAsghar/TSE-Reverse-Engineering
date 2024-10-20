package com.google.android.apps.messaging.ui.conversation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.aabr;
import defpackage.aadb;
import defpackage.aadd;
import defpackage.abbj;
import defpackage.abcp;
import defpackage.alhr;
import defpackage.armf;
import defpackage.rry;
import defpackage.uac;
import defpackage.utz;
import defpackage.uuh;
import defpackage.wfh;
import defpackage.xyt;
import defpackage.ytk;
import defpackage.zmr;
import defpackage.znj;
import defpackage.zoz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MessageMetadataDetailsView extends aadb {
    static final utz a = uuh.r(159443725, "add_status_for_missing_attachments");
    static final alhr b = uuh.w("remove_text_via_from_sim_name");
    public static final /* synthetic */ int t = 0;
    public abcp c;
    public xyt d;
    public ytk e;
    public armf f;
    public abbj g;
    public armf h;
    public final TextView i;
    public boolean j;
    public final TextView k;
    public final ImageView l;
    public final TextView m;
    public boolean n;
    public rry o;
    public final zmr p;
    public uac q;
    public wfh r;
    public znj s;
    private final aadd u;

    @Deprecated
    private final ImageView v;
    private final ImageView w;

    public MessageMetadataDetailsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final boolean c() {
        if (((Boolean) ytk.c.e()).booleanValue() && this.o.z().b()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean A = this.r.A();
        boolean z2 = this.n;
        int paddingLeft = getPaddingLeft();
        int paddingBottom = getPaddingBottom();
        int paddingTop = getPaddingTop();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.sim_label_padding_end);
        aadd aaddVar = this.u;
        aaddVar.c = A;
        aaddVar.d = z2;
        aaddVar.e = i3 - i;
        aaddVar.j = paddingLeft;
        aaddVar.l = paddingBottom;
        aaddVar.k = paddingTop;
        aaddVar.f = paddingLeft;
        aaddVar.g = paddingTop;
        aaddVar.h = 0;
        aaddVar.i = 0;
        aaddVar.m = dimensionPixelSize;
        if (A) {
            aaddVar.c();
            if (aaddVar.i == 0) {
                aaddVar.i = aaddVar.a.getBaseline();
            }
            aaddVar.b();
            aaddVar.d();
            aaddVar.a();
            aaddVar.e();
        } else {
            aaddVar.e();
            aaddVar.a();
            aaddVar.d();
            aaddVar.b();
            aaddVar.c();
        }
        if (aaddVar.b.getVisibility() != 8) {
            int measuredWidth = aaddVar.b.getMeasuredWidth();
            int measuredHeight = aaddVar.b.getMeasuredHeight();
            if (aaddVar.c) {
                aaddVar.h = Math.max(aaddVar.h, aaddVar.a.getMeasuredHeight());
            }
            int i5 = aaddVar.j;
            aaddVar.f = i5;
            int i6 = aaddVar.g + aaddVar.h;
            aaddVar.g = i6;
            aaddVar.b.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
        this.n = aaddVar.d;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int makeMeasureSpec;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
        int i10 = 0;
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        if (this.v.getVisibility() != 8) {
            this.v.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
            i3 = this.v.getMeasuredWidth();
        } else {
            i3 = 0;
        }
        if (this.w.getVisibility() != 8) {
            this.w.measure(View.MeasureSpec.makeMeasureSpec(size - i3, Integer.MIN_VALUE), makeMeasureSpec);
            i4 = this.w.getMeasuredWidth();
        } else {
            i4 = 0;
        }
        if (this.l.getVisibility() != 8) {
            this.l.measure(View.MeasureSpec.makeMeasureSpec((size - i3) - i4, Integer.MIN_VALUE), makeMeasureSpec);
            i5 = this.l.getMeasuredWidth();
        } else {
            i5 = 0;
        }
        if (this.k.getVisibility() != 8) {
            i6 = aabr.v(this.k, View.MeasureSpec.makeMeasureSpec(((size - i3) - i4) - i5, Integer.MIN_VALUE), makeMeasureSpec);
            i7 = this.k.getMeasuredWidth();
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (this.i.getVisibility() != 8) {
            i8 = aabr.v(this.i, View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
            i10 = this.i.getMeasuredWidth();
        } else {
            i8 = 0;
        }
        int i11 = i7 + i3;
        int i12 = i11 + i10 + i5 + i4;
        if (i12 <= size && !this.n) {
            i9 = Math.max(Math.max(Math.max(i6, i8), this.v.getMeasuredHeight()), this.v.getMeasuredHeight());
        } else {
            i12 = Math.max(i11 + i5 + i4, i10);
            i9 = i6 + i8;
            this.i.setText(this.i.getText().toString().replaceFirst(getResources().getString(R.string.message_metadata_separator), ""));
            this.n = true;
        }
        if (this.m.getVisibility() != 8) {
            int v = aabr.v(this.m, View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
            i12 = Math.max(i12, this.m.getMeasuredWidth());
            i9 = Math.max(i9, v + i9);
        }
        setMeasuredDimension(i12, i9);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            return true;
        }
        if (motionEvent.getAction() == 1) {
            return performClick();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (c()) {
            this.g.c(getContext(), this.o);
            return true;
        }
        return super.performClick();
    }

    public MessageMetadataDetailsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = false;
        this.n = false;
        MessageMetadataDetailsView messageMetadataDetailsView = (MessageMetadataDetailsView) View.inflate(context, R.layout.conversation_message_meta_detail_view, this);
        TextView textView = (TextView) messageMetadataDetailsView.findViewById(R.id.sim_name);
        this.i = textView;
        ImageView imageView = (ImageView) messageMetadataDetailsView.findViewById(R.id.dots_animation);
        this.v = imageView;
        TextView textView2 = (TextView) messageMetadataDetailsView.findViewById(R.id.message_status);
        this.k = textView2;
        ImageView imageView2 = (ImageView) messageMetadataDetailsView.findViewById(R.id.message_lock_icon);
        this.l = imageView2;
        TextView textView3 = (TextView) messageMetadataDetailsView.findViewById(R.id.link_settings);
        this.m = textView3;
        ImageView imageView3 = (ImageView) messageMetadataDetailsView.findViewById(R.id.status_icon);
        this.w = imageView3;
        this.p = new zmr(imageView3);
        textView3.setOnClickListener(new zoz(this, context, 4));
        this.u = new aadd(textView, imageView, textView2, imageView2, textView3, imageView3);
    }
}
