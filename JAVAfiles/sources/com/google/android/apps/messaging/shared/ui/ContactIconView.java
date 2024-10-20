package com.google.android.apps.messaging.shared.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.apps.messaging.R;
import defpackage.alvi;
import defpackage.amho;
import defpackage.armf;
import defpackage.uai;
import defpackage.ufd;
import defpackage.ugi;
import defpackage.xpw;
import defpackage.xuc;
import defpackage.xue;
import defpackage.xuf;
import defpackage.xvc;
import defpackage.xyl;
import defpackage.zxy;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ContactIconView extends xue {
    public static final alvi h = alvi.m("com/google/android/apps/messaging/shared/ui/ContactIconView");
    private final int D;
    private boolean E;
    protected final int i;
    public long j;
    public String k;
    public long l;
    public String m;
    public boolean n;
    public xuc o;
    public amho p;
    public Optional q;
    public armf r;
    public xvc s;
    public zxy t;

    public ContactIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = amho.UNKNOWN_BIZINFO_EVENT_SOURCE;
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xuf.b);
        int i = obtainStyledAttributes.getInt(0, 0);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        this.i = 0;
                        xyl.c("Unsupported ContactIconView icon size attribute");
                    } else {
                        this.i = (int) resources.getDimension(R.dimen.contact_icon_view_xlarge_size);
                    }
                } else {
                    this.i = (int) resources.getDimension(R.dimen.contact_icon_view_small_size);
                }
            } else {
                this.i = (int) resources.getDimension(R.dimen.contact_icon_view_large_size);
            }
        } else {
            this.i = (int) resources.getDimension(R.dimen.contact_icon_view_normal_size);
        }
        this.D = resources.getColor(R.color.contact_avatar_pressed_color);
        this.E = true;
        this.n = true;
        obtainStyledAttributes.recycle();
    }

    public final void h(boolean z) {
        this.E = z;
        setOnClickListener(null);
        setClickable(false);
    }

    public final void i(Uri uri) {
        j(uri, 0);
    }

    public final void j(Uri uri, int i) {
        m(uri, -1L, null, -1L, null, i);
    }

    public final void k() {
        this.q.ifPresent(new xpw(this, 12));
    }

    public final void l(Uri uri, long j, String str, long j2, String str2) {
        m(uri, j, str, j2, str2, 0);
    }

    public final void m(Uri uri, long j, String str, long j2, String str2, int i) {
        if (uri == null) {
            d(null);
        } else {
            String j3 = xvc.j(uri);
            boolean z = !"g".equals(j3);
            if ("s".equals(j3)) {
                xvc xvcVar = this.s;
                int i2 = this.i;
                d(new ufd(xvcVar, uri, i2, i2, true, i));
            } else {
                int i3 = this.i;
                d(new ugi(uri, i3, i3, true, z, i));
            }
        }
        this.j = j;
        this.k = str;
        this.l = j2;
        this.m = str2;
        if (!this.E) {
            return;
        }
        if ((j > -1 && !TextUtils.isEmpty(str)) || !TextUtils.isEmpty(this.m)) {
            setOnClickListener(new uai(this, 3));
        } else {
            setOnClickListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.messaging.shared.ui.AsyncImageView, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xuc xucVar = this.o;
        if (xucVar != null) {
            xucVar.cancel(true);
            this.o.b = null;
            this.o = null;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.n) {
            return false;
        }
        if (this.E && isClickable()) {
            if (motionEvent.getActionMasked() == 0) {
                setColorFilter(this.D);
            } else {
                clearColorFilter();
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
