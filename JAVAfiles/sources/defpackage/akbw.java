package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akbw extends arpw implements arqv {
    final /* synthetic */ Uri a;
    final /* synthetic */ String b;
    final /* synthetic */ String[] c;
    final /* synthetic */ ahiy d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akbw(arpe arpeVar, ahiy ahiyVar, Uri uri, String str, String[] strArr) {
        super(2, arpeVar);
        this.d = ahiyVar;
        this.a = uri;
        this.b = str;
        this.c = strArr;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akbw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        Uri uri = this.a;
        return new Integer(((Integer) ((ansy) this.d.a).p(uri, new akcd(uri, this.b, this.c, 0))).intValue());
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        akbw akbwVar = new akbw(arpeVar, this.d, this.a, this.b, this.c);
        akbwVar.e = obj;
        return akbwVar;
    }
}
