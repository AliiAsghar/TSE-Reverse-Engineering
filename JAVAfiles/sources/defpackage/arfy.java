package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arfy {
    final boolean a;
    final List b;
    final Collection c;
    final Collection d;
    public final int e;
    final arga f;
    final boolean g;
    final boolean h;

    public arfy(List list, Collection collection, Collection collection2, arga argaVar, boolean z, boolean z2, boolean z3, int i) {
        boolean z4;
        boolean z5;
        boolean z6;
        this.b = list;
        collection.getClass();
        this.c = collection;
        this.f = argaVar;
        this.d = collection2;
        this.g = z;
        this.a = z2;
        this.h = z3;
        this.e = i;
        if (z2 && list != null) {
            z4 = false;
        } else {
            z4 = true;
        }
        albo.U(z4, "passThrough should imply buffer is null");
        if (z2 && argaVar == null) {
            z5 = false;
        } else {
            z5 = true;
        }
        albo.U(z5, "passThrough should imply winningSubstream != null");
        if (z2 && ((collection.size() != 1 || !collection.contains(argaVar)) && (collection.size() != 0 || !argaVar.b))) {
            z6 = false;
        } else {
            z6 = true;
        }
        albo.U(z6, "passThrough should imply winningSubstream is drained");
        albo.U((z && argaVar == null) ? false : true, "cancelled should imply committed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final arfy a(arga argaVar) {
        boolean z;
        Collection unmodifiableCollection;
        albo.U(!this.h, "hedging frozen");
        if (this.f == null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "already committed");
        Collection collection = this.d;
        if (collection == null) {
            unmodifiableCollection = Collections.singleton(argaVar);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(argaVar);
            unmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
        }
        return new arfy(this.b, this.c, unmodifiableCollection, this.f, this.g, this.a, this.h, this.e + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final arfy b() {
        if (this.h) {
            return this;
        }
        return new arfy(this.b, this.c, this.d, this.f, this.g, this.a, true, this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final arfy c(arga argaVar) {
        Collection unmodifiableCollection;
        boolean z;
        boolean z2 = true;
        albo.U(!this.a, "Already passThrough");
        if (argaVar.b) {
            unmodifiableCollection = this.c;
        } else if (this.c.isEmpty()) {
            unmodifiableCollection = Collections.singletonList(argaVar);
        } else {
            ArrayList arrayList = new ArrayList(this.c);
            arrayList.add(argaVar);
            unmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
        }
        Collection collection = unmodifiableCollection;
        arga argaVar2 = this.f;
        if (argaVar2 != null) {
            z = true;
        } else {
            z = false;
        }
        List list = this.b;
        if (z) {
            if (argaVar2 != argaVar) {
                z2 = false;
            }
            albo.U(z2, "Another RPC attempt has already committed");
            list = null;
        }
        return new arfy(list, collection, this.d, this.f, this.g, z, this.h, this.e);
    }
}
