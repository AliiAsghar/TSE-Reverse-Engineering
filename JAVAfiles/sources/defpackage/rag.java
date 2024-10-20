package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rag {
    public final Action a;
    public final MessageCoreData b;
    public final DeviceData c;
    public final MessageUsageStatisticsData d;
    public final amgj e;
    public final long f;
    public final int g;
    public final int h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final ahjj p;

    public rag(Action action, MessageCoreData messageCoreData, DeviceData deviceData, MessageUsageStatisticsData messageUsageStatisticsData, amgj amgjVar, long j, int i, int i2, boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ahjj ahjjVar) {
        this.a = action;
        this.b = messageCoreData;
        this.c = deviceData;
        this.d = messageUsageStatisticsData;
        this.e = amgjVar;
        this.f = j;
        this.g = i;
        this.h = i2;
        this.i = z;
        this.j = str;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = ahjjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rag)) {
            return false;
        }
        rag ragVar = (rag) obj;
        if (d.F(this.a, ragVar.a) && d.F(this.b, ragVar.b) && d.F(this.c, ragVar.c) && d.F(this.d, ragVar.d) && this.e == ragVar.e && this.f == ragVar.f && this.g == ragVar.g && this.h == ragVar.h && this.i == ragVar.i && d.F(this.j, ragVar.j) && this.k == ragVar.k && this.l == ragVar.l && this.m == ragVar.m && this.n == ragVar.n && this.o == ragVar.o && d.F(this.p, ragVar.p)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = this.a.hashCode() * 31;
        MessageCoreData messageCoreData = this.b;
        int i = 0;
        if (messageCoreData == null) {
            hashCode = 0;
        } else {
            hashCode = messageCoreData.hashCode();
        }
        int i2 = (hashCode6 + hashCode) * 31;
        DeviceData deviceData = this.c;
        if (deviceData == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = deviceData.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        MessageUsageStatisticsData messageUsageStatisticsData = this.d;
        if (messageUsageStatisticsData == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = messageUsageStatisticsData.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        amgj amgjVar = this.e;
        if (amgjVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = amgjVar.hashCode();
        }
        int A = (((((((((i4 + hashCode4) * 31) + a.A(this.f)) * 31) + this.g) * 31) + this.h) * 31) + a.v(this.i)) * 31;
        String str = this.j;
        if (str == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str.hashCode();
        }
        int v = (((((((((((A + hashCode5) * 31) + a.v(this.k)) * 31) + a.v(this.l)) * 31) + a.v(this.m)) * 31) + a.v(this.n)) * 31) + a.v(this.o)) * 31;
        ahjj ahjjVar = this.p;
        if (ahjjVar != null) {
            i = ahjjVar.hashCode();
        }
        return v + i;
    }

    public final String toString() {
        return "InsertNewMessageParameters(parentAction=" + this.a + ", message=" + this.b + ", secondaryDeviceData=" + this.c + ", defaultStatsData=" + this.d + ", source=" + this.e + ", sentTime=" + this.f + ", requestedSubId=" + this.g + ", requestedLockedDefaultSmsSubId=" + this.h + ", updateDraft=" + this.i + ", archiveStatusValue=" + this.j + ", shouldRefreshNotification=" + this.k + ", isFromNotification=" + this.l + ", hasRbmBotRecipient=" + this.m + ", isEarlySend=" + this.n + ", hasUiBeenNotified=" + this.o + ", messageSaveCallback=" + this.p + ")";
    }
}
