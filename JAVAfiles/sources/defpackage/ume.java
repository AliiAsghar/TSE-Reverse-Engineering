package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ume extends unp {
    public static final xze a = xze.g("BugleDataModel", "DownloadMmsHandler");
    public final Context b;
    public final xnv c;
    public final armf d;
    public final wzs e;
    public final qik f;
    public final armf g;
    public final rbv h;
    private final anen i;

    public ume(Context context, anen anenVar, xnv xnvVar, armf armfVar, wzs wzsVar, rbv rbvVar, qik qikVar, armf armfVar2) {
        this.b = context;
        this.i = anenVar;
        this.c = xnvVar;
        this.d = armfVar;
        this.e = wzsVar;
        this.h = rbvVar;
        this.f = qikVar;
        this.g = armfVar2;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.c = amdy.DOWNLOAD_MMS_ACTION;
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("DownloadMmsHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        return aktp.ai(new ulo(this, (umf) apbtVar, 6), this.i);
    }

    @Override // defpackage.unx
    public final apca e() {
        return umf.a.getParserForType();
    }
}
