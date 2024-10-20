package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rcb implements alhr {
    public final /* synthetic */ rcr a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Uri d;
    private final /* synthetic */ int e;

    public /* synthetic */ rcb(rcr rcrVar, int i, int i2, Uri uri, int i3) {
        this.e = i3;
        this.a = rcrVar;
        this.b = i;
        this.c = i2;
        this.d = uri;
    }

    @Override // defpackage.alhr
    public final Object get() {
        if (this.e != 0) {
            Uri uri = this.d;
            int i = this.c;
            return this.a.a(this.b, i, uri);
        }
        Uri uri2 = this.d;
        int i2 = this.c;
        return this.a.a(this.b, i2, uri2);
    }
}
