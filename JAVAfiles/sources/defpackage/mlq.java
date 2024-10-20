package defpackage;

import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mlq implements ncp {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mlq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, arqg] */
    @Override // defpackage.ncp
    public final akul a() {
        akul c;
        akul c2;
        switch (this.b) {
            case 0:
                return ((mls) ((mlr) this.a).a).f();
            case 1:
                this.a.a();
                return aktp.ag(null);
            case 2:
                return ((mls) ((mlr) this.a).a).f();
            case 3:
                return ((moc) this.a).d();
            case 4:
                return ((mpx) this.a).d();
            case 5:
                return ((mwf) this.a).e("SelfIdentity Rcs");
            case 6:
                return ((mwf) this.a).e("Recipient Rcs Capabilities");
            case 7:
                return ((mwf) this.a).e("SelfIdentity Encryption");
            case 8:
                return ((mwf) ((mlr) this.a).a).e("Conversation Properties");
            case 9:
                mxa mxaVar = (mxa) this.a;
                c = qjh.c(mxaVar.b, arpj.a, arwf.a, new ikp(mxaVar, (arpe) null, 5));
                return c;
            case 10:
                return ((mxc) ((mlr) this.a).a).d();
            case 11:
                ncl nclVar = (ncl) this.a;
                c2 = qjh.c(nclVar.a, arpj.a, arwf.a, new ikp(nclVar, (arpe) null, 6));
                return c2;
            default:
                Object obj = this.a;
                nco ncoVar = (nco) obj;
                synchronized (ncoVar.a) {
                    if (((Optional) ((nco) obj).b.get()).isEmpty()) {
                        return aktp.ag(null);
                    }
                    AtomicReference atomicReference = ((nco) obj).b;
                    ncq ncqVar = ((nco) obj).d;
                    ncqVar.getClass();
                    atomicReference.set(Optional.of(new akbj(new ikm(ncqVar, 10), ((nco) obj).c)));
                    ncoVar.e.y(new mqr(14), "changeValue");
                    return aktp.ag(null);
                }
        }
    }
}
