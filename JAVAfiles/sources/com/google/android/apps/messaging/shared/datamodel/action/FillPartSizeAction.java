package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import defpackage.agnq;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.armf;
import defpackage.ndb;
import defpackage.qyy;
import defpackage.qzi;
import defpackage.roi;
import defpackage.rwb;
import defpackage.rwc;
import defpackage.rxc;
import defpackage.tbs;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FillPartSizeAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new qyy(10);
    public final armf a;
    private final agnq b;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        qzi Ni();
    }

    public FillPartSizeAction(armf armfVar, agnq agnqVar) {
        super(amdy.FILL_PART_SIZE_ACTION);
        this.a = armfVar;
        this.b = agnqVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("FillPartSizeAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.FillPartSize.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fw() {
        rxc rxcVar = (rxc) this.a.b();
        akrh e = aktp.e("MessagePartDatabaseOperations#getMessagePartsWithoutSizes");
        try {
            tbs d = PartsTable.d();
            d.w("getMessagePartsWithoutSizes");
            d.q();
            d.g(new rwc(20));
            Stream w = d.b().w();
            try {
                List<MessagePartCoreData> list = (List) w.map(new rwb(rxcVar, 17)).collect(Collectors.toCollection(new roi(15)));
                if (w != null) {
                    w.close();
                }
                e.close();
                byte[] bArr = null;
                if (list != null) {
                    for (MessagePartCoreData messagePartCoreData : list) {
                        messagePartCoreData.ah();
                        this.b.k(new ndb(this, messagePartCoreData, 8, bArr));
                    }
                }
                return null;
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

    public FillPartSizeAction(armf armfVar, agnq agnqVar, Parcel parcel) {
        super(parcel, amdy.FILL_PART_SIZE_ACTION);
        this.a = armfVar;
        this.b = agnqVar;
    }
}
