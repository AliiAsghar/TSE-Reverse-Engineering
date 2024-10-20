package defpackage;

import com.google.android.ims.rcsservice.contacts.CapabilitiesUpdateEvent;
import com.google.android.ims.rcsservice.contacts.ContactsServiceResult;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adps {
    public adew a;
    public adpw b;
    public final adpu c;
    private final aduu e;
    private final acrm f;
    private final ExecutorService g;
    private final yjr i;
    private final adfg j;
    private final Map h = DesugarCollections.synchronizedMap(new HashMap());
    public final AtomicBoolean d = new AtomicBoolean(false);

    public adps(aduu aduuVar, acrm acrmVar, yjr yjrVar, adpu adpuVar, ExecutorService executorService, adfg adfgVar) {
        this.e = aduuVar;
        this.f = acrmVar;
        this.i = yjrVar;
        this.c = adpuVar;
        this.g = executorService;
        this.j = adfgVar;
    }

    private static ImsCapabilities g() {
        ImsCapabilities imsCapabilities = new ImsCapabilities(adpo.a);
        imsCapabilities.e(true);
        imsCapabilities.c = true;
        return imsCapabilities;
    }

    public final ContactsServiceResult a(String str) {
        return b(str, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.ims.rcsservice.contacts.ContactsServiceResult b(java.lang.String r13, int r14) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adps.b(java.lang.String, int):com.google.android.ims.rcsservice.contacts.ContactsServiceResult");
    }

    public final ImsCapabilities c(String str) {
        if (aczx.t()) {
            return g();
        }
        return (ImsCapabilities) this.c.c(str).orElseGet(new adpp(this, 0));
    }

    public final void d(long j, String str, ImsCapabilities imsCapabilities) {
        this.h.remove(str);
        this.c.f(str, imsCapabilities);
        e(j, str, imsCapabilities);
    }

    public final void e(long j, String str, ImsCapabilities imsCapabilities) {
        if (!imsCapabilities.c) {
            ImsCapabilities c = c(str);
            imsCapabilities.s(c.u());
            imsCapabilities.i(c.C());
        }
        this.f.c(new CapabilitiesUpdateEvent(j, str, adta.f(imsCapabilities)), advy.CAPABILITIES_DISCOVERY);
    }

    public final void f() {
        this.d.set(false);
        this.h.clear();
    }
}
