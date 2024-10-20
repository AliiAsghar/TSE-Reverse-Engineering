package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaln extends xzs {
    final /* synthetic */ Activity a;
    final /* synthetic */ aalt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaln(aalt aaltVar, Activity activity) {
        super("Bugle.Async.DebugUtils.showNotificationChannelsInfo.Duration");
        this.a = activity;
        this.b = aaltVar;
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        List notificationChannels;
        CharSequence name;
        String id;
        String description;
        String group;
        Uri sound;
        int importance;
        boolean canShowBadge;
        boolean shouldVibrate;
        aalt aaltVar = this.b;
        NotificationManager notificationManager = (NotificationManager) aaltVar.y.getSystemService("notification");
        if (notificationManager == null) {
            return "Unable to retrieve notification manager.";
        }
        notificationChannels = notificationManager.getNotificationChannels();
        ArrayList arrayList = new ArrayList(notificationChannels);
        StringBuilder sb = new StringBuilder();
        sb.append("Found ");
        sb.append(arrayList.size());
        sb.append(" channel(s)");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            NotificationChannel m = bl$$ExternalSyntheticApiModelOutline0.m(arrayList.get(i));
            sb.append("\n");
            StringBuilder sb2 = new StringBuilder();
            name = m.getName();
            sb2.append(name.toString());
            id = m.getId();
            ytd.f(sb2, "Id: ", id, "\n");
            ytd.f(sb2, "Conversation: ", String.valueOf(((rtz) aaltVar.E.b()).I(ruy.b(id))), "\n");
            description = m.getDescription();
            ytd.f(sb2, "Description: ", description, "\n");
            group = m.getGroup();
            ytd.f(sb2, "Group: ", group, "\n");
            sound = m.getSound();
            ytd.f(sb2, "Sound: ", sound.toString(), "\n");
            importance = m.getImportance();
            ytd.f(sb2, "Importance: ", String.valueOf(importance), "\n");
            canShowBadge = m.canShowBadge();
            ytd.f(sb2, "Show badge: ", String.valueOf(canShowBadge), "\n");
            shouldVibrate = m.shouldVibrate();
            ytd.f(sb2, "Vibration: ", String.valueOf(shouldVibrate), "\n");
            ytd.e(sb, sb2.toString(), "\n");
        }
        return sb.toString();
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        new AlertDialog.Builder(this.a).setTitle("Notification channels").setMessage((String) obj).setCancelable(true).show();
    }
}
