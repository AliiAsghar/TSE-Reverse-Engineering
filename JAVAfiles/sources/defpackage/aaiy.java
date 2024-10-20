package defpackage;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaiy extends ClickableSpan {
    final /* synthetic */ Context a;
    final /* synthetic */ aaiz b;

    public aaiy(aaiz aaizVar, Context context) {
        this.a = context;
        this.b = aaizVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        aaiz aaizVar = this.b;
        Context context = this.a;
        zfh.r(context, aaizVar.d, zfh.o(context), context.getResources().getDimensionPixelSize(R.dimen.chat_features_tooltip_bottom_margin));
    }
}
