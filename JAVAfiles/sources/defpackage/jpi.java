package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.format.DateFormat;
import android.view.View;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.util.Optional;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpi extends arrp implements arqr {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpi(Object obj, Object obj2, int i) {
        super(1);
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v120, types: [aruo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r0v57, types: [arvo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v79, types: [arvo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, juv] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r2v82, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v87, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, juv] */
    /* JADX WARN: Type inference failed for: r4v44, types: [msk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        Object obj2;
        String string;
        SimpleDateFormat simpleDateFormat;
        String str;
        switch (this.c) {
            case 0:
                spb spbVar = (spb) obj;
                spbVar.getClass();
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((jpv) it.next()).c(spbVar, ((jpp) this.b).a);
                }
                return arnb.a;
            case 1:
                sph sphVar = (sph) obj;
                sphVar.getClass();
                Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    ((jpv) it2.next()).d(sphVar, ((jpp) this.b).a);
                }
                return arnb.a;
            case 2:
                jhc jhcVar = (jhc) obj;
                jhcVar.getClass();
                if (!d.F(this.b, jhcVar)) {
                    alvw i = jrf.a.i();
                    i.X(alwp.a, "BugleComposeRow2");
                    ((alvg) i.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/replacer/DraftReplacerImpl$replaceDraft$2$1", "invoke", 55, "DraftReplacerImpl.kt")).D("Replacer encountered different existing drafts between emptiness check and update: %s, %s", this.b, jhcVar);
                }
                return this.a;
            case 3:
                jhc jhcVar2 = (jhc) obj;
                jhcVar2.getClass();
                return jhc.c(jhcVar2, null, null, (String) this.a, ((jsy) this.b).g, false, 0, 1011);
            case 4:
                jhc jhcVar3 = (jhc) obj;
                jhcVar3.getClass();
                if (!d.F(jhcVar3.a, this.b)) {
                    jhc c = jhc.c(jhcVar3, (String) this.b, null, null, false, false, 1, 766);
                    ((arrx) this.a).a = true;
                    return c;
                }
                ((arrx) this.a).a = false;
                return jhcVar3;
            case 5:
                View view = (View) obj;
                view.getClass();
                alvw d = juu.b.d();
                d.X(alwp.a, "BugleComposeRow2");
                ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/ShortcutHandler$Companion$getShortcutConfiguration$1", "invoke", 121, "ShortcutHandler.kt")).t("Clicked on %s shortcut.", ((Context) this.b).getString(this.a.a()));
                this.a.d(view);
                return arnb.a;
            case 6:
                lrc lrcVar = (lrc) obj;
                lrcVar.getClass();
                String string2 = ((jva) this.a).g.getString(R.string.shareDialogTitle);
                string2.getClass();
                String string3 = ((jva) this.a).g.getString(R.string.shareDialogTypeFile);
                string3.getClass();
                Object obj3 = this.b;
                int i2 = 126;
                String string4 = ((jva) this.a).g.getString(R.string.shareDialogTypeText);
                string4.getClass();
                return new aeqa(string2, aqjn.B(new aeth(string3, null, null, null, null, new jfq((Object) lrcVar, this.a, (Uri) obj3, 5), i2), new aeth(string4, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, new jfq((Object) lrcVar, this.a, (Uri) this.b, 6), i2)), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 124);
            case 7:
                long j = ((cjn) obj).a;
                jwp jwpVar = (jwp) this.b;
                jwpVar.h.g(new iha(this.a, jwpVar.e, 4, 9));
                qjh.l(jwpVar.c, null, new jsu(jwpVar, (arpe) null, 8, (char[]) null), 3);
                return true;
            case 8:
                jxb jxbVar = (jxb) obj;
                ((alvg) jwt.a.g().h("com/google/android/apps/messaging/conversation2/customthemes/CustomThemesSelectionUiAdapterImpl$createUiData$1", "invoke", 37, "CustomThemesSelectionUiAdapterImpl.kt")).t("Selected theme: %s", jxbVar);
                jwt jwtVar = (jwt) this.b;
                qjh.l(jwtVar.c, null, new jvr(jwtVar, jxbVar, (arpe) null, 8), 3);
                this.a.a();
                return arnb.a;
            case 9:
                int intValue = ((Number) obj).intValue();
                return ((jym) this.a).h.a(Integer.valueOf(intValue), ((jxu) this.b).a.h(intValue));
            case 10:
                arwe arweVar = (arwe) obj;
                arweVar.getClass();
                Object obj4 = this.a;
                akrh e = aktp.e("MessageUiAdapterImpl#createNewUiData");
                try {
                    boolean z = ((jzz) obj4).k;
                    kam kamVar = ((jzz) obj4).q;
                    Object obj5 = this.b;
                    miz mizVar = kamVar.a;
                    if (z) {
                        MessageId b = mizVar.b();
                        lga.bI(mizVar);
                        obj2 = new jzn(b, new jfq(obj5, arweVar, obj4, 7));
                        jzt jztVar = (jzt) arsd.k((Optional) ((jat) obj5).f);
                        if (jztVar != null) {
                            jztVar.a();
                        }
                    } else {
                        akrh e2 = aktp.e("MessageUiAdapterImpl#createNewUiData#eager");
                        try {
                            jzm jzmVar = new jzm(mizVar.b(), Long.valueOf(lga.bI(mizVar)), ((jat) obj5).w(arweVar, (jzz) obj4));
                            armd.i(e2, null);
                            obj2 = jzmVar;
                        } finally {
                        }
                    }
                    armd.i(e, null);
                    return obj2;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 11:
                aeuj aeujVar = (aeuj) obj;
                aeujVar.getClass();
                if (!((Boolean) this.b.a()).booleanValue()) {
                    this.a.a(aeujVar);
                }
                return arnb.a;
            case 12:
                lrc lrcVar2 = (lrc) obj;
                lrcVar2.getClass();
                this.a.d(new kbt(lrcVar2, 1));
                String quantityString = ((kbu) this.b).b.getResources().getQuantityString(R.plurals.delete_message_confirmation_dialog_title, 1, 1);
                String string5 = ((kbu) this.b).b.getString(R.string.delete_message_confirmation_dialog_text);
                string5.getClass();
                String string6 = ((kbu) this.b).b.getString(R.string.delete_message_confirmation_button);
                string6.getClass();
                aewr aewrVar = new aewr(string6, new kav(this.a, 4));
                String string7 = ((kbu) this.b).b.getString(android.R.string.cancel);
                string7.getClass();
                return new aepx(string5, null, null, quantityString, false, false, aewrVar, new aewr(string7, new kav(this.a, 5)), new kav(this.a, 6), 54);
            case 13:
                lrc lrcVar3 = (lrc) obj;
                lrcVar3.getClass();
                String string8 = ((kbu) this.b).b.getString(R.string.edit_scheduled_message_dialog_title);
                string8.getClass();
                lyr lyrVar = ((kbu) this.b).e;
                Instant v = ((mty) this.a).v();
                int aV = (int) yyb.aV(lyrVar.b.f().toEpochMilli(), v.toEpochMilli(), ZoneId.systemDefault());
                if (aV != 0) {
                    if (aV != 1) {
                        Locale b2 = yhx.b(lyrVar.c);
                        alvw d2 = lyr.a.d();
                        d2.X(alwp.a, "BugleScheduledSend");
                        ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/scheduledsend/datetimeformatter/ScheduledSendDateTimeFormatter", "formatToDateTime", 85, "ScheduledSendDateTimeFormatter.java")).t("Locale for formatToDateTime: %s", b2);
                        if (lyr.c(b2).equals(Locale.US)) {
                            int year = v.atZone(ZoneId.systemDefault()).getYear();
                            int year2 = lyrVar.b.f().atZone(ZoneId.systemDefault()).getYear();
                            String b3 = lyrVar.b(v);
                            StringBuilder sb = new StringBuilder();
                            if (year == year2) {
                                str = "EEE, MMM d";
                            } else {
                                str = "EEE, MMM d, yyyy";
                            }
                            sb.append(str);
                            sb.append(", ");
                            sb.append(b3);
                            string = new SimpleDateFormat(sb.toString(), Locale.US).format(Long.valueOf(v.toEpochMilli()));
                        } else {
                            jat jatVar = lyrVar.d;
                            long epochMilli = v.toEpochMilli();
                            if (yhx.b((Context) jatVar.a).equals(Locale.US)) {
                                if (DateFormat.is24HourFormat((Context) jatVar.a)) {
                                    simpleDateFormat = (SimpleDateFormat) jatVar.c.get();
                                } else {
                                    simpleDateFormat = (SimpleDateFormat) jatVar.f.get();
                                }
                                string = simpleDateFormat.format(Long.valueOf(epochMilli));
                            } else {
                                string = jatVar.s((Context) jatVar.a, epochMilli, 98323);
                            }
                        }
                    } else {
                        string = lyrVar.c.getString(R.string.scheduled_send_datetime_tomorrow_format, lyrVar.a(v));
                    }
                } else {
                    string = lyrVar.c.getString(R.string.scheduled_send_datetime_today_format, lyrVar.a(v));
                }
                String str2 = string;
                String string9 = ((kbu) this.b).b.getString(R.string.edit_scheduled_message_dialog_update_message_option_text);
                string9.getClass();
                String string10 = ((kbu) this.b).b.getString(R.string.edit_scheduled_message_dialog_send_message_option_text);
                string10.getClass();
                String string11 = ((kbu) this.b).b.getString(R.string.edit_scheduled_message_dialog_delete_message_option_text);
                string11.getClass();
                return new aeqa(string8, aqjn.B(new aeth(string9, null, null, null, null, new jfq((Object) lrcVar3, this.b, this.a, 11, (byte[]) null), 126), new aeth(string10, null, null, null, null, new jfq(this.b, lrcVar3, this.a, 12, (short[]) null), 126), new aeth(string11, null, null, null, null, new jfq((Object) lrcVar3, this.b, this.a, 13, (byte[]) null), 126)), str2, null, null, null, null, 120);
            case 14:
                lrc lrcVar4 = (lrc) obj;
                lrcVar4.getClass();
                this.a.d(new kbt(lrcVar4, 0));
                String string12 = ((kbu) this.b).b.getResources().getString(R.string.scheduled_message_overwrite_draft_message);
                string12.getClass();
                String string13 = ((kbu) this.b).b.getResources().getString(R.string.scheduled_message_dialog_continue);
                string13.getClass();
                aewr aewrVar2 = new aewr(string13, new kav(this.a, 7));
                String string14 = ((kbu) this.b).b.getResources().getString(R.string.scheduled_message_dialog_back);
                string14.getClass();
                return new aepx(string12, null, null, null, false, false, aewrVar2, new aewr(string14, new kav(this.a, 8)), new kav(this.a, 9), 62);
            case 15:
                long j2 = ((cjn) obj).a;
                Uri parse = Uri.parse(((qdq) this.a).g());
                parse.getClass();
                ((ked) this.b).g.a(new lms(parse));
                return true;
            case 16:
                long j3 = ((cjn) obj).a;
                if (((Boolean) ((utz) yig.X.get()).e()).booleanValue()) {
                    Object obj6 = this.b;
                    Uri parse2 = Uri.parse(((qdq) this.a).g());
                    parse2.getClass();
                    ((ked) obj6).f.a(parse2);
                } else {
                    Object obj7 = this.b;
                    Uri parse3 = Uri.parse(((qdq) this.a).g());
                    parse3.getClass();
                    ((ked) obj7).g.a(new lms(parse3));
                }
                return true;
            case 17:
                long j4 = ((cjn) obj).a;
                ?? r0 = this.a;
                jat jatVar2 = (jat) this.b;
                ((lkd) jatVar2.e).b(new llj(jatVar2.g.p(r0.a()), null));
                return true;
            case 18:
                long j5 = ((cjn) obj).a;
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) this.a));
                intent.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                ((kff) this.b).a.startActivity(intent);
                return true;
            case 19:
                long j6 = ((cjn) obj).a;
                Uri parse4 = Uri.parse((String) this.a);
                parse4.getClass();
                ((kff) this.b).f.b(new lms(parse4));
                return true;
            default:
                long j7 = ((cjn) obj).a;
                Object obj8 = this.a;
                kff kffVar = (kff) this.b;
                qjh.l(kffVar.b, null, new kda(kffVar, (Optional) obj8, (arpe) null, 7), 3);
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpi(Object obj, Object obj2, int i, byte[] bArr) {
        super(1);
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
