package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpk extends ClickableSpan {
    private final dhz a;

    public dpk(dhz dhzVar) {
        this.a = dhzVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.b();
    }
}
