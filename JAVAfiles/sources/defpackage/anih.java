package defpackage;

import android.database.Cursor;
import android.os.Trace;
import com.google.communication.synapse.security.scytale.SqlStatementInterface;
import com.google.media.webrtc.common.StatusOr;
import io.grpc.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anih extends SqlStatementInterface {
    private static final alwo b = alwo.o("SqlStatement");
    private final String c;
    private final iew f;
    final anii a = new anii();
    private Cursor d = null;
    private boolean e = false;

    public anih(iew iewVar, String str) {
        this.f = iewVar;
        this.c = str;
    }

    @Override // com.google.communication.synapse.security.scytale.SqlStatementInterface
    public final Status bindInt(long j) {
        return this.a.a(j);
    }

    @Override // com.google.communication.synapse.security.scytale.SqlStatementInterface
    public final Status bindString(byte[] bArr) {
        return this.a.b(bArr);
    }

    @Override // com.google.communication.synapse.security.scytale.SqlStatementInterface
    public final void close() {
        Trace.beginSection("SqlStatement.close");
        try {
            try {
                Cursor cursor = this.d;
                if (cursor != null) {
                    cursor.close();
                    this.d = null;
                }
            } catch (Exception e) {
                ((alwl) ((alwl) ((alwl) b.i()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "close", (char) 217, "SqlStatement.java")).q("Error closing cursor in SqlStatement.");
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [armf, java.lang.Object] */
    @Override // com.google.communication.synapse.security.scytale.SqlStatementInterface
    public final Status execute() {
        Status aB;
        iew iewVar;
        String str;
        anii aniiVar;
        if (this.f == null) {
            ((alwl) ((alwl) b.h()).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "execute", 78, "SqlStatement.java")).q("DBWrapper must be not null.");
            return Status.k;
        }
        if (this.c == null) {
            ((alwl) ((alwl) b.h()).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "execute", 82, "SqlStatement.java")).q("sql must be not null.");
            return Status.e;
        }
        Trace.beginSection("SqlStatement.execute");
        try {
            try {
                ((alwl) b.m().h("com/google/communication/synapse/security/scytale/store/SqlStatement", "execute", 87, "SqlStatement.java")).t("executing sql stmt: %s", this.c);
                iewVar = this.f;
                str = this.c;
                aniiVar = this.a;
            } catch (Exception e) {
                ((alwl) ((alwl) ((alwl) b.h()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "execute", 96, "SqlStatement.java")).t("Error executing sql statement %s.", this.c);
                aB = albo.aB(e);
            }
            if (!aniiVar.d) {
                List list = aniiVar.c;
                Cursor rawQuery = ((agnw) iewVar.a.b()).j().rawQuery(str, (String[]) list.toArray(new String[list.size()]));
                this.d = rawQuery;
                this.e = rawQuery.moveToFirst();
                aB = Status.b;
                return aB;
            }
            throw new IllegalStateException("getString can't be called after bindBlob was invoked");
        } finally {
            Trace.endSection();
        }
    }

    protected final void finalize() {
        if (this.d != null) {
            ((alwl) ((alwl) b.h()).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "finalize", 240, "SqlStatement.java")).t("Found an unclosed statement %s.", new aomj(aomi.NO_USER_DATA, this.c));
            close();
        }
    }

    @Override // com.google.communication.synapse.security.scytale.SqlStatementInterface
    public final StatusOr<byte[]> getBlob(int i) {
        StatusOr<byte[]> fromStatus;
        if (this.d == null) {
            ((alwl) ((alwl) b.h()).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "getBlob", 192, "SqlStatement.java")).q("execute must be called first.");
            return StatusOr.fromStatus(Status.k.withDescription("getBlob(): execute must be called first"));
        }
        Trace.beginSection("SqlStatement.getBlob");
        try {
            try {
                fromStatus = StatusOr.fromValue(this.d.getBlob(i));
            } catch (Exception e) {
                ((alwl) ((alwl) ((alwl) b.h()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "getBlob", (char) 200, "SqlStatement.java")).q("Error getting blob in SqlStatement.");
                fromStatus = StatusOr.fromStatus(albo.aB(e));
            }
            return fromStatus;
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.communication.synapse.security.scytale.SqlStatementInterface
    public final StatusOr<Long> getInt(int i) {
        StatusOr<Long> fromStatus;
        if (this.d == null) {
            ((alwl) ((alwl) b.h()).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "getInt", 143, "SqlStatement.java")).q("execute must be called first.");
            return StatusOr.fromStatus(Status.k.withDescription("getInt(): execute must be called first"));
        }
        Trace.beginSection("SqlStatement.getInt");
        try {
            try {
                fromStatus = StatusOr.fromValue(Long.valueOf(this.d.getLong(i)));
            } catch (Exception e) {
                ((alwl) ((alwl) ((alwl) b.i()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "getInt", (char) 151, "SqlStatement.java")).q("Error getting int in SqlStatement.");
                fromStatus = StatusOr.fromStatus(albo.aB(e));
            }
            return fromStatus;
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.communication.synapse.security.scytale.SqlStatementInterface
    public final StatusOr<byte[]> getString(int i) {
        StatusOr<byte[]> fromStatus;
        if (this.d == null) {
            ((alwl) ((alwl) b.h()).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "getString", 164, "SqlStatement.java")).q("execute must be called first.");
            return StatusOr.fromStatus(Status.k.withDescription("getString(): execute must be called first"));
        }
        Trace.beginSection("SqlStatement.getString");
        try {
            try {
                char[] charArray = this.d.getString(i).toCharArray();
                byte[] bArr = new byte[charArray.length];
                for (int i2 = 0; i2 < charArray.length; i2++) {
                    bArr[i2] = (byte) charArray[i2];
                }
                fromStatus = StatusOr.fromValue(bArr);
            } catch (Exception e) {
                ((alwl) ((alwl) ((alwl) b.i()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "getString", (char) 179, "SqlStatement.java")).q("Error getting string in SqlStatement.");
                fromStatus = StatusOr.fromStatus(albo.aB(e));
            }
            return fromStatus;
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.communication.synapse.security.scytale.SqlStatementInterface
    public final boolean hasNext() {
        if (this.d == null) {
            ((alwl) ((alwl) b.h()).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "hasNext", 133, "SqlStatement.java")).q("hasNext(): execute must be called first.");
            return false;
        }
        return this.e;
    }

    @Override // com.google.communication.synapse.security.scytale.SqlStatementInterface
    public final Status moveNext() {
        Status aB;
        if (this.d == null) {
            ((alwl) ((alwl) b.h()).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "moveNext", 110, "SqlStatement.java")).q("execute must be called first.");
            return Status.k.withDescription("moveNext(): execute must be called first.");
        }
        Trace.beginSection("SqlStatement.moveNext");
        try {
            try {
                this.e = this.d.moveToNext();
                aB = Status.b;
            } catch (Exception e) {
                ((alwl) ((alwl) ((alwl) b.i()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "moveNext", 'w', "SqlStatement.java")).q("Error moving to next in SqlStatement.");
                aB = albo.aB(e);
            }
            return aB;
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.communication.synapse.security.scytale.SqlStatementInterface
    public final void reset() {
        Trace.beginSection("SqlStatement.reset");
        try {
            this.a.c();
            close();
        } finally {
            Trace.endSection();
        }
    }
}
