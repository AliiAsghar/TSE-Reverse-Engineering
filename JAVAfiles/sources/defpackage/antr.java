package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class antr {
    public static final aocj a = aocj.b(new byte[0]);

    public static final aocj a(int i) {
        return aocj.b(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final aocj b(int i) {
        return aocj.b(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
