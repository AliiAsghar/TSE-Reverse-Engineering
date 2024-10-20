package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.AppCompatTextView;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.settings.InfoAndOptionsActivity;
import com.google.android.apps.messaging.messagedetails.MessageDetailsActivity;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmj implements lju {
    private final /* synthetic */ int a;
    private final Object b;

    public lmj(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.lju
    public final /* synthetic */ Object a(lkf lkfVar, arpe arpeVar) {
        Intent putExtra;
        switch (this.a) {
            case 0:
                lmi lmiVar = (lmi) lkfVar;
                Activity al = aabr.al((Context) this.b);
                if (al != null) {
                    if (lmiVar.b) {
                        aktp.J(new lnx(lmiVar.a), al);
                    } else {
                        aktp.J(lnw.a, al);
                    }
                    return arnb.a;
                }
                throw new IllegalArgumentException("ExitRenameGroupNavigationHandler must be created with an activity context.");
            case 1:
                ((jci) this.b).b.g();
                ((alvg) jci.a.i().h("com/google/android/apps/messaging/conversation2/Conversation2EnabledModifier", "toggleAndRestart", 31, "Conversation2EnabledModifier.kt")).q("Overrides not available in this build");
                return arnb.a;
            case 2:
                lmr lmrVar = (lmr) lkfVar;
                Activity al2 = aabr.al((Context) this.b);
                if (al2 != null) {
                    ConversationId conversationId = lmrVar.a;
                    String str = lmrVar.b;
                    Intent intent = new Intent(al2, (Class<?>) InfoAndOptionsActivity.class);
                    intent.putExtra("conversation_id", conversationId.b());
                    intent.putExtra("mapi_conversation_id", conversationId);
                    intent.putExtra("mapi_conversation_kind", conversationId.a().a());
                    intent.putExtra("is_rcs_conversation", true);
                    intent.putExtra("is_group_conversation", false);
                    intent.putExtra("rbm_bot_id", str);
                    akto.n(al2, intent);
                    return arnb.a;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 3:
                lmu lmuVar = (lmu) lkfVar;
                SpannableString spannableString = new SpannableString(lmuVar.a.subSequence(lmuVar.c, lmuVar.d).toString());
                spannableString.setSpan(lmuVar.b, 0, spannableString.length(), 33);
                ClickableSpan clickableSpan = lmuVar.b;
                float f = lmuVar.e;
                float f2 = lmuVar.f;
                aiut.c();
                ktk ktkVar = (ktk) this.b;
                ktkVar.a();
                AppCompatTextView appCompatTextView = new AppCompatTextView((Context) ktkVar.a);
                appCompatTextView.setAlpha(brg.a);
                appCompatTextView.setTextSize(0, 1.0f);
                appCompatTextView.setText(spannableString, TextView.BufferType.SPANNABLE);
                appCompatTextView.setX(f);
                appCompatTextView.setY(f2);
                appCompatTextView.setFocusable(true);
                appCompatTextView.setFocusableInTouchMode(true);
                appCompatTextView.requestFocus();
                ((Activity) ktkVar.a).addContentView(appCompatTextView, (ViewGroup.LayoutParams) ktkVar.b);
                ktkVar.c = appCompatTextView;
                Object obj = ktkVar.c;
                obj.getClass();
                clickableSpan.onClick((View) obj);
                return arnb.a;
            case 4:
                new Intent((Context) this.b, (Class<?>) MessageDetailsActivity.class);
                throw null;
            case 5:
                Intent intent2 = new Intent();
                intent2.setAction("com.google.chat.smartmessaging.penpal.PHOTOBOOTH");
                intent2.putExtra("imageUri", ((lnl) lkfVar).a);
                ((Context) this.b).startActivity(intent2);
                return arnb.a;
            case 6:
                if (yhx.e) {
                    putExtra = new Intent("android.settings.PREMIUM_SMS_SETTINGS").setData(Uri.parse("package: com.android.settings"));
                } else {
                    putExtra = new Intent("android.settings.APP_SEARCH_SETTINGS").putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, ((Context) this.b).getString(R.string.premium_sms_search_query));
                }
                putExtra.getClass();
                akto.n((Context) this.b, putExtra);
                return arnb.a;
            case 7:
                Intent putExtra2 = new Intent().setComponent(new ComponentName((Context) this.b, "com.google.android.apps.messaging.ui.appsettings.RcsSettingsActivity")).putExtra("sub_id", -1);
                putExtra2.getClass();
                akto.n((Context) this.b, putExtra2);
                return arnb.a;
            case 8:
                Intent putExtra3 = new Intent().setComponent(new ComponentName((Context) this.b, "com.google.android.apps.messaging.ui.appsettings.RichCardsSettingsActivity")).putExtra("sub_id", -1);
                putExtra3.getClass();
                akto.n((Context) this.b, putExtra3);
                return arnb.a;
            case 9:
                CharSequence text = ((Context) this.b).getText(R.string.action_share);
                text.getClass();
                ((Context) this.b).startActivity(Intent.createChooser(((log) lkfVar).a, text));
                return arnb.a;
            case 10:
                Context context = (Context) this.b;
                akto.n(context, hwr.k(context));
                return arnb.a;
            default:
                akto.n((Context) this.b, new Intent("android.settings.WIRELESS_SETTINGS"));
                return arnb.a;
        }
    }

    public lmj(Context context, gpx gpxVar, int i) {
        this.a = i;
        gpxVar.getClass();
        this.b = context;
    }

    public lmj(jci jciVar, int i) {
        this.a = i;
        jciVar.getClass();
        this.b = jciVar;
    }

    public lmj(ktk ktkVar, int i) {
        this.a = i;
        ktkVar.getClass();
        this.b = ktkVar;
    }

    public lmj(cj cjVar, int i) {
        this.a = i;
        cjVar.getClass();
        this.b = cjVar;
    }
}
