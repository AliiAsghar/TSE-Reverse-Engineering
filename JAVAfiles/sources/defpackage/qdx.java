package defpackage;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qdx {
    public static final uuf a = uuh.m(uuh.b, "rcs_message_id_regex", "^Mx(.){22,26}");

    public final rve a() {
        akrh e = aktp.e("RcsMessageIdGenerator::generate");
        try {
            UUID randomUUID = UUID.randomUUID();
            ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
            wrap.putLong(randomUUID.getMostSignificantBits());
            wrap.putLong(randomUUID.getLeastSignificantBits());
            rve a2 = rve.a("Mx" + Base64.encodeToString(wrap.array(), 11).replace('_', '='));
            e.close();
            return a2;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
