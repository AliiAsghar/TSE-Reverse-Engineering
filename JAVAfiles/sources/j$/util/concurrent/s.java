package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class s extends l {
    s e;
    s f;
    s g;
    s h;
    boolean i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(int i, Object obj, Object obj2, l lVar, s sVar) {
        super(i, obj, obj2, lVar);
        this.e = sVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.concurrent.l
    public final l a(int i, Object obj) {
        return b(i, obj, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final s b(int i, Object obj, Class cls) {
        int i2;
        if (obj != null) {
            s sVar = this;
            do {
                s sVar2 = sVar.f;
                s sVar3 = sVar.g;
                int i3 = sVar.a;
                if (i3 <= i) {
                    if (i3 >= i) {
                        Object obj2 = sVar.b;
                        if (obj2 != obj && (obj2 == null || !obj.equals(obj2))) {
                            if (sVar2 != null) {
                                if (sVar3 != null) {
                                    if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                                        int i4 = ConcurrentHashMap.g;
                                        if (obj2 != null && obj2.getClass() == cls) {
                                            i2 = ((Comparable) obj).compareTo(obj2);
                                        } else {
                                            i2 = 0;
                                        }
                                        if (i2 != 0) {
                                            if (i2 >= 0) {
                                                sVar2 = sVar3;
                                            }
                                        }
                                    }
                                    s b = sVar3.b(i, obj, cls);
                                    if (b != null) {
                                        return b;
                                    }
                                }
                            }
                        } else {
                            return sVar;
                        }
                    }
                    sVar = sVar3;
                }
                sVar = sVar2;
            } while (sVar != null);
            return null;
        }
        return null;
    }
}
