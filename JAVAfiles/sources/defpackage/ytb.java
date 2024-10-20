package defpackage;

import android.text.style.URLSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ytb extends URLSpan {
    final /* synthetic */ URLSpan a;
    final /* synthetic */ View.OnClickListener b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytb(String str, URLSpan uRLSpan, View.OnClickListener onClickListener) {
        super(str);
        this.a = uRLSpan;
        this.b = onClickListener;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.onClick(view);
        this.b.onClick(view);
    }
}
