package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import com.google.android.apps.messaging.ui.mediapicker.camera.CameraTextureView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aave extends TextureView implements apxr {
    private apxm a;
    private boolean b;

    aave(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        f();
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final apxm aR() {
        if (this.a == null) {
            this.a = new apxm(this);
        }
        return this.a;
    }

    protected final void f() {
        if (!this.b) {
            this.b = true;
            CameraTextureView cameraTextureView = (CameraTextureView) this;
            kqs kqsVar = (kqs) aS();
            cameraTextureView.c = (aava) kqsVar.a.a.gK.b();
            cameraTextureView.d = Optional.empty();
            cameraTextureView.e = Optional.empty();
            cameraTextureView.f = (yjf) kqsVar.a.bU.b();
        }
    }

    public aave(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        f();
    }

    aave(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        f();
    }

    aave(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        f();
    }
}
