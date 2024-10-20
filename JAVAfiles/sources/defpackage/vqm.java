package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.group.GroupInfo;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface vqm {
    long a(long j);

    @Deprecated
    Uri b(MessageCoreData messageCoreData, long j, msh mshVar, String str, int i);

    @Deprecated
    xaz c(long j, String str, String str2);

    xaz d(xhv xhvVar, String str, String str2);

    xhv e(long j, GroupInfo groupInfo);

    akul f(MessageCoreData messageCoreData, Uri uri, String str);

    akul g(MessageCoreData messageCoreData, Uri uri, String str);

    akul h(MessageCoreData messageCoreData, long j, msh mshVar, String str, int i);

    @Deprecated
    Uri i(MessageCoreData messageCoreData, aknw aknwVar, List list, long j, String str, int i);

    xhv j(wyj wyjVar);

    akul k(MessageCoreData messageCoreData, aknw aknwVar, List list, long j, String str, int i);
}
