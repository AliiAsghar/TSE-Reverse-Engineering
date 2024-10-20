package defpackage;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class yas implements yjx {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ yas(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [xyt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [yao, java.lang.Object] */
    @Override // defpackage.yjx
    public final boolean a(int i) {
        int i2 = this.c;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            ((alok) this.a).h(((yla) this.b).f.x(i).a(), Integer.valueOf(i));
                            return true;
                        }
                        String r = ((yjy) ((yju) this.b).b.b()).h(i).r();
                        if (TextUtils.isEmpty(r)) {
                            return true;
                        }
                        ((String[]) this.a)[0] = r;
                        xyo c = yju.a.c();
                        c.H("updateSmsNetworkCountry from network country.");
                        c.l(i);
                        c.z("detected country", r);
                        c.q();
                        return false;
                    }
                    String u = ((yjy) ((yju) this.b).b.b()).h(i).u();
                    if (TextUtils.isEmpty(u)) {
                        return true;
                    }
                    ((String[]) this.a)[0] = u;
                    xyo c2 = yju.a.c();
                    c2.H("updateHomeCountry from SIM country.");
                    c2.l(i);
                    c2.z("detected country", u);
                    c2.q();
                    return false;
                }
                ?? r0 = this.b;
                Object obj = this.a;
                synchronized (((ybg) obj).i) {
                    ((ybg) obj).c(i);
                    ((ybg) obj).b(r0, -1);
                }
                return true;
            }
            ?? r02 = this.b;
            if (((yaq) r02.a()).d(i) != yay.AVAILABLE && ((yaq) r02.a()).b(i) != yay.AVAILABLE && ((yaq) r02.a()).c() != yay.AVAILABLE) {
                return true;
            }
            ((AtomicBoolean) this.a).set(true);
            return false;
        }
        alvw d = yav.d.d();
        d.X(alwp.a, "BugleConnectivity");
        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl$DefaultDataRegisterer", "<init>", 1012, "ConnectivityUtilImpl.java")).r("Registering offSatelliteListener for subId %d", i);
        ((wpb) ((yav) this.a).k.b()).c(i, (ahjj) this.b);
        return true;
    }

    public /* synthetic */ yas(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
