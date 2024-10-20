package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class icl {
    public final int a;
    public final String b;
    public final Instant c;
    public final int d;
    public final int e;

    public icl(int i, String str, Instant instant, int i2, int i3) {
        this.a = i;
        this.b = str;
        this.c = instant;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icl)) {
            return false;
        }
        icl iclVar = (icl) obj;
        if (this.a == iclVar.a && d.F(this.b, iclVar.b) && d.F(this.c, iclVar.c) && this.d == iclVar.d && this.e == iclVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "BugleBackupDatabaseMetadata(schemaVersion=" + this.a + ", backupId=" + this.b + ", backupTimestamp=" + this.c + ", minSchemaVersion=" + this.d + ", restoreWorkflowVersion=" + this.e + ")";
    }
}
