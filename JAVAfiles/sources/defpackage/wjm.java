package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wjm implements uvx, rws {
    static final utz a = uuh.l(uuh.b, "rcs_not_delivered_tracker_timeout_seconds", TimeUnit.MINUTES.toSeconds(60));
    public static final alvi b = alvi.m("com/google/android/apps/messaging/shared/rcsmessagetracking/RcsNotDeliveredMessageTracker");
    public final xnv c;
    public final uwd d;
    public final via e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final anen i;
    public final armf j;
    private final armf k;
    private final armf l;
    private final armf m;
    private final armf n;
    private final armf o;
    private final armf p;

    public wjm(xnv xnvVar, uwd uwdVar, via viaVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, anen anenVar, armf armfVar8, armf armfVar9, armf armfVar10) {
        this.c = xnvVar;
        this.d = uwdVar;
        this.e = viaVar;
        this.k = armfVar;
        this.f = armfVar2;
        this.l = armfVar3;
        this.m = armfVar4;
        this.g = armfVar5;
        this.h = armfVar6;
        this.n = armfVar7;
        this.i = anenVar;
        this.j = armfVar8;
        this.o = armfVar9;
        this.p = armfVar10;
    }

    public static boolean g(int i) {
        if (i == 3) {
            return true;
        }
        return false;
    }

    @Override // defpackage.rws
    public final akrh a() {
        return aktp.e("RcsNotDeliveredMessageTracker");
    }

    @Override // defpackage.rws
    public final void b(MessageCoreData messageCoreData) {
        smr q;
        albo.T(!aiut.g());
        akrh a2 = a();
        try {
            if (messageCoreData.cI() && (q = ((rtz) this.k.b()).q(messageCoreData.z())) != null && q.h() == 0 && !q.ac() && ((vqu) this.l.b()).I(q.x())) {
                this.d.b(messageCoreData.B(), this.c.f().toEpochMilli(), tqg.RCS_NOT_DELIVERED);
            }
            a2.close();
        } catch (Throwable th) {
            try {
                a2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.uvx
    public final akul c(alog alogVar) {
        return aktp.aj(new uvj(this, alogVar, 13), this.i);
    }

    @Override // defpackage.uvx
    public final long d() {
        if (((ncv) this.h.b()).d()) {
            if (!((wfh) this.o.b()).S()) {
                return ((Long) this.p.b()).longValue();
            }
            return ((Long) this.n.b()).longValue();
        }
        return ((Long) a.e()).longValue();
    }

    public final void e(MessageIdType messageIdType) {
        akrh e = aktp.e("RcsNotDeliveredMessageTracker::stopTracking");
        try {
            this.d.c(messageIdType, tqg.RCS_NOT_DELIVERED);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f(alog alogVar) {
        akrh e = aktp.e("RcsNotDeliveredMessageTracker::stopTracking");
        try {
            ((uwc) this.m.b()).b(alogVar, tqg.RCS_NOT_DELIVERED);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
