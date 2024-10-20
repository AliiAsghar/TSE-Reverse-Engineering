package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class afoi implements View.OnLongClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ afoi(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnLongClickListener, java.lang.Object] */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                boolean t = aktp.t(view);
                ?? r1 = this.b;
                if (!t) {
                    return false;
                }
                Object obj = this.a;
                akrc d = ((aksr) ((aohs) obj).b).d(aohs.u("Long clicked", view));
                try {
                    boolean onLongClick = r1.onLongClick(view);
                    d.close();
                    return onLongClick;
                } catch (Throwable th) {
                    try {
                        d.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            ((kxm) this.a).L(true, (kxl) this.b);
            return true;
        }
        Object obj2 = this.b;
        afnb afnbVar = ((afoj) obj2).v;
        if (afnbVar == null) {
            arro.b("emojiSet");
            afnbVar = null;
        }
        ((Boolean) ((afoq) this.a).k.a(obj2, afnbVar)).booleanValue();
        return true;
    }
}
