package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoow implements aopj {
    private final /* synthetic */ int a;

    public aoow(int i) {
        this.a = i;
    }

    @Override // defpackage.aopj
    public final Object a() {
        switch (this.a) {
            case 0:
                return new LinkedHashSet();
            case 1:
                return new TreeSet();
            case 2:
                return new ArrayDeque();
            case 3:
                return new ArrayList();
            case 4:
                return new ConcurrentSkipListMap();
            case 5:
                return new ConcurrentHashMap();
            case 6:
                return new TreeMap();
            case 7:
                return new LinkedHashMap();
            default:
                return new aopi();
        }
    }
}
