package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aksc implements View.OnFocusChangeListener {
    public final /* synthetic */ aksr a;
    public final /* synthetic */ View.OnFocusChangeListener b;
    public final /* synthetic */ String c;

    public /* synthetic */ aksc(aksr aksrVar, View.OnFocusChangeListener onFocusChangeListener, String str) {
        this.a = aksrVar;
        this.b = onFocusChangeListener;
        this.c = str;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        View.OnFocusChangeListener onFocusChangeListener = this.b;
        if (!akqj.u()) {
            akrc b = this.a.b(this.c);
            try {
                onFocusChangeListener.onFocusChange(view, z);
                b.close();
                return;
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        onFocusChangeListener.onFocusChange(view, z);
    }
}
