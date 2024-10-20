package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akwb implements View.OnClickListener {
    public final /* synthetic */ View.OnClickListener a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ akwb(Object obj, Object obj2, View.OnClickListener onClickListener, int i) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = onClickListener;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [algk, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.d != 0) {
            akrc b = ((aksr) this.b).b((String) this.c);
            try {
                this.a.onClick(view);
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
        boolean t = aktp.t(view);
        View.OnClickListener onClickListener = this.a;
        if (!t) {
            return;
        }
        ?? r0 = this.c;
        Object obj = this.b;
        akrc c = ((aksr) ((aohs) obj).b).c(aohs.u("Clicked", view), (akrl) r0.apply(view));
        try {
            onClickListener.onClick(view);
            c.close();
        } catch (Throwable th3) {
            try {
                c.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
