package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akom {
    public static final alvi a = alvi.m("com/google/apps/tiktok/sync/impl/SyncManagerDataStore");
    public final Context c;
    public final anen d;
    public final aegu e;
    private final agrk h;
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    public final AtomicBoolean f = new AtomicBoolean(false);
    public long g = -1;

    public akom(Context context, anen anenVar, agrk agrkVar, aegu aeguVar) {
        Boolean bool = false;
        bool.getClass();
        bool.getClass();
        this.h = agrkVar;
        this.e = aeguVar;
        this.c = context;
        this.d = anenVar;
    }

    private final File g() {
        return new File(this.c.getFilesDir().getPath(), "103795117");
    }

    public final akpk a() {
        FileInputStream fileInputStream;
        File g = g();
        this.b.readLock().lock();
        try {
            if (!g.exists() && this.h.i()) {
                akat.c(aktp.V(new akhg(this, 14), this.d), "Process database cleanup future failed", new Object[0]);
            }
            akpk akpkVar = null;
            FileInputStream fileInputStream2 = null;
            if (g.exists()) {
                try {
                    fileInputStream = new FileInputStream(g);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    akpkVar = (akpk) akpk.parseDelimitedFrom(akpk.a, fileInputStream);
                    d.q(fileInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    d.q(fileInputStream2);
                    throw th;
                }
            }
            if (akpkVar == null) {
                return akpk.a;
            }
            return akpkVar;
        } finally {
            this.b.readLock().unlock();
        }
    }

    public final ListenableFuture b() {
        return ancj.f(c(), akto.a(new akok(this, 0)), this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ListenableFuture c() {
        if (this.f.get()) {
            return albo.bI(Long.valueOf(this.g));
        }
        return this.d.submit(akto.k(new aidu(this, 16)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ListenableFuture d(final akot akotVar, final long j, final boolean z) {
        return this.d.submit(new Callable() { // from class: akol
            @Override // java.util.concurrent.Callable
            public final Object call() {
                akot akotVar2;
                akom akomVar = akom.this;
                akomVar.b.writeLock().lock();
                long j2 = j;
                try {
                    akpk akpkVar = akpk.a;
                    try {
                        akpkVar = akomVar.a();
                    } catch (IOException e) {
                        if (!akomVar.f(e)) {
                            ((alvg) ((alvg) ((alvg) akom.a.h()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateLastSyncTime", (char) 354, "SyncManagerDataStore.java")).q("Unable to read or clear store, will not update sync time. Sync may run too frequently.");
                        }
                    }
                    aozy createBuilder = akpk.a.createBuilder();
                    createBuilder.w(akpkVar);
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((akpk) createBuilder.b).d = akpk.emptyProtobufList();
                    Iterator<E> it = akpkVar.d.iterator();
                    akpj akpjVar = null;
                    while (true) {
                        boolean hasNext = it.hasNext();
                        akotVar2 = akotVar;
                        if (!hasNext) {
                            break;
                        }
                        akpj akpjVar2 = (akpj) it.next();
                        akpm akpmVar = akpjVar2.c;
                        if (akpmVar == null) {
                            akpmVar = akpm.a;
                        }
                        if (akotVar2.equals(new akot(akpmVar))) {
                            akpjVar = akpjVar2;
                        } else {
                            createBuilder.aA(akpjVar2);
                        }
                    }
                    if (akpjVar != null) {
                        if (akpkVar.c < 0) {
                            long j3 = akomVar.g;
                            if (j3 < 0) {
                                j3 = akomVar.e.f().toEpochMilli();
                                akomVar.g = j3;
                            }
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            akpk akpkVar2 = (akpk) createBuilder.b;
                            akpkVar2.b |= 1;
                            akpkVar2.c = j3;
                        }
                        aozy createBuilder2 = akpj.a.createBuilder();
                        akpm akpmVar2 = akotVar2.a;
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        apag apagVar = createBuilder2.b;
                        akpj akpjVar3 = (akpj) apagVar;
                        akpmVar2.getClass();
                        akpjVar3.c = akpmVar2;
                        akpjVar3.b |= 1;
                        if (!apagVar.isMutable()) {
                            createBuilder2.u();
                        }
                        apag apagVar2 = createBuilder2.b;
                        akpj akpjVar4 = (akpj) apagVar2;
                        akpjVar4.b |= 4;
                        akpjVar4.e = j2;
                        if (z) {
                            if (!apagVar2.isMutable()) {
                                createBuilder2.u();
                            }
                            apag apagVar3 = createBuilder2.b;
                            akpj akpjVar5 = (akpj) apagVar3;
                            akpjVar5.b |= 2;
                            akpjVar5.d = j2;
                            if (!apagVar3.isMutable()) {
                                createBuilder2.u();
                            }
                            akpj akpjVar6 = (akpj) createBuilder2.b;
                            akpjVar6.b |= 8;
                            akpjVar6.f = 0;
                        } else {
                            long j4 = akpjVar.d;
                            if (!apagVar2.isMutable()) {
                                createBuilder2.u();
                            }
                            apag apagVar4 = createBuilder2.b;
                            akpj akpjVar7 = (akpj) apagVar4;
                            akpjVar7.b |= 2;
                            akpjVar7.d = j4;
                            int i = akpjVar.f + 1;
                            if (!apagVar4.isMutable()) {
                                createBuilder2.u();
                            }
                            akpj akpjVar8 = (akpj) createBuilder2.b;
                            akpjVar8.b |= 8;
                            akpjVar8.f = i;
                        }
                        createBuilder.aA((akpj) createBuilder2.s());
                        try {
                            akomVar.e((akpk) createBuilder.s());
                        } catch (IOException e2) {
                            ((alvg) ((alvg) ((alvg) akom.a.h()).g(e2)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateLastSyncTime", (char) 414, "SyncManagerDataStore.java")).q("Error writing sync data file after sync. Sync may run too frequently.");
                        }
                    }
                    return null;
                } finally {
                    akomVar.b.writeLock().unlock();
                }
            }
        });
    }

    public final void e(akpk akpkVar) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(g());
        } catch (Throwable th) {
            th = th;
            fileOutputStream = null;
        }
        try {
            akpkVar.writeDelimitedTo(fileOutputStream);
            fileOutputStream.close();
        } catch (Throwable th2) {
            th = th2;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw th;
        }
    }

    public final boolean f(Throwable th) {
        ((alvg) ((alvg) ((alvg) a.i()).g(th)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "clearStore", (char) 615, "SyncManagerDataStore.java")).q("Could not read sync datastore. There was probably a write error. Wiping store.");
        this.b.writeLock().lock();
        try {
            boolean z = false;
            this.f.set(false);
            long j = this.g;
            if (j <= 0) {
                j = this.e.f().toEpochMilli();
            }
            aozy createBuilder = akpk.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            akpk akpkVar = (akpk) createBuilder.b;
            akpkVar.b |= 1;
            akpkVar.c = j;
            try {
                try {
                    e((akpk) createBuilder.s());
                    z = true;
                } catch (IOException e) {
                    ((alvg) ((alvg) ((alvg) a.h()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "clearStore", (char) 635, "SyncManagerDataStore.java")).q("Could not write to datastore to clear store.");
                    this.f.set(false);
                }
                return z;
            } finally {
            }
        } finally {
            this.b.writeLock().unlock();
        }
    }
}
