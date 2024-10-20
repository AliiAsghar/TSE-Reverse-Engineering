package defpackage;

import android.media.AudioAttributes;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ygd {
    public yge a;
    public Optional b;
    public Optional c;
    private Optional d;
    private Optional e;
    private Optional f;

    public ygd() {
        throw null;
    }

    public final ygf a() {
        yge ygeVar = this.a;
        if (ygeVar != null) {
            return new ygf(ygeVar, this.b, this.d, this.e, this.f, this.c);
        }
        throw new IllegalStateException("Missing required properties: dataSource");
    }

    public final void b(AudioAttributes audioAttributes) {
        this.f = Optional.of(audioAttributes);
    }

    public final void c(float f) {
        this.d = Optional.of(Float.valueOf(f));
    }

    public ygd(byte[] bArr) {
        this.b = Optional.empty();
        this.d = Optional.empty();
        this.e = Optional.empty();
        this.f = Optional.empty();
        this.c = Optional.empty();
    }
}
