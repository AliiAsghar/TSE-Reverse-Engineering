package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.ui.AsyncImageView;
import com.google.android.apps.messaging.shared.ui.RoundedImageView;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class xus extends xuq implements xun {
    public RoundedImageView a;
    protected boolean b;
    protected int c;
    protected int d;
    protected boolean e;
    protected akms f;
    public anen g;
    public apwt h;
    public armf i;
    public yyb j;
    private ListenableFuture k;

    public xus(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
        this.j = null;
    }

    public static akms f(akms akmsVar, Uri uri, Point point, MessagePartCoreData messagePartCoreData) {
        akms L = akmsVar.h(uri).L(point.x, point.y);
        if (uri != null && ydk.y(uri) && messagePartCoreData.Z() != null) {
            return L.P(new hyf(messagePartCoreData.Z()));
        }
        return L;
    }

    private final akms i() {
        akms o = aktp.y(this).c().o(huz.b());
        if (xyp.j()) {
            return (akms) o.O(hvm.b, true);
        }
        return o;
    }

    private final void j() {
        ListenableFuture listenableFuture = this.k;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
            this.k = null;
        }
    }

    @Override // defpackage.xun
    public final void c() {
        this.a.setImageDrawable(null);
    }

    @Override // defpackage.xul
    public final void d(boolean z, rry rryVar, Drawable drawable, float[] fArr) {
        setSelected(z);
        if (z) {
            this.a.setColorFilter(this.d);
        } else {
            this.a.clearColorFilter();
        }
        this.a.r(fArr);
    }

    public final akms e(akms akmsVar) {
        return akmsVar.a(new zpi(this, 1));
    }

    @Override // defpackage.xun
    public final void g(MessagePartCoreData messagePartCoreData, boolean z, int i) {
        Uri t;
        if (messagePartCoreData.bf() && this.e) {
            setGravity(17);
            this.a.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        if (this.f != null) {
            int minimumHeight = this.a.getMinimumHeight();
            int maxHeight = this.a.getMaxHeight();
            int maxWidth = this.a.getMaxWidth();
            Point point = new Point(messagePartCoreData.c(), messagePartCoreData.b());
            yfo.j(point, maxWidth, maxHeight, minimumHeight);
            if (messagePartCoreData.x() != null) {
                t = messagePartCoreData.x();
            } else {
                t = messagePartCoreData.t();
            }
            if (messagePartCoreData.v() != null) {
                akms d = f(this.f, messagePartCoreData.v(), point, messagePartCoreData).a(new xur()).d(f(i(), t, point, messagePartCoreData));
                this.f = d;
                akms e = e(d);
                this.f = e;
                e.t(this.a);
            } else if (t != null) {
                akms f = f(this.f, t, point, messagePartCoreData);
                this.f = f;
                akms e2 = e(f);
                this.f = e2;
                e2.t(this.a);
            }
        } else if (this.j != null) {
            RoundedImageView roundedImageView = this.a;
            if (roundedImageView instanceof AsyncImageView) {
                AsyncImageView asyncImageView = (AsyncImageView) roundedImageView;
                int q = asyncImageView.q();
                int p = asyncImageView.p();
                this.j.getClass();
                utz utzVar = xum.a;
                Uri t2 = messagePartCoreData.t();
                if (t2 == null) {
                    t2 = messagePartCoreData.x();
                }
                Uri uri = t2;
                ugi ugiVar = null;
                r4 = null;
                String str = null;
                if (gh.m(messagePartCoreData.U())) {
                    alvi alviVar = ydk.a;
                    if (uri != null && ydk.u(uri)) {
                        str = uri.getPath();
                    }
                    if (str != null) {
                        ugiVar = new ufp(str, q, p, messagePartCoreData.c(), messagePartCoreData.b());
                    } else {
                        ugiVar = new ugi(uri, q, p, messagePartCoreData.c(), messagePartCoreData.b(), true, false, false, 0);
                    }
                }
                asyncImageView.d(ugiVar);
            }
        }
        String T = messagePartCoreData.T();
        if (!TextUtils.isEmpty(T)) {
            this.a.setContentDescription(T);
        } else {
            this.a.setContentDescription(getResources().getString(R.string.message_image_content_description));
        }
        String W = messagePartCoreData.W();
        if (W != null && xwr.h(getContext())) {
            RoundedImageView roundedImageView2 = this.a;
            j();
            ListenableFuture d2 = ((aiqj) this.h.b()).d(W);
            this.k = d2;
            aktp.aa(d2, new ydv(new xpw(roundedImageView2, 13), new xpw(W, 14), 0), this.g);
        }
        if (i == 1) {
            h(this.a, messagePartCoreData);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f = i();
        int i = this.c;
        if (i >= 0) {
            this.a.u = i;
        }
        if (this.b) {
            this.a.getLayoutParams().width = -1;
            this.a.getLayoutParams().height = -1;
            this.a.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.a.setOnLongClickListener(onLongClickListener);
    }

    protected void h(RoundedImageView roundedImageView, MessagePartCoreData messagePartCoreData) {
    }
}
