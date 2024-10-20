package defpackage;

import android.content.Context;
import com.google.android.gms.googlehelp.internal.common.IGoogleHelpService;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class acba extends abry {
    public acba(abrg abrgVar) {
        super(acam.b, abrgVar);
    }

    @Override // defpackage.abry
    protected final /* bridge */ /* synthetic */ void b(abqu abquVar) {
        acbe acbeVar = (acbe) abquVar;
        Context context = acbeVar.b;
        l((IGoogleHelpService) acbeVar.w());
    }

    @Override // defpackage.abry, defpackage.abrz
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        super.j((abrm) obj);
    }

    protected abstract void l(IGoogleHelpService iGoogleHelpService);
}
