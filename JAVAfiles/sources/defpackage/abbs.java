package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abbs extends ClickableSpan {
    final /* synthetic */ View.OnClickListener a;

    public abbs(View.OnClickListener onClickListener) {
        this.a = onClickListener;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.onClick(view);
    }
}
