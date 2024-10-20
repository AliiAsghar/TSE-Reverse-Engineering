package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mzc {
    public final mwc a;
    public final MessageCoreData b;
    public final mym c;
    public final alog d;
    public final miz e;
    public final mzh f;
    public final MessageUsageStatisticsDataImpl g;
    public final long h;
    public final long i;

    public mzc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        mym mymVar;
        miz mizVar;
        mzh mzhVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof mzc) {
            mzc mzcVar = (mzc) obj;
            if (this.a.equals(mzcVar.a) && this.b.equals(mzcVar.b) && ((mymVar = this.c) != null ? mymVar.equals(mzcVar.c) : mzcVar.c == null) && alzz.at(this.d, mzcVar.d) && ((mizVar = this.e) != null ? mizVar.equals(mzcVar.e) : mzcVar.e == null) && ((mzhVar = this.f) != null ? mzhVar.equals(mzcVar.f) : mzcVar.f == null) && this.g.equals(mzcVar.g) && this.h == mzcVar.h && this.i == mzcVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        mym mymVar = this.c;
        int i = 0;
        if (mymVar == null) {
            hashCode = 0;
        } else {
            hashCode = mymVar.hashCode();
        }
        int hashCode4 = ((((hashCode3 * 1000003) ^ hashCode) * 1000003) ^ this.d.hashCode()) * 1000003;
        miz mizVar = this.e;
        if (mizVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = mizVar.hashCode();
        }
        int i2 = (hashCode4 ^ hashCode2) * 1000003;
        mzh mzhVar = this.f;
        if (mzhVar != null) {
            i = mzhVar.hashCode();
        }
        int hashCode5 = (((i2 ^ i) * 1000003) ^ this.g.hashCode()) * 1000003;
        long j = this.h;
        long j2 = this.i;
        return ((hashCode5 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        MessageUsageStatisticsDataImpl messageUsageStatisticsDataImpl = this.g;
        mzh mzhVar = this.f;
        miz mizVar = this.e;
        alog alogVar = this.d;
        mym mymVar = this.c;
        MessageCoreData messageCoreData = this.b;
        return "BugleMessageEnvelope{constraints=" + String.valueOf(this.a) + ", message=" + String.valueOf(messageCoreData) + ", textContent=" + String.valueOf(mymVar) + ", attachments=" + String.valueOf(alogVar) + ", repliedToMessage=" + String.valueOf(mizVar) + ", reactionEnvelopeInfo=" + String.valueOf(mzhVar) + ", usageStatistics=" + String.valueOf(messageUsageStatisticsDataImpl) + ", sendStartTime=" + this.h + ", sendElapsedTime=" + this.i + "}";
    }

    public mzc(mwc mwcVar, MessageCoreData messageCoreData, mym mymVar, alog alogVar, miz mizVar, mzh mzhVar, MessageUsageStatisticsDataImpl messageUsageStatisticsDataImpl, long j, long j2) {
        this.a = mwcVar;
        this.b = messageCoreData;
        this.c = mymVar;
        this.d = alogVar;
        this.e = mizVar;
        this.f = mzhVar;
        this.g = messageUsageStatisticsDataImpl;
        this.h = j;
        this.i = j2;
    }
}
