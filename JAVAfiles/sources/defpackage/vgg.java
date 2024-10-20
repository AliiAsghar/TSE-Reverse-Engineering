package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vgg implements vja {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ vgg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.vja
    public final Notification a(String str) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    Context context = ((xcm) this.a).a;
                    Resources resources = context.getResources();
                    dyu dyuVar = new dyu(context, str);
                    dyuVar.i(resources.getString(R.string.exhausted_storage_space_notification_and_dialog_title));
                    dyuVar.v(resources.getString(R.string.exhausted_storage_space_notification_body));
                    dyuVar.q(R.drawable.ic_warning_light);
                    dyuVar.l = 3;
                    dyuVar.o(false);
                    dyuVar.g(false);
                    dyo dyoVar = new dyo(dyuVar);
                    dyoVar.d(resources.getString(R.string.exhausted_storage_space_notification_body));
                    dyuVar.t(dyoVar);
                    return dyuVar.a();
                }
                dyu dyuVar2 = new dyu((Context) ((vco) this.a).a, str);
                dyuVar2.i("Messages In-App Diagnostics");
                dyuVar2.h("Diagnosing in progress...");
                dyuVar2.q(R.drawable.ic_warning_light);
                return dyuVar2.a();
            }
            kkc kkcVar = (kkc) this.a;
            Context context2 = (Context) kkcVar.b;
            String string = context2.getString(R.string.account_removed_notification_title);
            String string2 = context2.getString(R.string.account_removed_notification_body);
            dyu dyuVar3 = new dyu(context2, str);
            dyuVar3.i(string);
            dyuVar3.h(string2);
            dyuVar3.q(R.drawable.notification_icon);
            dyuVar3.l = 0;
            dyo dyoVar2 = new dyo(dyuVar3);
            dyoVar2.d(string2);
            dyuVar3.t(dyoVar2);
            if (((Optional) kkcVar.c).isPresent() && !((Boolean) xxy.e.e()).booleanValue()) {
                Intent a = ((ihk) ((Optional) kkcVar.c).get()).a();
                TaskStackBuilder create = TaskStackBuilder.create((Context) kkcVar.b);
                create.addNextIntentWithParentStack(a);
                PendingIntent pendingIntent = create.getPendingIntent(0, yhy.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
                pendingIntent.getClass();
                dyuVar3.g(true);
                dyuVar3.g = pendingIntent;
            }
            return dyuVar3.a();
        }
        wpp wppVar = (wpp) this.a;
        String string3 = ((Context) wppVar.c).getString(R.string.gaia_pairing_verification_notification_title);
        if (yhx.e) {
            string3 = ((Context) wppVar.c).getString(R.string.gaia_pairing_verification_notification_short_title);
        }
        dyu dyuVar4 = new dyu((Context) wppVar.c, str);
        dyuVar4.h(string3);
        dyuVar4.C = ((Context) wppVar.c).getColor(R.color.primary_brand_non_icon_color);
        dyuVar4.q(R.drawable.notification_icon);
        dyuVar4.l = 1;
        dyuVar4.g(true);
        dyuVar4.J = ((Long) trf.a.e()).longValue();
        ((Optional) wppVar.b).isPresent();
        return dyuVar4.a();
    }
}
