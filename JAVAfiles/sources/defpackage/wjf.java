package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wjf implements akgr {
    private final /* synthetic */ int a;

    public wjf(int i) {
        this.a = i;
    }

    @Override // defpackage.akgr
    public final akfd a() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return abgg.a;
            }
            return new akgc("FakeRcsSettingsDataService");
        }
        return new akgc("FakeRcsSettingsDataService");
    }

    @Override // defpackage.akgr
    public final /* synthetic */ ListenableFuture b() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                akul ag = aktp.ag(Optional.empty());
                ag.getClass();
                return ag;
            }
            akul ag2 = aktp.ag(Optional.empty());
            ag2.getClass();
            return ag2;
        }
        akul ag3 = aktp.ag(new wje(wiz.TOGGLE_STATE_UNSPECIFIED, arnv.a, false, false));
        ag3.getClass();
        return ag3;
    }
}
