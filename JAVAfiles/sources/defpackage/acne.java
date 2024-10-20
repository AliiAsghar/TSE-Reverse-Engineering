package defpackage;

import android.telephony.ims.RcsContactUceCapability;
import android.telephony.ims.RcsUceAdapter;
import java.util.List;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acne implements RcsUceAdapter.CapabilitiesCallback {
    final /* synthetic */ acnf a;
    private final long b;
    private final dtq c;
    private final int d;

    public acne(acnf acnfVar, long j, int i, dtq dtqVar) {
        this.a = acnfVar;
        this.b = j;
        this.d = i;
        this.c = dtqVar;
    }

    public final void onCapabilitiesReceived(List list) {
        if (list.size() != 1) {
            this.c.d(new acng(String.format(Locale.US, "[SR] Getting Capabilities id[%d] failed: Expected 1 set but found: %d", Long.valueOf(this.b), Integer.valueOf(list.size()))));
            this.a.g.a(this.b, this.d, -1, -1L);
        } else {
            this.c.b((RcsContactUceCapability) list.get(0));
            try {
                this.a.g.c(this.b, this.d, list);
            } catch (RuntimeException e) {
                advr.q("[SR] there was an error logging the capabilities discovery id[%d] to clearcut: %s", Long.valueOf(this.b), e.getMessage());
            }
        }
    }

    public final void onError(int i, long j) {
        if (j > 0) {
            acnf acnfVar = this.a;
            acnfVar.e = acnfVar.d.a().plusMillis(j);
        }
        Long valueOf = Long.valueOf(this.b);
        Integer valueOf2 = Integer.valueOf(i);
        advr.q("[SR] UCE call id[%d] failed with error %d, cannot retry for %d milliseconds", valueOf, valueOf2, Long.valueOf(j));
        this.c.d(new acng(String.format(Locale.US, "[SR] Getting capabilities failed. Platform returned error code: %d", valueOf2)));
        this.a.g.a(this.b, this.d, i, j);
    }

    public final void onComplete() {
    }
}
