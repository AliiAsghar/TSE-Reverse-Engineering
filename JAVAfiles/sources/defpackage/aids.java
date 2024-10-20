package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aids {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final aidt a(int i, long j) {
        return (aidt) a.get(new aidr(i, j));
    }

    public static final boolean b(int i, long j) {
        return a.containsKey(new aidr(i, j));
    }
}
