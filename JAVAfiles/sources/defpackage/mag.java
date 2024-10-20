package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface mag {
    void a(MessageCoreData messageCoreData, ParticipantsTable.BindData bindData);

    void b(MessageCoreData messageCoreData);

    void c(MessageIdType messageIdType, boolean z);
}
