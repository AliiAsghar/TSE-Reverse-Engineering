package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.notification2o.NotificationsReceiver;
import j$.util.Optional;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vjs {
    public final Object a;

    public vjs(Object obj) {
        this.a = obj;
    }

    public static final upk b() {
        return upk.a("refresh_incoming_message_notifications", vjr.a);
    }

    public static final upk g() {
        return upk.a("refresh_message_failure_notification", und.a);
    }

    public static anmq y() {
        aozy createBuilder = anmq.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anmq) createBuilder.b).b = "replace_me";
        return (anmq) createBuilder.s();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [armf, java.lang.Object] */
    public final int A() {
        int i;
        if (((Long) this.a.b()).longValue() != -1) {
            switch (((Long) this.a.b()).intValue()) {
                case 0:
                    i = 2;
                    break;
                case 1:
                    i = 3;
                    break;
                case 2:
                    i = 4;
                    break;
                case 3:
                    i = 5;
                    break;
                case 4:
                    i = 6;
                    break;
                case 5:
                    i = 7;
                    break;
                case 6:
                    i = 8;
                    break;
                case 7:
                    i = 9;
                    break;
                case 8:
                    i = 10;
                    break;
                case 9:
                    i = 11;
                    break;
                case 10:
                    i = 12;
                    break;
                case 11:
                    i = 13;
                    break;
                case 12:
                    i = 14;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i != 0) {
                return i;
            }
        }
        return 3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, vau] */
    public final boolean B(String str) {
        if (abqa.b >= 232200000 && this.a.c(str).t) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, vau] */
    public final boolean C(String str) {
        if ((abqa.b >= 240700000 || (!yyb.aG() && abqa.b >= 233700000)) && this.a.c(str).s) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final akul D(uzw uzwVar) {
        return ((uof) this.a.b()).b(upk.a("delete_message", uzwVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void E(uzw uzwVar) {
        ((uof) this.a.b()).b(upk.a("delete_message", uzwVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void F(uzw uzwVar) {
        ((uof) this.a.b()).a(upk.a("delete_message", uzwVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void a(vjr vjrVar) {
        ((uof) this.a.b()).b(upk.a("refresh_incoming_message_notifications", vjrVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void c() {
        ((uof) this.a.b()).a(upk.a("refresh_incoming_message_notifications", vjr.a));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void d(vjr vjrVar) {
        ((uof) this.a.b()).a(upk.a("refresh_incoming_message_notifications", vjrVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final akul e() {
        return ((uof) this.a.b()).b(upk.a("refresh_message_failure_notification", und.a));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void f() {
        ((uof) this.a.b()).b(upk.a("refresh_message_failure_notification", und.a));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void h() {
        ((uof) this.a.b()).a(upk.a("refresh_message_failure_notification", und.a));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void i(vjm vjmVar) {
        ((uof) this.a.b()).b(upk.a("mark_as_notified", vjmVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final wpn j() {
        return (wpn) ((wpm) this.a.b()).b.c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final vjb k(vja vjaVar, vhu vhuVar) {
        vjs vjsVar = (vjs) this.a.b();
        vjsVar.getClass();
        vhuVar.getClass();
        return new vjb(vjsVar, vjaVar, vhuVar, vhuVar.G, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final vjb l(vja vjaVar, vhu vhuVar, vin vinVar) {
        vjs vjsVar = (vjs) this.a.b();
        vjsVar.getClass();
        vhuVar.getClass();
        return new vjb(vjsVar, vjaVar, vhuVar, vhuVar.G, vinVar);
    }

    public final synchronized void m(ConversationIdType conversationIdType) {
        if (conversationIdType.b()) {
            ((vl) this.a).clear();
        } else {
            ((vl) this.a).remove(conversationIdType);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final vhs n(vhu vhuVar) {
        yhu yhuVar = (yhu) this.a.b();
        yhuVar.getClass();
        vhuVar.getClass();
        return new vhs(yhuVar, vhuVar, vhuVar.G, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final vhs o(vhu vhuVar, String str, vin vinVar) {
        yhu yhuVar = (yhu) this.a.b();
        yhuVar.getClass();
        vhuVar.getClass();
        str.getClass();
        return new vhs(yhuVar, vhuVar, str, vinVar);
    }

    public final CharSequence p(String str, CharSequence charSequence, String str2, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = ((Context) this.a).getString(i);
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, str.length(), 33);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) string);
            }
            spannableStringBuilder.append(charSequence);
            string = ((Context) this.a).getString(R.string.im_notification_separator);
        }
        if (!TextUtils.isEmpty(str2) && !gh.w(str2)) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) string);
            }
            spannableStringBuilder.append(r(null, str2));
        }
        return spannableStringBuilder;
    }

    public final CharSequence q(String str, CharSequence charSequence, String str2) {
        return p(str, charSequence, str2, R.string.im_notification_ticker_separator);
    }

    public final CharSequence r(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.append((CharSequence) ((Context) this.a).getString(R.string.im_notification_separator));
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(((Context) this.a).getText(yyb.v(str2)));
        spannableStringBuilder.setSpan(new StyleSpan(2), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final String s(ConversationIdType conversationIdType) {
        String valueOf = String.valueOf(((Context) this.a).getPackageName());
        String valueOf2 = String.valueOf(((Context) this.a).getString(R.string.im_notification_tag_suffix));
        return valueOf.concat(valueOf2).concat(String.valueOf(conversationIdType.a()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0130, code lost:
    
        if (r0 == defpackage.tqi.NEGATIVE_VERDICT_DISPLAY_IMAGE) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r6v0, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.SpannableStringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.vmr t(android.content.Context r16, defpackage.rry r17, boolean r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vjs.t(android.content.Context, rry, boolean, java.lang.String):vmr");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [android.os.Parcelable, java.lang.Object] */
    public final PendingIntent u(vko vkoVar, vlm vlmVar, Optional optional, vlb vlbVar, boolean z, boolean z2, Bundle bundle) {
        boolean z3;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("extra_notification_type", vlmVar.i);
        bundle2.putBundle("extra_notification_bundle", bundle);
        bundle2.putString("extra_notification_callback_type", vkoVar.name());
        bundle2.putBoolean("extra_is_summary_notification", z);
        optional.ifPresent(new uoa(bundle2, 20));
        vlc vlcVar = vlbVar.a;
        bundle2.putAll(vlcVar.b);
        if (vlcVar.a.isPresent()) {
            bundle2.putParcelable("extra_pending_intent_to_run", vlcVar.a.get());
        }
        bundle2.putBoolean("extra_is_from_notification_for_ui_handling", true);
        Intent intent = vlbVar.b;
        intent.putExtras(bundle2);
        if (TextUtils.isEmpty(intent.getAction())) {
            String str = vlmVar.name() + "_" + vkoVar.name();
            if (optional.isPresent()) {
                str = str + "_" + ((String) optional.get());
            }
            intent.setAction(str);
        }
        if (vlbVar.c) {
            dzx dzxVar = new dzx((Context) this.a);
            dzxVar.d(intent);
            if (z2) {
                return dzxVar.a(vlbVar.d, yhy.a);
            }
            Object obj = this.a;
            int i = vlbVar.d;
            int a = yhy.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
            Bundle bundle3 = new Bundle();
            ClipData clipData = aipr.a;
            Intent[] b = dzxVar.b();
            int length = b.length;
            Intent[] intentArr = new Intent[length];
            int i2 = 0;
            while (true) {
                int i3 = length - 1;
                if (i2 < i3) {
                    if (b[i2].getComponent() != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    d.t(z3, "Must set component on Intent.");
                    intentArr[i2] = b[i2];
                    i2++;
                } else {
                    intentArr[i3] = aipr.d(b[i3], a, 0);
                    return PendingIntent.getActivities((Context) obj, i, intentArr, a, bundle3);
                }
            }
        } else {
            if (z2) {
                Object obj2 = this.a;
                int i4 = vlbVar.d;
                int i5 = 134217728 | yhy.a;
                return PendingIntent.getActivity((Context) obj2, i4, aipr.d(intent, i5, 1), i5);
            }
            return aipr.a((Context) this.a, vlbVar.d, intent, yhy.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.os.Parcelable, java.lang.Object] */
    public final PendingIntent v(vko vkoVar, vlm vlmVar, Optional optional, vlc vlcVar, boolean z, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt("extra_notification_type", vlmVar.i);
        bundle2.putBundle("extra_notification_bundle", bundle);
        bundle2.putString("extra_notification_callback_type", vkoVar.name());
        bundle2.putBoolean("extra_is_summary_notification", z);
        optional.ifPresent(new vra(bundle2, 1));
        bundle2.putAll(vlcVar.b);
        Intent intent = new Intent((Context) this.a, (Class<?>) NotificationsReceiver.class);
        String str = vlmVar.name() + "_" + vkoVar.name();
        if (optional.isPresent()) {
            str = str + "_" + ((String) optional.get());
        }
        intent.setAction(str);
        if (vlcVar.a.isPresent()) {
            bundle2.putParcelable("extra_pending_intent_to_run", vlcVar.a.get());
        }
        intent.putExtras(bundle2);
        return aipr.b((Context) this.a, 0, intent, yhy.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void w(vkq vkqVar, uta utaVar) {
        ((uof) this.a.b()).b(upk.b("cancel_notification", vkqVar, utaVar));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    public final vho x(int i, anen anenVar) {
        anenVar.getClass();
        return new vho(this.a, i, anenVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, vcw] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, vcw] */
    public final aqar z() {
        return (aqar) vdi.b(aqas.a(this.a.a()), this.a.b(), false);
    }

    public vjs(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public vjs(armf armfVar, byte[] bArr, byte[] bArr2, char[] cArr) {
        aiwl a = wus.a();
        a.i(wuk.GAIA_DITTO_TACHYON);
        a.k(vdt.a);
        a.h(new uzg(6));
        this.a = ((znj) armfVar.b()).ab(a.f());
    }

    public vjs(miw miwVar) {
        miwVar.getClass();
        this.a = miwVar;
    }

    public vjs(armf armfVar, byte[] bArr, int[] iArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public vjs(qvv qvvVar, qvr qvrVar, qdq qdqVar) {
        qvvVar.getClass();
        qvrVar.getClass();
        qdqVar.getClass();
        this.a = qdqVar;
    }

    public vjs(armf armfVar, boolean[] zArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public vjs(armf armfVar, char[] cArr, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public vjs() {
        this.a = new vl();
    }

    public vjs(armf armfVar, byte[] bArr, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public vjs(armf armfVar, short[] sArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public vjs(armf armfVar, int[] iArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public vjs(Context context, byte[] bArr) {
        this.a = context;
        Pattern.compile("(?<=" + context.getString(R.string.im_notification_tag_suffix) + ")\\d+$");
    }
}
