package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjs implements akfb {
    final /* synthetic */ ajwt a;
    final /* synthetic */ int b;
    public final /* synthetic */ zbl c;

    public zjs(zbl zblVar, ajwt ajwtVar, int i) {
        this.a = ajwtVar;
        this.b = i;
        this.c = zblVar;
    }

    @Override // defpackage.akfb
    public final andc a() {
        akfa akfaVar;
        if (((akfa) ((AtomicReference) this.c.c).get()).f() && ((akfa) ((AtomicReference) this.c.c).get()).g()) {
            akfaVar = (akfa) ((AtomicReference) this.c.c).get();
        } else {
            akfaVar = akfa.a;
        }
        return new andc(albo.bI(akfaVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.akfb
    public final ListenableFuture b() {
        ajzb ajzbVar = ajzb.a;
        if (ajzbVar != null) {
            return aktp.ag(new zjt(ajzbVar)).h(new zet(this, 2), this.c.a);
        }
        throw new NullPointerException("Null accountInfo");
    }

    @Override // defpackage.akfb
    public final /* bridge */ /* synthetic */ Object c() {
        return "PER_SUBSCRIPTION_SETTINGS_DATA_SERVICE" + this.b + String.valueOf(this.a);
    }
}
