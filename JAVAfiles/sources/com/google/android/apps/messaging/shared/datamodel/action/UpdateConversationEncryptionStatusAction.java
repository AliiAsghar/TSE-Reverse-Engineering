package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.akrh;
import defpackage.akto;
import defpackage.aktp;
import defpackage.akul;
import defpackage.alls;
import defpackage.alog;
import defpackage.amdy;
import defpackage.andi;
import defpackage.anen;
import defpackage.armf;
import defpackage.kli;
import defpackage.nau;
import defpackage.okg;
import defpackage.qei;
import defpackage.qxi;
import defpackage.rbp;
import defpackage.rbw;
import defpackage.rfw;
import defpackage.rgh;
import defpackage.rgo;
import defpackage.rhl;
import defpackage.rhr;
import defpackage.ruy;
import defpackage.ryg;
import defpackage.trz;
import defpackage.tsb;
import defpackage.tsc;
import defpackage.tsp;
import defpackage.xze;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateConversationEncryptionStatusAction extends Action<Void> implements Parcelable {
    public final armf b;
    public final armf c;
    private final anen d;
    private final armf e;

    @Deprecated
    private final tsp f;
    private final armf g;
    private final armf h;
    public static final xze a = xze.g("BugleDataModel", "UpdateConversationEncryptionStatusAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rfw(12);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rgo Oc();
    }

    public UpdateConversationEncryptionStatusAction(anen anenVar, tsp tspVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, Parcel parcel) {
        super(parcel, amdy.UPDATE_CONVERSATION_OPEN_COUNT_ACTION);
        this.d = anenVar;
        this.g = armfVar;
        this.h = armfVar2;
        this.f = tspVar;
        this.e = armfVar3;
        this.b = armfVar4;
        this.c = armfVar5;
    }

    private static alog h(rhl rhlVar) {
        Stream map = Collection.EL.stream(rhlVar.m("participants_added_list")).map(new rhr(1));
        int i = alog.d;
        return (alog) map.collect(alls.a);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("UpdateConversationEncryptionStatusAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateConversationEncryptionStatusAction.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul e() {
        return aktp.ah(new nau(this, 15), andi.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul fx() {
        akrh e;
        akul e2;
        akrh e3 = aktp.e("UpdateConversationEncryptionStatusAction#performTask");
        try {
            boolean a2 = ((okg) this.h.b()).a();
            rhl rhlVar = this.u;
            if (a2) {
                e = aktp.e("UpdateConversationEncryptionStatusAction#performTaskForAllIdentities");
                try {
                    ConversationIdType b = ruy.b(rhlVar.l("conversation_id"));
                    ArrayList arrayList = new ArrayList();
                    akrh e4 = aktp.e("UpdateConversationEncryptionStatusAction#getLocalSelfIdentities");
                    try {
                        int i = 13;
                        Stream map = Collection.EL.stream(((ryg) this.e.b()).g()).filter(new qxi(7)).map(new rbp(this, b, 5)).filter(new qxi(8)).map(new rbw(this, i));
                        int i2 = alog.d;
                        alog alogVar = (alog) map.collect(alls.a);
                        e4.close();
                        int size = alogVar.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            tsb a3 = ((tsc) this.g.b()).a((qei) alogVar.get(i3), b);
                            if (rhlVar.x("participants_added_list")) {
                                arrayList.add(a3.b(h(rhlVar)));
                            } else {
                                arrayList.add(a3.a());
                            }
                        }
                        e2 = aktp.am(arrayList).h(akto.k(new kli(i)), this.d);
                        e.close();
                        e3.b(e2);
                    } finally {
                    }
                } finally {
                }
            } else {
                e = aktp.e("UpdateConversationEncryptionStatusAction#performTask");
                try {
                    ConversationIdType b2 = ruy.b(rhlVar.l("conversation_id"));
                    if (rhlVar.x("participants_added_list")) {
                        alog h = h(rhlVar);
                        tsp tspVar = this.f;
                        if (((trz) tspVar.j.b()).i() && h.size() > 0) {
                            tspVar.o.f(h, b2);
                        }
                        e2 = tspVar.e(b2);
                    } else {
                        e2 = this.f.e(b2);
                    }
                    e.close();
                    e3.b(e2);
                } finally {
                }
            }
            e3.close();
            return e2.h(new rgh(2), this.d);
        } catch (Throwable th) {
            try {
                e3.close();
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

    public UpdateConversationEncryptionStatusAction(anen anenVar, tsp tspVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, ConversationIdType conversationIdType) {
        super(amdy.UPDATE_CONVERSATION_OPEN_COUNT_ACTION);
        this.d = anenVar;
        this.f = tspVar;
        this.g = armfVar;
        this.h = armfVar2;
        this.e = armfVar3;
        this.b = armfVar4;
        this.c = armfVar5;
        this.u.v("conversation_id", conversationIdType.a());
    }
}
