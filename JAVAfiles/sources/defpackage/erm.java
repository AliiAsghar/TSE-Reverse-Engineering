package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class erm extends IOException {
    public final boolean a;
    public final int b;

    public erm(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.a = z;
        this.b = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage() + " {contentIsMalformed=" + this.a + ", dataType=" + this.b + "}";
    }
}
