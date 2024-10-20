package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpf {
    public static final AnonymousClass1 a = new CharacterStyle() { // from class: dpf.1
        @Override // android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
        }
    };

    public static final boolean a(dje djeVar) {
        dim dimVar;
        dio dioVar = djeVar.d;
        if (dioVar != null && (dimVar = dioVar.b) != null) {
            return dimVar.b;
        }
        return false;
    }
}
