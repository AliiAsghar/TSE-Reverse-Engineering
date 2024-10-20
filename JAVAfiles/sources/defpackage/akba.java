package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akba {
    public final Notification a;
    final int b;
    final String c;

    public akba(Notification notification, int i, String str) {
        this.a = notification;
        this.b = i;
        this.c = str;
    }

    public final String toString() {
        String channelId;
        channelId = this.a.getChannelId();
        return "Trace=[" + this.c + "], importance=[" + this.b + "]" + (", notification=[" + channelId + "]");
    }
}
