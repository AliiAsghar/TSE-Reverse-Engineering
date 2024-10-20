package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.StandardCharsets;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asrv {
    public static final /* synthetic */ int a = 0;

    static {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.put(StandardCharsets.ISO_8859_1.name(), StandardCharsets.ISO_8859_1);
        treeMap.put(StandardCharsets.US_ASCII.name(), StandardCharsets.US_ASCII);
        treeMap.put(StandardCharsets.UTF_16.name(), StandardCharsets.UTF_16);
        treeMap.put(StandardCharsets.UTF_16BE.name(), StandardCharsets.UTF_16BE);
        treeMap.put(StandardCharsets.UTF_16LE.name(), StandardCharsets.UTF_16LE);
        treeMap.put(StandardCharsets.UTF_8.name(), StandardCharsets.UTF_8);
        DesugarCollections.unmodifiableSortedMap(treeMap);
    }
}
