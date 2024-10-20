package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vyh implements vyz {
    public final vyy a;
    private final /* synthetic */ int b;

    public vyh(vyy vyyVar, int i) {
        this.b = i;
        this.a = vyyVar;
    }

    @Override // defpackage.vyz
    public final akul a(Intent intent) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return this.a.b(intent);
                        }
                        return this.a.b(intent);
                    }
                    d.s("com.google.android.apps.messaging.messaging_service_revoke_message_response".equals(intent.getAction()));
                    return this.a.b(intent);
                }
                return this.a.b(intent);
            }
            return this.a.b(intent);
        }
        return this.a.b(intent);
    }

    @Override // defpackage.vyz
    public final String b() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return "Bugle.MessagingService.UpdateGroupResponse.Latency";
                        }
                        return "Bugle.MessagingService.TriggerGroupNotificationResponse.Latency";
                    }
                    return "Bugle.MessagingService.RevokeMessageResponse.Latency";
                }
                return "Bugle.MessagingService.RemoveUserFromGroupResponse.Latency";
            }
            return "Bugle.MessagingService.AddUserToGroupResponse.Latency";
        }
        return "Bugle.MessagingService.CreateGroupResponse.Latency";
    }
}
