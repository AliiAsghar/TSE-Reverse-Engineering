package defpackage;

import android.content.Context;
import android.text.SpannableString;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zty extends arrd implements arqv {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zty(Object obj, int i) {
        super(2, obj, ztz.class, "loadContent", "loadContent(Lcom/google/android/apps/messaging/ui/conversation/banners2o/addcontact/dataservice2/AddContactBanner2LoadedData;)Lcom/google/android/apps/messaging/banner/api/FullBannerContent;", 4);
        this.a = i;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        String string;
        String string2;
        String str;
        int i = this.a;
        voo vooVar = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    zvx zvxVar = (zvx) obj;
                    boolean z = zvxVar.c;
                    zvt zvtVar = (zvt) this.b;
                    if (!z) {
                        return null;
                    }
                    ResolvedRecipient resolvedRecipient = zvxVar.a;
                    resolvedRecipient.getClass();
                    String string3 = zvtVar.a.getString(R.string.spam_banner_title_v2);
                    string3.getClass();
                    String string4 = zvtVar.a.getString(R.string.spam_banner_body_v2);
                    string4.getClass();
                    ieg iegVar = new ieg(aerb.be);
                    String string5 = zvtVar.a.getString(R.string.spam_banner_spam_button_v2);
                    string5.getClass();
                    String string6 = zvtVar.a.getString(R.string.spam_banner_not_spam_button_v2);
                    string6.getClass();
                    return new ief("spam_banner", string3, string4, iegVar, new iee(string5, new kdt((Object) zvtVar, (Object) zvxVar, (Object) resolvedRecipient, 20, (short[]) null)), new iee(string6, new zdh(zvtVar, resolvedRecipient, 19)), null, new zdh(zvtVar, resolvedRecipient, 20), 576);
                }
                boolean z2 = ((zvk) obj).a;
                zvg zvgVar = (zvg) this.b;
                if (!z2) {
                    return null;
                }
                Context context = zvgVar.a;
                armf armfVar = zvgVar.b;
                armf armfVar2 = zvgVar.c;
                utz utzVar = zvi.a;
                return new ief("roaming_short_code", null, aabr.ac(context, armfVar, armfVar2, R.string.conversation_roaming_short_code_paragraph, zvi.a, zvi.b).toString(), new ieg(aerb.bs), null, null, null, null, 2034);
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            kjx kjxVar = (kjx) this.b;
            if (!booleanValue) {
                return null;
            }
            String string7 = kjxVar.a.getString(R.string.send_feedback_banner_body);
            ieg iegVar2 = new ieg(aerb.bs);
            String string8 = kjxVar.a.getString(R.string.send_feedback_banner_button);
            string8.getClass();
            return new ief("early_feedback", null, string7, iegVar2, new iee(string8, new kjm(kjxVar, 4)), null, new kjm(kjxVar, 5), null, 1504);
        }
        zun zunVar = (zun) obj;
        ztz ztzVar = (ztz) this.b;
        ResolvedRecipient resolvedRecipient2 = zunVar.a;
        if (resolvedRecipient2 == null || !zunVar.b) {
            return null;
        }
        boolean z3 = zunVar.c;
        if (lbp.c() && !z3) {
            String string9 = ztzVar.a.getString(R.string.report_spam_banner_title, ztzVar.d.a(resolvedRecipient2.f()));
            String string10 = ztzVar.a.getString(R.string.report_spam_banner_body);
            ieg iegVar3 = new ieg(aerb.cl);
            String string11 = ztzVar.a.getResources().getString(R.string.report_spam_banner_dismiss_button);
            string11.getClass();
            iee ieeVar = new iee(string11, new zni(ztzVar, 4));
            String string12 = ztzVar.a.getString(R.string.report_spam_banner_spam_button);
            string12.getClass();
            return new ief("report_spam", string9, string10, iegVar3, ieeVar, new iee(string12, new zdh(ztzVar, resolvedRecipient2, 12)), new zni(ztzVar, 5), new zni(ztzVar, 6), 320);
        }
        if (((Boolean) ztzVar.f.b()).booleanValue()) {
            vooVar = resolvedRecipient2.y();
        }
        if (ztz.f(vooVar)) {
            Context context2 = ztzVar.a;
            SpannableString a = ztzVar.d.a(resolvedRecipient2.f());
            if (qta.r()) {
                vooVar.getClass();
                String str2 = vooVar.f.e;
                str2.getClass();
                str = wfh.x(str2);
            } else {
                vooVar.getClass();
                str = vooVar.f.e;
                str.getClass();
            }
            string = context2.getString(R.string.add_contact_banner_title_with_name, a, str);
            string.getClass();
        } else {
            string = ztzVar.a.getString(R.string.add_contact_banner_title_v2, ztzVar.d.a(resolvedRecipient2.f()));
            string.getClass();
        }
        String str3 = string;
        if (ztz.f(vooVar)) {
            string2 = ztzVar.a.getString(R.string.add_contact_banner_body_profile_disclosure);
            string2.getClass();
        } else {
            string2 = ztzVar.a.getString(R.string.add_contact_banner_body_v2);
            string2.getClass();
        }
        String str4 = string2;
        ieg iegVar4 = new ieg(aerb.cl);
        String string13 = ztzVar.a.getResources().getString(R.string.add_contact_banner_add_button);
        string13.getClass();
        iee ieeVar2 = new iee(string13, new zdh(ztzVar, resolvedRecipient2, 13));
        String string14 = ztzVar.a.getString(R.string.add_contact_banner_spam_button);
        string14.getClass();
        return new ief("add_contact", str3, str4, iegVar4, ieeVar2, new iee(string14, new zdh(ztzVar, resolvedRecipient2, 14)), new zni(ztzVar, 7), new zni(ztzVar, 8), 320);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zty(Object obj, int i, byte[] bArr) {
        super(2, obj, kjx.class, "loadContent", "loadContent(Z)Lcom/google/android/apps/messaging/banner/api/FullBannerContent;", 4);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zty(Object obj, int i, char[] cArr) {
        super(2, obj, zvg.class, "loadContent", "loadContent(Lcom/google/android/apps/messaging/ui/conversation/banners2o/normalization/roamingshortcode/dataservice/RoamingShortCodeLoadedData;)Lcom/google/android/apps/messaging/banner/api/FullBannerContent;", 4);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zty(Object obj, int i, short[] sArr) {
        super(2, obj, zvt.class, "loadContent", "loadContent(Lcom/google/android/apps/messaging/ui/conversation/banners2o/spam/dataservice/SpamBanner2LoadedData;)Lcom/google/android/apps/messaging/banner/api/FullBannerContent;", 4);
        this.a = i;
    }
}
