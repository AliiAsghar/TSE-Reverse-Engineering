package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aivk {
    public static final Long a = 10L;
    public static final Long b = 60000L;
    public final ConcurrentMap c;

    private aivk(ConcurrentMap concurrentMap) {
        this.c = concurrentMap;
    }

    public static aivk a() {
        return new aivk(new ConcurrentHashMap());
    }

    public static algw b(FileChannel fileChannel) {
        try {
            return algw.i(new aivj(fileChannel.lock(0L, Long.MAX_VALUE, false), 0));
        } catch (IOException e) {
            if (e.getMessage().contains("Resource deadlock would occur")) {
                return alfd.a;
            }
            throw e;
        }
    }

    @Deprecated
    public aivk() {
        this(new ConcurrentHashMap());
    }
}
