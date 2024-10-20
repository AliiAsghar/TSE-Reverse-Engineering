package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqwn extends SocketAddress {
    private static final long serialVersionUID = 0;
    public final Intent a;

    protected aqwn(Intent intent) {
        boolean z = true;
        if (intent.getComponent() == null && intent.getPackage() == null) {
            z = false;
        }
        d.t(z, "'bindIntent' must be explicit. Specify either a package or ComponentName.");
        this.a = intent;
    }

    public static aqwn a(ComponentName componentName) {
        return new aqwn(new Intent("grpc.io.action.BIND").setComponent(componentName));
    }

    public static aqwn b(Context context) {
        return a(new ComponentName(context, context.getClass()));
    }

    public static aqwn c(String str, String str2) {
        return a(new ComponentName(str, str2));
    }

    public final String d() {
        if (this.a.getPackage() != null) {
            return this.a.getPackage();
        }
        return this.a.getComponent().getPackageName();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aqwn) {
            return this.a.filterEquals(((aqwn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.a;
        if (intent.getPackage() != null) {
            intent = intent.cloneFilter().setPackage(null);
        }
        return intent.filterHashCode();
    }

    public final String toString() {
        return "AndroidComponentAddress[" + String.valueOf(this.a) + "]";
    }
}
