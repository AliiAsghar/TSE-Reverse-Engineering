package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvl {
    public final gsb a;
    public final gxn b;
    public final WorkDatabase c;
    public final gys d;
    public final List e;
    public final Context f;
    public final gpx g;
    public mka h;

    public gvl(Context context, gsb gsbVar, gpx gpxVar, gxn gxnVar, WorkDatabase workDatabase, gys gysVar, List list) {
        context.getClass();
        workDatabase.getClass();
        this.a = gsbVar;
        this.g = gpxVar;
        this.b = gxnVar;
        this.c = workDatabase;
        this.d = gysVar;
        this.e = list;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.f = applicationContext;
        this.h = new mka(null, null);
    }
}
