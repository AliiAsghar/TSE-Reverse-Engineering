package defpackage;

import com.google.android.gms.appdatasearch.SuggestionResults;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alxm implements Iterator {
    final /* synthetic */ Object a;
    private int b = 0;
    private final /* synthetic */ int c;

    public alxm(Object obj, int i) {
        this.c = i;
        this.a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c != 0) {
            String[] strArr = ((SuggestionResults) this.a).b;
            if (strArr != null && this.b < strArr.length) {
                return true;
            }
            return false;
        }
        if (this.b < ((alxn) this.a).a.b) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.c != 0) {
            if (hasNext()) {
                this.b++;
                return new abhg();
            }
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.b = i + 1;
        alxp alxpVar = ((alxn) this.a).a;
        return alxpVar.e(alxpVar.a[i] & 31);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.c != 0) {
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }
}
