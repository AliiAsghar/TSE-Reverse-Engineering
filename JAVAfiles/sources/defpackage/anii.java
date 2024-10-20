package defpackage;

import android.os.Trace;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anii {
    public static final alwo a = alwo.o("SqlStatementShared");
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public boolean d;

    public final Status a(long j) {
        Status aB;
        Trace.beginSection("SqlStatement.bindInt");
        try {
            try {
                this.c.add(String.valueOf(j));
                this.b.add(Long.valueOf(j));
                aB = Status.b;
            } catch (Exception e) {
                ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlStatementShared", "bindInt", 'Q', "SqlStatementShared.java")).q("Error binding int to SqlStatement.");
                aB = albo.aB(e);
            }
            return aB;
        } finally {
            Trace.endSection();
        }
    }

    public final Status b(byte[] bArr) {
        Status aB;
        if (bArr == null) {
            ((alwl) ((alwl) a.h()).h("com/google/communication/synapse/security/scytale/store/SqlStatementShared", "bindString", 27, "SqlStatementShared.java")).q("value can not be null.");
            return Status.e;
        }
        Trace.beginSection("SqlStatement.bindString");
        try {
            try {
                int length = bArr.length;
                char[] cArr = new char[length];
                for (int i = 0; i < length; i++) {
                    cArr[i] = (char) bArr[i];
                }
                this.c.add(new String(cArr));
                this.b.add(new String(cArr));
                aB = Status.b;
            } catch (Exception e) {
                ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlStatementShared", "bindString", '1', "SqlStatementShared.java")).q("Error binding string to SqlStatement.");
                aB = albo.aB(e);
            }
            return aB;
        } finally {
            Trace.endSection();
        }
    }

    public final void c() {
        this.b.clear();
        this.c.clear();
    }
}
