package defpackage;

import android.telephony.ims.RcsContactUceCapability;
import android.telephony.ims.RcsUceAdapter;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class pvc implements RcsUceAdapter.CapabilitiesCallback {
    final /* synthetic */ pvd a;
    private final dtq b;
    private final long c;

    public pvc(pvd pvdVar, dtq dtqVar, long j) {
        this.a = pvdVar;
        this.b = dtqVar;
        this.c = j;
    }

    public final void onCapabilitiesReceived(List list) {
        if (list.size() != 1) {
            this.b.d(new psx(String.format(Locale.US, "[Single Registration] Getting Capabilities failed: Expected 1 set but found: %d", Integer.valueOf(list.size()))));
            this.a.e(this.c);
            return;
        }
        this.b.b((RcsContactUceCapability) list.get(0));
        try {
            this.a.f.c(this.c, 3, list);
        } catch (RuntimeException e) {
            advr.r(new advp("(SingleContactAdapterCallback)"), "[SR] there was an error logging the capabilities discovery id[%d] to clearcut: %s", Long.valueOf(this.c), e.getMessage());
        }
    }

    public final void onError(int i, long j) {
        boolean z = true;
        String format = String.format(Locale.US, "[Single Registration] Getting capabilities failed. Platform returned error code: %d", Integer.valueOf(i));
        if (i != 9 && i != 11 && i != 12) {
            z = false;
        }
        this.b.d(new psx(format, i, z));
        this.a.f.a(this.c, 3, i, j);
    }

    public final void onComplete() {
    }
}
