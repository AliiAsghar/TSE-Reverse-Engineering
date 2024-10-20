package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoyu extends aoyv {
    final /* synthetic */ aozb a;
    private int b = 0;
    private final int c;

    public aoyu(aozb aozbVar) {
        this.a = aozbVar;
        this.c = aozbVar.d();
    }

    @Override // defpackage.aoyx
    public final byte a() {
        int i = this.b;
        if (i < this.c) {
            this.b = i + 1;
            return this.a.b(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b < this.c) {
            return true;
        }
        return false;
    }
}
