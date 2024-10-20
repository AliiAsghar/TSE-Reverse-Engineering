package defpackage;

import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpc extends ClassLoader {
    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z) {
        if (Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            if (Log.isLoggable("CloudMessengerCompat", 3)) {
                Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
                return CloudMessagingMessengerCompat.class;
            }
            return CloudMessagingMessengerCompat.class;
        }
        return super.loadClass(str, z);
    }
}
