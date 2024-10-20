package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AspectRatioLayout;
import com.google.android.apps.messaging.ui.mediapicker.camera.MiniCameraViewImpl;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aavf extends AspectRatioLayout implements apxr {
    private apxm b;
    private boolean c;

    public aavf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode() && !this.c) {
            this.c = true;
            MiniCameraViewImpl miniCameraViewImpl = (MiniCameraViewImpl) this;
            kqs kqsVar = (kqs) aS();
            miniCameraViewImpl.c = (yjf) kqsVar.a.bU.b();
            krv krvVar = kqsVar.a;
            miniCameraViewImpl.B = new mcl(krvVar.eB, new itw(4), (Executor) krvVar.m.b());
            miniCameraViewImpl.d = (aava) kqsVar.a.a.gK.b();
            miniCameraViewImpl.e = (anen) kqsVar.a.DD.b();
            miniCameraViewImpl.C = (zmr) kqsVar.J.au.b();
            miniCameraViewImpl.f = (abbu) kqsVar.a.yF.b();
            miniCameraViewImpl.g = (aksr) kqsVar.a.at.b();
            miniCameraViewImpl.h = kqsVar.F;
            miniCameraViewImpl.i = kqsVar.a.bB;
        }
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: gj, reason: merged with bridge method [inline-methods] */
    public final apxm aR() {
        if (this.b == null) {
            this.b = new apxm(this);
        }
        return this.b;
    }
}
