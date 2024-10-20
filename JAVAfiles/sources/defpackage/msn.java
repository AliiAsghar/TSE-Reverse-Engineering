package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class msn implements alhr {
    private final /* synthetic */ int a;

    public /* synthetic */ msn(int i) {
        this.a = i;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.a) {
            case 0:
                int i = msq.l;
                return "EMERGENCY+SERVICE+PROVIDER";
            case 1:
                int i2 = msq.l;
                return "EMERGENCY+SERVICE+PROVIDER";
            case 2:
                return Optional.of("EMERGENCY+SERVICE+PROVIDER");
            case 3:
                int i3 = msq.l;
                return "EMERGENCY+SERVICE+PROVIDER";
            case 4:
                int i4 = msq.l;
                return "EMERGENCY+SERVICE+PROVIDER";
            case 5:
                return new msf("EMERGENCY+SERVICE+PROVIDER");
            case 6:
                int i5 = msq.l;
                return msy.SATELLITE_ESP;
            case 7:
                int i6 = msq.l;
                return "EMERGENCY+SERVICE+PROVIDER+DEMO";
            case 8:
                int i7 = msq.l;
                return "EMERGENCY+SERVICE+PROVIDER+DEMO";
            case 9:
                return Optional.of("EMERGENCY+SERVICE+PROVIDER+DEMO");
            case 10:
                int i8 = msq.l;
                return "EMERGENCY+SERVICE+PROVIDER+DEMO";
            case 11:
                int i9 = msq.l;
                return "EMERGENCY+SERVICE+PROVIDER+DEMO";
            case 12:
                return new msf("EMERGENCY+SERVICE+PROVIDER+DEMO");
            case 13:
                int i10 = msq.l;
                return msy.SATELLITE_ESP;
            case 14:
                return Optional.empty();
            case 15:
                return Boolean.valueOf(anfi.a("bugle.enable_messaging_identity_in_conversation_metadata", "bugle"));
            case 16:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_phone_number_record_manager", "bugle"));
            case 17:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_notification_intents", "bugle"));
            case 18:
                return Boolean.valueOf(anfi.a("bugle.enable_messaging_identity_in_thread_data_v2", "bugle"));
            case 19:
                return Boolean.valueOf(anfi.a("bugle.enable_mi_in_a11y_utils", "bugle"));
            default:
                return Boolean.valueOf(anfi.a("bugle.enable_messaging_identity_in_sms_sender", "bugle"));
        }
    }
}
