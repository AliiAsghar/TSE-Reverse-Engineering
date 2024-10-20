package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acrs extends assq {
    private long a;

    public acrs(InputStream inputStream, String str, String str2) {
        super(inputStream, str, str2);
        try {
            long available = inputStream.available();
            this.a = available;
            if (available >= 0) {
            } else {
                throw new IllegalArgumentException("Invalid input stream!");
            }
        } catch (IOException unused) {
            throw new IllegalArgumentException("Input stream not ready!");
        }
    }

    @Override // defpackage.assq, defpackage.asso
    public final long a() {
        return this.a;
    }
}
