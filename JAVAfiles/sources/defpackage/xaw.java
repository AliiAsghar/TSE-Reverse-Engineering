package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xaw {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/sms/common/SmsErrorCodeDescription");
    private final String b;
    private final SparseIntArray c;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public xaw(String str) {
        char c;
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.c = sparseIntArray;
        this.b = str;
        if (!TextUtils.isEmpty(str)) {
            alvi alviVar = a;
            alvw g = alviVar.g();
            g.X(alwp.a, "Bugle");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/sms/common/SmsErrorCodeDescription", "<init>", 40, "SmsErrorCodeDescription.java")).t("SmsErrorCodeDescription: loading %s", str);
            switch (str.hashCode()) {
                case -2066302369:
                    if (str.equals("vivo_brazil")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -877394353:
                    if (str.equals("telcel")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 354684289:
                    if (str.equals("verizon_cdma")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 465475731:
                    if (str.equals("smart_communications")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            alvw i = alviVar.i();
                            i.X(alwp.a, "Bugle");
                            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/sms/common/SmsErrorCodeDescription", "<init>", 58, "SmsErrorCodeDescription.java")).t("SmsErrorCodeDescription: Unknown map name %s", str);
                            return;
                        } else {
                            d();
                            sparseIntArray.put(21, R.string.send_error_check_prepaid_balance);
                            sparseIntArray.put(31, R.string.send_error_recipient_not_confirmed);
                            return;
                        }
                    }
                    d();
                    sparseIntArray.put(21, R.string.send_error_check_prepaid_balance);
                    return;
                }
                d();
                sparseIntArray.put(28, R.string.send_error_check_prepaid_balance);
                return;
            }
            c(R.string.send_error_recipient_not_confirmed, 0, 1, 32, 34, 37);
            c(R.string.send_error_recipient_unreachable, 2, 3, 33);
            c(R.string.send_error_recipient_has_too_many_unread_messages, 35);
            c(R.string.send_error_recipient_not_confirmed_or_changed, 38);
            c(R.string.send_error_recipient_blocked_or_unable, 98);
            c(R.string.send_error_contact_carrier, 4, 5, 96, 97, 99, 100);
            b(R.string.send_error_contact_carrier, 102, 106);
            b(R.string.send_error_contact_carrier, 32768, 32779);
            b(R.string.send_error_contact_manufacturer, 6, 31);
            c(R.string.send_error_contact_manufacturer, 36, 101);
            b(R.string.send_error_contact_manufacturer, 39, 95);
            b(R.string.send_error_contact_manufacturer, 107, 255);
        }
    }

    private final void b(int i, int i2, int i3) {
        while (i2 <= i3) {
            this.c.put(i2, i);
            i2++;
        }
    }

    private final void c(int i, int... iArr) {
        for (int i2 : iArr) {
            this.c.put(i2, i);
        }
    }

    private final void d() {
        c(R.string.send_error_network_error, 331, 332);
        c(R.string.send_error_network_error_or_check_prepaid_balance, 500);
        c(R.string.send_error_contact_manufacturer, 2065);
        b(R.string.send_error_contact_manufacturer, 2160, 2175);
    }

    public final String a(int i, Resources resources) {
        int size = this.c.size();
        int i2 = R.string.message_status_send_failed;
        if (size != 0) {
            int i3 = this.c.get(i);
            if (i3 != 0) {
                i2 = i3;
            }
            return resources.getString(R.string.sms_error_template, resources.getString(i2), Integer.valueOf(i));
        }
        return resources.getString(R.string.message_status_send_failed);
    }
}
