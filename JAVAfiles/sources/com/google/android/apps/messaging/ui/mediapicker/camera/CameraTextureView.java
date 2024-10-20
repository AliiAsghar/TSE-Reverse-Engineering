package com.google.android.apps.messaging.ui.mediapicker.camera;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import com.google.mediapipe.framework.TextureFrame;
import defpackage.aauv;
import defpackage.aava;
import defpackage.aavb;
import defpackage.aavc;
import defpackage.aavd;
import defpackage.aave;
import defpackage.aavp;
import defpackage.agqc;
import defpackage.agqe;
import defpackage.agqf;
import defpackage.aktp;
import defpackage.albo;
import defpackage.aoxl;
import defpackage.asmg;
import defpackage.xze;
import defpackage.ydv;
import defpackage.yjf;
import j$.util.Optional;
import java.util.concurrent.Executor;
import javax.microedition.khronos.egl.EGLContext;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CameraTextureView extends aave implements aavb {
    public static final xze a = xze.g("Bugle", "CameraTextureView");
    public final boolean b;
    public aava c;
    public Optional d;
    public Optional e;
    public yjf f;
    public agqc g;
    public float h;
    private final WindowManager i;
    private boolean j;

    public CameraTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = false;
        this.h = 1.7777778f;
        this.i = (WindowManager) context.getSystemService("window");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aavp.a);
        this.b = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.aavb
    public final void a(int i, int i2) {
        if (i >= i2 && i2 != 0) {
            this.h = i / i2;
        }
    }

    @Override // defpackage.aavb
    public final boolean b() {
        if (this.g == null && getSurfaceTexture() == null) {
            return false;
        }
        return true;
    }

    final int c(boolean z, int i, int i2) {
        if (z) {
            i = (int) (i2 * this.h);
        }
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    public final void d() {
        this.j = true;
        this.c.g(this, isShown());
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.k(this);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, aoxl] */
    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (this.b) {
            setSurfaceTextureListener(new aavd(this));
            return;
        }
        this.g = new agqc();
        albo.T(true);
        if (this.e.isEmpty()) {
            this.c.g(this, isShown());
            return;
        }
        agqc agqcVar = this.g;
        agqcVar.e = new asmg((EGLContext) this.e.get());
        agqcVar.b = new agqe((EGLContext) ((asmg) agqcVar.e).c, this);
        ?? r1 = agqcVar.b;
        ((agqe) r1).i = new aoxl() { // from class: agqb
            @Override // defpackage.aoxl
            public final void a(TextureFrame textureFrame) {
                textureFrame.release();
            }
        };
        ((agqf) agqcVar.a).a = r1;
        ((asmg) agqcVar.e).i();
        aktp.aa(((agqe) agqcVar.b).d, new ydv(new aauv(this, 3), new aavc(0), 0), (Executor) this.d.get());
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.h >= 1.0f) {
            WindowManager windowManager = this.i;
            boolean z = false;
            if (windowManager != null && windowManager.getDefaultDisplay().getRotation() % 180 != 0) {
                z = true;
            }
            i = c(z, size, size2);
            i2 = c(true ^ z, size2, size);
        }
        setMeasuredDimension(i, i2);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        this.c.g(this, isShown());
    }

    @Override // android.view.TextureView, android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.j && this.f.c()) {
            this.c.g(this, isShown());
        }
    }
}
