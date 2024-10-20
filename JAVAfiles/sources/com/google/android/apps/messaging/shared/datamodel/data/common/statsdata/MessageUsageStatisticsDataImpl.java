package com.google.android.apps.messaging.shared.datamodel.data.common.statsdata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import defpackage.akul;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.amge;
import defpackage.amgh;
import defpackage.amgi;
import defpackage.amgj;
import defpackage.amgk;
import defpackage.amjk;
import defpackage.aneh;
import defpackage.aozs;
import defpackage.apag;
import defpackage.apba;
import defpackage.rgd;
import defpackage.rha;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MessageUsageStatisticsDataImpl implements MessageUsageStatisticsData {
    public amgj a;
    public DeviceData c;
    public int d;
    public amgi e;

    @Deprecated
    public amge f;
    public amgk g;
    public amgh h;
    public amjk i;
    public int j;
    public long k;
    public Optional l;
    public Optional m;
    private final boolean o;
    private static final alvi n = alvi.m("com/google/android/apps/messaging/shared/datamodel/data/common/statsdata/MessageUsageStatisticsDataImpl");
    public static final Parcelable.Creator<MessageUsageStatisticsData> CREATOR = new rha(10);

    public MessageUsageStatisticsDataImpl() {
        this(amgj.UNKNOWN_BUGLE_MESSAGE_SOURCE);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final int a() {
        return this.d;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final int b() {
        return this.j;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final long c() {
        return this.k;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final DeviceData d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final MessageUsageStatisticsData e() {
        MessageUsageStatisticsDataImpl messageUsageStatisticsDataImpl = new MessageUsageStatisticsDataImpl();
        messageUsageStatisticsDataImpl.a = this.a;
        DeviceData deviceData = this.c;
        if (deviceData != null) {
            DeviceData deviceData2 = new DeviceData(deviceData.a);
            deviceData2.c = deviceData.c;
            deviceData2.b = deviceData.b;
            deviceData2.d = deviceData.d;
            messageUsageStatisticsDataImpl.c = deviceData2;
        } else {
            messageUsageStatisticsDataImpl.c = null;
        }
        messageUsageStatisticsDataImpl.d = this.d;
        messageUsageStatisticsDataImpl.e = this.e;
        messageUsageStatisticsDataImpl.f = this.f;
        messageUsageStatisticsDataImpl.g = this.g;
        messageUsageStatisticsDataImpl.h = this.h;
        messageUsageStatisticsDataImpl.i = this.i;
        messageUsageStatisticsDataImpl.j = this.j;
        messageUsageStatisticsDataImpl.k = this.k;
        this.l.ifPresent(new rgd(messageUsageStatisticsDataImpl, 16));
        this.m.ifPresent(new rgd(messageUsageStatisticsDataImpl, 17));
        return messageUsageStatisticsDataImpl;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final akul f() {
        return akul.g(aneh.a);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final amge g() {
        return this.f;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final amgh h() {
        return this.h;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final amgi i() {
        return this.e;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final amgj j() {
        return this.a;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final amgk k() {
        return this.g;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final amjk l() {
        return this.i;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final Optional m() {
        return this.l;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final Optional n() {
        return this.m;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void o(amgi amgiVar) {
        this.e = amgiVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void p(amjk amjkVar) {
        this.i = amjkVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void q() {
        this.h = amgh.MANUAL_FALLBACK;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void r(DeviceData deviceData) {
        this.c = deviceData;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void s() {
        this.g = amgk.WAS_RCS_CONVERSATION;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final boolean t() {
        return this.o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr;
        parcel.writeInt(this.a.w);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(-1);
        parcel.writeInt(this.e.d);
        parcel.writeInt(this.f.d);
        parcel.writeInt(this.g.d);
        parcel.writeInt(this.h.p);
        parcel.writeInt(this.j);
        parcel.writeLong(this.k);
        amjk amjkVar = this.i;
        if (amjkVar != null) {
            bArr = amjkVar.toByteArray();
        } else {
            bArr = new byte[0];
        }
        parcel.writeByteArray(bArr);
        parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
    }

    public MessageUsageStatisticsDataImpl(Parcel parcel) {
        this.d = 0;
        this.l = Optional.empty();
        this.m = Optional.empty();
        amgj b = amgj.b(parcel.readInt());
        this.a = b == null ? amgj.UNKNOWN_BUGLE_MESSAGE_SOURCE : b;
        this.c = (DeviceData) parcel.readParcelable(DeviceData.class.getClassLoader());
        this.d = parcel.readInt();
        parcel.readInt();
        this.e = (amgi) Optional.ofNullable(amgi.b(parcel.readInt())).orElse(amgi.UNKNOWN_RESEND_ATTEMPT);
        this.f = (amge) Optional.ofNullable(amge.b(parcel.readInt())).orElse(amge.UNKNOWN_INSTANT_MESSAGING_ALWAYS_ON);
        this.g = (amgk) Optional.ofNullable(amgk.b(parcel.readInt())).orElse(amgk.UNKNOWN_WAS_RCS_CONVERSATION);
        this.h = (amgh) Optional.ofNullable(amgh.b(parcel.readInt())).orElse(amgh.UNKNOWN_RCS_STATUS_REASON);
        this.j = parcel.readInt();
        this.k = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray != null && createByteArray.length > 0) {
            try {
                this.i = (amjk) apag.parseFrom(amjk.a, createByteArray, aozs.a());
            } catch (apba e) {
                alvw i = n.i();
                i.X(alwp.a, "BugleUsageStatistics");
                ((alvg) ((alvg) ((alvg) i).g(e)).h("com/google/android/apps/messaging/shared/datamodel/data/common/statsdata/MessageUsageStatisticsDataImpl", "<init>", (char) 127, "MessageUsageStatisticsDataImpl.java")).q("failed to unparcel ConversationProtocolConditions");
            }
        }
        this.o = parcel.readByte() != 0;
    }

    public MessageUsageStatisticsDataImpl(amgj amgjVar) {
        this.d = 0;
        this.l = Optional.empty();
        this.m = Optional.empty();
        this.a = amgjVar;
        this.e = amgi.UNKNOWN_RESEND_ATTEMPT;
        this.f = amge.UNKNOWN_INSTANT_MESSAGING_ALWAYS_ON;
        this.g = amgk.UNKNOWN_WAS_RCS_CONVERSATION;
        this.h = amgh.UNKNOWN_RCS_STATUS_REASON;
        this.o = false;
    }

    public MessageUsageStatisticsDataImpl(amgj amgjVar, DeviceData deviceData, int i, amgi amgiVar, amge amgeVar, amgk amgkVar, amgh amghVar, amjk amjkVar, int i2, long j) {
        this.d = 0;
        this.l = Optional.empty();
        this.m = Optional.empty();
        this.a = amgjVar == null ? amgj.UNKNOWN_BUGLE_MESSAGE_SOURCE : amgjVar;
        this.c = deviceData;
        this.d = i;
        this.e = (amgi) Optional.ofNullable(amgiVar).orElse(amgi.UNKNOWN_RESEND_ATTEMPT);
        this.f = (amge) Optional.ofNullable(amgeVar).orElse(amge.UNKNOWN_INSTANT_MESSAGING_ALWAYS_ON);
        this.g = (amgk) Optional.ofNullable(amgkVar).orElse(amgk.UNKNOWN_WAS_RCS_CONVERSATION);
        this.h = (amgh) Optional.ofNullable(amghVar).orElse(amgh.UNKNOWN_RCS_STATUS_REASON);
        this.i = amjkVar;
        this.j = i2;
        this.k = j;
        this.o = true;
    }
}
