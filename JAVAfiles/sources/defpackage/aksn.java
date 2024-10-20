package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aksn extends ClickableSpan {
    final /* synthetic */ String a;
    final /* synthetic */ ClickableSpan b;
    final /* synthetic */ aksr c;

    public aksn(aksr aksrVar, String str, ClickableSpan clickableSpan) {
        this.a = str;
        this.b = clickableSpan;
        this.c = aksrVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        akrc b = this.c.b(this.a);
        try {
            this.b.onClick(view);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.b.updateDrawState(textPaint);
    }
}
