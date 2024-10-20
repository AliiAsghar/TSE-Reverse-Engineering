package defpackage;

import android.view.WindowInsetsAnimation;
import com.google.android.libraries.compose.ui.keyboard.detector.KeyboardDetectorViewInsetsListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agbf extends arrp implements arqg {
    final /* synthetic */ KeyboardDetectorViewInsetsListener a;
    final /* synthetic */ agaz b;
    final /* synthetic */ WindowInsetsAnimation c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agbf(KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener, agaz agazVar, WindowInsetsAnimation windowInsetsAnimation) {
        super(0);
        this.a = keyboardDetectorViewInsetsListener;
        this.b = agazVar;
        this.c = windowInsetsAnimation;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener = this.a;
        edk.b(keyboardDetectorViewInsetsListener.b, new agbe(keyboardDetectorViewInsetsListener, this.b, this.c));
        return arnb.a;
    }
}
