package defpackage;

import com.google.android.rcs.client.messaging.AutoValue_GetGroupNotificationsRequest;
import com.google.android.rcs.client.messaging.GetGroupNotificationsRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajph {
    private int a;
    private byte b;

    public final GetGroupNotificationsRequest a() {
        if (this.b == 1) {
            return new AutoValue_GetGroupNotificationsRequest(this.a);
        }
        throw new IllegalStateException("Missing required properties: limit");
    }

    public final void b(int i) {
        this.a = i;
        this.b = (byte) 1;
    }
}
