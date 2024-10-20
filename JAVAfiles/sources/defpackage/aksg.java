package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aksg implements View.OnLayoutChangeListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ aksg(aksr aksrVar, View.OnLayoutChangeListener onLayoutChangeListener, int i) {
        this.d = i;
        this.a = aksrVar;
        this.b = onLayoutChangeListener;
        this.c = "ConversationFragmentPeer composeMessageView onLayoutChange";
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View$OnLayoutChangeListener, java.lang.Object] */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.d != 0) {
            ((View) this.b).removeOnLayoutChangeListener(this);
            xzw.a.post(new wnc(this.a, this.c, 18, null));
            return;
        }
        ?? r7 = this.b;
        if (!akqj.u()) {
            akrc b = ((aksr) this.a).b((String) this.c);
            try {
                r7.onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
                b.close();
            } finally {
            }
        } else {
            r7.onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
        }
    }

    public aksg(View view, enh enhVar, Runnable runnable, int i) {
        this.d = i;
        this.b = view;
        this.a = enhVar;
        this.c = runnable;
    }
}
