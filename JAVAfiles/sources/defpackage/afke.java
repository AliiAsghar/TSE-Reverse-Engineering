package defpackage;

import android.text.TextWatcher;
import android.view.View;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface afke {
    View.OnClickListener a(String str, View.OnClickListener onClickListener);

    View.OnLongClickListener b(String str, View.OnLongClickListener onLongClickListener);

    Object c(String str, arqr arqrVar, arpe arpeVar);

    Object d(String str, arqg arqgVar);

    Object e(String str, arqr arqrVar, arpe arpeVar);

    Object f(String str, arqg arqgVar);

    arpi g(ScheduledExecutorService scheduledExecutorService);

    TextWatcher h(TextWatcher textWatcher);
}
