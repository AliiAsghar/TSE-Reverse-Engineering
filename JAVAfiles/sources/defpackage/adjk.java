package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adjk {
    public static String a(int i) {
        if (i != 18) {
            if (i != 100) {
                switch (i) {
                    case -1:
                        return "Unknown";
                    case 0:
                        return "Request consent";
                    case 1:
                        return "Consent granted";
                    case 2:
                        return "(Deprecated) Provisioning alert";
                    case 3:
                        return "Welcome message";
                    case 4:
                        return "(Deprecated) Reject message";
                    case 5:
                        return "Show FastTrack UI";
                    case 6:
                        return "FastTrack consent granted";
                    case 7:
                        return "BOEW granted";
                    case 8:
                        return "BOEW request";
                    case 9:
                        return "T&Cs";
                    default:
                        switch (i) {
                            case 11:
                                return "Update provisioning status";
                            case 12:
                                return "Availability updated";
                            case 13:
                                return "Manual MSISDN entry";
                            case 14:
                                return "MSISDN received";
                            case 15:
                                return "Request Bugle information";
                            case 16:
                                return "RCS availability update";
                            default:
                                switch (i) {
                                    case 20:
                                        return "Tachyon identity key";
                                    case 21:
                                        return "Tachygram information";
                                    case 22:
                                        return "Force to re-prompt Google ToS";
                                    case 23:
                                        return "MO SMS Consented from PhoneNumberInputUI";
                                    case 24:
                                        return "Show RCS default on UI";
                                    case 25:
                                        return "Force show RCS default on UI";
                                    default:
                                        return a.bV(i, "Unknown Provisioning Event: ");
                                }
                        }
                }
            }
            return "Bugle information";
        }
        return "Send Provisioning Session ID";
    }

    public static String b(int i) {
        return String.format(Locale.US, "[%s (%d)]", a(i), Integer.valueOf(i));
    }

    public static void c(Context context, int i, Bundle bundle) {
        String c;
        Intent intent = new Intent("com.google.android.ims.provisioning.engine.provisioningEventAction");
        intent.putExtra("com.google.android.ims.provisioning.engine.provisioning_event_code_key", i);
        if (bundle != null) {
            intent.putExtra("com.google.android.ims.provisioning.engine.provisioning_event_bundle_key", bundle);
        }
        String b = b(i);
        if (Objects.isNull(bundle)) {
            c = "no extra data";
        } else {
            c = advq.GENERIC.c(bundle);
        }
        advr.k("Sending ProvisioningEvent to Bugle %s, %s", b, c);
        advz.b(context, intent, "com.google.android.apps.messaging.shared.receiver.RcsProvisioningEventReceiver", advy.PROVISIONING_EVENT);
    }

    public final String toString() {
        throw null;
    }
}
