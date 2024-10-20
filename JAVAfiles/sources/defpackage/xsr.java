package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xsr {
    public Optional a;
    public Optional b;
    public Object c;
    private Object d;

    public xsr() {
        throw null;
    }

    public final xss a() {
        Object obj;
        Object obj2 = this.c;
        if (obj2 != null && (obj = this.d) != null) {
            return new xss((rve) obj2, this.a, this.b, (qeq) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" rcsMessageId");
        }
        if (this.d == null) {
            sb.append(" fileUploadResponse");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        this.a = Optional.ofNullable(str);
    }

    public final void c(qeq qeqVar) {
        if (qeqVar != null) {
            this.d = qeqVar;
            return;
        }
        throw new NullPointerException("Null fileUploadResponse");
    }

    public final viw d() {
        Object obj = this.d;
        if (obj != null) {
            return new viw((amme) obj, (Optional) this.c, this.a, this.b);
        }
        throw new IllegalStateException("Missing required properties: issueType");
    }

    public final void e(amme ammeVar) {
        if (ammeVar != null) {
            this.d = ammeVar;
            return;
        }
        throw new NullPointerException("Null issueType");
    }

    public xsr(byte[] bArr, byte[] bArr2) {
        this.c = Optional.empty();
        this.a = Optional.empty();
        this.b = Optional.empty();
    }

    public xsr(byte[] bArr) {
        this.a = Optional.empty();
        this.b = Optional.empty();
    }
}
