package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.alvg;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.amdy;
import defpackage.arpe;
import defpackage.arpj;
import defpackage.arwf;
import defpackage.ibi;
import defpackage.lrf;
import defpackage.qjh;
import defpackage.qrr;
import defpackage.rgu;
import defpackage.rgx;
import defpackage.rgy;
import defpackage.rgz;
import defpackage.rha;
import defpackage.uuf;
import defpackage.uuh;
import defpackage.wfe;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class WaitForRcsServiceConnectionAction extends Action<Boolean> {
    private final rgy b;
    private final rgz c;
    static final uuf a = uuh.o(184294411);
    public static final Parcelable.Creator<Action<Boolean>> CREATOR = new rha(1);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rgu Og();
    }

    public WaitForRcsServiceConnectionAction(lrf lrfVar, ibi ibiVar) {
        super(amdy.WAIT_FOR_RCS_SERVICE_CONNECTION_ACTION);
        if (((Boolean) a.e()).booleanValue()) {
            this.b = lrfVar.q();
            this.c = null;
        } else {
            this.b = null;
            this.c = ibiVar.s();
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("WaitForRcsServiceConnectionAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        boolean z;
        wfe wfeVar;
        if (!((Boolean) a.e()).booleanValue()) {
            rgz rgzVar = this.c;
            rgzVar.getClass();
            akrh e = aktp.e("WaitForRcsServiceConnectionAction.executeAction");
            try {
                alvw f = rgz.a.f();
                f.X(alwp.a, "Bugle");
                ((alvg) ((alvg) f).h("com/google/android/apps/messaging/shared/datamodel/action/WaitForRcsServiceConnectionBlockingAction", "executeAction", 42, "WaitForRcsServiceConnectionBlockingAction.java")).q("Waiting for Rcs services connection");
                CountDownLatch countDownLatch = new CountDownLatch(1);
                rgx rgxVar = new rgx(countDownLatch, 2);
                rgzVar.b.i(rgxVar);
                try {
                    try {
                        if (countDownLatch.await(3000L, TimeUnit.MILLISECONDS)) {
                            alvw f2 = rgz.a.f();
                            f2.X(alwp.a, "Bugle");
                            ((alvg) ((alvg) f2).h("com/google/android/apps/messaging/shared/datamodel/action/WaitForRcsServiceConnectionBlockingAction", "executeAction", 48, "WaitForRcsServiceConnectionBlockingAction.java")).q("Done waiting for Rcs services connection");
                            z = true;
                            wfeVar = rgzVar.b;
                        } else {
                            alvw f3 = rgz.a.f();
                            f3.X(alwp.a, "Bugle");
                            ((alvg) ((alvg) f3).h("com/google/android/apps/messaging/shared/datamodel/action/WaitForRcsServiceConnectionBlockingAction", "executeAction", 51, "WaitForRcsServiceConnectionBlockingAction.java")).q("Waiting for Rcs services connection timed out");
                            z = false;
                            wfeVar = rgzVar.b;
                        }
                    } catch (Throwable th) {
                        rgzVar.b.j(rgxVar);
                        throw th;
                    }
                } catch (InterruptedException e2) {
                    alvw i = rgz.a.i();
                    i.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) ((alvg) i).g(e2)).h("com/google/android/apps/messaging/shared/datamodel/action/WaitForRcsServiceConnectionBlockingAction", "executeAction", '7', "WaitForRcsServiceConnectionBlockingAction.java")).q("Thread interrupted while waiting for Rcs services Connection");
                    z = false;
                    wfeVar = rgzVar.b;
                }
                wfeVar.j(rgxVar);
                e.close();
                return z;
            } finally {
            }
        } else {
            throw new UnsupportedOperationException("WaitForRcsServiceConnectionAsyncAction does not implement executeAction");
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.WaitForRcsServiceConnection.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul e() {
        akul c;
        if (((Boolean) a.e()).booleanValue()) {
            rgy rgyVar = this.b;
            rgyVar.getClass();
            c = qjh.c(rgyVar.b, arpj.a, arwf.a, new qrr(rgyVar, (arpe) null, 16, (byte[]) null));
            return c;
        }
        return super.e();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public WaitForRcsServiceConnectionAction(lrf lrfVar, ibi ibiVar, Parcel parcel) {
        super(parcel, amdy.WAIT_FOR_RCS_SERVICE_CONNECTION_ACTION);
        if (((Boolean) a.e()).booleanValue()) {
            this.b = lrfVar.q();
            this.c = null;
        } else {
            this.b = null;
            this.c = ibiVar.s();
        }
    }
}
