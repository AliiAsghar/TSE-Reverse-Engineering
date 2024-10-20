package com.google.android.apps.messaging.shared.datamodel.data.common.statsdata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import defpackage.akul;
import defpackage.albo;
import defpackage.amge;
import defpackage.amgh;
import defpackage.amgi;
import defpackage.amgj;
import defpackage.amgk;
import defpackage.amjk;
import defpackage.arpe;
import defpackage.arpj;
import defpackage.arrn;
import defpackage.arwe;
import defpackage.arwf;
import defpackage.mdi;
import defpackage.qjh;
import defpackage.qrr;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BackgroundLoadingMessageUsageStatisticsData implements MessageUsageStatisticsData {

    @UsedByReflection
    public static final Parcelable.Creator<MessageUsageStatisticsData> CREATOR;
    public akul a;
    private final amgj c;
    private final arwe d;

    static {
        Parcelable.Creator<MessageUsageStatisticsData> creator = MessageUsageStatisticsDataImpl.CREATOR;
        creator.getClass();
        CREATOR = creator;
    }

    public BackgroundLoadingMessageUsageStatisticsData(akul<MessageUsageStatisticsDataImpl> akulVar, amgj amgjVar, arwe arweVar) {
        akulVar.getClass();
        amgjVar.getClass();
        arweVar.getClass();
        this.a = akulVar;
        this.c = amgjVar;
        this.d = arweVar;
    }

    private final MessageUsageStatisticsDataImpl u() {
        Object bQ = albo.bQ(this.a);
        bQ.getClass();
        return (MessageUsageStatisticsDataImpl) bQ;
    }

    private final akul v(akul akulVar) {
        akul c;
        c = qjh.c(this.d, arpj.a, arwf.a, new qrr(akulVar, (arpe) null, 19));
        return c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final int a() {
        return u().d;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final int b() {
        return u().j;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final long c() {
        return u().k;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final DeviceData d() {
        return u().c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final MessageUsageStatisticsData e() {
        akul v = v(this.a);
        this.a = v(this.a);
        return new BackgroundLoadingMessageUsageStatisticsData(v, this.c, this.d);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final akul f() {
        akul c;
        c = qjh.c(this.d, arpj.a, arwf.a, new qrr(this, (arpe) null, 20));
        return c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final amge g() {
        amge amgeVar = u().f;
        amgeVar.getClass();
        return amgeVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final amgh h() {
        amgh amghVar = u().h;
        amghVar.getClass();
        return amghVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final amgi i() {
        amgi amgiVar = u().e;
        amgiVar.getClass();
        return amgiVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final amgj j() {
        return this.c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final amgk k() {
        amgk amgkVar = u().g;
        amgkVar.getClass();
        return amgkVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final amjk l() {
        return u().i;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final Optional m() {
        Optional optional = u().l;
        optional.getClass();
        return optional;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final Optional n() {
        Optional optional = u().m;
        optional.getClass();
        return optional;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void o(amgi amgiVar) {
        amgiVar.getClass();
        u().e = amgiVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void p(amjk amjkVar) {
        u().i = amjkVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void q() {
        u().q();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void r(DeviceData deviceData) {
        u().c = deviceData;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void s() {
        u().s();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final boolean t() {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        arrn.G(arpj.a, new mdi(this, parcel, i, (arpe) null, 7));
    }
}
