package defpackage;

import com.google.android.gms.appdatasearch.SearchResults;
import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abjl {
    public final abjm a;
    public final int b;
    public final /* synthetic */ SearchResults c;

    public abjl(SearchResults searchResults, int i, abjm abjmVar) {
        this.c = searchResults;
        this.a = abjmVar;
        this.b = i;
    }

    public final String a() {
        byte[] bArr;
        abjm abjmVar = this.a;
        if (abjmVar.b == null) {
            SearchResults searchResults = this.c;
            int[] iArr = searchResults.b;
            if (iArr == null || (bArr = searchResults.c) == null) {
                return null;
            }
            abjmVar.b = new abjk(iArr, bArr);
        }
        abjk abjkVar = abjmVar.b;
        abjkVar.a(this.b);
        try {
            return new String(abjkVar.d, abjkVar.b, abjkVar.c[abjkVar.a], "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
