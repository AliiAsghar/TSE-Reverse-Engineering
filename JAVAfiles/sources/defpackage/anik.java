package defpackage;

import android.os.Trace;
import com.google.communication.synapse.security.scytale.WriteOnlySqlStatementInterface;
import io.grpc.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anik extends WriteOnlySqlStatementInterface {
    private static final alwo b = alwo.o("SqlStatement");
    final anii a = new anii();
    private final String c;
    private final iew d;

    public anik(iew iewVar, String str) {
        this.d = iewVar;
        this.c = str;
    }

    @Override // com.google.communication.synapse.security.scytale.WriteOnlySqlStatementInterface
    public final Status bindBlob(byte[] bArr) {
        Status aB;
        anii aniiVar = this.a;
        if (bArr == null) {
            ((alwl) ((alwl) anii.a.h()).h("com/google/communication/synapse/security/scytale/store/SqlStatementShared", "bindBlob", 58, "SqlStatementShared.java")).q("value can not be null.");
            return Status.e;
        }
        Trace.beginSection("SqlStatement.bindBlob");
        try {
            try {
                aniiVar.d = true;
                aniiVar.b.add(bArr);
                aB = Status.b;
            } catch (Exception e) {
                ((alwl) ((alwl) ((alwl) anii.a.i()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlStatementShared", "bindBlob", 'C', "SqlStatementShared.java")).q("Error binding string to SqlStatement.");
                aB = albo.aB(e);
            }
            return aB;
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.communication.synapse.security.scytale.WriteOnlySqlStatementInterface
    public final Status bindInt(long j) {
        return this.a.a(j);
    }

    @Override // com.google.communication.synapse.security.scytale.WriteOnlySqlStatementInterface
    public final Status bindString(byte[] bArr) {
        return this.a.b(bArr);
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [armf, java.lang.Object] */
    @Override // com.google.communication.synapse.security.scytale.WriteOnlySqlStatementInterface
    public final Status executeWrite() {
        Status aB;
        Trace.beginSection("WriteOnlySqlStatement.executeWrite");
        try {
            try {
                ((alwl) b.m().h("com/google/communication/synapse/security/scytale/store/WriteOnlySqlStatement", "executeWrite", 52, "WriteOnlySqlStatement.java")).t("executing write sql stmt: %s", this.c);
                iew iewVar = this.d;
                String str = this.c;
                List list = this.a.b;
                Object[] array = list.toArray(new Object[list.size()]);
                if (array == null) {
                    ((agnw) iewVar.a.b()).j().execSQL(str);
                } else {
                    ((agnw) iewVar.a.b()).j().execSQL(str, array);
                }
                aB = Status.b;
            } catch (Exception e) {
                ((alwl) ((alwl) ((alwl) b.h()).g(e)).h("com/google/communication/synapse/security/scytale/store/WriteOnlySqlStatement", "executeWrite", 60, "WriteOnlySqlStatement.java")).t("Error executing sql statement %s.", this.c);
                aB = albo.aB(e);
            }
            return aB;
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.communication.synapse.security.scytale.WriteOnlySqlStatementInterface
    public final void reset() {
        Trace.beginSection("SqlStatement.reset");
        try {
            this.a.c();
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.communication.synapse.security.scytale.WriteOnlySqlStatementInterface
    public final void close() {
    }
}
