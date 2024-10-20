package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xpt extends Exception {
    private final xoc a;
    private final boolean b;

    public xpt(boolean z, String str, byte[] bArr) {
        this(z, xoc.FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED, str, (byte[]) null);
    }

    public static akul a(String str) {
        return aktp.af(new xpt(false, str));
    }

    public static akul b(String str) {
        return aktp.af(new xpt(true, str));
    }

    public static akul c(String str, Throwable th) {
        return aktp.af(new xpt(true, str, th));
    }

    public final Boolean d() {
        return Boolean.valueOf(this.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xpt)) {
            return false;
        }
        xpt xptVar = (xpt) obj;
        if (d().equals(xptVar.d()) && this.a.equals(xptVar.a) && albo.ag(getMessage()).equals(xptVar.getMessage())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), this.a, Integer.valueOf(super.hashCode()));
    }

    private xpt(boolean z, xoc xocVar, String str, byte[] bArr) {
        super(str);
        this.a = xocVar;
        this.b = z;
    }

    public xpt(boolean z, xoc xocVar, String str) {
        this(z, xocVar, str, (byte[]) null);
    }

    public xpt(boolean z, String str) {
        this(z, xoc.FILE_TRANSFER_FAILURE_REASON_UNKNOWN, str);
    }

    public xpt(boolean z, String str, xoc xocVar, Throwable th) {
        super(str, th);
        this.a = xocVar;
        this.b = z;
    }

    public xpt(boolean z, String str, Throwable th) {
        this(z, str, xoc.FILE_TRANSFER_FAILURE_REASON_UNKNOWN, th);
    }
}
