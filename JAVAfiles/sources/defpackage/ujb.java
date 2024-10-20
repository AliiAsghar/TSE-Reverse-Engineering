package defpackage;

import j$.util.Optional;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ujb implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ujb(Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, aegu] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.c;
        boolean z = true;
        boolean z2 = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return Long.valueOf(((alhm) this.b).b.a() - this.a);
                        }
                        akpk akpkVar = akpk.a;
                        Object obj = this.b;
                        akom akomVar = (akom) obj;
                        akomVar.b.writeLock().lock();
                        long j = this.a;
                        try {
                            try {
                                akpk a = ((akom) obj).a();
                                aozy builder = a.toBuilder();
                                if (!builder.b.isMutable()) {
                                    builder.u();
                                }
                                akpk akpkVar2 = (akpk) builder.b;
                                akpkVar2.b = 2 | akpkVar2.b;
                                akpkVar2.e = j;
                                try {
                                    ((akom) obj).e((akpk) builder.s());
                                } catch (IOException e) {
                                    ((alvg) ((alvg) ((alvg) akom.a.i()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "getLastWakeupAndSetNewWakeup", (char) 530, "SyncManagerDataStore.java")).q("Error writing sync data file. Cannot update last wakeup.");
                                }
                                akomVar.b.writeLock().unlock();
                                int i2 = a.b;
                                if ((i2 & 2) != 0) {
                                    return Long.valueOf(a.e);
                                }
                                if ((i2 & 1) != 0) {
                                    return Long.valueOf(a.c);
                                }
                                return -1L;
                            } catch (IOException e2) {
                                alhx.b(e2);
                                throw new RuntimeException(e2);
                            }
                        } catch (Throwable th) {
                            akomVar.b.writeLock().unlock();
                            throw th;
                        }
                    }
                    Optional A = ((wzw) this.b).A(new xhv(this.a));
                    int i3 = alog.d;
                    return (alog) A.orElse(alsx.a);
                }
                vak vakVar = (vak) ((vqp) this.b).f.b();
                long j2 = this.a;
                akrh e3 = aktp.e("PduPersister.deleteAttachmentIfPresent");
                try {
                    if (vcp.c(vakVar.h, vak.a(j2), "cid=?", new String[]{"<file_transfer_thumbnail>"}) <= 0) {
                        z2 = false;
                    }
                    e3.close();
                    return Boolean.valueOf(z2);
                } catch (Throwable th2) {
                    try {
                        e3.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            if (this.a - ((Long) albo.bQ(((mic) this.b).C)).longValue() >= mic.j) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return (Boolean) ((ujc) this.b).c.c("RichCardMessagePartMediaDownloadHandler#onStart", new vrz(this.a, true ? 1 : 0));
    }
}
