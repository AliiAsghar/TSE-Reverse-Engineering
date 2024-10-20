package defpackage;

import com.google.android.libraries.compose.ui.keyboard.detector.KeyboardDetectorViewInsetsListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agbg extends arrp implements arqr {
    final /* synthetic */ KeyboardDetectorViewInsetsListener a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agbg(KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener, int i) {
        super(1);
        this.b = i;
        this.a = keyboardDetectorViewInsetsListener;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        if (this.b != 0) {
            ((agar) obj).getClass();
            this.a.b.requestApplyInsets();
            return arnb.a;
        }
        ((agar) obj).getClass();
        this.a.b.requestApplyInsets();
        return arnb.a;
    }
}
