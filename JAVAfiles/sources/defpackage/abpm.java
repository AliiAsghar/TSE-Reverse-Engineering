package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import j$.util.Objects;
import java.util.regex.Matcher;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpm extends acda {
    final /* synthetic */ abpn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abpm(abpn abpnVar, Looper looper) {
        super(looper);
        this.a = abpnVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message != null && (message.obj instanceof Intent)) {
            abpn abpnVar = this.a;
            Intent intent = (Intent) message.obj;
            intent.setExtrasClassLoader(new abpc());
            if (intent.hasExtra("google.messenger")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof CloudMessagingMessengerCompat) {
                    abpnVar.f = (CloudMessagingMessengerCompat) parcelableExtra;
                }
                if (parcelableExtra instanceof Messenger) {
                    abpnVar.e = (Messenger) parcelableExtra;
                }
            }
            Intent intent2 = (Intent) message.obj;
            String action = intent2.getAction();
            if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                    return;
                }
                return;
            }
            String stringExtra = intent2.getStringExtra("registration_id");
            if (stringExtra == null) {
                stringExtra = intent2.getStringExtra("unregistered");
            }
            if (stringExtra == null) {
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(String.valueOf(intent2.getExtras()))));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (stringExtra2.startsWith("|")) {
                    String[] split = stringExtra2.split("\\|");
                    if (split.length > 2 && Objects.equals(split[1], "ID")) {
                        String str = split[2];
                        String str2 = split[3];
                        if (str2.startsWith(":")) {
                            str2 = str2.substring(1);
                        }
                        abpnVar.c(str, intent2.putExtra("error", str2).getExtras());
                        return;
                    }
                    Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                synchronized (abpnVar.c) {
                    int i = 0;
                    while (true) {
                        vl vlVar = abpnVar.c;
                        if (i < vlVar.d) {
                            abpnVar.c((String) vlVar.d(i), intent2.getExtras());
                            i++;
                        }
                    }
                }
                return;
            }
            Matcher matcher = abpn.b.matcher(stringExtra);
            if (!matcher.matches()) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                    return;
                }
                return;
            }
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                Bundle extras = intent2.getExtras();
                extras.putString("registration_id", group2);
                abpnVar.c(group, extras);
                return;
            }
            return;
        }
        Log.w("Rpc", "Dropping invalid message");
    }
}
