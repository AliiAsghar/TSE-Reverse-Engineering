package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import j$.util.Optional;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adpu {
    private static final long c = TimeUnit.SECONDS.toMillis(1);
    private final acqy d;
    public long a = ImsCapabilities.k;
    public long b = ImsCapabilities.k;
    private boolean f = false;
    private final Handler g = g();
    private final LinkedHashMap e = new LinkedHashMap(10, 0.5f, false);

    public adpu(acqy acqyVar) {
        this.d = acqyVar;
    }

    private static synchronized Handler g() {
        Handler handler;
        synchronized (adpu.class) {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            Looper myLooper = Looper.myLooper();
            myLooper.getClass();
            handler = new Handler(myLooper);
        }
        return handler;
    }

    private final void h() {
        if (!this.f && this.e.size() > 0) {
            this.g.postDelayed(new adhp(this, 13), c);
            this.f = true;
        }
    }

    public final adpo a() {
        return new adpo(this.b);
    }

    public final adpo b() {
        return new adpo(this.a);
    }

    public final synchronized Optional c(String str) {
        ImsCapabilities imsCapabilities = (ImsCapabilities) this.e.get(str);
        if (imsCapabilities != null) {
            advr.o("Found cached capabilities for %s: %s", advq.PHONE_NUMBER.c(str), imsCapabilities);
            return Optional.of(imsCapabilities);
        }
        acud f = this.d.f(str);
        ImsCapabilities imsCapabilities2 = new ImsCapabilities(this.a);
        if (f.b == 2) {
            imsCapabilities2.e(true);
            imsCapabilities2.c = f.d;
            imsCapabilities2.g = f.e;
            imsCapabilities2.i(f.a(acuc.HTTP_FT));
            imsCapabilities2.s(f.a(acuc.STICKERS));
            imsCapabilities2.k(f.a(acuc.LOCATION_PUSH));
            imsCapabilities2.o(f.a(acuc.IP_VIDEO_CALL_ONLY));
            imsCapabilities2.m(f.a(acuc.IP_CALL));
            imsCapabilities2.e = f.c;
            imsCapabilities2.g(f.a(acuc.FILE_TRANSFER_VIA_SMS));
            imsCapabilities2.l(f.a(acuc.LOCATION_VIA_SMS));
            imsCapabilities2.p(f.a(acuc.UP_2_0));
            imsCapabilities2.r(f.a(acuc.UP_2_0));
        }
        if (acud.a.equals(f)) {
            advr.o("Found no cached capabilities for %s", advq.PHONE_NUMBER.c(str));
            return Optional.empty();
        }
        advr.o("Found cached capabilities for %s in database: %s", advq.PHONE_NUMBER.c(str), imsCapabilities2);
        if (str != null) {
            this.e.put(str, imsCapabilities2);
        }
        return Optional.of(imsCapabilities2);
    }

    public final synchronized void d() {
        this.f = false;
        if (this.e.size() == 0) {
            advr.c("The cache is empty. Nothing to do.", new Object[0]);
            return;
        }
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            ImsCapabilities imsCapabilities = (ImsCapabilities) it.next();
            if (!imsCapabilities.O()) {
                advr.c("Removing item %s", imsCapabilities);
                it.remove();
            }
        }
        h();
    }

    public final void e(String str) {
        ImsCapabilities imsCapabilities = new ImsCapabilities(this.b);
        imsCapabilities.c = false;
        imsCapabilities.d = false;
        f(str, imsCapabilities);
    }

    public final synchronized void f(String str, ImsCapabilities imsCapabilities) {
        int i = 1;
        if (TextUtils.isEmpty(str)) {
            advr.q("Unable to cache capabilities for empty MSISDN: %s", imsCapabilities);
            return;
        }
        acqy acqyVar = this.d;
        if (true == imsCapabilities.y()) {
            i = 2;
        }
        acqyVar.k(str, i, imsCapabilities);
        this.e.remove(str);
        this.e.put(str, imsCapabilities);
        h();
    }
}
