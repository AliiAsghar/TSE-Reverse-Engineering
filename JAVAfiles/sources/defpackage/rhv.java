package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionExecutorImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class rhv implements Runnable {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/action/execution/ActionRunnable");
    public static final utz b = uuh.i(uuh.b, "action_exceptions_crash", false);
    public final rhw c;
    public final rho d;
    public final String e;
    public final Action f;
    public final long g;
    public final int h;
    public final anen i;
    protected final armf j;
    protected final armf k;
    public final armf l;
    public mbm m;
    private final Runnable n = akto.j(new nau(this, 17));

    public rhv(rho rhoVar, Action action, String str, long j, rhw rhwVar, anen anenVar, armf armfVar, armf armfVar2, armf armfVar3) {
        this.c = rhwVar;
        this.e = str;
        this.d = rhoVar;
        this.f = action;
        this.g = j;
        this.h = ((ActionExecutorImpl) rhwVar).l.getAndIncrement();
        this.i = anenVar;
        this.j = armfVar;
        this.k = armfVar2;
        this.l = armfVar3;
    }

    public final void a(akul akulVar) {
        akulVar.h(new rau(this, 17), this.i).k(qiu.b(), this.i);
    }

    public abstract void b();

    public final void c(mbm mbmVar) {
        if (this.m == null) {
            this.m = mbmVar;
            return;
        }
        throw new IllegalStateException("An ActionRunnable can only be queued once");
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.n.run();
    }
}
