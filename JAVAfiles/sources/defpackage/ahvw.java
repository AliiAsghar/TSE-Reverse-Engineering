package defpackage;

import android.content.pm.PackageManager;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahvw {
    public final String a;
    final alhr b;
    final alhr c;
    Resources d;
    public final /* synthetic */ arrt e;

    public ahvw(arrt arrtVar, String str, alhr alhrVar) {
        this.e = arrtVar;
        this.a = str;
        this.b = new ahvt(new ahvu(this, arrtVar, str, 0));
        this.c = alhrVar;
    }

    public final Resources a() {
        Resources resources = this.d;
        if (resources == null) {
            arrt arrtVar = this.e;
            Resources resourcesForApplication = ((PackageManager) arrtVar.b).getResourcesForApplication(this.a);
            this.d = resourcesForApplication;
            return resourcesForApplication;
        }
        return resources;
    }
}
