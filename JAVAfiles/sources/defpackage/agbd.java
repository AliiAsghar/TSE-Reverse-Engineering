package defpackage;

import android.view.WindowInsets;
import com.google.android.libraries.compose.ui.keyboard.detector.KeyboardDetectorViewInsetsListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agbd extends arrp implements arqr {
    final /* synthetic */ KeyboardDetectorViewInsetsListener a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agbd(KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener, Object obj, int i) {
        super(1);
        this.c = i;
        this.a = keyboardDetectorViewInsetsListener;
        this.b = obj;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        boolean isVisible;
        agaq agaqVar;
        boolean isVisible2;
        agaq agaqVar2;
        agaq agaqVar3;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    agar agarVar = (agar) obj;
                    agarVar.getClass();
                    KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener = this.a;
                    agaz agazVar = keyboardDetectorViewInsetsListener.c;
                    if (agazVar == null) {
                        agazVar = keyboardDetectorViewInsetsListener.b(anf$$ExternalSyntheticApiModelOutline0.m73m(this.b));
                    }
                    if (agazVar instanceof agay) {
                        agaqVar3 = agaq.b;
                    } else if (agazVar instanceof agax) {
                        agaqVar3 = agaq.c;
                    } else {
                        throw new armm();
                    }
                    agarVar.m(agaqVar3);
                    return arnb.a;
                }
                agar agarVar2 = (agar) obj;
                agarVar2.getClass();
                agarVar2.l(this.a.a((WindowInsets) this.b));
                return arnb.a;
            }
            agar agarVar3 = (agar) obj;
            agarVar3.getClass();
            isVisible2 = ((WindowInsets) this.b).isVisible(anf$$ExternalSyntheticApiModelOutline0.m());
            if (isVisible2) {
                agaqVar2 = agaq.a;
            } else {
                agaqVar2 = agaq.d;
            }
            agarVar3.m(agaqVar2);
            agarVar3.l(this.a.a((WindowInsets) this.b));
            return arnb.a;
        }
        agar agarVar4 = (agar) obj;
        agarVar4.getClass();
        int i2 = KeyboardDetectorViewInsetsListener.e;
        if (agbk.a(anf$$ExternalSyntheticApiModelOutline0.m73m(this.b))) {
            isVisible = this.a.b.getRootWindowInsets().isVisible(anf$$ExternalSyntheticApiModelOutline0.m());
            if (isVisible) {
                agaqVar = agaq.a;
            } else {
                agaqVar = agaq.d;
            }
            agarVar4.m(agaqVar);
        }
        KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener2 = this.a;
        WindowInsets rootWindowInsets = keyboardDetectorViewInsetsListener2.b.getRootWindowInsets();
        rootWindowInsets.getClass();
        agarVar4.l(keyboardDetectorViewInsetsListener2.a(rootWindowInsets));
        this.a.b.requestApplyInsets();
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agbd(Object obj, KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener, int i) {
        super(1);
        this.c = i;
        this.b = obj;
        this.a = keyboardDetectorViewInsetsListener;
    }
}
