package defpackage;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfu extends ClickableSpan {
    final /* synthetic */ abft a;
    final /* synthetic */ TextView b;

    public abfu(abft abftVar, TextView textView) {
        this.a = abftVar;
        this.b = textView;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
        Context context = this.a.l;
        zfh.r(context, this.b, zfh.o(context), context.getResources().getDimensionPixelSize(R.dimen.chat_features_tooltip_bottom_margin));
    }
}
