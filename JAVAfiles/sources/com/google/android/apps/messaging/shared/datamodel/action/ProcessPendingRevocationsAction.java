package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.rcs.client.ims.ImsConnectionTrackerService;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.alls;
import defpackage.alpt;
import defpackage.alwl;
import defpackage.alwo;
import defpackage.amdy;
import defpackage.andi;
import defpackage.anfi;
import defpackage.armf;
import defpackage.atkn;
import defpackage.msg;
import defpackage.msk;
import defpackage.pcv;
import defpackage.qdl;
import defpackage.ray;
import defpackage.rda;
import defpackage.rdb;
import defpackage.rjf;
import defpackage.ruw;
import defpackage.rvy;
import defpackage.rwd;
import defpackage.snf;
import defpackage.sni;
import defpackage.sxt;
import defpackage.sxy;
import defpackage.tqx;
import defpackage.uie;
import defpackage.vqu;
import defpackage.wfe;
import defpackage.ydl;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ProcessPendingRevocationsAction extends Action<Void> implements Parcelable {
    public final vqu a;
    public final rjf b;
    public final armf c;
    private final ImsConnectionTrackerService e;
    private final armf f;
    private final armf g;
    private final armf h;
    private static final alwo d = alwo.o("BugleRcs");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ray(15);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rdb NC();
    }

    public ProcessPendingRevocationsAction(ImsConnectionTrackerService imsConnectionTrackerService, armf armfVar, vqu vquVar, rjf rjfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        super(amdy.PROCESS_PENDING_REVOCATIONS_ACTION);
        this.e = imsConnectionTrackerService;
        this.f = armfVar;
        this.a = vquVar;
        this.b = rjfVar;
        this.g = armfVar2;
        this.h = armfVar3;
        this.c = armfVar4;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ProcessPendingRevocationsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        akrh e = aktp.e("ProcessPendingRevocationsAction.executeAction");
        try {
            if (anfi.a("bugle.remove_jibe_service_connected_check_for_rcs_revocation", "bugle") || this.e.isConnected()) {
                v();
            }
            e.close();
            return null;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessPendingRevocations.ExecuteAction.Latency";
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul fx() {
        rwd rwdVar = (rwd) this.f.b();
        Set h = ((wfe) this.g.b()).h();
        akrh e = aktp.e("MessageDatabaseOperations#getMessagesPendingRevocation");
        try {
            sxy d2 = MessagesTable.d();
            d2.w("getMessagesPendingRevocation");
            d2.g(new rvy(8));
            int i = 11;
            d2.g(new ruw((alpt) Collection.EL.stream(h).map(new rvy(9)).collect(alls.b), i));
            d2.h(new atkn((Object) MessagesTable.c.i, true));
            snf e2 = sni.e();
            e2.f(new rvy(10));
            e2.h(new rvy(i));
            d2.n(e2.b(), "normalized_destination_expression");
            sxt sxtVar = (sxt) d2.b().n();
            try {
                ArrayList<uie> arrayList = new ArrayList();
                while (sxtVar.moveToNext()) {
                    MessageCoreData a2 = ((tqx) rwdVar.e.b()).a();
                    a2.cX(sxtVar);
                    arrayList.add(new uie(a2, ((msk) rwdVar.d.b()).r(sxtVar.cX("normalized_destination_expression")), (byte[]) null));
                }
                sxtVar.close();
                e.close();
                akul ag = aktp.ag(true);
                for (uie uieVar : arrayList) {
                    if (uieVar.a.e().isEmpty()) {
                        alwl alwlVar = (alwl) d.i();
                        alwlVar.X(ydl.e, uieVar.b.E().f());
                        alwlVar.X(ydl.n, ((msg) uieVar.a).n());
                        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/datamodel/action/ProcessPendingRevocationsAction", "processMessagePendingRevokes", 160, "ProcessPendingRevocationsAction.java")).q("Skipping revocation for message with invalid remote destination");
                    } else if (((pcv) this.h.b()).a()) {
                        ag = ag.i(new qdl(this, uieVar, 15), andi.a);
                    } else {
                        ag = ag.i(new qdl(this, uieVar, 14), andi.a);
                    }
                }
                return ag.h(new rda(this), andi.a);
            } finally {
            }
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ProcessPendingRevocationsAction(ImsConnectionTrackerService imsConnectionTrackerService, armf armfVar, vqu vquVar, rjf rjfVar, armf armfVar2, armf armfVar3, armf armfVar4, Parcel parcel) {
        super(parcel, amdy.PROCESS_PENDING_REVOCATIONS_ACTION);
        this.e = imsConnectionTrackerService;
        this.f = armfVar;
        this.a = vquVar;
        this.b = rjfVar;
        this.g = armfVar2;
        this.h = armfVar3;
        this.c = armfVar4;
    }
}
