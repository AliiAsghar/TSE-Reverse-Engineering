package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apcg implements Iterator {
    private final ArrayDeque a;
    private aoyy b;

    public apcg(aozb aozbVar) {
        if (aozbVar instanceof apci) {
            apci apciVar = (apci) aozbVar;
            ArrayDeque arrayDeque = new ArrayDeque(apciVar.g);
            this.a = arrayDeque;
            arrayDeque.push(apciVar);
            this.b = b(apciVar.e);
            return;
        }
        this.a = null;
        this.b = (aoyy) aozbVar;
    }

    private final aoyy b(aozb aozbVar) {
        while (aozbVar instanceof apci) {
            apci apciVar = (apci) aozbVar;
            this.a.push(apciVar);
            int[] iArr = apci.a;
            aozbVar = apciVar.e;
        }
        return (aoyy) aozbVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aoyy next() {
        aoyy aoyyVar;
        aoyy aoyyVar2 = this.b;
        if (aoyyVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.a;
            aoyyVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            apci apciVar = (apci) this.a.pop();
            int[] iArr = apci.a;
            aoyyVar = b(apciVar.f);
        } while (aoyyVar.G());
        this.b = aoyyVar;
        return aoyyVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
