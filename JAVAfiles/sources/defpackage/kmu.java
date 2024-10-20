package defpackage;

import android.content.DialogInterface;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kmu implements DialogInterface.OnDismissListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kmu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ((zly) this.a).b(-1);
                    ((zly) this.a).a();
                    return;
                } else {
                    ((zmx) this.a).e = Optional.empty();
                    return;
                }
            }
            ((ixd) this.a).e = null;
            return;
        }
        this.a.run();
    }

    public kmu(zly zlyVar, int i) {
        this.b = i;
        this.a = zlyVar;
    }
}
