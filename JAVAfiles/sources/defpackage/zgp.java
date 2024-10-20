package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.block.ui.list.BlockedParticipantsActivity;
import com.google.android.apps.messaging.diagnostics.ui.DiagnosticsActivity;
import com.google.android.apps.messaging.home.ArchivedActivity;
import com.google.android.apps.messaging.home.SpamFolderActivity;
import com.google.android.apps.messaging.penpal.settings.GeminiSettingsActivity;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.suggestions.settings.SmartActionSettingsActivity;
import com.google.android.apps.messaging.suggestions.settings.SpotlightsSettingsActivity;
import com.google.android.apps.messaging.ui.ClassZeroActivity;
import com.google.android.apps.messaging.ui.PermissionCheckActivity;
import com.google.android.apps.messaging.ui.appsettings.AboutPrivacyTermsActivity;
import com.google.android.apps.messaging.ui.appsettings.ApplicationSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.FederatedLearningSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.NudgeSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.PerSubscriptionSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.RcsSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.RichCardsSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.SettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.SimMessagesActivity;
import com.google.android.apps.messaging.ui.appsettings.SimSelectionSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.SmartsSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.SpamSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.SwipeActionSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.verifiedsms.VerifiedSmsSettingsActivity;
import com.google.android.apps.messaging.ui.conversationlist.ForwardMessageActivity;
import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysActivity;
import com.google.android.apps.messaging.ui.debug.DebugMmsConfigActivity;
import com.google.android.apps.messaging.ui.debug.DebugMobileConfigurationActivity;
import com.google.android.apps.messaging.ui.debug.DebugPrefsActivity;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifBrowserActivity;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerActivity;
import com.google.android.apps.messaging.ui.rcs.setup.auto.RcsPromoActivity;
import com.google.android.apps.messaging.ui.rcs.setup.manual.PhoneNumberInputV2Activity;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zgp extends lzv {
    private final xnv a;
    private final xxe b;
    private final abbu c;
    private final Optional d;
    private final mee e;
    private final xce f;
    private final yjy g;
    private final armf h;
    private final gpx i;
    private final yyt j;

    public zgp(xnv xnvVar, xxe xxeVar, abbu abbuVar, gpx gpxVar, Optional optional, mee meeVar, xce xceVar, yjy yjyVar, yyt yytVar, armf armfVar) {
        this.a = xnvVar;
        this.b = xxeVar;
        this.c = abbuVar;
        this.i = gpxVar;
        this.d = optional;
        this.e = meeVar;
        this.f = xceVar;
        this.g = yjyVar;
        this.j = yytVar;
        this.h = armfVar;
    }

    private static Intent ac(Activity activity, Uri uri, Uri uri2) {
        Intent intent = new Intent(activity, (Class<?>) MediaViewerActivity.class);
        intent.putExtra("photos", uri2);
        intent.putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
        intent.setFlags(536870912);
        return intent;
    }

    private static Intent ad(Context context, int i, String str) {
        return new Intent(context, (Class<?>) PerSubscriptionSettingsActivity.class).putExtra("sub_id", i).putExtra("per_sub_setting_title", str);
    }

    @Override // defpackage.lzv
    public final void A(Context context) {
        context.startActivity(new Intent(context, (Class<?>) DiagnosticsActivity.class));
    }

    @Override // defpackage.lzv
    public final void B(Context context, Uri uri, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(1);
        if (this.f.a()) {
            intent.addFlags(268439552);
        }
        intent.setDataAndType(uri, str);
        this.c.p(context, intent);
    }

    @Override // defpackage.lzv
    public final void C(Context context, MessageCoreData messageCoreData, amwf amwfVar) {
        Intent putExtra = new Intent(context, (Class<?>) ForwardMessageActivity.class).putExtra("draft_data", messageCoreData);
        putExtra.putExtra("intent_source", amwfVar.e);
        context.startActivity(putExtra);
    }

    @Override // defpackage.lzv
    public final void D(Context context, Uri uri, String str) {
        Uri e = uhl.e(context, uri);
        if (str == null && (str = ydk.p(context, e)) == null) {
            str = "video/*";
        }
        this.d.isPresent();
        e.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(1);
        String scheme = e.getScheme();
        String path = e.getPath();
        if (scheme != null && scheme.equals("file") && path != null) {
            e = aasd.a(context, String.valueOf(context.getPackageName()).concat(".fileprovider"), new File(path));
        }
        intent.putExtra("SingleItemOnly", true);
        intent.setDataAndType(e, "video/*");
        this.c.p(context, intent);
        mee meeVar = this.e;
        amsg C = lgb.C(1, 1);
        aozy createBuilder = ampm.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ampm ampmVar = (ampm) createBuilder.b;
        ampmVar.b |= 8;
        ampmVar.g = str;
        meeVar.b(C, lgb.D(0, 1, (ampm) createBuilder.s()));
    }

    @Override // defpackage.lzv
    public final void E(cg cgVar, String str, int i, int i2, int i3, amqe amqeVar) {
        Intent intent = new Intent(cgVar.fe(), (Class<?>) GifBrowserActivity.class);
        intent.putExtra("search_text", str);
        intent.putExtra("max_attachment_width", i);
        intent.putExtra("max_attachment_height", i2);
        intent.putExtra("max_attachment_size", i3);
        if (amqeVar != null) {
            intent.putExtra("EXTRA_OPENING_SOURCE", amqeVar.name());
        }
        intent.putExtra("EXTRA_OPENING_TIME", this.a.f().toEpochMilli());
        cgVar.startActivityForResult(intent, 132);
    }

    @Override // defpackage.lzv
    public final void F(Context context, String str, String str2, boolean z, String str3) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setComponent(new ComponentName("com.google.android.apps.newsstand_exp", "com.google.apps.dots.android.newsstand.share.InContextActivity"));
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        intent.putExtra("extra_subject_mandatory", true);
        intent.putExtra("InContextActivity_omitPublicationModule", z);
        intent.putExtra("InContextActivity_realtimeBoostEventId", str3);
        intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        this.c.p(context, intent);
    }

    @Override // defpackage.lzv
    public final void G(Context context) {
        context.startActivity(n(context));
    }

    @Override // defpackage.lzv
    public final void H(Context context) {
        context.startActivity(new Intent(context, (Class<?>) SettingsActivity.class));
    }

    @Override // defpackage.lzv
    public final void I(Context context, ajwt ajwtVar) {
        Intent intent = new Intent(context, (Class<?>) SettingsActivity.class);
        ajya.c(intent, ajwtVar);
        context.startActivity(intent);
    }

    @Override // defpackage.lzv
    public final void J(Context context, ajwt ajwtVar) {
        Intent intent = new Intent(context, (Class<?>) SimSelectionSettingsActivity.class);
        ajya.c(intent, ajwtVar);
        context.startActivity(intent);
    }

    @Override // defpackage.lzv
    public final void K(MessagePartCoreData messagePartCoreData) {
        Uri t = messagePartCoreData.t();
        String U = messagePartCoreData.U();
        Uri v = messagePartCoreData.v();
        String str = null;
        if (!messagePartCoreData.bz() && !messagePartCoreData.bk()) {
            str = messagePartCoreData.X();
        }
        L(t, U, v, str);
    }

    @Override // defpackage.lzv
    public final void L(Uri uri, String str, Uri uri2, String str2) {
        ibr o = this.i.o("Testing");
        if (uri != null) {
            if (str != null) {
                o.b(uri, str, uri2, str2);
                o.e(new Void[0]);
                return;
            }
            throw new IllegalArgumentException("Requested to save attachment with null content type");
        }
        throw new IllegalArgumentException("Requested to save attachment with null content uri");
    }

    @Override // defpackage.lzv
    public final void M(Context context, msh mshVar, Point point, mdg mdgVar) {
        String str;
        String j = mshVar.j(true);
        j.getClass();
        String concat = "tel:".concat(j);
        yjy yjyVar = this.g;
        Uri parse = Uri.parse(concat);
        if (yjyVar.a() == 1) {
            str = "android.intent.action.CALL";
        } else {
            str = "android.intent.action.DIAL";
        }
        Intent intent = new Intent(str, parse);
        if (point != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("touchPoint", point);
            intent.putExtra("android.telecom.extra.OUTGOING_CALL_EXTRAS", bundle);
        }
        if (mdgVar != null) {
            mdgVar.b();
        }
        this.c.p(context, intent);
    }

    @Override // defpackage.lzv
    public final Intent N(String str, Uri uri, Uri uri2) {
        return new Intent("android.intent.action.RINGTONE_PICKER").putExtra("android.intent.extra.ringtone.TYPE", 2).putExtra("android.intent.extra.ringtone.TITLE", str).putExtra("android.intent.extra.ringtone.EXISTING_URI", uri).putExtra("android.intent.extra.ringtone.DEFAULT_URI", uri2);
    }

    @Override // defpackage.lzv
    public final void O(Context context, ajwt ajwtVar) {
        Intent intent = new Intent(context, (Class<?>) ApplicationSettingsActivity.class);
        intent.putExtra("top_level_settings", true);
        ajya.c(intent, ajwtVar);
        context.startActivity(intent);
    }

    @Override // defpackage.lzv
    public final void P(Context context) {
        Intent o = o(context);
        o.putExtra("open_setting_directly", context.getString(R.string.rcs_default_sharing_method_key));
        context.startActivity(o);
    }

    @Override // defpackage.lzv
    public final void Q(Activity activity, Uri uri, Uri uri2) {
        Intent ac = ac(activity, uri, uri2);
        ac.putExtra("opening_source", 1);
        activity.startActivity(ac);
        activity.overridePendingTransition(0, 0);
    }

    @Override // defpackage.lzv
    public final void R(cg cgVar, Uri uri, Uri uri2) {
        Intent ac = ac(cgVar.fe(), uri, uri2);
        ac.putExtra("opening_source", 1);
        cgVar.startActivityForResult(ac, 152);
        cgVar.fe().overridePendingTransition(0, 0);
    }

    @Override // defpackage.lzv
    public final void S(Activity activity, Uri uri, Uri uri2) {
        Intent ac = ac(activity, uri, uri2);
        ac.putExtra("opening_source", 5);
        activity.startActivity(ac);
        activity.overridePendingTransition(0, 0);
    }

    @Override // defpackage.lzv
    public final void T(cg cgVar, Uri uri, Uri uri2) {
        Intent ac = ac(cgVar.fe(), uri, uri2);
        ac.putExtra("opening_source", 5);
        cgVar.startActivityForResult(ac, 152);
        cgVar.fe().overridePendingTransition(0, 0);
    }

    @Override // defpackage.lzv
    public final void U(Activity activity, String str, int i) {
        this.j.M(str, wfx.INPUT_FULLSCREEN, i);
        Intent intent = new Intent(activity, (Class<?>) PhoneNumberInputV2Activity.class);
        intent.putExtra("phone_number_input_ui_event_source_extra_key", a.ak(i));
        intent.putExtra("phone_number_input_ui_event_sim_id_extra_key", str);
        activity.startActivityForResult(intent, 1038);
    }

    @Override // defpackage.lzv
    public final void V(Context context) {
        context.startActivity(new Intent(context, (Class<?>) RcsPromoActivity.class));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.lzv
    public final void W(Activity activity) {
        yyt yytVar = this.j;
        wfx wfxVar = wfx.INPUT_FULLSCREEN;
        aozy N = yytVar.N(3, 4);
        if (!N.b.isMutable()) {
            N.u();
        }
        wfy wfyVar = (wfy) N.b;
        wfy wfyVar2 = wfy.a;
        wfyVar.h = wfxVar.a();
        wfyVar.b |= 64;
        ((whj) yytVar.a).b(((adtn) yytVar.c).l(), (wfy) N.s()).k(qiu.b(), yytVar.b);
        Intent intent = new Intent(activity, (Class<?>) PhoneNumberInputV2Activity.class);
        intent.putExtra("phone_number_input_ui_event_source_extra_key", a.ak(3));
        activity.startActivityForResult(intent, 1038);
    }

    @Override // defpackage.lzv
    public final void X(Context context) {
        Intent intent = new Intent(context, (Class<?>) SpamFolderActivity.class);
        intent.putExtra("spam_folder_opened_source", 1);
        context.startActivity(intent);
    }

    @Override // defpackage.ycw
    public final void Y(Context context) {
        context.startActivity(new Intent(context, (Class<?>) DebugMmsConfigActivity.class));
    }

    @Override // defpackage.ycw
    public final void Z(Context context) {
        context.startActivity(new Intent(context, (Class<?>) DebugMobileConfigurationActivity.class));
    }

    @Override // defpackage.lzp
    public final void a(Context context) {
        context.startActivity(new Intent(context, (Class<?>) PermissionCheckActivity.class));
    }

    @Override // defpackage.ycw
    public final void aa(Context context) {
        context.startActivity(new Intent(context, (Class<?>) DebugPrefsActivity.class));
    }

    @Override // defpackage.ycw
    public final void ab(Context context) {
        context.startActivity(new Intent(context, (Class<?>) DebugGServiceKeysActivity.class));
    }

    @Override // defpackage.lzu
    public final Intent b(Context context) {
        return new Intent(context, (Class<?>) FederatedLearningSettingsActivity.class);
    }

    @Override // defpackage.lzu
    public final Intent c(Context context) {
        return new Intent(context, (Class<?>) GeminiSettingsActivity.class);
    }

    @Override // defpackage.lzu
    public final Intent d(Context context) {
        return new Intent(context, (Class<?>) NudgeSettingsActivity.class);
    }

    @Override // defpackage.lzu
    public final Intent e(Context context) {
        return new Intent(context, (Class<?>) SmartActionSettingsActivity.class);
    }

    @Override // defpackage.lzu
    public final Intent f(Context context) {
        return new Intent(context, (Class<?>) SmartsSettingsActivity.class);
    }

    @Override // defpackage.lzu
    public final Intent g(Context context) {
        return new Intent(context, (Class<?>) SpotlightsSettingsActivity.class);
    }

    @Override // defpackage.lzu
    public final void h(Context context) {
        context.startActivity(new Intent(context, (Class<?>) SmartsSettingsActivity.class));
    }

    @Override // defpackage.lzv
    public final Intent i(Context context) {
        return new Intent(context, (Class<?>) AboutPrivacyTermsActivity.class);
    }

    @Override // defpackage.lzv
    public final Intent j(Context context) {
        return ad(context, -1, null);
    }

    @Override // defpackage.lzv
    public final Intent k(Context context, int i, String str) {
        return ad(context, i, str);
    }

    @Override // defpackage.lzv
    public final Intent l(Activity activity) {
        Intent createRequestRoleIntent;
        if (yhx.c) {
            createRequestRoleIntent = aei$$ExternalSyntheticApiModelOutline0.m(activity.getSystemService(aei$$ExternalSyntheticApiModelOutline0.m26m())).createRequestRoleIntent("android.app.role.SMS");
            return createRequestRoleIntent;
        }
        Intent intent = new Intent("android.provider.Telephony.ACTION_CHANGE_DEFAULT");
        intent.putExtra("package", activity.getPackageName());
        return intent;
    }

    @Override // defpackage.lzv
    public final Intent m(Context context, int i) {
        Intent intent = new Intent(context, (Class<?>) SimMessagesActivity.class);
        intent.putExtra("sub_id", i);
        return intent;
    }

    @Override // defpackage.lzv
    public final Intent n(Context context) {
        return (Intent) ((Optional) ((apxx) this.h).a).map(new yur(context, 14)).orElseGet(new wxx(context, 18));
    }

    @Override // defpackage.lzv
    public final Intent o(Context context) {
        return new Intent(context, (Class<?>) RcsSettingsActivity.class).putExtra("sub_id", -1);
    }

    @Override // defpackage.lzv
    public final Intent p(Context context) {
        return new Intent(context, (Class<?>) RichCardsSettingsActivity.class);
    }

    @Override // defpackage.lzv
    public final Intent q(Context context) {
        return new Intent(context, (Class<?>) SpamSettingsActivity.class);
    }

    @Override // defpackage.lzv
    public final Intent r(Context context) {
        return new Intent(context, (Class<?>) SwipeActionSettingsActivity.class);
    }

    @Override // defpackage.lzv
    public final Intent s(Context context) {
        return new Intent(context, (Class<?>) VerifiedSmsSettingsActivity.class);
    }

    @Override // defpackage.lzv
    public final Intent t(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(new ComponentName(pzr.a(context), "com.android.cellbroadcastreceiver.CellBroadcastListActivity"));
        intent.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        return intent;
    }

    @Override // defpackage.lzv
    public final void w(Context context, ajwt ajwtVar) {
        Intent intent = new Intent(context, (Class<?>) ArchivedActivity.class);
        ajya.c(intent, ajwtVar);
        context.startActivity(intent);
    }

    @Override // defpackage.lzv
    public final void x(Context context) {
        xxe xxeVar = this.b;
        qiu.h(aktp.ai(new wkf(xxeVar, 16), xxeVar.f).h(new way(xxeVar, context, BlockedParticipantsActivity.class, 19, (short[]) null), xxeVar.e));
    }

    @Override // defpackage.lzv
    public final void y(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (this.f.a()) {
            intent.addFlags(268439552);
        }
        this.c.p(context, intent);
    }

    @Override // defpackage.lzv
    public final void z(Context context, ContentValues contentValues) {
        context.startActivity(new Intent(context, (Class<?>) ClassZeroActivity.class).putExtra("message_values", contentValues).setFlags(402653184));
    }
}
