package com.google.android.apps.messaging.ui.video;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.aapv;
import defpackage.abci;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.amdy;
import defpackage.armf;
import defpackage.rhi;
import defpackage.rhj;
import defpackage.ydk;
import defpackage.zfh;
import defpackage.znj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VideoOverlayView extends abci implements rhi<Long> {
    private static final alvi g = alvi.m("com/google/android/apps/messaging/ui/video/VideoOverlayView");
    public rhj a;
    public int b;
    public Uri c;
    public long d;
    public armf e;
    public zfh f;

    public VideoOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        LayoutInflater.from(context).inflate(R.layout.video_overlay_view, (ViewGroup) this, true);
    }

    @Override // defpackage.rhi
    public final /* bridge */ /* synthetic */ void a(rhj rhjVar, Action action, Object obj, Object obj2) {
        Long l = (Long) obj2;
        if (l == null) {
            f();
            return;
        }
        TextView textView = (TextView) findViewById(R.id.duration);
        if (this.a == rhjVar && textView != null) {
            e(l.longValue());
        } else if (textView != null) {
            alvw d = g.d();
            d.X(alwp.a, "Bugle");
            ((alvg) ((alvg) d).h("com/google/android/apps/messaging/ui/video/VideoOverlayView", "onActionSucceeded", 246, "VideoOverlayView.java")).q("ignoring duration because a newer uri is associated with this view, or the view was destroyed");
            e(0L);
        }
    }

    @Override // defpackage.rhi
    public final /* bridge */ /* synthetic */ void b(rhj rhjVar, Object obj, Object obj2) {
        f();
    }

    public final void e(long j) {
        String D;
        TextView textView = (TextView) findViewById(R.id.duration);
        if (j == 0) {
            D = null;
        } else {
            D = znj.D(j);
        }
        textView.setText(D);
        String string = getContext().getString(R.string.video_attachment_content_description);
        if (j != 0) {
            string = string + " " + ((znj) this.e.b()).C(j);
        }
        textView.setContentDescription(string);
        textView.setClickable(false);
        textView.setImportantForAccessibility(2);
        this.d = j;
    }

    public final void f() {
        alvw g2 = g.g();
        g2.X(alwp.a, "Bugle");
        ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/ui/video/VideoOverlayView", "onActionFailed", 259, "VideoOverlayView.java")).q("failed to get duration for this uri");
        e(0L);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int measuredWidth;
        int i5;
        int paddingTop = getPaddingTop();
        ImageView imageView = (ImageView) findViewById(R.id.icon);
        int measuredHeight = imageView.getMeasuredHeight() + paddingTop;
        TextView textView = (TextView) findViewById(R.id.duration);
        int measuredHeight2 = ((imageView.getMeasuredHeight() / 2) + paddingTop) - (textView.getMeasuredHeight() / 2);
        int measuredHeight3 = textView.getMeasuredHeight() + measuredHeight2;
        int i6 = this.b;
        int i7 = 0;
        if (i6 != 0) {
            if (i6 != 1) {
                imageView.setVisibility(8);
                paddingLeft = getPaddingLeft();
                i5 = textView.getMeasuredWidth() + paddingLeft;
                measuredWidth = 0;
            } else {
                imageView.setVisibility(0);
                i7 = getPaddingLeft();
                paddingLeft = imageView.getMeasuredWidth() + i7 + (getPaddingStart() / 2);
                i5 = paddingLeft + textView.getMeasuredWidth();
                measuredWidth = paddingLeft;
            }
        } else {
            imageView.setVisibility(0);
            paddingLeft = getPaddingLeft();
            i7 = textView.getMeasuredWidth() + paddingLeft + (getPaddingStart() / 2);
            measuredWidth = i7 + imageView.getMeasuredWidth();
            i5 = i7;
        }
        imageView.layout(i7, paddingTop, measuredWidth, measuredHeight);
        textView.layout(paddingLeft, measuredHeight2, i5, measuredHeight3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.video_play_icon_size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, 1073741824);
        View findViewById = findViewById(R.id.icon);
        findViewById.measure(makeMeasureSpec2, makeMeasureSpec2);
        TextView textView = (TextView) findViewById(R.id.duration);
        textView.measure(makeMeasureSpec, makeMeasureSpec);
        findViewById(R.id.icon).measure(i, i2);
        int measuredWidth = textView.getMeasuredWidth();
        if (this.b != 2) {
            measuredWidth = textView.getMeasuredWidth() + findViewById.getMeasuredWidth() + (getPaddingStart() / 2);
        }
        setMeasuredDimension(measuredWidth + getPaddingLeft() + getPaddingRight(), findViewById.getMeasuredHeight() + getPaddingBottom() + getPaddingTop());
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static class GetMediaDurationAction extends Action<Long> {
        public static final Parcelable.Creator<Action<Long>> CREATOR = new aapv(17);
        private final Context a;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public interface a {
            zfh Rf();
        }

        public GetMediaDurationAction(Context context, Uri uri) {
            super(amdy.GET_MEDIA_DURATION_ACTION);
            this.u.v("source_uri", uri.toString());
            this.a = context;
        }

        @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
        public final akrh a() {
            return aktp.e("VideoOverlayView.GetMediaDurationAction");
        }

        @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
        public final /* bridge */ /* synthetic */ Object b() {
            return Long.valueOf(ydk.c(this.a, Uri.parse(this.u.l("source_uri"))));
        }

        @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
        public final String c() {
            return "Bugle.DataModel.Action.GetMediaDurationAction.ExecuteAction.Latency";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C(parcel, i);
        }

        public GetMediaDurationAction(Context context, Parcel parcel) {
            super(parcel, amdy.GET_MEDIA_DURATION_ACTION);
            this.a = context;
        }
    }
}
