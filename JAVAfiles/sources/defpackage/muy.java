package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class muy extends IllegalArgumentException {
    public muy(MessageId messageId) {
        super(String.format("Message not found: %s", messageId.a()));
    }
}
