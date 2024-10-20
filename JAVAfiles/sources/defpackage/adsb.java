package defpackage;

import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adsb implements adpv {
    private final adps a;
    private final adpu b;

    public adsb(adps adpsVar, adpu adpuVar) {
        this.a = adpsVar;
        this.b = adpuVar;
    }

    @Override // defpackage.adpv
    public final void k(long j, String str, adpo adpoVar) {
        advr.o("Received capabilities for %s: %s", advr.a(str), adpoVar);
        if (adpoVar.y()) {
            advr.o("updating RCS contact %s", advr.a(str));
        } else if (!adpoVar.c && adpoVar.d) {
            advr.o("updating offline contact %s", advr.a(str));
        } else {
            advr.o("updating non RCS contact %s", advr.a(str));
        }
        this.a.d(j, str, new ImsCapabilities(adpoVar));
    }

    @Override // defpackage.adpv
    public final void l(long j, String str) {
        advr.o("update error for contact %s", advr.a(str));
        ImsCapabilities imsCapabilities = new ImsCapabilities(this.b.a);
        adps adpsVar = this.a;
        Optional c = adpsVar.c.c(str);
        if (c.isEmpty()) {
            adpsVar.d(j, str, imsCapabilities);
        } else {
            adpsVar.e(j, str, (ImsCapabilities) c.get());
        }
    }
}
