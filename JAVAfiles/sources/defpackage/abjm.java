package defpackage;

import com.google.android.gms.appdatasearch.SearchResults;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abjm implements Iterator {
    protected int a;
    public abjk b;
    public final Map[] c;
    final /* synthetic */ SearchResults d;

    public abjm(SearchResults searchResults) {
        String[] strArr;
        this.d = searchResults;
        Map[] mapArr = null;
        if (!searchResults.a() && (strArr = searchResults.i) != null) {
            mapArr = new Map[strArr.length];
        }
        this.c = mapArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        SearchResults searchResults = this.d;
        if (!searchResults.a() && this.a < searchResults.g) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            SearchResults searchResults = this.d;
            int i = this.a;
            abjl abjlVar = new abjl(searchResults, i, this);
            this.a = i + 1;
            return abjlVar;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
