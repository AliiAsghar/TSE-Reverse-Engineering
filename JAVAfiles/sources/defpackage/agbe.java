package defpackage;

import android.view.WindowInsetsAnimation;
import com.google.android.libraries.compose.ui.keyboard.detector.KeyboardDetectorViewInsetsListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agbe implements Runnable {
    final /* synthetic */ KeyboardDetectorViewInsetsListener a;
    final /* synthetic */ agaz b;
    final /* synthetic */ WindowInsetsAnimation c;

    public agbe(KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener, agaz agazVar, WindowInsetsAnimation windowInsetsAnimation) {
        this.a = keyboardDetectorViewInsetsListener;
        this.b = agazVar;
        this.c = windowInsetsAnimation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener = this.a;
        if (!keyboardDetectorViewInsetsListener.d && keyboardDetectorViewInsetsListener.c == this.b) {
            keyboardDetectorViewInsetsListener.onEnd(this.c);
        }
    }
}
