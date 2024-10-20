package defpackage;

import j$.util.Optional;
import java.net.URI;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anjh {
    private aqfn a;
    private Optional b;
    private byte c;

    public anjh() {
        throw null;
    }

    public final anji a() {
        int i = ~this.c;
        if ((i & 1) == 0) {
            return new anji(this.a, this.b, i & 2);
        }
        throw new IllegalStateException("Missing required properties: id");
    }

    public final void b(aqfn aqfnVar) {
        if (aqfnVar != null) {
            this.a = aqfnVar;
            this.c = (byte) (this.c | 1);
            return;
        }
        throw new NullPointerException("Null id");
    }

    public final void c(URI uri) {
        this.b = Optional.of(uri);
        this.c = (byte) (this.c | 2);
    }

    public anjh(byte[] bArr) {
        this.b = Optional.empty();
    }
}
