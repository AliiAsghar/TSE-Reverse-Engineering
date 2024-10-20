package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hly extends ByteArrayOutputStream {
    final /* synthetic */ hlz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hly(hlz hlzVar, int i) {
        super(i);
        this.a = hlzVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i;
        if (this.count > 0 && this.buf[this.count - 1] == 13) {
            i = this.count - 1;
        } else {
            i = this.count;
        }
        try {
            return new String(this.buf, 0, i, this.a.a.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
