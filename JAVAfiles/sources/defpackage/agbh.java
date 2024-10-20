package defpackage;

import com.google.android.libraries.compose.ui.keyboard.detector.KeyboardDetectorViewInsetsListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agbh extends arsm {
    final /* synthetic */ KeyboardDetectorViewInsetsListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agbh(Object obj, KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener) {
        super(obj);
        this.a = keyboardDetectorViewInsetsListener;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        agbk agbkVar = (agbk) obj2;
        agbk agbkVar2 = (agbk) obj;
        if (agbkVar2 instanceof agba) {
            ((agba) agbkVar2).a.N().d(this.a);
        }
        if (agbkVar instanceof agba) {
            ((agba) agbkVar).a.N().c(this.a);
            KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener = this.a;
            keyboardDetectorViewInsetsListener.b.setOnApplyWindowInsetsListener(keyboardDetectorViewInsetsListener);
            KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener2 = this.a;
            keyboardDetectorViewInsetsListener2.b.setWindowInsetsAnimationCallback(keyboardDetectorViewInsetsListener2);
            KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener3 = this.a;
            keyboardDetectorViewInsetsListener3.b.a.add(keyboardDetectorViewInsetsListener3);
            this.a.b.requestApplyInsets();
            return;
        }
        this.a.b.setOnApplyWindowInsetsListener(null);
        this.a.b.setWindowInsetsAnimationCallback(null);
        KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener4 = this.a;
        keyboardDetectorViewInsetsListener4.b.a.remove(keyboardDetectorViewInsetsListener4);
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        if (!d.F(obj, obj2)) {
            return true;
        }
        return false;
    }
}
