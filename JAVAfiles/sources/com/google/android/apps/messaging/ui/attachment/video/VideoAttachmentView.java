package com.google.android.apps.messaging.ui.attachment.video;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akec;
import defpackage.akkh;
import defpackage.akkq;
import defpackage.aklg;
import defpackage.aklm;
import defpackage.albo;
import defpackage.apxm;
import defpackage.apxq;
import defpackage.hht;
import defpackage.ish;
import defpackage.yfo;
import defpackage.zpe;
import defpackage.zpf;
import defpackage.zpj;
import defpackage.zpk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VideoAttachmentView extends zpf implements akkh<zpj> {
    public final TypedArray a;
    private zpj b;
    private Context c;

    @Deprecated
    public VideoAttachmentView(Context context) {
        super(context);
        this.a = null;
        e();
    }

    private final zpj d() {
        e();
        return this.b;
    }

    private final void e() {
        if (this.b == null) {
            try {
                this.b = ((zpk) aS()).w();
                TypedArray typedArray = this.a;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                Context context = getContext();
                while ((context instanceof ContextWrapper) && !(context instanceof apxq) && !(context instanceof apxm.a) && !(context instanceof aklm)) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
                if (!(context instanceof aklg)) {
                    throw new IllegalStateException(hht.f(this));
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    @Override // defpackage.akkh
    public final Class C() {
        return zpj.class;
    }

    @Override // defpackage.akkh
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final zpj E() {
        zpj zpjVar = this.b;
        if (zpjVar != null) {
            return zpjVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (akec.n(getContext())) {
            Context o = akec.o(this);
            Context context = this.c;
            if (context == null) {
                this.c = o;
                return;
            }
            boolean z = true;
            if (context != o && !akec.p(context)) {
                z = false;
            }
            albo.U(z, "onAttach called multiple times with different parent Contexts");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zpj d = d();
        ListenableFuture listenableFuture = d.c;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
            d.c = null;
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        e();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredWidth;
        int measuredHeight;
        super.onMeasure(i, i2);
        zpj d = d();
        if (d.i) {
            return;
        }
        if (d.a == null) {
            int measuredWidth2 = d.f.getMeasuredWidth();
            int measuredHeight2 = d.f.getMeasuredHeight();
            float a = yfo.a(measuredWidth2, measuredHeight2, d.d.getResources().getDimensionPixelSize(R.dimen.video_attachment_fallback_width), d.d.getResources().getDimensionPixelSize(R.dimen.video_attachment_fallback_height), d.d.getResources().getDimensionPixelSize(R.dimen.video_attachment_min_size));
            measuredHeight = (int) (measuredHeight2 * a);
            measuredWidth = (int) (measuredWidth2 * a);
            d.f.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        } else {
            measuredWidth = d.f.getMeasuredWidth();
            measuredHeight = d.f.getMeasuredHeight();
        }
        float f = measuredHeight;
        float f2 = measuredWidth;
        float min = Math.min(Math.max(View.MeasureSpec.getSize(i) / f2, View.MeasureSpec.getSize(i2) / f), Math.max(Math.max(1.0f, d.d.getMinimumWidth() / f2), Math.max(1.0f, d.d.getMinimumHeight() / f)));
        d.d.setMeasuredDimension((int) (f2 * min), (int) (f * min));
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        zpj d = d();
        if (!d.h) {
            d.f.setOnLongClickListener(new ish(d, 4));
        }
    }

    public VideoAttachmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = context.obtainStyledAttributes(attributeSet, zpe.a);
    }

    public VideoAttachmentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = context.obtainStyledAttributes(attributeSet, zpe.a, i, 0);
    }

    public VideoAttachmentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = context.obtainStyledAttributes(attributeSet, zpe.a, i, i2);
    }

    public VideoAttachmentView(akkq akkqVar) {
        super(akkqVar);
        this.a = null;
        e();
    }
}
