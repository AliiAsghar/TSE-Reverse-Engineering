package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyb implements hne {
    public static final /* synthetic */ int b = 0;
    private final int c;
    private final hne d;

    public hyb(int i, hne hneVar) {
        this.c = i;
        this.d = hneVar;
    }

    @Override // defpackage.hne
    public final void a(MessageDigest messageDigest) {
        this.d.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.c).array());
    }

    @Override // defpackage.hne
    public final boolean equals(Object obj) {
        if (obj instanceof hyb) {
            hyb hybVar = (hyb) obj;
            if (this.c == hybVar.c && this.d.equals(hybVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hne
    public final int hashCode() {
        return hyv.e(this.d, this.c);
    }
}
