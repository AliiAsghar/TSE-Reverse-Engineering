package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqtc {
    public static final Logger a = Logger.getLogger(aqtc.class.getName());
    public static final aqtc b = new aqtc();
    public final ConcurrentNavigableMap c = new ConcurrentSkipListMap();
    public final ConcurrentNavigableMap d = new ConcurrentSkipListMap();
    public final ConcurrentMap e = new ConcurrentHashMap();
    public final ConcurrentMap f = new ConcurrentHashMap();
    public final ConcurrentMap g = new ConcurrentHashMap();

    public static long a(aqtk aqtkVar) {
        return aqtkVar.c().a;
    }

    public static void b(Map map, aqte aqteVar) {
    }

    public static void c(Map map, aqte aqteVar) {
    }
}
