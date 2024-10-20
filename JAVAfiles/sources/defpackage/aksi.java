package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aksi implements TextView.OnEditorActionListener {
    public final /* synthetic */ aksr a;
    public final /* synthetic */ TextView.OnEditorActionListener b;
    public final /* synthetic */ String c;

    public /* synthetic */ aksi(aksr aksrVar, TextView.OnEditorActionListener onEditorActionListener, String str) {
        this.a = aksrVar;
        this.b = onEditorActionListener;
        this.c = str;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        TextView.OnEditorActionListener onEditorActionListener = this.b;
        if (!akqj.u()) {
            akrc b = this.a.b(this.c);
            try {
                boolean onEditorAction = onEditorActionListener.onEditorAction(textView, i, keyEvent);
                b.close();
                return onEditorAction;
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return onEditorActionListener.onEditorAction(textView, i, keyEvent);
    }
}
