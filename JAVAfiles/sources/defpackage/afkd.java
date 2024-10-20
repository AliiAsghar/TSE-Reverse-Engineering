package defpackage;

import android.text.TextWatcher;
import android.view.View;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afkd implements afke {
    @Override // defpackage.afke
    public final Object c(String str, arqr arqrVar, arpe arpeVar) {
        return arqrVar.a(arpeVar);
    }

    @Override // defpackage.afke
    public final Object d(String str, arqg arqgVar) {
        return arqgVar.a();
    }

    @Override // defpackage.afke
    public final Object e(String str, arqr arqrVar, arpe arpeVar) {
        return arqrVar.a(arpeVar);
    }

    @Override // defpackage.afke
    public final Object f(String str, arqg arqgVar) {
        return arqgVar.a();
    }

    @Override // defpackage.afke
    public final /* synthetic */ arpi g(ScheduledExecutorService scheduledExecutorService) {
        return new arxf(scheduledExecutorService);
    }

    @Override // defpackage.afke
    public final TextWatcher h(TextWatcher textWatcher) {
        return textWatcher;
    }

    @Override // defpackage.afke
    public final View.OnClickListener a(String str, View.OnClickListener onClickListener) {
        return onClickListener;
    }

    @Override // defpackage.afke
    public final View.OnLongClickListener b(String str, View.OnLongClickListener onLongClickListener) {
        return onLongClickListener;
    }
}
