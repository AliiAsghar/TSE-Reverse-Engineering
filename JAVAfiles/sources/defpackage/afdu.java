package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afdu extends arpw implements arqv {
    final /* synthetic */ String[] a;
    final /* synthetic */ String[] b;
    final /* synthetic */ int c;
    final /* synthetic */ Uri d;
    final /* synthetic */ String e;
    final /* synthetic */ afdv f;
    final /* synthetic */ afdz g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afdu(String[] strArr, String[] strArr2, int i, Uri uri, String str, afdv afdvVar, afdz afdzVar, arpe arpeVar) {
        super(2, arpeVar);
        this.a = strArr;
        this.b = strArr2;
        this.c = i;
        this.d = uri;
        this.e = str;
        this.f = afdvVar;
        this.g = afdzVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afdu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        int i = afdv.c;
        String str = aqil.I(this.b, ", ", 62).concat(" DESC") + " LIMIT 20 OFFSET " + this.c;
        return afdv.b(this.g, "ofList for " + aeke.bn(this.d) + " with " + this.e + ", null, " + str, false, new jze(this.f, this.d, this.e, str, 8));
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new afdu(this.a, this.b, this.c, this.d, this.e, this.f, this.g, arpeVar);
    }
}
