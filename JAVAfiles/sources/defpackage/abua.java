package defpackage;

import android.accounts.Account;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abua {
    public final Account a;
    public final Set b;
    public final Set c;
    public final Map d;
    public final String e;
    public final String f;
    public final achx g;
    public Integer h;

    public abua(Account account, Set set, Map map, String str, String str2, achx achxVar) {
        Set unmodifiableSet;
        this.a = account;
        if (set == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            unmodifiableSet = DesugarCollections.unmodifiableSet(set);
        }
        this.b = unmodifiableSet;
        map = map == null ? Collections.emptyMap() : map;
        this.d = map;
        this.e = str;
        this.f = str2;
        this.g = achxVar == null ? achx.a : achxVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            Object obj = ((zfj) it.next()).a;
            hashSet.addAll(null);
        }
        this.c = DesugarCollections.unmodifiableSet(hashSet);
    }
}
