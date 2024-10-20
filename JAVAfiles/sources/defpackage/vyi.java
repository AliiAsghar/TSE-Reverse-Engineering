package defpackage;

import android.content.Intent;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.Optional;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vyi {
    public static final xze a = xze.g("BugleRcs", "MessagingServiceResponseReceiver");
    private final anen b;

    public vyi(anen anenVar) {
        this.b = anenVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Optional b(Intent intent) {
        Conversation b = GroupOperationResult.c(intent).b();
        if (b.c() == 2) {
            return Optional.of(b.b());
        }
        return Optional.empty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Optional c(Intent intent) {
        Conversation b = MessagingOperationResult.e(intent).b();
        if (b.c() == 2) {
            return Optional.of(b.b());
        }
        return Optional.empty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final akul a(akul akulVar, String str) {
        return akulVar.e(ajpt.class, new vuu(str, 9), this.b).e(IllegalArgumentException.class, new vuu(str, 10), this.b).e(SecurityException.class, new vuu(str, 11), this.b).e(TimeoutException.class, new vuu(str, 12), this.b).e(ylp.class, new vuu(str, 13), this.b);
    }
}
