package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.notification2o.NotificationsReceiver;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vkl {
    public static final alwo a = alwo.o("BugleNotifications");
    public final Context b;
    public final vlk c;
    public final vln d;
    public final apwt e;
    public final vkt f;
    public final xnv g;
    public final Optional h;
    public final aneo i;
    public final anen j;
    public final armf k;
    public final armf l;
    public final vjs m;
    private final Optional n;

    public vkl(Context context, vlk vlkVar, vln vlnVar, apwt apwtVar, vjs vjsVar, vkt vktVar, Optional optional, xnv xnvVar, Optional optional2, aneo aneoVar, anen anenVar, armf armfVar, armf armfVar2) {
        this.b = context;
        this.c = vlkVar;
        this.d = vlnVar;
        this.e = apwtVar;
        this.m = vjsVar;
        this.f = vktVar;
        this.n = optional;
        this.g = xnvVar;
        this.h = optional2;
        this.i = aneoVar;
        this.j = anenVar;
        this.k = armfVar;
        this.l = armfVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v18, types: [android.os.Parcelable, java.lang.Object] */
    public final dyk a(vkh vkhVar, vkn vknVar, vke vkeVar, Bundle bundle) {
        boolean z;
        PendingIntent b;
        int i;
        Bundle deepCopy;
        if (vkeVar.l.isPresent() && ((dzw[]) vkeVar.l.get()).length > 0) {
            z = true;
        } else {
            z = false;
        }
        IconCompat iconCompat = (IconCompat) vkeVar.i.orElse(null);
        CharSequence charSequence = vkeVar.d;
        vjs vjsVar = this.m;
        vlm d = vkhVar.d();
        Optional optional = vknVar.a;
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("extra_notification_bundle", bundle);
        bundle2.putInt("extra_notification_type", d.i);
        bundle2.putInt("extra_notification_action_type", vkeVar.a.o);
        bundle2.putBoolean("extra_is_summary_notification", false);
        optional.ifPresent(new uoa(bundle2, 19));
        bundle2.putAll(vkeVar.b);
        if (vkeVar.g.isPresent()) {
            bundle2.putParcelable("extra_pending_intent_to_run", vkeVar.g.get());
        }
        String str = d.name() + "_" + vkeVar.a.name();
        if (optional.isPresent()) {
            str = str + "_" + ((String) optional.get());
        }
        if (vkeVar.h.isPresent()) {
            Intent intent = (Intent) vkeVar.h.get();
            if (TextUtils.isEmpty(intent.getAction())) {
                intent.setAction(str);
            }
            bundle2.putBoolean("extra_is_from_notification_for_ui_handling", true);
            intent.putExtras(bundle2);
            if (vkeVar.c) {
                dzx dzxVar = new dzx((Context) vjsVar.a);
                dzxVar.d(intent);
                Object obj = vjsVar.a;
                Intent[] b2 = dzxVar.b();
                int a2 = yhy.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
                Bundle bundle3 = new Bundle();
                albo.T(true);
                b = PendingIntent.getActivities((Context) obj, 4320, b2, a2 | VCardConfig.FLAG_APPEND_TYPE_PARAM, bundle3);
            } else {
                b = aipr.a((Context) vjsVar.a, 4320, intent, yhy.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
            }
        } else {
            Intent intent2 = new Intent((Context) vjsVar.a, (Class<?>) NotificationsReceiver.class);
            intent2.setAction(str);
            intent2.putExtras(bundle2);
            if (z) {
                Object obj2 = vjsVar.a;
                if (true != yhx.e) {
                    i = 0;
                } else {
                    i = VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
                }
                b = aipr.c((Context) obj2, 4320, intent2, i | VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS, 23);
            } else {
                b = aipr.b((Context) vjsVar.a, 4320, intent2, yhy.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
            }
        }
        dyj dyjVar = new dyj(iconCompat, charSequence, b);
        Bundle bundle4 = new Bundle();
        bundle4.putInt("extra_notification_action_type", vkeVar.a.o);
        Optional optional2 = vkeVar.h;
        if (vkeVar.e && optional2.isPresent()) {
            String action = ((Intent) optional2.get()).getAction();
            Bundle extras = ((Intent) optional2.get()).getExtras();
            boolean z2 = vkeVar.f;
            if (!this.n.isPresent()) {
                Bundle bundle5 = new Bundle();
                bundle5.putInt(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, 2);
                bundle5.putString(GroupManagementRequest.ACTION_TAG, action);
                bundle5.putString("packageName", this.b.getPackageName());
                bundle5.putInt("flags", 268468224);
                if (extras != null) {
                    deepCopy = extras.deepCopy();
                    bundle5.putBundle("extras", deepCopy);
                }
                dyjVar.b.putBundle("com.google.android.wearable.preview.extra.REMOTE_INTENT", bundle5);
                if (z2) {
                    dyjVar.b.putBoolean("com.google.android.wearable.preview.extra.REMOTE_CONTENT_INTENT", true);
                }
            }
        }
        dyjVar.b(bundle4);
        dyjVar.d = vkeVar.h.isPresent();
        if (vkeVar.k.isPresent()) {
            dyjVar.c = ((Integer) vkeVar.k.get()).intValue();
        }
        if (vkeVar.j.isPresent()) {
            dyjVar.a = ((Boolean) vkeVar.j.get()).booleanValue();
        }
        if (z) {
            for (dzw dzwVar : (dzw[]) vkeVar.l.get()) {
                dyjVar.c(dzwVar);
            }
        }
        return dyjVar.a();
    }

    public final void b(dyu dyuVar, vlm vlmVar, Bundle bundle, Optional optional, boolean z, vlb vlbVar, Optional optional2) {
        dyuVar.g = this.m.u(vko.NOTIFICATION_CLICKED, vlmVar, optional, vlbVar, z, false, bundle);
        vlc a2 = vlc.a(Optional.empty(), Optional.empty());
        optional2.isPresent();
        dyuVar.k(this.m.v(vko.NOTIFICATION_SWIPED, vlmVar, optional, a2, z, bundle));
    }
}
