package defpackage;

import android.telephony.ims.RcsUceAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adga implements RcsUceAdapter.OnPublishStateChangedListener {
    private final adgp a;

    public adga(adgp adgpVar) {
        this.a = adgpVar;
    }

    public final void onPublishStateChange(int i) {
        switch (i) {
            case 1:
                advr.l(this.a.i, "Received 200 OK PUBLISH response", new Object[0]);
                this.a.q(9);
                return;
            case 2:
                advr.l(this.a.i, "Has not received any PUBLISH response yet.", new Object[0]);
                return;
            case 3:
                advr.r(this.a.i, "The device has tried to publish its capabilities (VoLTE), which resulted in an error.", new Object[0]);
                return;
            case 4:
            case 6:
                advr.r(this.a.i, "The device has tried to publish its capabilities (RCS), which resulted in  error code:[%d]", Integer.valueOf(i));
                this.a.q(10);
                return;
            case 5:
                advr.r(this.a.i, "The last publish resulted in 408 Request Timeout response.", new Object[0]);
                this.a.q(10);
                return;
            default:
                advr.r(this.a.i, "Unknown publish state change, code:[%d]", Integer.valueOf(i));
                return;
        }
    }
}
