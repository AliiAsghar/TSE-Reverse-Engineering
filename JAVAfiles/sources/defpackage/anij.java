package defpackage;

import android.database.sqlite.SQLiteException;
import android.os.Trace;
import com.google.communication.synapse.security.scytale.SqlTransactionInterface;
import io.grpc.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anij extends SqlTransactionInterface {
    private static final alwo a = alwo.o("SqlTransaction");
    private boolean b = false;
    private final iew c;

    /* JADX WARN: Type inference failed for: r6v1, types: [armf, java.lang.Object] */
    public anij(iew iewVar) {
        this.c = iewVar;
        ((alwl) a.m().h("com/google/communication/synapse/security/scytale/store/SqlTransaction", "<init>", 46, "SqlTransaction.java")).q("executing sql: BEGIN TRANSACTION;");
        ((agnw) iewVar.a.b()).j().beginTransaction();
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [armf, java.lang.Object] */
    @Override // com.google.communication.synapse.security.scytale.SqlTransactionInterface
    public final Status commit() {
        Status aB;
        Trace.beginSection("SqlTransaction.commit");
        try {
            try {
                ((alwl) a.m().h("com/google/communication/synapse/security/scytale/store/SqlTransaction", "commit", 54, "SqlTransaction.java")).q("executing sql: COMMIT;");
                if (!this.b && this.c.h()) {
                    try {
                        try {
                            ((agnw) this.c.a.b()).j().setTransactionSuccessful();
                            this.c.g();
                            this.b = true;
                            aB = Status.b;
                        } catch (Throwable th) {
                            this.c.g();
                            throw th;
                        }
                    } catch (SQLiteException e) {
                        ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlTransaction", "commit", ';', "SqlTransaction.java")).q("Error with setTransactionSuccessful.");
                        aB = albo.aB(e);
                        this.c.g();
                    }
                } else {
                    aB = Status.d;
                }
            } catch (Exception e2) {
                ((alwl) ((alwl) ((alwl) a.i()).g(e2)).h("com/google/communication/synapse/security/scytale/store/SqlTransaction", "commit", 'E', "SqlTransaction.java")).q("Error committing transaction.");
                aB = albo.aB(e2);
            }
            return aB;
        } finally {
            Trace.endSection();
        }
    }

    protected final void finalize() {
        if (!this.b) {
            alwo alwoVar = a;
            ((alwl) ((alwl) alwoVar.h()).h("com/google/communication/synapse/security/scytale/store/SqlTransaction", "finalize", 99, "SqlTransaction.java")).q("Transaction was not rolled back or committed before dereferencing this object. Rolling it back now");
            Trace.beginSection("SqlTransaction.rollback");
            try {
                ((alwl) ((alwl) alwoVar.g()).h("com/google/communication/synapse/security/scytale/store/SqlTransaction", "rollback", 81, "SqlTransaction.java")).q("executing sql: ROLLBACK;");
                if (!this.b && this.c.h()) {
                    this.c.g();
                    this.b = true;
                    List list = Status.a;
                    return;
                }
                List list2 = Status.a;
            } catch (Exception e) {
                ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlTransaction", "rollback", 'Y', "SqlTransaction.java")).q("Error rolling back transaction.");
                albo.aB(e);
            } finally {
                Trace.endSection();
            }
        }
    }

    @Override // com.google.communication.synapse.security.scytale.SqlTransactionInterface
    public final Status rollback() {
        Status aB;
        Trace.beginSection("SqlTransaction.rollback");
        try {
            try {
                ((alwl) ((alwl) a.g()).h("com/google/communication/synapse/security/scytale/store/SqlTransaction", "rollback", 81, "SqlTransaction.java")).q("executing sql: ROLLBACK;");
                if (!this.b && this.c.h()) {
                    this.c.g();
                    this.b = true;
                    aB = Status.b;
                } else {
                    aB = Status.d;
                }
            } catch (Exception e) {
                ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlTransaction", "rollback", 'Y', "SqlTransaction.java")).q("Error rolling back transaction.");
                aB = albo.aB(e);
            }
            return aB;
        } finally {
            Trace.endSection();
        }
    }
}
