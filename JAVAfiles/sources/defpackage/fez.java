package defpackage;

import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fez {
    public final Set a = new HashSet();
    public Object b;

    public fez(byte[] bArr) {
    }

    public final void a(MediaCodec mediaCodec) {
        boolean addMediaCodec;
        Object obj = this.b;
        if (obj != null) {
            addMediaCodec = dbc$$ExternalSyntheticApiModelOutline0.m(obj).addMediaCodec(mediaCodec);
            if (!addMediaCodec) {
                return;
            }
        }
        dzg.d(((HashSet) this.a).add(mediaCodec));
    }

    public final void b(MediaCodec mediaCodec) {
        Object obj;
        if (((HashSet) this.a).remove(mediaCodec) && (obj = this.b) != null) {
            dbc$$ExternalSyntheticApiModelOutline0.m(obj).removeMediaCodec(mediaCodec);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Exception exc, boolean z) {
        this.b = null;
        Set set = this.a;
        alog n = alog.n(set);
        set.clear();
        int size = n.size();
        for (int i = 0; i < size; i++) {
            fdj fdjVar = (fdj) n.get(i);
            int i2 = 1;
            if (true != z) {
                i2 = 3;
            }
            fdjVar.f(exc, i2);
        }
    }

    public final void d(fdj fdjVar) {
        this.a.add(fdjVar);
        if (this.b != null) {
            return;
        }
        this.b = fdjVar;
        fdjVar.h();
    }

    public fez() {
    }
}
