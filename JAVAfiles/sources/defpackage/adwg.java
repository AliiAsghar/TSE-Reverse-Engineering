package defpackage;

import android.content.Context;
import android.net.Network;
import android.os.Build;
import j$.util.DesugarArrays;
import j$.util.Optional;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwg {
    public final Object a;
    public Object b;
    public Object c;

    public adwg(Context context, byte[] bArr) {
        this.a = context;
    }

    public static String c(String str) {
        return f("Goog") + "/" + f(str);
    }

    private static String f(String str) {
        if (str == null) {
            return "";
        }
        return str.replace(' ', '_');
    }

    public final String a() {
        if (((Optional) this.c).isEmpty()) {
            StringBuilder sb = new StringBuilder("IM-client/OMA1.0");
            sb.append(" ");
            sb.append(f(Build.MANUFACTURER));
            sb.append("/");
            sb.append(f(Build.MODEL));
            sb.append("-");
            sb.append(f(Build.VERSION.RELEASE));
            sb.append(" ");
            sb.append(c(b()));
            ((Optional) this.b).ifPresent(new adoj(sb, 10));
            this.c = Optional.of(sb.toString());
        }
        return (String) ((Optional) this.c).get();
    }

    public final String b() {
        Context context = (Context) this.a;
        return adww.e(context, adww.a(context), 2);
    }

    public final synchronized void d(String str) {
        try {
            this.c = InetAddress.getByName(str);
            try {
                this.b = (Network) DesugarArrays.stream(e().i()).filter(new zko(this, 5)).findFirst().orElse(null);
            } catch (adwk e) {
                advr.i(e, "Can't get network, missing permissions.", new Object[0]);
            }
            advr.k("Updated network %s", this.b);
        } catch (UnknownHostException e2) {
            advr.i(e2, "Unknown ip address %s", str);
        }
    }

    public final adwp e() {
        return adwp.f((Context) this.a);
    }

    public adwg(ykw ykwVar) {
        this.c = null;
        this.b = null;
        this.a = ykwVar;
    }

    public adwg(Context context) {
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.a = context;
    }
}
