package defpackage;

import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acbu extends acda {
    final /* synthetic */ acbw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acbu(acbw acbwVar, Looper looper) {
        super(looper);
        this.a = acbwVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message == null) {
            return;
        }
        if (message.obj instanceof Intent) {
            acbw acbwVar = this.a;
            Intent intent = (Intent) message.obj;
            intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
            if (intent.hasExtra("google.messenger")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof MessengerCompat) {
                    acbwVar.i = (MessengerCompat) parcelableExtra;
                }
                if (parcelableExtra instanceof Messenger) {
                    acbwVar.h = (Messenger) parcelableExtra;
                }
            }
            acbwVar.d((Intent) message.obj);
            return;
        }
        Log.w("InstanceID", "Dropping invalid message");
    }
}
