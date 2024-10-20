package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xbe {
    private static final alvi d = alvi.m("com/google/android/apps/messaging/shared/sms/config/MmsConfig");
    public final int a;
    public final Bundle b;
    public xbd c = null;

    public xbe(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    public static void z(Bundle bundle, int i, String str, Object obj) {
        try {
            if (i != 0) {
                int i2 = i - 1;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 != 6) {
                                        return;
                                    }
                                    alvw i3 = d.i();
                                    i3.X(alwp.a, "Bugle");
                                    ((alvg) ((alvg) i3).h("com/google/android/apps/messaging/shared/sms/config/MmsConfig", "update", 303, "MmsConfig.java")).t("Attempted to update a carrier config value of unknown keytype. Key: %s", str);
                                    return;
                                }
                                bundle.putIntArray(str, (int[]) obj);
                                return;
                            }
                            bundle.putString(str, String.valueOf(obj));
                            return;
                        }
                        bundle.putLong(str, Long.parseLong(String.valueOf(obj)));
                        return;
                    }
                    bundle.putBoolean(str, Boolean.parseBoolean(String.valueOf(obj)));
                    return;
                }
                bundle.putInt(str, Integer.parseInt(String.valueOf(obj)));
                return;
            }
            throw null;
        } catch (NumberFormatException e) {
            alvw i4 = d.i();
            i4.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) ((alvg) ((alvg) i4).g(e)).h("com/google/android/apps/messaging/shared/sms/config/MmsConfig", "update", 308, "MmsConfig.java");
            if (i != 0) {
                alvgVar.D("Attempted to update a carrier config value with incorrect keytype. Key: %s, keyType: %s", str, yyb.cP(i));
                return;
            }
            throw null;
        }
    }

    public final int a() {
        return this.b.getInt("emailGatewaySmsToMmsTextThreshold", -1);
    }

    public final int b() {
        return this.b.getInt("maxImageHeight", 480);
    }

    public final int c() {
        return this.b.getInt("maxImageWidth", 640);
    }

    public final int d() {
        return this.b.getInt("maxMessageSize", 307200);
    }

    public final int e() {
        return this.b.getInt("maxSubjectLength", 40);
    }

    public final int f() {
        int i = this.b.getInt("maxMessageTextSize", -1);
        if (i >= 0) {
            return i;
        }
        return 10000;
    }

    public final int g() {
        int i = this.b.getInt("recipientLimit", Integer.MAX_VALUE);
        if (i < 0) {
            return Integer.MAX_VALUE;
        }
        return i;
    }

    public final int h() {
        return this.b.getInt("smsToMmsTextLengthThreshold", -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Optional i() {
        String string = this.b.getString("hiddenContactsData", "");
        if (TextUtils.isEmpty(string)) {
            return Optional.empty();
        }
        return Optional.of(string);
    }

    public final String j() {
        return this.b.getString("emailGatewayNumber", "");
    }

    public final String k() {
        return this.b.getString("spamForwardingNumber", "");
    }

    public final boolean l() {
        return this.b.getBoolean("allowChangingMmsRoamingAutoRetrieve", true);
    }

    public final boolean m() {
        return this.b.getBoolean("enableWapPushSI", false);
    }

    public final boolean n() {
        return this.b.getBoolean("groupChatDefaultsToMMS", true);
    }

    public final boolean o() {
        if (r() && this.b.getBoolean("enableGroupMms", true)) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        return this.b.getBoolean("mms_auto_retrieve_enabled_bool", true);
    }

    public final boolean q() {
        return this.b.getBoolean("mmsRoamingAutoRetrieveByDefault", false);
    }

    public final boolean r() {
        return this.b.getBoolean("enabledMMS", true);
    }

    public final boolean s() {
        return this.b.getBoolean("enabledNotifyWapMMSC", false);
    }

    public final boolean t() {
        return this.b.getBoolean("sendMultipartSmsAsSeparateMessages", false);
    }

    public final boolean u() {
        return this.b.getBoolean("smsDeliveryReportSettingOnByDefault", false);
    }

    public final boolean v() {
        return this.b.getBoolean("enableSMSDeliveryReports", true);
    }

    public final boolean w() {
        return this.b.getBoolean("smsUsesSimpleCharactersOnly", false);
    }

    public final boolean x() {
        return this.b.getBoolean("supportMmsContentDisposition", true);
    }

    public final boolean y() {
        return this.b.getBoolean("supportMmsPriority", true);
    }
}
