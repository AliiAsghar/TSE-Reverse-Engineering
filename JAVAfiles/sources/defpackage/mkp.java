package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface mkp {
    MessageCoreData a(Resources resources, rry rryVar);

    akul b(List list);

    @Deprecated
    void c(List list);

    void d(MessageIdType messageIdType);

    void e(MessageIdType messageIdType, MessageUsageStatisticsData messageUsageStatisticsData);

    void f(MessageCoreData messageCoreData, long j, MessageUsageStatisticsData messageUsageStatisticsData);

    void g(nfw nfwVar, MessageCoreData messageCoreData, long j, MessageUsageStatisticsData messageUsageStatisticsData);

    akul h(List list, int i);

    @Deprecated
    void i(List list, int i);
}
