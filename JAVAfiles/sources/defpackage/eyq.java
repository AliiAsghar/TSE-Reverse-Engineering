package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.ClearCloudSyncMessagesAction;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eyq implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ eyq(Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [armf, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i != 0) {
            int i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    ((mho) ((zas) this.b).a.b()).n(this.a);
                    return;
                }
                sxu sxuVar = new sxu();
                sxuVar.f("ClearCloudSyncMessagesAction#doBackgroundWork#messages");
                sxuVar.b(new ilg(this.a, 16));
                sxuVar.d();
                snb snbVar = new snb();
                snbVar.f("ClearCloudSyncMessagesAction#doBackgroundWork#conversations");
                snbVar.b(new qza(i2));
                snbVar.d();
                ClearCloudSyncMessagesAction clearCloudSyncMessagesAction = (ClearCloudSyncMessagesAction) this.b;
                clearCloudSyncMessagesAction.c.c();
                clearCloudSyncMessagesAction.b.e(true, ruy.a);
                return;
            }
            ((exo) this.b).g.c(this.a);
            return;
        }
        ((eys) this.b).b.a.i(this.a);
    }
}
