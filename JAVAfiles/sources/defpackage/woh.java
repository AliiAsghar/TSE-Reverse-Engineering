package defpackage;

import android.telephony.SmsMessage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class woh {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SmsMessage.MessageClass.values().length];
        a = iArr;
        try {
            iArr[SmsMessage.MessageClass.CLASS_0.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[SmsMessage.MessageClass.CLASS_1.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[SmsMessage.MessageClass.CLASS_2.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[SmsMessage.MessageClass.CLASS_3.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
