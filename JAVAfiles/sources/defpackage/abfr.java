package defpackage;

import android.content.Intent;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.apps.messaging.ui.appsettings.SmartsSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfr extends ClickableSpan {
    final /* synthetic */ abfp a;

    public abfr(abfp abfpVar) {
        this.a = abfpVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
        akto.n(this.a.i, new Intent(this.a.i, (Class<?>) SmartsSettingsActivity.class));
    }
}
