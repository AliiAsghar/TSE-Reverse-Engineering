package defpackage;

import android.text.style.URLSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ytc extends URLSpan {
    final /* synthetic */ View.OnClickListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytc(String str, View.OnClickListener onClickListener) {
        super(str);
        this.a = onClickListener;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.onClick(view);
    }
}
