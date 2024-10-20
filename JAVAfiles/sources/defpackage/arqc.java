package defpackage;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arqc implements Iterator, arse {
    final /* synthetic */ artp a;
    private String b;
    private boolean c;

    public arqc(artp artpVar) {
        this.a = artpVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str = this.b;
        if (str == null && !this.c) {
            str = ((BufferedReader) this.a.a).readLine();
            this.b = str;
            if (str == null) {
                this.c = true;
            }
        }
        if (str != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            String str = this.b;
            this.b = null;
            str.getClass();
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.g();
    }
}
