package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.brg;
import defpackage.egl;
import defpackage.grn;
import defpackage.haw;
import defpackage.hay;
import defpackage.haz;
import defpackage.hba;
import defpackage.hbb;
import defpackage.hbf;
import defpackage.hbl;
import defpackage.hbn;
import defpackage.hbp;
import defpackage.hbq;
import defpackage.hbt;
import defpackage.hbv;
import defpackage.hbw;
import defpackage.hef;
import defpackage.heg;
import defpackage.heo;
import defpackage.hid;
import defpackage.hig;
import defpackage.hii;
import defpackage.ijt;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.net.ssl.SSLException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final hbn a = new hbn() { // from class: hax
        @Override // defpackage.hbn
        public final void a(Object obj) {
            Throwable th = (Throwable) obj;
            hbn hbnVar = LottieAnimationView.a;
            ThreadLocal threadLocal = hid.a;
            if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
                throw new IllegalStateException("Unable to parse composition", th);
            }
            hhw.b("Unable to load composition.", th);
        }
    };
    public int b;
    public final hbl c;
    public boolean d;
    private final hbn e;
    private final hbn f;
    private String g;
    private int h;
    private boolean i;
    private boolean j;
    private final Set k;
    private final Set l;
    private hbt m;

    public LottieAnimationView(Context context) {
        super(context);
        this.e = new hef(this, 1);
        this.f = new heg(this, 1);
        this.b = 0;
        this.c = new hbl();
        this.i = false;
        this.j = false;
        this.d = true;
        this.k = new HashSet();
        this.l = new HashSet();
        m(null, R.attr.lottieAnimationViewStyle);
    }

    private final void l() {
        hbt hbtVar = this.m;
        if (hbtVar != null) {
            hbtVar.g(this.e);
            this.m.f(this.f);
        }
    }

    private final void m(AttributeSet attributeSet, int i) {
        String string;
        hbt j;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, hbv.a, i, 0);
        this.d = obtainStyledAttributes.getBoolean(1, true);
        boolean hasValue = obtainStyledAttributes.hasValue(12);
        boolean hasValue2 = obtainStyledAttributes.hasValue(7);
        boolean hasValue3 = obtainStyledAttributes.hasValue(17);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(12, 0);
            if (resourceId != 0) {
                d(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(7);
            if (string2 != null) {
                e(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(17)) != null) {
            if (this.d) {
                j = hbf.j(getContext(), string, "url_".concat(string));
            } else {
                j = hbf.j(getContext(), string, null);
            }
            n(j);
        }
        this.b = obtainStyledAttributes.getResourceId(6, 0);
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.j = true;
        }
        if (obtainStyledAttributes.getBoolean(10, false)) {
            this.c.p(-1);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            j(obtainStyledAttributes.getInt(15, 1));
        }
        if (obtainStyledAttributes.hasValue(14)) {
            i(obtainStyledAttributes.getInt(14, -1));
        }
        if (obtainStyledAttributes.hasValue(16)) {
            this.c.b.c = obtainStyledAttributes.getFloat(16, 1.0f);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            this.c.m(obtainStyledAttributes.getBoolean(2, true));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            String string3 = obtainStyledAttributes.getString(4);
            hbl hblVar = this.c;
            hblVar.h = string3;
            grn t = hblVar.t();
            if (t != null) {
                t.e = string3;
            }
        }
        g(obtainStyledAttributes.getString(9));
        h(obtainStyledAttributes.getFloat(11, brg.a), obtainStyledAttributes.hasValue(11));
        this.c.h(obtainStyledAttributes.getBoolean(5, false));
        if (obtainStyledAttributes.hasValue(3)) {
            this.c.f(new heo("**"), hbq.K, new hig(new hbw(egl.f(getContext(), obtainStyledAttributes.getResourceId(3, -1)).getDefaultColor())));
        }
        if (obtainStyledAttributes.hasValue(13)) {
            int i2 = obtainStyledAttributes.getInt(13, 0);
            a.ac();
            if (i2 >= 3) {
                i2 = 0;
            }
            this.c.s(a.ac()[i2]);
        }
        this.c.d = obtainStyledAttributes.getBoolean(8, false);
        if (obtainStyledAttributes.hasValue(18)) {
            this.c.b.l = obtainStyledAttributes.getBoolean(18, false);
        }
        obtainStyledAttributes.recycle();
        hbl hblVar2 = this.c;
        if (hid.b(getContext()) != brg.a) {
            z = true;
        }
        Boolean.valueOf(z).getClass();
        hblVar2.c = z;
    }

    private final void n(hbt hbtVar) {
        this.k.add(hba.SET_ANIMATION);
        this.c.g();
        l();
        hbtVar.e(this.e);
        hbtVar.d(this.f);
        this.m = hbtVar;
    }

    public final void a(heo heoVar, Object obj, hii hiiVar) {
        this.c.f(heoVar, obj, new hay(hiiVar));
    }

    public final void b() {
        this.k.add(hba.PLAY_OPTION);
        hbl hblVar = this.c;
        hblVar.e.clear();
        hblVar.b.cancel();
        if (!hblVar.isVisible()) {
            hblVar.n = 1;
        }
    }

    public final void c() {
        this.k.add(hba.PLAY_OPTION);
        this.c.j();
    }

    public final void d(int i) {
        hbt i2;
        this.h = i;
        this.g = null;
        if (isInEditMode()) {
            i2 = new hbt(new ijt(this, i, 1), true);
        } else if (this.d) {
            i2 = hbf.h(getContext(), i);
        } else {
            i2 = hbf.i(getContext(), i, null);
        }
        n(i2);
    }

    public final void e(String str) {
        hbt g;
        this.g = str;
        int i = 0;
        this.h = 0;
        if (isInEditMode()) {
            g = new hbt(new haw(this, str, i), true);
        } else if (this.d) {
            g = hbf.g(getContext(), str, "asset_".concat(String.valueOf(str)));
        } else {
            g = hbf.g(getContext(), str, null);
        }
        n(g);
    }

    public final void f(hbb hbbVar) {
        this.c.setCallback(this);
        this.i = true;
        boolean r = this.c.r(hbbVar);
        this.i = false;
        if (getDrawable() == this.c) {
            if (!r) {
                return;
            }
        } else if (!r) {
            boolean k = k();
            setImageDrawable(null);
            setImageDrawable(this.c);
            if (k) {
                this.c.l();
            }
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((hbp) it.next()).a();
        }
    }

    public final void g(String str) {
        this.c.g = str;
    }

    public final void h(float f, boolean z) {
        if (z) {
            this.k.add(hba.SET_PROGRESS);
        }
        this.c.o(f);
    }

    public final void i(int i) {
        this.k.add(hba.SET_REPEAT_COUNT);
        this.c.p(i);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof hbl) && ((hbl) drawable).l) {
            this.c.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        hbl hblVar = this.c;
        if (drawable2 == hblVar) {
            super.invalidateDrawable(hblVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void j(int i) {
        this.k.add(hba.SET_REPEAT_MODE);
        this.c.b.setRepeatMode(i);
    }

    public final boolean k() {
        return this.c.q();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.j) {
            this.c.j();
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof haz)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        haz hazVar = (haz) parcelable;
        super.onRestoreInstanceState(hazVar.getSuperState());
        this.g = hazVar.a;
        if (!this.k.contains(hba.SET_ANIMATION) && !TextUtils.isEmpty(this.g)) {
            e(this.g);
        }
        this.h = hazVar.b;
        if (!this.k.contains(hba.SET_ANIMATION) && (i = this.h) != 0) {
            d(i);
        }
        if (!this.k.contains(hba.SET_PROGRESS)) {
            h(hazVar.c, false);
        }
        if (!this.k.contains(hba.PLAY_OPTION) && hazVar.d) {
            c();
        }
        if (!this.k.contains(hba.SET_IMAGE_ASSETS)) {
            g(hazVar.e);
        }
        if (!this.k.contains(hba.SET_REPEAT_MODE)) {
            j(hazVar.f);
        }
        if (!this.k.contains(hba.SET_REPEAT_COUNT)) {
            i(hazVar.g);
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        boolean z;
        haz hazVar = new haz(super.onSaveInstanceState());
        hazVar.a = this.g;
        hazVar.b = this.h;
        hazVar.c = this.c.c();
        hbl hblVar = this.c;
        if (hblVar.isVisible()) {
            z = hblVar.b.k;
        } else {
            int i = hblVar.n;
            if (i != 2 && i != 3) {
                z = false;
            } else {
                z = true;
            }
        }
        hazVar.d = z;
        hbl hblVar2 = this.c;
        hazVar.e = hblVar2.g;
        hazVar.f = hblVar2.b.getRepeatMode();
        hazVar.g = this.c.e();
        return hazVar;
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        l();
        super.setImageBitmap(bitmap);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        l();
        super.setImageDrawable(drawable);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i) {
        l();
        super.setImageResource(i);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        hbl hblVar;
        if (!this.i && drawable == (hblVar = this.c) && hblVar.q()) {
            this.j = false;
            this.c.i();
        } else if (!this.i && (drawable instanceof hbl)) {
            hbl hblVar2 = (hbl) drawable;
            if (hblVar2.q()) {
                hblVar2.i();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new hef(this, 1);
        this.f = new heg(this, 1);
        this.b = 0;
        this.c = new hbl();
        this.i = false;
        this.j = false;
        this.d = true;
        this.k = new HashSet();
        this.l = new HashSet();
        m(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new hef(this, 1);
        this.f = new heg(this, 1);
        this.b = 0;
        this.c = new hbl();
        this.i = false;
        this.j = false;
        this.d = true;
        this.k = new HashSet();
        this.l = new HashSet();
        m(attributeSet, i);
    }
}
