package defpackage;

import com.google.android.libraries.abuse.hades.tartarus.runtime.TartarusKt;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aefe extends adcx implements Closeable {
    public final ByteBuffer a;

    public aefe(ByteBuffer byteBuffer) {
        super(null, null);
        this.a = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = aeff.a;
        TartarusKt.freeTartarusBuffer(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aefe) && d.F(this.a, ((aefe) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
