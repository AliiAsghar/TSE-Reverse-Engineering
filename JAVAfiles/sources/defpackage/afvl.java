package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class afvl implements View.OnLongClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ afvl(afvn afvnVar, afso afsoVar, arqr arqrVar, int i) {
        this.d = i;
        this.a = afvnVar;
        this.b = afsoVar;
        this.c = arqrVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View$OnLongClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [xuv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, arqr] */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                akrc b = ((aksr) this.a).b((String) this.c);
                try {
                    boolean onLongClick = this.b.onLongClick(view);
                    b.close();
                    return onLongClick;
                } catch (Throwable th) {
                    try {
                        b.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            Rect g = ((xum) this.a).b.g(view);
            return this.c.i(this.b, g, true);
        }
        alvg alvgVar = (alvg) afvn.u.g().h("com/google/android/libraries/compose/media/ui/holder/MediaViewHolder", "bind$lambda$9", 146, "MediaViewHolder.kt");
        String str = ((afvn) this.a).z;
        Object obj = this.b;
        alvgVar.D("%s long clicked with media=%s", str, obj);
        ((Boolean) this.c.a(obj)).booleanValue();
        return false;
    }

    public /* synthetic */ afvl(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }
}
