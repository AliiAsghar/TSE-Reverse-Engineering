package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionExecutorImpl;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rho {
    public final int a;
    public String b;
    public final rhn c;
    public final List d = new ArrayList();
    public rhm e;
    public final wng f;
    public final boolean g;

    public rho(String str, int i, rhn rhnVar, wng wngVar, boolean z) {
        this.a = i;
        this.c = rhnVar;
        this.f = wngVar;
        this.g = z;
        this.b = str;
    }

    public static int a(Action action) {
        if (action instanceof ThrottledAction) {
            return ((ThrottledAction) action).f();
        }
        return action.t.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [rhw, rhm] */
    public final ListenableFuture b(Action action) {
        this.d.add(action);
        action.y(this);
        xyl.l(this.e);
        ?? r0 = this.e;
        if (r0 != 0) {
            ActionExecutorImpl actionExecutorImpl = (ActionExecutorImpl) r0;
            actionExecutorImpl.i();
            actionExecutorImpl.m.incrementAndGet();
            rhj.e(action, 1, 2);
            SettableFuture create = SettableFuture.create();
            String c = action.c();
            if (!TextUtils.isEmpty(c)) {
                actionExecutorImpl.d.c(c, action.t);
            }
            rih rihVar = new rih(this, action, create, r0, actionExecutorImpl.f, actionExecutorImpl.h, actionExecutorImpl.i, actionExecutorImpl.j);
            rihVar.c(actionExecutorImpl.d.a("Bugle.DataModel.ActionBreakdown.ExecutionQueue.Latency", action.x, action.t));
            synchronized (actionExecutorImpl.k) {
                ((ActionExecutorImpl) r0).g.add(rihVar);
                ((ActionExecutorImpl) r0).p.p(((ActionExecutorImpl) r0).n);
            }
            actionExecutorImpl.d("ACTION_EXECUTE_QUEUED_", action);
            return create;
        }
        return albo.bH(new RuntimeException("JobData has no ActionListener"));
    }

    public final boolean c() {
        if (this.f != null) {
            return true;
        }
        return false;
    }
}
