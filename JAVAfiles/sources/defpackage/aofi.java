package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aofi implements aoeo {
    public final Set a;
    public final aoeo b;
    private final Set c;
    private final Set d;

    public aofi(aoen aoenVar, aoeo aoeoVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (aoev aoevVar : aoenVar.c) {
            if (aoevVar.a()) {
                if (aoevVar.b()) {
                    hashSet4.add(aoevVar.a);
                } else {
                    hashSet.add(aoevVar.a);
                }
            } else if (aoevVar.b()) {
                hashSet5.add(aoevVar.a);
            } else {
                hashSet2.add(aoevVar.a);
            }
        }
        if (!aoenVar.g.isEmpty()) {
            hashSet.add(new aofg(aoff.class, aogm.class));
        }
        this.c = DesugarCollections.unmodifiableSet(hashSet);
        this.d = DesugarCollections.unmodifiableSet(hashSet2);
        DesugarCollections.unmodifiableSet(hashSet3);
        this.a = DesugarCollections.unmodifiableSet(hashSet4);
        DesugarCollections.unmodifiableSet(hashSet5);
        Set set = aoenVar.g;
        this.b = aoeoVar;
    }

    @Override // defpackage.aoeo
    public final aohf a(aofg aofgVar) {
        throw null;
    }

    @Override // defpackage.aoeo
    public final aohf b(Class cls) {
        aofg aofgVar = new aofg(aoff.class, cls);
        if (this.d.contains(aofgVar)) {
            return this.b.a(aofgVar);
        }
        throw new aoex(String.format("Attempting to request an undeclared dependency Provider<%s>.", aofgVar));
    }

    @Override // defpackage.aoeo
    public final aohf c(aofg aofgVar) {
        throw null;
    }

    @Override // defpackage.aoeo
    public final Object d(aofg aofgVar) {
        if (this.c.contains(aofgVar)) {
            return aode.j(this.b, aofgVar);
        }
        throw new aoex(String.format("Attempting to request an undeclared dependency %s.", aofgVar));
    }

    @Override // defpackage.aoeo
    public final Object e(Class cls) {
        if (this.c.contains(new aofg(aoff.class, cls))) {
            Object k = aode.k(this.b, cls);
            if (!cls.equals(aogm.class)) {
                return k;
            }
            return new aofh();
        }
        throw new aoex(String.format("Attempting to request an undeclared dependency %s.", cls));
    }
}
