package defpackage;

import android.os.Process;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atep implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ atep(atfe atfeVar, atff atffVar, int i) {
        this.c = i;
        this.a = atfeVar;
        this.b = atffVar;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, atff] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, atff] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, atff] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, atff] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, ator] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                Thread.currentThread().setName("JavaCronetEngine");
                Process.setThreadPriority(((ateq) this.b).a);
                this.a.run();
                return;
            case 1:
                ((asgj) this.b).g(this.a, arnb.a);
                return;
            case 2:
                atfe atfeVar = (atfe) this.b;
                String str = atfeVar.p;
                atfc atfcVar = atfeVar.b;
                atfcVar.a(new atfb(atfcVar, (UrlResponseInfo) this.a, str, 0));
                return;
            case 3:
                try {
                    this.b.a();
                    return;
                } catch (Throwable th) {
                    ((atfe) this.a).b(new atef("System error", th));
                    return;
                }
            case 4:
                try {
                    this.b.a();
                    return;
                } catch (Throwable th2) {
                    ((atfe) this.a).c(th2);
                    return;
                }
            case 5:
                try {
                    this.b.a();
                    return;
                } catch (Throwable th3) {
                    Object obj = this.a;
                    atfa atfaVar = new atfa(obj, 1);
                    atfe atfeVar2 = (atfe) obj;
                    atfeVar2.c.execute(atfaVar);
                    atfeVar2.b(new ateb("Exception received from UrlRequest.Callback", th3));
                    return;
                }
            case 6:
                ?? r0 = this.b;
                atfe atfeVar3 = (atfe) this.a;
                atfeVar3.c.execute(new atep(atfeVar3, (atff) r0, 3));
                return;
            case 7:
                Object obj2 = this.a;
                Object obj3 = this.b;
                try {
                    ((atfc) obj3).a.onSucceeded(((atfc) obj3).d, (UrlResponseInfo) obj2);
                } catch (Exception e) {
                    ((atfc) obj3).d.h("onSucceded", e);
                }
                atfc atfcVar2 = (atfc) obj3;
                atfcVar2.b();
                atfcVar2.d.r.b();
                return;
            case 8:
                Object obj4 = this.a;
                Object obj5 = this.b;
                try {
                    ((atfc) obj5).a.onCanceled(((atfc) obj5).d, (UrlResponseInfo) obj4);
                } catch (Exception e2) {
                    ((atfc) obj5).d.h("onCanceled", e2);
                }
                atfc atfcVar3 = (atfc) obj5;
                atfcVar3.b();
                atfcVar3.d.r.b();
                return;
            case 9:
                this.b.b((Throwable) this.a);
                return;
            default:
                arhi.i(this.b).w(aqil.O((Throwable) this.a));
                return;
        }
    }

    public atep(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ atep(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
