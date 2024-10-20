package defpackage;

import com.google.communication.synapse.security.scytale.DbWrapperInterface;
import com.google.communication.synapse.security.scytale.EventPublisher;
import com.google.communication.synapse.security.scytale.SqlStatementInterface;
import com.google.communication.synapse.security.scytale.SqlTransactionInterface;
import com.google.communication.synapse.security.scytale.WriteOnlySqlStatementInterface;
import com.google.media.webrtc.common.StatusOr;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class twi extends DbWrapperInterface {
    private static final xze a = xze.g("BugleDatabase", "ScytaleDBWrapper");
    private final armf b;
    private final armf c;

    public twi(armf armfVar, armf armfVar2) {
        this.b = armfVar;
        this.c = armfVar2;
    }

    private static Status a(Status status, String str) {
        if (str == null) {
            return status;
        }
        return status.withDescription(str);
    }

    @Override // com.google.communication.synapse.security.scytale.DbWrapperInterface
    public final Status execute(String str) {
        try {
            for (String str2 : str.split(";", -1)) {
                String trim = str2.trim();
                if (!trim.isEmpty()) {
                    ((agnw) this.b.b()).j().execSQL(trim);
                }
            }
            return Status.b;
        } catch (Exception e) {
            a.r("Error executing SQL statement.", e);
            return a(Status.m, e.getMessage());
        }
    }

    @Override // com.google.communication.synapse.security.scytale.DbWrapperInterface
    public final Status open(EventPublisher eventPublisher, String str) {
        return Status.b;
    }

    @Override // com.google.communication.synapse.security.scytale.DbWrapperInterface
    public final StatusOr<SqlStatementInterface> prepare(String str) {
        try {
            return StatusOr.fromValue(new anih((iew) this.c.b(), str));
        } catch (Exception e) {
            a.n("Error preparing SQL statement.", e);
            return StatusOr.fromStatus(a(Status.m, e.getMessage()));
        }
    }

    @Override // com.google.communication.synapse.security.scytale.DbWrapperInterface
    public final StatusOr<WriteOnlySqlStatementInterface> prepareWriteOnly(String str) {
        try {
            return StatusOr.fromValue(new anik((iew) this.c.b(), str));
        } catch (Exception e) {
            a.n("Error preparing write SQL statement.", e);
            return StatusOr.fromStatus(a(Status.m, e.getMessage()));
        }
    }

    @Override // com.google.communication.synapse.security.scytale.DbWrapperInterface
    public final StatusOr<SqlTransactionInterface> startTransaction() {
        try {
            return StatusOr.fromValue(new anij((iew) this.c.b()));
        } catch (Exception e) {
            a.n("Error starting SQL transaction.", e);
            return StatusOr.fromStatus(a(Status.m, e.getMessage()));
        }
    }

    @Override // com.google.communication.synapse.security.scytale.DbWrapperInterface
    public final void close() {
    }
}
