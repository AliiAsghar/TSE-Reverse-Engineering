package defpackage;

import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zrz implements Parcelable {
    public final MessageCoreData a;
    public final int b;
    public final long c;
    public final MessageUsageStatisticsData d;

    public zrz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zrz) {
            zrz zrzVar = (zrz) obj;
            if (this.a.equals(zrzVar.a) && this.b == zrzVar.b && this.c == zrzVar.c && this.d.equals(zrzVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.c;
        return (((((hashCode * 1000003) ^ this.b) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        MessageUsageStatisticsData messageUsageStatisticsData = this.d;
        return "MessageSenderParameters{messageCoreData=" + this.a.toString() + ", conversationSelfSubId=" + this.b + ", sendRealtime=" + this.c + ", messageUsageStatisticsData=" + messageUsageStatisticsData.toString() + "}";
    }

    public zrz(MessageCoreData messageCoreData, int i, long j, MessageUsageStatisticsData messageUsageStatisticsData) {
        if (messageCoreData == null) {
            throw new NullPointerException("Null messageCoreData");
        }
        this.a = messageCoreData;
        this.b = i;
        this.c = j;
        if (messageUsageStatisticsData != null) {
            this.d = messageUsageStatisticsData;
            return;
        }
        throw new NullPointerException("Null messageUsageStatisticsData");
    }
}
