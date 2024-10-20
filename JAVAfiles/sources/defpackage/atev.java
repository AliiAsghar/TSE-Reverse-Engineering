package defpackage;

import java.nio.ByteBuffer;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class atev implements atff {
    public final /* synthetic */ atew a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ atev(atew atewVar, boolean z, int i) {
        this.c = i;
        this.a = atewVar;
        this.b = z;
    }

    @Override // defpackage.atff
    public final void a() {
        if (this.c != 0) {
            atew atewVar = this.a;
            long length = atewVar.c.getLength();
            atewVar.e = length;
            if (length == 0) {
                atewVar.f();
                return;
            }
            if (length > 0 && length < 8192) {
                atewVar.d = ByteBuffer.allocateDirect(((int) length) + 1);
            } else {
                atewVar.d = ByteBuffer.allocateDirect(8192);
            }
            long j = atewVar.e;
            if (j > 0) {
                atewVar.h.setFixedLengthStreamingMode(j);
            } else {
                atewVar.h.setChunkedStreamingMode(8192);
            }
            if (this.b) {
                atewVar.c();
                return;
            } else {
                atewVar.a.set(1);
                atewVar.c.rewind(atewVar);
                return;
            }
        }
        atew atewVar2 = this.a;
        long j2 = atewVar2.e;
        if (j2 != -1 && j2 - atewVar2.f < atewVar2.d.remaining()) {
            atewVar2.g(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(atewVar2.f + atewVar2.d.remaining()), Long.valueOf(atewVar2.e))));
            return;
        }
        boolean z = this.b;
        if (atewVar2.d.remaining() == 0 && !z) {
            atewVar2.g(new IllegalStateException("Bytes read can't be zero except for last chunk!"));
            return;
        }
        long j3 = atewVar2.f;
        ByteBuffer byteBuffer = atewVar2.d;
        int i = 0;
        while (byteBuffer.hasRemaining()) {
            i += atewVar2.i.write(byteBuffer);
        }
        atewVar2.j.flush();
        long j4 = j3 + i;
        atewVar2.f = j4;
        long j5 = atewVar2.e;
        if (j4 >= j5) {
            if (j5 == -1) {
                if (z) {
                    j5 = -1;
                }
            }
            if (j5 == -1) {
                atewVar2.f();
                return;
            } else if (j5 == j4) {
                atewVar2.f();
                return;
            } else {
                atewVar2.g(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(atewVar2.f), Long.valueOf(atewVar2.e))));
                return;
            }
        }
        atewVar2.a.set(0);
        atewVar2.b();
    }
}
