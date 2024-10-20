package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ygl implements ancv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ygl(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [ancs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, akry] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, ancv] */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.ancv
    public final andc a(ahmn ahmnVar, Object obj) {
        akul d;
        akul h;
        ListenableFuture f;
        int i = this.c;
        if (i != 0) {
            int i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    ?? r0 = this.a;
                    long j = akto.a;
                    ahmnVar.getClass();
                    akry h2 = akqj.h(akqj.b(), r0);
                    try {
                        return this.b.a(ahmnVar, obj);
                    } finally {
                    }
                } else {
                    akfa akfaVar = (akfa) obj;
                    akfa akfaVar2 = akfa.a;
                    if (akfaVar == akfaVar2) {
                        f = albo.bI(akfaVar2);
                    } else {
                        f = ancj.f(this.a.a(akfaVar.e()), new akez(akfaVar, 0), this.b);
                    }
                    return new andc(f);
                }
            } else {
                apvh apvhVar = (apvh) obj;
                apvhVar.getClass();
                Object obj2 = this.b;
                xsl xslVar = (xsl) obj2;
                Object obj3 = xslVar.g;
                Object obj4 = this.a;
                synchronized (obj3) {
                    ((xsl) obj2).h.put(obj4, apvhVar);
                }
                xok xokVar = xslVar.d;
                String str = ((pzn) obj4).a;
                byte[] bArr = null;
                if (str == null) {
                    ((alwl) ((alwl) xok.a.i()).h("com/google/android/apps/messaging/shared/transfer/FileTransferStartedCallbackHandler", "markMessageInProgress", 46, "FileTransferStartedCallbackHandler.java")).q("Upload id is empty. Message should already be marked in progress.");
                    h = aktp.ag(null);
                } else {
                    h = ((xot) xokVar.d.b()).c(str, Optional.empty()).h(new xpm(xokVar, str, i2, bArr), xokVar.b);
                }
                return new andc(h.i(new xfv(apvhVar, obj4, 9, bArr), xslVar.b));
            }
        } else {
            ygs ygsVar = (ygs) obj;
            ygsVar.getClass();
            ygs ygsVar2 = (ygs) ((AtomicReference) ((yyt) this.a).b).getAndSet(ygsVar);
            Object obj5 = this.b;
            if (ygsVar2 != null) {
                d = ygsVar2.a("New playback request").i(new xfv(ygsVar, obj5, 13), andi.a);
            } else {
                d = ygsVar.d((ahjj) obj5);
            }
            return new andc(d);
        }
    }

    public /* synthetic */ ygl(xsl xslVar, pzn pznVar, int i) {
        this.c = i;
        this.b = xslVar;
        this.a = pznVar;
    }
}
