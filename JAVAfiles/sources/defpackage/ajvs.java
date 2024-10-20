package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajvs extends ajvu {
    private final Context a;

    public ajvs(Context context) {
        this.a = context;
    }

    @Override // defpackage.ajvu, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i;
        boolean z;
        super.updateDrawState(textPaint);
        if (Build.VERSION.SDK_INT >= 31) {
            i = this.a.getResources().getConfiguration().fontWeightAdjustment;
            if (i == 300) {
                z = true;
            } else {
                z = false;
            }
            textPaint.setFakeBoldText(z);
        }
        textPaint.setUnderlineText(true);
    }
}
