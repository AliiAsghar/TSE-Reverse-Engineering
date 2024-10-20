package com.google.android.apps.messaging.ui.conversation.richcard;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.aaej;
import defpackage.aafl;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.armf;
import defpackage.lzv;
import defpackage.mho;
import defpackage.rhi;
import defpackage.rhj;
import defpackage.sdr;
import defpackage.xyl;
import defpackage.xzb;
import defpackage.ydk;
import defpackage.zfh;
import defpackage.znj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RichCardVideoOverlayView extends aaej implements rhi<Long> {
    protected final TextView a;
    public Uri b;
    public mho c;
    public lzv d;
    public armf e;
    public zfh f;
    private rhj g;

    public RichCardVideoOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.rich_card_video_overlay_view, this);
        onFinishInflate();
        this.a = (TextView) findViewById(R.id.duration);
        setOnClickListener(new aafl(this, 1));
    }

    @Override // defpackage.rhi
    public final /* bridge */ /* synthetic */ void a(rhj rhjVar, Action action, Object obj, Object obj2) {
        Long l = (Long) obj2;
        long j = 0;
        if (this.g == rhjVar && this.a != null) {
            if (l != null) {
                j = l.longValue();
            }
            e(j);
        } else if (this.a != null) {
            xzb.c("BugleRbmRichCard", "ignoring duration because a newer uri is associated with this view, or the view was destroyed");
            e(0L);
        }
    }

    @Override // defpackage.rhi
    public final /* bridge */ /* synthetic */ void b(rhj rhjVar, Object obj, Object obj2) {
        xzb.j("Bugle", "failed to get duration for this uri");
        e(0L);
    }

    public final void e(long j) {
        String D;
        if (j == 0) {
            D = null;
        } else {
            D = znj.D(j);
        }
        this.a.setText(D);
        String string = getContext().getString(R.string.video_attachment_content_description);
        if (j != 0) {
            string = string + " " + ((znj) this.e.b()).C(j);
        }
        this.a.setContentDescription(string);
        this.a.requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    public final void f(Uri uri) {
        xyl.g();
        Uri uri2 = this.b;
        if (uri2 != null && uri2.equals(uri)) {
            return;
        }
        this.b = uri;
        if (uri == null) {
            e(0L);
            return;
        }
        Context context = (Context) this.f.a.b();
        context.getClass();
        this.g = new GetMediaDurationAction(context, uri).p(this);
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static class GetMediaDurationAction extends Action<Long> {
        public static final Parcelable.Creator<Action<Long>> CREATOR = new sdr(19);
        private final Context a;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public interface a {
            zfh Qu();
        }

        public GetMediaDurationAction(Context context, Uri uri) {
            super(amdy.RBM_GET_MEDIA_DURATION_ACTION);
            this.u.v("source_uri", uri.toString());
            this.a = context;
        }

        @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
        public final akrh a() {
            return aktp.e("GetMediaDurationAction");
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
            super(parcel, amdy.RBM_GET_MEDIA_DURATION_ACTION);
            this.a = context;
        }
    }
}
