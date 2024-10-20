package defpackage;

import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import j$.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class adnf {
    protected static final String[] b = {"-rcsconfiguration", "-rcscfg"};
    protected boolean c;

    public synchronized void b(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
    }

    protected abstract boolean c(String str, int i, int i2);

    public final void d(Context context, Intent intent) {
        String str;
        String messageBody;
        boolean z = adne.a;
        if (!adtw.e(context, intent) && !"android.intent.action.DATA_SMS_RECEIVED".equals(intent.getAction()) && !"android.provider.Telephony.SMS_RECEIVED".equals(intent.getAction())) {
            advr.q("Caller not Google signed or missing pending intent.", new Object[0]);
            return;
        }
        if ("com.google.android.ims.action.RAW_SMS_RECEIVED".equals(intent.getAction()) && (intent = (Intent) intent.getParcelableExtra("original_intent")) == null) {
            advr.g("incomingIntent.getParcelableExtra(EXTRA_ORIGINAL_INTENT) is null", new Object[0]);
            return;
        }
        if (this.c && "android.provider.Telephony.SMS_RECEIVED".equals(intent.getAction())) {
            advr.c("Ignoring a TEXT SMS as DATA OTP is expected", new Object[0]);
            return;
        }
        if (!this.c && "android.intent.action.DATA_SMS_RECEIVED".equals(intent.getAction())) {
            advr.c("Ignoring a DATA SMS as TEXT OTP is expected", new Object[0]);
            return;
        }
        try {
            SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
            if (messagesFromIntent != null) {
                int max = Math.max(intent.getIntExtra("subscription", -1), -1);
                int max2 = Math.max(intent.getIntExtra("slot", -1), -1);
                if (messagesFromIntent.length > 0) {
                    str = messagesFromIntent[0].getOriginatingAddress();
                } else {
                    str = "";
                }
                String ag = albo.ag(str);
                for (SmsMessage smsMessage : messagesFromIntent) {
                    if (this.c) {
                        byte[] userData = smsMessage.getUserData();
                        Charset charset = StandardCharsets.UTF_16;
                        if (userData.length == 0) {
                            messageBody = null;
                        } else {
                            messageBody = new String(userData, charset);
                        }
                    } else {
                        messageBody = smsMessage.getMessageBody();
                    }
                    Objects.toString(smsMessage.getOriginatingAddress(), ag);
                    if (c(messageBody, max, max2)) {
                        return;
                    }
                }
            }
        } catch (RuntimeException e) {
            advr.i(e, "Unable to parse SMS messages", new Object[0]);
        }
    }
}
