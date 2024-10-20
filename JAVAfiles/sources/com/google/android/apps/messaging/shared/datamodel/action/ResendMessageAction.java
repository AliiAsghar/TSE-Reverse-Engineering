package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.alwo;
import defpackage.amdy;
import defpackage.anen;
import defpackage.armf;
import defpackage.lzz;
import defpackage.mho;
import defpackage.ojk;
import defpackage.orj;
import defpackage.qyr;
import defpackage.rdk;
import defpackage.rja;
import defpackage.ryg;
import defpackage.ryr;
import defpackage.tzn;
import defpackage.uih;
import defpackage.xnv;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ResendMessageAction extends Action<MessageCoreData> implements Parcelable {
    private final armf A;
    private final armf B;
    private final armf C;
    private final ojk D;
    private final tzn E;
    public final mho a;
    public final armf b;
    public final AtomicReference c;
    public final qyr d;
    private final armf f;
    private final ryg g;
    private final xnv h;
    private final uih i;
    private final lzz j;
    private final ryr k;
    private final armf l;
    private final armf m;
    private final armf n;
    private final anen o;
    private final orj p;
    private final armf q;
    private final armf z;
    private static final alwo e = alwo.o("BugleDataModel");
    public static final Parcelable.Creator<Action<MessageCoreData>> CREATOR = new rdk(17);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rja cT();
    }

    public ResendMessageAction(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, ryg rygVar, xnv xnvVar, uih uihVar, mho mhoVar, lzz lzzVar, ryr ryrVar, tzn tznVar, armf armfVar5, armf armfVar6, armf armfVar7, MessageIdType messageIdType, MessageUsageStatisticsData messageUsageStatisticsData, armf armfVar8, anen anenVar, orj orjVar, armf armfVar9, armf armfVar10, AtomicReference atomicReference, ojk ojkVar) {
        super(amdy.RESEND_MESSAGE_ACTION);
        this.d = new qyr();
        this.A = armfVar;
        this.B = armfVar3;
        this.C = armfVar4;
        this.f = armfVar2;
        this.g = rygVar;
        this.h = xnvVar;
        this.i = uihVar;
        this.a = mhoVar;
        this.j = lzzVar;
        this.k = ryrVar;
        this.E = tznVar;
        this.l = armfVar5;
        this.m = armfVar6;
        this.n = armfVar7;
        this.b = armfVar8;
        this.o = anenVar;
        this.p = orjVar;
        this.q = armfVar9;
        this.z = armfVar10;
        this.c = atomicReference;
        this.D = ojkVar;
        this.u.v("message_id", messageIdType.a());
        this.u.t("message_usage_stats_data", messageUsageStatisticsData);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ResendMessageAction");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0253 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0276 A[Catch: all -> 0x02c7, TryCatch #0 {all -> 0x02c7, blocks: (B:106:0x0253, B:108:0x0259, B:95:0x026c, B:97:0x0276, B:99:0x028b, B:101:0x029b, B:102:0x02b0), top: B:105:0x0253 }] */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 1045
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.ResendMessageAction.b():java.lang.Object");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ResendMessage.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ResendMessageAction(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, ryg rygVar, xnv xnvVar, uih uihVar, mho mhoVar, lzz lzzVar, ryr ryrVar, tzn tznVar, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, anen anenVar, orj orjVar, armf armfVar9, armf armfVar10, AtomicReference atomicReference, ojk ojkVar, Parcel parcel) {
        super(parcel, amdy.RESEND_MESSAGE_ACTION);
        this.d = new qyr();
        this.A = armfVar;
        this.B = armfVar3;
        this.C = armfVar4;
        this.f = armfVar2;
        this.g = rygVar;
        this.h = xnvVar;
        this.i = uihVar;
        this.a = mhoVar;
        this.j = lzzVar;
        this.k = ryrVar;
        this.E = tznVar;
        this.l = armfVar5;
        this.m = armfVar6;
        this.n = armfVar7;
        this.b = armfVar8;
        this.o = anenVar;
        this.p = orjVar;
        this.q = armfVar9;
        this.z = armfVar10;
        this.c = atomicReference;
        this.D = ojkVar;
    }
}
