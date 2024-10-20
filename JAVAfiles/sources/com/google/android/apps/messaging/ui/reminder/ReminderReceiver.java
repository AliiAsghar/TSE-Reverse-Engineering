package com.google.android.apps.messaging.ui.reminder;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.aauv;
import defpackage.abaj;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.armf;
import defpackage.ruy;
import defpackage.rvc;
import defpackage.vco;
import defpackage.vjs;
import defpackage.vlm;
import defpackage.ydl;
import defpackage.zcd;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ReminderReceiver extends abaj {
    private static final alvi e = alvi.m("com/google/android/apps/messaging/ui/reminder/ReminderReceiver");
    public Optional a;
    public aksr b;
    public armf c;
    public armf d;

    @Override // defpackage.wng
    public final akrc a() {
        return this.b.b("ReminderReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.Reminder.Latency";
    }

    @Override // defpackage.wng
    public final void c(Context context, Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.apps.messaging.set_reminder".equals(action)) {
            ConversationIdType b = ruy.b(intent.getStringExtra("conversation_id"));
            if (!rvc.b(intent.getStringExtra("message_id")).b() && !b.b()) {
                alvw g = e.g();
                g.X(alwp.a, "BugleNotifications");
                alvg alvgVar = (alvg) g;
                alvgVar.X(ydl.o, b.toString());
                ((alvg) alvgVar.h("com/google/android/apps/messaging/ui/reminder/ReminderReceiver", "processBroadcast", 101, "ReminderReceiver.java")).q("Setting reminder, canceling IM notification");
                ((vco) this.c.b()).u(vlm.NT_INCOMING_MESSAGE, ((vjs) this.d.b()).s(b));
                this.a.ifPresent(new aauv(this, 7));
                return;
            }
            return;
        }
        if ("com.google.android.apps.messaging.trigger_reminder".equals(action)) {
            if (!TextUtils.isEmpty(intent.getStringExtra("reminder_id"))) {
                this.a.ifPresent(new aauv(this, 8));
                return;
            } else {
                this.a.ifPresent(new aauv(this, 9));
                return;
            }
        }
        if ("com.google.android.apps.messaging.dismiss_reminder_notifications".equals(action)) {
            if (intent.getStringArrayExtra("reminder_ids") != null) {
                this.a.ifPresent(new aauv(this, 10));
                return;
            }
            return;
        }
        if ("com.google.android.apps.messaging.mark_as_done".equals(action)) {
            if (!TextUtils.isEmpty(intent.getStringExtra("reminder_id"))) {
                this.a.ifPresent(new aauv(this, 11));
                return;
            }
            return;
        }
        if ("com.google.android.apps.messaging.snooze_reminder".equals(action)) {
            String stringExtra = intent.getStringExtra("reminder_id");
            ruy.b(intent.getStringExtra("conversation_id"));
            if (!TextUtils.isEmpty(stringExtra)) {
                this.a.ifPresent(new aauv(this, 12));
                return;
            }
            return;
        }
        if ("com.google.android.apps.messaging.view_reminder".equals(action)) {
            ConversationIdType b2 = ruy.b(intent.getStringExtra("conversation_id"));
            String stringExtra2 = intent.getStringExtra("reminder_id");
            if (!b2.b() && !TextUtils.isEmpty(stringExtra2)) {
                this.a.ifPresent(new zcd(this, b2, 19, null));
            }
        }
    }

    @Override // defpackage.wng
    protected final int e() {
        return 18;
    }
}
