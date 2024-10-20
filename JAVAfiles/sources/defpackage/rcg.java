package defpackage;

import android.net.Uri;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rcg extends arpw implements arqv {
    final /* synthetic */ rcr a;
    final /* synthetic */ Uri b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ String f;
    final /* synthetic */ boolean g;
    final /* synthetic */ long h;
    final /* synthetic */ gt i;
    final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rcg(rcr rcrVar, Uri uri, int i, String str, String str2, String str3, boolean z, long j, gt gtVar, long j2, arpe arpeVar) {
        super(2, arpeVar);
        this.a = rcrVar;
        this.b = uri;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = j;
        this.i = gtVar;
        this.j = j2;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((rcg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        xze xzeVar = rcr.a;
        rcr rcrVar = this.a;
        return rcrVar.g.p(rcrVar.b, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new rcg(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, arpeVar);
    }
}
