package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.SpamFolderActivity;
import com.google.android.apps.messaging.shared.notification.receiver.DismissNotificationReceiver;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class iie implements vja {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ iie(gpx gpxVar, int i) {
        this.c = i;
        this.a = gpxVar;
        this.b = "test_receiver@gmail.com";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v18, types: [qoq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v34, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v38, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v45, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.vja
    public final Notification a(String str) {
        Intent a;
        amme ammeVar;
        Object obj;
        int i = this.c;
        int i2 = R.drawable.notification_icon;
        if (i != 0) {
            if (i != 1) {
                Object obj2 = null;
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            yyt yytVar = (yyt) this.b;
                            Context context = (Context) yytVar.b;
                            Resources resources = context.getResources();
                            dyu dyuVar = new dyu(context, str);
                            String string = resources.getString(R.string.report_issue_notification_text);
                            viw viwVar = (viw) this.a;
                            String str2 = (String) viwVar.b.orElse(string);
                            dyuVar.h(str2);
                            dyuVar.v(str2);
                            dyo dyoVar = new dyo(dyuVar);
                            dyoVar.d(str2);
                            dyuVar.t(dyoVar);
                            dyuVar.l = 3;
                            dyuVar.q(R.drawable.notification_icon);
                            dyuVar.k(((luj) yytVar.c).a(viwVar.a));
                            Bundle bundle = new Bundle();
                            bundle.putInt("issue_type_extra", viwVar.a.o);
                            dyuVar.B = bundle;
                            boolean isPresent = viwVar.c.isPresent();
                            amme ammeVar2 = viwVar.a;
                            if (isPresent) {
                                obj = viwVar.c.get();
                                if (ammeVar2 == amme.UNKNOWN_ISSUE_TYPE) {
                                    ammeVar2 = amme.SILENT_CRASH;
                                }
                                ammeVar = ammeVar2;
                            } else {
                                ammeVar = ammeVar2;
                                obj = null;
                            }
                            if (viwVar.d.isPresent()) {
                                obj2 = viwVar.d.get();
                            }
                            dyuVar.g = ((luj) yytVar.c).d("com.google.android.apps.messaging.shared.reportissue.LAUNCH_FEEDBACK_FROM_NOTIFICATION", 2, ammeVar, (Throwable) obj, (alor) obj2);
                            return dyuVar.a();
                        }
                        vif vifVar = (vif) this.a;
                        dyu dyuVar2 = new dyu(vifVar.c, str);
                        ?? r13 = this.b;
                        dyuVar2.h(r13);
                        dyuVar2.l = 0;
                        dyuVar2.v(r13);
                        dyo dyoVar2 = new dyo(dyuVar2);
                        dyoVar2.d(r13);
                        dyuVar2.t(dyoVar2);
                        dyuVar2.C = vifVar.c.getColor(R.color.silent_notification_icon_color);
                        if (true == ((Boolean) vif.b.e()).booleanValue()) {
                            i2 = R.drawable.quantum_gm_ic_sms_white_24;
                        }
                        dyuVar2.q(i2);
                        if (((Boolean) vif.a.e()).booleanValue() && vifVar.g.isEmpty()) {
                            dyuVar2.e(((wpp) vifVar.e.b()).M(amme.PERSISTENT_FOREGROUND_NOTIFICATION));
                        }
                        return dyuVar2.a();
                    }
                    yyt yytVar2 = (yyt) this.a;
                    dyu dyuVar3 = new dyu((Context) yytVar2.b, str);
                    ?? r132 = this.b;
                    dyuVar3.h(r132);
                    dyuVar3.q(R.drawable.quantum_gm_ic_sync_white_24);
                    dyuVar3.l = 0;
                    dyuVar3.v(r132);
                    dyo dyoVar3 = new dyo(dyuVar3);
                    dyoVar3.d(r132);
                    dyuVar3.t(dyoVar3);
                    dyuVar3.C = ((Context) yytVar2.b).getColor(R.color.silent_notification_icon_color);
                    Intent d = ((qoq) yytVar2.a.b()).d((Context) yytVar2.b);
                    d.setAction("android.intent.action.VIEW");
                    TaskStackBuilder create = TaskStackBuilder.create((Context) yytVar2.b);
                    create.addNextIntentWithParentStack(d);
                    PendingIntent pendingIntent = create.getPendingIntent(0, yhy.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
                    dyuVar3.g(true);
                    dyuVar3.g = pendingIntent;
                    return dyuVar3.a();
                }
                wyp wypVar = (wyp) this.b;
                dyu dyuVar4 = new dyu((Context) wypVar.e, str);
                vhu vhuVar = vhu.AUTOMOVED_SPAM;
                Context context2 = (Context) wypVar.e;
                Intent intent = new Intent(context2, (Class<?>) DismissNotificationReceiver.class);
                intent.setAction("com.google.android.apps.messaging.dismiss_notification");
                intent.putExtra("NOTIFICATION_ID", vhuVar.F);
                ClipData clipData = aipr.a;
                PendingIntent b = aipr.b(context2, 136, intent, 335544320);
                Context context3 = (Context) wypVar.e;
                Intent intent2 = new Intent(context3, (Class<?>) SpamFolderActivity.class);
                intent2.putExtra("spam_folder_opened_source", 2);
                dzx dzxVar = new dzx(context3);
                dzxVar.d(intent2);
                PendingIntent a2 = dzxVar.a(0, 201326592);
                a2.getClass();
                Optional of = Optional.of(a2);
                if (of.isEmpty()) {
                    return null;
                }
                Object obj3 = this.a;
                if (obj3 != null) {
                    dyuVar4.m((Bitmap) obj3);
                }
                dyuVar4.i(((Context) wypVar.e).getString(R.string.automoved_spam_notification_content_title));
                dyuVar4.h(((Context) wypVar.e).getString(R.string.automoved_spam_notification_content_text));
                dyuVar4.l = 2;
                dyuVar4.q(R.drawable.notification_icon);
                dyuVar4.d(R.drawable.ic_check_circle_gray, ((Context) wypVar.e).getString(R.string.automoved_spam_notification_action_dismiss), b);
                dyuVar4.d(R.drawable.quantum_ic_googleplus_reshare_googblue_24, ((Context) wypVar.e).getString(R.string.automoved_spam_notification_action_view), (PendingIntent) of.get());
                dyuVar4.g = (PendingIntent) of.get();
                dyuVar4.g(true);
                dyuVar4.p(true);
                dyuVar4.C = ((Context) wypVar.e).getColor(R.color.silent_notification_icon_color);
                return dyuVar4.a();
            }
            ico icoVar = (ico) this.b;
            dzx dzxVar2 = new dzx((Context) icoVar.a);
            Intent intent3 = (Intent) this.a;
            dzxVar2.d(intent3);
            PendingIntent a3 = dzxVar2.a(0, yhy.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
            ((Context) icoVar.a).getString(R.string.cms_vital_error_notification_title);
            ((Context) icoVar.a).getString(R.string.cms_vital_error_notification_message);
            Context context4 = (Context) icoVar.a;
            String string2 = context4.getString(R.string.unspecified_opt_out_bnr_notification_title);
            String string3 = context4.getString(R.string.unspecified_opt_out_bnr_notification_body);
            if (intent3.getIntExtra("CMS_FEATURE_KEY", -1) == 1) {
                string2 = ((Context) icoVar.a).getString(R.string.unspecified_opt_out_multidevice_notification_title);
                string3 = ((Context) icoVar.a).getString(R.string.unspecified_opt_out_multidevice_notification_body);
            }
            dyu dyuVar5 = new dyu((Context) icoVar.a, str);
            dyuVar5.i(string2);
            dyuVar5.h(string3);
            dyuVar5.q(R.drawable.notification_icon);
            dyuVar5.g(true);
            dyuVar5.l = 0;
            dyuVar5.g = a3;
            return dyuVar5.a();
        }
        Object[] objArr = {this.b};
        gpx gpxVar = (gpx) this.a;
        String string4 = ((Context) gpxVar.b).getString(R.string.dasher_disabled_notification_title, objArr);
        Context context5 = (Context) gpxVar.b;
        String string5 = context5.getString(R.string.dasher_disabled_notification_body);
        dyu dyuVar6 = new dyu(context5, str);
        dyuVar6.i(string4);
        dyuVar6.h(string5);
        dyuVar6.q(R.drawable.notification_icon);
        dyuVar6.l = 0;
        dyo dyoVar4 = new dyo(dyuVar6);
        dyoVar4.d(string5);
        dyuVar6.t(dyoVar4);
        if (((Optional) gpxVar.d).isPresent()) {
            if (((Boolean) xxy.e.e()).booleanValue()) {
                a = gpxVar.a.d((Context) gpxVar.b);
            } else {
                a = ((ihk) ((Optional) gpxVar.d).get()).a();
            }
            TaskStackBuilder create2 = TaskStackBuilder.create((Context) gpxVar.b);
            create2.addNextIntentWithParentStack(a);
            PendingIntent pendingIntent2 = create2.getPendingIntent(0, yhy.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
            pendingIntent2.getClass();
            dyuVar6.g(true);
            dyuVar6.g = pendingIntent2;
        }
        return dyuVar6.a();
    }

    public /* synthetic */ iie(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ iie(Object obj, String str, int i) {
        this.c = i;
        this.a = obj;
        this.b = str;
    }
}
