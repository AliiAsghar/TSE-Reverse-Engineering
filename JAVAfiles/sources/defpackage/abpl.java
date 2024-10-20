package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class abpl implements acik {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ abpl(abpn abpnVar, String str, ScheduledFuture scheduledFuture, int i) {
        this.d = i;
        this.a = abpnVar;
        this.b = str;
        this.c = scheduledFuture;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.concurrent.ScheduledFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [acgo, java.lang.Object] */
    @Override // defpackage.acik
    public final void a(acir acirVar) {
        String str;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                ((acda) this.a).removeCallbacksAndMessages(null);
                boolean l = acirVar.l();
                Object obj = this.c;
                if (!l) {
                    if (((aciv) acirVar).c) {
                        ((adae) this.b).f();
                        return;
                    }
                    Exception g = acirVar.g();
                    g.getClass();
                    ((acit) obj).c(g);
                    return;
                }
                ((acit) obj).d(acirVar.h());
                return;
            }
            xze xzeVar = yld.a;
            if (true != acirVar.l()) {
                str = "Unsuccessful";
            } else {
                str = "Successful";
            }
            Object obj2 = this.c;
            xzeVar.l(String.format("%s registration for %s", str, obj2));
            ((yld) this.a).a((String) obj2, this.b);
            return;
        }
        Object obj3 = this.b;
        Object obj4 = this.a;
        synchronized (((abpn) obj4).c) {
            ((abpn) obj4).c.remove(obj3);
        }
        this.c.cancel(false);
    }

    public /* synthetic */ abpl(acda acdaVar, acit acitVar, adae adaeVar, int i) {
        this.d = i;
        this.a = acdaVar;
        this.c = acitVar;
        this.b = adaeVar;
    }

    public /* synthetic */ abpl(yld yldVar, acgo acgoVar, int i) {
        this.d = i;
        this.a = yldVar;
        this.c = "com.google.android.ims.library";
        this.b = acgoVar;
    }
}
