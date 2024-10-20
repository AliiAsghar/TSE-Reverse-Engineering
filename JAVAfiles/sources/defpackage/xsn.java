package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xsn implements xte {
    private final /* synthetic */ int a;

    @Override // defpackage.xte
    public final apus a(xrs xrsVar, xrz xrzVar) {
        if (this.a != 0) {
            alwo alwoVar = xsl.a;
            xsx xsxVar = (xsx) xrsVar;
            ydk ydkVar = (ydk) xsxVar.b.b();
            Uri uri = xrzVar.d;
            return new apuy(((ydk) xsxVar.b.b()).k(uri), ydkVar.b(uri), ((Integer) xsx.a.e()).intValue());
        }
        return new apuy(((aozb) xrzVar.h.get()).m(), r4.d(), ((Integer) xsx.a.e()).intValue());
    }
}
