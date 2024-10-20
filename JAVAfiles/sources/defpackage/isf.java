package defpackage;

import android.app.Activity;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class isf implements ecd {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ isf(grn grnVar, Activity activity, int i) {
        this.c = i;
        this.b = grnVar;
        this.a = activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.ecd
    public final void accept(Object obj) {
        if (this.c != 0) {
            grn grnVar = (grn) this.b;
            Object obj2 = grnVar.e;
            if (obj2 != null) {
                Activity activity = (Activity) this.a;
                ((grl) obj2).a(activity, grnVar.a(activity));
                return;
            }
            return;
        }
        ((ity) ((itb) this.a).K.b()).b(this.b, (amgf) obj);
    }

    public /* synthetic */ isf(itb itbVar, List list, int i) {
        this.c = i;
        this.a = itbVar;
        this.b = list;
    }
}
