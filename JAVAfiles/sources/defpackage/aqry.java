package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqry implements aqrz {
    public static final aqrz a = new aqry(0);
    private final /* synthetic */ int b;

    public aqry(int i) {
        this.b = i;
    }

    @Override // defpackage.aqso
    public final InputStream a(InputStream inputStream) {
        if (this.b != 0) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    @Override // defpackage.aqsa
    public final OutputStream b(OutputStream outputStream) {
        if (this.b != 0) {
            return new GZIPOutputStream(outputStream);
        }
        return outputStream;
    }

    @Override // defpackage.aqsa, defpackage.aqso
    public final String c() {
        if (this.b != 0) {
            return "gzip";
        }
        return "identity";
    }
}
