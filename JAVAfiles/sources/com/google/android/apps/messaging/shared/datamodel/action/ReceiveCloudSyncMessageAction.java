package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.agnq;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.armf;
import defpackage.lqn;
import defpackage.mho;
import defpackage.nds;
import defpackage.qih;
import defpackage.qwm;
import defpackage.rbk;
import defpackage.rdk;
import defpackage.rdn;
import defpackage.rji;
import defpackage.ruq;
import defpackage.rvw;
import defpackage.rwd;
import defpackage.rxq;
import defpackage.ryg;
import defpackage.tqx;
import defpackage.xbi;
import defpackage.xxh;
import defpackage.xzb;
import defpackage.xze;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ReceiveCloudSyncMessageAction extends Action<Void> implements Parcelable {
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final mho f;
    public final xbi g;
    public final tqx h;
    public final armf i;
    public final armf j;
    public final nds k;
    public final armf l;
    private final ryg m;
    private final rji n;
    private final agnq o;
    public static final xze a = xze.g("BugleDataModel", "ReceiveCloudSyncMessageAction");
    public static final Parcelable.Creator<Action<?>> CREATOR = new rdk(2);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rdn NI();
    }

    public ReceiveCloudSyncMessageAction(armf<qih> armfVar, armf<rxq> armfVar2, armf<rwd> armfVar3, armf<ruq> armfVar4, ryg rygVar, mho mhoVar, xbi xbiVar, rji rjiVar, tqx tqxVar, armf<xxh> armfVar5, agnq agnqVar, armf<rvw> armfVar6, nds ndsVar, armf<lqn> armfVar7, Parcel parcel) {
        super(parcel, amdy.RECEIVE_CLOUD_SYNC_MESSAGE_ACTION);
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.m = rygVar;
        this.f = mhoVar;
        this.g = xbiVar;
        this.n = rjiVar;
        this.h = tqxVar;
        this.i = armfVar5;
        this.o = agnqVar;
        this.j = armfVar6;
        this.k = ndsVar;
        this.l = armfVar7;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ReceiveCloudSyncMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        final qwm d = this.m.d();
        final HashSet hashSet = new HashSet();
        final HashSet hashSet2 = new HashSet();
        this.o.d(new Runnable() { // from class: rdm
            /* JADX WARN: Removed duplicated region for block: B:37:0x012e  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x0163  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0175  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x017e  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x0130  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 674
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.rdm.run():void");
            }
        });
        rbk.d(4, this);
        this.n.g();
        xzb.b = false;
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReceiveCloudSyncMessage.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ReceiveCloudSyncMessageAction(armf<qih> armfVar, armf<rxq> armfVar2, armf<rwd> armfVar3, armf<ruq> armfVar4, ryg rygVar, mho mhoVar, xbi xbiVar, rji rjiVar, tqx tqxVar, armf<xxh> armfVar5, agnq agnqVar, armf<rvw> armfVar6, nds ndsVar, armf<lqn> armfVar7, Parcelable[] parcelableArr) {
        super(amdy.RECEIVE_CLOUD_SYNC_MESSAGE_ACTION);
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.m = rygVar;
        this.f = mhoVar;
        this.g = xbiVar;
        this.n = rjiVar;
        this.h = tqxVar;
        this.i = armfVar5;
        this.o = agnqVar;
        this.j = armfVar6;
        this.k = ndsVar;
        this.l = armfVar7;
        this.u.I(parcelableArr);
    }
}
