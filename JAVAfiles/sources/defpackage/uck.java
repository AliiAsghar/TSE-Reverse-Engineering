package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uck implements uco {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin");
    public final armf b;
    public final ReentrantReadWriteLock c;
    public final ThreadLocal d;
    private final ozc e;
    private final AtomicInteger f;
    private final lpg g;

    public uck(armf armfVar, lpg lpgVar, ozc ozcVar) {
        armfVar.getClass();
        this.b = armfVar;
        this.g = lpgVar;
        this.e = ozcVar;
        this.c = new ReentrantReadWriteLock(true);
        int i = tyr.a;
        this.d = new ThreadLocal() { // from class: ucj
            @Override // java.lang.ThreadLocal
            protected final /* synthetic */ Object initialValue() {
                return a.bz();
            }
        };
        this.f = new AtomicInteger(0);
    }

    @Override // defpackage.uco
    public final /* synthetic */ int e(Exception exc, int i, ude udeVar) {
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    public final long f(arqg arqgVar) {
        xnv xnvVar = (xnv) this.g.a.b();
        long a2 = xnvVar.a();
        arqgVar.a();
        return xnvVar.a() - a2;
    }

    public final void g(arqg arqgVar) {
        long f = f(new qtq(this, 14));
        try {
            alvi alviVar = a;
            alvw g = alviVar.g();
            g.X(alwp.a, "BugleDatabase");
            ((alvg) g.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "withMaintenanceWriteLock", 175, "DatabaseMaintenancePlugin.kt")).s("Took %dms acquire the lock for maintenance", f);
            long f2 = f(new qtq(arqgVar, 15));
            alvw g2 = alviVar.g();
            g2.X(alwp.a, "BugleDatabase");
            ((alvg) g2.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "withMaintenanceWriteLock", 177, "DatabaseMaintenancePlugin.kt")).s("Completed maintenance operations after %dms", f2);
        } finally {
            this.c.writeLock().unlock();
        }
    }

    @Override // defpackage.uco
    public final Closeable l(ude udeVar) {
        udf udfVar = udeVar.b;
        int i = 1;
        if (udfVar != null) {
            int ordinal = udfVar.ordinal();
            if (ordinal != 6) {
                if (ordinal == 8 || ordinal == 15) {
                    this.d.set(false);
                    return null;
                }
            } else {
                this.d.set(true);
                return null;
            }
        }
        Object obj = this.d.get();
        obj.getClass();
        if (!((Boolean) obj).booleanValue()) {
            if (!this.c.readLock().tryLock()) {
                int incrementAndGet = this.f.incrementAndGet();
                alvi alviVar = a;
                alvw i2 = alviVar.i();
                i2.X(alwp.a, "BugleDatabase");
                ((alvg) i2.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "openBlockableOperation", 95, "DatabaseMaintenancePlugin.kt")).B("Blocking new DB operation %s for maintenance. Queue number %d", udeVar.a, incrementAndGet);
                long f = f(new qtq(this, 11));
                alvw g = alviVar.g();
                g.X(alwp.a, "BugleDatabase");
                ((alvg) g.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "openBlockableOperation", 103, "DatabaseMaintenancePlugin.kt")).y("Maintenance operation blocked DB operation %s for %d ms.", f, incrementAndGet);
                this.f.decrementAndGet();
            }
            return new ucz(this, i);
        }
        return null;
    }

    @Override // defpackage.uco
    public final boolean n() {
        return ((ansy) ((oza) this.e).a.b()).e("bugle.enable_database_maintenance_plugin");
    }

    @Override // defpackage.uco
    public final /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.uco
    public final /* synthetic */ Cursor a(Cursor cursor, ude udeVar) {
        return cursor;
    }
}
