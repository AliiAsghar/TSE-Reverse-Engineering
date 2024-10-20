package defpackage;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ackt implements abrk, abrm {
    public final OutputStream a;
    private final Status b;

    public ackt(Status status, OutputStream outputStream) {
        abhg.m(status);
        this.b = status;
        this.a = outputStream;
    }

    @Override // defpackage.abrm
    public final Status a() {
        return this.b;
    }

    @Override // defpackage.abrk
    public final void b() {
        OutputStream outputStream = this.a;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
