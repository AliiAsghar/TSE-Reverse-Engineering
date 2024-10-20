package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface wnt {
    PendingIntent a(String str, Uri uri, int i, int i2, int i3, MessageIdType messageIdType, String str2, long j);

    Intent b(Uri uri, Uri uri2, Bundle bundle, long j);

    Intent c(Context context, Uri uri, Uri uri2, boolean z, Bundle bundle, long j);

    Intent d();

    PendingIntent e(String str, ConversationIdType conversationIdType, MessageIdType messageIdType);

    PendingIntent f(ConversationIdType conversationIdType);
}
